package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i3 extends h3 implements c2 {
    @Override // j$.util.stream.t5
    public final void accept(int i2) {
        int i3 = this.f50430b;
        int[] iArr = this.f50429a;
        if (i3 >= iArr.length) {
            j$.time.f.e("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(iArr.length)});
        } else {
            this.f50430b = i3 + 1;
            iArr[i3] = i2;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c2, j$.util.stream.e2
    public final i2 build() {
        int i2 = this.f50430b;
        int[] iArr = this.f50429a;
        if (i2 >= iArr.length) {
            return this;
        }
        j$.time.f.e("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(iArr.length)});
        return null;
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50430b;
        int[] iArr = this.f50429a;
        if (i2 >= iArr.length) {
            return;
        }
        j$.time.f.e("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(iArr.length)});
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        int[] iArr = this.f50429a;
        if (j2 == iArr.length) {
            this.f50430b = 0;
        } else {
            j$.time.f.e("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j2), Integer.valueOf(iArr.length)});
        }
    }

    @Override // j$.util.stream.r5
    public final /* synthetic */ void m(Integer num) {
        d4.g(this, num);
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.h3
    public final String toString() {
        int[] iArr = this.f50429a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f50430b), Arrays.toString(iArr));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        m((Integer) obj);
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
