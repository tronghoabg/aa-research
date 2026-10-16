package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class StreetViewPanoramaLocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.StreetViewPanoramaLocation> CREATOR = new com.google.android.libraries.maps.model.StreetViewPanoramaLocationCreator();
    public final com.google.android.libraries.maps.model.StreetViewPanoramaLink[] links;
    public final java.lang.String panoId;
    public final com.google.android.libraries.maps.model.LatLng position;

    public StreetViewPanoramaLocation(com.google.android.libraries.maps.model.StreetViewPanoramaLink[] streetViewPanoramaLinkArr, com.google.android.libraries.maps.model.LatLng latLng, java.lang.String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.StreetViewPanoramaLocation)) {
            return false;
        }
        com.google.android.libraries.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.libraries.maps.model.StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.position, this.panoId});
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("panoId", this.panoId, arrayList);
        defpackage.sqg.b("position", this.position.toString(), arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.M(parcel, 2, this.links, i);
        defpackage.sqs.I(parcel, 3, this.position, i);
        defpackage.sqs.J(parcel, 4, this.panoId);
        defpackage.sqs.q(parcel, iP);
    }
}
