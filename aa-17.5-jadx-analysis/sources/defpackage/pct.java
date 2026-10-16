package defpackage;

import android.content.Intent;
import android.os.Bundle;
import j$.time.Duration;
import j$.util.OptionalInt;

/* loaded from: classes2.dex */
public final /* synthetic */ class pct implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pct(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 19;
        int i2 = 3;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((pcu) obj).a.r.a(yyv.WIRELESS_BROADCAST_RECEIVER_TIMED_OUT);
                return;
            case 1:
                yph yphVar = pcv.a;
                ((ype) yphVar.l().ai((char) 6311)).u("Timed out waiting for wifi connection");
                Object obj2 = this.a;
                synchronized (((pcv) obj2).b) {
                    pag pagVar = pag.SHUTDOWN;
                    pgr pgrVar = ((pcv) obj2).o;
                    if (pagVar.equals(pgrVar.a())) {
                        return;
                    }
                    pag pagVar2 = pag.CONNECTED_RFCOMM;
                    ((pcv) obj2).c = pagVar2;
                    pgrVar.y(pagVar2);
                    if (pgrVar.V() || ((pcv) obj2).j) {
                        ((ype) ((ype) yphVar.g()).ai(6312)).u("Failed to connect with provided wifi credentials");
                        ((pcv) obj2).b(pag.WIFI_INVALID_CREDENTIALS);
                    } else {
                        pgrVar.A();
                    }
                    return;
                }
            case 2:
                ((pdh) this.a).h();
                return;
            case 3:
                ((pdh) this.a).k();
                return;
            case 4:
                Object obj3 = this.a;
                pdh pdhVar = (pdh) obj3;
                if (pdhVar.k()) {
                    if (pdhVar.A == null) {
                        pdhVar.a(yxi.WIRELESS_WIFI_WAITING_FOR_NETWORK_AVAILABLE_CALLBACK);
                        return;
                    }
                    return;
                } else {
                    if (!aczv.ao()) {
                        pdhVar.h();
                    }
                    pdk pdkVar = pdhVar.m;
                    Object obj4 = pdhVar.r;
                    pdkVar.c(obj4);
                    pdkVar.f(new pct(obj3, i2), obj4, pdh.c.toMillis());
                    return;
                }
            case 5:
                pdh pdhVar2 = (pdh) this.a;
                if (pdhVar2.E) {
                    ((ype) ((ype) pdh.a.h()).ai((char) 6353)).u("Scheduled failure callback due to Wifi disabled is obsolete because network is currently requested.");
                    pdhVar2.a(yxi.WIRELESS_WIFI_ADAPTER_DISABLED_FAILURE_PREEMPTED_BY_NEW_REQUEST);
                    return;
                } else {
                    pdhVar2.n(1, 3, new iwu(18));
                    pdhVar2.n(2, 3, new iwu(i));
                    return;
                }
            case 6:
                pdh pdhVar3 = (pdh) this.a;
                pdhVar3.y = false;
                pdhVar3.i();
                return;
            case 7:
                ((ype) ((ype) pdh.a.h()).ai((char) 6329)).u("Network unavailable.");
                Object obj5 = this.a;
                yxi yxiVar = yxi.WIRELESS_WIFI_NETWORK_UNAVAILABLE;
                pdh pdhVar4 = ((pcz) obj5).a;
                pdhVar4.a(yxiVar);
                if (!pdhVar4.l()) {
                    pdhVar4.d(OptionalInt.empty());
                    return;
                } else {
                    if (pdhVar4.E) {
                        pdhVar4.m.f(new pct(obj5, 8), pdhVar4.s, pdhVar4.g.toMillis());
                        return;
                    }
                    return;
                }
            case 8:
                pdh pdhVar5 = ((pcz) this.a).a;
                pdhVar5.m.c(pdhVar5.s);
                pdhVar5.a(yxi.WIRELESS_WIFI_NETWORK_WAIT_FOR_LOCAL_ONLY_FAILURE_TIMED_OUT);
                pdhVar5.d(OptionalInt.empty());
                return;
            case 9:
                ((qsz) ((kzt) this.a).c).e();
                return;
            case 10:
                kzt kztVar = (kzt) this.a;
                ((qsz) kztVar.c).g();
                ((eqj) ((ajdr) kztVar.d).d).j(null);
                return;
            case 11:
                yph yphVar2 = pfi.a;
                ((ype) ((ype) yphVar2.f()).ai((char) 6452)).u("Sending Close Broadcast to ConnectingActivity only");
                Intent intent = new Intent("com.google.android.apps.auto.components.frx.phonescreen.WirelessConnectingActivity.CLOSE");
                intent.setPackage("com.google.android.projection.gearhead");
                pfi pfiVar = (pfi) this.a;
                pfiVar.b.sendBroadcast(intent);
                ((ype) yphVar2.l().ai((char) 6457)).u("Launching TapHU Activity");
                pfiVar.d(pfiVar.a());
                return;
            case 12:
                Object obj6 = this.a;
                ((pgr) obj6).aq.w(pgm.a);
                return;
            case 13:
                Object obj7 = this.a;
                ((pgr) obj7).aq.w(pgm.a);
                return;
            case 14:
                Object obj8 = this.a;
                ((pgr) obj8).aq.w(pgm.a);
                return;
            case 15:
                pgr pgrVar2 = (pgr) this.a;
                pgrVar2.B(pgrVar2.S, 0);
                return;
            case 16:
                Object obj9 = this.a;
                ((pgr) obj9).o.c(pag.PROJECTION_IN_PROGRESS, Bundle.EMPTY);
                return;
            case 17:
                ((ype) pgr.a.l().ai((char) 6588)).u("Start projection timed out.");
                pgr pgrVar3 = (pgr) this.a;
                ozt oztVar = pgrVar3.R;
                if (oztVar instanceof pcs) {
                    pcs pcsVar = (pcs) oztVar;
                    pcsVar.b.post(new oyy(pcsVar, 19));
                }
                pgrVar3.o.c(pag.PROJECTION_START_TIMED_OUT, Bundle.EMPTY);
                return;
            case 18:
                pgr pgrVar4 = (pgr) this.a;
                ozt oztVar2 = pgrVar4.R;
                if (oztVar2 instanceof pcs) {
                    pcs pcsVar2 = (pcs) oztVar2;
                    pcsVar2.b.post(new oyy(pcsVar2, 19));
                }
                pgrVar4.o.c(pag.PROJECTION_ENDED, Bundle.EMPTY);
                return;
            case 19:
                wer.c();
                pgr pgrVar5 = (pgr) this.a;
                pgrVar5.w(yxi.WIRELESS_SETUP_WPP_VERSION_REQUEST_TIMEOUT);
                pgrVar5.D(ozr.i);
                return;
            default:
                ((ype) pgr.a.l().ai((char) 6572)).u("startWirelessProjection, setting user intention to true");
                Object obj10 = this.a;
                if (pgr.ab()) {
                    ((uk) ((pgr) obj10).at.v()).d(pdo.a);
                } else {
                    ((pgr) obj10).am.w(true);
                }
                ((pgr) obj10).v(Duration.ZERO, true);
                return;
        }
    }

    public pct(pcv pcvVar, int i) {
        this.b = i;
        this.a = pcvVar;
    }
}
