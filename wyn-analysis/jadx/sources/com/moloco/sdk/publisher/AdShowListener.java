package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/moloco/sdk/publisher/AdShowListener;", "", "Lcom/moloco/sdk/publisher/MolocoAd;", "molocoAd", "Lef/C;", "onAdShowSuccess", "(Lcom/moloco/sdk/publisher/MolocoAd;)V", "Lcom/moloco/sdk/publisher/MolocoAdError;", "molocoAdError", "onAdShowFailed", "(Lcom/moloco/sdk/publisher/MolocoAdError;)V", "onAdHidden", "onAdClicked", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AdShowListener {
    void onAdClicked(@NotNull MolocoAd molocoAd);

    void onAdHidden(@NotNull MolocoAd molocoAd);

    void onAdShowFailed(@NotNull MolocoAdError molocoAdError);

    void onAdShowSuccess(@NotNull MolocoAd molocoAd);
}
