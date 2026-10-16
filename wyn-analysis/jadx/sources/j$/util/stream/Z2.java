package j$.util.stream;

import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
class Z2 extends AbstractC2933b3 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final void s(Object obj, int i5, int i10, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i5 < i10) {
            longConsumer.accept(jArr[i5]);
            i5++;
        }
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final int t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (Q3.f38068a) {
                Q3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.util.S.c((Y2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final Object[] w() {
        return new long[8][];
    }

    @Override // j$.util.stream.AbstractC2933b3
    public final Object c(int i5) {
        return new long[i5];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j8) {
        x();
        long[] jArr = (long[]) this.f38156e;
        int i5 = this.f38165b;
        this.f38165b = i5 + 1;
        jArr[i5] = j8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC2933b3, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.a0 spliterator() {
        return new Y2(this, 0, this.f38166c, 0, this.f38165b);
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f38166c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f38166c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
