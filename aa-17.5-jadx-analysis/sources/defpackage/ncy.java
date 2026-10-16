package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class ncy implements afdr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ncy(Object obj, boolean z, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        Object obj;
        int i = this.d;
        if (i == 0) {
            ?? r0 = this.c;
            aezr aezrVar = ndj.a;
            ((ndp) this.b).b(2);
            mwc.b(yzy.Hy, ndj.g(r0));
            if (this.a) {
                mwc.b(yzy.HD, ndj.g(r0));
            }
            return afak.a;
        }
        if (i == 1) {
            if (this.a && (obj = this.c) != null) {
                ((cil) obj).a(7);
            }
            ((gde) this.b).c.invoke();
            return afak.a;
        }
        if (i == 2) {
            Object obj2 = this.c;
            if (this.a) {
                ((nnu) this.b).k((ComponentName) obj2);
            } else {
                ComponentName componentName = (ComponentName) obj2;
                nnu.n(yzy.kX, componentName, 3);
                Intent intentC = lnm.c(componentName);
                intentC.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 32);
                mpe.a().i(intentC);
            }
            return afak.a;
        }
        boolean z = this.a;
        if (i == 3) {
            if (z) {
                ((nnu) this.b).k((ComponentName) this.c);
            }
            return afak.a;
        }
        qsw qswVarN = nsr.c().b().n(z ? nsn.e : nsn.f);
        if (qswVarN == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj3 = this.c;
        Object obj4 = this.b;
        qswVarN.l = true;
        qswVarN.m = 256;
        return nsh.b(qswVarN.a(), true != z ? "ImmersiveToolbarBottomScrim" : "ImmersiveToolbar", (Fragment) obj3, ((nqx) obj4).b).a();
    }

    public /* synthetic */ ncy(boolean z, cil cilVar, gde gdeVar, int i) {
        this.d = i;
        this.a = z;
        this.c = cilVar;
        this.b = gdeVar;
    }

    public /* synthetic */ ncy(boolean z, nnu nnuVar, ComponentName componentName, int i) {
        this.d = i;
        this.a = z;
        this.b = nnuVar;
        this.c = componentName;
    }
}
