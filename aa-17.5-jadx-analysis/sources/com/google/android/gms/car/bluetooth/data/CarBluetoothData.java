package com.google.android.gms.car.bluetooth.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qte;

/* loaded from: classes.dex */
public abstract class CarBluetoothData implements Parcelable {
    public static final Parcelable.Creator<CarBluetoothData> CREATOR = new qte(19);

    public abstract BluetoothDevice a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeByte(b() ? (byte) 1 : (byte) 0);
    }
}
