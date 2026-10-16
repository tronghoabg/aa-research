package defpackage;

import android.os.Bundle;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class qkg extends qkk {
    private static final yph a = yph.c("GH.ReminderPAdapter");

    @Override // defpackage.qkk
    protected final nur a(moa moaVar) {
        yph yphVar = a;
        if (yphVar.l().Z()) {
            ((ype) yphVar.l().ai((char) 7484)).y("getAsNotificationWorker si=%s", Objects.toString(moaVar));
        }
        GhIcon ghIconP = GhIcon.p(mki.a.c, R.drawable.ic_reminder_assistantaction);
        String string = moaVar.K() == null ? null : moaVar.K().toString();
        String string2 = moaVar.L() != null ? moaVar.L().toString() : null;
        num numVar = new num();
        numVar.b = ghIconP;
        numVar.m = string;
        numVar.n = string2;
        numVar.j = false;
        numVar.f = moaVar.O() == null ? "com.google.android.projection.gearhead" : moaVar.O();
        numVar.g = moaVar.P();
        return numVar.b();
    }

    @Override // defpackage.qkj
    public final void b(Bundle bundle) {
    }
}
