package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public class qqh extends ContextWrapper implements LayoutInflater.Factory {
    private boolean a;
    public qqi e;

    public qqh() {
        super(null);
    }

    public final LayoutInflater A() {
        return ((rnw) this.e).k.f();
    }

    public final View B(int i) {
        ror rorVar;
        rnw rnwVar = (rnw) this.e;
        View view = rnwVar.s;
        View viewFindViewById = view != null ? view.findViewById(i) : null;
        if (viewFindViewById == null && (rorVar = rnwVar.k) != null) {
            viewFindViewById = rorVar.g(i);
        }
        return (viewFindViewById == null && i == 16908290) ? rnwVar.s : viewFindViewById;
    }

    public final Window C() {
        return ((rnw) this.e).k.h();
    }

    public final Object D() {
        return ((rnw) this.e).A;
    }

    public Object E() {
        return null;
    }

    public final void F() {
        qqi qqiVar = this.e;
        rnw rnwVar = (rnw) qqiVar;
        rnwVar.k.m();
        try {
            qxy qxyVar = ((rnw) qqiVar).i;
            if (qxyVar != null) {
                qxyVar.f();
            }
        } catch (RemoteException unused) {
            rbe.h(rnwVar.d);
        }
    }

    public void L(Context context) {
        attachBaseContext(context);
    }

    public final void M(Intent intent) {
        qqi qqiVar = this.e;
        try {
            ((rnw) qqiVar).m = intent;
            qxy qxyVar = ((rnw) qqiVar).i;
            if (qxyVar != null) {
                qxyVar.x(intent);
            }
        } catch (RemoteException unused) {
            rbe.h(((rnw) qqiVar).d);
        }
    }

    public final boolean N() {
        qqi qqiVar = this.e;
        if (qqiVar != null) {
            try {
                return ((rnw) qqiVar).p;
            } catch (AbstractMethodError | NoSuchMethodError unused) {
                Log.d("CAR.PROJECTION", "Unable check if changing configurations");
                if (!this.fo()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final vag O() {
        qqi qqiVar = this.e;
        rnw rnwVar = (rnw) qqiVar;
        if (rnwVar.L == null) {
            rnwVar.L = new vag(new ykd(qqiVar, null));
        }
        return rnwVar.L;
    }

    public void c() {
        this.a = false;
    }

    public final boolean fo() {
        qqi qqiVar = this.e;
        if (qqiVar != null) {
            return ((rnw) qqiVar).r;
        }
        return true;
    }

    public final void fp() {
        qqi qqiVar = this.e;
        if (qqiVar != null) {
            qqiVar.a();
        }
    }

    public void g(Bundle bundle) {
        bundle.putBundle("android:viewHierarchyState", ((rnw) this.e).k.h().saveHierarchyState());
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    public boolean p(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.a = true;
        c();
        return this.a;
    }

    public Intent q() {
        return ((rnw) this.e).m;
    }

    public void t(Bundle bundle) {
        Bundle bundle2;
        rnw rnwVar = (rnw) this.e;
        ror rorVar = rnwVar.k;
        if (rorVar == null || rorVar.h() == null || (bundle2 = bundle.getBundle("android:viewHierarchyState")) == null) {
            return;
        }
        rnwVar.k.h().restoreHierarchyState(bundle2);
    }

    public void v(int i) {
        rnw rnwVar = (rnw) this.e;
        rnwVar.b(rnwVar.k.f().inflate(i, (ViewGroup) null));
    }

    public final int y() {
        try {
            CarRegionId carRegionId = ((rnw) this.e).j;
            carRegionId.getClass();
            return carRegionId.h.b;
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            Log.w("CAR.PROJECTION", "CarActivityHost#getDisplayId does not exit. Using primary car display id as fallback.");
            return 0;
        }
    }

    public final int z() {
        try {
            CarRegionId carRegionId = ((rnw) this.e).j;
            carRegionId.getClass();
            return carRegionId.g;
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            Log.w("CAR.PROJECTION", "CarActivityHost#getRegionId does not exit. Using primary car region id as fallback.");
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

    public void a(Bundle bundle) {
    }

    public void d(Configuration configuration) {
    }

    public void e(Intent intent) {
    }

    public void s(IBinder iBinder) {
    }

    public void u(WindowManager.LayoutParams layoutParams) {
    }

    public void x(boolean z) {
    }
}
