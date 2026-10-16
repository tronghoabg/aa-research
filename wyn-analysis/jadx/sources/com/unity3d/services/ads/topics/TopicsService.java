package com.unity3d.services.ads.topics;

import Ef.H;
import Wf.AbstractC1258p;
import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.ext.SdkExtensions;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import h3.e;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/ads/topics/TopicsService;", "", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "eventSender", "<init>", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "Landroid/adservices/topics/TopicsManager;", "getTopicsManager", "(Landroid/content/Context;)Landroid/adservices/topics/TopicsManager;", "Lcom/unity3d/services/ads/topics/TopicsStatus;", "checkAvailability", "()Lcom/unity3d/services/ads/topics/TopicsStatus;", "", "adsSdkName", "", "shouldRecordObservation", "Lef/C;", "getTopics", "(Ljava/lang/String;Z)V", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "topicsManager", "Landroid/adservices/topics/TopicsManager;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopicsService {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final IEventSender eventSender;

    @Nullable
    private final TopicsManager topicsManager;

    public TopicsService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers, @NotNull IEventSender eventSender) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return AbstractC1258p.e(context.getSystemService(AbstractC1258p.C()));
        }
        return null;
    }

    @NotNull
    public final TopicsStatus checkAvailability() {
        return Device.getApiLevel() < 33 ? TopicsStatus.ERROR_API_BELOW_33 : SdkExtensions.getExtensionVersion(1000000) < 4 ? TopicsStatus.ERROR_EXTENSION_BELOW_4 : this.topicsManager == null ? TopicsStatus.ERROR_TOPICSMANAGER_NULL : !AdServicesState.isAdServicesStateEnabled() ? TopicsStatus.ERROR_AD_SERVICES_DISABLED : TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(@NotNull String adsSdkName, boolean shouldRecordObservation) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(adsSdkName, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest getTopicsRequestBuild = e.h().setAdsSdkName(adsSdkName).setShouldRecordObservation(shouldRecordObservation).build();
        AbstractC3340k.d(getTopicsRequestBuild, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(getTopicsRequestBuild, H.g(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e7) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e7.toString());
            DeviceLog.debug("Failed to get topics with error: " + e7);
        }
    }
}
