package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vxe extends vxc implements vsa, vwt {
    public final vry a;
    final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ackk c;
    public final ackk d;
    public final xyc e;
    public final aezk f;
    private final Executor g;

    public vxe(wci wciVar, Executor executor, ackk ackkVar, ackk ackkVar2, aezk aezkVar, aezk aezkVar2, rod rodVar) {
        this.a = wciVar.d(zfq.a, ackkVar, aezkVar);
        this.g = executor;
        this.c = ackkVar;
        this.d = ackkVar2;
        this.f = aezkVar2;
        this.e = wub.L(new jbk(rodVar, ackkVar, 9, null));
    }

    private final synchronized void f(vxb vxbVar, String str) {
        if (vxb.d(vxbVar)) {
            zgp zgpVar = zgl.a;
            return;
        }
        vry vryVar = this.a;
        vyk vykVarE = vryVar.e(str);
        int iD = vryVar.d();
        if (vykVarE.f()) {
            zgp zgpVar2 = zgl.a;
            return;
        }
        vxbVar.c();
        vxbVar.b = 1;
        if (!vxb.d(vxbVar) && !woy.am(str)) {
            h(str, vykVarE, iD, vxbVar);
            return;
        }
        new zhc(new IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
    }

    private final synchronized void g(String str, String str2, int i) {
        vxb vxbVar = (vxb) this.b.remove(str);
        if (vxb.d(vxbVar)) {
            zgp zgpVar = zgl.a;
            return;
        }
        vry vryVar = this.a;
        vyk vykVarE = vryVar.e(str);
        int iD = vryVar.d();
        if (vykVarE.f()) {
            zgp zgpVar2 = zgl.a;
            return;
        }
        vxbVar.c();
        vxbVar.b = i;
        vxbVar.a();
        vxbVar.b();
        if (true != woy.am(str2)) {
            str = str2;
        }
        h(str, vykVarE, iD, vxbVar);
    }

    private final void h(final String str, final vyk vykVar, final int i, final vxb vxbVar) {
        this.g.execute(new zhk(new zfj() { // from class: vxd
            @Override // defpackage.zfj
            public final zgp a() {
                vxe vxeVar = this.a;
                if (!((vya) vxeVar.e.gu()).a()) {
                    ((ynz) ((ynz) vlj.a.e()).ai((char) 9877)).u("TimerMetric not recorded, metric was rejected by sampling configuration.");
                    return zgl.a;
                }
                vyk vykVar2 = vykVar;
                vxb vxbVar2 = vxbVar;
                xxh xxhVar = ((vxa) vxeVar.c.a()).b;
                vrt vrtVarA = vru.a();
                vrtVarA.d(true);
                vrtVarA.d = vykVar2;
                xxh xxhVar2 = (xxh) vxeVar.d.a();
                abnp abnpVarN = ajgu.a.n();
                boolean zBooleanValue = ((Boolean) xxhVar2.a(new kpi(10)).d(false)).booleanValue();
                abnp abnpVarN2 = ajgv.a.n();
                long jB = zBooleanValue ? vxbVar2.b() : vxbVar2.a();
                abnpVarN2.t();
                ajgv ajgvVar = (ajgv) abnpVarN2.b;
                ajgvVar.b |= 1;
                ajgvVar.c = jB;
                int i2 = vxbVar2.b;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? 4 : 3 : 2 : 1;
                    abnpVarN2.t();
                    ajgv ajgvVar2 = (ajgv) abnpVarN2.b;
                    ajgvVar2.d = i4 - 1;
                    ajgvVar2.b = 2 | ajgvVar2.b;
                }
                String str2 = str;
                ajgv ajgvVar3 = (ajgv) abnpVarN2.q();
                abnpVarN.t();
                ajgu ajguVar = (ajgu) abnpVarN.b;
                ajgvVar3.getClass();
                ajguVar.g = ajgvVar3;
                ajguVar.b |= 16;
                vrtVarA.g((ajgu) abnpVarN.q());
                vrtVarA.a = str2;
                vrtVarA.b = null;
                if (((Boolean) vxeVar.f.a()).booleanValue()) {
                    vrtVarA.h = i;
                }
                return vxeVar.a.a(vrtVarA.a());
            }
        }));
    }

    @Override // defpackage.vwt
    public final void a(vky vkyVar, long j, long j2) {
        vxb vxbVar = new vxb(j, j2);
        vry vryVar = this.a;
        String str = vkyVar.a;
        vyk vykVarE = vryVar.e(str);
        int iD = vryVar.d();
        if (vykVarE.f()) {
            zgp zgpVar = zgl.a;
        } else {
            h(str, vykVarE, iD, vxbVar);
        }
    }

    @Override // defpackage.vxc
    public final vxb b() {
        return this.a.c() ? new vxb() : vxb.a;
    }

    @Override // defpackage.vxc
    @ResultIgnorabilityUnspecified
    public final void c(vky vkyVar) {
        if (!this.a.c()) {
            vxb vxbVar = vxb.a;
            return;
        }
        this.b.put(vkyVar.a, new vxb());
    }

    @Override // defpackage.vxc
    public final void d(vky vkyVar, vky vkyVar2, int i) {
        g(vkyVar.a, vkyVar2 == null ? null : vkyVar2.a, i);
    }

    @Override // defpackage.vxc
    public final void e(vxb vxbVar, vky vkyVar) {
        f(vxbVar, vkyVar.a);
    }

    @Override // defpackage.vsa
    public final /* synthetic */ void k() {
    }
}
