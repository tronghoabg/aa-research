package j$.util.stream;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3041x2 extends AbstractC2970j0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f38349m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f38350n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3041x2(AbstractC2975k0 abstractC2975k0, int i5, long j8, long j10) {
        super(abstractC2975k0, i5, 0);
        this.f38349m = j8;
        this.f38350n = j10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        long jD = abstractC2929b.D(spliterator);
        long j8 = this.f38350n;
        if (jD > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            j$.util.a0 a0Var = (j$.util.a0) abstractC2929b.U(spliterator);
            long j10 = this.f38349m;
            return new C3047y3(a0Var, j10, C2.b(j10, j8));
        }
        if (EnumC2958g3.ORDERED.t(abstractC2929b.H())) {
            return ((K0) new B2(this, abstractC2929b, spliterator, new C2942d2(2), this.f38349m, this.f38350n).invoke()).spliterator();
        }
        j$.util.a0 a0Var2 = (j$.util.a0) abstractC2929b.U(spliterator);
        long j11 = this.f38349m;
        if (j11 <= jD) {
            long jMin = jD - j11;
            if (j8 >= 0) {
                jMin = Math.min(j8, jMin);
            }
            j8 = jMin;
            j11 = 0;
        }
        return new E3(a0Var2, j11, j8);
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j8;
        long jD = abstractC2929b.D(spliterator);
        if (jD > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            return AbstractC3044y0.E(abstractC2929b, C2.c(abstractC2929b.G(), spliterator, this.f38349m, this.f38350n), true);
        }
        if (!EnumC2958g3.ORDERED.t(abstractC2929b.H())) {
            j$.util.a0 a0Var = (j$.util.a0) abstractC2929b.U(spliterator);
            long j10 = this.f38349m;
            long j11 = this.f38350n;
            if (j10 <= jD) {
                long j12 = jD - j10;
                jMin = j11 >= 0 ? Math.min(j11, j12) : j12;
                j8 = 0;
            } else {
                jMin = j11;
                j8 = j10;
            }
            return AbstractC3044y0.E(this, new E3(a0Var, j8, jMin), true);
        }
        return (K0) new B2(this, abstractC2929b, spliterator, intFunction, this.f38349m, this.f38350n).invoke();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        return new C3036w2(this, interfaceC3011r2);
    }
}
