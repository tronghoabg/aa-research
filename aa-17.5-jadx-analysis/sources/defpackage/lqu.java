package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import j$.time.Duration;
import j$.time.ZoneId;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class lqu extends lhf implements mnd {
    public static final yph a = yph.c("GH.MediaAutoplayManager");
    static final Duration b = Duration.ofSeconds(30);
    static final Duration c = Duration.ofSeconds(2);
    static final Duration d = Duration.ofSeconds(2);
    static final Duration e = Duration.ofSeconds(5);
    static final Duration f = Duration.ofMillis((int) acsx.b());
    public final lqh g;
    public lqn h;
    private final Context i;
    private final eqj k;
    private final lql l;
    private final lqg m;
    private eqj n;
    private eqj o;
    private eqn p;
    private eqn q;

    public lqu(Context context) {
        this.i = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("media_autoplay_manager", 0);
        this.g = new lqh(sharedPreferences);
        this.l = new lql(context, sharedPreferences);
        this.k = lgx.b().a(mpz.d);
        this.m = new lqg();
    }

    public static lqu a() {
        return (lqu) mki.a.b(lqu.class, new lpu(3));
    }

    private static eqj f(eqj eqjVar, Duration duration) {
        return new lqf(eqjVar, new kxo(14), duration, false);
    }

    public final void b() {
        eqn eqnVar;
        eqj eqjVar = this.o;
        if (eqjVar != null && (eqnVar = this.p) != null) {
            eqjVar.k(eqnVar);
            this.o = null;
            this.p = null;
        }
        eqn eqnVar2 = this.q;
        if (eqnVar2 != null) {
            this.k.k(eqnVar2);
            this.q = null;
        }
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        yzy yzyVar;
        super.c();
        mnc.a().b(mnb.e, this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gearhead.autoplay.ACTION_DISABLE_AUTOPLAY");
        intentFilter.addAction("com.google.android.gearhead.autoplay.ACTION_KEEP_ON_AUTOPLAY");
        int i = 4;
        if (acsx.y()) {
            ((ype) ((ype) a.f()).ai((char) 4205)).u("displayDisableAutoplayNotificationEnabled flag is true");
            dup.e(this.i, this.m, intentFilter, null, 4);
        }
        lqh lqhVar = this.g;
        lqd lqdVar = ((lqe) lqhVar.get()).a;
        ComponentName componentName = ((lqe) lqhVar.get()).b;
        yph yphVar = a;
        ((ype) yphVar.l().ai(4204)).M("AutoplayManager#start triggerTarget=%s triggerDecision=%s", componentName, lqdVar);
        int iOrdinal = lqdVar.ordinal();
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        if (iOrdinal == 0) {
            yzyVar = yzy.ga;
        } else if (iOrdinal == 1) {
            yzyVar = yzy.ge;
        } else if (iOrdinal == 2) {
            yzyVar = yzy.gf;
        } else if (iOrdinal == 3) {
            yzyVar = yzy.gd;
        } else {
            if (iOrdinal != 4) {
                throw new RuntimeException(null, null);
            }
            yzyVar = yzy.gc;
        }
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.MEDIA_AUTOPLAY;
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzyVar);
        if (componentName != null) {
            rrbVarH.p(componentName);
        }
        ebf.j().F(rrbVarH.l());
        int i5 = 0;
        if (lqdVar.a()) {
            ebf.j().F(olm.e(acai.E).l());
            rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.gi);
            if (componentName != null) {
                rrbVarH2.p(componentName);
            }
            ebf.j().F(rrbVarH2.l());
        }
        if (!nto.a().b()) {
            ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.gb).l());
            ((ype) yphVar.l().ai((char) 4203)).u("No internet");
        }
        lql lqlVar = this.l;
        boolean zA = lqdVar.a();
        lqlVar.d.edit().remove("was_any_playback_interval_over_threshold").apply();
        lqlVar.i = zA;
        lqlVar.l = new gjv((xyi) oit.a().b);
        lqlVar.k = false;
        eqj eqjVar = this.k;
        eqj eqjVarC = tby.C(tby.v(tby.C(eqjVar, new lmv(20)), new lqc(i4)), new lqc(i5));
        eqj eqjVarV = tby.v(new ody(this.i), new oin(1));
        eqj eqjVarE = tby.e(eqjVarC, eqjVarV, lau.c().i(), new kuv(7));
        this.n = eqjVarE;
        eqjVarE.fE(this, lqlVar);
        if (!lqdVar.a() || componentName == null) {
            return;
        }
        eqj eqjVarF = loy.j().f(componentName);
        eql eqlVar = new eql();
        eqlVar.r(eqjVarF, new lrd(eqlVar, 1));
        eqj eqjVarD = tby.d(eqlVar, new lqf(eqjVarV, new kxo(13), d, false), new kuu(13));
        eqj eqjVarV2 = tby.v(eqjVarD, new lqc(i2));
        this.o = tby.e(lmi.a().e() ? tby.v(lrw.a().c, new lpx(componentName, i3)) : new eqm(false), eqjVarD, tby.e(f(eqjVarV2, e), f(tby.v(eqjVarD, new lqc(i3)), f), tby.a(f(tby.c, b), f(eqjVarV2, c)), new kuv(8)), new kuv(6));
        lqq lqqVar = new lqq(new ajmd(this));
        if (acsx.y()) {
            lqlVar.j = lqqVar;
        }
        this.p = lqqVar;
        eqj eqjVar2 = this.o;
        if (eqjVar2 != null) {
            eqjVar2.fE(this, lqqVar);
            this.h = lqqVar;
            jue jueVar = new jue(this, componentName, i);
            this.q = jueVar;
            eqjVar.fE(this, jueVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0237  */
    @Override // defpackage.lhf, defpackage.lhg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqu.d():void");
    }

    public final void e(PrintWriter printWriter) {
        printWriter.println("## Autoplay Intent");
        printWriter.print("Autoplay trigger decision: ");
        lqh lqhVar = this.g;
        printWriter.println(((lqe) lqhVar.get()).a);
        printWriter.print("Autoplay trigger target: ");
        printWriter.println(((lqe) lqhVar.get()).b);
        printWriter.println();
        lqn lqnVar = this.h;
        if (lqnVar != null) {
            printWriter.println("## Autoplay Trigger History");
            for (lqo lqoVar : ((lqq) lqnVar).c) {
                printWriter.printf("%s: %s signal=%s\n", lqoVar.a.atZone((ZoneId) oit.a().a).toLocalDateTime(), lqoVar.b, lqoVar.c);
            }
            printWriter.println();
        }
        lql lqlVar = this.l;
        printWriter.println("## Autoplay Persistence History");
        for (lqk lqkVar : lqlVar.f) {
            printWriter.printf("%s: %s = %s\n", lqkVar.a.atZone((ZoneId) oit.a().a).toLocalDateTime(), lqkVar.b, Boolean.valueOf(lqkVar.c));
        }
        printWriter.println();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        e(printWriter);
        mnn.a(this.i, "media_autoplay", printWriter);
    }
}
