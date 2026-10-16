package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class PointOfInterest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.PointOfInterest> CREATOR = new com.google.android.libraries.maps.model.PointOfInterestCreator();
    public final com.google.android.libraries.maps.model.LatLng latLng;
    public final java.lang.String name;
    public final java.lang.String placeId;

    public PointOfInterest(com.google.android.libraries.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 2, this.latLng, i);
        defpackage.sqs.J(parcel, 3, this.placeId);
        defpackage.sqs.J(parcel, 4, this.name);
        defpackage.sqs.q(parcel, iP);
    }
}
