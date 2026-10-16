package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zxd {
    public final Set a = yrm.t();
    public vfr b = null;
    public vfo c = null;
    public vhq d = null;
    public vht e = null;
    public final zys f;
    private final zrt g;

    public zxd(zrt zrtVar, zys zysVar) {
        this.g = zrtVar;
        this.f = zysVar;
    }

    public final void a(zxc zxcVar) {
        this.a.add(zxcVar);
    }

    public final void b(zxc zxcVar) {
        this.a.remove(zxcVar);
    }

    public final void c(vfo vfoVar) {
        this.g.a();
        this.c = vfoVar;
    }

    public final void d(vfr vfrVar) {
        this.g.a();
        this.b = vfrVar;
    }

    public final void e(vhq vhqVar) {
        this.g.a();
        this.d = vhqVar;
    }

    public final void f(vht vhtVar) {
        this.g.a();
        this.e = vhtVar;
    }
}
