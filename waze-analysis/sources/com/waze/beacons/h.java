package com.waze.beacons;

import android.bluetooth.BluetoothDevice;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    private double f16268a;

    /* renamed from: b, reason: collision with root package name */
    private double f16269b;

    /* renamed from: c, reason: collision with root package name */
    private long f16270c;

    /* renamed from: d, reason: collision with root package name */
    private long f16271d;

    public h(BluetoothDevice bluetoothDevice, byte[] bArr, int i2, long j2, long j3) {
        super(bluetoothDevice, i2, j2, j3);
        if (bArr.length < 14) {
            return;
        }
        this.f16268a = (((bArr[2] & 255) << 8) | (bArr[3] & 255)) / 1000.0d;
        this.f16269b = (((bArr[4] & 255) << 8) | (bArr[5] & 255)) / 256.0d;
        this.f16270c = ((bArr[6] & 255) << 24) | ((bArr[7] & 255) << 16) | ((bArr[8] & 255) << 8) | (bArr[9] & 255);
        this.f16271d = ((bArr[10] & 255) << 24) | ((bArr[11] & 255) << 16) | ((bArr[12] & 255) << 8) | (bArr[13] & 255);
    }

    public final double a() {
        return this.f16269b;
    }

    public final double b() {
        return this.f16268a;
    }

    public final long g() {
        return this.f16271d;
    }

    public final long h() {
        return this.f16270c;
    }
}
