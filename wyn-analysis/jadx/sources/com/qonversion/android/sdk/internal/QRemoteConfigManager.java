package com.qonversion.android.sdk.internal;

import Fe.c;
import com.qonversion.android.sdk.dto.QFallbackObject;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.provider.UserStateProvider;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QRemoteConfigService;
import com.qonversion.android.sdk.listeners.QonversionEmptyCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ef.C2515C;
import ef.InterfaceC2525i;
import ff.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002NOB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0019J!\u0010\u001f\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0015\u0010!\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010#J%\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020,¢\u0006\u0004\b/\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u001d\u00107\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "", "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;", "remoteConfigService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "fallbacksService", "<init>", "(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V", "", "", "contextKeys", "", "includeEmptyContextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "callback", "getRemoteConfigListCallbackWrapper", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKey", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "Lef/C;", HandleInvocationsFromAdViewer.KEY_ACTION, "fireToCallbacks", "(Ljava/lang/String;Ltf/l;)V", "handlePendingRequests", "()V", "Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "userChangingRequestFailedWithError", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "onUserUpdate", "loadRemoteConfig", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "loadRemoteConfigList", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "fallbackData$delegate", "Lef/i;", "getFallbackData", "()Lcom/qonversion/android/sdk/dto/QFallbackObject;", "fallbackData", "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "userStateProvider", "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "getUserStateProvider", "()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "setUserStateProvider", "(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V", "", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;", "loadingStates", "Ljava/util/Map;", "", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;", "listRequests", "Ljava/util/List;", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "userPropertiesManager", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "getUserPropertiesManager", "()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "setUserPropertiesManager", "(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V", "ListRequestData", "LoadingState", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigManager {

    /* renamed from: fallbackData$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC2525i fallbackData;

    @NotNull
    private final QFallbacksService fallbacksService;

    @NotNull
    private final List<ListRequestData> listRequests;

    @NotNull
    private Map<String, LoadingState> loadingStates;

    @NotNull
    private final QRemoteConfigService remoteConfigService;
    public QUserPropertiesManager userPropertiesManager;
    public UserStateProvider userStateProvider;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;", "", "loadedConfig", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "callbacks", "", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "isInProgress", "", "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;Z)V", "getCallbacks", "()Ljava/util/List;", "()Z", "setInProgress", "(Z)V", "getLoadedConfig", "()Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "setLoadedConfig", "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState {

        @NotNull
        private final List<QonversionRemoteConfigCallback> callbacks;
        private boolean isInProgress;

        @Nullable
        private QRemoteConfig loadedConfig;

        public LoadingState() {
            this(null, null, false, 7, null);
        }

        @NotNull
        public final List<QonversionRemoteConfigCallback> getCallbacks() {
            return this.callbacks;
        }

        @Nullable
        public final QRemoteConfig getLoadedConfig() {
            return this.loadedConfig;
        }

        /* renamed from: isInProgress, reason: from getter */
        public final boolean getIsInProgress() {
            return this.isInProgress;
        }

        public final void setInProgress(boolean z2) {
            this.isInProgress = z2;
        }

        public final void setLoadedConfig(@Nullable QRemoteConfig qRemoteConfig) {
            this.loadedConfig = qRemoteConfig;
        }

        public LoadingState(@Nullable QRemoteConfig qRemoteConfig, @NotNull List<QonversionRemoteConfigCallback> callbacks, boolean z2) {
            AbstractC3340k.e(callbacks, "callbacks");
            this.loadedConfig = qRemoteConfig;
            this.callbacks = callbacks;
            this.isInProgress = z2;
        }

        public /* synthetic */ LoadingState(QRemoteConfig qRemoteConfig, List list, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? null : qRemoteConfig, (i5 & 2) != 0 ? new ArrayList() : list, (i5 & 4) != 0 ? false : z2);
        }
    }

    public QRemoteConfigManager(@NotNull QRemoteConfigService remoteConfigService, @NotNull QFallbacksService fallbacksService) {
        AbstractC3340k.e(remoteConfigService, "remoteConfigService");
        AbstractC3340k.e(fallbacksService, "fallbacksService");
        this.remoteConfigService = remoteConfigService;
        this.fallbacksService = fallbacksService;
        this.fallbackData = c.z(new QRemoteConfigManager$fallbackData$2(this));
        this.loadingStates = new LinkedHashMap();
        this.listRequests = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireToCallbacks(String contextKey, l action) {
        LoadingState loadingState = this.loadingStates.get(contextKey);
        if (loadingState != null) {
            loadingState.setInProgress(false);
            List listS0 = o.S0(loadingState.getCallbacks());
            loadingState.getCallbacks().clear();
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                action.invoke((QonversionRemoteConfigCallback) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QFallbackObject getFallbackData() {
        return (QFallbackObject) this.fallbackData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QonversionRemoteConfigListCallback getRemoteConfigListCallbackWrapper(final List<String> contextKeys, final boolean includeEmptyContextKey, final QonversionRemoteConfigListCallback callback) {
        final Map<String, LoadingState> map = this.loadingStates;
        return new QonversionRemoteConfigListCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.getRemoteConfigListCallbackWrapper.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(@NotNull QonversionError error) {
                QRemoteConfigList remoteConfigList;
                QRemoteConfigList qRemoteConfigList;
                AbstractC3340k.e(error, "error");
                if (!UtilsKt.getShouldFireFallback(error)) {
                    callback.onError(error);
                    return;
                }
                QFallbackObject fallbackData = this.getFallbackData();
                if (fallbackData == null || (remoteConfigList = fallbackData.getRemoteConfigList()) == null) {
                    callback.onError(error);
                    return;
                }
                Object obj = null;
                if (contextKeys == null) {
                    qRemoteConfigList = QRemoteConfigList.copy$default(remoteConfigList, null, 1, null);
                } else {
                    List<QRemoteConfig> remoteConfigs = remoteConfigList.getRemoteConfigs();
                    List<String> list = contextKeys;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : remoteConfigs) {
                        if (o.k0(list, ((QRemoteConfig) obj2).getSource().getContextKey())) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayListU0 = o.U0(arrayList);
                    if (includeEmptyContextKey) {
                        Iterator<T> it = remoteConfigList.getRemoteConfigs().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            String contextKey = ((QRemoteConfig) next).getSource().getContextKey();
                            if (contextKey != null && contextKey.length() == 0) {
                                obj = next;
                                break;
                            }
                        }
                        QRemoteConfig qRemoteConfig = (QRemoteConfig) obj;
                        if (qRemoteConfig != null) {
                            arrayListU0.add(qRemoteConfig);
                        }
                    }
                    qRemoteConfigList = new QRemoteConfigList(o.S0(arrayListU0));
                }
                onSuccess(qRemoteConfigList);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(@NotNull QRemoteConfigList remoteConfigList) {
                AbstractC3340k.e(remoteConfigList, "remoteConfigList");
                List<QRemoteConfig> remoteConfigs = remoteConfigList.getRemoteConfigs();
                Map<String, LoadingState> map2 = map;
                for (QRemoteConfig qRemoteConfig : remoteConfigs) {
                    String contextKey = qRemoteConfig.getSource().getContextKey();
                    LoadingState loadingState = map2.get(contextKey);
                    if (loadingState == null) {
                        loadingState = new LoadingState(null, null, false, 7, null);
                    }
                    loadingState.setLoadedConfig(qRemoteConfig);
                    map2.put(contextKey, loadingState);
                }
                callback.onSuccess(remoteConfigList);
            }
        };
    }

    public final void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(groupId, "groupId");
        AbstractC3340k.e(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.attachUserToExperiment(experimentId, groupId, callback);
    }

    public final void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
    }

    public final void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.detachUserFromExperiment(experimentId, callback);
    }

    public final void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
    }

    @NotNull
    public final QUserPropertiesManager getUserPropertiesManager() {
        QUserPropertiesManager qUserPropertiesManager = this.userPropertiesManager;
        if (qUserPropertiesManager != null) {
            return qUserPropertiesManager;
        }
        AbstractC3340k.m("userPropertiesManager");
        throw null;
    }

    @NotNull
    public final UserStateProvider getUserStateProvider() {
        UserStateProvider userStateProvider = this.userStateProvider;
        if (userStateProvider != null) {
            return userStateProvider;
        }
        AbstractC3340k.m("userStateProvider");
        throw null;
    }

    public final void handlePendingRequests() {
        C2515C c2515c;
        Map<String, LoadingState> map = this.loadingStates;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, LoadingState> entry : map.entrySet()) {
            if (!entry.getValue().getCallbacks().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            loadRemoteConfig((String) it.next(), null);
        }
        for (ListRequestData listRequestData : this.listRequests) {
            List<String> contextKeys = listRequestData.getContextKeys();
            if (contextKeys != null) {
                loadRemoteConfigList(contextKeys, listRequestData.getIncludeEmptyContextKey(), listRequestData.getCallback());
                c2515c = C2515C.f34653a;
            } else {
                c2515c = null;
            }
            if (c2515c == null) {
                loadRemoteConfigList(listRequestData.getCallback());
            }
        }
    }

    public final void loadRemoteConfig(@Nullable final String contextKey, @Nullable QonversionRemoteConfigCallback callback) {
        QRemoteConfig loadedConfig;
        LoadingState loadingState = this.loadingStates.get(contextKey);
        if (loadingState != null && (loadedConfig = loadingState.getLoadedConfig()) != null) {
            if (!getUserStateProvider().isUserStable()) {
                loadedConfig = null;
            }
            if (loadedConfig != null) {
                if (callback != null) {
                    callback.onSuccess(loadedConfig);
                    return;
                }
                return;
            }
        }
        final LoadingState loadingState2 = this.loadingStates.get(contextKey);
        if (loadingState2 == null) {
            loadingState2 = new LoadingState(null, null, false, 7, null);
        }
        this.loadingStates.put(contextKey, loadingState2);
        if (callback != null) {
            loadingState2.getCallbacks().add(callback);
        }
        if (!getUserStateProvider().isUserStable() || loadingState2.getIsInProgress()) {
            return;
        }
        loadingState2.setInProgress(true);
        loadingState2.setLoadedConfig(null);
        getUserPropertiesManager().forceSendProperties(new QonversionEmptyCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.loadRemoteConfig.4
            @Override // com.qonversion.android.sdk.listeners.QonversionEmptyCallback
            public void onComplete() {
                QRemoteConfigService qRemoteConfigService = QRemoteConfigManager.this.remoteConfigService;
                final String str = contextKey;
                final LoadingState loadingState3 = loadingState2;
                final QRemoteConfigManager qRemoteConfigManager = QRemoteConfigManager.this;
                qRemoteConfigService.loadRemoteConfig(str, new QonversionRemoteConfigCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$loadRemoteConfig$4$onComplete$1
                    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
                    public void onError(@NotNull QonversionError error) {
                        QRemoteConfigList remoteConfigList;
                        C2515C c2515c;
                        AbstractC3340k.e(error, "error");
                        if (!UtilsKt.getShouldFireFallback(error)) {
                            qRemoteConfigManager.fireToCallbacks(str, new QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$1(error));
                            return;
                        }
                        QFallbackObject fallbackData = qRemoteConfigManager.getFallbackData();
                        if (fallbackData == null || (remoteConfigList = fallbackData.getRemoteConfigList()) == null) {
                            qRemoteConfigManager.fireToCallbacks(str, new QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$baseRemoteConfigList$1$1(error));
                            return;
                        }
                        String str2 = str;
                        QRemoteConfig remoteConfigForEmptyContextKey = str2 == null ? remoteConfigList.getRemoteConfigForEmptyContextKey() : remoteConfigList.remoteConfigForContextKey(str2);
                        if (remoteConfigForEmptyContextKey != null) {
                            onSuccess(remoteConfigForEmptyContextKey);
                            c2515c = C2515C.f34653a;
                        } else {
                            c2515c = null;
                        }
                        if (c2515c == null) {
                            qRemoteConfigManager.fireToCallbacks(str, new QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3(error));
                        }
                    }

                    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
                    public void onSuccess(@NotNull QRemoteConfig remoteConfig) {
                        AbstractC3340k.e(remoteConfig, "remoteConfig");
                        loadingState3.setLoadedConfig(remoteConfig);
                        qRemoteConfigManager.fireToCallbacks(str, new QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1(remoteConfig));
                    }
                });
            }
        });
    }

    public final void loadRemoteConfigList(@NotNull final List<String> contextKeys, final boolean includeEmptyContextKey, @NotNull final QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(contextKeys, "contextKeys");
        AbstractC3340k.e(callback, "callback");
        List<String> listF0 = includeEmptyContextKey ? o.F0(contextKeys, QRemoteConfigManagerKt.EmptyContextKey) : contextKeys;
        if (!(listF0 instanceof Collection) || !listF0.isEmpty()) {
            Iterator<T> it = listF0.iterator();
            while (it.hasNext()) {
                LoadingState loadingState = this.loadingStates.get((String) it.next());
                if ((loadingState != null ? loadingState.getLoadedConfig() : null) == null) {
                    if (getUserStateProvider().isUserStable()) {
                        getUserPropertiesManager().forceSendProperties(new QonversionEmptyCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.loadRemoteConfigList.2
                            @Override // com.qonversion.android.sdk.listeners.QonversionEmptyCallback
                            public void onComplete() {
                                QRemoteConfigService qRemoteConfigService = QRemoteConfigManager.this.remoteConfigService;
                                List<String> list = contextKeys;
                                boolean z2 = includeEmptyContextKey;
                                qRemoteConfigService.loadRemoteConfigs(list, z2, QRemoteConfigManager.this.getRemoteConfigListCallbackWrapper(list, z2, callback));
                            }
                        });
                        return;
                    } else {
                        this.listRequests.add(new ListRequestData(callback, contextKeys, includeEmptyContextKey));
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listF0.iterator();
        while (it2.hasNext()) {
            LoadingState loadingState2 = this.loadingStates.get((String) it2.next());
            QRemoteConfig loadedConfig = loadingState2 != null ? loadingState2.getLoadedConfig() : null;
            if (loadedConfig != null) {
                arrayList.add(loadedConfig);
            }
        }
        callback.onSuccess(new QRemoteConfigList(arrayList));
    }

    public final void onUserUpdate() {
        this.loadingStates = new LinkedHashMap();
    }

    public final void setUserPropertiesManager(@NotNull QUserPropertiesManager qUserPropertiesManager) {
        AbstractC3340k.e(qUserPropertiesManager, "<set-?>");
        this.userPropertiesManager = qUserPropertiesManager;
    }

    public final void setUserStateProvider(@NotNull UserStateProvider userStateProvider) {
        AbstractC3340k.e(userStateProvider, "<set-?>");
        this.userStateProvider = userStateProvider;
    }

    public final void userChangingRequestFailedWithError(@NotNull QonversionError error) {
        AbstractC3340k.e(error, "error");
        Iterator<T> it = this.loadingStates.keySet().iterator();
        while (it.hasNext()) {
            fireToCallbacks((String) it.next(), new QRemoteConfigManager$userChangingRequestFailedWithError$1$1(error));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;", "", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "", "", "includeEmptyContextKey", "", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V", "getCallback", "()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "getContextKeys", "()Ljava/util/List;", "getIncludeEmptyContextKey", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ListRequestData {

        @NotNull
        private final QonversionRemoteConfigListCallback callback;

        @Nullable
        private final List<String> contextKeys;
        private final boolean includeEmptyContextKey;

        public ListRequestData(@NotNull QonversionRemoteConfigListCallback callback, @Nullable List<String> list, boolean z2) {
            AbstractC3340k.e(callback, "callback");
            this.callback = callback;
            this.contextKeys = list;
            this.includeEmptyContextKey = z2;
        }

        @NotNull
        public final QonversionRemoteConfigListCallback getCallback() {
            return this.callback;
        }

        @Nullable
        public final List<String> getContextKeys() {
            return this.contextKeys;
        }

        public final boolean getIncludeEmptyContextKey() {
            return this.includeEmptyContextKey;
        }

        public /* synthetic */ ListRequestData(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback, List list, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(qonversionRemoteConfigListCallback, (i5 & 2) != 0 ? null : list, (i5 & 4) != 0 ? false : z2);
        }
    }

    public final void loadRemoteConfigList(@NotNull final QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(callback, "callback");
        if (!getUserStateProvider().isUserStable()) {
            this.listRequests.add(new ListRequestData(callback, null, false, 6, null));
            return;
        }
        getUserPropertiesManager().forceSendProperties(new QonversionEmptyCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.loadRemoteConfigList.3
            @Override // com.qonversion.android.sdk.listeners.QonversionEmptyCallback
            public void onComplete() {
                QRemoteConfigManager.this.remoteConfigService.loadRemoteConfigs(QRemoteConfigManager.this.getRemoteConfigListCallbackWrapper(null, true, callback));
            }
        });
    }
}
