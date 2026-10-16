package com.google.android.gms.car.bluetooth.data;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoValue_CarBluetoothData extends com.google.android.gms.car.bluetooth.data.CarBluetoothData {
    private final android.bluetooth.BluetoothDevice a;
    private final boolean b;

    public AutoValue_CarBluetoothData(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
        if (bluetoothDevice == null) {
            throw new java.lang.NullPointerException("Null getBluetoothDevice");
        }
        this.a = bluetoothDevice;
        this.b = z;
    }

    @Override // com.google.android.gms.car.bluetooth.data.CarBluetoothData
    public final android.bluetooth.BluetoothDevice a() {
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

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.bluetooth.data.CarBluetoothData) {
            com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData = (com.google.android.gms.car.bluetooth.data.CarBluetoothData) obj;
            if (carBluetoothData.describeContents() == 0 && this.a.equals(carBluetoothData.a()) && this.b == carBluetoothData.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ (-721379959)) * 1000003);
    }

    public final java.lang.String toString() {
        return "CarBluetoothData{describeContents=0, getBluetoothDevice=" + this.a.toString() + ", isIntercooler=" + this.b + "}";
    }
}
