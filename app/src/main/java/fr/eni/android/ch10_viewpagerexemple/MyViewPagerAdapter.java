package fr.eni.android.ch10_viewpagerexemple;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private String[] tab;
    private Fragment[] fragments;


    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
        tab = new String[]
                {"Gráfica", "Busqueda", "Info"};

        fragments = new Fragment[3];
        fragments[0] = MyFragment.newInstance(tab[0]);
        fragments[1] = new BusquedaFragment();
        fragments[2] = MyFragment.newInstance(tab[2]);

    }


    @Override
    public Fragment getItem(final int pos) {

        //return MyFragment.newInstance(tab[pos]);
        return fragments[pos];
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }
}
