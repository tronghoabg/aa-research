package com.waze.realtime;

import androidx.autofill.HintConstants;
import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class h {
    public static final int $stable = 0;

    static final void onEnvChangedJNI$lambda$0(h hVar, int i2) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.realtime.RealtimeNativeManager");
        ((RealtimeNativeManager) hVar).onEnvChanged(i2);
    }

    static final void onRealtimeInitializedJNI$lambda$0(h hVar) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.realtime.RealtimeNativeManager");
        ((RealtimeNativeManager) hVar).onRealtimeInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWazerPopupClosed$default(h hVar, int i2, l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onWazerPopupClosed");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        hVar.onWazerPopupClosed(i2, lVar);
    }

    static final ab onWazerPopupClosed$lambda$0(h hVar, int i2) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.realtime.RealtimeNativeManager");
        ((RealtimeNativeManager) hVar).onWazerPopupClosedNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWazerPopupShown$default(h hVar, int i2, l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onWazerPopupShown");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        hVar.onWazerPopupShown(i2, lVar);
    }

    static final ab onWazerPopupShown$lambda$0(h hVar, int i2) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.realtime.RealtimeNativeManager");
        ((RealtimeNativeManager) hVar).onWazerPopupShownNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setServerGeoConfig$default(h hVar, String str, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setServerGeoConfig");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        hVar.setServerGeoConfig(str, lVar);
    }

    static final ab setServerGeoConfig$lambda$0(h hVar, String str) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.realtime.RealtimeNativeManager");
        ((RealtimeNativeManager) hVar).setServerGeoConfigNTV(str);
        return null;
    }

    public String getCoreVersion() {
        String coreVersionNTV = ((RealtimeNativeManager) this).getCoreVersionNTV();
        x.e(coreVersionNTV, "getCoreVersionNTV(...)");
        return coreVersionNTV;
    }

    public String getCoreVersionAndServer() {
        String coreVersionAndServerNTV = ((RealtimeNativeManager) this).getCoreVersionAndServerNTV();
        x.e(coreVersionAndServerNTV, "getCoreVersionAndServerNTV(...)");
        return coreVersionAndServerNTV;
    }

    protected final int getNextTransactionIdJNI() {
        return ((RealtimeNativeManager) this).getNextTransactionId();
    }

    public String getServerGeoConfig() {
        String serverGeoConfigNTV = ((RealtimeNativeManager) this).getServerGeoConfigNTV();
        x.e(serverGeoConfigNTV, "getServerGeoConfigNTV(...)");
        return serverGeoConfigNTV;
    }

    protected final void loginSessionJNI() {
        ((RealtimeNativeManager) this).loginSession();
    }

    protected final boolean logoutSessionJNI() {
        return ((RealtimeNativeManager) this).logoutSession();
    }

    protected final void onEnvChangedJNI(final int i2) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.realtime.g
            @Override // java.lang.Runnable
            public final void run() {
                h.onEnvChangedJNI$lambda$0(this.f33520a, i2);
            }
        });
    }

    public void onLogoutSession(boolean z) {
        ((RealtimeNativeManager) this).onLogoutSessionNTV(z);
    }

    protected final void onRealtimeInitializedJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.realtime.c
            @Override // java.lang.Runnable
            public final void run() {
                h.onRealtimeInitializedJNI$lambda$0(this.f33512a);
            }
        });
    }

    public void onWazerPopupClosed(int i2, l<? super ab, ab> lVar) {
        int i3 = 1;
        NativeManager.runNativeTask(new d(this, i2, i3), lVar != null ? new e(lVar, i3) : null);
    }

    public void onWazerPopupShown(int i2, l<? super ab, ab> lVar) {
        int i3 = 0;
        NativeManager.runNativeTask(new d(this, i2, i3), lVar != null ? new e(lVar, i3) : null);
    }

    public void realtimeOnSessionCreation(byte[] bArr, String str, int i2, String str2) {
        x.f(str, "userId");
        x.f(str2, "secretKey");
        ((RealtimeNativeManager) this).realtimeOnSessionCreationNTV(bArr, str, i2, str2);
    }

    public void realtimeOnSessionDestroyed() {
        ((RealtimeNativeManager) this).realtimeOnSessionDestroyedNTV();
    }

    public void setLoginData(String str, String str2, String str3, String str4, String str5) {
        x.f(str, "userName");
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        x.f(str3, "token");
        x.f(str4, "firstName");
        x.f(str5, "lastName");
        ((RealtimeNativeManager) this).setLoginDataNTV(str, str2, str3, str4, str5);
    }

    public void setServerGeoConfig(final String str, l<? super ab, ab> lVar) {
        x.f(str, "serverGeoConfig");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.realtime.f
            @Override // com.waze.hw
            public final Object a() {
                h.setServerGeoConfig$lambda$0(this.f33518a, str);
                return null;
            }
        }, lVar != null ? new e(lVar, 2) : null);
    }

    public final void onWazerPopupClosed(int i2) {
        onWazerPopupClosed$default(this, i2, null, 2, null);
    }

    public final void onWazerPopupShown(int i2) {
        onWazerPopupShown$default(this, i2, null, 2, null);
    }

    public final void setServerGeoConfig(String str) {
        x.f(str, "serverGeoConfig");
        setServerGeoConfig$default(this, str, null, 2, null);
    }
}
