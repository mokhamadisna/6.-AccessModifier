package com.isna.accessmodifier.package2;

import com.isna.accessmodifier.package1.KelasA;

public class  KelasB extends com.isna.accessmodifier.package1.KelasA {

    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
