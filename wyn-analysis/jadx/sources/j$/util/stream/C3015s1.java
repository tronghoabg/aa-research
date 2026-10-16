package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3015s1 extends AbstractC3035w1 implements InterfaceC2997o2 {

    /* renamed from: h, reason: collision with root package name */
    private final double[] f38305h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    C3015s1(Spliterator spliterator, AbstractC2929b abstractC2929b, double[] dArr) {
        super(spliterator, abstractC2929b, dArr.length);
        this.f38305h = dArr;
    }

    C3015s1(C3015s1 c3015s1, Spliterator spliterator, long j8, long j10) {
        super(c3015s1, spliterator, j8, j10, c3015s1.f38305h.length);
        this.f38305h = c3015s1.f38305h;
    }

    @Override // j$.util.stream.AbstractC3035w1
    final AbstractC3035w1 b(Spliterator spliterator, long j8, long j10) {
        return new C3015s1(this, spliterator, j8, j10);
    }

    @Override // j$.util.stream.AbstractC3035w1, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        int i5 = this.f38340f;
        if (i5 >= this.f38341g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f38340f));
        }
        double[] dArr = this.f38305h;
        this.f38340f = i5 + 1;
        dArr[i5] = d3;
    }
}
