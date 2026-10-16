package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
final class lmy extends mdd {
    final /* synthetic */ lnb a;

    public lmy(lnb lnbVar) {
        this.a = lnbVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("MediaKeyReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        KeyEvent keyEvent;
        CarInfo carInfoB;
        int i;
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        yph yphVar = lnb.a;
        ((ype) yphVar.l().ai(4018)).w("Received media key %d", keyEvent.getKeyCode());
        if (acsx.A() && this.a.k && (((carInfoB = kiq.a().b()) == null || (i = carInfoB.e) <= 0 || (i == 1 && carInfoB.f < 6)) && (keyEvent.getKeyCode() == 126 || keyEvent.getKeyCode() == 85))) {
            ((ype) yphVar.l().ai((char) 4021)).u("Ignoring media play key during startup timeout.");
            return;
        }
        boolean zE = lmi.a().e();
        lnb lnbVar = this.a;
        if (!zE) {
            lol lolVar = ((lmu) lnbVar.c).e;
            if (lolVar instanceof lod) {
                ((lod) lolVar).i.d(yzz.MEDIA_FACET).a(keyEvent);
                return;
            }
            return;
        }
        lth lthVar = lnbVar.j ? lnbVar.e : lnbVar.d;
        if (lthVar == null || lthVar.b() == null) {
            ((ype) ((ype) yphVar.h()).ai(4019)).K("%s or its transport controls null, DROPPING media key %d", true != lnbVar.j ? "mediaViewModel" : "phoneMediaViewModel", keyEvent.getKeyCode());
        } else {
            ((ype) yphVar.l().ai(4020)).D("Dispatching media key %d to %s media app", keyEvent.getKeyCode(), true != lnbVar.j ? "current" : "phone");
            lthVar.b().a(keyEvent);
        }
    }
}
