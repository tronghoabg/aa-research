package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/QAttributionManager;", "", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "appStateProvider", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V", "Lef/C;", "onAppForeground", "()V", "", "", JsonStorageKeyNames.DATA_KEY, "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "provider", "attribution", "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "pendingAttributionProvider", "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "pendingData", "Ljava/util/Map;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QAttributionManager {

    @NotNull
    private final AppStateProvider appStateProvider;

    @Nullable
    private QAttributionProvider pendingAttributionProvider;

    @Nullable
    private Map<String, ? extends Object> pendingData;

    @NotNull
    private final QRepository repository;

    public QAttributionManager(@NotNull QRepository repository, @NotNull AppStateProvider appStateProvider) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(appStateProvider, "appStateProvider");
        this.repository = repository;
        this.appStateProvider = appStateProvider;
    }

    public final void attribution(@NotNull Map<String, ? extends Object> data, @NotNull QAttributionProvider provider) {
        AbstractC3340k.e(data, "data");
        AbstractC3340k.e(provider, "provider");
        if (!this.appStateProvider.getAppState().isBackground()) {
            QRepository.DefaultImpls.attribution$default(this.repository, data, provider.getId(), null, null, 12, null);
        } else {
            this.pendingAttributionProvider = provider;
            this.pendingData = data;
        }
    }

    public final void onAppForeground() {
        QAttributionProvider qAttributionProvider = this.pendingAttributionProvider;
        Map<String, ? extends Object> map = this.pendingData;
        if (qAttributionProvider == null || map == null || map.isEmpty()) {
            return;
        }
        QRepository.DefaultImpls.attribution$default(this.repository, map, qAttributionProvider.getId(), null, null, 12, null);
        this.pendingData = null;
        this.pendingAttributionProvider = null;
    }
}
