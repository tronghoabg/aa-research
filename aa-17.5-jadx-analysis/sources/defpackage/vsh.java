package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
public final class vsh implements vqu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public vsh(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ aezk b() {
        return null;
    }

    @Override // defpackage.vqu
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vsh)) {
            return false;
        }
        vsh vshVar = (vsh) obj;
        int i = this.f;
        int i2 = vshVar.f;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 && this.a == vshVar.a && this.b == vshVar.b && this.c == vshVar.c && this.d == vshVar.d) {
            if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(vshVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.aJ(this.f);
        double d = this.e;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        return ((this.d ^ ((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003)) * 1000003) ^ ((int) jDoubleToLongBits);
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + vqv.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + "}";
    }

    public vsh() {
        throw null;
    }
}
