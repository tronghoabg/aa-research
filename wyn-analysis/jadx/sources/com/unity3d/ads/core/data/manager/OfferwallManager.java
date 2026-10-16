package com.unity3d.ads.core.data.manager;

import Hf.InterfaceC0602l;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "", "", MobileAdsBridge.versionMethodName, "(Ljf/c;)Ljava/lang/Object;", "", "isConnected", HandleInvocationsFromAdViewer.KEY_PLACEMENT_NAME, "isAdReady", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lef/C;", "loadAd", "LHf/l;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "showAd", "(Ljava/lang/String;)LHf/l;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OfferwallManager {
    @Nullable
    Object getVersion(@NotNull InterfaceC3103c<? super String> interfaceC3103c);

    @Nullable
    Object isAdReady(@NotNull String str, @NotNull InterfaceC3103c<? super Boolean> interfaceC3103c);

    @Nullable
    Object isConnected(@NotNull InterfaceC3103c<? super Boolean> interfaceC3103c);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @NotNull
    InterfaceC0602l showAd(@NotNull String placementName);
}
