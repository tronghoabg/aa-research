package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class q3 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f50582a;

    /* renamed from: b, reason: collision with root package name */
    public int f50583b;

    public q3(long j2) {
        if (j2 >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            throw null;
        }
        this.f50582a = new long[(int) j2];
        this.f50583b = 0;
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final l2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l2
    public final Object b() {
        long[] jArr = this.f50582a;
        int length = jArr.length;
        int i2 = this.f50583b;
        return length == i2 ? jArr : Arrays.copyOf(jArr, i2);
    }

    @Override // j$.util.stream.l2
    public final void c(int i2, Object obj) {
        int i3 = this.f50583b;
        System.arraycopy(this.f50582a, 0, (long[]) obj, i2, i3);
    }

    @Override // j$.util.stream.m2
    public final long count() {
        return this.f50583b;
    }

    @Override // j$.util.stream.l2
    public final void d(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i2 = 0; i2 < this.f50583b; i2++) {
            longConsumer.accept(this.f50582a[i2]);
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.v(this, j2, j3);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void forEach(Consumer consumer) {
        d4.s(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void h(Object[] objArr, int i2) {
        d4.p(this, (Long[]) objArr, i2);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return d4.m(this, intFunction);
    }

    @Override // j$.util.stream.m2
    public final int s() {
        return 0;
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final j$.util.a1 spliterator() {
        int i2 = this.f50583b;
        long[] jArr = this.f50582a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i2);
        return new j$.util.p1(jArr, 0, i2, DisplayStrings.DS_LOG_OUT);
    }

    public String toString() {
        long[] jArr = this.f50582a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f50583b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        int i2 = this.f50583b;
        long[] jArr = this.f50582a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i2);
        return new j$.util.p1(jArr, 0, i2, DisplayStrings.DS_LOG_OUT);
    }

    public q3(long[] jArr) {
        this.f50582a = jArr;
        this.f50583b = jArr.length;
    }
}
