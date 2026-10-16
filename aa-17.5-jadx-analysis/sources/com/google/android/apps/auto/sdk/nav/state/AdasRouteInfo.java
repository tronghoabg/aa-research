package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class AdasRouteInfo extends AbstractBundleable {
    public static final Parcelable.Creator<AdasRouteInfo> CREATOR = new AbstractBundleable.BundleableCreator(AdasRouteInfo.class);
    public Path a;
    public Trip b;

    public static final class Path extends AbstractBundleable {
        public static final Parcelable.Creator<Path> CREATOR = new AbstractBundleable.BundleableCreator(Path.class);
        public int[] a;
        public int[] b;
        public int[] c;

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void b(Bundle bundle) {
            this.a = bundle.getIntArray("latitude_e7_diff");
            this.b = bundle.getIntArray("longitude_e7_diff");
            this.c = bundle.getIntArray("altitude_dm_diff");
        }

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void d(Bundle bundle) {
            bundle.putIntArray("latitude_e7_diff", this.a);
            bundle.putIntArray("longitude_e7_diff", this.b);
            bundle.putIntArray("altitude_dm_diff", this.c);
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

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        public final String toString() {
            return "Path{latitudeE7Diff=" + Arrays.toString(this.a) + ", longitudeE7Diff=" + Arrays.toString(this.b) + ", altitudeDmDiff=" + Arrays.toString(this.c) + "}";
        }
    }

    public static final class Trip extends AbstractBundleable {
        public static final Parcelable.Creator<Trip> CREATOR = new AbstractBundleable.BundleableCreator(Trip.class);
        public String a;
        public int b;
        public Path c;

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void b(Bundle bundle) {
            this.a = bundle.getString("identifier");
            this.b = bundle.getInt("sequence_number");
            this.c = (Path) bundle.getParcelable("most_probable_path");
        }

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void d(Bundle bundle) {
            bundle.putString("identifier", this.a);
            bundle.putInt("sequence_number", this.b);
            bundle.putParcelable("most_probable_path", this.c);
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

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        public final String toString() {
            return "Trip{identifier='" + this.a + "', sequenceNumber=" + this.b + ", mostProbablePath=" + String.valueOf(this.c) + "}";
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = (Path) bundle.getParcelable("path");
        this.b = (Trip) bundle.getParcelable("trip");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putParcelable("path", this.a);
        bundle.putParcelable("trip", this.b);
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

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "AdasRouteInfo{path=" + String.valueOf(this.a) + ", trip=" + String.valueOf(this.b) + "}";
    }
}
