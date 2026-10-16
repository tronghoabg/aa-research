package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.preference.Preference;

/* loaded from: classes2.dex */
public abstract class mku extends exv {
    final Preference k(String str) {
        Preference preferenceL = b().l(str);
        if (preferenceL != null) {
            return preferenceL;
        }
        throw new IllegalStateException("Fragment must contain preference with key ".concat(str));
    }

    public abstract yzz l();

    public final void m(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, l(), yzyVar).l());
    }

    protected final void n(mkt mktVar) {
        new Handler(Looper.getMainLooper()).post(new mgw(this, mktVar, 5));
    }

    public final void o(mkt mktVar) {
        bc activity = getActivity();
        if (activity == null) {
            return;
        }
        mktVar.a(activity);
    }

    @Override // defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        m(yzy.f);
    }
}
