package com.moloco.sdk.publisher;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"createAdInfo", "Lcom/moloco/sdk/publisher/MolocoAd;", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "", "revenue", "", "creativeId", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAd;", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MolocoAdKt {
    @NotNull
    public static final MolocoAd createAdInfo(@NotNull String adUnitId, @Nullable Float f10, @Nullable String str) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        return new MolocoAd("Moloco", adUnitId, f10, str);
    }

    public static /* synthetic */ MolocoAd createAdInfo$default(String str, Float f10, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f10 = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        return createAdInfo(str, f10, str2);
    }
}
