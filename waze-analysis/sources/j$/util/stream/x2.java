package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class x2 extends o2 {
    @Override // j$.util.stream.m2
    public final m2 f(long j2, long j3, IntFunction intFunction) {
        if (j2 == 0 && j3 == this.f50554c) {
            return this;
        }
        long jCount = this.f50552a.count();
        if (j2 >= jCount) {
            return this.f50553b.f(j2 - jCount, j3 - jCount, intFunction);
        }
        m2 m2Var = this.f50552a;
        if (j3 <= jCount) {
            return m2Var.f(j2, j3, intFunction);
        }
        return d4.C(k7.REFERENCE, m2Var.f(j2, jCount, intFunction), this.f50553b.f(0L, j3 - jCount, intFunction));
    }

    @Override // j$.util.stream.m2
    public final void forEach(Consumer consumer) {
        this.f50552a.forEach(consumer);
        this.f50553b.forEach(consumer);
    }

    @Override // j$.util.stream.m2
    public final void h(Object[] objArr, int i2) {
        Objects.requireNonNull(objArr);
        m2 m2Var = this.f50552a;
        m2Var.h(objArr, i2);
        this.f50553b.h(objArr, i2 + ((int) m2Var.count()));
    }

    @Override // j$.util.stream.m2
    public final Object[] k(IntFunction intFunction) {
        long j2 = this.f50554c;
        if (j2 >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j2);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        return new o3(this);
    }

    public final String toString() {
        long j2 = this.f50554c;
        return j2 < 32 ? String.format("ConcNode[%s.%s]", this.f50552a, this.f50553b) : String.format("ConcNode[size=%d]", Long.valueOf(j2));
    }
}
