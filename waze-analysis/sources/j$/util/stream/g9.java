package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g9 extends d {

    /* renamed from: h, reason: collision with root package name */
    public final a f50420h;

    /* renamed from: i, reason: collision with root package name */
    public final IntFunction f50421i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f50422j;

    /* renamed from: k, reason: collision with root package name */
    public long f50423k;

    /* renamed from: l, reason: collision with root package name */
    public long f50424l;

    public g9(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.f50420h = aVar;
        this.f50421i = intFunction;
        this.f50422j = j7.ORDERED.k(aVar2.f50316f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.d()
            if (r0 != 0) goto L1c
            boolean r1 = r5.f50422j
            if (r1 == 0) goto L1c
            j$.util.stream.j7 r1 = j$.util.stream.j7.SIZED
            j$.util.stream.a r2 = r5.f50420h
            int r3 = r2.f50313c
            int r1 = r1.f50482e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.f50362b
            long r1 = r2.r(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.a r3 = r5.f50361a
            java.util.function.IntFunction r4 = r5.f50421i
            j$.util.stream.e2 r1 = r3.I(r1, r4)
            j$.util.stream.a r2 = r5.f50420h
            j$.util.stream.e9 r2 = (j$.util.stream.e9) r2
            boolean r3 = r5.f50422j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.f9 r0 = r2.e(r1, r0)
            j$.util.stream.a r2 = r5.f50361a
            j$.util.Spliterator r3 = r5.f50362b
            r2.Q(r3, r0)
            j$.util.stream.m2 r1 = r1.build()
            long r2 = r1.count()
            r5.f50423k = r2
            long r2 = r0.t()
            r5.f50424l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.g9.a():java.lang.Object");
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new g9(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f50364d;
        if (dVar != null) {
            if (this.f50422j) {
                g9 g9Var = (g9) dVar;
                long j2 = g9Var.f50424l;
                this.f50424l = j2;
                if (j2 == g9Var.f50423k) {
                    this.f50424l = j2 + ((g9) this.f50365e).f50424l;
                }
            }
            g9 g9Var2 = (g9) dVar;
            long j3 = g9Var2.f50423k;
            g9 g9Var3 = (g9) this.f50365e;
            this.f50423k = j3 + g9Var3.f50423k;
            m2 m2VarC = g9Var2.f50423k == 0 ? (m2) g9Var3.f50366f : g9Var3.f50423k == 0 ? (m2) g9Var2.f50366f : d4.C(this.f50420h.H(), (m2) ((g9) this.f50364d).f50366f, (m2) ((g9) this.f50365e).f50366f);
            if (d() && this.f50422j) {
                m2VarC = m2VarC.f(this.f50424l, m2VarC.count(), this.f50421i);
            }
            this.f50366f = m2VarC;
        }
        super.onCompletion(countedCompleter);
    }

    public g9(g9 g9Var, Spliterator spliterator) {
        super(g9Var, spliterator);
        this.f50420h = g9Var.f50420h;
        this.f50421i = g9Var.f50421i;
        this.f50422j = g9Var.f50422j;
    }
}
