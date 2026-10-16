package com.google.android.gms.car.bluetooth.data;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class CarBluetoothData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.bluetooth.data.CarBluetoothData> CREATOR = new qua(19);

    public abstract android.bluetooth.BluetoothDevice a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeByte(b() ? (byte) 1 : (byte) 0);
    }
}
