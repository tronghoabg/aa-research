package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3030v1 extends AbstractC3035w1 {

    /* renamed from: h, reason: collision with root package name */
    private final Object[] f38329h;

    C3030v1(Spliterator spliterator, AbstractC2929b abstractC2929b, Object[] objArr) {
        super(spliterator, abstractC2929b, objArr.length);
        this.f38329h = objArr;
    }

    C3030v1(C3030v1 c3030v1, Spliterator spliterator, long j8, long j10) {
        super(c3030v1, spliterator, j8, j10, c3030v1.f38329h.length);
        this.f38329h = c3030v1.f38329h;
    }

    @Override // j$.util.stream.AbstractC3035w1
    final AbstractC3035w1 b(Spliterator spliterator, long j8, long j10) {
        return new C3030v1(this, spliterator, j8, j10);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i5 = this.f38340f;
        if (i5 >= this.f38341g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f38340f));
        }
        Object[] objArr = this.f38329h;
        this.f38340f = i5 + 1;
        objArr[i5] = obj;
    }
}
