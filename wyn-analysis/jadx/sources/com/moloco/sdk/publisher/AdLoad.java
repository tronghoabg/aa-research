package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/moloco/sdk/publisher/AdLoad;", "", "", "bidResponseJson", "Lcom/moloco/sdk/publisher/AdLoad$Listener;", "listener", "Lef/C;", "load", "(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V", "", "isLoaded", "()Z", "Listener", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AdLoad {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/moloco/sdk/publisher/AdLoad$Listener;", "", "Lcom/moloco/sdk/publisher/MolocoAd;", "molocoAd", "Lef/C;", "onAdLoadSuccess", "(Lcom/moloco/sdk/publisher/MolocoAd;)V", "Lcom/moloco/sdk/publisher/MolocoAdError;", "molocoAdError", "onAdLoadFailed", "(Lcom/moloco/sdk/publisher/MolocoAdError;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onAdLoadFailed(@NotNull MolocoAdError molocoAdError);

        void onAdLoadSuccess(@NotNull MolocoAd molocoAd);
    }

    boolean isLoaded();

    void load(@NotNull String bidResponseJson, @Nullable Listener listener);
}
