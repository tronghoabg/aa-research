package com.waze.tide;

import android.bluetooth.BluetoothDevice;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends s {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothDevice f40938a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BluetoothDevice bluetoothDevice) {
        super((byte[]) null);
        h.g.b.x.f(bluetoothDevice, "device");
        this.f40938a = bluetoothDevice;
    }

    public final BluetoothDevice a() {
        return this.f40938a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f40938a, ((k) obj).f40938a);
    }

    public final int hashCode() {
        return this.f40938a.hashCode();
    }

    public final String toString() {
        return "DeviceConnected(device=" + this.f40938a + ")";
    }
}
