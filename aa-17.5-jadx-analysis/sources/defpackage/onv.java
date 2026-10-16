package defpackage;

import com.google.android.projection.gearhead.R;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class onv {
    public final int a;
    public final int b;
    public final int c;
    public final Instant d;
    public final int e;
    public final int f;
    private final int g;

    public onv(int i, int i2, int i3, int i4, int i5, int i6, Instant instant) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.g = i4;
        this.e = i5;
        this.f = i6;
        this.d = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof onv) {
            onv onvVar = (onv) obj;
            if (this.a == onvVar.a && this.b == onvVar.b && this.c == onvVar.c) {
                int i = this.g;
                int i2 = onvVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.e;
                    int i4 = onvVar.e;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        int i5 = this.f;
                        int i6 = onvVar.f;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6 && this.d.equals(onvVar.d)) {
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
        a.aJ(i);
        int i2 = this.e;
        a.aW(i2);
        int i3 = this.f;
        a.aW(i3);
        return this.d.hashCode() ^ ((((((i ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003)) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003);
    }

    public final String toString() {
        String str;
        switch (this.g) {
            case R.string.temperature_celsius /* 2132085350 */:
                str = "CELSIUS";
                break;
            case R.string.temperature_fahrenheit /* 2132085351 */:
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
        Instant instant = this.d;
        return "WeatherDisplayData{temperature=" + i3 + ", high=" + i2 + ", low=" + i + ", temperatureUnit=" + str + ", condition=" + (i4 != 0 ? Integer.toString(i4 - 1) : "null") + ", partOfDay=" + (i5 != 0 ? Integer.toString(i5 - 1) : "null") + ", expirationTime=" + String.valueOf(instant) + "}";
    }

    public onv() {
        throw null;
    }
}
