package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mhp {
    private static final yph c = yph.c("GH.PreflightToast");
    final Handler a = new Handler(Looper.getMainLooper());
    final Runnable b = new jgw(this, 20);
    private final mho d;

    public mhp(mho mhoVar, eqa eqaVar) {
        this.d = mhoVar;
        eqaVar.getLifecycle().c(new mhn(this));
    }

    public final void a() {
        this.a.removeCallbacks(this.b);
        Object obj = this.d;
        bt childFragmentManager = ((Fragment) obj).getChildFragmentManager();
        Fragment fragmentF = childFragmentManager.f("GhPreflightToast");
        if (fragmentF != null) {
            w wVar = new w(childFragmentManager);
            wVar.k(fragmentF);
            wVar.i(true, true);
        }
        ((mge) obj).b().setVisibility(8);
    }

    public final void b(CharSequence charSequence) {
        try {
            ohs ohsVarJ = ebf.j();
            yxy yxyVar = yxy.FRX;
            yzz yzzVar = yzz.PREFLIGHT_TOAST_CONTEXT;
            ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.nQ).l());
            Object obj = this.d;
            if (((Fragment) obj).getChildFragmentManager().f("GhPreflightToast") != null || ((mge) obj).b().getVisibility() == 0) {
                ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.nR).l());
            }
            a();
            obv obvVarA = obv.a(charSequence);
            ((mge) obj).b().setVisibility(0);
            w wVar = new w(((Fragment) obj).getChildFragmentManager());
            wVar.q(R.id.preflight_toast_container, obvVarA, "GhPreflightToast");
            wVar.c();
            this.a.postDelayed(this.b, 2000L);
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 4952)).u("Unable to show toast.");
        }
    }
}
