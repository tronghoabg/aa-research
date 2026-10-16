package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zps {
    public static defpackage.zps a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public zps(android.content.Context context, byte[] bArr) {
        this.d = defpackage.ysr.aQ(new defpackage.upb(context, 8));
        byte[] bArr2 = null;
        this.c = defpackage.ysr.aQ(new defpackage.pmg(this, context, 11, bArr2));
        this.b = defpackage.ysr.aQ(new defpackage.pmg(this, context, 12, bArr2));
        defpackage.ysr.aQ(new defpackage.upb(context, 9));
    }

    public static synchronized void a(android.content.Context context) {
        if (a != null) {
            throw new java.lang.IllegalStateException("Context already configured");
        }
        a = new defpackage.zps(context);
    }

    public final void b(zjx zjxVar) {
        ((defpackage.ygr) this.c).i(zjxVar);
    }

    public final java.lang.IllegalArgumentException c() {
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.d;
        java.lang.Object obj3 = this.b;
        return new java.lang.IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    public final void d() {
        java.lang.Object obj = this.c;
        if (obj != null) {
            ((defpackage.wry) obj).c((android.view.View) this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wrx] */
    public final void e() {
        java.lang.Object obj = this.c;
        if (obj != null) {
            ((defpackage.wry) obj).b(this.b, (android.view.View) this.d, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01c9  */
    public final void f(com.google.android.libraries.surveys.internal.model.Answer answer, boolean z) {
        abzk abzkVar;
        java.lang.String strBv = defpackage.ysr.bv(answer.f);
        wis wisVarF = wii.a.d.F((android.content.Context) this.d, (java.lang.String) this.c, answer.b, strBv);
        defpackage.abor aborVarN = abzl.a.n();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - answer.d;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j = epochMilli / 1000;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
        long nanos = timeUnit2.toNanos(epochMilli - (1000 * j));
        defpackage.abor aborVarN2 = defpackage.aboh.a.n();
        aborVarN2.t();
        ((defpackage.aboh) aborVarN2.b).b = j;
        aborVarN2.t();
        ((defpackage.aboh) aborVarN2.b).c = (int) nanos;
        defpackage.aboh abohVar = (defpackage.aboh) aborVarN2.q();
        aborVarN.t();
        abzl abzlVar = aborVarN.b;
        abohVar.getClass();
        abzlVar.e = abohVar;
        abzlVar.b |= 1;
        int i = answer.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            java.lang.Object obj = this.b;
            if (((win) wil.a.e.get(((acaf) obj).b)) == win.a) {
                defpackage.abor aborVarN3 = abzk.a.n();
                aborVarN3.t();
                abzk abzkVar2 = aborVarN3.b;
                abzkVar2.c = defpackage.adrq.x(3);
                abzkVar2.b |= 1;
                abzkVar = (abzk) aborVarN3.q();
            } else {
                abzkVar = abzk.a;
            }
            aborVarN.t();
            abzl abzlVar2 = aborVarN.b;
            abzkVar.getClass();
            abzlVar2.d = abzkVar;
            abzlVar2.c = 2;
        } else if (i2 == 2) {
            defpackage.abor aborVarN4 = abzi.a.n();
            abzu abzuVar = answer.c;
            if (abzuVar != null) {
                if (!z) {
                    defpackage.abor aborVarK = abzuVar.K();
                    aborVarK.t();
                    abzu abzuVar2 = aborVarK.b;
                    abzuVar2.c = null;
                    abzuVar2.b &= -2;
                    abzuVar = (abzu) aborVarK.q();
                }
                aborVarN4.t();
                abzi abziVar = aborVarN4.b;
                abzuVar.getClass();
                abziVar.c = abzuVar;
                abziVar.b |= 2;
            }
            abzi abziVarQ = aborVarN4.q();
            aborVarN.t();
            abzl abzlVar3 = aborVarN.b;
            abziVarQ.getClass();
            abzlVar3.d = abziVarQ;
            abzlVar3.c = 3;
        } else if (i2 == 3) {
            defpackage.abor aborVarN5 = abzb.a.n();
            boolean z2 = answer.e;
            aborVarN5.t();
            aborVarN5.b.b = z2;
            abzb abzbVarQ = aborVarN5.q();
            aborVarN.t();
            abzl abzlVar4 = aborVarN.b;
            abzbVarQ.getClass();
            abzlVar4.d = abzbVarQ;
            abzlVar4.c = 4;
        } else if (i2 == 4) {
            abzh abzhVar = answer.a;
            aborVarN.t();
            abzl abzlVar5 = aborVarN.b;
            abzhVar.getClass();
            abzlVar5.d = abzhVar;
            abzlVar5.c = 5;
        } else if (i2 != 5) {
            android.util.Log.e("SurveyAnswerTransmitter", "Invalid survey answer type specified.");
        } else {
            abzj abzjVar = abzj.a;
            aborVarN.t();
            abzl abzlVar6 = aborVarN.b;
            abzjVar.getClass();
            abzlVar6.d = abzjVar;
            abzlVar6.c = 6;
        }
        java.lang.Object obj2 = this.b;
        long j2 = wjc.a;
        if (obj2 != null) {
            acaf acafVar = (acaf) obj2;
            if (acafVar.b.isEmpty() || acafVar.c.B()) {
                android.util.Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
            } else {
                defpackage.abor aborVarN6 = abyk.a.n();
                aborVarN6.t();
                abyk abykVar = aborVarN6.b;
                abykVar.d = acafVar;
                abykVar.b |= 2;
                abzl abzlVarQ = aborVarN.q();
                aborVarN6.t();
                abyk abykVar2 = aborVarN6.b;
                abzlVarQ.getClass();
                abykVar2.c = abzlVarQ;
                abykVar2.b |= 1;
                abyk abykVarQ = aborVarN6.q();
                wjb wjbVar = new wjb();
                if (abykVarQ == null) {
                    android.util.Log.e("NetworkCallerGrpc", "Survey record event request was null");
                } else {
                    wip.a().execute(new wiq(wisVarF, abykVarQ, wjbVar));
                }
            }
        } else {
            android.util.Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
        }
        answer.a = abzh.a;
        answer.g = 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xzi] */
    public final java.lang.String g() {
        return (java.lang.String) this.d.fF();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.zhs h() {
        return defpackage.zgh.f(this.b, new rha(new xbg(1), 6), this.d);
    }

    public zps(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public zps(wrx wrxVar, android.view.View view) {
        this.c = android.os.Build.VERSION.SDK_INT >= 34 ? new wsa() : android.os.Build.VERSION.SDK_INT >= 33 ? new defpackage.wry() : null;
        this.b = wrxVar;
        this.d = view;
    }

    public zps(android.content.Context context, defpackage.zhv zhvVar) {
        context.getClass();
        this.c = context;
        this.d = zhvVar;
        defpackage.zhs zhsVarSubmit = zhvVar.submit(new defpackage.fma(this, 19));
        zhsVarSubmit.getClass();
        this.b = zhsVarSubmit;
    }

    public zps(java.lang.String str) {
        int i = defpackage.ygw.d;
        this.c = new defpackage.ygr(4);
        this.b = new defpackage.ygr(4);
        this.d = str;
    }

    private zps(android.content.Context context) {
        this.b = new zqa();
        zpy zpyVar = new zpy(context.getAssets());
        this.c = zpyVar;
        this.d = new defpackage.zzx(new odn((short[]) null), (zpd) zpyVar);
        new zsi(zpyVar, zqe.d());
        new zsi(zpyVar, zqe.c());
    }

    public zps(android.content.Context context, java.lang.String str, acaf acafVar) {
        this.d = context;
        this.c = str;
        this.b = acafVar;
    }
}
