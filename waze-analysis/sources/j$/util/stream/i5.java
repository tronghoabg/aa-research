package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i5 extends p5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50450b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.g0 f50451c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f50452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(t5 t5Var, g0 g0Var) {
        super(t5Var);
        this.f50452d = g0Var;
        t5 t5Var2 = this.f50576a;
        Objects.requireNonNull(t5Var2);
        this.f50451c = new j$.util.g0(t5Var2, 1);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) throws Exception {
        IntStream intStream = (IntStream) this.f50452d.apply((g0) obj);
        if (intStream != null) {
            try {
                boolean z = this.f50450b;
                j$.util.g0 g0Var = this.f50451c;
                if (z) {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f50576a.o() && ofIntSpliterator.tryAdvance((IntConsumer) g0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(g0Var);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50576a.l(-1L);
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final boolean o() {
        this.f50450b = true;
        return this.f50576a.o();
    }
}
