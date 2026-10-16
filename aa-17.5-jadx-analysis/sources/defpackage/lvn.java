package defpackage;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.car.AudioFocusInfo;
import com.google.android.gms.carsetup.FirstActivityImpl;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class lvn implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public lvn(aduw aduwVar, adss adssVar, boolean z, int i) {
        this.d = i;
        this.c = adssVar;
        this.a = z;
        this.b = aduwVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, pte] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            lvi lviVar = (lvi) this.c;
            yph yphVar = lvo.a;
            ((ype) yphVar.l().ai((char) 4300)).y("updateImConversation: %s", lviVar);
            wer.c();
            long j = lviVar.e;
            Long lValueOf = Long.valueOf(j);
            Object obj = this.b;
            lvo lvoVar = (lvo) obj;
            Map map = lvoVar.c;
            lvg lvgVar = (lvg) map.get(lValueOf);
            if (lvgVar instanceof lvi) {
                lvi lviVar2 = (lvi) lvgVar;
                if (lviVar2.l(lviVar)) {
                    return;
                }
                Iterator it = lvoVar.b.iterator();
                while (it.hasNext()) {
                    ((kex) ((ajmd) it.next()).a).d(lviVar == null ? lviVar2 : lviVar);
                }
            } else {
                Iterator it2 = lvoVar.b.iterator();
                while (it2.hasNext()) {
                    ((kex) ((ajmd) it2.next()).a).d(lviVar);
                }
            }
            lviVar.a = this.a && lviVar.p();
            lvo.l(lviVar.g, lviVar.o);
            map.put(Long.valueOf(j), lviVar);
            lvoVar.e(lviVar);
            ((ype) yphVar.l().ai((char) 4301)).u("Trying to get Smart Actions");
            lwo.a().d(lviVar.m, (int) actj.d()).fE(lbh.d(), new jue(obj, lviVar, 6));
            return;
        }
        if (i == 1) {
            ((qui) this.b).a.d((AudioFocusInfo) this.c, this.a);
            return;
        }
        if (i == 2) {
            pho phoVar = (pho) this.c;
            gjt gjtVar = phoVar.b;
            if (((phn) gjtVar.e()).equals(phn.c)) {
                return;
            }
            boolean z = this.a;
            woy.ad(((phn) gjtVar.e()).equals(phn.b), "callback received when in state %s", ((phn) gjtVar.e()).name());
            if (z) {
                phoVar.d();
            }
            this.b.run();
            return;
        }
        if (i == 3) {
            String strAk = woy.ak(this.c.c());
            Object obj2 = this.b;
            if (strAk != null) {
                ((pvu) obj2).h(strAk);
                return;
            } else {
                if (this.a) {
                    ((pvu) obj2).g(new pwv(pwu.n));
                    return;
                }
                return;
            }
        }
        if (i != 4) {
            boolean z2 = this.a;
            if (i != 5) {
                ((aduw) this.b).m.c(this.c, z2);
                return;
            }
            Object obj3 = this.c;
            Object obj4 = this.b;
            if (z2) {
                ((FirstActivityImpl) obj4).A((Intent) obj3);
                return;
            } else {
                FirstActivityImpl.m.g().ai(8705).y("Intent validation failed %s", obj3);
                ((FirstActivityImpl) obj4).finish();
                return;
            }
        }
        Object obj5 = this.b;
        int iOrdinal = ((xkr) obj5).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 11) {
                qrg.a.g().ai(7668).y("BluetoothPairingResponse with wrong status: %s", obj5);
                return;
            }
            qrg.a.l().ai(7670).u("Bluetooth pairing delayed by the car");
            qrg qrgVar = (qrg) this.c;
            rgs rgsVar = qrgVar.e;
            if (rgsVar.j) {
                rgsVar.j = false;
            }
            rgsVar.c(rgo.EVENT_CAR_DELAYING_PAIRING);
            qrgVar.m(new qra(0));
            return;
        }
        Object obj6 = this.c;
        boolean z3 = this.a;
        qrg qrgVar2 = (qrg) obj6;
        rgs rgsVar2 = qrgVar2.e;
        rgsVar2.i = z3;
        if (rgsVar2.j && Build.VERSION.SDK_INT <= 29 && qrgVar2.t.h() != 2) {
            qrg.a.l().ai(7669).u("BluetoothFsm failed to connect HFP for 3 times, unpairing and re-pairing.");
            qrgVar2.d.i(rhf.BLUETOOTH_UNPAIR_HFP_CONNECTING_EXCEEDS_MAX_COUNT);
            qrgVar2.e.j = false;
        }
        qrgVar2.e.c(rgo.EVENT_CAR_READY_FOR_PAIRING);
    }

    public /* synthetic */ lvn(FirstActivityImpl firstActivityImpl, boolean z, Intent intent, int i) {
        this.d = i;
        this.b = firstActivityImpl;
        this.a = z;
        this.c = intent;
    }

    public /* synthetic */ lvn(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    public /* synthetic */ lvn(pho phoVar, boolean z, Runnable runnable, int i) {
        this.d = i;
        this.c = phoVar;
        this.a = z;
        this.b = runnable;
    }

    public lvn(qrg qrgVar, xkr xkrVar, boolean z, int i) {
        this.d = i;
        this.b = xkrVar;
        this.a = z;
        this.c = qrgVar;
    }
}
