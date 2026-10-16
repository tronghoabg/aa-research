package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class Y0 extends X0 implements InterfaceC3049z0 {
    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
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
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC3049z0, j$.util.stream.C0
    public final E0 a() {
        int i5 = this.f38129b;
        double[] dArr = this.f38128a;
        if (i5 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f38129b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        double[] dArr = this.f38128a;
        if (j8 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j8), Integer.valueOf(dArr.length)));
        }
        this.f38129b = 0;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        int i5 = this.f38129b;
        double[] dArr = this.f38128a;
        if (i5 < dArr.length) {
            this.f38129b = 1 + i5;
            dArr[i5] = d3;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void k() {
        int i5 = this.f38129b;
        double[] dArr = this.f38128a;
        if (i5 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f38129b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.X0
    public final String toString() {
        double[] dArr = this.f38128a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f38129b), Arrays.toString(dArr));
    }
}
