package defpackage;

import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.time.Instant;

/* loaded from: classes.dex */
public final /* synthetic */ class nwg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nwg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((nwi) this.a).g();
                return;
            case 1:
                yph yphVar = ntm.a;
                try {
                    this.a.run();
                    return;
                } catch (NullPointerException e) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        throw e;
                    }
                    ((ype) ((ype) ntm.a.g()).ai((char) 5454)).u("Null pointer exception in calling requestCellInfoUpdate due to timeout.");
                    return;
                }
            case 2:
                ((obs) this.a).b();
                return;
            case 3:
                ((ofb) this.a).y();
                return;
            case 4:
                Object obj = this.a;
                synchronized (((oib) obj).a) {
                    ((oib) obj).b.b();
                }
                return;
            case 5:
                qrq qrqVar = (qrq) this.a;
                qrqVar.g.c(new qro(qrqVar, qrqVar.k));
                return;
            case 6:
                try {
                    super/*qqh*/.c();
                    return;
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                }
            case 7:
                ((qtg) this.a).g();
                return;
            case 8:
                qsu.d();
                qsq qsqVar = (qsq) this.a;
                if (qsqVar.b) {
                    return;
                }
                qsqVar.b = true;
                if (qsqVar.a) {
                    qsqVar.a();
                    return;
                }
                return;
            case 9:
                qtf qtfVar = (qtf) this.a;
                if (SystemClock.elapsedRealtime() - qtfVar.h < 1800 || qtfVar.f == null) {
                    return;
                }
                qtf.a.l().ai(7901).u("Location is stale.");
                qtfVar.l.run();
                return;
            case 10:
                qtf qtfVar2 = (qtf) this.a;
                if (SystemClock.elapsedRealtime() - qtfVar2.h < 1800) {
                    qtf.a.h().ai(7902).u("Fake location inject fired but it was up to date.");
                    return;
                }
                if (qtfVar2.f != null && qtfVar2.g.get()) {
                    qtfVar2.f.removeSpeed();
                    qtfVar2.f.setAccuracy(7.89f);
                    qtfVar2.f.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                    qtfVar2.f.setTime(Instant.now().toEpochMilli());
                    qtf.a.l().ai(7903).u("Force location update of the last known location.");
                    qtfVar2.a(qtfVar2.f);
                }
                qtfVar2.c(qtfVar2.l, 1000L);
                return;
            case 11:
                ((raw) this.a).k = true;
                return;
            case 12:
                synchronized (rbr.class) {
                    Object obj2 = this.a;
                    if (((rbr) obj2).g.isEmpty() && ((rbr) obj2).h.isEmpty()) {
                        ((rbr) obj2).d.quit();
                        if (rbr.a == obj2) {
                            rbr.a = null;
                        }
                    }
                }
                return;
            case 13:
                ((rdq) this.a).h();
                return;
            case 14:
                ((qsz) this.a).f();
                return;
            case 15:
                rgs rgsVar = (rgs) this.a;
                rhg rhgVar = rgsVar.d;
                if (rhgVar.e()) {
                    rgsVar.e(rgp.STATE_WAITING_FOR_BLUETOOTH_PROFILE_UTIL);
                    return;
                }
                rgsVar.h = null;
                ypf ypfVar = rhg.a;
                ypfVar.l().ai(8139).u("enable");
                if (rhgVar.n != 0) {
                    ypfVar.l().ai(8140).u("enable: This object wasn't initialized successfully.");
                } else {
                    rgk rgkVar = rhgVar.d;
                    rgkVar.getClass();
                    if (rgkVar.e()) {
                        return;
                    }
                }
                rgsVar.c(rgo.EVENT_ENABLING_FAILED);
                return;
            case 16:
                rgs rgsVar2 = (rgs) this.a;
                if (rgsVar2.k) {
                    rgs.a.f().ai(8037).u("Timeout check after cleanup");
                    return;
                } else {
                    rgsVar2.g.name();
                    rgsVar2.c(rgo.EVENT_STATE_TIMEOUT);
                    return;
                }
            case 17:
                ((rnw) this.a).t();
                return;
            case 18:
                ((rnw) this.a).t();
                return;
            case 19:
                try {
                    qxy qxyVar = ((rnw) this.a).i;
                    if (qxyVar != null) {
                        qxyVar.v();
                    }
                } catch (RemoteException unused) {
                }
                Object obj3 = this.a;
                rnw rnwVar = (rnw) obj3;
                if (rnwVar.I != null) {
                    rnwVar.n(0, false);
                }
                try {
                    qxy qxyVar2 = ((rnw) obj3).i;
                    if (qxyVar2 != null) {
                        qxyVar2.g();
                    }
                } catch (RemoteException unused2) {
                }
                ((rnw) this.a).J = null;
                return;
            default:
                rnw rnwVar2 = (rnw) this.a;
                if (rnwVar2.y()) {
                    if (rnwVar2.H && rnwVar2.r) {
                        rrd.d(5, "CAR.PROJECTION.CAHI", null, "%s onProjectionResume not sent, activity is finishing", rnwVar2.t);
                    } else {
                        rnwVar2.n(5, false);
                    }
                    qxy qxyVar3 = rnwVar2.i;
                    if (qxyVar3 != null) {
                        try {
                            qxyVar3.o();
                            return;
                        } catch (RemoteException unused3) {
                            rnwVar2.t();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public nwg(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
