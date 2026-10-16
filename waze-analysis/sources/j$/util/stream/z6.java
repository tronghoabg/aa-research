package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class z6 extends d7 implements IntConsumer {
    @Override // j$.util.stream.d7
    public final Object[] A() {
        return new int[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new y6(this, 0, this.f50344c, 0, this.f50343b);
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i2) {
        D();
        int[] iArr = (int[]) this.f50380e;
        int i3 = this.f50343b;
        this.f50343b = i3 + 1;
        iArr[i3] = i2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            d((IntConsumer) consumer);
        } else {
            if (t8.f50623a) {
                t8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.h((y6) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.e1(ofIntSpliterator);
    }

    @Override // j$.util.stream.d7
    public final Object newArray(int i2) {
        return new int[i2];
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f50344c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f50344c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.d7
    public final void w(Object obj, int i2, int i3, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i2 < i3) {
            intConsumer.accept(iArr[i2]);
            i2++;
        }
    }

    @Override // j$.util.stream.d7
    public final int x(Object obj) {
        return ((int[]) obj).length;
    }
}
