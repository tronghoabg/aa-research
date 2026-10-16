package com.unity3d.ads.core.domain;

import Bf.k;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAssetFileName;", "", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetAssetFileName {
    @NotNull
    public final String invoke(@NotNull String url) {
        AbstractC3340k.e(url, "url");
        String strP0 = k.P0(url, '?');
        String strN0 = k.N0('.', k.N0('/', strP0, strP0), "");
        if (k.y0(strN0)) {
            return StringExtensionsKt.getSHA256Hash(url);
        }
        return StringExtensionsKt.getSHA256Hash(url) + '.' + strN0;
    }
}
