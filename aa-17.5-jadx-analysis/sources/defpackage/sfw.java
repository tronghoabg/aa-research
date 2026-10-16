package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public abstract class sfw extends Fragment {
    public static final ypf f = ols.R("CAR.SETUP.FRX");

    public abstract yzz b();

    public final sga c() {
        woy.aa(isAdded(), "Called SetupBaseFragment#getController while detached from Activity");
        return ((sfu) requireContext()).B();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        c().g.L(b(), yzy.f);
    }
}
