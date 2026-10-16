package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class qki extends qkk {
    private static final yph a = yph.c("GH.SdkPAdapter");

    public qki(ykd ykdVar) {
        super(ykdVar);
        new qkh(this);
    }

    @Override // defpackage.qkk
    protected final nur a(moa moaVar) {
        yph yphVar = a;
        if (yphVar.l().Z()) {
            ((ype) yphVar.l().ai((char) 7485)).y("getAsNotificationWorker si=%s", Objects.toString(moaVar));
        }
        GhIcon ghIconJ = null;
        PendingIntent pendingIntentBo = moaVar.G() == null ? null : roc.bo(moaVar, new Bundle());
        String string = moaVar.K() == null ? null : moaVar.K().toString();
        String string2 = moaVar.L() == null ? null : moaVar.L().toString();
        num numVar = new num();
        moa moaVar2 = this.g;
        Context context = mki.a.c;
        if (moaVar2.u() == 0 || TextUtils.isEmpty(moaVar2.O())) {
            moaVar2.U();
            if (!TextUtils.isEmpty(null)) {
                moaVar2.U();
                throw null;
            }
        } else {
            ghIconJ = GhIcon.r(moaVar2.O(), moaVar2.u());
        }
        if (ghIconJ == null) {
            ghIconJ = GhIcon.j(new ComponentName(woy.al(moaVar2.O()), ""));
        }
        numVar.b = ghIconJ;
        numVar.c = pendingIntentBo;
        numVar.m = string;
        numVar.n = string2;
        numVar.j = false;
        numVar.f = moaVar.O() == null ? "com.google.android.projection.gearhead" : moaVar.O();
        numVar.g = moaVar.P();
        numVar.a = moaVar.T() ? nup.HIGH : nup.LOW;
        return numVar.b();
    }

    @Override // defpackage.qkj
    public final void b(Bundle bundle) {
        ((ype) a.l().ai((char) 7486)).M("handleNotificationAction intent=%s si.action=%s", bundle, this.g.G());
        if (this.g.G() != null) {
            this.g.G().b();
        }
    }
}
