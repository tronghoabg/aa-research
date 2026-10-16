package com.waze.ads;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class l {
    public static final int $stable = 0;

    static final void getTrustlessTokenJNI$lambda$0(l lVar, int i2) {
        x.d(lVar, "null cannot be cast to non-null type com.waze.ads.TrustlessTokenNativeManager");
        ((TrustlessTokenNativeManager) lVar).getTrustlessToken$third_party_waze_client_android_project_waze_src_main_waze(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onTokenReceived$default(l lVar, int i2, String str, h.g.a.l lVar2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTokenReceived");
        }
        if ((i3 & 4) != 0) {
            lVar2 = null;
        }
        lVar.onTokenReceived(i2, str, lVar2);
    }

    static final ab onTokenReceived$lambda$0(l lVar, int i2, String str) {
        x.d(lVar, "null cannot be cast to non-null type com.waze.ads.TrustlessTokenNativeManager");
        ((TrustlessTokenNativeManager) lVar).onTokenReceivedNTV(i2, str);
        return null;
    }

    protected final void getTrustlessTokenJNI(final int i2) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.ads.k
            @Override // java.lang.Runnable
            public final void run() {
                l.getTrustlessTokenJNI$lambda$0(this.f14036a, i2);
            }
        });
    }

    public void onTokenReceived(final int i2, final String str, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.ads.i
            @Override // com.waze.hw
            public final Object a() {
                l.onTokenReceived$lambda$0(this.f14031a, i2, str);
                return null;
            }
        }, lVar != null ? new j(lVar, 0) : null);
    }

    public final void onTokenReceived(int i2, String str) {
        onTokenReceived$default(this, i2, str, null, 4, null);
    }
}
