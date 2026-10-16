package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z2 extends y2 implements b2 {
    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        int i2 = this.f50707b;
        double[] dArr = this.f50706a;
        if (i2 >= dArr.length) {
            j$.time.f.e("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(dArr.length)});
        } else {
            this.f50707b = i2 + 1;
            dArr[i2] = d2;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.b2, j$.util.stream.e2
    public final g2 build() {
        int i2 = this.f50707b;
        double[] dArr = this.f50706a;
        if (i2 >= dArr.length) {
            return this;
        }
        j$.time.f.e("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(dArr.length)});
        return null;
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50707b;
        double[] dArr = this.f50706a;
        if (i2 >= dArr.length) {
            return;
        }
        j$.time.f.e("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(dArr.length)});
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        double[] dArr = this.f50706a;
        if (j2 == dArr.length) {
            this.f50707b = 0;
        } else {
            j$.time.f.e("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j2), Integer.valueOf(dArr.length)});
        }
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.y2
    public final String toString() {
        double[] dArr = this.f50706a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f50707b), Arrays.toString(dArr));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        C((Double) obj);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ m2 build() {
        build();
        return this;
    }
}
