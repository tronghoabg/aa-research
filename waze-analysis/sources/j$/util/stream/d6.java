package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d6 extends b {

    /* renamed from: j, reason: collision with root package name */
    public final a f50377j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f50378k;

    /* renamed from: l, reason: collision with root package name */
    public final long f50379l;
    public final long m;
    public long n;
    public volatile boolean o;

    public d6(d6 d6Var, Spliterator spliterator) {
        super(d6Var, spliterator);
        this.f50377j = d6Var.f50377j;
        this.f50378k = d6Var.f50378k;
        this.f50379l = d6Var.f50379l;
        this.m = d6Var.m;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (d()) {
            j7 j7Var = j7.SIZED;
            a aVar = this.f50377j;
            int i2 = aVar.f50313c;
            int i3 = j7Var.f50482e;
            e2 e2VarI = this.f50377j.I((i2 & i3) == i3 ? aVar.r(this.f50362b) : -1L, this.f50378k);
            t5 t5VarM = this.f50377j.M(this.f50361a.f50316f, e2VarI);
            a aVar2 = this.f50361a;
            aVar2.i(this.f50362b, aVar2.R(t5VarM));
            return e2VarI.build();
        }
        e2 e2VarI2 = this.f50377j.I(-1L, this.f50378k);
        if (this.f50379l == 0) {
            t5 t5VarM2 = this.f50377j.M(this.f50361a.f50316f, e2VarI2);
            a aVar3 = this.f50361a;
            aVar3.i(this.f50362b, aVar3.R(t5VarM2));
        } else {
            this.f50361a.Q(this.f50362b, e2VarI2);
        }
        m2 m2VarBuild = e2VarI2.build();
        this.n = m2VarBuild.count();
        this.o = true;
        this.f50362b = null;
        return m2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new d6(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void h() {
        this.f50337i = true;
        if (this.o) {
            f(d4.E(this.f50377j.H()));
        }
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return d4.E(this.f50377j.H());
    }

    public final long l(long j2) {
        if (this.o) {
            return this.n;
        }
        d6 d6Var = (d6) this.f50364d;
        d6 d6Var2 = (d6) this.f50365e;
        if (d6Var == null || d6Var2 == null) {
            return this.n;
        }
        long jL = d6Var.l(j2);
        return jL >= j2 ? jL : d6Var2.l(j2) + jL;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d6 d6Var;
        m2 m2VarE;
        d dVar = this.f50364d;
        if (dVar != null) {
            this.n = ((d6) dVar).n + ((d6) this.f50365e).n;
            if (this.f50337i) {
                this.n = 0L;
                m2VarE = d4.E(this.f50377j.H());
            } else {
                m2VarE = this.n == 0 ? d4.E(this.f50377j.H()) : ((d6) this.f50364d).n == 0 ? (m2) ((d6) this.f50365e).k() : d4.C(this.f50377j.H(), (m2) ((d6) this.f50364d).k(), (m2) ((d6) this.f50365e).k());
            }
            m2 m2VarF = m2VarE;
            if (d()) {
                m2VarF = m2VarF.f(this.f50379l, this.m >= 0 ? Math.min(m2VarF.count(), this.f50379l + this.m) : this.n, this.f50378k);
            }
            f(m2VarF);
            this.o = true;
        }
        if (this.m >= 0 && !d()) {
            long j2 = this.f50379l + this.m;
            long jL = this.o ? this.n : l(j2);
            if (jL >= j2) {
                i();
            } else {
                d6 d6Var2 = (d6) b();
                d6 d6Var3 = this;
                while (true) {
                    if (d6Var2 == null) {
                        if (jL >= j2) {
                            break;
                        }
                    } else {
                        if (d6Var3 == d6Var2.f50365e && (d6Var = (d6) d6Var2.f50364d) != null) {
                            long jL2 = d6Var.l(j2) + jL;
                            if (jL2 >= j2) {
                                break;
                            } else {
                                jL = jL2;
                            }
                        }
                        d6Var3 = d6Var2;
                        d6Var2 = (d6) d6Var2.b();
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public d6(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction, long j2, long j3) {
        super(aVar2, spliterator);
        this.f50377j = aVar;
        this.f50378k = intFunction;
        this.f50379l = j2;
        this.m = j3;
    }
}
