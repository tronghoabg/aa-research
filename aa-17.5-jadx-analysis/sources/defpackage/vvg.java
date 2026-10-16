package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class vvg implements zfj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vvg(vtd vtdVar, AtomicInteger atomicInteger, int i, int i2) {
        this.d = i2;
        this.b = vtdVar;
        this.c = atomicInteger;
        this.a = i;
    }

    @Override // defpackage.zfj
    public final zgp a() {
        if (this.d != 0) {
            if (((AtomicInteger) this.c).getAndDecrement() <= 0) {
                return zgl.a;
            }
            int i = this.a;
            vtd vtdVar = (vtd) this.b;
            return vtdVar.q(i, (vso) vtdVar.b.a());
        }
        final vvj vvjVar = (vvj) this.b;
        vuz vuzVar = (vuz) vvjVar.c.a();
        final int i2 = this.a;
        final vyk vykVarE = i2 != 7 ? vuzVar.c() ? vyk.a : vyk.b : vvjVar.d.e(null);
        if (vykVarE.f()) {
            return zgl.a;
        }
        if (vuzVar.c) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        Object obj = this.c;
        xxh xxhVar = vuzVar.b;
        zgj zgjVarV = zgj.v(zgl.a);
        kpi kpiVar = new kpi(8);
        zgt zgtVar = vvjVar.a;
        zgj zgjVarU = zgjVarV.u(RuntimeException.class, kpiVar, zgtVar);
        final String str = (String) obj;
        zfk zfkVar = new zfk() { // from class: vvi
            @Override // defpackage.zfk
            public final zgp a(Object obj2) {
                ActivityManager.MemoryInfo memoryInfo;
                vvo vvoVar;
                boolean z;
                ajey ajeyVar = (ajey) obj2;
                abnp abnpVarN = ajgu.a.n();
                vvj vvjVar2 = vvjVar;
                int iMyPid = Process.myPid();
                vvp vvpVar = vvjVar2.e;
                xyc xycVarL = wub.L(new vks(vvpVar, 7));
                Object objA = vvpVar.a.a();
                wer.b();
                if (((vuz) objA).d) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    Context context = vvpVar.b;
                    if (vqs.a == null) {
                        synchronized (vqs.class) {
                            if (vqs.a == null) {
                                Object systemService = context.getSystemService("activity");
                                systemService.getClass();
                                vqs.a = (ActivityManager) systemService;
                            }
                        }
                    }
                    vqs.a.getMemoryInfo(memoryInfo);
                } else {
                    memoryInfo = null;
                }
                String strD = vvp.d(((Boolean) vvpVar.c.a()).booleanValue() ? String.valueOf(iMyPid) : "self", "status", false);
                if (strD == null) {
                    vvoVar = null;
                } else if (strD.isEmpty()) {
                    ((ynz) ((ynz) vlj.a.h()).ai((char) 9839)).u("Null or empty proc status");
                    vvoVar = null;
                } else {
                    vvoVar = new vvo();
                    vvoVar.f = vvp.c(vvo.a, strD);
                    vvoVar.g = vvp.c(vvo.b, strD);
                    vvoVar.h = vvp.c(vvo.c, strD);
                    vvoVar.i = vvp.c(vvo.d, strD);
                    vvoVar.j = vvp.c(vvo.e, strD);
                }
                vvn vvnVar = new vvn(vvp.b(vvp.d(String.valueOf(iMyPid), "dmabuf_rss", true)), vvp.b(vvp.d(String.valueOf(iMyPid), "dmabuf_rss_hwm", true)), vvp.b(vvp.d(String.valueOf(iMyPid), "dmabuf_pss", true)));
                abnp abnpVarN2 = ajfe.a.n();
                abnp abnpVarN3 = ajfd.a.n();
                abnp abnpVarN4 = ajfb.a.n();
                if (memoryInfo != null) {
                    long j = memoryInfo.availMem >> 10;
                    abnpVarN4.t();
                    ajfb ajfbVar = (ajfb) abnpVarN4.b;
                    z = true;
                    ajfbVar.b |= 131072;
                    ajfbVar.r = (int) j;
                    long j2 = memoryInfo.totalMem >> 20;
                    abnpVarN4.t();
                    ajfb ajfbVar2 = (ajfb) abnpVarN4.b;
                    ajfbVar2.b |= 262144;
                    ajfbVar2.s = (int) j2;
                } else {
                    z = true;
                }
                if (vvoVar != null) {
                    Long l = vvoVar.f;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        abnpVarN4.t();
                        ajfb ajfbVar3 = (ajfb) abnpVarN4.b;
                        ajfbVar3.b |= 524288;
                        ajfbVar3.t = jLongValue;
                    }
                    Long l2 = vvoVar.g;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        abnpVarN4.t();
                        ajfb ajfbVar4 = (ajfb) abnpVarN4.b;
                        ajfbVar4.b |= 1048576;
                        ajfbVar4.u = jLongValue2;
                    }
                    Long l3 = vvoVar.h;
                    if (l3 != null) {
                        long jLongValue3 = l3.longValue();
                        abnpVarN4.t();
                        ajfb ajfbVar5 = (ajfb) abnpVarN4.b;
                        ajfbVar5.b |= 2097152;
                        ajfbVar5.v = jLongValue3;
                    }
                    Long l4 = vvoVar.i;
                    if (l4 != null) {
                        long jLongValue4 = l4.longValue();
                        abnpVarN4.t();
                        ajfb ajfbVar6 = (ajfb) abnpVarN4.b;
                        ajfbVar6.b |= 4194304;
                        ajfbVar6.w = jLongValue4;
                    }
                    Long l5 = vvoVar.j;
                    if (l5 != null) {
                        long jLongValue5 = l5.longValue();
                        abnpVarN4.t();
                        ajfb ajfbVar7 = (ajfb) abnpVarN4.b;
                        ajfbVar7.b |= 8388608;
                        ajfbVar7.x = jLongValue5;
                    }
                }
                Long l6 = vvnVar.a;
                if (l6 != null) {
                    long jLongValue6 = l6.longValue();
                    abnpVarN4.t();
                    ajfb ajfbVar8 = (ajfb) abnpVarN4.b;
                    ajfbVar8.b |= 16777216;
                    ajfbVar8.y = jLongValue6;
                }
                Long l7 = vvnVar.b;
                if (l7 != null) {
                    long jLongValue7 = l7.longValue();
                    abnpVarN4.t();
                    ajfb ajfbVar9 = (ajfb) abnpVarN4.b;
                    ajfbVar9.b |= 33554432;
                    ajfbVar9.z = jLongValue7;
                }
                Long l8 = vvnVar.c;
                if (l8 != null) {
                    long jLongValue8 = l8.longValue();
                    abnpVarN4.t();
                    ajfb ajfbVar10 = (ajfb) abnpVarN4.b;
                    ajfbVar10.b |= 67108864;
                    ajfbVar10.A = jLongValue8;
                }
                ajfb ajfbVar11 = (ajfb) abnpVarN4.q();
                abnpVarN3.t();
                ajfd ajfdVar = (ajfd) abnpVarN3.b;
                ajfbVar11.getClass();
                ajfdVar.c = ajfbVar11;
                ajfdVar.b |= 1;
                abnpVarN2.t();
                ajfe ajfeVar = (ajfe) abnpVarN2.b;
                ajfd ajfdVar2 = (ajfd) abnpVarN3.q();
                ajfdVar2.getClass();
                ajfeVar.c = ajfdVar2;
                ajfeVar.b |= 1;
                abnp abnpVarN5 = ajfx.a.n();
                ajfw ajfwVarB = ((Boolean) vvpVar.d.a()).booleanValue() ? vvpVar.e.B(iMyPid, xycVarL) : vvpVar.e.B(Process.myPid(), xycVarL);
                String str2 = str;
                int i3 = i2;
                abnpVarN5.t();
                ajfx ajfxVar = (ajfx) abnpVarN5.b;
                ajfwVarB.getClass();
                ajfxVar.c = ajfwVarB;
                ajfxVar.b |= 1;
                abnpVarN2.t();
                ajfe ajfeVar2 = (ajfe) abnpVarN2.b;
                ajfx ajfxVar2 = (ajfx) abnpVarN5.q();
                ajfxVar2.getClass();
                ajfeVar2.d = ajfxVar2;
                ajfeVar2.b |= 2;
                abnp abnpVarN6 = ajfc.a.n();
                Context context2 = vvpVar.b;
                ActivityManager activityManager = vqs.a;
                Object systemService2 = context2.getSystemService("power");
                systemService2.getClass();
                boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
                abnpVarN6.t();
                ajfc ajfcVar = (ajfc) abnpVarN6.b;
                ajfcVar.b |= 1;
                ajfcVar.c = zIsInteractive;
                abnpVarN2.t();
                ajfe ajfeVar3 = (ajfe) abnpVarN2.b;
                ajfc ajfcVar2 = (ajfc) abnpVarN6.q();
                ajfcVar2.getClass();
                ajfeVar3.f = ajfcVar2;
                ajfeVar3.b |= 8;
                abnpVarN2.t();
                ajfe ajfeVar4 = (ajfe) abnpVarN2.b;
                ajfeVar4.e = i3 - 1;
                ajfeVar4.b |= 4;
                if (str2 != null) {
                    abnpVarN2.t();
                    ajfe ajfeVar5 = (ajfe) abnpVarN2.b;
                    ajfeVar5.b |= 16;
                    ajfeVar5.g = str2;
                }
                vyk vykVar = vykVarE;
                ajfe ajfeVar6 = (ajfe) abnpVarN2.q();
                abnpVarN.t();
                ajgu ajguVar = (ajgu) abnpVarN.b;
                ajfeVar6.getClass();
                ajguVar.f = ajfeVar6;
                ajguVar.b |= 8;
                ajgu ajguVar2 = (ajgu) abnpVarN.q();
                vrt vrtVarA = vru.a();
                vrtVarA.a = null;
                boolean z2 = z;
                vrtVarA.d(z2);
                vrtVarA.d = vykVar;
                vrtVarA.g(ajguVar2);
                vrtVarA.b = ajeyVar;
                if (i3 != 7) {
                    vrtVarA.e(z2);
                }
                return vvjVar2.d.a(vrtVarA.a());
            }
        };
        int i3 = zfb.c;
        zez zezVar = new zez(zgjVarU, zfkVar);
        zgjVarU.c(zezVar, yrm.aK(zgtVar, zezVar));
        return zezVar;
    }

    public /* synthetic */ vvg(vvj vvjVar, int i, String str, int i2) {
        this.d = i2;
        this.b = vvjVar;
        this.a = i;
        this.c = str;
    }
}
