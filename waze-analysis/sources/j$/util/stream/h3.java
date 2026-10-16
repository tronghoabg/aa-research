package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class h3 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f50429a;

    /* renamed from: b, reason: collision with root package name */
    public int f50430b;

    public h3(long j2) {
        if (j2 >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            throw null;
        }
        this.f50429a = new int[(int) j2];
        this.f50430b = 0;
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final l2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l2
    public final Object b() {
        int[] iArr = this.f50429a;
        int length = iArr.length;
        int i2 = this.f50430b;
        return length == i2 ? iArr : Arrays.copyOf(iArr, i2);
    }

    @Override // j$.util.stream.l2
    public final void c(int i2, Object obj) {
        int i3 = this.f50430b;
        System.arraycopy(this.f50429a, 0, (int[]) obj, i2, i3);
    }

    @Override // j$.util.stream.m2
    public final long count() {
        return this.f50430b;
    }

    @Override // j$.util.stream.l2
    public final void d(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i2 = 0; i2 < this.f50430b; i2++) {
            intConsumer.accept(this.f50429a[i2]);
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.u(this, j2, j3);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void forEach(Consumer consumer) {
        d4.r(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void h(Object[] objArr, int i2) {
        d4.o(this, (Integer[]) objArr, i2);
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
        return Spliterators.spliterator(this.f50429a, 0, this.f50430b, DisplayStrings.DS_LOG_OUT);
    }

    public String toString() {
        int[] iArr = this.f50429a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f50430b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f50429a, 0, this.f50430b, DisplayStrings.DS_LOG_OUT);
    }

    public h3(int[] iArr) {
        this.f50429a = iArr;
        this.f50430b = iArr.length;
    }
}
