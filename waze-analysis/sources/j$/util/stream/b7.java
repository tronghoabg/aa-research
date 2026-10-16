package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class b7 extends d7 implements LongConsumer {
    @Override // j$.util.stream.d7
    public final Object[] A() {
        return new long[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public j$.util.x0 spliterator() {
        return new a7(this, 0, this.f50344c, 0, this.f50343b);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j2) {
        D();
        long[] jArr = (long[]) this.f50380e;
        int i2 = this.f50343b;
        this.f50343b = i2 + 1;
        jArr[i2] = j2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            d((LongConsumer) consumer);
        } else {
            if (t8.f50623a) {
                t8.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.i((a7) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.x0 x0VarSpliterator = spliterator();
        Objects.requireNonNull(x0VarSpliterator);
        return new j$.util.f1(x0VarSpliterator);
    }

    @Override // j$.util.stream.d7
    public final Object newArray(int i2) {
        return new long[i2];
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f50344c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f50344c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.d7
    public final void w(Object obj, int i2, int i3, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i2 < i3) {
            longConsumer.accept(jArr[i2]);
            i2++;
        }
    }

    @Override // j$.util.stream.d7
    public final int x(Object obj) {
        return ((long[]) obj).length;
    }
}
