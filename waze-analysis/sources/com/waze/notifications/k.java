package com.waze.notifications;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class k {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onMessageTickerClicked$default(k kVar, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onMessageTickerClicked");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        kVar.onMessageTickerClicked(lVar);
    }

    static final ab onMessageTickerClicked$lambda$0(k kVar) {
        x.d(kVar, "null cannot be cast to non-null type com.waze.notifications.WazeNotificationNativeManager");
        ((WazeNotificationNativeManager) kVar).onMessageTickerClickedNTV();
        return null;
    }

    public void onMessageTickerClicked(final l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.notifications.i
            @Override // com.waze.hw
            public final Object a() {
                k.onMessageTickerClicked$lambda$0(this.f32618a);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.notifications.j
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((ab) obj);
            }
        } : null);
    }

    protected final void showMessageTickerJNI(String str, String str2, String str3, int i2, boolean z, boolean z2) {
        ((WazeNotificationNativeManager) this).showMessageTicker(str, str2, str3, i2, z, z2);
    }

    protected final void showTrafficDetectionNotificationJNI() {
        ((WazeNotificationNativeManager) this).showTrafficDetectionNotification();
    }

    protected final void showUpdateGasPriceNotificationJNI(long j2, long j3, long j4) {
        ((WazeNotificationNativeManager) this).showUpdateGasPriceNotification(j2, j3, j4);
    }

    public final void onMessageTickerClicked() {
        onMessageTickerClicked$default(this, null, 1, null);
    }
}
