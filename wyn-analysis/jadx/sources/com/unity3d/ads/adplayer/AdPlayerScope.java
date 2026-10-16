package com.unity3d.ads.adplayer;

import Ef.A;
import Ef.C;
import Ef.E;
import Ef.H;
import jf.InterfaceC3108h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "LEf/E;", "LEf/A;", "defaultDispatcher", "LEf/C;", "sdkErrorHandler", "<init>", "(LEf/A;LEf/C;)V", "LEf/A;", "LEf/C;", "Ljf/h;", "getCoroutineContext", "()Ljf/h;", "coroutineContext", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdPlayerScope implements E {
    private final /* synthetic */ E $$delegate_0;

    @NotNull
    private final A defaultDispatcher;

    @NotNull
    private final C sdkErrorHandler;

    public AdPlayerScope(@NotNull A defaultDispatcher, @NotNull C sdkErrorHandler) {
        AbstractC3340k.e(defaultDispatcher, "defaultDispatcher");
        AbstractC3340k.e(sdkErrorHandler, "sdkErrorHandler");
        this.defaultDispatcher = defaultDispatcher;
        this.sdkErrorHandler = sdkErrorHandler;
        this.$$delegate_0 = H.c(defaultDispatcher.plus(sdkErrorHandler));
    }

    @Override // Ef.E
    @NotNull
    public InterfaceC3108h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
