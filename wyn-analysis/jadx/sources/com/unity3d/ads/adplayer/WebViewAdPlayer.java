package com.unity3d.ads.adplayer;

import Ef.A;
import Ef.D;
import Ef.E;
import Ef.H;
import Hf.C0588a0;
import Hf.F;
import Hf.InterfaceC0590b0;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.Z;
import Hf.g0;
import Hf.k0;
import Hf.x0;
import android.util.Base64;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.C3338i;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tf.a;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00152\u0006\u0010!\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\u001b\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010-J\u0013\u00102\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001b\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010;J\u001b\u0010=\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b?\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020*0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00150K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR \u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010c\u001a\b\u0012\u0004\u0012\u00020b0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010V\u001a\u0004\bd\u0010XR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00190S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "bridge", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "LEf/A;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "LEf/E;", "adPlayerScope", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;LEf/A;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;LEf/E;)V", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "getEvent", "Lef/C;", "sendEvent", "(Ltf/a;Ljf/c;)Ljava/lang/Object;", "", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Ljf/c;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "event", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/b;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/b;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ljf/c;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLjf/c;)Ljava/lang/Object;", "isVisible", "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "(Ljf/c;)Ljava/lang/Object;", "", "volume", "sendVolumeChange", "(DLjf/c;)Ljava/lang/Object;", "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "sendUserConsentChange", "([BLjf/c;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onBroadcastEvent", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "onAllowedPiiChange", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "LEf/A;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "LHf/c0;", "isCompletedManually", "LHf/c0;", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "storageEventCallback", "Ltf/l;", "scope", "LEf/E;", "getScope", "()LEf/E;", "LHf/l;", "Lcom/unity3d/ads/core/data/model/ScarEvent$Show;", "onScarEvent", "LHf/l;", "getOnScarEvent", "()LHf/l;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "onOfferwallEvent", "getOnOfferwallEvent", "LHf/g0;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "onShowEvent", "LHf/g0;", "getOnShowEvent", "()LHf/g0;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "onLoadEvent", "getOnLoadEvent", "onBroadcastEvents", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebViewAdPlayer implements AdPlayer {

    @NotNull
    private final WebViewBridge bridge;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final A dispatcher;

    @NotNull
    private final InterfaceC0592c0 isCompletedManually;

    @NotNull
    private final InterfaceC0602l onBroadcastEvents;

    @NotNull
    private final InterfaceC0602l onLoadEvent;

    @NotNull
    private final InterfaceC0602l onOfferwallEvent;

    @NotNull
    private final InterfaceC0602l onScarEvent;

    @NotNull
    private final g0 onShowEvent;

    @NotNull
    private final E scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final l storageEventCallback;

    @NotNull
    private final WebViewContainer webViewContainer;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable Throwable th) {
            Storage.INSTANCE.removeStorageEventCallback(WebViewAdPlayer.this.storageEventCallback);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends C3338i implements p {
        public AnonymousClass2(Object obj) {
            super(2, obj, InterfaceC0590b0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((InterfaceC0590b0) this.receiver).emit(str, interfaceC3103c);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends C3338i implements p {
        public AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, interfaceC3103c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$onAllowedPiiChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22632 extends AbstractC3343n implements a {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22632(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            AbstractC3340k.d(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnAllowedPiiChangeEvent(strEncodeToString);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$onBroadcastEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22642 extends AbstractC3343n implements a {
        final /* synthetic */ String $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22642(String str) {
            super(0);
            this.$event = str;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject(this.$event);
            String eventType = jSONObject.getString("eventType");
            String strOptString = jSONObject.optString(JsonStorageKeyNames.DATA_KEY);
            AbstractC3340k.d(eventType, "eventType");
            return new OnBroadcastEvent(eventType, strOptString);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {194, 195, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE}, m = "requestShow")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22651 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C22651(InterfaceC3103c<? super C22651> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendActivityDestroyed$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22662 extends AbstractC3343n implements a {
        public static final C22662 INSTANCE = new C22662();

        public C22662() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnActivityDestroyedEvent();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 236}, m = "sendEvent")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22671 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22671(InterfaceC3103c<? super C22671> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendFocusChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22682 extends AbstractC3343n implements a {
        final /* synthetic */ boolean $isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22682(boolean z2) {
            super(0);
            this.$isFocused = z2;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnFocusChangeEvent(this.$isFocused);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendGmaEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22692 extends AbstractC3343n implements a {
        final /* synthetic */ b $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22692(b bVar) {
            super(0);
            this.$event = bVar;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnGmaEvent(this.$event);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendMuteChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22702 extends AbstractC3343n implements a {
        final /* synthetic */ boolean $isMuted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22702(boolean z2) {
            super(0);
            this.$isMuted = z2;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnMuteChangeEvent(this.$isMuted);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendOfferwallEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22712 extends AbstractC3343n implements a {
        final /* synthetic */ OfferwallEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22712(OfferwallEvent offerwallEvent) {
            super(0);
            this.$event = offerwallEvent;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnOfferwallEvent(this.$event);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendPrivacyFsmChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22722 extends AbstractC3343n implements a {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22722(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            AbstractC3340k.d(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnPrivacyFsmChangeEvent(strEncodeToString);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendScarBannerEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22732 extends AbstractC3343n implements a {
        final /* synthetic */ BannerBridge.BannerEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22732(BannerBridge.BannerEvent bannerEvent) {
            super(0);
            this.$event = bannerEvent;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnScarBannerEvent(this.$event);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendUserConsentChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22742 extends AbstractC3343n implements a {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22742(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            AbstractC3340k.d(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnUserConsentChangeEvent(strEncodeToString);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVisibilityChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22752 extends AbstractC3343n implements a {
        final /* synthetic */ boolean $isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22752(boolean z2) {
            super(0);
            this.$isVisible = z2;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnVisibilityChangeEvent(this.$isVisible);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVolumeChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22762 extends AbstractC3343n implements a {
        final /* synthetic */ double $volume;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22762(double d3) {
            super(0);
            this.$volume = d3;
        }

        @Override // tf.a
        @NotNull
        public final WebViewEvent invoke() {
            return new OnVolumeChangeEvent(this.$volume);
        }
    }

    public WebViewAdPlayer(@NotNull WebViewBridge bridge, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull A dispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull WebViewContainer webViewContainer, @NotNull E adPlayerScope) {
        AbstractC3340k.e(bridge, "bridge");
        AbstractC3340k.e(deviceInfoRepository, "deviceInfoRepository");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(webViewContainer, "webViewContainer");
        AbstractC3340k.e(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        x0 x0VarC = k0.c(Boolean.FALSE);
        this.isCompletedManually = x0VarC;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        this.scope = H.F(H.F(adPlayerScope, dispatcher), new D("WebViewAdPlayer"));
        final g0 onInvocation = bridge.getOnInvocation();
        final InterfaceC0602l interfaceC0602l = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = ff.m.e0(r2, r4)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = onInvocation.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.onScarEvent = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L4d
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
                        java.lang.String r2 = r6.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r4)
                        if (r2 == 0) goto L50
                        com.unity3d.ads.core.data.model.ScarEvent$Show r6 = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4d
                        return r1
                    L4d:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    L50:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unexpected location: "
                        r0.<init>(r1)
                        java.lang.String r6 = r6.getLocation()
                        r0.append(r6)
                        java.lang.String r6 = r0.toString()
                        java.lang.String r6 = r6.toString()
                        r7.<init>(r6)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = interfaceC0602l.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        final g0 onInvocation2 = bridge.getOnInvocation();
        final InterfaceC0602l interfaceC0602l2 = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = ff.m.e0(r2, r4)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = onInvocation2.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.onOfferwallEvent = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L4d
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
                        java.lang.String r2 = r6.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r4)
                        if (r2 == 0) goto L50
                        com.unity3d.ads.core.data.model.OfferwallShowEvent$Show r6 = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4d
                        return r1
                    L4d:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    L50:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unexpected location: "
                        r0.<init>(r1)
                        java.lang.String r6 = r6.getLocation()
                        r0.append(r6)
                        java.lang.String r6 = r0.toString()
                        java.lang.String r6 = r6.toString()
                        r7.<init>(r6)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = interfaceC0602l2.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        final g0 onInvocation3 = bridge.getOnInvocation();
        final InterfaceC0602l interfaceC0602l3 = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L4e
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = ff.m.e0(r2, r4)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = onInvocation3.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.onShowEvent = k0.v(new C0588a0(new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00f0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r12) {
                    /*
                        Method dump skipped, instructions count: 298
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = interfaceC0602l3.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        }, x0VarC, new WebViewAdPlayer$onShowEvent$3(null)), getScope(), 10);
        final g0 onInvocation4 = bridge.getOnInvocation();
        final InterfaceC0602l interfaceC0602l4 = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L4e
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = ff.m.e0(r2, r4)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = onInvocation4.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.onLoadEvent = new F(k0.v(new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r8)
                        goto L73
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        Fe.e.U(r8)
                        Hf.m r8 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.String r2 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r4)
                        if (r2 == 0) goto L68
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = ff.m.u0(r7)
                        java.lang.String r2 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.AbstractC3340k.c(r7, r2)
                        org.json.JSONObject r7 = (org.json.JSONObject) r7
                        java.lang.String r2 = "code"
                        int r2 = r7.optInt(r2)
                        java.lang.String r4 = "message"
                        java.lang.String r7 = r7.optString(r4)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        java.lang.String r5 = "errorMessage"
                        kotlin.jvm.internal.AbstractC3340k.d(r7, r5)
                        r4.<init>(r7, r2)
                        goto L6a
                    L68:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L6a:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto L73
                        return r1
                    L73:
                        ef.C r7 = ef.C2515C.f34653a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = interfaceC0602l4.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        }, getScope(), 1), 0);
        final g0 onInvocation5 = bridge.getOnInvocation();
        final InterfaceC0602l interfaceC0602l5 = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r7)
                        goto L4c
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        Fe.e.U(r7)
                        Hf.m r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r2 = r2.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r4)
                        if (r2 == 0) goto L4c
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4c
                        return r1
                    L4c:
                        ef.C r6 = ef.C2515C.f34653a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = onInvocation5.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        InterfaceC0602l interfaceC0602l6 = new InterfaceC0602l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3464c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC3103c interfaceC3103c) {
                        super(interfaceC3103c);
                    }

                    @Override // lf.AbstractC3462a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0603m interfaceC0603m) {
                    this.$this_unsafeFlow = interfaceC0603m;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Hf.InterfaceC0603m
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r6)
                        goto L4b
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        Fe.e.U(r6)
                        Hf.m r6 = r4.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r5 = (com.unity3d.ads.adplayer.Invocation) r5
                        java.lang.Object[] r5 = r5.getParameters()
                        java.lang.Object r5 = ff.m.u0(r5)
                        java.lang.String r5 = r5.toString()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        ef.C r5 = ef.C2515C.f34653a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = interfaceC0602l5.collect(new AnonymousClass2(interfaceC0603m), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
        this.onBroadcastEvents = interfaceC0602l6;
        Storage.INSTANCE.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        H.u(adPlayerScope.getCoroutineContext()).invokeOnCompletion(new AnonymousClass1());
        AdPlayer.Companion companion = AdPlayer.INSTANCE;
        k0.u(new Z(interfaceC0602l6, new AnonymousClass2(companion.getBroadcastEventChannel()), 0), getScope());
        k0.u(new Z(companion.getBroadcastEventChannel(), new AnonymousClass3(this), 0), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendEvent(tf.a r20, jf.InterfaceC3103c<? super ef.C2515C> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = 1
            r3 = 2
            boolean r4 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.C22671
            if (r4 == 0) goto L19
            r4 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r4 = (com.unity3d.ads.adplayer.WebViewAdPlayer.C22671) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.label = r5
            goto L1e
        L19:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r4 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r4.<init>(r1)
        L1e:
            java.lang.Object r1 = r4.result
            kf.a r5 = kf.a.f39711a
            int r6 = r4.label
            ef.C r7 = ef.C2515C.f34653a
            if (r6 == 0) goto L44
            if (r6 == r2) goto L38
            if (r6 != r3) goto L30
            Fe.e.U(r1)
            return r7
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r6 = r4.L$1
            tf.a r6 = (tf.a) r6
            java.lang.Object r8 = r4.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r8
            Fe.e.U(r1)
            goto L5b
        L44:
            Fe.e.U(r1)
            Hf.l r1 = r0.getOnLoadEvent()
            r4.L$0 = r0
            r6 = r20
            r4.L$1 = r6
            r4.label = r2
            java.lang.Object r1 = Hf.k0.w(r1, r4)
            if (r1 != r5) goto L5a
            goto Lba
        L5a:
            r8 = r0
        L5b:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r9 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r9 == 0) goto La5
            com.unity3d.ads.core.domain.SendDiagnosticEvent r10 = r8.sendDiagnosticEvent
            ef.k r4 = new ef.k
            java.lang.String r5 = "reason"
            java.lang.String r6 = "adviewer"
            r4.<init>(r5, r6)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r5 = r1.getMessage()
            ef.k r6 = new ef.k
            java.lang.String r8 = "reason_debug"
            r6.<init>(r8, r5)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ef.k r5 = new ef.k
            java.lang.String r8 = "reason_code"
            r5.<init>(r8, r1)
            r1 = 3
            ef.k[] r1 = new ef.C2527k[r1]
            r8 = 0
            r1[r8] = r4
            r1[r2] = r6
            r1[r3] = r5
            java.util.Map r13 = ff.AbstractC2640A.R(r1)
            r15 = 0
            r16 = 0
            java.lang.String r11 = "bridge_send_event_failed"
            r12 = 0
            r14 = 0
            r17 = 58
            r18 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        La5:
            java.lang.Object r1 = r6.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r2 = r8.bridge
            r6 = 0
            r4.L$0 = r6
            r4.L$1 = r6
            r4.label = r3
            java.lang.Object r1 = r2.sendEvent(r1, r4)
            if (r1 != r5) goto Lbb
        Lba:
            return r5
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(tf.a, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object destroy(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return AdPlayer.DefaultImpls.destroy(this, interfaceC3103c);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        InterfaceC0592c0 interfaceC0592c0 = this.isCompletedManually;
        Boolean bool = Boolean.TRUE;
        x0 x0Var = (x0) interfaceC0592c0;
        x0Var.getClass();
        x0Var.k(null, bool);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public InterfaceC0602l getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public InterfaceC0602l getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public InterfaceC0602l getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public E getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22632(bArr), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull String str, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22642(str), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0185, code lost:
    
        if (r14.request("webview", "show", r15, r2) != r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestShow(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(C22662.INSTANCE, interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(boolean z2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22682(z2), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendGmaEvent(@NotNull b bVar, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22692(bVar), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(boolean z2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22702(z2), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22712(offerwallEvent), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22722(bArr), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22732(bannerEvent), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22742(bArr), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(boolean z2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22752(z2), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(double d3, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objSendEvent = sendEvent(new C22762(d3), interfaceC3103c);
        return objSendEvent == kf.a.f39711a ? objSendEvent : C2515C.f34653a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public g0 getOnShowEvent() {
        return this.onShowEvent;
    }
}
