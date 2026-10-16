package com.moloco.sdk.publisher;

import Cf.h;
import E5.Q;
import Ef.E;
import Ef.H;
import Ef.H0;
import Ef.InterfaceC0501m0;
import Ef.S;
import Fe.e;
import Hf.x0;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.J;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.protobuf.Internal;
import com.moloco.sdk.B0;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.C2144z0;
import com.moloco.sdk.G0;
import com.moloco.sdk.I0;
import com.moloco.sdk.J0;
import com.moloco.sdk.K0;
import com.moloco.sdk.Y;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.acm.n;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.m;
import com.moloco.sdk.internal.ilrd.s;
import com.moloco.sdk.internal.publisher.C1924m;
import com.moloco.sdk.internal.publisher.C1925n;
import com.moloco.sdk.internal.publisher.C1926o;
import com.moloco.sdk.internal.publisher.C1927p;
import com.moloco.sdk.internal.publisher.C1928q;
import com.moloco.sdk.internal.publisher.C1929s;
import com.moloco.sdk.internal.publisher.C1931u;
import com.moloco.sdk.internal.publisher.r;
import com.moloco.sdk.internal.publisher.r0;
import com.moloco.sdk.internal.services.C1944g;
import com.moloco.sdk.internal.services.bidtoken.i;
import com.moloco.sdk.internal.services.bidtoken.k;
import com.moloco.sdk.internal.services.bidtoken.o;
import com.moloco.sdk.internal.services.events.g;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.j;
import com.moloco.sdk.service_locator.l;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.C2527k;
import ef.C2530n;
import ef.InterfaceC2525i;
import ff.AbstractC2640A;
import ic.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0081@¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JM\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 JM\u0010!\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b!\u0010 JM\u0010\"\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b\"\u0010 JM\u0010%\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`$H\u0007¢\u0006\u0004\b%\u0010 JM\u0010(\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`'H\u0007¢\u0006\u0004\b(\u0010 JM\u0010+\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`*H\u0007¢\u0006\u0004\b+\u0010 J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b0\u0010\u0006J\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u000fJ\u000f\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u0010\u0003J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00107R2\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n09088\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u0003\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bT\u0010UR*\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bX\u0010Y\u0012\u0004\b^\u0010\u0003\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u00101\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u0010_\u0012\u0004\bc\u0010\u0003\u001a\u0004\b`\u0010a\"\u0004\bb\u0010\u000fR\u0016\u0010f\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00170g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u0002058FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0003\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/moloco/sdk/publisher/Moloco;", "", "<init>", "()V", "Lef/C;", "clearState$moloco_sdk_release", "(Ljf/c;)Ljava/lang/Object;", "clearState", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "initParam", "Lcom/moloco/sdk/publisher/MolocoInitializationListener;", "listener", MobileAdsBridgeBase.initializeMethodName, "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;Lcom/moloco/sdk/publisher/MolocoInitializationListener;)V", "logMolocoInfo", "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;)V", "Lcom/moloco/sdk/publisher/MediationInfo;", "mediationInfo", "Landroid/content/Context;", "context", "Lcom/moloco/sdk/publisher/MolocoBidTokenListener;", "getBidToken", "(Lcom/moloco/sdk/publisher/MediationInfo;Landroid/content/Context;Lcom/moloco/sdk/publisher/MolocoBidTokenListener;)V", "", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "watermarkString", "Lkotlin/Function2;", "Lcom/moloco/sdk/publisher/Banner;", "Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "Lcom/moloco/sdk/publisher/CreateBannerCallback;", "callback", "createBanner", "(Lcom/moloco/sdk/publisher/MediationInfo;Ljava/lang/String;Ljava/lang/String;Ltf/p;)V", "createBannerTablet", "createMREC", "Lcom/moloco/sdk/publisher/NativeAd;", "Lcom/moloco/sdk/publisher/CreateNativeAdCallback;", "createNativeAd", "Lcom/moloco/sdk/publisher/InterstitialAd;", "Lcom/moloco/sdk/publisher/CreateInterstitialAdCallback;", "createInterstitial", "Lcom/moloco/sdk/publisher/RewardedInterstitialAd;", "Lcom/moloco/sdk/publisher/CreateRewardedInterstitialAdCallback;", "createRewardedInterstitial", "Lcom/moloco/sdk/K0;", "sdkInitResponse", "processInitConfigs", "(Lcom/moloco/sdk/K0;)V", "updateAndroidClientMetricsOnInitSuccess", "initParams", "initializeAndroidClientMetrics", "initializeILRD", "mediationName", "", "shouldInitializeILRD", "(Ljava/lang/String;)Z", "", "", "pendingInitByMediator", "Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release", "()Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release$annotations", "", "_failedMediations", "Ljava/util/Set;", "Lcom/moloco/sdk/internal/publisher/r0;", "initializationHandler$delegate", "Lef/i;", "getInitializationHandler", "()Lcom/moloco/sdk/internal/publisher/r0;", "initializationHandler", "Lcom/moloco/sdk/internal/services/bidtoken/i;", "bidTokenHandler$delegate", "getBidTokenHandler", "()Lcom/moloco/sdk/internal/services/bidtoken/i;", "bidTokenHandler", "Lcom/moloco/sdk/internal/publisher/s;", "adCreator$delegate", "getAdCreator", "()Lcom/moloco/sdk/internal/publisher/s;", "adCreator", "LEf/E;", "scope$delegate", "getScope", "()LEf/E;", "scope", "LEf/m0;", "initJob", "LEf/m0;", "getInitJob", "()LEf/m0;", "setInitJob", "(LEf/m0;)V", "getInitJob$annotations", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "getInitParams", "()Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "setInitParams", "getInitParams$annotations", "getAppKey$moloco_sdk_release", "()Ljava/lang/String;", "appKey", "", "getFailedMediations$moloco_sdk_release", "()Ljava/util/Set;", "failedMediations", "isInitialized", "()Z", "isInitialized$annotations", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class Moloco {

    @Nullable
    private static InterfaceC0501m0 initJob;

    @Nullable
    private static MolocoInitParams initParams;

    @NotNull
    public static final Moloco INSTANCE = new Moloco();

    @NotNull
    private static final Map<String, List<MolocoInitializationListener>> pendingInitByMediator = new LinkedHashMap();

    @NotNull
    private static final Set<String> _failedMediations = new LinkedHashSet();

    /* renamed from: initializationHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC2525i initializationHandler = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(4));

    /* renamed from: bidTokenHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC2525i bidTokenHandler = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(5));

    /* renamed from: adCreator$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC2525i adCreator = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(6));

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC2525i scope = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(7));
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[J0.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$createBanner$1", f = "Moloco.kt", l = {249}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$createBanner$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediationInfo mediationInfo, String str, String str2, p pVar, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2527k c2527k;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                String name = this.$mediationInfo.getName();
                aVar2.getClass();
                com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                C1929s adCreator = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = H.P(adCreator.f29340e, new C1924m(adCreator, cVarA, str, str2, name2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            A a5 = (A) obj;
            if (a5 instanceof z) {
                c2527k = new C2527k(((z) a5).f29794a, null);
            } else {
                if (!(a5 instanceof y)) {
                    throw new Q((byte) 0, 9);
                }
                c2527k = new C2527k(null, ((y) a5).f29793a);
            }
            Banner banner = (Banner) c2527k.f34671a;
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) c2527k.f34672b;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$createBannerTablet$1", f = "Moloco.kt", l = {280}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$createBannerTablet$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19591 extends AbstractC3471j implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19591(MediationInfo mediationInfo, String str, String str2, p pVar, InterfaceC3103c<? super C19591> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new C19591(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2527k c2527k;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                String name = this.$mediationInfo.getName();
                aVar2.getClass();
                com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                C1929s adCreator = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = H.P(adCreator.f29340e, new C1925n(adCreator, cVarA, str, str2, name2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            A a5 = (A) obj;
            if (a5 instanceof z) {
                c2527k = new C2527k(((z) a5).f29794a, null);
            } else {
                if (!(a5 instanceof y)) {
                    throw new Q((byte) 0, 9);
                }
                c2527k = new C2527k(null, ((y) a5).f29793a);
            }
            Banner banner = (Banner) c2527k.f34671a;
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) c2527k.f34672b;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C19591) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$createInterstitial$1", f = "Moloco.kt", l = {372}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$createInterstitial$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19601 extends AbstractC3471j implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19601(MediationInfo mediationInfo, String str, String str2, p pVar, InterfaceC3103c<? super C19601> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new C19601(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2527k c2527k;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                String name = this.$mediationInfo.getName();
                aVar2.getClass();
                com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                C1929s adCreator = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = H.P(adCreator.f29340e, new C1926o(adCreator, cVarA, str, str2, name2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            A a5 = (A) obj;
            if (a5 instanceof z) {
                c2527k = new C2527k(((z) a5).f29794a, null);
            } else {
                if (!(a5 instanceof y)) {
                    throw new Q((byte) 0, 9);
                }
                c2527k = new C2527k(null, ((y) a5).f29793a);
            }
            InterstitialAd interstitialAd = (InterstitialAd) c2527k.f34671a;
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) c2527k.f34672b;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Interstitial for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(interstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(interstitialAd, adCreateError);
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C19601) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$createMREC$1", f = "Moloco.kt", l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$createMREC$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19611 extends AbstractC3471j implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19611(MediationInfo mediationInfo, String str, String str2, p pVar, InterfaceC3103c<? super C19611> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new C19611(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2527k c2527k;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                String name = this.$mediationInfo.getName();
                aVar2.getClass();
                com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                C1929s adCreator = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = H.P(adCreator.f29340e, new C1927p(adCreator, cVarA, str, str2, name2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            A a5 = (A) obj;
            if (a5 instanceof z) {
                c2527k = new C2527k(((z) a5).f29794a, null);
            } else {
                if (!(a5 instanceof y)) {
                    throw new Q((byte) 0, 9);
                }
                c2527k = new C2527k(null, ((y) a5).f29793a);
            }
            Banner banner = (Banner) c2527k.f34671a;
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) c2527k.f34672b;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("MREC for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C19611) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$createNativeAd$1", f = "Moloco.kt", l = {343}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$createNativeAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19621 extends AbstractC3471j implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19621(MediationInfo mediationInfo, String str, String str2, p pVar, InterfaceC3103c<? super C19621> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new C19621(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2527k c2527k;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                String name = this.$mediationInfo.getName();
                aVar2.getClass();
                com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                C1929s adCreator = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = H.P(adCreator.f29340e, new C1928q(adCreator, cVarA, str, str2, name2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            A a5 = (A) obj;
            if (a5 instanceof z) {
                c2527k = new C2527k(((z) a5).f29794a, null);
            } else {
                if (!(a5 instanceof y)) {
                    throw new Q((byte) 0, 9);
                }
                c2527k = new C2527k(null, ((y) a5).f29793a);
            }
            NativeAd nativeAd = (NativeAd) c2527k.f34671a;
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) c2527k.f34672b;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Native Ad for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(nativeAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(nativeAd, adCreateError);
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C19621) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1", f = "Moloco.kt", l = {TTAdConstant.AD_ID_IS_NULL_CODE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19631 extends AbstractC3471j implements p {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ p $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19631(MediationInfo mediationInfo, String str, String str2, p pVar, InterfaceC3103c<? super C19631> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = pVar;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new C19631(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2527k c2527k;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                String name = this.$mediationInfo.getName();
                aVar2.getClass();
                com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                C1929s adCreator = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = H.P(adCreator.f29340e, new r(adCreator, cVarA, str, str2, name2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            A a5 = (A) obj;
            if (a5 instanceof z) {
                c2527k = new C2527k(((z) a5).f29794a, null);
            } else {
                if (!(a5 instanceof y)) {
                    throw new Q((byte) 0, 9);
                }
                c2527k = new C2527k(null, ((y) a5).f29793a);
            }
            RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) c2527k.f34671a;
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) c2527k.f34672b;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Rewarded for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(rewardedInterstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(rewardedInterstitialAd, adCreateError);
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C19631) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$getBidToken$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19641 extends AbstractC3471j implements p {
        final /* synthetic */ MolocoBidTokenListener $listener;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ com.moloco.sdk.acm.recorder.b $metricsRecorder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19641(com.moloco.sdk.acm.recorder.b bVar, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, InterfaceC3103c<? super C19641> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$metricsRecorder = bVar;
            this.$mediationInfo = mediationInfo;
            this.$listener = molocoBidTokenListener;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new C19641(this.$metricsRecorder, this.$mediationInfo, this.$listener, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
                i bidTokenHandler = Moloco.INSTANCE.getBidTokenHandler();
                com.moloco.sdk.acm.recorder.b bVar = this.$metricsRecorder;
                MediationInfo mediationInfo = this.$mediationInfo;
                MolocoBidTokenListener molocoBidTokenListener = this.$listener;
                this.label = 1;
                if (((k) bidTokenHandler).a(bVar, mediationInfo, molocoBidTokenListener, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            return C2515C.f34653a;
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C19641) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", l = {149, 151, 174}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.publisher.Moloco$initialize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ MolocoInitParams $initParam;
        final /* synthetic */ MolocoInitializationListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$initParam = molocoInitParams;
            this.$listener = molocoInitializationListener;
        }

        @Override // lf.AbstractC3462a
        public final InterfaceC3103c<C2515C> create(Object obj, InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass2(this.$initParam, this.$listener, interfaceC3103c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x014e, code lost:
        
            if (r2.updateAndroidClientMetricsOnInitSuccess(r13) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
        @Override // lf.AbstractC3462a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 494
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tf.p
        public final Object invoke(E e7, InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    private Moloco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1929s adCreator_delegate$lambda$9() {
        return new C1929s(INSTANCE.getInitializationHandler().f29333c, com.moloco.sdk.service_locator.i.b(), new C1931u(), new Moloco$adCreator$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k bidTokenHandler_delegate$lambda$8() {
        return new k((o) com.moloco.sdk.internal.services.bidtoken.p.f29465a.getValue(), INSTANCE.getInitializationHandler(), com.moloco.sdk.service_locator.i.b());
    }

    public static final void createBanner(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull p callback) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner async for adUnitId: " + adUnitId, null, false, 12, null);
        H.D(INSTANCE.getScope(), null, new AnonymousClass1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createBanner$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        createBanner(mediationInfo, str, str2, pVar);
    }

    public static final void createBannerTablet(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull p callback) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner tablet async for adUnitId: " + adUnitId, null, false, 12, null);
        H.D(INSTANCE.getScope(), null, new C19591(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createBannerTablet$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        createBannerTablet(mediationInfo, str, str2, pVar);
    }

    public static final void createInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull p callback) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating interstitial ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        H.D(INSTANCE.getScope(), null, new C19601(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createInterstitial$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        createInterstitial(mediationInfo, str, str2, pVar);
    }

    public static final void createMREC(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull p callback) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner MREC async for adUnitId: " + adUnitId, null, false, 12, null);
        H.D(INSTANCE.getScope(), null, new C19611(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createMREC$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        createMREC(mediationInfo, str, str2, pVar);
    }

    public static final void createNativeAd(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull p callback) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating native ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        H.D(INSTANCE.getScope(), null, new C19621(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createNativeAd$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        createNativeAd(mediationInfo, str, str2, pVar);
    }

    public static final void createRewardedInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull p callback) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating rewarded ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        H.D(INSTANCE.getScope(), null, new C19631(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createRewardedInterstitial$default(MediationInfo mediationInfo, String str, String str2, p pVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        createRewardedInterstitial(mediationInfo, str, str2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1929s getAdCreator() {
        return (C1929s) adCreator.getValue();
    }

    public static final void getBidToken(@NotNull MediationInfo mediationInfo, @NotNull Context context, @NotNull MolocoBidTokenListener listener) {
        AbstractC3340k.e(mediationInfo, "mediationInfo");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(listener, "listener");
        d.e(context);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Fetching bid token", null, false, 12, null);
        com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
        String name = mediationInfo.getName();
        aVar.getClass();
        H.D(com.moloco.sdk.internal.scheduling.a.f29366a, null, new C19641(com.moloco.sdk.acm.recorder.a.a(name), mediationInfo, listener, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i getBidTokenHandler() {
        return (i) bidTokenHandler.getValue();
    }

    public static /* synthetic */ void getInitJob$annotations() {
    }

    public static /* synthetic */ void getInitParams$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 getInitializationHandler() {
        return (r0) initializationHandler.getValue();
    }

    public static /* synthetic */ void getPendingInitByMediator$moloco_sdk_release$annotations() {
    }

    private final E getScope() {
        return (E) scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 initializationHandler_delegate$lambda$7() {
        return new r0(com.moloco.sdk.service_locator.i.b());
    }

    public static final void initialize(@NotNull MolocoInitParams initParam) {
        AbstractC3340k.e(initParam, "initParam");
        initialize$default(initParam, null, 2, null);
    }

    public static /* synthetic */ void initialize$default(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            molocoInitializationListener = null;
        }
        initialize(molocoInitParams, molocoInitializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public final void initializeAndroidClientMetrics(MolocoInitParams initParams2) {
        getInitializationHandler().getClass();
        try {
            j.b();
            com.moloco.sdk.internal.configs.a aVar = com.moloco.sdk.internal.configs.b.f28501a;
            f fVar = f.f28407a;
            String appKey = initParams2.getAppKey();
            String str = aVar.f28499a;
            Context appContext = initParams2.getAppContext();
            long j8 = aVar.f28500b;
            C2527k c2527k = new C2527k("AppKey", initParams2.getAppKey());
            C2527k c2527k2 = new C2527k("AppBundle", com.moloco.sdk.service_locator.e.a().a().f29734a);
            C2527k c2527k3 = new C2527k("AppVersion", com.moloco.sdk.service_locator.e.a().a().f29735b);
            C2527k c2527k4 = new C2527k("SdkVersion", BuildConfig.SDK_VERSION_NAME);
            com.moloco.sdk.service_locator.e.b().a();
            C2527k c2527k5 = new C2527k("OS", "android");
            com.moloco.sdk.service_locator.e.b().a();
            com.moloco.sdk.acm.j jVar = new com.moloco.sdk.acm.j(appKey, str, appContext, j8, AbstractC2640A.R(c2527k, c2527k2, c2527k3, c2527k4, c2527k5, new C2527k("osv", Build.VERSION.RELEASE)));
            com.moloco.sdk.acm.services.e.g("AndroidClientMetrics", "ACM initialize");
            AtomicReference atomicReference = f.f28414h;
            com.moloco.sdk.acm.o oVar = com.moloco.sdk.acm.o.f28461c;
            com.moloco.sdk.acm.o oVar2 = com.moloco.sdk.acm.o.f28460b;
            while (!atomicReference.compareAndSet(oVar, oVar2)) {
                if (atomicReference.get() != oVar) {
                    return;
                }
            }
            f.f28410d = new n(jVar.f28444a, jVar.f28445b, jVar.f28447d, jVar.f28448e);
            H.D(f.f28413g, null, new com.moloco.sdk.acm.a(jVar, null), 3);
        } catch (IllegalStateException unused) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ACM cannot be initialized as Moloco SDK cannot be initialized", null, false, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeILRD() {
        Object objZ;
        K0 k02 = getInitializationHandler().f29334d;
        if (k02 == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ILRD cannot be initialized as Moloco SDK is not initialized", null, false, 12, null);
            return;
        }
        s sVar = (s) com.moloco.sdk.service_locator.b.f29835e.getValue();
        sVar.getClass();
        if (sVar.f28643b != null) {
            objZ = C2515C.f34653a;
        } else {
            G0 g0G = k02.m() ? k02.g() : null;
            if (g0G == null) {
                objZ = e.z(new Exception("No ILRD configuration found"));
            } else {
                Internal.ListAdapter listAdapterF = g0G.f();
                if (!g0G.getEnabled()) {
                    objZ = e.z(new Exception("Publisher has not opted into ILRD collection"));
                } else if (listAdapterF.isEmpty()) {
                    objZ = e.z(new Exception("No ILRD supported networks available"));
                } else {
                    Lf.e eVar = S.f3698a;
                    Kd.a aVarC = H.c(Lf.d.f7120b.plus(H.f()));
                    String strD = g0G.d();
                    AbstractC3340k.d(strD, "getRawImpUrl(...)");
                    com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVarB = j.b();
                    h hVar = Cf.a.f2200b;
                    int iE = g0G.e();
                    Cf.c cVar = Cf.c.f2208d;
                    long jS = Fe.b.S(iE, cVar);
                    int maxBatchSize = g0G.getMaxBatchSize();
                    long jS2 = Fe.b.S(g0G.g(), cVar);
                    long jS3 = Fe.b.S(g0G.c(), cVar);
                    com.moloco.sdk.internal.services.k kVarB = com.moloco.sdk.service_locator.i.b();
                    C1459x c1459x = J.f18589i.f18595f;
                    q qVar = (q) com.moloco.sdk.service_locator.i.f29855c.getValue();
                    String strI = k02.i();
                    AbstractC3340k.d(strI, "getPublisherId(...)");
                    String strB = k02.b();
                    AbstractC3340k.d(strB, "getAppId(...)");
                    com.moloco.sdk.internal.ilrd.A a5 = new com.moloco.sdk.internal.ilrd.A(aVarC, sVar.f28642a, new m(aVarC, strD, nVarB, jS, maxBatchSize, jS2, jS3, kVarB, c1459x, qVar, strI, strB, (C1944g) com.moloco.sdk.service_locator.k.f29862a.getValue()), listAdapterF);
                    sVar.f28643b = a5;
                    synchronized (a5) {
                        H0 h02 = a5.f28538e;
                        if (h02 == null || !h02.isActive()) {
                            a5.f28538e = H.D(aVarC, null, new com.moloco.sdk.internal.ilrd.y(a5, null), 3);
                        }
                    }
                    objZ = C2515C.f34653a;
                }
            }
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "ILRD initialization failed. " + thA.getMessage(), null, false, 12, null);
        }
    }

    public static final boolean isInitialized() {
        return ((x0) INSTANCE.getInitializationHandler().f29333c.f5122a).getValue() == Initialization.SUCCESS;
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    private final void logMolocoInfo(MolocoInitParams initParam) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Moloco SDK initializing", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "SDK Version: 4.8.1", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Mediation: " + initParam.getMediationInfo().getName(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "isInitialized: " + isInitialized(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInitConfigs(K0 sdkInitResponse) {
        LinkedHashMap linkedHashMap;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p pVar;
        com.moloco.sdk.internal.configs.a aVar;
        if (sdkInitResponse.l()) {
            C2144z0 c2144z0E = sdkInitResponse.e();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Moloco", "Init response has eventCollectionConfig", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionConfig:", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionEnabled: " + c2144z0E.e(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "mrefCollectionEnabled: " + c2144z0E.f(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appFgUrl: " + c2144z0E.c(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appBgUrl: " + c2144z0E.b(), false, 4, null);
            com.moloco.sdk.internal.services.events.e eVar = (com.moloco.sdk.internal.services.events.e) l.f29865c.getValue();
            boolean zE = c2144z0E.e();
            boolean zF = c2144z0E.f();
            String strC = c2144z0E.c();
            AbstractC3340k.d(strC, "getAppForegroundTrackingUrl(...)");
            String strB = c2144z0E.b();
            AbstractC3340k.d(strB, "getAppBackgroundTrackingUrl(...)");
            eVar.getClass();
            eVar.f29607a = new g(strC, strB, zE, zF);
            if (c2144z0E.e()) {
                u uVarA = com.moloco.sdk.service_locator.b.a();
                uVarA.getClass();
                MolocoLogger.debug$default(molocoLogger, "AnalyticsApplicationLifecycleTrackerImpl", "Start observing application lifecycle events", false, 4, null);
                H.D(uVarA.f29721c, null, new com.moloco.sdk.internal.services.s(uVarA, null), 3);
            }
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "Init response does not have eventCollectionConfig", false, 4, null);
        }
        com.moloco.sdk.internal.services.config.a aVar2 = (com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.f29836a.getValue();
        aVar2.getClass();
        Iterator it = aVar2.f29579c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = aVar2.f29577a;
            if (!zHasNext) {
                break;
            }
            ((com.moloco.sdk.internal.services.config.handlers.a) it.next()).getClass();
            if (sdkInitResponse.n()) {
                I0 i0H = sdkInitResponse.h();
                String url = i0H.getUrl();
                AbstractC3340k.d(url, "getUrl(...)");
                aVar = new com.moloco.sdk.internal.configs.a(url, i0H.c());
            } else {
                aVar = com.moloco.sdk.internal.configs.b.f28501a;
            }
            linkedHashMap.put(com.moloco.sdk.internal.configs.a.class.getName(), aVar);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "RemoteConfigService", "Adding config: ".concat(com.moloco.sdk.internal.configs.a.class.getName()), null, false, 12, null);
        }
        String name = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p.class.getName();
        Internal.ProtobufList protobufListF = sdkInitResponse.f();
        AbstractC3340k.d(protobufListF, "getExperimentalFeatureFlagsList(...)");
        ArrayList arrayList = new ArrayList(ff.p.a0(protobufListF, 10));
        Iterator<E> it2 = protobufListF.iterator();
        while (it2.hasNext()) {
            arrayList.add(((B0) it2.next()).getName());
        }
        boolean zContains = arrayList.contains("ANDROID_STREAMING_ENABLED");
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "RemoteConfigService", "Adding StreamingEnabled: " + zContains, null, false, 12, null);
        if (sdkInitResponse.k() && sdkInitResponse.c().d() && sdkInitResponse.c().b().d()) {
            Y yC = sdkInitResponse.c().b().c();
            pVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p(((int) sdkInitResponse.c().b().c().d()) > 0 ? ((int) yC.d()) * Segment.SHARE_MINIMUM : 512000, zContains, sdkInitResponse.c().b().c().c() > 0.0d ? yC.c() : 1.0d);
        } else {
            pVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p(512000, zContains, 1.0d);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p pVar2 = pVar;
        MolocoLogger.debug$default(molocoLogger2, "RemoteConfigService", "Parsed and adding MediaConfig: " + pVar2.f30315a + ", " + pVar2.f30316b + ", " + pVar2.f30317c + ", 209715200 ", false, 4, null);
        linkedHashMap.put(name, pVar2);
        Internal.ProtobufList<B0> protobufListF2 = sdkInitResponse.f();
        AbstractC3340k.d(protobufListF2, "getExperimentalFeatureFlagsList(...)");
        for (B0 b02 : protobufListF2) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "RemoteConfigService", "Adding ExperimentalFeatureFlag: " + b02.getName(), null, false, 12, null);
            LinkedHashMap linkedHashMap2 = aVar2.f29578b;
            String name2 = b02.getName();
            String value = b02.getValue();
            linkedHashMap2.put(name2, (value == null || value.length() == 0) ? null : b02.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E scope_delegate$lambda$10() {
        Lf.e eVar = S.f3698a;
        return H.c(Jf.n.f6132a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldInitializeILRD(String mediationName) {
        G0 g0G;
        K0 k02 = getInitializationHandler().f29334d;
        if (k02 == null || (g0G = k02.g()) == null) {
            return false;
        }
        Internal.ListAdapter listAdapterF = g0G.f();
        ArrayList arrayList = new ArrayList(ff.p.a0(listAdapterF, 10));
        Iterator<T> it = listAdapterF.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            String lowerCase = ((j02 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[j02.ordinal()]) == 1 ? "LevelPlay" : j02.name()).toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = mediationName.toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
        return arrayList.contains(lowerCase2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAndroidClientMetricsOnInitSuccess(InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objC = f.f28407a.c(new com.moloco.sdk.acm.m(((com.moloco.sdk.internal.configs.a) ((com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.f29836a.getValue()).a(com.moloco.sdk.internal.configs.a.class, com.moloco.sdk.internal.configs.b.f28501a)).f28499a, new Long(r0.f28500b)), interfaceC3103c);
        return objC == kf.a.f39711a ? objC : C2515C.f34653a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearState$moloco_sdk_release(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.publisher.Moloco$clearState$1
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = (com.moloco.sdk.publisher.Moloco$clearState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = new com.moloco.sdk.publisher.Moloco$clearState$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            ef.C r3 = ef.C2515C.f34653a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            Fe.e.U(r14)
            return r3
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            java.lang.Object r2 = r0.L$0
            com.moloco.sdk.publisher.Moloco r2 = (com.moloco.sdk.publisher.Moloco) r2
            Fe.e.U(r14)
            goto L65
        L3d:
            Fe.e.U(r14)
            com.moloco.sdk.internal.MolocoLogger r7 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r9 = "clearState() unit testing function called"
            r10 = 0
            java.lang.String r8 = "Moloco"
            r11 = 4
            r12 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r7, r8, r9, r10, r11, r12)
            com.moloco.sdk.publisher.Moloco.initParams = r4
            Ef.m0 r14 = com.moloco.sdk.publisher.Moloco.initJob
            if (r14 == 0) goto L64
            r0.L$0 = r13
            r0.label = r6
            r14.cancel(r4)
            java.lang.Object r14 = r14.join(r0)
            if (r14 != r1) goto L60
            goto L61
        L60:
            r14 = r3
        L61:
            if (r14 != r1) goto L64
            goto La7
        L64:
            r2 = r13
        L65:
            com.moloco.sdk.publisher.Moloco.initJob = r4
            java.util.Map<java.lang.String, java.util.List<com.moloco.sdk.publisher.MolocoInitializationListener>> r14 = com.moloco.sdk.publisher.Moloco.pendingInitByMediator
            r14.clear()
            com.moloco.sdk.internal.publisher.r0 r14 = r2.getInitializationHandler()
            r0.L$0 = r4
            r0.label = r5
            r14.f29334d = r4
            Hf.x0 r2 = r14.f29335e
            r2.j(r4)
            Hf.x0 r14 = r14.f29332b
            r14.j(r4)
            com.moloco.sdk.service_locator.f r14 = com.moloco.sdk.service_locator.f.f29845a
            ef.p r14 = com.moloco.sdk.service_locator.f.f29849e
            java.lang.Object r14 = r14.getValue()
            com.moloco.sdk.internal.services.init.s r14 = (com.moloco.sdk.internal.services.init.s) r14
            r14.f29700d = r4
            com.moloco.sdk.internal.services.init.k r14 = r14.f29698b
            com.moloco.sdk.internal.services.init.g r2 = new com.moloco.sdk.internal.services.init.g
            r2.<init>(r14, r4)
            Lf.d r14 = r14.f29665b
            java.lang.Object r14 = Ef.H.P(r14, r2, r0)
            if (r14 != r1) goto L9c
            goto L9d
        L9c:
            r14 = r3
        L9d:
            if (r14 != r1) goto La0
            goto La1
        La0:
            r14 = r3
        La1:
            if (r14 != r1) goto La4
            goto La5
        La4:
            r14 = r3
        La5:
            if (r14 != r1) goto La8
        La7:
            return r1
        La8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.clearState$moloco_sdk_release(jf.c):java.lang.Object");
    }

    @Nullable
    public final String getAppKey$moloco_sdk_release() {
        MolocoInitParams molocoInitParams = initParams;
        if (molocoInitParams != null) {
            return molocoInitParams.getAppKey();
        }
        return null;
    }

    @NotNull
    public final Set<String> getFailedMediations$moloco_sdk_release() {
        return ff.o.X0(_failedMediations);
    }

    @Nullable
    public final InterfaceC0501m0 getInitJob() {
        return initJob;
    }

    @Nullable
    public final MolocoInitParams getInitParams() {
        return initParams;
    }

    @NotNull
    public final Map<String, List<MolocoInitializationListener>> getPendingInitByMediator$moloco_sdk_release() {
        return pendingInitByMediator;
    }

    public final void setInitJob(@Nullable InterfaceC0501m0 interfaceC0501m0) {
        initJob = interfaceC0501m0;
    }

    public final void setInitParams(@Nullable MolocoInitParams molocoInitParams) {
        initParams = molocoInitParams;
    }

    public static final synchronized void initialize(@NotNull MolocoInitParams initParam, @Nullable MolocoInitializationListener listener) {
        try {
            AbstractC3340k.e(initParam, "initParam");
            Moloco moloco = INSTANCE;
            moloco.logMolocoInfo(initParam);
            if (initParam.getAppKey().length() == 0) {
                throw new IllegalArgumentException("Moloco SDK initialized with empty appKey");
            }
            if (isInitialized()) {
                if (AbstractC3340k.a(initParam.getAppKey(), moloco.getAppKey$moloco_sdk_release())) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized. Returning and notifying listener", null, false, 12, null);
                    if (moloco.shouldInitializeILRD(initParam.getMediationInfo().getName())) {
                        moloco.initializeILRD();
                    }
                    if (listener != null) {
                        A6.h.e(listener, r0.f29329f);
                    }
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized but with different appKey. Returning error and notifying listener", null, false, 12, null);
                    _failedMediations.add(initParam.getMediationInfo().getName());
                    com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
                    String name = initParam.getMediationInfo().getName();
                    aVar.getClass();
                    com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    cVarA.a(new com.moloco.sdk.acm.h("sdk_init_failure_different_app_key"));
                    if (listener != null) {
                        MolocoInitStatus molocoInitStatus = r0.f29329f;
                        A6.h.e(listener, new MolocoInitStatus(Initialization.FAILURE, "Moloco SDK failed to initialize due to unexpected app key"));
                    }
                }
                return;
            }
            synchronized (moloco) {
                try {
                    InterfaceC0501m0 interfaceC0501m0 = initJob;
                    if (interfaceC0501m0 == null || !interfaceC0501m0.isActive()) {
                        initParams = initParam;
                        d.e(initParam.getAppContext());
                        Lf.e eVar = S.f3698a;
                        initJob = H.D(H.c(Lf.d.f7120b), null, new AnonymousClass2(initParam, listener, null), 3);
                        return;
                    }
                    String appKey = initParam.getAppKey();
                    MolocoInitParams molocoInitParams = initParams;
                    if (!AbstractC3340k.a(appKey, molocoInitParams != null ? molocoInitParams.getAppKey() : null)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with different appKey. Notifying listener and avoiding init", null, false, 12, null);
                        _failedMediations.add(initParam.getMediationInfo().getName());
                        com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                        String name2 = initParam.getMediationInfo().getName();
                        aVar2.getClass();
                        com.moloco.sdk.acm.recorder.c cVarA2 = com.moloco.sdk.acm.recorder.a.a(name2);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                        cVarA2.a(new com.moloco.sdk.acm.h("sdk_init_failure_different_app_key"));
                        if (listener != null) {
                            MolocoInitStatus molocoInitStatus2 = r0.f29329f;
                            A6.h.e(listener, new MolocoInitStatus(Initialization.FAILURE, "Moloco SDK failed to initialize due to unexpected app key during existing initialization"));
                        }
                        return;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with same appKey. Queuing listener and returning for mediator: " + initParam.getMediationInfo().getName(), null, false, 12, null);
                    String name3 = initParam.getMediationInfo().getName();
                    Map<String, List<MolocoInitializationListener>> map = pendingInitByMediator;
                    List<MolocoInitializationListener> arrayList = map.get(name3);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(name3, arrayList);
                    }
                    List<MolocoInitializationListener> list = arrayList;
                    if (listener != null) {
                        list.add(listener);
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
