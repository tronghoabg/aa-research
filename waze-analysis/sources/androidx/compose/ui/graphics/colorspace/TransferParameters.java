package androidx.compose.ui.graphics.colorspace;

import androidx.camera.video.AudioStats;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransferParameters {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final double f1673a;

    /* renamed from: b, reason: collision with root package name */
    private final double f1674b;

    /* renamed from: c, reason: collision with root package name */
    private final double f1675c;

    /* renamed from: d, reason: collision with root package name */
    private final double f1676d;

    /* renamed from: e, reason: collision with root package name */
    private final double f1677e;

    /* renamed from: f, reason: collision with root package name */
    private final double f1678f;
    private final double gamma;

    public TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.gamma = d2;
        this.f1673a = d3;
        this.f1674b = d4;
        this.f1675c = d5;
        this.f1676d = d6;
        this.f1677e = d7;
        this.f1678f = d8;
        if (Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (TransferParametersKt.isSpecialG(d2)) {
            return;
        }
        if (d6 < AudioStats.AUDIO_AMPLITUDE_NONE || d6 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d6);
        }
        if (d6 == AudioStats.AUDIO_AMPLITUDE_NONE && (d3 == AudioStats.AUDIO_AMPLITUDE_NONE || d2 == AudioStats.AUDIO_AMPLITUDE_NONE)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d6 >= 1.0d && d5 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d3 == AudioStats.AUDIO_AMPLITUDE_NONE || d2 == AudioStats.AUDIO_AMPLITUDE_NONE) && d5 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d5 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d3 < AudioStats.AUDIO_AMPLITUDE_NONE || d2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f1673a;
    }

    public final double component3() {
        return this.f1674b;
    }

    public final double component4() {
        return this.f1675c;
    }

    public final double component5() {
        return this.f1676d;
    }

    public final double component6() {
        return this.f1677e;
    }

    public final double component7() {
        return this.f1678f;
    }

    public final TransferParameters copy(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return new TransferParameters(d2, d3, d4, d5, d6, d7, d8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f1673a, transferParameters.f1673a) == 0 && Double.compare(this.f1674b, transferParameters.f1674b) == 0 && Double.compare(this.f1675c, transferParameters.f1675c) == 0 && Double.compare(this.f1676d, transferParameters.f1676d) == 0 && Double.compare(this.f1677e, transferParameters.f1677e) == 0 && Double.compare(this.f1678f, transferParameters.f1678f) == 0;
    }

    public final double getA() {
        return this.f1673a;
    }

    public final double getB() {
        return this.f1674b;
    }

    public final double getC() {
        return this.f1675c;
    }

    public final double getD() {
        return this.f1676d;
    }

    public final double getE() {
        return this.f1677e;
    }

    public final double getF() {
        return this.f1678f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((TransferParameters$$ExternalSyntheticBackport0.m(this.gamma) * 31) + TransferParameters$$ExternalSyntheticBackport0.m(this.f1673a)) * 31) + TransferParameters$$ExternalSyntheticBackport0.m(this.f1674b)) * 31) + TransferParameters$$ExternalSyntheticBackport0.m(this.f1675c)) * 31) + TransferParameters$$ExternalSyntheticBackport0.m(this.f1676d)) * 31) + TransferParameters$$ExternalSyntheticBackport0.m(this.f1677e)) * 31) + TransferParameters$$ExternalSyntheticBackport0.m(this.f1678f);
    }

    public final boolean isHLGish$ui_graphics() {
        return this.gamma == -3.0d;
    }

    public final boolean isPQish$ui_graphics() {
        return this.gamma == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f1673a + ", b=" + this.f1674b + ", c=" + this.f1675c + ", d=" + this.f1676d + ", e=" + this.f1677e + ", f=" + this.f1678f + ')';
    }

    public /* synthetic */ TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, o oVar) {
        this(d2, d3, d4, d5, d6, (i2 & 32) != 0 ? 0.0d : d7, (i2 & 64) != 0 ? 0.0d : d8);
    }
}
