package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m7 extends p7 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final double[] f50522c = new double[128];

    @Override // j$.util.stream.p7
    public final void a(Object obj, long j2) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i2 = 0; i2 < j2; i2++) {
            doubleConsumer.accept(this.f50522c[i2]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        int i2 = this.f50577b;
        this.f50577b = i2 + 1;
        this.f50522c[i2] = d2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }
}
