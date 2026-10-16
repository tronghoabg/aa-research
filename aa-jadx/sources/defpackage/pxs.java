package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxs {
    public static final j$.time.Duration a = j$.time.Duration.ofSeconds(2);
    public final defpackage.zif A;
    public final int B;
    public int C;
    public j$.time.Duration b;
    public j$.time.Duration c;
    public final j$.time.Duration d;
    public final j$.time.Duration e;
    public final j$.time.Duration f;
    public final j$.time.Duration g;
    public final j$.time.Duration h;
    public final j$.time.Duration i;
    public final j$.time.Duration j;
    public final j$.time.Duration k;
    public final j$.time.Duration l;
    public final j$.time.Duration m;
    public final j$.time.Duration n;
    public final j$.time.Duration o;
    public final j$.time.Duration p;
    public final j$.time.Duration q;
    public j$.time.Duration r;
    public j$.time.Duration s;
    public final java.util.concurrent.atomic.AtomicReference t;
    public final java.util.concurrent.atomic.AtomicReference u;
    public final java.util.concurrent.atomic.AtomicReference v;
    public final java.util.concurrent.atomic.AtomicReference w;
    public j$.time.Duration x;
    public final j$.time.Duration y;
    public final j$.time.Duration z;

    public pxs(int i) {
        j$.time.Duration duration = defpackage.pxt.a;
        this.b = duration;
        this.c = duration;
        this.d = duration;
        this.e = duration;
        this.f = duration;
        this.g = duration;
        this.h = duration;
        this.i = duration;
        this.j = duration;
        this.k = duration;
        this.l = duration;
        this.m = duration;
        this.n = duration;
        this.o = duration;
        this.p = duration;
        this.q = duration;
        this.r = duration;
        this.s = duration;
        this.t = new java.util.concurrent.atomic.AtomicReference(j$.time.Duration.ZERO);
        this.u = new java.util.concurrent.atomic.AtomicReference(j$.time.Duration.ZERO);
        this.v = new java.util.concurrent.atomic.AtomicReference(j$.time.Duration.ZERO);
        this.w = new java.util.concurrent.atomic.AtomicReference(j$.time.Duration.ZERO);
        this.x = j$.time.Duration.ZERO;
        this.y = duration;
        this.z = duration;
        this.A = new defpackage.zif();
        this.B = i;
        this.C = 1;
    }

    public final void a() {
        defpackage.zif zifVar = this.A;
        if (zifVar.isDone()) {
            return;
        }
        zifVar.o(defpackage.pxt.a(this));
    }

    public final void b(j$.time.Duration duration) {
        this.v.set(duration);
        this.C = 22;
    }

    public final void c(j$.time.Duration duration) {
        this.t.set(duration);
        this.C = 20;
    }

    public final void d(j$.time.Duration duration) {
        this.w.set(duration);
        this.C = 23;
    }

    public final void e(j$.time.Duration duration) {
        this.u.set(duration);
        this.C = 21;
    }
}
