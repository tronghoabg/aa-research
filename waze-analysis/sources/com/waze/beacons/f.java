package com.waze.beacons;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ParcelUuid f16258a = ParcelUuid.fromString("0000FEAA-0000-1000-8000-00805F9B34FB");

    /* renamed from: b, reason: collision with root package name */
    private final b f16259b;

    /* renamed from: c, reason: collision with root package name */
    private final g f16260c;

    /* renamed from: d, reason: collision with root package name */
    private final BluetoothAdapter f16261d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16262e;

    /* renamed from: f, reason: collision with root package name */
    private final ScanCallback f16263f;

    /* renamed from: g, reason: collision with root package name */
    private long f16264g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16265h;

    /* renamed from: i, reason: collision with root package name */
    private final o f16266i;

    public f(o oVar, Context context, b bVar, g gVar) {
        x.f(oVar, "mCallback");
        x.f(context, "context");
        x.f(bVar, "beaconConfig");
        x.f(gVar, "beaconStatsSender");
        this.f16266i = oVar;
        this.f16259b = bVar;
        this.f16260c = gVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("BeaconListener");
        x.e(eVarD, "create(...)");
        this.f16265h = eVarD;
        BluetoothManager bluetoothManager = (BluetoothManager) ContextCompat.getSystemService(context, BluetoothManager.class);
        this.f16261d = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        this.f16263f = new e(this);
    }

    public final void b(boolean z) {
        if (!z) {
            this.f16265h.a("Bluetooth permissions missing. Not scanning for beacons");
            return;
        }
        this.f16264g = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        BluetoothAdapter bluetoothAdapter = this.f16261d;
        if (bluetoothAdapter == null || this.f16262e) {
            return;
        }
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            try {
                boolean zC = this.f16259b.c();
                com.waze.shared_infra.i.e eVar = this.f16265h;
                if (zC) {
                    eVar.a("Scan filter config enabled - starting beacon scan with filter");
                    ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(f16258a).build();
                    x.e(scanFilterBuild, "build(...)");
                    bluetoothLeScanner.startScan(h.a.i.d(scanFilterBuild), scanSettingsBuild, this.f16263f);
                } else {
                    eVar.a("Scan filter config disabled - starting beacon scan without filter");
                    bluetoothLeScanner.startScan((List<ScanFilter>) null, scanSettingsBuild, this.f16263f);
                }
                this.f16260c.a();
                this.f16262e = true;
            } catch (Exception e2) {
                this.f16265h.c("Failed to start bluetooth scan", e2);
            }
        }
    }

    public final void c() {
        if (this.f16262e) {
            BluetoothAdapter bluetoothAdapter = this.f16261d;
            BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeScanner() : null;
            if (bluetoothLeScanner == null) {
                this.f16265h.b("Failed to stop bluetooth scan. Scanner is null");
                return;
            }
            try {
                bluetoothLeScanner.stopScan(this.f16263f);
                this.f16260c.b();
            } catch (Exception e2) {
                this.f16265h.c("Failed to stop bluetooth scan", e2);
            }
            this.f16262e = false;
        }
    }
}
