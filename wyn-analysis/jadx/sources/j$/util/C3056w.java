package j$.util;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3056w implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    private double f38367a;

    /* renamed from: b, reason: collision with root package name */
    private double f38368b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        this.count++;
        this.f38368b += d3;
        c(d3);
        this.min = Math.min(this.min, d3);
        this.max = Math.max(this.max, d3);
    }

    public final void b(C3056w c3056w) {
        this.count += c3056w.count;
        this.f38368b += c3056w.f38368b;
        c(c3056w.sum);
        c(c3056w.f38367a);
        this.min = Math.min(this.min, c3056w.min);
        this.max = Math.max(this.max, c3056w.max);
    }

    private void c(double d3) {
        double d5 = d3 - this.f38367a;
        double d10 = this.sum;
        double d11 = d10 + d5;
        this.f38367a = (d11 - d10) - d5;
        this.sum = d11;
    }

    public final String toString() {
        double d3;
        String simpleName = C3056w.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d5 = this.sum + this.f38367a;
        if (Double.isNaN(d5) && Double.isInfinite(this.f38368b)) {
            d5 = this.f38368b;
        }
        Double dValueOf = Double.valueOf(d5);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d10 = this.sum + this.f38367a;
            if (Double.isNaN(d10) && Double.isInfinite(this.f38368b)) {
                d10 = this.f38368b;
            }
            d3 = d10 / this.count;
        } else {
            d3 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d3), Double.valueOf(this.max));
    }
}
