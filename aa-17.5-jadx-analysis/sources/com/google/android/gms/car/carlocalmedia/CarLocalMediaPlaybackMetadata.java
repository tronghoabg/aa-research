package com.google.android.gms.car.carlocalmedia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CarLocalMediaPlaybackMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarLocalMediaPlaybackMetadata> CREATOR = new qte(20);
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final int e;

    public CarLocalMediaPlaybackMetadata(String str, String str2, String str3, byte[] bArr, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocalMediaPlaybackMetadata)) {
            return false;
        }
        CarLocalMediaPlaybackMetadata carLocalMediaPlaybackMetadata = (CarLocalMediaPlaybackMetadata) obj;
        return Objects.equals(this.a, carLocalMediaPlaybackMetadata.a) && Objects.equals(this.b, carLocalMediaPlaybackMetadata.b) && Objects.equals(this.c, carLocalMediaPlaybackMetadata.c) && Arrays.equals(this.d, carLocalMediaPlaybackMetadata.d) && this.e == carLocalMediaPlaybackMetadata.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(this.e));
    }

    public final String toString() {
        byte[] bArr = this.d;
        boolean z = false;
        if (bArr != null && bArr.length > 0) {
            z = true;
        }
        String str = this.c;
        String str2 = this.b;
        return "CarLocalMediaPlaybackMetadata{song='" + this.a + "', artist='" + str2 + "', album='" + str + "', albumArt present=" + z + ", durationSeconds=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, this.a);
        spu.F(parcel, 2, this.b);
        spu.F(parcel, 3, this.c);
        spu.v(parcel, 4, this.d);
        spu.r(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
