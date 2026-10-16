package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
class X2 extends AbstractC2933b3 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final void s(Object obj, int i5, int i10, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i5 < i10) {
            intConsumer.accept(iArr[i5]);
            i5++;
        }
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final int t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (Q3.f38068a) {
                Q3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.S.b((W2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.AbstractC2933b3
    protected final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.AbstractC2933b3
    public final Object c(int i5) {
        return new int[i5];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i5) {
        x();
        int[] iArr = (int[]) this.f38156e;
        int i10 = this.f38165b;
        this.f38165b = i10 + 1;
        iArr[i10] = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC2933b3, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new W2(this, 0, this.f38166c, 0, this.f38165b);
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f38166c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f38166c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
