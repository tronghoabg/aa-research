package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class qrd extends android.content.ContextWrapper implements android.view.LayoutInflater.Factory {
    private boolean a;
    public defpackage.qre e;

    public qrd() {
        super(null);
    }

    public final android.view.LayoutInflater A() {
        return ((defpackage.ror) this.e).k.f();
    }

    public final android.view.View B(int i) {
        defpackage.rpm rpmVar;
        defpackage.ror rorVar = (defpackage.ror) this.e;
        android.view.View view = rorVar.s;
        android.view.View viewFindViewById = view != null ? view.findViewById(i) : null;
        if (viewFindViewById == null && (rpmVar = rorVar.k) != null) {
            viewFindViewById = rpmVar.g(i);
        }
        return (viewFindViewById == null && i == 16908290) ? rorVar.s : viewFindViewById;
    }

    public final android.view.Window C() {
        return ((defpackage.ror) this.e).k.h();
    }

    public final java.lang.Object D() {
        return ((defpackage.ror) this.e).A;
    }

    public java.lang.Object E() {
        return null;
    }

    public final void F() {
        defpackage.qre qreVar = this.e;
        defpackage.ror rorVar = (defpackage.ror) qreVar;
        rorVar.k.m();
        try {
            defpackage.qyu qyuVar = ((defpackage.ror) qreVar).i;
            if (qyuVar != null) {
                qyuVar.f();
            }
        } catch (android.os.RemoteException unused) {
            defpackage.rbz.h(rorVar.d);
        }
    }

    public void L(android.content.Context context) {
        attachBaseContext(context);
    }

    public final void M(android.content.Intent intent) {
        defpackage.qre qreVar = this.e;
        try {
            ((defpackage.ror) qreVar).m = intent;
            defpackage.qyu qyuVar = ((defpackage.ror) qreVar).i;
            if (qyuVar != null) {
                qyuVar.x(intent);
            }
        } catch (android.os.RemoteException unused) {
            defpackage.rbz.h(((defpackage.ror) qreVar).d);
        }
    }

    public final boolean N() {
        defpackage.qre qreVar = this.e;
        if (qreVar != null) {
            try {
                return ((defpackage.ror) qreVar).p;
            } catch (java.lang.AbstractMethodError | java.lang.NoSuchMethodError unused) {
                android.util.Log.d("CAR.PROJECTION", "Unable check if changing configurations");
                if (!ew()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final vbd O() {
        defpackage.qre qreVar = this.e;
        defpackage.ror rorVar = (defpackage.ror) qreVar;
        if (rorVar.M == null) {
            rorVar.M = new vbd(new defpackage.xei(qreVar));
        }
        return rorVar.M;
    }

    public void c() {
        this.a = false;
    }

    public final boolean ew() {
        defpackage.qre qreVar = this.e;
        if (qreVar != null) {
            return ((defpackage.ror) qreVar).r;
        }
        return true;
    }

    public final void ex() {
        defpackage.qre qreVar = this.e;
        if (qreVar != null) {
            qreVar.a();
        }
    }

    public void g(android.os.Bundle bundle) {
        bundle.putBundle("android:viewHierarchyState", ((defpackage.ror) this.e).k.h().saveHierarchyState());
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return null;
    }

    public boolean p(int i, android.view.KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.a = true;
        c();
        return this.a;
    }

    public android.content.Intent q() {
        return ((defpackage.ror) this.e).m;
    }

    public void t(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        defpackage.ror rorVar = (defpackage.ror) this.e;
        defpackage.rpm rpmVar = rorVar.k;
        if (rpmVar == null || rpmVar.h() == null || (bundle2 = bundle.getBundle("android:viewHierarchyState")) == null) {
            return;
        }
        rorVar.k.h().restoreHierarchyState(bundle2);
    }

    public void v(int i) {
        defpackage.ror rorVar = (defpackage.ror) this.e;
        rorVar.b(rorVar.k.f().inflate(i, (android.view.ViewGroup) null));
    }

    public final int y() {
        try {
            com.google.android.gms.car.display.CarRegionId carRegionId = ((defpackage.ror) this.e).j;
            carRegionId.getClass();
            return carRegionId.h.b;
        } catch (java.lang.AbstractMethodError | java.lang.NoSuchMethodError unused) {
            android.util.Log.w("CAR.PROJECTION", "CarActivityHost#getDisplayId does not exit. Using primary car display id as fallback.");
            return 0;
        }
    }

    public final int z() {
        try {
            com.google.android.gms.car.display.CarRegionId carRegionId = ((defpackage.ror) this.e).j;
            carRegionId.getClass();
            return carRegionId.g;
        } catch (java.lang.AbstractMethodError | java.lang.NoSuchMethodError unused) {
            android.util.Log.w("CAR.PROJECTION", "CarActivityHost#getRegionId does not exit. Using primary car region id as fallback.");
            return 0;
        }
    }

    public void G() {
    }

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    public void K() {
    }

    public void h() {
    }

    public void j() {
    }

    public void a(android.os.Bundle bundle) {
    }

    public void d(android.content.res.Configuration configuration) {
    }

    public void e(android.content.Intent intent) {
    }

    public void s(android.os.IBinder iBinder) {
    }

    public void u(android.view.WindowManager.LayoutParams layoutParams) {
    }

    public void x(boolean z) {
    }
}
