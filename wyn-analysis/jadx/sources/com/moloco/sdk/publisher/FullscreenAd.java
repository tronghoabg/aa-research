package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u00032\u00020\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/publisher/FullscreenAd;", "Lcom/moloco/sdk/publisher/AdShowListener;", "T", "Lcom/moloco/sdk/publisher/AdLoad;", "Lcom/moloco/sdk/publisher/Destroyable;", "listener", "Lef/C;", "show", "(Lcom/moloco/sdk/publisher/AdShowListener;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FullscreenAd<T extends AdShowListener> extends AdLoad, Destroyable {
    void show(@Nullable T listener);
}
