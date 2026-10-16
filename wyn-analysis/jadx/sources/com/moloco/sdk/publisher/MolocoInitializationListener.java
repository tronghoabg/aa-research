package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoInitializationListener;", "", "Lcom/moloco/sdk/publisher/MolocoInitStatus;", "initStatus", "Lef/C;", "onMolocoInitializationStatus", "(Lcom/moloco/sdk/publisher/MolocoInitStatus;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MolocoInitializationListener {
    void onMolocoInitializationStatus(@NotNull MolocoInitStatus initStatus);
}
