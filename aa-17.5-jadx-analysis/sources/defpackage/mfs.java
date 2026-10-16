package defpackage;

import android.app.KeyguardManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class mfs implements epy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mfs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        int i = this.b;
        if (i == 0) {
            mft mftVar = (mft) this.a;
            Handler handler = mftVar.a;
            handler.getClass();
            KeyguardManager keyguardManager = (KeyguardManager) mki.a.c.getSystemService("keyguard");
            keyguardManager.getClass();
            if (eprVar.a() == eps.c && keyguardManager.isKeyguardLocked()) {
                handler.postDelayed(mftVar.b, 250L);
                return;
            } else {
                if (eprVar.a() == eps.a) {
                    handler.removeCallbacks(mftVar.b);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (eprVar == epr.ON_START) {
                mfr mfrVar = (mfr) this.a;
                if (mfrVar.b) {
                    return;
                }
                mfrVar.a(yzy.f);
                mfrVar.b = true;
                return;
            }
            return;
        }
        if (i == 2) {
            ((ype) mge.a.l().ai((char) 4879)).y("onLifecycleEvent:%s", eprVar.name());
            mfl mflVarA = ((mfm) mki.a.i(mfm.class)).a();
            epr eprVar2 = epr.ON_CREATE;
            mgn mgnVar = ((mfp) mflVarA).b;
            if (eprVar == eprVar2) {
                mgnVar.b(((mge) this.a).c);
                return;
            } else {
                if (eprVar == epr.ON_DESTROY) {
                    mgnVar.c(((mge) this.a).c);
                    return;
                }
                return;
            }
        }
        if (i != 3) {
            qrq qrqVar = (qrq) this.a;
            qrqVar.Q();
            qrqVar.g.d(this);
        } else if (eprVar == epr.ON_DESTROY) {
            Object obj = this.a;
            qrq qrqVar2 = (qrq) obj;
            qrqVar2.f.b();
            if (!((qqh) obj).N()) {
                qrqVar2.getViewModelStore().a();
            }
            qrp qrpVar = qrqVar2.h;
            qrq qrqVar3 = qrpVar.d;
            qrqVar3.C().getDecorView().removeCallbacks(qrpVar);
            qrqVar3.C().getDecorView().getViewTreeObserver().removeOnDrawListener(qrpVar);
        }
    }
}
