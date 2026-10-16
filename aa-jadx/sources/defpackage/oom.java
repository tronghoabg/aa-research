package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oom {
    public final int a;
    public final int b;
    public final int c;
    public final j$.time.Instant d;
    public final int e;
    public final int f;
    private final int g;

    public oom(int i, int i2, int i3, int i4, int i5, int i6, j$.time.Instant instant) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.g = i4;
        this.e = i5;
        this.f = i6;
        this.d = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oom) {
            defpackage.oom oomVar = (defpackage.oom) obj;
            if (this.a == oomVar.a && this.b == oomVar.b && this.c == oomVar.c) {
                int i = this.g;
                int i2 = oomVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.e;
                    int i4 = oomVar.e;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        int i5 = this.f;
                        int i6 = oomVar.f;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6 && this.d.equals(oomVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        defpackage.a.aI(i);
        int i2 = this.e;
        defpackage.a.aV(i2);
        int i3 = this.f;
        defpackage.a.aV(i3);
        return this.d.hashCode() ^ ((((((i ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003)) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        switch (this.g) {
            case com.google.android.projection.gearhead.R.string.temperature_celsius /* 2132085377 */:
                str = "CELSIUS";
                break;
            case com.google.android.projection.gearhead.R.string.temperature_fahrenheit /* 2132085378 */:
                str = "FAHRENHEIT";
                break;
            default:
                str = "null";
                break;
        }
        int i = this.c;
        int i2 = this.b;
        int i3 = this.a;
        int i4 = this.e;
        int i5 = this.f;
        j$.time.Instant instant = this.d;
        return "WeatherDisplayData{temperature=" + i3 + ", high=" + i2 + ", low=" + i + ", temperatureUnit=" + str + ", condition=" + (i4 != 0 ? java.lang.Integer.toString(i4 - 1) : "null") + ", partOfDay=" + (i5 != 0 ? java.lang.Integer.toString(i5 - 1) : "null") + ", expirationTime=" + java.lang.String.valueOf(instant) + "}";
    }

    public oom() {
        throw null;
    }
}
