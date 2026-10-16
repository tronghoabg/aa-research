package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import j$.util.Objects;

/* loaded from: classes.dex */
final class qhv extends BroadcastReceiver {
    final /* synthetic */ qhx a;

    public qhv(qhx qhxVar) {
        this.a = qhxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getKeyCode() != 84) {
            ((ype) ((ype) qhx.a.g()).ai((char) 7275)).y("Unhandled event %s", keyEvent);
            return;
        }
        qhx qhxVar = this.a;
        yph yphVar = qhx.a;
        ((ype) yphVar.l().ai((char) 7281)).y("handleSearchKeyEvent %s", keyEvent);
        if (keyEvent.getAction() == 0) {
            if (!keyEvent.isLongPress()) {
                ((ype) yphVar.l().ai((char) 7285)).y("Non long-press, start tracking %s", Boolean.valueOf(!qhxVar.k));
                if (qhxVar.k) {
                    return;
                }
                keyEvent.startTracking();
                return;
            }
            ((ype) yphVar.l().ai((char) 7286)).u("Long press on search key");
            qhxVar.k = true;
            if (qhxVar.r()) {
                ((ype) yphVar.l().ai((char) 7288)).u("Restarting voice session");
                qhxVar.j.F(3);
                return;
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 7287)).u("Starting voice session");
                qhxVar.n(3);
                return;
            }
        }
        if (qhxVar.k) {
            ((ype) yphVar.l().ai((char) 7284)).u("Long press search already fired. Ignore up event.");
            qhxVar.k = false;
            return;
        }
        ((ype) yphVar.l().ai((char) 7282)).u("Non long press, triggering assistant");
        if (qhxVar.r() && qhxVar.i == kxa.b) {
            ((ype) yphVar.l().ai((char) 7283)).u("Assistant already open, closing it");
            qhxVar.j(ywk.HARDWARE_BUTTON_CLICKED);
        } else if (acmd.A() && Objects.equals(qhxVar.j.h().e(), true)) {
            qhxVar.j.p();
        } else {
            qhxVar.n(3);
        }
    }
}
