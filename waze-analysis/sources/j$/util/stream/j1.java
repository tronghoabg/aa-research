package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j1 extends n5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50463b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.g0 f50464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f50465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(t5 t5Var, g0 g0Var) {
        super(t5Var);
        this.f50465d = g0Var;
        t5 t5Var2 = this.f50539a;
        Objects.requireNonNull(t5Var2);
        this.f50464c = new j$.util.g0(t5Var2, 1);
    }

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) throws Exception {
        IntStream intStream = (IntStream) this.f50465d.apply(i2);
        if (intStream != null) {
            try {
                boolean z = this.f50463b;
                j$.util.g0 g0Var = this.f50464c;
                if (z) {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f50539a.o() && ofIntSpliterator.tryAdvance((IntConsumer) g0Var)) {
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

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50539a.l(-1L);
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final boolean o() {
        this.f50463b = true;
        return this.f50539a.o();
    }
}
