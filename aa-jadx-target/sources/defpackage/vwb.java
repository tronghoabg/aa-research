package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vwb implements defpackage.zgm {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vwb(defpackage.vtz vtzVar, java.util.concurrent.atomic.AtomicInteger atomicInteger, int i, int i2) {
        this.d = i2;
        this.b = vtzVar;
        this.c = atomicInteger;
        this.a = i;
    }

    @Override // defpackage.zgm
    public final defpackage.zhs a() {
        final defpackage.vzf vzfVarE;
        if (this.d != 0) {
            if (((java.util.concurrent.atomic.AtomicInteger) this.c).getAndDecrement() <= 0) {
                return defpackage.zho.a;
            }
            int i = this.a;
            defpackage.vtz vtzVar = (defpackage.vtz) this.b;
            return vtzVar.q(i, (defpackage.vtk) vtzVar.b.a());
        }
        final defpackage.vwe vweVar = (defpackage.vwe) this.b;
        defpackage.vvu vvuVar = (defpackage.vvu) vweVar.c.a();
        final int i2 = this.a;
        if (i2 != 7) {
            vzfVarE = vvuVar.c() ? defpackage.vzf.a : defpackage.vzf.b;
        } else {
            vzfVarE = vweVar.d.e(null);
        }
        if (vzfVarE.f()) {
            return defpackage.zho.a;
        }
        if (vvuVar.c) {
            java.lang.System.gc();
            java.lang.System.runFinalization();
            java.lang.System.gc();
        }
        java.lang.Object obj = this.c;
        defpackage.xyn xynVar = vvuVar.b;
        defpackage.zhm zhmVarV = defpackage.zhm.v(defpackage.zho.a);
        defpackage.kpo kpoVar = new defpackage.kpo(8);
        defpackage.zhw zhwVar = vweVar.a;
        defpackage.zhm zhmVarU = zhmVarV.u(java.lang.RuntimeException.class, kpoVar, zhwVar);
        final java.lang.String str = (java.lang.String) obj;
        defpackage.zgn zgnVar = new defpackage.zgn() { // from class: vwd
            /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
            @Override // defpackage.zgn
            public final defpackage.zhs a(java.lang.Object obj2) throws wfo {
                android.app.ActivityManager.MemoryInfo memoryInfo;
                defpackage.vwj vwjVar;
                ajfx ajfxVar = (ajfx) obj2;
                defpackage.abor aborVarN = ajht.a.n();
                defpackage.vwe vweVar2 = vweVar;
                int iMyPid = android.os.Process.myPid();
                defpackage.vwk vwkVar = vweVar2.e;
                defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.ryo(vwkVar, 8));
                java.lang.Object objA = vwkVar.a.a();
                defpackage.wfp.b();
                if (((defpackage.vvu) objA).d) {
                    memoryInfo = new android.app.ActivityManager.MemoryInfo();
                    android.content.Context context = vwkVar.b;
                    if (defpackage.vrn.a == null) {
                        synchronized (defpackage.vrn.class) {
                            if (defpackage.vrn.a == null) {
                                java.lang.Object systemService = context.getSystemService("activity");
                                systemService.getClass();
                                defpackage.vrn.a = (android.app.ActivityManager) systemService;
                            }
                        }
                    }
                    defpackage.vrn.a.getMemoryInfo(memoryInfo);
                } else {
                    memoryInfo = null;
                }
                java.lang.String strD = defpackage.vwk.d(((java.lang.Boolean) vwkVar.c.a()).booleanValue() ? java.lang.String.valueOf(iMyPid) : "self", "status", false);
                if (strD == null) {
                    vwjVar = null;
                } else if (strD.isEmpty()) {
                    ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9867)).u("Null or empty proc status");
                    vwjVar = null;
                } else {
                    vwjVar = new defpackage.vwj();
                    vwjVar.f = defpackage.vwk.c(defpackage.vwj.a, strD);
                    vwjVar.g = defpackage.vwk.c(defpackage.vwj.b, strD);
                    vwjVar.h = defpackage.vwk.c(defpackage.vwj.c, strD);
                    vwjVar.i = defpackage.vwk.c(defpackage.vwj.d, strD);
                    vwjVar.j = defpackage.vwk.c(defpackage.vwj.e, strD);
                }
                defpackage.vwi vwiVar = new defpackage.vwi(defpackage.vwk.b(defpackage.vwk.d(java.lang.String.valueOf(iMyPid), "dmabuf_rss", true)), defpackage.vwk.b(defpackage.vwk.d(java.lang.String.valueOf(iMyPid), "dmabuf_rss_hwm", true)), defpackage.vwk.b(defpackage.vwk.d(java.lang.String.valueOf(iMyPid), "dmabuf_pss", true)));
                defpackage.abor aborVarN2 = ajgd.a.n();
                defpackage.abor aborVarN3 = ajgc.a.n();
                defpackage.abor aborVarN4 = ajga.a.n();
                if (memoryInfo != null) {
                    long j = memoryInfo.availMem >> 10;
                    aborVarN4.t();
                    ajga ajgaVar = aborVarN4.b;
                    ajgaVar.b |= 131072;
                    ajgaVar.r = (int) j;
                    long j2 = memoryInfo.totalMem >> 20;
                    aborVarN4.t();
                    ajga ajgaVar2 = aborVarN4.b;
                    ajgaVar2.b |= 262144;
                    ajgaVar2.s = (int) j2;
                }
                if (vwjVar != null) {
                    java.lang.Long l = vwjVar.f;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        aborVarN4.t();
                        ajga ajgaVar3 = aborVarN4.b;
                        ajgaVar3.b |= 524288;
                        ajgaVar3.t = jLongValue;
                    }
                    java.lang.Long l2 = vwjVar.g;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        aborVarN4.t();
                        ajga ajgaVar4 = aborVarN4.b;
                        ajgaVar4.b |= 1048576;
                        ajgaVar4.u = jLongValue2;
                    }
                    java.lang.Long l3 = vwjVar.h;
                    if (l3 != null) {
                        long jLongValue3 = l3.longValue();
                        aborVarN4.t();
                        ajga ajgaVar5 = aborVarN4.b;
                        ajgaVar5.b |= 2097152;
                        ajgaVar5.v = jLongValue3;
                    }
                    java.lang.Long l4 = vwjVar.i;
                    if (l4 != null) {
                        long jLongValue4 = l4.longValue();
                        aborVarN4.t();
                        ajga ajgaVar6 = aborVarN4.b;
                        ajgaVar6.b |= 4194304;
                        ajgaVar6.w = jLongValue4;
                    }
                    java.lang.Long l5 = vwjVar.j;
                    if (l5 != null) {
                        long jLongValue5 = l5.longValue();
                        aborVarN4.t();
                        ajga ajgaVar7 = aborVarN4.b;
                        ajgaVar7.b |= 8388608;
                        ajgaVar7.x = jLongValue5;
                    }
                }
                java.lang.Long l6 = vwiVar.a;
                if (l6 != null) {
                    long jLongValue6 = l6.longValue();
                    aborVarN4.t();
                    ajga ajgaVar8 = aborVarN4.b;
                    ajgaVar8.b |= 16777216;
                    ajgaVar8.y = jLongValue6;
                }
                java.lang.Long l7 = vwiVar.b;
                if (l7 != null) {
                    long jLongValue7 = l7.longValue();
                    aborVarN4.t();
                    ajga ajgaVar9 = aborVarN4.b;
                    ajgaVar9.b |= 33554432;
                    ajgaVar9.z = jLongValue7;
                }
                java.lang.Long l8 = vwiVar.c;
                if (l8 != null) {
                    long jLongValue8 = l8.longValue();
                    aborVarN4.t();
                    ajga ajgaVar10 = aborVarN4.b;
                    ajgaVar10.b |= 67108864;
                    ajgaVar10.A = jLongValue8;
                }
                ajga ajgaVarQ = aborVarN4.q();
                aborVarN3.t();
                ajgc ajgcVar = aborVarN3.b;
                ajgaVarQ.getClass();
                ajgcVar.c = ajgaVarQ;
                ajgcVar.b |= 1;
                aborVarN2.t();
                ajgd ajgdVar = aborVarN2.b;
                ajgc ajgcVarQ = aborVarN3.q();
                ajgcVarQ.getClass();
                ajgdVar.c = ajgcVarQ;
                ajgdVar.b |= 1;
                defpackage.abor aborVarN5 = ajgw.a.n();
                ajgv ajgvVarB = ((java.lang.Boolean) vwkVar.d.a()).booleanValue() ? vwkVar.e.B(iMyPid, xziVarAQ) : vwkVar.e.B(android.os.Process.myPid(), xziVarAQ);
                java.lang.String str2 = str;
                int i3 = i2;
                aborVarN5.t();
                ajgw ajgwVar = aborVarN5.b;
                ajgvVarB.getClass();
                ajgwVar.c = ajgvVarB;
                ajgwVar.b |= 1;
                aborVarN2.t();
                ajgd ajgdVar2 = aborVarN2.b;
                ajgw ajgwVarQ = aborVarN5.q();
                ajgwVarQ.getClass();
                ajgdVar2.d = ajgwVarQ;
                ajgdVar2.b |= 2;
                defpackage.abor aborVarN6 = ajgb.a.n();
                android.content.Context context2 = vwkVar.b;
                android.app.ActivityManager activityManager = defpackage.vrn.a;
                java.lang.Object systemService2 = context2.getSystemService("power");
                systemService2.getClass();
                boolean zIsInteractive = ((android.os.PowerManager) systemService2).isInteractive();
                aborVarN6.t();
                ajgb ajgbVar = aborVarN6.b;
                ajgbVar.b |= 1;
                ajgbVar.c = zIsInteractive;
                aborVarN2.t();
                ajgd ajgdVar3 = aborVarN2.b;
                ajgb ajgbVarQ = aborVarN6.q();
                ajgbVarQ.getClass();
                ajgdVar3.f = ajgbVarQ;
                ajgdVar3.b |= 8;
                aborVarN2.t();
                ajgd ajgdVar4 = aborVarN2.b;
                ajgdVar4.e = i3 - 1;
                ajgdVar4.b |= 4;
                if (str2 != null) {
                    aborVarN2.t();
                    ajgd ajgdVar5 = aborVarN2.b;
                    ajgdVar5.b |= 16;
                    ajgdVar5.g = str2;
                }
                defpackage.vzf vzfVar = vzfVarE;
                ajgd ajgdVarQ = aborVarN2.q();
                aborVarN.t();
                ajht ajhtVar = aborVarN.b;
                ajgdVarQ.getClass();
                ajhtVar.f = ajgdVarQ;
                ajhtVar.b |= 8;
                ajht ajhtVarQ = aborVarN.q();
                defpackage.vsp vspVarA = defpackage.vsq.a();
                vspVarA.a = null;
                vspVarA.d(true);
                vspVarA.d = vzfVar;
                vspVarA.g(ajhtVarQ);
                vspVarA.b = ajfxVar;
                if (i3 != 7) {
                    vspVarA.e(true);
                }
                return vweVar2.d.a(vspVarA.a());
            }
        };
        int i3 = defpackage.zgh.c;
        defpackage.zgf zgfVar = new defpackage.zgf(zhmVarU, zgnVar);
        zhmVarU.c(zgfVar, defpackage.ysr.ch(zhwVar, zgfVar));
        return zgfVar;
    }

    public /* synthetic */ vwb(defpackage.vwe vweVar, int i, java.lang.String str, int i2) {
        this.d = i2;
        this.b = vweVar;
        this.a = i;
        this.c = str;
    }
}
