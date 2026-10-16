package com.unity3d.services.core.domain;

import Ef.A;
import com.unity3d.ads.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/domain/ISDKDispatchers;", "", "LEf/A;", "getIo", "()LEf/A;", "io", "getDefault", BuildConfig.FLAVOR, "getMain", "main", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ISDKDispatchers {
    @NotNull
    A getDefault();

    @NotNull
    A getIo();

    @NotNull
    A getMain();
}
