package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes2.dex */
public final class exb implements OnBackAnimationCallback {
    final /* synthetic */ exc a;

    public exb(exc excVar) {
        this.a = excVar;
    }

    public final void onBackCancelled() {
        exc excVar = this.a;
        mko mkoVar = excVar.d;
        if (mkoVar == null) {
            return;
        }
        if (!excVar.c) {
            mkoVar.v(excVar, null);
        }
        ewx ewxVar = (ewx) mkoVar.b;
        if (affa.f(excVar, ewxVar.e) && ewxVar.d == -1) {
            ewt ewtVarA = ewxVar.c;
            if (ewtVarA == null) {
                ewtVarA = ewxVar.a(-1);
            }
            ewxVar.c = null;
            ewxVar.d = 0;
            ewxVar.e = null;
            if (ewtVarA != null) {
                ewtVarA.a();
            }
            ewxVar.f.d(ewy.a);
        }
        excVar.c = false;
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        ews ewsVarD = ebl.d(backEvent);
        exc excVar = this.a;
        mko mkoVar = excVar.d;
        if (mkoVar != null && excVar.c) {
            ewx ewxVar = (ewx) mkoVar.b;
            if (affa.f(excVar, ewxVar.e) && ewxVar.d == -1) {
                ewt ewtVarA = ewxVar.c;
                if (ewtVarA == null) {
                    ewtVarA = ewxVar.a(-1);
                }
                if (ewtVarA != null) {
                    ewtVarA.c(ewsVarD);
                }
                ewxVar.f.d(new ewz(ewsVarD));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        exc excVar = this.a;
        ews ewsVarD = ebl.d(backEvent);
        mko mkoVar = excVar.d;
        if (mkoVar == null || excVar.c) {
            return;
        }
        mkoVar.v(excVar, ewsVarD);
        excVar.c = true;
    }
}
