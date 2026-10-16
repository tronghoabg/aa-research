package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlayLoggerContext> CREATOR = new rcd(16);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (Objects.equals(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && Objects.equals(this.f, playLoggerContext.f) && Objects.equals(this.d, playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && Objects.equals(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        String str = this.a;
        if (str != null) {
            int iL2 = spu.l(parcel, 2);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        int i2 = this.b;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        int i3 = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        String str2 = this.d;
        if (str2 != null) {
            int iL3 = spu.l(parcel, 5);
            parcel.writeString(str2);
            spu.m(parcel, iL3);
        }
        boolean z = this.e;
        parcel.writeInt(262151);
        parcel.writeInt(z ? 1 : 0);
        String str3 = this.f;
        if (str3 != null) {
            int iL4 = spu.l(parcel, 8);
            parcel.writeString(str3);
            spu.m(parcel, iL4);
        }
        boolean z2 = this.g;
        parcel.writeInt(262153);
        parcel.writeInt(z2 ? 1 : 0);
        int i4 = this.h;
        parcel.writeInt(262154);
        parcel.writeInt(i4);
        spu.B(parcel, 11, this.i);
        boolean z3 = this.j;
        parcel.writeInt(262156);
        parcel.writeInt(z3 ? 1 : 0);
        int i5 = this.k;
        parcel.writeInt(262157);
        parcel.writeInt(i5);
        spu.m(parcel, iL);
    }
}
