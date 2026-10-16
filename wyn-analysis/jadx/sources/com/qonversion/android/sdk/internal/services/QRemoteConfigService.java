package com.qonversion.android.sdk.internal.services;

import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0014J%\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006\""}, d2 = {"Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;", "", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;)V", "", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "callback", "Lef/C;", "loadRemoteConfig", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "loadRemoteConfigs", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "", "contextKeys", "", "includeEmptyContextKey", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigService {

    @NotNull
    private final QRepository repository;

    public QRemoteConfigService(@NotNull QRepository repository) {
        AbstractC3340k.e(repository, "repository");
        this.repository = repository;
    }

    public final void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(groupId, "groupId");
        AbstractC3340k.e(callback, "callback");
        this.repository.attachUserToExperiment(experimentId, groupId, callback);
    }

    public final void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        this.repository.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
    }

    public final void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(callback, "callback");
        this.repository.detachUserFromExperiment(experimentId, callback);
    }

    public final void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        this.repository.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
    }

    public final void loadRemoteConfig(@Nullable String contextKey, @NotNull QonversionRemoteConfigCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.repository.remoteConfig(contextKey, callback);
    }

    public final void loadRemoteConfigs(@NotNull QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.repository.remoteConfigList(callback);
    }

    public final void loadRemoteConfigs(@NotNull List<String> contextKeys, boolean includeEmptyContextKey, @NotNull QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(contextKeys, "contextKeys");
        AbstractC3340k.e(callback, "callback");
        this.repository.remoteConfigList(contextKeys, includeEmptyContextKey, callback);
    }
}
