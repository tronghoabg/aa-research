package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public final class AdasRouteInfo extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.class);
    public com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path a;
    public com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip b;

    public static final class Path extends com.google.android.apps.auto.sdk.AbstractBundleable {
        public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path.class);
        public int[] a;
        public int[] b;
        public int[] c;

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void b(android.os.Bundle bundle) {
            this.a = bundle.getIntArray("latitude_e7_diff");
            this.b = bundle.getIntArray("longitude_e7_diff");
            this.c = bundle.getIntArray("altitude_dm_diff");
        }

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void d(android.os.Bundle bundle) {
            bundle.putIntArray("latitude_e7_diff", this.a);
            bundle.putIntArray("longitude_e7_diff", this.b);
            bundle.putIntArray("altitude_dm_diff", this.c);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path) {
                com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path path = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path) obj;
                if (java.util.Arrays.equals(this.a, path.a) && java.util.Arrays.equals(this.b, path.b) && java.util.Arrays.equals(this.c, path.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.c)));
        }

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        public final java.lang.String toString() {
            return "Path{latitudeE7Diff=" + java.util.Arrays.toString(this.a) + ", longitudeE7Diff=" + java.util.Arrays.toString(this.b) + ", altitudeDmDiff=" + java.util.Arrays.toString(this.c) + "}";
        }
    }

    public static final class Trip extends com.google.android.apps.auto.sdk.AbstractBundleable {
        public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip.class);
        public java.lang.String a;
        public int b;
        public com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path c;

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void b(android.os.Bundle bundle) {
            this.a = bundle.getString("identifier");
            this.b = bundle.getInt("sequence_number");
            this.c = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path) bundle.getParcelable("most_probable_path");
        }

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        protected final void d(android.os.Bundle bundle) {
            bundle.putString("identifier", this.a);
            bundle.putInt("sequence_number", this.b);
            bundle.putParcelable("most_probable_path", this.c);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip) {
                com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip trip = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip) obj;
                if (this.b == trip.b && j$.util.Objects.equals(this.a, trip.a) && j$.util.Objects.equals(this.c, trip.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(this.a, java.lang.Integer.valueOf(this.b), this.c);
        }

        @Override // com.google.android.apps.auto.sdk.AbstractBundleable
        public final java.lang.String toString() {
            return "Trip{identifier='" + this.a + "', sequenceNumber=" + this.b + ", mostProbablePath=" + java.lang.String.valueOf(this.c) + "}";
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Path) bundle.getParcelable("path");
        this.b = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.Trip) bundle.getParcelable("trip");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putParcelable("path", this.a);
        bundle.putParcelable("trip", this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo) {
            com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo adasRouteInfo = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo) obj;
            if (j$.util.Objects.equals(this.a, adasRouteInfo.a) && j$.util.Objects.equals(this.b, adasRouteInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "AdasRouteInfo{path=" + java.lang.String.valueOf(this.a) + ", trip=" + java.lang.String.valueOf(this.b) + "}";
    }
}
