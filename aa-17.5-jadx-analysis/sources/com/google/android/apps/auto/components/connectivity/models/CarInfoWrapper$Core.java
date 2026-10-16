package com.google.android.apps.auto.components.connectivity.models;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carsetup.CarInfoInternal;
import defpackage.aclh;
import defpackage.khy;

/* loaded from: classes2.dex */
public class CarInfoWrapper$Core implements Parcelable {
    public static final Parcelable.Creator<CarInfoWrapper$Core> CREATOR = new khy(3);
    public final BluetoothDevice a;
    public final CarInfoInternal b;
    public final int c;
    public final int d;

    public CarInfoWrapper$Core(Parcel parcel) {
        this.a = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.b = (CarInfoInternal) parcel.readParcelable(CarInfoInternal.class.getClassLoader());
        this.c = aclh.r()[parcel.readInt()];
        this.d = aclh.r()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        int i3 = this.d;
        if (i3 == 0) {
            throw null;
        }
        parcel.writeInt(i3 - 1);
    }

    public CarInfoWrapper$Core(BluetoothDevice bluetoothDevice, CarInfoInternal carInfoInternal, int i, int i2) {
        this.a = bluetoothDevice;
        this.b = carInfoInternal;
        this.c = i;
        this.d = i2;
    }
}
