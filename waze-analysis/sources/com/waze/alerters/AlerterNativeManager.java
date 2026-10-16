package com.waze.alerters;

import com.waze.gw.Gateway;
import com.waze.jni.protos.alerters.NativeAlertRepositoryUpdate;
import com.waze.jni.protos.alerters.RejectedAlert;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class AlerterNativeManager extends f {
    private static final int ALERTER_ACTION_BACK_PRESS = 7;
    private static final int ALERTER_ACTION_CLOSED = 3;
    private static final int ALERTER_ACTION_DRAG_MAP = 5;
    private static final int ALERTER_ACTION_PERSONALIZED_END = 8;
    private static final int ALERTER_ACTION_PRIMARY_BUTTON_CLICKED = 2;
    private static final int ALERTER_ACTION_SECONDARY_BUTTON_CLICKED = 1;
    private static final int ALERTER_ACTION_TAP_BG = 4;
    private static final int ALERTER_ACTION_TIMEOUT = 0;
    private static volatile AlerterNativeManager instance;
    private final bm<NativeAlertRepositoryUpdate> nativeAlertsFlow = bu.c(1, 1, kotlinx.coroutines.a.a.f51272b);

    public static synchronized AlerterNativeManager getInstance() {
        if (instance == null) {
            instance = new AlerterNativeManager();
        }
        return instance;
    }

    public static synchronized void setTestInstance(AlerterNativeManager alerterNativeManager) {
        instance = alerterNativeManager;
    }

    private int toNativeInt(com.waze.alerters.a.a aVar) {
        if (aVar == null) {
            return -1;
        }
        switch (aVar.ordinal()) {
        }
        return -1;
    }

    public kotlinx.coroutines.b.k<NativeAlertRepositoryUpdate> getNativeAlertsFlow() {
        return this.nativeAlertsFlow;
    }

    public void init() {
        initNativeLayerNTV();
    }

    native void initNativeLayerNTV();

    public void onAlertAction(com.waze.k kVar, com.waze.alerters.a.a aVar) {
        onAlertAction(com.b.b.d.c.b(kVar).toByteArray(), toNativeInt(aVar));
    }

    protected native void onAlertActionNTV(byte[] bArr, int i2);

    public void onAlertEnd(com.waze.k kVar) {
        onAlertEnd(com.b.b.d.c.b(kVar).toByteArray());
    }

    protected native void onAlertEndNTV(byte[] bArr);

    public void onAlertRejected(com.waze.k kVar, com.waze.f fVar) {
        RejectedAlert.Reason reasonForNumber = RejectedAlert.Reason.forNumber(fVar.a());
        RejectedAlert.Builder builderNewBuilder = RejectedAlert.newBuilder();
        builderNewBuilder.setAlertId(com.b.b.d.c.b(kVar));
        if (reasonForNumber != null) {
            builderNewBuilder.setReason(reasonForNumber);
        }
        onAlertRejected(builderNewBuilder.build());
    }

    protected native void onAlertRejectedNTV(byte[] bArr);

    public void onAlertStart(com.waze.k kVar) {
        onAlertStart(com.b.b.d.c.b(kVar).toByteArray());
    }

    protected native void onAlertStartNTV(byte[] bArr);

    public void onAlertTimeoutStarted(com.waze.k kVar) {
        onAlertTimeoutStarted(com.b.b.d.c.b(kVar).toByteArray());
    }

    protected native void onAlertTimeoutStartedNTV(byte[] bArr);

    public void playSound(com.waze.k kVar) {
        playSound(com.b.b.d.c.b(kVar).toByteArray());
    }

    protected native void playSoundNTV(byte[] bArr);

    protected native void playZoneAlertExitSoundNTV();

    void updateAlertersRepository(NativeAlertRepositoryUpdate nativeAlertRepositoryUpdate) {
        Gateway.onAlerts(nativeAlertRepositoryUpdate);
        this.nativeAlertsFlow.c(nativeAlertRepositoryUpdate);
    }
}
