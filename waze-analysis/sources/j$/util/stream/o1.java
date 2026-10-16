package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o1 extends o5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50549b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.k0 f50550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f50551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t5 t5Var, g0 g0Var) {
        super(t5Var);
        this.f50551d = g0Var;
        t5 t5Var2 = this.f50558a;
        Objects.requireNonNull(t5Var2);
        this.f50550c = new j$.util.k0(t5Var2, 1);
    }

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) throws Exception {
        LongStream longStream = (LongStream) this.f50551d.apply(j2);
        if (longStream != null) {
            try {
                boolean z = this.f50549b;
                j$.util.k0 k0Var = this.f50550c;
                if (z) {
                    j$.util.x0 x0VarSpliterator = longStream.sequential().spliterator();
                    while (!this.f50558a.o() && x0VarSpliterator.tryAdvance((LongConsumer) k0Var)) {
                    }
                } else {
                    longStream.sequential().forEach(k0Var);
                }
            } catch (Throwable th) {
                try {
                    longStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50558a.l(-1L);
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final boolean o() {
        this.f50549b = true;
        return this.f50558a.o();
    }
}
