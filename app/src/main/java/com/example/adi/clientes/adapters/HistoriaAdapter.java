package com.example.adi.clientes.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.adi.clientes.fragments.AccesoriosFragment;
import com.example.adi.clientes.fragments.ChipsFragment;
import com.example.adi.clientes.fragments.ComprasFragment;
import com.example.adi.clientes.fragments.CreditosFragment;
import com.example.adi.clientes.fragments.TelefonosFragment;

/**
 * Created by Adi on 29/09/2017.
 */

public class HistoriaAdapter extends FragmentPagerAdapter {
    public HistoriaAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ComprasFragment().newInstance(position);
            case 1:
                return new CreditosFragment().newInstance(position);


        }


        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Compras";
            case 1:
                return "Creditos";


        }

        return super.getPageTitle(position);
    }
}
