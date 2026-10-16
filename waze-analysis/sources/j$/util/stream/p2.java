package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class p2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f50565a;

    /* renamed from: b, reason: collision with root package name */
    public int f50566b;

    public p2(long j2, IntFunction intFunction) {
        if (j2 >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            throw null;
        }
        this.f50565a = (Object[]) intFunction.apply((int) j2);
        this.f50566b = 0;
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.m2
    public final long count() {
        return this.f50566b;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.w(this, j2, j3, intFunction);
    }

    @Override // j$.util.stream.m2
    public final void forEach(Consumer consumer) {
        for (int i2 = 0; i2 < this.f50566b; i2++) {
            consumer.u(this.f50565a[i2]);
        }
    }

    @Override // j$.util.stream.m2
    public final void h(Object[] objArr, int i2) {
        System.arraycopy(this.f50565a, 0, objArr, i2, this.f50566b);
    }

    @Override // j$.util.stream.m2
    public final Object[] k(IntFunction intFunction) {
        Object[] objArr = this.f50565a;
        if (objArr.length == this.f50566b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.m2
    public final int s() {
        return 0;
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        return Spliterators.b(this.f50565a, 0, this.f50566b, DisplayStrings.DS_LOG_OUT);
    }

    public String toString() {
        Object[] objArr = this.f50565a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f50566b), Arrays.toString(objArr));
    }

    public p2(Object[] objArr) {
        this.f50565a = objArr;
        this.f50566b = objArr.length;
    }
}
