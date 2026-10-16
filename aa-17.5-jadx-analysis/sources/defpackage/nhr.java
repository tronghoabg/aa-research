package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class nhr extends kmh {
    public static final /* synthetic */ afia[] a = {new affn(nhr.class, "fragmentHost", "getFragmentHost()Lcom/google/android/apps/auto/components/system/fragment/CarFragmentHost;", 0)};
    public static final yph b = yph.c("GH.CompRailBaseFrag");
    public ocq c;
    public final afgl d;
    public boolean e;
    private boolean f;
    private final nok g;
    private final nok h;
    private final nok i;
    private final nok j;

    public nhr() {
        getLifecycle().c(new nhp(this));
        this.d = new nhq(this);
        this.g = new nok((byte[]) null);
        this.h = new nok((byte[]) null);
        this.i = new nok((byte[]) null);
        this.j = new nok((byte[]) null);
    }

    public static final void b(nge ngeVar, yzy yzyVar, String str, Object... objArr) {
        yop yopVarL = b.l();
        int length = objArr.length;
        String strD = ngeVar.d();
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        yopVarL.R("Not showing tooltip for display %s/%s: %s", ngeVar.c(), strD, str2);
        ndo ndoVar = new ndo(14);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.RAIL, yzyVar);
        ndoVar.invoke(rrbVarH);
        ohsVarJ.F(rrbVarH.l());
    }

    public final nok c(nlz nlzVar) {
        int iOrdinal = nlzVar.ordinal();
        if (iOrdinal == 0) {
            return this.g;
        }
        if (iOrdinal == 1) {
            return this.j;
        }
        if (iOrdinal == 2) {
            return this.h;
        }
        if (iOrdinal == 3) {
            return null;
        }
        if (iOrdinal == 4) {
            return this.i;
        }
        throw new aezs();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("OnFirstResumeEventPublishedKey", false)) {
            z = true;
        }
        this.f = z;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f) {
            ols.K(getContext(), "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", rry.b.ordinal(), null);
            this.f = true;
        }
        if (this.e) {
            return;
        }
        ((lhm) mki.a.i(lhm.class)).gL(new nho(this), true);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("OnFirstResumeEventPublishedKey", this.f);
    }
}
