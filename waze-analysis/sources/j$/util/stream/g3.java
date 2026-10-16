package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g3 extends p2 implements e2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        int i2 = this.f50566b;
        Object[] objArr = this.f50565a;
        if (i2 >= objArr.length) {
            j$.time.f.e("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(objArr.length)});
        } else {
            this.f50566b = i2 + 1;
            objArr[i2] = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final m2 build() {
        int i2 = this.f50566b;
        Object[] objArr = this.f50565a;
        if (i2 >= objArr.length) {
            return this;
        }
        j$.time.f.e("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(objArr.length)});
        return null;
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50566b;
        Object[] objArr = this.f50565a;
        if (i2 >= objArr.length) {
            return;
        }
        j$.time.f.e("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(objArr.length)});
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        Object[] objArr = this.f50565a;
        if (j2 == objArr.length) {
            this.f50566b = 0;
        } else {
            j$.time.f.e("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j2), Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.p2
    public final String toString() {
        Object[] objArr = this.f50565a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f50566b), Arrays.toString(objArr));
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }
}
