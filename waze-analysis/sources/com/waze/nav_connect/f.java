package com.waze.nav_connect;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.nav_connect.NavConnectState;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class f {
    public static final int $stable = 0;

    static final void onStateChangeJNI$lambda$0(f fVar, NavConnectState navConnectState) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.nav_connect.NavConnectNativeManager");
        x.c(navConnectState);
        ((NavConnectNativeManager) fVar).onStateChange$third_party_waze_client_android_project_waze_src_main_waze(navConnectState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setUserConsent$default(f fVar, boolean z, String str, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUserConsent");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        fVar.setUserConsent(z, str, lVar);
    }

    static final ab setUserConsent$lambda$0(f fVar, boolean z, String str) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.nav_connect.NavConnectNativeManager");
        ((NavConnectNativeManager) fVar).setUserConsentNTV(z, str);
        return null;
    }

    protected final void onStateChangeJNI(byte[] bArr) {
        x.f(bArr, "newStateProto");
        try {
            final NavConnectState navConnectState = (NavConnectState) NavConnectState.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.nav_connect.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.onStateChangeJNI$lambda$0(this.f30864a, navConnectState);
                }
            });
        } catch (eu unused) {
        }
    }

    public void setUserConsent(final boolean z, final String str, final l<? super ab, ab> lVar) {
        x.f(str, "consentVersion");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.nav_connect.c
            @Override // com.waze.hw
            public final Object a() {
                f.setUserConsent$lambda$0(this.f30855a, z, str);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.nav_connect.d
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((ab) obj);
            }
        } : null);
    }

    public final void setUserConsent(boolean z, String str) {
        x.f(str, "consentVersion");
        setUserConsent$default(this, z, str, null, 4, null);
    }
}
