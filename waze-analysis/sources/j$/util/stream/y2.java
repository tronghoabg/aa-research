package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class y2 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f50706a;

    /* renamed from: b, reason: collision with root package name */
    public int f50707b;

    public y2(long j2) {
        if (j2 >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            throw null;
        }
        this.f50706a = new double[(int) j2];
        this.f50707b = 0;
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final l2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l2
    public final Object b() {
        double[] dArr = this.f50706a;
        int length = dArr.length;
        int i2 = this.f50707b;
        return length == i2 ? dArr : Arrays.copyOf(dArr, i2);
    }

    @Override // j$.util.stream.l2
    public final void c(int i2, Object obj) {
        int i3 = this.f50707b;
        System.arraycopy(this.f50706a, 0, (double[]) obj, i2, i3);
    }

    @Override // j$.util.stream.m2
    public final long count() {
        return this.f50707b;
    }

    @Override // j$.util.stream.l2
    public final void d(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i2 = 0; i2 < this.f50707b; i2++) {
            doubleConsumer.accept(this.f50706a[i2]);
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.t(this, j2, j3);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void forEach(Consumer consumer) {
        d4.q(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void h(Object[] objArr, int i2) {
        d4.n(this, (Double[]) objArr, i2);
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
        int i2 = this.f50707b;
        double[] dArr = this.f50706a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i2);
        return new j$.util.i1(dArr, 0, i2, DisplayStrings.DS_LOG_OUT);
    }

    public String toString() {
        double[] dArr = this.f50706a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f50707b), Arrays.toString(dArr));
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        int i2 = this.f50707b;
        double[] dArr = this.f50706a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i2);
        return new j$.util.i1(dArr, 0, i2, DisplayStrings.DS_LOG_OUT);
    }

    public y2(double[] dArr) {
        this.f50706a = dArr;
        this.f50707b = dArr.length;
    }
}
