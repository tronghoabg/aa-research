package defpackage;

import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class pwz {
    public static final Duration a = Duration.ofSeconds(2);
    public final zhc A;
    public final int B;
    public int C;
    public Duration b;
    public Duration c;
    public final Duration d;
    public final Duration e;
    public final Duration f;
    public final Duration g;
    public final Duration h;
    public final Duration i;
    public final Duration j;
    public final Duration k;
    public final Duration l;
    public final Duration m;
    public final Duration n;
    public final Duration o;
    public final Duration p;
    public final Duration q;
    public Duration r;
    public Duration s;
    public final AtomicReference t;
    public final AtomicReference u;
    public final AtomicReference v;
    public final AtomicReference w;
    public Duration x;
    public final Duration y;
    public final Duration z;

    public pwz(int i) {
        Duration duration = pxa.a;
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
        this.t = new AtomicReference(Duration.ZERO);
        this.u = new AtomicReference(Duration.ZERO);
        this.v = new AtomicReference(Duration.ZERO);
        this.w = new AtomicReference(Duration.ZERO);
        this.x = Duration.ZERO;
        this.y = duration;
        this.z = duration;
        this.A = new zhc();
        this.B = i;
        this.C = 1;
    }

    public final void a() {
        zhc zhcVar = this.A;
        if (zhcVar.isDone()) {
            return;
        }
        zhcVar.o(pxa.a(this));
    }

    public final void b(Duration duration) {
        this.v.set(duration);
        this.C = 22;
    }

    public final void c(Duration duration) {
        this.t.set(duration);
        this.C = 20;
    }

    public final void d(Duration duration) {
        this.w.set(duration);
        this.C = 23;
    }

    public final void e(Duration duration) {
        this.u.set(duration);
        this.C = 21;
    }
}
