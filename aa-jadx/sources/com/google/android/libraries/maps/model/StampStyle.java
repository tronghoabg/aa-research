package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class StampStyle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.StampStyle> CREATOR = new com.google.android.libraries.maps.model.StampStyleCreator();
    protected final com.google.android.libraries.maps.model.BitmapDescriptor a;

    public StampStyle(android.os.IBinder iBinder) {
        defpackage.srh srfVar;
        if (iBinder == null) {
            srfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(iBinder);
        }
        this.a = new com.google.android.libraries.maps.model.BitmapDescriptor(srfVar);
    }

    public boolean asSprite() {
        return false;
    }

    public com.google.android.libraries.maps.model.BitmapDescriptor getStamp() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.C(parcel, 2, bitmapDescriptor.getRemoteObject().asBinder());
        defpackage.sqs.q(parcel, iP);
    }

    protected StampStyle(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.a = bitmapDescriptor;
    }
}
