package com.waze.beacons;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.waze.NativeManager;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class BeaconsNativeManager extends u implements l {
    private static final int BLUETOOTH_CODE_DISABLED = 1;
    private static final int BLUETOOTH_CODE_ENABLED = 0;
    private static final int BLUETOOTH_CODE_NONE = 2;
    private static final long BLUETOOTH_ENTRY_PROCESS_DELAY_MILLIS = 250;
    private final Context appContext;
    private final g beaconStatsSender;
    private final ch<k> beaconUpdates;
    private final Handler handler;
    private final bn<k> internalBeaconUpdates;
    private final h.f listener$delegate;
    private String prefix;
    private final List<d> results;
    public static final n Companion = new n();
    public static final int $stable = 8;

    public BeaconsNativeManager(Context context, g gVar) {
        x.f(context, "appContext");
        x.f(gVar, "beaconStatsSender");
        this.appContext = context;
        this.beaconStatsSender = gVar;
        this.handler = new Handler(Looper.getMainLooper());
        this.listener$delegate = h.g.a(new m(this, 0));
        this.prefix = "";
        this.results = new ArrayList();
        bn<k> bnVarB = ck.b(j.f16273a);
        this.internalBeaconUpdates = bnVarB;
        this.beaconUpdates = ai.U(bnVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dumpEntries() {
        List listAo = h.a.i.ao(this.results);
        this.results.clear();
        NativeManager.Post(new q(listAo, this, 1));
    }

    static final void dumpEntries$lambda$0(List list, BeaconsNativeManager beaconsNativeManager) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof a) {
                a aVar = (a) dVar;
                long jD = aVar.d();
                String strF = aVar.f();
                x.e(strF, "getAddress(...)");
                String strB = aVar.b();
                x.e(strB, "getUuid(...)");
                beaconsNativeManager.addScanResult(jD, strF, strB, aVar.c(), aVar.a());
            } else if (dVar instanceof h) {
                h hVar = (h) dVar;
                long jD2 = hVar.d();
                String strF2 = hVar.f();
                x.e(strF2, "getAddress(...)");
                beaconsNativeManager.addTlmResult(jD2, strF2, hVar.c(), (float) hVar.b(), (float) hVar.a(), hVar.h(), hVar.g());
            }
        }
    }

    private final int getBluetoothEnabledStatus() {
        BluetoothAdapter adapter;
        BluetoothManager bluetoothManager = (BluetoothManager) ContextCompat.getSystemService(this.appContext, BluetoothManager.class);
        if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
            return 2;
        }
        return adapter.isEnabled() ? 0 : 1;
    }

    private final f getListener() {
        return (f) this.listener$delegate.getValue();
    }

    private final boolean isBluetoothPermissionsGranted() {
        return Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this.appContext, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(this.appContext, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    static final f listener_delegate$lambda$0(BeaconsNativeManager beaconsNativeManager) {
        return new f(new o(beaconsNativeManager), beaconsNativeManager.appContext, new c(), beaconsNativeManager.beaconStatsSender);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void processEntry(com.waze.beacons.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.beacons.a
            if (r0 == 0) goto L18
            r0 = r5
            com.waze.beacons.a r0 = (com.waze.beacons.a) r0
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "getUuid(...)"
            h.g.b.x.e(r0, r1)
            java.lang.String r1 = r4.prefix
            boolean r0 = h.n.o.ah(r0, r1)
            if (r0 != 0) goto L1c
        L18:
            boolean r0 = r5 instanceof com.waze.beacons.h
            if (r0 == 0) goto L36
        L1c:
            java.util.List<com.waze.beacons.d> r0 = r4.results
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            android.os.Handler r0 = r4.handler
            com.waze.beacons.p r1 = new com.waze.beacons.p
            r2 = 1
            r1.<init>(r4, r2)
            r2 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r1, r2)
        L31:
            java.util.List<com.waze.beacons.d> r4 = r4.results
            r4.add(r5)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.beacons.BeaconsNativeManager.processEntry(com.waze.beacons.d):void");
    }

    public final native void addScanResultNTV(long j2, String str, String str2, int i2, int i3);

    public final native void addTlmResultNTV(long j2, String str, int i2, float f2, float f3, long j3, long j4);

    public final void api_begin$third_party_waze_client_android_project_waze_src_main_waze(String str) {
        x.f(str, "prefix");
        this.prefix = str;
        getListener().b(isBluetoothPermissionsGranted());
    }

    public final void api_get_status_async$third_party_waze_client_android_project_waze_src_main_waze() {
        u.updateStatus$default(this, getBluetoothEnabledStatus(), null, 2, null);
    }

    public final void api_stop$third_party_waze_client_android_project_waze_src_main_waze() {
        getListener().c();
    }

    public final void api_turn_on_async$third_party_waze_client_android_project_waze_src_main_waze() {
        this.internalBeaconUpdates.e(i.f16272a);
    }

    @Override // com.waze.beacons.l
    public ch<k> getBeaconUpdates() {
        return this.beaconUpdates;
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.beacons.l
    public void onBluetoothConnectionRequirementHandled() {
        this.internalBeaconUpdates.e(j.f16273a);
    }

    @Override // com.waze.beacons.l
    public void onBluetoothTurnedOn(boolean z) {
        u.turnedOn$default(this, z, null, 2, null);
    }

    public final native void turnedOnNTV(boolean z);

    public final native void updateStatusNTV(int i2);
}
