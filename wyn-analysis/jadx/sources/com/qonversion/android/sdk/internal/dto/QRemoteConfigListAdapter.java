package com.qonversion.android.sdk.internal.dto;

import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import ff.v;
import hb.InterfaceC2811n;
import hb.Q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0003¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;", "", "()V", "fromJson", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "remoteConfigs", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "toJson", "remoteConfigList", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigListAdapter {
    @Q
    private final List<QRemoteConfig> toJson(QRemoteConfigList remoteConfigList) {
        List<QRemoteConfig> remoteConfigs;
        return (remoteConfigList == null || (remoteConfigs = remoteConfigList.getRemoteConfigs()) == null) ? v.f35432a : remoteConfigs;
    }

    @InterfaceC2811n
    @Nullable
    public final QRemoteConfigList fromJson(@NotNull List<QRemoteConfig> remoteConfigs) {
        AbstractC3340k.e(remoteConfigs, "remoteConfigs");
        if (remoteConfigs.isEmpty()) {
            return null;
        }
        return new QRemoteConfigList(remoteConfigs);
    }
}
