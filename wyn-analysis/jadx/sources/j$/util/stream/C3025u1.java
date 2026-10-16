package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3025u1 extends AbstractC3035w1 implements InterfaceC3007q2 {

    /* renamed from: h, reason: collision with root package name */
    private final long[] f38319h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3007q2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3044y0.i(this, l10);
    }

    C3025u1(Spliterator spliterator, AbstractC2929b abstractC2929b, long[] jArr) {
        super(spliterator, abstractC2929b, jArr.length);
        this.f38319h = jArr;
    }

    C3025u1(C3025u1 c3025u1, Spliterator spliterator, long j8, long j10) {
        super(c3025u1, spliterator, j8, j10, c3025u1.f38319h.length);
        this.f38319h = c3025u1.f38319h;
    }

    @Override // j$.util.stream.AbstractC3035w1
    final AbstractC3035w1 b(Spliterator spliterator, long j8, long j10) {
        return new C3025u1(this, spliterator, j8, j10);
    }

    @Override // j$.util.stream.AbstractC3035w1, j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i5 = this.f38340f;
        if (i5 >= this.f38341g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f38340f));
        }
        long[] jArr = this.f38319h;
        this.f38340f = i5 + 1;
        jArr[i5] = j8;
    }
}
