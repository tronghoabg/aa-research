package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class RadioMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioMetadata> CREATOR = new defpackage.qua(11);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final com.google.android.gms.car.RadioMetadata.RadioProgramType d;
    public final android.net.Uri e;
    public final com.google.android.gms.car.RadioMetadata.RadioSongMetadata f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final android.graphics.Bitmap i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final java.lang.String m;
    public final boolean n;

    public static class RadioProgramType extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioMetadata.RadioProgramType> CREATOR = new defpackage.qua(15);
        public final int a;
        public final int b;

        public RadioProgramType(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.car.RadioMetadata.RadioProgramType)) {
                return false;
            }
            com.google.android.gms.car.RadioMetadata.RadioProgramType radioProgramType = (com.google.android.gms.car.RadioMetadata.RadioProgramType) obj;
            return this.a == radioProgramType.a && this.b == radioProgramType.b;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b));
        }

        public final java.lang.String toString() {
            return "RadioProgramType{schema=" + this.a + " code=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.v(parcel, 1, this.a);
            defpackage.sqs.v(parcel, 2, this.b);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public static class RadioSongMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.RadioMetadata.RadioSongMetadata> CREATOR = new defpackage.qua(16);
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final android.net.Uri e;
        public final long f;
        public final android.graphics.Bitmap g;

        public RadioSongMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, long j, android.graphics.Bitmap bitmap) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = uri;
            this.f = j;
            this.g = bitmap;
        }

        public final boolean equals(java.lang.Object obj) {
            android.graphics.Bitmap bitmap;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.car.RadioMetadata.RadioSongMetadata)) {
                return false;
            }
            com.google.android.gms.car.RadioMetadata.RadioSongMetadata radioSongMetadata = (com.google.android.gms.car.RadioMetadata.RadioSongMetadata) obj;
            return j$.util.Objects.equals(this.a, radioSongMetadata.a) && j$.util.Objects.equals(this.c, radioSongMetadata.c) && j$.util.Objects.equals(this.b, radioSongMetadata.b) && j$.util.Objects.equals(this.d, radioSongMetadata.d) && j$.util.Objects.equals(this.e, radioSongMetadata.e) && this.f == radioSongMetadata.f && ((bitmap = this.g) != null ? bitmap.sameAs(radioSongMetadata.g) : radioSongMetadata.g == null);
        }

        public final int hashCode() {
            return j$.util.Objects.hash(this.a, this.c, this.b, this.d, this.e, java.lang.Long.valueOf(this.f), this.g);
        }

        public final java.lang.String toString() {
            java.lang.String strValueOf = java.lang.String.valueOf(this.e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RadioSongMetadata{title=");
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
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.J(parcel, 1, this.a);
            defpackage.sqs.J(parcel, 2, this.b);
            defpackage.sqs.J(parcel, 3, this.c);
            defpackage.sqs.J(parcel, 4, this.d);
            defpackage.sqs.I(parcel, 5, this.e, i);
            defpackage.sqs.w(parcel, 6, this.f);
            defpackage.sqs.I(parcel, 7, this.g, i);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public RadioMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.car.RadioMetadata.RadioProgramType radioProgramType, android.net.Uri uri, com.google.android.gms.car.RadioMetadata.RadioSongMetadata radioSongMetadata, java.lang.String str4, java.lang.String str5, android.graphics.Bitmap bitmap, int i, boolean z, boolean z2, java.lang.String str6, boolean z3) {
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

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.RadioMetadata)) {
            return false;
        }
        com.google.android.gms.car.RadioMetadata radioMetadata = (com.google.android.gms.car.RadioMetadata) obj;
        return j$.util.Objects.equals(this.a, radioMetadata.a) && j$.util.Objects.equals(this.b, radioMetadata.b) && j$.util.Objects.equals(this.c, radioMetadata.c) && j$.util.Objects.equals(this.d, radioMetadata.d) && j$.util.Objects.equals(this.e, radioMetadata.e) && j$.util.Objects.equals(this.f, radioMetadata.f) && j$.util.Objects.equals(this.g, radioMetadata.g) && j$.util.Objects.equals(this.h, radioMetadata.h) && ((bitmap = this.i) != null ? bitmap.sameAs(radioMetadata.i) : radioMetadata.i == null) && this.j == radioMetadata.j && this.k == radioMetadata.k && this.l == radioMetadata.l && j$.util.Objects.equals(this.m, radioMetadata.m) && this.n == radioMetadata.n;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, java.lang.Integer.valueOf(this.j), java.lang.Boolean.valueOf(this.k), java.lang.Boolean.valueOf(this.l), this.m, java.lang.Boolean.valueOf(this.n));
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.RadioMetadata.RadioSongMetadata radioSongMetadata = this.f;
        android.net.Uri uri = this.e;
        java.lang.String strValueOf = java.lang.String.valueOf(this.d);
        java.lang.String strValueOf2 = java.lang.String.valueOf(uri);
        java.lang.String strValueOf3 = java.lang.String.valueOf(radioSongMetadata);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RadioMetadata{stationName=");
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
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.J(parcel, 1, this.a);
        defpackage.sqs.J(parcel, 2, this.b);
        defpackage.sqs.J(parcel, 3, this.c);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.I(parcel, 5, this.e, i);
        defpackage.sqs.I(parcel, 6, this.f, i);
        defpackage.sqs.J(parcel, 7, this.g);
        defpackage.sqs.J(parcel, 8, this.h);
        defpackage.sqs.I(parcel, 9, this.i, i);
        defpackage.sqs.v(parcel, 10, this.j);
        defpackage.sqs.r(parcel, 11, this.k);
        defpackage.sqs.r(parcel, 12, this.l);
        defpackage.sqs.J(parcel, 13, this.m);
        defpackage.sqs.r(parcel, 14, this.n);
        defpackage.sqs.q(parcel, iP);
    }
}
