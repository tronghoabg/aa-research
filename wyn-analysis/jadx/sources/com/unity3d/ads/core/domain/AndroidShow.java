package com.unity3d.ads.core.domain;

import Fe.e;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.f0;
import Hf.x0;
import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tf.p;
import tf.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "gameServerIdReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "handleGatewayAdResponse", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "LHf/l;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/UnityAdsShowOptions;)LHf/l;", "Lef/C;", "terminate", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljf/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidShow implements Show {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final GameServerIdReader gameServerIdReader;

    @NotNull
    private final HandleGatewayAdResponse handleGatewayAdResponse;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final ValidateExtrasSize validateExtrasSize;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {45, 88}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AndroidShow this$0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends AbstractC3471j implements p {
            final /* synthetic */ G $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ AdPlayer $adPlayer;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(G g9, AndroidShow androidShow, AdObject adObject, AdPlayer adPlayer, UnityAdsShowOptions unityAdsShowOptions, InterfaceC3103c<? super AnonymousClass4> interfaceC3103c) {
                super(2, interfaceC3103c);
                this.$ad = g9;
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$adPlayer = adPlayer;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                return new AnonymousClass4(this.$ad, this.this$0, this.$adObject, this.$adPlayer, this.$showOptions, interfaceC3103c);
            }

            @Override // tf.p
            @Nullable
            public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((AnonymousClass4) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                JSONObject data;
                kf.a aVar = kf.a.f39711a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                AdObject adObject = (AdObject) this.$ad.f39740a;
                GameServerIdReader gameServerIdReader = this.this$0.gameServerIdReader;
                Object playerServerId = ((AdObject) this.$ad.f39740a).getPlayerServerId();
                Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj2 != null) {
                    boolean z2 = obj2 instanceof String;
                    Object obj3 = obj2;
                    if (!z2) {
                        obj3 = playerServerId;
                    }
                    if (obj3 != null) {
                        playerServerId = obj3;
                    }
                }
                if (gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey()) != null) {
                    gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                }
                adObject.setPlayerServerId((String) playerServerId);
                ((x0) this.$adObject.getState()).j(AdObjectState.SHOWING);
                AdPlayer adPlayer = this.$adPlayer;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                adPlayer.show(new AndroidShowOptions((unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null) ? null : JSONObjectExtensionsKt.toBuiltInMap(data), ((AdObject) this.$ad.f39740a).getPlacementId(), ((AdObject) this.$ad.f39740a).isScarAd(), ((AdObject) this.$ad.f39740a).getScarQueryId(), ((AdObject) this.$ad.f39740a).getScarAdString(), ((AdObject) this.$ad.f39740a).getScarAdUnitId(), ((AdObject) this.$ad.f39740a).isOfferwallAd(), ((AdObject) this.$ad.f39740a).getOfferwallPlacementName()));
                return C2515C.f34653a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "Lef/C;", "<anonymous>", "(LHf/m;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends AbstractC3471j implements q {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(AdObject adObject, AndroidShow androidShow, ByteString byteString, InterfaceC3103c<? super AnonymousClass5> interfaceC3103c) {
                super(3, interfaceC3103c);
                this.$adObject = adObject;
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // tf.q
            @Nullable
            public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable Throwable th, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return new AnonymousClass5(this.$adObject, this.this$0, this.$opportunityId, interfaceC3103c).invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kf.a aVar = kf.a.f39711a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                ((x0) this.$adObject.getState()).j(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return C2515C.f34653a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "", "<anonymous>", "(LHf/m;Lcom/unity3d/ads/core/data/model/ShowEvent;)Z"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$6", f = "AndroidShow.kt", l = {85}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends AbstractC3471j implements q {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass6(InterfaceC3103c<? super AnonymousClass6> interfaceC3103c) {
                super(3, interfaceC3103c);
            }

            @Override // tf.q
            @Nullable
            public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @NotNull ShowEvent showEvent, @Nullable InterfaceC3103c<? super Boolean> interfaceC3103c) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(interfaceC3103c);
                anonymousClass6.L$0 = interfaceC0603m;
                anonymousClass6.L$1 = showEvent;
                return anonymousClass6.invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ShowEvent showEvent;
                kf.a aVar = kf.a.f39711a;
                int i5 = this.label;
                if (i5 == 0) {
                    e.U(obj);
                    InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (interfaceC0603m.emit(showEvent2, this) == aVar) {
                        return aVar;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    e.U(obj);
                }
                return Boolean.valueOf(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, interfaceC3103c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x017b, code lost:
        
            if (r0.collect(r1, r25) == r10) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 409
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidShow(@NotNull Context context, @NotNull AdRepository adRepository, @NotNull GameServerIdReader gameServerIdReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull ValidateExtrasSize validateExtrasSize, @NotNull HandleGatewayAdResponse handleGatewayAdResponse) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adRepository, "adRepository");
        AbstractC3340k.e(gameServerIdReader, "gameServerIdReader");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(validateExtrasSize, "validateExtrasSize");
        AbstractC3340k.e(handleGatewayAdResponse, "handleGatewayAdResponse");
        this.context = context;
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
    }

    @Override // com.unity3d.ads.core.domain.Show
    @NotNull
    public InterfaceC0602l invoke(@NotNull AdObject adObject, @Nullable UnityAdsShowOptions showOptions) {
        AbstractC3340k.e(adObject, "adObject");
        return new f0(new AnonymousClass1(adObject, this, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    @Nullable
    public Object terminate(@NotNull AdObject adObject, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(interfaceC3103c)) != kf.a.f39711a) ? C2515C.f34653a : objDestroy;
    }
}
