package com.example.adi.clientes.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.adi.clientes.fragments.AccesoriosFragment;
import com.example.adi.clientes.fragments.ChipsFragment;
import com.example.adi.clientes.fragments.TelefonosFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adi on 24/09/2017.
 */

public class SeccionesAdapter extends FragmentPagerAdapter {
 public SeccionesAdapter(FragmentManager fm){
     super(fm);
 }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ChipsFragment().newInstance(position);
            case 1:
                return new TelefonosFragment().newInstance(position);
            case 2:
                return new AccesoriosFragment().newInstance(position);

        }


        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Chips";
            case 1:
                return "Telefonos";
            case 2:
                return "Accesorios";

        }

        return super.getPageTitle(position);
    }
}
