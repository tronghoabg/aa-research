package defpackage;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class jgi implements irj {
    public static final yph a = yph.c("CAR.WM");
    public static final long b = 500000000;
    public final jfg c;
    private final xya h;
    private boolean i;
    private final jge k;
    private final jge l;
    private final jge m;
    private final jge n;
    private final jge o;
    private final jge p;
    private final jge q;
    private final jge r;
    private final jge s;
    private final jgc t;
    private final xyc v;
    boolean d = false;
    boolean e = true;
    private int u = 0;
    public final Queue f = new ydx(50);
    public final kgx g = new kgx();
    private final Set j = new HashSet();

    public jgi(xyi xyiVar, jfg jfgVar, xyc xycVar) {
        this.h = new xya(xyiVar);
        this.c = jfgVar;
        this.v = xycVar;
        jgc jgcVar = new jgc(xyiVar);
        this.t = jgcVar;
        this.k = new jge(this, xyiVar, "Video end2end", new jgg(this, yzy.Id, yzy.Ie, yzy.If, yzy.Ig, yzy.Ih, yzy.Ii, yzy.Ij));
        this.l = new jge(this, xyiVar, "Composition", new jgg(this, yzy.Ir, yzy.Is, yzy.It, yzy.Iu, yzy.Iv, yzy.Iw, yzy.Ix));
        this.m = new jge(this, xyiVar, "Encoding", new jgg(this, yzy.Iy, yzy.Iz, yzy.IA, yzy.IB, yzy.IC, yzy.ID, yzy.IE));
        this.n = new jge(this, xyiVar, "Queueing", new jgg(this, yzy.IF, yzy.IG, yzy.IH, yzy.II, yzy.IJ, yzy.IK, yzy.IL));
        this.o = new jge(this, xyiVar, "Transport", new jgg(this, yzy.IM, yzy.IO, yzy.IP, yzy.IQ, yzy.IR, yzy.IS, yzy.IT));
        this.p = new jge(this, xyiVar, "Ack", new jgg(this, yzy.IU, yzy.IV, yzy.IW, yzy.IX, yzy.IY, yzy.IZ, yzy.Ja));
        this.q = new jge(this, jgcVar, "Video end2end with audio flowing", new jgg(this, yzy.Ik, yzy.Il, yzy.Im, yzy.In, yzy.Io, yzy.Ip, yzy.Iq));
        jgf jggVar = new jgg(this, yzy.Jb, yzy.Jc, yzy.Jd, yzy.Je, yzy.Jf, yzy.Jg, yzy.Jh);
        float fA = (float) acvt.a.gu().a();
        this.r = new jge(this, xyiVar, "Composition to Transport", ((double) fA) > 0.0d ? new jgd(jggVar, new jgh(this, yzy.Ji, fA)) : jggVar);
        this.s = new jge(this, jgcVar, "Video compositionToTransport with audio flowing", new jgg(this, yzy.Jj, yzy.Jk, yzy.Jl, yzy.Jm, yzy.Jn, yzy.Jo, yzy.Jp));
    }

    private final synchronized void p(yzy yzyVar) {
        Set set = this.j;
        if (set.contains(yzyVar)) {
            return;
        }
        this.g.c((rrc) rrc.h(yxy.CAR_SERVICE, yzz.PROJECTION_WINDOW_MANAGER, yzyVar).l(), 1);
        set.add(yzyVar);
    }

    private static boolean q(long j, long j2, long j3) {
        return j >= j2 && j < j3;
    }

    @Override // defpackage.irj
    public final synchronized void a() {
        jgc jgcVar = this.t;
        long jB = jgcVar.c.b();
        jgcVar.a += jgcVar.a(jB);
        jgcVar.b = jB;
        if (this.i) {
            long seconds = this.h.c().toSeconds();
            if (q(seconds, 1L, 2L)) {
                p(yzy.GY);
                return;
            }
            if (q(seconds, 2L, 3L)) {
                p(yzy.GZ);
                return;
            }
            if (q(seconds, 3L, 5L)) {
                p(yzy.Ha);
                return;
            }
            if (q(seconds, 5L, 8L)) {
                p(yzy.Hb);
                return;
            }
            if (q(seconds, 8L, 13L)) {
                p(yzy.Hc);
            } else if (q(seconds, 13L, 21L)) {
                p(yzy.Hd);
            } else if (seconds >= 21) {
                p(yzy.He);
            }
        }
    }

    public final synchronized void b() {
        if (((Boolean) this.v.gu()).booleanValue()) {
            return;
        }
        this.n.b();
        this.o.a();
        this.p.a();
    }

    public final synchronized void c() {
        this.e = false;
    }

    public final synchronized void d() {
        this.m.b();
        if (((Boolean) this.v.gu()).booleanValue()) {
            this.o.a();
        } else {
            this.n.a();
        }
    }

    public final synchronized void e() {
    }

    public final synchronized void f() {
        h();
        this.o.b();
        this.r.b();
        this.s.b();
    }

    public final synchronized void g() {
        this.l.b();
        this.m.a();
    }

    public final synchronized void h() {
        if (this.i) {
            this.i = false;
            this.h.d();
            this.j.clear();
            int i = this.u;
            if (i > 0) {
                this.f.add(Integer.valueOf(i));
            }
            this.u = 0;
        }
    }

    public final synchronized void i() {
        this.d = true;
    }

    public final synchronized void j() {
        this.k.a();
        this.l.a();
        this.q.a();
        this.r.a();
        this.s.a();
    }

    public final synchronized void k() {
        this.d = false;
        this.k.b();
        this.l.b();
        this.m.b();
        this.o.b();
        this.q.b();
        this.r.b();
        this.s.b();
        if (((Boolean) this.v.gu()).booleanValue()) {
            return;
        }
        this.n.b();
        this.p.b();
    }

    public final synchronized void l() {
        this.k.b();
        this.q.b();
        if (((Boolean) this.v.gu()).booleanValue()) {
            return;
        }
        this.p.b();
    }

    public final synchronized void m() {
        this.u++;
        if (!this.i) {
            this.i = true;
            this.h.e();
            return;
        }
        long seconds = this.h.c().toSeconds();
        if (q(seconds, 1L, 2L)) {
            p(yzy.GR);
            return;
        }
        if (q(seconds, 2L, 3L)) {
            p(yzy.GS);
            return;
        }
        if (q(seconds, 3L, 5L)) {
            p(yzy.GT);
            return;
        }
        if (q(seconds, 5L, 8L)) {
            p(yzy.GU);
            return;
        }
        if (q(seconds, 8L, 13L)) {
            p(yzy.GV);
        } else if (q(seconds, 13L, 21L)) {
            p(yzy.GW);
        } else if (seconds >= 21) {
            p(yzy.GX);
        }
    }

    public final synchronized boolean n() {
        return this.d;
    }

    public final synchronized boolean o() {
        return this.e;
    }
}
