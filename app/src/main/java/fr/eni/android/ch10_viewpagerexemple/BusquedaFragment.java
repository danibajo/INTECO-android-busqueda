package fr.eni.android.ch10_viewpagerexemple;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BusquedaFragment extends Fragment {

    private ViewPager bViewPager;
    private Fragment[] fragments;

    public BusquedaFragment() {
        super();
        fragments = new Fragment[2];
        fragments[0] = new DiaFragment();
        fragments[1] = new MesFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_busqueda, container, false);
        bViewPager = view.findViewById(R.id.pagerBusqueda);

        return view;
    }


    public Fragment getItem(final int pos) {

        //return MyFragment.newInstance(tab[pos]);
        return fragments[pos];
    }


    public int getCount() {
        return 2;
    }

}
