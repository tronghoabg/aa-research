package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h9 extends b {

    /* renamed from: j, reason: collision with root package name */
    public final a f50436j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f50437k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f50438l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public h9(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.f50436j = aVar;
        this.f50437k = intFunction;
        this.f50438l = j7.ORDERED.k(aVar2.f50316f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        e2 e2VarI = this.f50361a.I(-1L, this.f50437k);
        t5 t5VarM = this.f50436j.M(this.f50361a.f50316f, e2VarI);
        a aVar = this.f50361a;
        boolean zI = aVar.i(this.f50362b, aVar.R(t5VarM));
        this.n = zI;
        if (zI) {
            i();
        }
        m2 m2VarBuild = e2VarI.build();
        this.m = m2VarBuild.count();
        return m2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new h9(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void h() {
        this.f50337i = true;
        if (this.f50438l && this.o) {
            f(d4.E(this.f50436j.H()));
        }
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return d4.E(this.f50436j.H());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.f50364d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.h9 r0 = (j$.util.stream.h9) r0
            boolean r0 = r0.n
            j$.util.stream.d r1 = r8.f50365e
            j$.util.stream.h9 r1 = (j$.util.stream.h9) r1
            boolean r1 = r1.n
            r0 = r0 | r1
            r8.n = r0
            boolean r0 = r8.f50438l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f50337i
            if (r0 == 0) goto L2a
            r8.m = r1
            j$.util.stream.a r0 = r8.f50436j
            j$.util.stream.k7 r0 = r0.H()
            j$.util.stream.f3 r0 = j$.util.stream.d4.E(r0)
            goto L88
        L2a:
            boolean r0 = r8.f50438l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.f50364d
            j$.util.stream.h9 r0 = (j$.util.stream.h9) r0
            boolean r3 = r0.n
            if (r3 == 0) goto L41
            long r1 = r0.m
            r8.m = r1
            java.lang.Object r0 = r0.k()
            j$.util.stream.m2 r0 = (j$.util.stream.m2) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.f50364d
            j$.util.stream.h9 r0 = (j$.util.stream.h9) r0
            long r3 = r0.m
            j$.util.stream.d r5 = r8.f50365e
            j$.util.stream.h9 r5 = (j$.util.stream.h9) r5
            long r6 = r5.m
            long r3 = r3 + r6
            r8.m = r3
            long r3 = r0.m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.k()
            j$.util.stream.m2 r0 = (j$.util.stream.m2) r0
            goto L88
        L5d:
            long r3 = r5.m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.k()
            j$.util.stream.m2 r0 = (j$.util.stream.m2) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.f50436j
            j$.util.stream.k7 r0 = r0.H()
            j$.util.stream.d r1 = r8.f50364d
            j$.util.stream.h9 r1 = (j$.util.stream.h9) r1
            java.lang.Object r1 = r1.k()
            j$.util.stream.m2 r1 = (j$.util.stream.m2) r1
            j$.util.stream.d r2 = r8.f50365e
            j$.util.stream.h9 r2 = (j$.util.stream.h9) r2
            java.lang.Object r2 = r2.k()
            j$.util.stream.m2 r2 = (j$.util.stream.m2) r2
            j$.util.stream.o2 r0 = j$.util.stream.d4.C(r0, r1, r2)
        L88:
            r8.f(r0)
        L8b:
            r0 = 1
            r8.o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.h9.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public h9(h9 h9Var, Spliterator spliterator) {
        super(h9Var, spliterator);
        this.f50436j = h9Var.f50436j;
        this.f50437k = h9Var.f50437k;
        this.f50438l = h9Var.f50438l;
    }
}
