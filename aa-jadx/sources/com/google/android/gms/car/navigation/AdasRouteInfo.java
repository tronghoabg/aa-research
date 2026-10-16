package com.google.android.gms.car.navigation;

/* JADX INFO: loaded from: classes2.dex */
public final class AdasRouteInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.navigation.AdasRouteInfo> CREATOR = new defpackage.rsh(1);
    public final com.google.android.gms.car.navigation.AdasRouteInfo.Path a;
    public final com.google.android.gms.car.navigation.AdasRouteInfo.Trip b;

    public static final class Path extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.navigation.AdasRouteInfo.Path> CREATOR = new defpackage.rsh(13);
        public final int[] a;
        public final int[] b;
        public final int[] c;

        public Path(int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = iArr;
            this.b = iArr2;
            this.c = iArr3;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.gms.car.navigation.AdasRouteInfo.Path) {
                com.google.android.gms.car.navigation.AdasRouteInfo.Path path = (com.google.android.gms.car.navigation.AdasRouteInfo.Path) obj;
                if (java.util.Arrays.equals(this.a, path.a) && java.util.Arrays.equals(this.b, path.b) && java.util.Arrays.equals(this.c, path.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.c)));
        }

        public final java.lang.String toString() {
            int[] iArr = this.c;
            int[] iArr2 = this.b;
            return "Path{latitudeE7Diff=" + java.util.Arrays.toString(this.a) + ", longitudeE7Diff=" + java.util.Arrays.toString(iArr2) + ", altitudeDmDiff=" + java.util.Arrays.toString(iArr) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int[] iArr = this.a;
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.D(parcel, 1, iArr);
            defpackage.sqs.D(parcel, 2, this.b);
            defpackage.sqs.D(parcel, 3, this.c);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public static final class Trip extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.navigation.AdasRouteInfo.Trip> CREATOR = new defpackage.rsh(16);
        public final java.lang.String a;
        public final int b;
        public final com.google.android.gms.car.navigation.AdasRouteInfo.Path c;

        public Trip(java.lang.String str, int i, com.google.android.gms.car.navigation.AdasRouteInfo.Path path) {
            this.a = str;
            this.b = i;
            this.c = path;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.gms.car.navigation.AdasRouteInfo.Trip) {
                com.google.android.gms.car.navigation.AdasRouteInfo.Trip trip = (com.google.android.gms.car.navigation.AdasRouteInfo.Trip) obj;
                if (this.b == trip.b && j$.util.Objects.equals(this.a, trip.a) && j$.util.Objects.equals(this.c, trip.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(this.a, java.lang.Integer.valueOf(this.b), this.c);
        }

        public final java.lang.String toString() {
            return "Trip{identifier='" + this.a + "', sequenceNumber=" + this.b + ", mostProbablePath=" + java.lang.String.valueOf(this.c) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            java.lang.String str = this.a;
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.J(parcel, 1, str);
            defpackage.sqs.v(parcel, 2, this.b);
            defpackage.sqs.I(parcel, 3, this.c, i);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public AdasRouteInfo(com.google.android.gms.car.navigation.AdasRouteInfo.Path path, com.google.android.gms.car.navigation.AdasRouteInfo.Trip trip) {
        this.a = path;
        this.b = trip;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.navigation.AdasRouteInfo) {
            com.google.android.gms.car.navigation.AdasRouteInfo adasRouteInfo = (com.google.android.gms.car.navigation.AdasRouteInfo) obj;
            if (j$.util.Objects.equals(this.a, adasRouteInfo.a) && j$.util.Objects.equals(this.b, adasRouteInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.navigation.AdasRouteInfo.Trip trip = this.b;
        return "AdasRouteInfo{path=" + java.lang.String.valueOf(this.a) + ", trip=" + java.lang.String.valueOf(trip) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.car.navigation.AdasRouteInfo.Path path = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, path, i);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
