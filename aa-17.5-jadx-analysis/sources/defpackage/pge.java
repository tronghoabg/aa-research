package defpackage;

import android.os.Looper;
import j$.util.Objects;
import j$.util.Optional;

/* loaded from: classes2.dex */
final class pge implements pbw {
    final /* synthetic */ int a;
    final /* synthetic */ pgf b;

    public pge(pgf pgfVar, int i) {
        this.a = i;
        this.b = pgfVar;
    }

    @Override // defpackage.pbw
    public final boolean a(final ozx ozxVar) {
        yxi yxiVar;
        Looper looperMyLooper = Looper.myLooper();
        pgr pgrVar = this.b.b;
        woy.aa(Objects.equals(looperMyLooper, pgrVar.B.a()), "invoked on unexpected thread");
        ((ype) ((ype) pgr.a.f()).ai(6480)).D("Received GAL socket result, callback=%d, result=%s", this.a, ozxVar);
        int iAr = lvl.ar(ozxVar);
        if (iAr == 0) {
            yxiVar = yxi.WIRELESS_GAL_SOCKET_CONNECTED;
        } else if (iAr == 1) {
            yxiVar = yxi.WIRELESS_GAL_SOCKET_FAILED_UNEXPECTEDLY;
        } else {
            if (iAr != 2) {
                throw new RuntimeException(null, null);
            }
            yxiVar = yxi.WIRELESS_GAL_SOCKET_FAILED_USER_DECISION;
        }
        pgrVar.w(yxiVar);
        pgrVar.z.d(new Runnable() { // from class: pgd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                pfz pfzVar;
                pge pgeVar = this.a;
                pgr pgrVar2 = pgeVar.b.b;
                boolean zEquals = Objects.equals(pgrVar2.w.get(pgeVar), pfz.b);
                ozx ozxVar2 = ozxVar;
                if (zEquals) {
                    if (ozxVar2 instanceof ozv) {
                        pgrVar2.w(yxi.WIRELESS_GAL_SOCKET_DISCONNECTED_UNEXPECTEDLY);
                    }
                    if (acot.w() && (ozxVar2 instanceof ozw)) {
                        pgrVar2.w(yxi.WIRELESS_GAL_SOCKET_DISCONNECTED_INTENTIONALLY);
                    }
                }
                Optional optionalEmpty = Optional.empty();
                boolean z = false;
                Objects.checkIndex(0, 4);
                if (ozxVar2 instanceof ozu) {
                    gjv gjvVar = pgrVar2.ao;
                    if (gjvVar.v() instanceof pgi) {
                        pgrVar2.w(yxi.WIRELESS_GAL_SOCKET_CONNECTED_AFTER_MD_REQUESTED);
                    }
                    pgrVar2.p();
                    gjvVar.w(pgj.b);
                } else if (ozxVar2 instanceof ozw) {
                    ozw ozwVar = (ozw) ozxVar2;
                    if (pgr.ab()) {
                        pgl pglVarJ = pgrVar2.j(ozwVar, ((Boolean) pgrVar2.ax.v()).booleanValue());
                        ((uk) pgrVar2.at.v()).d(pglVarJ.b);
                        if (aczv.aY()) {
                            pgrVar2.O(pglVarJ.a);
                        } else {
                            optionalEmpty = Optional.of(pglVarJ.a);
                        }
                        ((ype) pgr.a.l().ai((char) 6482)).y("SocketResult.FailedUserDecision - sending setup event: %s", pglVarJ.a.name());
                    } else {
                        pgrVar2.am.w(false);
                    }
                    ((ype) ((ype) pgr.a.f()).ai((char) 6481)).u("User no longer wishes to project. Deliberate GAL disconnection. ");
                    pgrVar2.p();
                } else {
                    if (!(ozxVar2 instanceof ozv)) {
                        throw new RuntimeException(null, null);
                    }
                    if (acrb.y()) {
                        if (pgr.ab()) {
                            int i = ((uk) pgrVar2.at.v()).a;
                            boolean z2 = i == 1;
                            if (i == 0) {
                                throw null;
                            }
                            boolean z3 = !z2;
                            if (!aczv.aY()) {
                                synchronized (pgrVar2.l) {
                                    pag pagVar = pgrVar2.m;
                                    ynp ynpVarListIterator = ((yfq) pgrVar2.ad.values()).listIterator(0);
                                    while (true) {
                                        if (!ynpVarListIterator.hasNext()) {
                                            break;
                                        } else if (((pgl) ynpVarListIterator.next()).a.equals(pagVar)) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z2 && !z) {
                                    optionalEmpty = Optional.of((pgeVar.b.b.T() && i == 3) ? pag.MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT : pag.MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT_GAL_ONLY);
                                }
                            }
                            z = z3;
                        }
                        if (z || (!pgr.ab() && !((Boolean) pgeVar.b.b.am.v()).booleanValue())) {
                            ((ype) ((ype) pgr.a.h()).ai((char) 6483)).u("GAL socket failed unexpectedly, but user requested to not use projection. ");
                        }
                    }
                }
                pgf pgfVar = pgeVar.b;
                int iAr2 = lvl.ar(ozxVar2);
                if (iAr2 == 0) {
                    pfzVar = pfz.b;
                } else if (iAr2 == 1) {
                    pfzVar = pfz.c;
                } else {
                    if (iAr2 != 2) {
                        throw new RuntimeException(null, null);
                    }
                    pfzVar = pfz.c;
                }
                pgfVar.f(pgeVar, pfzVar);
                if (aczv.aY()) {
                    return;
                }
                mla mlaVar = new mla(pgfVar.b, 15);
                if (true != optionalEmpty.isPresent()) {
                    return;
                }
                ((pgr) mlaVar.a).O((pag) optionalEmpty.get());
            }
        });
        return true;
    }
}
