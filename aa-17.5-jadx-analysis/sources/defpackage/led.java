package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class led implements lec {
    private final aezr b;
    private final boolean c;

    public led() {
        aezy aezyVar = new aezy(new deh(this, 16));
        this.b = aezyVar;
        this.c = ((Boolean) ((nrf) aezyVar.a()).a()).booleanValue();
    }

    @Override // defpackage.lec
    public final int a() {
        return (int) acon.b();
    }

    @Override // defpackage.lec
    public final abrn b() {
        return acon.c();
    }

    @Override // defpackage.lec
    public final abrn c() {
        return acon.d();
    }

    @Override // defpackage.lec
    public final boolean d() {
        acon aconVar = acon.a;
        return aconVar.gu().i() && affa.f(aconVar.gu().e(), "CAR.SYS") && Build.VERSION.SDK_INT >= 37;
    }

    @Override // defpackage.lec
    public final boolean e() {
        return f() && acon.j();
    }

    @Override // defpackage.lec
    public final boolean f() {
        if (!this.c) {
            return false;
        }
        yph yphVar = nsr.a;
        return ((nsr) mki.a.i(nsr.class)).b().M();
    }

    @Override // defpackage.lec
    public final boolean g() {
        return e() && acon.m();
    }
}
