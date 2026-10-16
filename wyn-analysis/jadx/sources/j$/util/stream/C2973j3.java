package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2973j3 extends AbstractC2988m3 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    final double[] f38238c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    C2973j3(int i5) {
        this.f38238c = new double[i5];
    }

    @Override // j$.util.stream.AbstractC2988m3
    final void b(Object obj, long j8) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i5 = 0; i5 < j8; i5++) {
            doubleConsumer.accept(this.f38238c[i5]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        int i5 = this.f38259b;
        this.f38259b = i5 + 1;
        this.f38238c[i5] = d3;
    }
}
