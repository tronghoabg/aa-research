package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3020t1 extends AbstractC3035w1 implements InterfaceC3002p2 {

    /* renamed from: h, reason: collision with root package name */
    private final int[] f38313h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
    }

    C3020t1(Spliterator spliterator, AbstractC2929b abstractC2929b, int[] iArr) {
        super(spliterator, abstractC2929b, iArr.length);
        this.f38313h = iArr;
    }

    C3020t1(C3020t1 c3020t1, Spliterator spliterator, long j8, long j10) {
        super(c3020t1, spliterator, j8, j10, c3020t1.f38313h.length);
        this.f38313h = c3020t1.f38313h;
    }

    @Override // j$.util.stream.AbstractC3035w1
    final AbstractC3035w1 b(Spliterator spliterator, long j8, long j10) {
        return new C3020t1(this, spliterator, j8, j10);
    }

    @Override // j$.util.stream.AbstractC3035w1, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        int i10 = this.f38340f;
        if (i10 >= this.f38341g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f38340f));
        }
        int[] iArr = this.f38313h;
        this.f38340f = i10 + 1;
        iArr[i10] = i5;
    }
}
