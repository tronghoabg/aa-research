package com.waze.notifications;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.il;
import com.waze.mg;
import com.waze.network.f.ak;
import com.waze.resources.ResourcesNativeManager;
import com.waze.strings.DisplayStrings;
import com.waze.utils.o;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class WazeNotificationNativeManager extends k {
    private static final String SOUND_TRAFFIC_DETECTION_NOTIFICATION = "ping2";
    private static final String TAG = "WazeNotificationNativeManager: ";
    private static WazeNotificationNativeManager sInstance;
    private final int messageTickerNotificationId;
    private final int trafficDetectionNotificationId;
    private final int updateGasPriceNotificationId;

    private WazeNotificationNativeManager() {
        com.waze.utils.f fVar = com.waze.utils.f.NOTIFICATION;
        this.messageTickerNotificationId = o.e(fVar);
        this.updateGasPriceNotificationId = o.e(fVar);
        this.trafficDetectionNotificationId = o.e(fVar);
    }

    public static synchronized WazeNotificationNativeManager getInstance() {
        WazeNotificationNativeManager wazeNotificationNativeManager;
        wazeNotificationNativeManager = sInstance;
        if (wazeNotificationNativeManager == null) {
            wazeNotificationNativeManager = new WazeNotificationNativeManager();
            sInstance = wazeNotificationNativeManager;
        }
        return wazeNotificationNativeManager;
    }

    public native void initNativeLayerNTV();

    protected native void onMessageTickerClickedNTV();

    void showMessageTicker(String str, String str2, String str3, int i2, final boolean z, boolean z2) {
        int millis = (int) TimeUnit.SECONDS.toMillis(i2);
        Drawable skinDrawable = !TextUtils.isEmpty(str3) ? ResourcesNativeManager.getInstance().getSkinDrawable(mg.a().getResources(), String.valueOf(str3).concat(".png")) : null;
        a aVar = new a() { // from class: com.waze.notifications.d
            @Override // com.waze.notifications.a
            public final void a(com.waze.notifications.b.c cVar) {
                if (cVar == com.waze.notifications.b.c.f32548c || z) {
                    WazeNotificationNativeManager.getInstance().onMessageTickerClicked();
                }
            }
        };
        b bVar = new b(100);
        bVar.b(str2);
        bVar.d(skinDrawable);
        bVar.g(millis);
        bVar.e(aVar);
        bVar.c(true != z2 ? 0 : R.drawable.clickable_notification_chevron_icon);
        ak.d().a(bVar.a(), this.messageTickerNotificationId);
    }

    void showTrafficDetectionNotification() {
        h hVar = new h();
        e eVar = new e();
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        b bVar = new b(200);
        bVar.h(aVarA.c(R.string.WESRE_DETECTING_A_SLOW_DOWN, new Object[0]));
        bVar.b(aVarA.c(R.string.ARE_YOU_IN_TRAFFICQ, new Object[0]));
        bVar.d(mg.a().getResources().getDrawable(R.drawable.traffic_detection_notification_icon));
        bVar.g(ConfigValues.CONFIG_VALUE_PUSH_NOTIFICATION_MEDIUM_TIMEOUT_MS.b().intValue());
        bVar.c(R.drawable.clickable_notification_confirm_icon);
        bVar.e(eVar);
        bVar.f(hVar);
        ak.d().a(bVar.a(), this.trafficDetectionNotificationId);
    }

    void showUpdateGasPriceNotification(long j2, final long j3, final long j4) {
        int millis = (int) TimeUnit.SECONDS.toMillis(j2);
        final com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        a aVar = new a() { // from class: com.waze.notifications.f
            @Override // com.waze.notifications.a
            public final void a(com.waze.notifications.b.c cVar) {
                com.waze.notifications.b.c cVar2 = com.waze.notifications.b.c.f32546a;
                long j5 = j4;
                long j6 = j3;
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 2) {
                    NativeManager.getInstance().NativeManagerCallback(3, j5, j6, new il(aVarA, 18));
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    NativeManager.getInstance().NativeManagerCallback(4, j5, j6, null);
                }
            }
        };
        b bVar = new b(DisplayStrings.DS_NIGHT);
        bVar.h(aVarA.c(R.string.UPDATE_GAS_PRICE_NOTIFICATION_TITLE, new Object[0]));
        bVar.b(aVarA.c(R.string.UPDATE_GAS_PRICE_NOTIFICATION_TEXT, new Object[0]));
        bVar.d(mg.a().getResources().getDrawable(R.drawable.gas_prices_notification));
        bVar.g(millis);
        bVar.c(R.drawable.clickable_notification_chevron_icon);
        bVar.e(aVar);
        ak.d().a(bVar.a(), this.updateGasPriceNotificationId);
    }
}
