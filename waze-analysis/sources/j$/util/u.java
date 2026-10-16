package j$.util;

import androidx.camera.video.AudioStats;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public double f50730a;

    /* renamed from: b, reason: collision with root package name */
    public double f50731b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final void a(u uVar) {
        this.count += uVar.count;
        this.f50731b += uVar.f50731b;
        b(uVar.sum);
        b(uVar.f50730a);
        this.min = Math.min(this.min, uVar.min);
        this.max = Math.max(this.max, uVar.max);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.count++;
        this.f50731b += d2;
        b(d2);
        this.min = Math.min(this.min, d2);
        this.max = Math.max(this.max, d2);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public final void b(double d2) {
        double d3 = d2 - this.f50730a;
        double d4 = this.sum;
        double d5 = d4 + d3;
        this.f50730a = (d5 - d4) - d3;
        this.sum = d5;
    }

    public final String toString() {
        double d2;
        String simpleName = u.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d3 = this.sum + this.f50730a;
        if (Double.isNaN(d3) && Double.isInfinite(this.f50731b)) {
            d3 = this.f50731b;
        }
        Double dValueOf = Double.valueOf(d3);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d4 = this.sum + this.f50730a;
            if (Double.isNaN(d4) && Double.isInfinite(this.f50731b)) {
                d4 = this.f50731b;
            }
            d2 = d4 / this.count;
        } else {
            d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d2), Double.valueOf(this.max));
    }
}
