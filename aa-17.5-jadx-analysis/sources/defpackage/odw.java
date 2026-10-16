package defpackage;

import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final class odw extends eqj {
    private final ebf a = new odv(this);

    public static final boolean a() {
        CarCall carCallG = odn.a().g();
        if (carCallG != null) {
            return ebf.A().z(carCallG.a);
        }
        return false;
    }

    @Override // defpackage.eqj
    protected final void c() {
        odj odjVarA = ebf.A();
        m(new odu(a(), odjVarA.a(), odjVarA.l()));
        odjVarA.D(this.a);
    }

    @Override // defpackage.eqj
    protected final void d() {
        ebf.A().E(this.a);
    }
}
