package com.google.android.gms.car.carlocalmedia;

/* JADX INFO: loaded from: classes2.dex */
public final class CarLocalMediaPlaybackRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest> CREATOR = new defpackage.rih(1);
    public final int a;

    public CarLocalMediaPlaybackRequest(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest) && this.a == ((com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarLocalMediaPlaybackRequest{action=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.q(parcel, iP);
    }
}
