package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2961h1 extends C2956g1 implements A0 {
    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3044y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.A0, j$.util.stream.C0
    public final G0 a() {
        int i5 = this.f38193b;
        int[] iArr = this.f38192a;
        if (i5 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f38193b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        int[] iArr = this.f38192a;
        if (j8 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(iArr.length)));
        }
        this.f38193b = 0;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        int i10 = this.f38193b;
        int[] iArr = this.f38192a;
        if (i10 < iArr.length) {
            this.f38193b = 1 + i10;
            iArr[i10] = i5;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void k() {
        int i5 = this.f38193b;
        int[] iArr = this.f38192a;
        if (i5 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f38193b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C2956g1
    public final String toString() {
        int[] iArr = this.f38192a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f38193b), Arrays.toString(iArr));
    }
}
