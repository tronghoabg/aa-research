package com.waze.beacons;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ParcelUuid f16253a = ParcelUuid.fromString("0000FEAA-0000-1000-8000-00805F9B34FB");

    /* renamed from: b, reason: collision with root package name */
    private int f16254b;

    /* renamed from: c, reason: collision with root package name */
    private long f16255c;

    /* renamed from: d, reason: collision with root package name */
    private String f16256d;

    protected d(BluetoothDevice bluetoothDevice, int i2, long j2, long j3) {
        this.f16254b = i2;
        this.f16255c = (j3 / 1000000) + j2;
        if (bluetoothDevice != null) {
            this.f16256d = bluetoothDevice.getAddress();
        }
    }

    public static d e(ScanResult scanResult, long j2) {
        if (scanResult != null && scanResult.getScanRecord() != null) {
            BluetoothDevice device = scanResult.getDevice();
            byte[] serviceData = scanResult.getScanRecord().getServiceData(f16253a);
            int rssi = scanResult.getRssi();
            long timestampNanos = scanResult.getTimestampNanos();
            if (serviceData == null || serviceData.length <= 0) {
                return null;
            }
            byte b2 = serviceData[0];
            if (b2 == 0) {
                return new a(device, serviceData, rssi, j2, timestampNanos);
            }
            if (b2 != 32) {
                return null;
            }
            return new h(device, serviceData, rssi, j2, timestampNanos);
        }
        return null;
    }

    public final int c() {
        return this.f16254b;
    }

    public final long d() {
        return this.f16255c;
    }

    public final String f() {
        return this.f16256d;
    }

    private d() {
    }
}
