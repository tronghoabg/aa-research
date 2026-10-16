package com.waze.beacons;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.google.android.libraries.phenotype.client.stable.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f16257a;

    e(f fVar) {
        this.f16257a = fVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i2, ScanResult scanResult) {
        super.onScanResult(i2, scanResult);
        f fVar = this.f16257a;
        o oVar = fVar.f16266i;
        d dVarE = d.e(scanResult, fVar.f16264g);
        BeaconsNativeManager beaconsNativeManager = oVar.f16276a;
        beaconsNativeManager.handler.post(new x(beaconsNativeManager, dVarE, 9, null));
    }
}
