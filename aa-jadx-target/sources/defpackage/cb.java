package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cb {
    public int a;
    public android.support.v4.app.Fragment b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public defpackage.epx h;
    public defpackage.epx i;

    public cb(defpackage.cb cbVar) {
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

    public cb(int i, android.support.v4.app.Fragment fragment) {
        this.a = i;
        this.b = fragment;
        this.c = false;
        defpackage.epx epxVar = defpackage.epx.e;
        this.h = epxVar;
        this.i = epxVar;
    }

    public cb(int i, android.support.v4.app.Fragment fragment, byte[] bArr) {
        this.a = i;
        this.b = fragment;
        this.c = true;
        defpackage.epx epxVar = defpackage.epx.e;
        this.h = epxVar;
        this.i = epxVar;
    }

    public cb(android.support.v4.app.Fragment fragment, defpackage.epx epxVar) {
        this.a = 10;
        this.b = fragment;
        this.c = false;
        this.h = fragment.mMaxState;
        this.i = epxVar;
    }

    public cb() {
    }
}
