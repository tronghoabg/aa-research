package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u extends m5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50624b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.c0 f50625c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f50626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t5 t5Var, g0 g0Var) {
        super(t5Var);
        this.f50626d = g0Var;
        t5 t5Var2 = this.f50521a;
        Objects.requireNonNull(t5Var2);
        this.f50625c = new j$.util.c0(t5Var2, 1);
    }

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) throws Exception {
        DoubleStream doubleStream = (DoubleStream) this.f50626d.apply(d2);
        if (doubleStream != null) {
            try {
                boolean z = this.f50624b;
                j$.util.c0 c0Var = this.f50625c;
                if (z) {
                    j$.util.s0 s0VarSpliterator = doubleStream.sequential().spliterator();
                    while (!this.f50521a.o() && s0VarSpliterator.tryAdvance((DoubleConsumer) c0Var)) {
                    }
                } else {
                    doubleStream.sequential().forEach(c0Var);
                }
            } catch (Throwable th) {
                try {
                    doubleStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (doubleStream != null) {
            doubleStream.close();
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50521a.l(-1L);
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final boolean o() {
        this.f50624b = true;
        return this.f50521a.o();
    }
}
