package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jgq implements defpackage.irr {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM");
    public static final long b = 500000000;
    public final defpackage.jfo c;
    private final defpackage.xzg h;
    private boolean i;
    private final defpackage.jgm k;
    private final defpackage.jgm l;
    private final defpackage.jgm m;
    private final defpackage.jgm n;
    private final defpackage.jgm o;
    private final defpackage.jgm p;
    private final defpackage.jgm q;
    private final defpackage.jgm r;
    private final defpackage.jgm s;
    private final defpackage.jgk t;
    private final defpackage.xzi v;
    boolean d = false;
    boolean e = true;
    private int u = 0;
    public final java.util.Queue f = new defpackage.yfd(50);
    public final defpackage.ldx g = new defpackage.ldx((short[]) null);
    private final java.util.Set j = new java.util.HashSet();

    public jgq(defpackage.xzo xzoVar, defpackage.jfo jfoVar, defpackage.xzi xziVar) {
        this.h = new defpackage.xzg(xzoVar);
        this.c = jfoVar;
        this.v = xziVar;
        defpackage.jgk jgkVar = new defpackage.jgk(xzoVar);
        this.t = jgkVar;
        this.k = new defpackage.jgm(this, xzoVar, "Video end2end", new defpackage.jgo(this, defpackage.zbd.Ih, defpackage.zbd.Ii, defpackage.zbd.Ij, defpackage.zbd.Ik, defpackage.zbd.Il, defpackage.zbd.Im, defpackage.zbd.In));
        this.l = new defpackage.jgm(this, xzoVar, "Composition", new defpackage.jgo(this, defpackage.zbd.Iv, defpackage.zbd.Iw, defpackage.zbd.Ix, defpackage.zbd.Iy, defpackage.zbd.Iz, defpackage.zbd.IA, defpackage.zbd.IB));
        this.m = new defpackage.jgm(this, xzoVar, "Encoding", new defpackage.jgo(this, defpackage.zbd.IC, defpackage.zbd.ID, defpackage.zbd.IE, defpackage.zbd.IF, defpackage.zbd.IG, defpackage.zbd.IH, defpackage.zbd.II));
        this.n = new defpackage.jgm(this, xzoVar, "Queueing", new defpackage.jgo(this, defpackage.zbd.IJ, defpackage.zbd.IK, defpackage.zbd.IL, defpackage.zbd.IM, defpackage.zbd.IO, defpackage.zbd.IP, defpackage.zbd.IQ));
        this.o = new defpackage.jgm(this, xzoVar, "Transport", new defpackage.jgo(this, defpackage.zbd.IR, defpackage.zbd.IS, defpackage.zbd.IT, defpackage.zbd.IU, defpackage.zbd.IV, defpackage.zbd.IW, defpackage.zbd.IX));
        this.p = new defpackage.jgm(this, xzoVar, "Ack", new defpackage.jgo(this, defpackage.zbd.IY, defpackage.zbd.IZ, defpackage.zbd.Ja, defpackage.zbd.Jb, defpackage.zbd.Jc, defpackage.zbd.Jd, defpackage.zbd.Je));
        this.q = new defpackage.jgm(this, jgkVar, "Video end2end with audio flowing", new defpackage.jgo(this, defpackage.zbd.Io, defpackage.zbd.Ip, defpackage.zbd.Iq, defpackage.zbd.Ir, defpackage.zbd.Is, defpackage.zbd.It, defpackage.zbd.Iu));
        defpackage.jgn jgoVar = new defpackage.jgo(this, defpackage.zbd.Jf, defpackage.zbd.Jg, defpackage.zbd.Jh, defpackage.zbd.Ji, defpackage.zbd.Jj, defpackage.zbd.Jk, defpackage.zbd.Jl);
        float fA = (float) defpackage.acwv.a.fF().a();
        this.r = new defpackage.jgm(this, xzoVar, "Composition to Transport", ((double) fA) > 0.0d ? new defpackage.jgl(jgoVar, new defpackage.jgp(this, defpackage.zbd.Jm, fA)) : jgoVar);
        this.s = new defpackage.jgm(this, jgkVar, "Video compositionToTransport with audio flowing", new defpackage.jgo(this, defpackage.zbd.Jn, defpackage.zbd.Jo, defpackage.zbd.Jp, defpackage.zbd.Jq, defpackage.zbd.Jr, defpackage.zbd.Js, defpackage.zbd.Jt));
    }

    private final synchronized void p(defpackage.zbd zbdVar) {
        java.util.Set set = this.j;
        if (set.contains(zbdVar)) {
            return;
        }
        this.g.n((defpackage.rrw) defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.PROJECTION_WINDOW_MANAGER, zbdVar).l(), 1);
        set.add(zbdVar);
    }

    private static boolean q(long j, long j2, long j3) {
        return j >= j2 && j < j3;
    }

    @Override // defpackage.irr
    public final synchronized void a() {
        defpackage.jgk jgkVar = this.t;
        long jB = jgkVar.c.b();
        jgkVar.a += jgkVar.a(jB);
        jgkVar.b = jB;
        if (this.i) {
            long seconds = this.h.c().toSeconds();
            if (q(seconds, 1L, 2L)) {
                p(defpackage.zbd.Hc);
                return;
            }
            if (q(seconds, 2L, 3L)) {
                p(defpackage.zbd.Hd);
                return;
            }
            if (q(seconds, 3L, 5L)) {
                p(defpackage.zbd.He);
                return;
            }
            if (q(seconds, 5L, 8L)) {
                p(defpackage.zbd.Hf);
                return;
            }
            if (q(seconds, 8L, 13L)) {
                p(defpackage.zbd.Hg);
            } else if (q(seconds, 13L, 21L)) {
                p(defpackage.zbd.Hh);
            } else if (seconds >= 21) {
                p(defpackage.zbd.Hi);
            }
        }
    }

    public final synchronized void b() {
        if (((java.lang.Boolean) this.v.fF()).booleanValue()) {
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
        if (((java.lang.Boolean) this.v.fF()).booleanValue()) {
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
                this.f.add(java.lang.Integer.valueOf(i));
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
        if (((java.lang.Boolean) this.v.fF()).booleanValue()) {
            return;
        }
        this.n.b();
        this.p.b();
    }

    public final synchronized void l() {
        this.k.b();
        this.q.b();
        if (((java.lang.Boolean) this.v.fF()).booleanValue()) {
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
            p(defpackage.zbd.GV);
            return;
        }
        if (q(seconds, 2L, 3L)) {
            p(defpackage.zbd.GW);
            return;
        }
        if (q(seconds, 3L, 5L)) {
            p(defpackage.zbd.GX);
            return;
        }
        if (q(seconds, 5L, 8L)) {
            p(defpackage.zbd.GY);
            return;
        }
        if (q(seconds, 8L, 13L)) {
            p(defpackage.zbd.GZ);
        } else if (q(seconds, 13L, 21L)) {
            p(defpackage.zbd.Ha);
        } else if (seconds >= 21) {
            p(defpackage.zbd.Hb);
        }
    }

    public final synchronized boolean n() {
        return this.d;
    }

    public final synchronized boolean o() {
        return this.e;
    }
}
