package com.waze.beacons;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class u {
    public static final int $stable = 0;

    static final void api_beginJNI$lambda$0(u uVar, String str) {
        x.d(uVar, "null cannot be cast to non-null type com.waze.beacons.BeaconsNativeManager");
        ((BeaconsNativeManager) uVar).api_begin$third_party_waze_client_android_project_waze_src_main_waze(str);
    }

    static final void api_get_status_asyncJNI$lambda$0(u uVar) {
        x.d(uVar, "null cannot be cast to non-null type com.waze.beacons.BeaconsNativeManager");
        ((BeaconsNativeManager) uVar).api_get_status_async$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void api_stopJNI$lambda$0(u uVar) {
        x.d(uVar, "null cannot be cast to non-null type com.waze.beacons.BeaconsNativeManager");
        ((BeaconsNativeManager) uVar).api_stop$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void api_turn_on_asyncJNI$lambda$0(u uVar) {
        x.d(uVar, "null cannot be cast to non-null type com.waze.beacons.BeaconsNativeManager");
        ((BeaconsNativeManager) uVar).api_turn_on_async$third_party_waze_client_android_project_waze_src_main_waze();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void turnedOn$default(u uVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: turnedOn");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        uVar.turnedOn(z, lVar);
    }

    static final ab turnedOn$lambda$0(u uVar, boolean z) {
        x.d(uVar, "null cannot be cast to non-null type com.waze.beacons.BeaconsNativeManager");
        ((BeaconsNativeManager) uVar).turnedOnNTV(z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateStatus$default(u uVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStatus");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        uVar.updateStatus(i2, lVar);
    }

    static final ab updateStatus$lambda$0(u uVar, int i2) {
        x.d(uVar, "null cannot be cast to non-null type com.waze.beacons.BeaconsNativeManager");
        ((BeaconsNativeManager) uVar).updateStatusNTV(i2);
        return null;
    }

    public void addScanResult(long j2, String str, String str2, int i2, int i3) {
        x.f(str, "address");
        x.f(str2, "uuid");
        ((BeaconsNativeManager) this).addScanResultNTV(j2, str, str2, i2, i3);
    }

    public void addTlmResult(long j2, String str, int i2, float f2, float f3, long j3, long j4) {
        x.f(str, "address");
        ((BeaconsNativeManager) this).addTlmResultNTV(j2, str, i2, f2, f3, j3, j4);
    }

    protected final void api_beginJNI(String str) {
        x.f(str, "prefix");
        NativeManager.runMainThreadTask(new q(this, str, 0));
    }

    protected final void api_get_status_asyncJNI() {
        NativeManager.runMainThreadTask(new p(this, 2));
    }

    protected final void api_stopJNI() {
        NativeManager.runMainThreadTask(new p(this, 3));
    }

    protected final void api_turn_on_asyncJNI() {
        NativeManager.runMainThreadTask(new p(this, 0));
    }

    public void turnedOn(final boolean z, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.beacons.s
            @Override // com.waze.hw
            public final Object a() {
                u.turnedOn$lambda$0(this.f16284a, z);
                return null;
            }
        }, lVar != null ? new t(lVar, 0) : null);
    }

    public void updateStatus(final int i2, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.beacons.r
            @Override // com.waze.hw
            public final Object a() {
                u.updateStatus$lambda$0(this.f16282a, i2);
                return null;
            }
        }, lVar != null ? new t(lVar, 1) : null);
    }

    public final void turnedOn(boolean z) {
        turnedOn$default(this, z, null, 2, null);
    }

    public final void updateStatus(int i2) {
        updateStatus$default(this, i2, null, 2, null);
    }
}
