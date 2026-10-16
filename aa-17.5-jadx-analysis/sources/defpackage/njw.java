package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.google.android.apps.auto.components.bugreport.BugreporterReceiver;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.Random;

/* loaded from: classes.dex */
public final class njw extends erm {
    public static final yph a = yph.c("GH.RailViewModel");
    public final qrn b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final eqm f;
    public final eqj g;
    public final eqj i;
    public final niq j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final eqm q;
    private int r;
    private final Random s;
    private final aezr t;
    private final eqj u;
    private final eqj v;
    private final eqj w;

    public njw(qrn qrnVar) {
        this.b = qrnVar;
        this.s = new Random();
        int i = 8;
        this.t = new aezy(new ngz(this, i));
        yfq yfqVar = odq.a;
        eqj eqjVar = ((odq) mki.a.i(odq.class)).c;
        this.u = eqjVar;
        lhj lhjVarA = lhj.a.a();
        nfd nfdVarA = nfd.a.a();
        kkq kkqVarA = kkq.a.a();
        akh akhVar = new akh(this, i);
        afco afcoVar = tby.a;
        eqj eqjVarH = tby.H(lhjVarA, nfdVarA, kkqVarA, akhVar);
        this.v = eqjVarH;
        eqjVarH.getClass();
        int i2 = 19;
        this.c = eqy.b(eqjVarH, new nna(i2));
        int i3 = 18;
        ddw ddwVar = new ddw(i3);
        eqjVar.getClass();
        eqjVarH.getClass();
        this.d = new tbn(eqjVar, eqjVarH, ddwVar);
        int i4 = nqg.a;
        this.e = nqf.a.a();
        ComponentName componentName = nxo.a;
        tbx tbxVar = new tbx(eqy.b(((nxo) mki.a.i(nxo.class)).d, new ltk(i3)), Duration.ZERO);
        this.w = tbxVar;
        eqm eqmVar = new eqm(false);
        this.f = eqmVar;
        this.g = tby.a(tbxVar, eqmVar);
        yph yphVar = mpd.a;
        eqj eqjVarB = eqy.b(((mpd) mki.a.i(mpd.class)).h, new ltk(i2));
        this.i = eqjVarB;
        this.j = new niq();
        this.k = mpm.e();
        ltk ltkVar = new ltk(20);
        eqjVarB.getClass();
        eqy.b(eqjVarB, ltkVar);
        nex.a.a();
        if (qrnVar == null) {
            yph yphVar2 = kio.a;
            qrnVar = ((kio) mki.a.i(kio.class)).e();
            qrnVar.getClass();
        }
        qrnVar.getClass();
        yph yphVar3 = kio.a;
        this.l = (((kio) mki.a.i(kio.class)).r() && kfn.q(qrnVar)) ? new ney(qrnVar) : new eqm(null);
        this.m = nfr.a.a().c;
        yph yphVar4 = nsr.a;
        boolean zD = ((nsr) mki.a.i(nsr.class)).b().D();
        this.n = zD;
        this.o = ((nsr) mki.a.i(nsr.class)).b().F() & zD;
        this.p = zD & ((nsr) mki.a.i(nsr.class)).b().G(nsn.m);
        this.q = new eqm(false);
    }

    private static final nro s() {
        return nrq.b().a();
    }

    private static final void t(int i) {
        if (i == 2) {
            a.l().u("Closing Assistant due to Dashboard action");
            lau.c().j(ywk.RAIL_ICON_CLICKED);
        }
    }

    private final void u(Context context, String str, String str2, String str3, Uri uri, int i) {
        ((ype) a.f()).u("Robin model notification triggered");
        nuj nujVarB = nuj.b();
        num numVar = new num();
        numVar.m = str;
        numVar.n = "See phone notification for details";
        numVar.d = GhIcon.p(context, R.drawable.gs_android_auto_vd_48);
        numVar.a = nup.HIGH;
        numVar.x = nuo.a;
        numVar.f = "com.google.android.projection.gearhead";
        nujVarB.j("UPGRADE_ROBIN_MODEL", i, numVar.b());
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        mas.c();
        dsx dsxVar = new dsx(context, "gearhead_alerts");
        dsxVar.n(R.drawable.gs_android_auto_vd_48);
        dsxVar.g = activity;
        dsxVar.i(str2);
        dsxVar.h(str3);
        dsxVar.i = 0;
        Notification notificationA = dsxVar.a();
        notificationA.getClass();
        new dug(context).b(null, i, notificationA);
        this.r++;
    }

    public final eqj a() {
        return this.j.f;
    }

    public final eqj b() {
        return this.j.d;
    }

    public final eqj c() {
        return ((kxb) mki.a.i(kxb.class)).h();
    }

    public final eqj e() {
        return ((kxb) mki.a.i(kxb.class)).i();
    }

    public final eqj f(final boolean z, final int i, njp njpVar) {
        final affv affvVar = new affv();
        eqm eqmVar = this.q;
        return tby.h(njpVar.f(), njpVar.e(), njpVar.g(), njpVar.b(), njpVar.h(eqmVar), njpVar.i(eqmVar), new afek() { // from class: nju
            /* JADX WARN: Removed duplicated region for block: B:79:0x0177 A[PHI: r13
  0x0177: PHI (r13v8 nmj) = (r13v6 nmj), (r13v12 nmj) binds: [B:77:0x0174, B:67:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // defpackage.afek
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 386
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nju.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
    }

    public final eqj h() {
        return lhj.a.a();
    }

    public final eqj i() {
        eqj eqjVarG = ((kwv) mki.a.i(kwv.class)).g();
        eqjVarG.getClass();
        return eqjVarG;
    }

    public final eqj j() {
        eqj eqjVarJ = ((kwv) mki.a.i(kwv.class)).j();
        eqj eqjVarF = mpm.f();
        afco afcoVar = tby.a;
        int i = 19;
        eqj eqjVarA = tby.a(eqjVarJ, eqy.b(eqjVarF, new nna(i)));
        eqj eqjVar = this.u;
        eqjVar.getClass();
        return tby.a(eqjVarA, eqy.b(eqjVar, new nna(i)));
    }

    public final sab k() {
        return (sab) this.t.a();
    }

    public final void l() {
        if (!lbh.d().gN()) {
            ((ype) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((ype) a.f()).u("executeIfStarted lifetime has started, executing logic");
        KeyEvent keyEvent = new KeyEvent(0L, SystemClock.uptimeMillis(), 0, 4, 0, 0, 0, 0, 4);
        KeyEvent keyEvent2 = new KeyEvent(0L, SystemClock.uptimeMillis(), 1, 4, 0, 0, 0, 0, 4);
        CarRegionId carRegionIdR = nsr.c().b().r(nsn.d);
        k().g(carRegionIdR, keyEvent);
        k().g(carRegionIdR, keyEvent2);
    }

    public final void m(int i) {
        if (!lbh.d().gN()) {
            ((ype) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((ype) a.f()).u("executeIfStarted lifetime has started, executing logic");
        kkk.a();
        t(i);
        s().i();
    }

    public final void n(int i) {
        if (!lbh.d().gN()) {
            ((ype) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((ype) a.f()).u("executeIfStarted lifetime has started, executing logic");
        kkk.a();
        t(i);
        s().fF();
    }

    public final void o(int i) {
        if (!lbh.d().gN()) {
            ((ype) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((ype) a.f()).u("executeIfStarted lifetime has started, executing logic");
        kkk.a();
        t(i);
        s().h();
    }

    public final void p(int i, kxa kxaVar, Context context, boolean z) {
        kxaVar.getClass();
        if (!acmd.z()) {
            ((ype) a.g()).u("Old robin model detected");
        }
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.RAIL, yzy.e);
        rrbVarH.A(i);
        ohsVarJ.F(rrbVarH.l());
        if (i == 2 && kxaVar == kxa.b) {
            a.l().u("Closing Assistant due to Assistant action");
            lau.c().j(ywk.RAIL_ICON_CLICKED);
        } else {
            a.l().u("Open Assistant due to Assistant action");
            lau.c().k(1);
        }
        if (!z || context == null || acmd.z() || !affa.f(i().e(), true) || this.s.nextDouble() >= acmd.g() || this.r >= acmd.n()) {
            return;
        }
        if (acmd.E()) {
            Uri uri = Uri.parse("http://goto.google.com/join-gemini-aap-dogfood");
            uri.getClass();
            u(context, "Join Gemini Dogfood for Android Auto", "Join Gemini Dogfood for Android Auto", "go/join-gemini-aap-dogfood", uri, R.id.ROBIN_NOTIFICATION_ID_DF);
        } else if (acmd.D()) {
            Uri uri2 = Uri.parse("http://goto.google.com/upgrade-aap-gemini-model-teamfood");
            uri2.getClass();
            u(context, "Please Upgrade Gemini Model", "Join Gemini Teamfood for latest Gemini Model", "go/upgrade-aap-gemini-model-teamfood", uri2, R.id.ROBIN_NOTIFICATION_ID_ALPHA);
        }
    }

    public final boolean q() {
        return ((kwv) mki.a.i(kwv.class)).J();
    }

    public final void r(Context context) {
        if (kgi.i()) {
            ngf.g().h(kgj.a);
            if (context == null) {
                throw new IllegalStateException("Required value was null.");
            }
            a.l().u("Sending a request for a bugreport");
            context.sendBroadcast(BugreporterReceiver.c("ORIGIN_LONG_PRESS", null));
            return;
        }
        ngf.g().h(ldi.a);
        a.l().u("Saving app feedback using FeedbackManager");
        mqc mqcVar = (mqc) this.i.e();
        mpz mpzVar = mqcVar != null ? mqcVar.b : mpz.a;
        lbl lblVarK = kzd.k();
        ohs ohsVarJ = ebf.j();
        int iOrdinal = mpzVar.ordinal();
        String strB = ohsVarJ.b(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 5 ? yzz.UNKNOWN_CONTEXT : yzz.OVERVIEW_FACET : yzz.MEDIA_FACET : yzz.PHONE_FACET : yzz.MAPS_FACET);
        strB.getClass();
        lblVarK.a(context, strB);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.RAIL, yzy.eN).l());
    }

    public njw() {
        this(null);
    }
}
