package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import j$.time.Duration;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class rgs {
    static final rgr b;
    static final rgr c;
    private static final Duration r;
    private static final rgr s;
    private static final Object t;
    private static final Object u;
    private static final Object v;
    private static final Object w;
    private static final Object x;
    private final rhw A;
    private final rgt B;
    private rgr C;
    private boolean D;
    private final wyd E;
    public final rhg d;
    public final rwz e;
    final Map f;
    public rgp g;
    public rgv h;
    public boolean i;
    public boolean j;
    public boolean k;
    public rgo l;
    public final AtomicBoolean m;
    public int n;
    public int o;
    public final kwp p;
    private final Handler y;
    private final rgn z;
    public static final ypf a = ols.R("CAR.BT");
    private static final Duration q = Duration.ofSeconds(6);

    static {
        Duration.ofSeconds(25L);
        r = Duration.ofSeconds(1L);
        b = new rgr(rgp.STATE_NONE);
        s = new rgr(rgp.STATE_UNPAIRED);
        c = new rgr(rgp.STATE_WRONG);
        t = new Object();
        u = new Object();
        v = new Object();
        w = new Object();
        x = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x05f1 A[PHI: r25
  0x05f1: PHI (r25v6 rgp) = (r25v4 rgp), (r25v7 rgp) binds: [B:9:0x05ef, B:5:0x05e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x07fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rgs(android.os.Looper r41, defpackage.rhg r42, defpackage.rgn r43, defpackage.wyd r44, defpackage.rhw r45, defpackage.rwz r46, defpackage.rgt r47) {
        /*
            Method dump skipped, instructions count: 2173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgs.<init>(android.os.Looper, rhg, rgn, wyd, rhw, rwz, rgt):void");
    }

    private final void f() {
        this.y.removeCallbacksAndMessages(x);
    }

    private final boolean g() {
        rgv rgvVar;
        if (this.h != null && (!acnm.e() || (rgvVar = this.h) == null || rgvVar.c())) {
            return true;
        }
        ypf ypfVar = a;
        ypfVar.l().ai(8067).u("bluetoothProfileUtil is not prepared due to being null or uninitialized");
        ypfVar.h().ai(8041).u("bluetoothProfileUtil should be prepared but isn't, retry enabling.");
        e(rgp.STATE_ENABLING);
        return false;
    }

    private final boolean h() {
        wyd wydVar = this.E;
        wydVar.getClass();
        int i = wydVar.i();
        if (i == 1) {
            this.A.getClass();
            return acnm.i();
        }
        if (i != 2) {
            return false;
        }
        this.A.getClass();
        return acnm.j();
    }

    public final void a() {
        Handler handler = this.y;
        handler.removeCallbacksAndMessages(t);
        handler.removeCallbacksAndMessages(u);
        handler.removeCallbacksAndMessages(v);
        handler.removeCallbacksAndMessages(w);
        handler.removeCallbacksAndMessages(x);
    }

    public final void b(int i) {
        rhg rhgVar = this.d;
        if (!rhgVar.h() && (Build.VERSION.SDK_INT >= 30 || !rhgVar.g())) {
            e(rgp.STATE_REQUESTING_CAR_PAIRING_PREPARATION);
            return;
        }
        if (this.E.i() == 2) {
            a.l().ai(8040).u("Ignored unpair request of BT device over wireless connection");
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            rhgVar.b();
        } else {
            rhgVar.i(rhf.BLUETOOTH_UNPAIR_DEFAULT);
        }
        this.y.postAtTime(new rgm(this, i, 0), v, SystemClock.uptimeMillis() + q.toMillis());
    }

    public final void c(rgo rgoVar) {
        rgp rgpVar;
        Duration duration;
        this.g.name();
        rgoVar.name();
        this.l = rgoVar;
        String strName = rgoVar.name();
        String strName2 = this.g.name();
        rgr rgrVar = this.C;
        ((yec) this.p.a).add(Pair.create(Long.valueOf(System.currentTimeMillis()), String.format("Current State: %s, Event : %s, Transition: %s", strName2, strName, rgrVar != null ? rgrVar.toString() : "transition null")));
        if (this.k) {
            a.f().ai(8049).M("event fired after cleanup. currentState=%s event%s", this.g.name(), rgoVar.name());
            return;
        }
        if (rgoVar == rgo.EVENT_UNPAIRED && h() && this.D) {
            a.f().ai(8048).u("Unpaired after reaching monitoring state. Preventing repairing.");
            a();
            d(rgp.STATE_UNPAIRED);
            return;
        }
        Map map = (Map) this.f.get(this.g);
        if (map == null) {
            a.f().ai(8047).y("No transition map defined for state %s", this.g.name());
            return;
        }
        rgr rgrVar2 = (rgr) map.get(rgoVar);
        if (rgrVar2 == null) {
            a.f().ai(8046).M("No transition defined. state=%s event=%s", this.g.name(), rgoVar.name());
            return;
        }
        if (rgrVar2 == b) {
            a.l().ai(8045).u("No transition");
            return;
        }
        if (rgrVar2 == c) {
            a.g().ai(8044).M("Wrong transition. state=%s event=%s", this.g.name(), rgoVar.name());
            return;
        }
        rgr rgrVar3 = this.C;
        if (rgrVar2 != rgrVar3) {
            if (rgrVar3 != null) {
                rgrVar3.f = 0;
            }
            this.C = rgrVar2;
        }
        rgrVar2.f++;
        a.l().ai(8043).y("%s", rgrVar2);
        if (Build.VERSION.SDK_INT >= 30) {
            a();
        } else {
            this.y.removeCallbacksAndMessages(t);
        }
        int i = rgrVar2.c;
        if (i == 0 || rgrVar2.f <= i) {
            rgpVar = rgrVar2.a;
            duration = rgrVar2.b;
        } else {
            rgpVar = rgrVar2.d;
            duration = rgrVar2.e;
            if (this.g == rgp.STATE_HFP_CONNECTING && rgoVar == rgo.EVENT_HFP_DISCONNECTED) {
                this.j = true;
            }
        }
        if (duration.isZero()) {
            d(rgpVar);
        } else {
            this.y.postAtTime(new rgq(this, rgpVar, 0), t, SystemClock.uptimeMillis() + duration.toMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void d(defpackage.rgp r17) {
        /*
            Method dump skipped, instructions count: 2148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgs.d(rgp):void");
    }

    public final void e(rgp rgpVar) {
        a.l().ai(8068).M("switchToState: from %s to %s", this.g.name(), rgpVar.name());
        rgr rgrVar = this.C;
        if (rgrVar != null) {
            rgrVar.f = 0;
            this.C = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            a();
        } else {
            this.y.removeCallbacksAndMessages(t);
        }
        d(rgpVar);
    }
}
