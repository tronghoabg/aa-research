package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lds implements oip {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lds(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void a(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        defpackage.zae zaeVar;
        defpackage.zhs zhsVarF;
        if (this.b == 0) {
            defpackage.zae zaeVar2 = telemetryEvent.b.p;
            if (zaeVar2 == null) {
                zaeVar2 = defpackage.zae.a;
            }
            defpackage.zbg zbgVar = telemetryEvent.b.o;
            if (zbgVar == null) {
                zbgVar = defpackage.zbg.a;
            }
            java.lang.Object obj = this.a;
            int i = telemetryEvent.b.b;
            boolean z = (i & 8192) != 0;
            boolean z2 = (i & 4096) != 0;
            if ((z && zaeVar2.d == 251) || (z2 && zbgVar.d == 300)) {
                ((defpackage.ldt) obj).g();
                return;
            }
            if ((z && zaeVar2.d == 252) || (z2 && zbgVar.d == 321)) {
                ((defpackage.yqj) defpackage.ldt.a.l().ai((char) 3770)).u("Stopping FeedbackNotificationManager session.");
                defpackage.ldt ldtVar = (defpackage.ldt) obj;
                ldtVar.e = false;
                ldtVar.c.postDelayed(ldtVar.h, defpackage.ldt.b);
                ldtVar.f = true;
                return;
            }
            return;
        }
        defpackage.yyg yygVar = telemetryEvent.b;
        yygVar.getClass();
        byte[] bArr = null;
        if ((yygVar.b & 8192) != 0) {
            zaeVar = yygVar.p;
            if (zaeVar == null) {
                zaeVar = defpackage.zae.a;
            }
        } else {
            zaeVar = null;
        }
        if (zaeVar != null) {
            java.lang.Object obj2 = this.a;
            int i2 = zaeVar.d;
            if (i2 == 251) {
                defpackage.lcv.b.l().u("Starting lifetime");
                ((defpackage.lcv) obj2).e.clear();
                return;
            }
            if (i2 != 252) {
                return;
            }
            defpackage.lcv.b.l().u("Ending lifetime");
            defpackage.lcv lcvVar = (defpackage.lcv) obj2;
            defpackage.ldf ldfVar = lcvVar.d;
            defpackage.yhx yhxVarAy = defpackage.ysr.ay(lcvVar.e);
            defpackage.kmu kmuVar = new defpackage.kmu(19);
            defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
            java.util.Iterator<E> it = yhxVarAy.iterator();
            while (it.hasNext()) {
                defpackage.jzl.g((defpackage.lby) it.next(), defpackage.zbd.Ga);
            }
            if (defpackage.acqn.f().length() > 0) {
                new defpackage.kzz(yhxVarAy, kmuVar, 5, bArr).run();
                return;
            }
            defpackage.ldf.b.l().u("Proof mode survey empty");
            defpackage.ldd lddVar = ldfVar.d;
            if (yhxVarAy.isEmpty()) {
                zhsVarF = defpackage.ysr.cp(defpackage.afcg.a);
            } else if (defpackage.acqq.c()) {
                int i3 = 10;
                zhsVarF = defpackage.zgh.f(lddVar.e.D(), new defpackage.iku(new defpackage.kwz(yhxVarAy, i3), i3), zgtVar);
            } else {
                zhsVarF = defpackage.zgh.f(lddVar.d.c(), new defpackage.iku(new defpackage.kwz(yhxVarAy, 8), 11), zgtVar);
            }
            defpackage.ysr.cy(zhsVarF, new defpackage.ozs((defpackage.affc) kmuVar, ldfVar, (java.util.Set) yhxVarAy, 1), zgtVar);
        }
    }
}
