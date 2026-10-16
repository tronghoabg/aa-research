package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class x6 extends d7 implements DoubleConsumer {
    @Override // j$.util.stream.d7
    public final Object[] A() {
        return new double[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public j$.util.s0 spliterator() {
        return new w6(this, 0, this.f50344c, 0, this.f50343b);
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d2) {
        D();
        double[] dArr = (double[]) this.f50380e;
        int i2 = this.f50343b;
        this.f50343b = i2 + 1;
        dArr[i2] = d2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d((DoubleConsumer) consumer);
        } else {
            if (t8.f50623a) {
                t8.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.g((w6) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.s0 s0VarSpliterator = spliterator();
        Objects.requireNonNull(s0VarSpliterator);
        return new j$.util.g1(s0VarSpliterator);
    }

    @Override // j$.util.stream.d7
    public final Object newArray(int i2) {
        return new double[i2];
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f50344c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f50344c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.d7
    public final void w(Object obj, int i2, int i3, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i2 < i3) {
            doubleConsumer.accept(dArr[i2]);
            i2++;
        }
    }

    @Override // j$.util.stream.d7
    public final int x(Object obj) {
        return ((double[]) obj).length;
    }
}
