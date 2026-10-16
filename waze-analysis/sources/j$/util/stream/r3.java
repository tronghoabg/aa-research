package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r3 extends q3 implements d2 {
    @Override // j$.util.stream.t5
    public final void accept(long j2) {
        int i2 = this.f50583b;
        long[] jArr = this.f50582a;
        if (i2 >= jArr.length) {
            j$.time.f.e("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(jArr.length)});
        } else {
            this.f50583b = i2 + 1;
            jArr[i2] = j2;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final k2 build() {
        int i2 = this.f50583b;
        long[] jArr = this.f50582a;
        if (i2 >= jArr.length) {
            return this;
        }
        j$.time.f.e("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(jArr.length)});
        return null;
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50583b;
        long[] jArr = this.f50582a;
        if (i2 >= jArr.length) {
            return;
        }
        j$.time.f.e("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(jArr.length)});
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        long[] jArr = this.f50582a;
        if (j2 == jArr.length) {
            this.f50583b = 0;
        } else {
            j$.time.f.e("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j2), Integer.valueOf(jArr.length)});
        }
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.q3
    public final String toString() {
        long[] jArr = this.f50582a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f50583b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        d4.i(this, l2);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        u((Long) obj);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ m2 build() {
        build();
        return this;
    }
}
