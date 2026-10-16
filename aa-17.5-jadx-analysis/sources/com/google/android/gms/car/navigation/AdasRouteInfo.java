package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class AdasRouteInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdasRouteInfo> CREATOR = new rrn(1);
    public final Path a;
    public final Trip b;

    public static final class Path extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Path> CREATOR = new rrn(13);
        public final int[] a;
        public final int[] b;
        public final int[] c;

        public Path(int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = iArr;
            this.b = iArr2;
            this.c = iArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Path) {
                Path path = (Path) obj;
                if (Arrays.equals(this.a, path.a) && Arrays.equals(this.b, path.b) && Arrays.equals(this.c, path.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)));
        }

        public final String toString() {
            int[] iArr = this.c;
            int[] iArr2 = this.b;
            return "Path{latitudeE7Diff=" + Arrays.toString(this.a) + ", longitudeE7Diff=" + Arrays.toString(iArr2) + ", altitudeDmDiff=" + Arrays.toString(iArr) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int[] iArr = this.a;
            int iL = spu.l(parcel, 20293);
            spu.z(parcel, 1, iArr);
            spu.z(parcel, 2, this.b);
            spu.z(parcel, 3, this.c);
            spu.m(parcel, iL);
        }
    }

    public static final class Trip extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Trip> CREATOR = new rrn(16);
        public final String a;
        public final int b;
        public final Path c;

        public Trip(String str, int i, Path path) {
            this.a = str;
            this.b = i;
            this.c = path;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Trip) {
                Trip trip = (Trip) obj;
                if (this.b == trip.b && Objects.equals(this.a, trip.a) && Objects.equals(this.c, trip.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c);
        }

        public final String toString() {
            return "Trip{identifier='" + this.a + "', sequenceNumber=" + this.b + ", mostProbablePath=" + String.valueOf(this.c) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int iL = spu.l(parcel, 20293);
            spu.F(parcel, 1, str);
            spu.r(parcel, 2, this.b);
            spu.E(parcel, 3, this.c, i);
            spu.m(parcel, iL);
        }
    }

    public AdasRouteInfo(Path path, Trip trip) {
        this.a = path;
        this.b = trip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdasRouteInfo) {
            AdasRouteInfo adasRouteInfo = (AdasRouteInfo) obj;
            if (Objects.equals(this.a, adasRouteInfo.a) && Objects.equals(this.b, adasRouteInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Trip trip = this.b;
        return "AdasRouteInfo{path=" + String.valueOf(this.a) + ", trip=" + String.valueOf(trip) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Path path = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, path, i);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
