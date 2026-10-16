package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class d3 extends b {
    public final b3 j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public d3(d3 d3Var, Spliterator spliterator) {
        super(d3Var, spliterator);
        this.j = d3Var.j;
        this.k = d3Var.k;
        this.l = d3Var.l;
        this.m = d3Var.m;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (d()) {
            u3 u3Var = u3.SIZED;
            b3 b3Var = this.j;
            int i = b3Var.c;
            int i2 = u3Var.e;
            long jG = (i & i2) == i2 ? b3Var.g(this.b) : -1L;
            b3 b3Var2 = this.j;
            IntFunction intFunction = this.k;
            b3Var2.getClass();
            b0 b0VarX = a2.x(jG, intFunction);
            z2 z2VarO = this.j.o(this.a.f, b0VarX);
            a aVar = this.a;
            aVar.b(this.b, aVar.t(z2VarO));
            return b0VarX.build();
        }
        b3 b3Var3 = this.j;
        IntFunction intFunction2 = this.k;
        b3Var3.getClass();
        b0 b0VarX2 = a2.x(-1L, intFunction2);
        if (this.l == 0) {
            z2 z2VarO2 = this.j.o(this.a.f, b0VarX2);
            a aVar2 = this.a;
            aVar2.b(this.b, aVar2.t(z2VarO2));
        } else {
            this.a.s(this.b, b0VarX2);
        }
        j0 j0VarBuild = b0VarX2.build();
        this.n = j0VarBuild.count();
        this.o = true;
        this.b = null;
        return j0VarBuild;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new d3(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void h() {
        this.i = true;
        if (this.o) {
            f(j());
        }
    }

    public final long l(long j) {
        if (this.o) {
            return this.n;
        }
        d3 d3Var = (d3) this.d;
        d3 d3Var2 = (d3) this.e;
        if (d3Var == null || d3Var2 == null) {
            return this.n;
        }
        long jL = d3Var.l(j);
        return jL >= j ? jL : d3Var2.l(j) + jL;
    }

    @Override // j$.util.stream.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final c1 j() {
        this.j.getClass();
        v3 v3Var = v3.REFERENCE;
        int i = k0.a[v3Var.ordinal()];
        if (i == 1) {
            return a2.b;
        }
        if (i == 2) {
            return a2.c;
        }
        if (i == 3) {
            return a2.d;
        }
        if (i == 4) {
            return a2.e;
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(v3Var)));
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d3 d3Var;
        j0 j0VarZ;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((d3) dVar).n + ((d3) this.e).n;
            if (this.i) {
                this.n = 0L;
                j0VarZ = j();
            } else if (this.n == 0) {
                j0VarZ = j();
            } else if (((d3) this.d).n == 0) {
                j0VarZ = (j0) ((d3) this.e).k();
            } else {
                this.j.getClass();
                j0VarZ = a2.z(v3.REFERENCE, (j0) ((d3) this.d).k(), (j0) ((d3) this.e).k());
            }
            j0 j0VarG = j0VarZ;
            if (d()) {
                j0VarG = j0VarG.g(this.l, this.m >= 0 ? Math.min(j0VarG.count(), this.l + this.m) : this.n, this.k);
            }
            f(j0VarG);
            this.o = true;
        }
        if (this.m >= 0 && !d()) {
            long j = this.l + this.m;
            long jL = this.o ? this.n : l(j);
            if (jL >= j) {
                i();
            } else {
                d3 d3Var2 = (d3) b();
                d3 d3Var3 = this;
                while (true) {
                    if (d3Var2 == null) {
                        if (jL >= j) {
                            break;
                        }
                    } else {
                        if (d3Var3 == d3Var2.e && (d3Var = (d3) d3Var2.d) != null) {
                            long jL2 = d3Var.l(j) + jL;
                            if (jL2 >= j) {
                                break;
                            } else {
                                jL = jL2;
                            }
                        }
                        d3Var3 = d3Var2;
                        d3Var2 = (d3) d3Var2.b();
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public d3(b3 b3Var, a aVar, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(aVar, spliterator);
        this.j = b3Var;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }
}
