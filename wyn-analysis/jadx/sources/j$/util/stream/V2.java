package j$.util.stream;

import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
class V2 extends AbstractC2933b3 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final void s(Object obj, int i5, int i10, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i5 < i10) {
            doubleConsumer.accept(dArr[i5]);
            i5++;
        }
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final int t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else {
            if (Q3.f38068a) {
                Q3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.S.a((U2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final Object[] w() {
        return new double[8][];
    }

    @Override // j$.util.stream.AbstractC2933b3
    public final Object c(int i5) {
        return new double[i5];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d3) {
        x();
        double[] dArr = (double[]) this.f38156e;
        int i5 = this.f38165b;
        this.f38165b = i5 + 1;
        dArr[i5] = d3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC2933b3, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.V spliterator() {
        return new U2(this, 0, this.f38166c, 0, this.f38165b);
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f38166c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f38166c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
