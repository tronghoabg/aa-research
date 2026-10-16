package defpackage;

import com.google.android.gms.car.CarUiInfo;

/* loaded from: classes.dex */
public final class nrf {
    public Object a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final boolean e;

    public nrf(Object obj, Object obj2, Object obj3, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = z;
        ((lhm) mki.a.i(lhm.class)).gK(new nre(this));
    }

    public final Object a() {
        yph yphVar = kio.a;
        Object obj = null;
        if (((kio) mki.a.i(kio.class)).r()) {
            Object obj2 = this.a;
            if (obj2 == null) {
                try {
                    qrn qrnVarE = ((kio) mki.a.i(kio.class)).e();
                    qrnVarE.getClass();
                    boolean z = false;
                    lds ldsVar = (lds) khc.t(new wci("GH.InputCheckingFlag", yzz.SYSTEM_UI, yzy.oN, "Cannot access car", new Object[0]), new npz(qrnVarE, 10));
                    if (ldsVar.e() || (((CarUiInfo) ldsVar.a).f && ldsVar.d())) {
                        z = true;
                    }
                    obj = (z && ldsVar.f()) ? this.d : (this.e || !z) ? this.b : this.c;
                } catch (IllegalStateException unused) {
                }
            } else {
                obj = obj2;
            }
        }
        Object obj3 = this.a;
        if (obj3 == null && obj != null) {
            this.a = obj;
            obj3 = obj;
        }
        return this.e ? this.b : obj == null ? obj3 == null ? this.b : obj3 : obj;
    }
}
