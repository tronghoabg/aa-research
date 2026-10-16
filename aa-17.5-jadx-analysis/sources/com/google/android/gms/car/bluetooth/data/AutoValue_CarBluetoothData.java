package com.google.android.gms.car.bluetooth.data;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes2.dex */
public final class AutoValue_CarBluetoothData extends CarBluetoothData {
    private final BluetoothDevice a;
    private final boolean b;

    public AutoValue_CarBluetoothData(BluetoothDevice bluetoothDevice, boolean z) {
        if (bluetoothDevice == null) {
            throw new NullPointerException("Null getBluetoothDevice");
        }
        this.a = bluetoothDevice;
        this.b = z;
    }

    @Override // com.google.android.gms.car.bluetooth.data.CarBluetoothData
    public final BluetoothDevice a() {
        return this.a;
    }

    @Override // com.google.android.gms.car.bluetooth.data.CarBluetoothData
    public final boolean b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarBluetoothData) {
            CarBluetoothData carBluetoothData = (CarBluetoothData) obj;
            if (carBluetoothData.describeContents() == 0 && this.a.equals(carBluetoothData.a()) && this.b == carBluetoothData.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ (-721379959)) * 1000003);
    }

    public final String toString() {
        return "CarBluetoothData{describeContents=0, getBluetoothDevice=" + this.a.toString() + ", isIntercooler=" + this.b + "}";
    }
}
