package com.unity3d.ads.adplayer;

import Hf.v0;
import com.unity3d.ads.metadata.MediationMetaData;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewContainer;", "", "", "url", "Lef/C;", "loadUrl", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "evaluateJavascript", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewBridgeInterface", MediationMetaData.KEY_NAME, "addJavascriptInterface", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "destroy", "(Ljf/c;)Ljava/lang/Object;", "LHf/v0;", "Landroid/view/InputEvent;", "getLastInputEvent", "()LHf/v0;", "lastInputEvent", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WebViewContainer {
    @Nullable
    Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object destroy(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object evaluateJavascript(@NotNull HandlerType handlerType, @NotNull JSONArray jSONArray, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @NotNull
    v0 getLastInputEvent();

    @Nullable
    Object loadUrl(@NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);
}
