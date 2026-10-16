package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ParcelableBinder implements Parcelable {
    public static final Parcelable.Creator<ParcelableBinder> CREATOR = new Parcelable.Creator<ParcelableBinder>() { // from class: com.google.android.apps.search.assistant.platform.appintegration.grpc.ParcelableBinder.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableBinder createFromParcel(Parcel parcel) {
            return new ParcelableBinder(parcel.readStrongBinder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableBinder[] newArray(int i2) {
            return new ParcelableBinder[i2];
        }
    };
    private final IBinder binder;

    public ParcelableBinder(IBinder iBinder) {
        this.binder = iBinder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IBinder getBinder() {
        return this.binder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.binder);
    }
}
