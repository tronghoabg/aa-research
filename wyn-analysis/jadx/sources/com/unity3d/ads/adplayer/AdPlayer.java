package com.unity3d.ads.adplayer;

import Ef.E;
import Ef.G;
import Ef.H;
import Hf.InterfaceC0590b0;
import Hf.InterfaceC0602l;
import Hf.k0;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import ef.C2515C;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 E2\u00020\u0001:\u0001EJ+\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u0013\u0010\u0018\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b!\u0010 J\u001b\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u001b\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020&H¦@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u00052\u0006\u0010#\u001a\u00020)H¦@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u00052\u0006\u0010#\u001a\u00020,H¦@ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<078&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010:R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?078&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B078&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "", "", "unityAdsShowOptions", "Lef/C;", "requestShow", "(Ljava/util/Map;Ljf/c;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "(Ljf/c;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLjf/c;)Ljava/lang/Object;", "isVisible", "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "", "volume", "sendVolumeChange", "(DLjf/c;)Ljava/lang/Object;", "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "sendUserConsentChange", "([BLjf/c;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "event", "onBroadcastEvent", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/b;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/b;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Ljf/c;)Ljava/lang/Object;", "LEf/E;", "getScope", "()LEf/E;", "scope", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "LHf/l;", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "()LHf/l;", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onLoadEvent", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AdPlayer {

    @NotNull
    public static final String AD_REFRESH_EVENT = "AD_REFRESH";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "<init>", "()V", "LHf/b0;", "", "broadcastEventChannel", "LHf/b0;", "getBroadcastEventChannel", "()LHf/b0;", "", "SCAR_EVENT_QUEUE_SIZE", "I", "OFFERWALL_EVENT_QUEUE_SIZE", "AD_REFRESH_EVENT", "Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String AD_REFRESH_EVENT = "AD_REFRESH";
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final InterfaceC0590b0 broadcastEventChannel = k0.b(0, 0, 7);

        private Companion() {
        }

        @NotNull
        public final InterfaceC0590b0 getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
            H.j(adPlayer.getScope(), null);
            return C2515C.f34653a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            AbstractC3340k.e(showOptions, "showOptions");
            throw new G(1);
        }
    }

    @Nullable
    Object destroy(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    void dispatchShowCompleted();

    @NotNull
    InterfaceC0602l getOnLoadEvent();

    @NotNull
    InterfaceC0602l getOnOfferwallEvent();

    @NotNull
    InterfaceC0602l getOnScarEvent();

    @NotNull
    InterfaceC0602l getOnShowEvent();

    @NotNull
    E getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendActivityDestroyed(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendFocusChange(boolean z2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendGmaEvent(@NotNull b bVar, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendMuteChange(boolean z2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendVisibilityChange(boolean z2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object sendVolumeChange(double d3, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    void show(@NotNull ShowOptions showOptions);
}
