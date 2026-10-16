package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public final class cb {
    public int a;
    public Fragment b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public eps h;
    public eps i;

    public cb(cb cbVar) {
        this.a = cbVar.a;
        this.b = cbVar.b;
        this.c = cbVar.c;
        this.d = cbVar.d;
        this.e = cbVar.e;
        this.f = cbVar.f;
        this.g = cbVar.g;
        this.h = cbVar.h;
        this.i = cbVar.i;
    }

    public cb(int i, Fragment fragment) {
        this.a = i;
        this.b = fragment;
        this.c = false;
        eps epsVar = eps.e;
        this.h = epsVar;
        this.i = epsVar;
    }

    public cb(int i, Fragment fragment, byte[] bArr) {
        this.a = i;
        this.b = fragment;
        this.c = true;
        eps epsVar = eps.e;
        this.h = epsVar;
        this.i = epsVar;
    }

    public cb(Fragment fragment, eps epsVar) {
        this.a = 10;
        this.b = fragment;
        this.c = false;
        this.h = fragment.mMaxState;
        this.i = epsVar;
    }

    public cb() {
    }
}
