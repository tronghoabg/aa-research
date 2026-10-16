package com.waze.realtime;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.waze.NativeManager;
import com.waze.car_lib.screens.am;
import com.waze.mg;
import com.waze.network.as;
import com.waze.network.f.ak;
import com.waze.shared_infra.r.n;
import h.ab;
import h.g.b.x;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class RealtimeNativeManager extends h {
    private static RealtimeNativeManager sInstance;
    private final ArrayList<Runnable> onRealtimeInitializedCallbacks = new ArrayList<>();
    private boolean realtimeInitialized = false;
    private Integer currentShownWazerId = null;

    public static synchronized RealtimeNativeManager getInstance() {
        RealtimeNativeManager realtimeNativeManager;
        realtimeNativeManager = sInstance;
        if (realtimeNativeManager == null) {
            realtimeNativeManager = new RealtimeNativeManager();
            sInstance = realtimeNativeManager;
        }
        return realtimeNativeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ab lambda$logoutSession$0(Boolean bool) {
        onLogoutSession(bool.booleanValue());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnRealtimeInitialized$0(Runnable runnable) {
        if (this.realtimeInitialized) {
            runnable.run();
        } else {
            this.onRealtimeInitializedCallbacks.add(runnable);
        }
    }

    protected native String getCoreVersionAndServerNTV();

    protected native String getCoreVersionNTV();

    int getNextTransactionId() {
        return as.a();
    }

    protected native String getServerGeoConfigNTV();

    public native void initNativeLayerNTV();

    void loginSession() {
        ak.a();
    }

    boolean logoutSession() {
        return ak.b(new am(this, 10));
    }

    public void onCurrentShownWazerIdChanged(Integer num) {
        if (Objects.equals(this.currentShownWazerId, num)) {
            return;
        }
        Integer num2 = this.currentShownWazerId;
        if (num2 != null) {
            onWazerPopupClosed(num2.intValue());
        }
        if (num != null) {
            onWazerPopupShown(num.intValue());
        }
        this.currentShownWazerId = num;
    }

    void onEnvChanged(int i2) {
        Context contextA = mg.a();
        int i3 = n.f37979a;
        x.f(contextA, "context");
        LocalBroadcastManager.getInstance(contextA).sendBroadcast(new Intent("ACTION_ENV_SWITCH"));
    }

    protected native void onLogoutSessionNTV(boolean z);

    void onRealtimeInitialized() {
        com.waze.shared_infra.i.h.a("onRealtimeInitialized");
        this.realtimeInitialized = true;
        ArrayList<Runnable> arrayList = this.onRealtimeInitializedCallbacks;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).run();
        }
        this.onRealtimeInitializedCallbacks.clear();
    }

    protected native void onWazerPopupClosedNTV(int i2);

    protected native void onWazerPopupShownNTV(int i2);

    protected native void realtimeOnSessionCreationNTV(byte[] bArr, String str, int i2, String str2);

    protected native void realtimeOnSessionDestroyedNTV();

    public void runOnRealtimeInitialized(Runnable runnable) {
        NativeManager.runMainThreadTask(new com.google.firebase.appcheck.debug.a.a(this, runnable, 7, null));
    }

    protected native void setLoginDataNTV(String str, String str2, String str3, String str4, String str5);

    protected native void setServerGeoConfigNTV(String str);
}
