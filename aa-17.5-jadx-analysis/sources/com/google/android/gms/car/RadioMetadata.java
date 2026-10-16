package com.google.android.gms.car;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class RadioMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RadioMetadata> CREATOR = new qte(11);
    public final String a;
    public final String b;
    public final String c;
    public final RadioProgramType d;
    public final Uri e;
    public final RadioSongMetadata f;
    public final String g;
    public final String h;
    public final Bitmap i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;

    public static class RadioProgramType extends AbstractSafeParcelable {
        public static final Parcelable.Creator<RadioProgramType> CREATOR = new qte(15);
        public final int a;
        public final int b;

        public RadioProgramType(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RadioProgramType)) {
                return false;
            }
            RadioProgramType radioProgramType = (RadioProgramType) obj;
            return this.a == radioProgramType.a && this.b == radioProgramType.b;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
        }

        public final String toString() {
            return "RadioProgramType{schema=" + this.a + " code=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.r(parcel, 1, this.a);
            spu.r(parcel, 2, this.b);
            spu.m(parcel, iL);
        }
    }

    public static class RadioSongMetadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator<RadioSongMetadata> CREATOR = new qte(16);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Uri e;
        public final long f;
        public final Bitmap g;

        public RadioSongMetadata(String str, String str2, String str3, String str4, Uri uri, long j, Bitmap bitmap) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = uri;
            this.f = j;
            this.g = bitmap;
        }

        public final boolean equals(Object obj) {
            Bitmap bitmap;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RadioSongMetadata)) {
                return false;
            }
            RadioSongMetadata radioSongMetadata = (RadioSongMetadata) obj;
            return Objects.equals(this.a, radioSongMetadata.a) && Objects.equals(this.c, radioSongMetadata.c) && Objects.equals(this.b, radioSongMetadata.b) && Objects.equals(this.d, radioSongMetadata.d) && Objects.equals(this.e, radioSongMetadata.e) && this.f == radioSongMetadata.f && ((bitmap = this.g) != null ? bitmap.sameAs(radioSongMetadata.g) : radioSongMetadata.g == null);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.c, this.b, this.d, this.e, Long.valueOf(this.f), this.g);
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.e);
            StringBuilder sb = new StringBuilder("RadioSongMetadata{title=");
            sb.append(this.a);
            sb.append(" album=");
            sb.append(this.c);
            sb.append(" artist=");
            sb.append(this.b);
            sb.append(" genre=");
            sb.append(this.d);
            sb.append(" albumArtUri=");
            sb.append(strValueOf);
            sb.append(" durationSeconds=");
            sb.append(this.f);
            sb.append(" hasAlbumArt=");
            sb.append(this.g != null);
            sb.append("}");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.F(parcel, 1, this.a);
            spu.F(parcel, 2, this.b);
            spu.F(parcel, 3, this.c);
            spu.F(parcel, 4, this.d);
            spu.E(parcel, 5, this.e, i);
            spu.s(parcel, 6, this.f);
            spu.E(parcel, 7, this.g, i);
            spu.m(parcel, iL);
        }
    }

    public RadioMetadata(String str, String str2, String str3, RadioProgramType radioProgramType, Uri uri, RadioSongMetadata radioSongMetadata, String str4, String str5, Bitmap bitmap, int i, boolean z, boolean z2, String str6, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = radioProgramType;
        this.e = uri;
        this.f = radioSongMetadata;
        this.g = str4;
        this.h = str5;
        this.i = bitmap;
        this.j = i;
        this.k = z;
        this.l = z2;
        this.m = str6;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioMetadata)) {
            return false;
        }
        RadioMetadata radioMetadata = (RadioMetadata) obj;
        return Objects.equals(this.a, radioMetadata.a) && Objects.equals(this.b, radioMetadata.b) && Objects.equals(this.c, radioMetadata.c) && Objects.equals(this.d, radioMetadata.d) && Objects.equals(this.e, radioMetadata.e) && Objects.equals(this.f, radioMetadata.f) && Objects.equals(this.g, radioMetadata.g) && Objects.equals(this.h, radioMetadata.h) && ((bitmap = this.i) != null ? bitmap.sameAs(radioMetadata.i) : radioMetadata.i == null) && this.j == radioMetadata.j && this.k == radioMetadata.k && this.l == radioMetadata.l && Objects.equals(this.m, radioMetadata.m) && this.n == radioMetadata.n;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Integer.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.m, Boolean.valueOf(this.n));
    }

    public final String toString() {
        RadioSongMetadata radioSongMetadata = this.f;
        Uri uri = this.e;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(uri);
        String strValueOf3 = String.valueOf(radioSongMetadata);
        StringBuilder sb = new StringBuilder("RadioMetadata{stationName=");
        sb.append(this.a);
        sb.append(" stationNameShort=");
        sb.append(this.b);
        sb.append(" stationNameLong=");
        sb.append(this.c);
        sb.append(" programType=");
        sb.append(strValueOf);
        sb.append(" stationIconUri=");
        sb.append(strValueOf2);
        sb.append(" songMetadata=");
        sb.append(strValueOf3);
        sb.append(" message=");
        sb.append(this.g);
        sb.append(" serviceName=");
        sb.append(this.h);
        sb.append(" hasStationIcon=");
        sb.append(this.i != null);
        sb.append(" hdSubChannelsAvailable=");
        sb.append(this.j);
        sb.append(" hdSignalAcquired=");
        sb.append(this.k);
        sb.append(" hdAudioAcquired=");
        sb.append(this.l);
        sb.append(" dabComponentName=");
        sb.append(this.m);
        sb.append(" dtsAutostageEnriched=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, this.a);
        spu.F(parcel, 2, this.b);
        spu.F(parcel, 3, this.c);
        spu.E(parcel, 4, this.d, i);
        spu.E(parcel, 5, this.e, i);
        spu.E(parcel, 6, this.f, i);
        spu.F(parcel, 7, this.g);
        spu.F(parcel, 8, this.h);
        spu.E(parcel, 9, this.i, i);
        spu.r(parcel, 10, this.j);
        spu.n(parcel, 11, this.k);
        spu.n(parcel, 12, this.l);
        spu.F(parcel, 13, this.m);
        spu.n(parcel, 14, this.n);
        spu.m(parcel, iL);
    }
}
