package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class t3 extends x3 implements q5 {

    /* renamed from: h, reason: collision with root package name */
    public final double[] f50616h;

    public t3(t3 t3Var, Spliterator spliterator, long j2, long j3) {
        super(t3Var, spliterator, j2, j3, t3Var.f50616h.length);
        this.f50616h = t3Var.f50616h;
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.x3
    public final x3 a(Spliterator spliterator, long j2, long j3) {
        return new t3(this, spliterator, j2, j3);
    }

    @Override // j$.util.stream.x3, j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        int i2 = this.f50684f;
        if (i2 >= this.f50685g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        double[] dArr = this.f50616h;
        this.f50684f = i2 + 1;
        dArr[i2] = d2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public t3(Spliterator spliterator, a aVar, double[] dArr) {
        super(spliterator, aVar, dArr.length);
        this.f50616h = dArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        C((Double) obj);
    }
}
