package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.carsetup.fsm.impl.FsmController;

/* loaded from: classes2.dex */
public class sei extends Fragment {
    private static final ypf a = ols.R("FsmFragment");
    public int b;
    private sej c;
    private seh d;

    public final FsmController b() {
        return this.d.B();
    }

    public final void c(yzy yzyVar) {
        this.d.H(getClass(), yzyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.b = getArguments().getInt("com.google.android.fsm.FsmController.ARG_STATE_ID");
        seh sehVar = (seh) context;
        this.c = sehVar.B().g;
        a.l().ai(8830).D("Started with mStateId=%d mState=%s", this.b, this.c);
        this.d = sehVar;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            this.d.I(getClass());
        }
    }
}
