package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class VisibleRegion extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.VisibleRegion> CREATOR = new com.google.android.libraries.maps.model.VisibleRegionCreator();
    public final com.google.android.libraries.maps.model.LatLng farLeft;
    public final com.google.android.libraries.maps.model.LatLng farRight;
    public final com.google.android.libraries.maps.model.LatLngBounds latLngBounds;
    public final com.google.android.libraries.maps.model.LatLng nearLeft;
    public final com.google.android.libraries.maps.model.LatLng nearRight;

    public VisibleRegion(com.google.android.libraries.maps.model.LatLng latLng, com.google.android.libraries.maps.model.LatLng latLng2, com.google.android.libraries.maps.model.LatLng latLng3, com.google.android.libraries.maps.model.LatLng latLng4, com.google.android.libraries.maps.model.LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.VisibleRegion)) {
            return false;
        }
        com.google.android.libraries.maps.model.VisibleRegion visibleRegion = (com.google.android.libraries.maps.model.VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("nearLeft", this.nearLeft, arrayList);
        defpackage.sqg.b("nearRight", this.nearRight, arrayList);
        defpackage.sqg.b("farLeft", this.farLeft, arrayList);
        defpackage.sqg.b("farRight", this.farRight, arrayList);
        defpackage.sqg.b("latLngBounds", this.latLngBounds, arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 2, this.nearLeft, i);
        defpackage.sqs.I(parcel, 3, this.nearRight, i);
        defpackage.sqs.I(parcel, 4, this.farLeft, i);
        defpackage.sqs.I(parcel, 5, this.farRight, i);
        defpackage.sqs.I(parcel, 6, this.latLngBounds, i);
        defpackage.sqs.q(parcel, iP);
    }
}
