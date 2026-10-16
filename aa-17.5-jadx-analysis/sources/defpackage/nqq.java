package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public abstract class nqq extends kmh {
    public static final long a = cjn.i(1293687836);
    private final bwq c = new ParcelableSnapshotMutableState(false, bxp.c);
    public afdr b = new ngv(19);

    protected static final nqq c(Class cls, ComponentName componentName) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
        objNewInstance.getClass();
        nqq nqqVar = (nqq) objNewInstance;
        Bundle bundle = new Bundle();
        bundle.putParcelable("component_name", componentName);
        nqqVar.setArguments(bundle);
        return nqqVar;
    }

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        buxVar.v(-758723988);
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            objG = new afm(false);
            buxVar.x(objG);
        }
        afm afmVar = (afm) objG;
        afmVar.d(Boolean.valueOf(g()));
        d(afmVar, cfy.e, buxVar, 48);
        if (!afmVar.e() || ((Boolean) afmVar.a()).booleanValue()) {
            buxVar.v(1266876726);
            buxVar.o();
        } else {
            buxVar.v(1266823871);
            boolean zE = buxVar.E(this);
            Object objG2 = buxVar.g();
            if (zE || objG2 == obj) {
                objG2 = new npz(this, 4);
                buxVar.x(objG2);
            }
            buxVar.r((afdr) objG2);
            buxVar.o();
        }
        buxVar.o();
    }

    public final ComponentName b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ComponentName) arguments.getParcelable("component_name");
        }
        return null;
    }

    public abstract void d(afm afmVar, cfy cfyVar, bux buxVar, int i);

    public final void e(afdr afdrVar) {
        if (!g()) {
            afdrVar.invoke();
        } else {
            this.b = afdrVar;
            f(false);
        }
    }

    public final void f(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    public final boolean g() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null || !bundle.getBoolean("visible")) {
            return;
        }
        f(true);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("visible", g());
    }
}
