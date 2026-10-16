package defpackage;

import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class pxa {
    public static final Duration a = Duration.ofMillis(-1);
    private final Duration A;
    public final Duration b;
    public final Duration c;
    public final Duration d;
    public final Duration e;
    public final int f;
    private final Duration g;
    private final Duration h;
    private final Duration i;
    private final Duration j;
    private final Duration k;
    private final Duration l;
    private final Duration m;
    private final Duration n;
    private final Duration o;
    private final Duration p;
    private final Duration q;
    private final Duration r;
    private final Duration s;
    private final Duration t;
    private final Duration u;
    private final Duration v;
    private final Duration w;
    private final Duration x;
    private final Duration y;
    private final Duration z;

    public pxa(Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, Duration duration6, Duration duration7, Duration duration8, Duration duration9, Duration duration10, Duration duration11, Duration duration12, Duration duration13, Duration duration14, Duration duration15, Duration duration16, Duration duration17, Duration duration18, Duration duration19, Duration duration20, Duration duration21, Duration duration22, Duration duration23, Duration duration24, Duration duration25, int i) {
        duration.getClass();
        this.g = duration;
        duration2.getClass();
        this.h = duration2;
        duration3.getClass();
        this.i = duration3;
        duration4.getClass();
        this.j = duration4;
        duration5.getClass();
        this.k = duration5;
        duration6.getClass();
        this.l = duration6;
        duration7.getClass();
        this.m = duration7;
        duration8.getClass();
        this.n = duration8;
        duration9.getClass();
        this.o = duration9;
        duration10.getClass();
        this.p = duration10;
        duration11.getClass();
        this.q = duration11;
        duration12.getClass();
        this.r = duration12;
        duration13.getClass();
        this.s = duration13;
        duration14.getClass();
        this.t = duration14;
        duration15.getClass();
        this.u = duration15;
        duration16.getClass();
        this.v = duration16;
        duration17.getClass();
        this.w = duration17;
        duration18.getClass();
        this.x = duration18;
        duration19.getClass();
        this.b = duration19;
        duration20.getClass();
        this.c = duration20;
        duration21.getClass();
        this.d = duration21;
        duration22.getClass();
        this.e = duration22;
        duration23.getClass();
        this.y = duration23;
        duration24.getClass();
        this.z = duration24;
        duration25.getClass();
        this.A = duration25;
        if (i == 0) {
            throw null;
        }
        this.f = i;
    }

    public static pxa a(pwz pwzVar) {
        AtomicReference atomicReference = pwzVar.t;
        return new pxa(pwzVar.b, pwzVar.c, pwzVar.d, pwzVar.e, pwzVar.f, pwzVar.g, pwzVar.h, pwzVar.i, pwzVar.j, pwzVar.k, pwzVar.l, pwzVar.m, pwzVar.p, pwzVar.q, pwzVar.n, pwzVar.o, pwzVar.r, pwzVar.s, (Duration) atomicReference.get(), (Duration) pwzVar.u.get(), (Duration) pwzVar.v.get(), (Duration) pwzVar.w.get(), pwzVar.x, pwzVar.y, pwzVar.z, pwzVar.C);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxa) {
            pxa pxaVar = (pxa) obj;
            if (this.g.equals(pxaVar.g) && this.h.equals(pxaVar.h) && this.i.equals(pxaVar.i) && this.j.equals(pxaVar.j) && this.k.equals(pxaVar.k) && this.l.equals(pxaVar.l) && this.m.equals(pxaVar.m) && this.n.equals(pxaVar.n) && this.o.equals(pxaVar.o) && this.p.equals(pxaVar.p) && this.q.equals(pxaVar.q) && this.r.equals(pxaVar.r) && this.s.equals(pxaVar.s) && this.t.equals(pxaVar.t) && this.u.equals(pxaVar.u) && this.v.equals(pxaVar.v) && this.w.equals(pxaVar.w) && this.x.equals(pxaVar.x) && this.b.equals(pxaVar.b) && this.c.equals(pxaVar.c) && this.d.equals(pxaVar.d) && this.e.equals(pxaVar.e) && this.y.equals(pxaVar.y) && this.z.equals(pxaVar.z) && this.A.equals(pxaVar.A) && this.f == pxaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((((((((((((((((((((((((((((((((((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("REQUIREMENT_START", this.g);
        xxgVarAo.b("REQUIREMENT_SATISFIED", this.h);
        xxgVarAo.b("NETWORK_STACK_READY_REQUIREMENT_START", this.i);
        xxgVarAo.b("NETWORK_STACK_READY_REQUIREMENT_SATISFIED", this.j);
        xxgVarAo.b("CONNECTIVITY_REQUIREMENT_START", this.k);
        xxgVarAo.b("CONNECTIVITY_REQUIREMENT_SATISFIED", this.l);
        xxgVarAo.b("ZWIEBACK_COOKIE_REQUIREMENT_START", this.m);
        xxgVarAo.b("ZWIEBACK_COOKIE_REQUIREMENT_SATISFIED", this.n);
        xxgVarAo.b("ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_START", this.o);
        xxgVarAo.b("ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_SATISFIED", this.p);
        xxgVarAo.b("AUTH_REQUIREMENT_START", this.q);
        xxgVarAo.b("AUTH_REQUIREMENT_SATISFIED", this.r);
        xxgVarAo.b("API_TOKEN_REQUIREMENT_START", this.s);
        xxgVarAo.b("API_TOKEN_REQUIREMENT_SATISFIED", this.t);
        xxgVarAo.b("NON_DEFAULT_CLIENTPARAMETERS_REQUIREMENT_START", this.u);
        xxgVarAo.b("NON_DEFAULT_CLIENTPARAMETERS_REQUIREMENT_SATISFIED", this.v);
        xxgVarAo.b("LOCATION_REQUIREMENT_START", this.w);
        xxgVarAo.b("LOCATION_REQUIREMENT_SATISFIED", this.x);
        xxgVarAo.b("FIRST_BYTE_WRITTEN_TO_WIRE", this.b);
        xxgVarAo.b("LAST_BYTE_WRITTEN_TO_WIRE", this.c);
        xxgVarAo.b("FIRST_BYTE_READ_FROM_WIRE", this.d);
        xxgVarAo.b("LAST_BYTE_READ_FROM_WIRE", this.e);
        xxgVarAo.b("APP_CHECK_TOKEN_REQUIREMENT_START", this.z);
        xxgVarAo.b("APP_CHECK_TOKEN_REQUIREMENT_SATISFIED", this.A);
        return xxgVarAo.toString();
    }

    public pxa() {
        throw null;
    }
}
