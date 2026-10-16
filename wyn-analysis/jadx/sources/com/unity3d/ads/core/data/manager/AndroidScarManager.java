package com.unity3d.ads.core.data.manager;

import A6.h;
import Ef.C0502n;
import Ef.E;
import Ef.H;
import Fe.e;
import Hf.C0;
import Hf.C0611v;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.J;
import Hf.f0;
import Hf.k0;
import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ff.m;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import nb.c;
import nb.d;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.p;
import tf.q;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidScarManager;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "scarEventReceiver", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "gmaBridge", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "scarTimeHackFixer", "<init>", "(Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;)V", "", MobileAdsBridge.versionMethodName, "(Ljf/c;)Ljava/lang/Object;", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "getSignals", "(Ljava/util/List;Ljf/c;)Ljava/lang/Object;", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, HandleInvocationsFromAdViewer.KEY_AD_STRING, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, HandleInvocationsFromAdViewer.KEY_QUERY_ID, "", HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, "Lef/C;", "loadAd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjf/c;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/unity3d/services/banners/BannerView;", "bannerView", "Lnb/c;", "scarAdMetadata", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "opportunityId", "LHf/l;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "loadBannerAd", "(Landroid/content/Context;Lcom/unity3d/services/banners/BannerView;Lnb/c;Lcom/unity3d/services/banners/UnityBannerSize;Ljava/lang/String;)LHf/l;", "show", "(Ljava/lang/String;Ljava/lang/String;)LHf/l;", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidScarManager implements ScarManager {

    @NotNull
    private final GMAScarAdapterBridge gmaBridge;

    @NotNull
    private final CommonScarEventReceiver scarEventReceiver;

    @NotNull
    private final ScarTimeHackFixer scarTimeHackFixer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "<anonymous>", "(LEf/E;)Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass2(this.$adFormat, this.this$0, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super BiddingSignals> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                return obj;
            }
            e.U(obj);
            List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
            AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            final C0502n c0502n = new C0502n(1, h.A(this));
            c0502n.t();
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    d unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                    if (unityAdFormat == d.f41005a) {
                        unityAdFormat = null;
                    }
                    if (unityAdFormat != null) {
                        arrayList.add(unityAdFormat);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                c0502n.resumeWith(null);
            } else {
                androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsFailure(@Nullable String msg) {
                        c0502n.resumeWith(e.z(new Exception(msg)));
                    }

                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsReady(@Nullable BiddingSignals signals) {
                        c0502n.resumeWith(signals);
                    }
                }));
            }
            Object objS = c0502n.s();
            kf.a aVar2 = kf.a.f39711a;
            return objS == aVar ? aVar : objS;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "", "<anonymous>", "(LEf/E;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22862 extends AbstractC3471j implements p {
        int label;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3471j implements p {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
                super(2, interfaceC3103c);
                this.this$0 = androidScarManager;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                return new AnonymousClass1(this.this$0, interfaceC3103c);
            }

            @Override // tf.p
            @Nullable
            public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((AnonymousClass1) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kf.a aVar = kf.a.f39711a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                this.this$0.gmaBridge.getVersion();
                return C2515C.f34653a;
            }
        }

        public C22862(InterfaceC3103c<? super C22862> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidScarManager.this.new C22862(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super String> interfaceC3103c) {
            return ((C22862) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
                return obj;
            }
            e.U(obj);
            C0 c02 = new C0(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
            this.label = 1;
            Object objO = k0.o(c02, this);
            return objO == aVar ? aVar : objO;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {93}, m = "loadAd")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22872 extends AbstractC3471j implements p {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22872(boolean z2, String str, String str2, String str3, String str4, int i5, InterfaceC3103c<? super C22872> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$canSkip = z2;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i5;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidScarManager.this.new C22872(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C22872) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3471j implements p {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, InterfaceC3103c<? super AnonymousClass3> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$placementId = str;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, interfaceC3103c);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull GmaEventData gmaEventData, @Nullable InterfaceC3103c<? super Boolean> interfaceC3103c) {
            return ((AnonymousClass3) create(gmaEventData, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z2 = true;
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            if ((!AbstractC3935e.D(b.k, b.f32700o).contains(gmaEventData.getGmaEvent()) || !AbstractC3340k.a(gmaEventData.getPlacementId(), this.$placementId)) && !AbstractC3935e.D(b.f32684E, b.f32688b, b.f32699n).contains(gmaEventData.getGmaEvent())) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22881 extends AbstractC3471j implements p {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ c $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22881(Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize, InterfaceC3103c<? super C22881> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = cVar;
            this.$bannerSize = unityBannerSize;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidScarManager.this.new C22881(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C22881) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22891 extends AbstractC3471j implements p {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22891(String str, String str2, InterfaceC3103c<? super C22891> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidScarManager.this.new C22891(this.$placementId, this.$queryId, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C22891) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "it", "", "<anonymous>", "(LHf/m;Lcom/unity3d/ads/core/domain/scar/GmaEventData;)Z"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22902 extends AbstractC3471j implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C22902(InterfaceC3103c<? super C22902> interfaceC3103c) {
            super(3, interfaceC3103c);
        }

        @Override // tf.q
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @NotNull GmaEventData gmaEventData, @Nullable InterfaceC3103c<? super Boolean> interfaceC3103c) {
            C22902 c22902 = new C22902(interfaceC3103c);
            c22902.L$0 = interfaceC0603m;
            c22902.L$1 = gmaEventData;
            return c22902.invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GmaEventData gmaEventData;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (interfaceC0603m.emit(gmaEventData2, this) == aVar) {
                    return aVar;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                e.U(obj);
            }
            return Boolean.valueOf(!m.e0(gmaEventData.getGmaEvent(), new b[]{b.f32683D, b.f32701p, b.f32706u, b.f32705t}));
        }
    }

    public AndroidScarManager(@NotNull CommonScarEventReceiver scarEventReceiver, @NotNull GMAScarAdapterBridge gmaBridge, @NotNull ScarTimeHackFixer scarTimeHackFixer) {
        AbstractC3340k.e(scarEventReceiver, "scarEventReceiver");
        AbstractC3340k.e(gmaBridge, "gmaBridge");
        AbstractC3340k.e(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getSignals(@Nullable List<? extends AdFormatOuterClass.AdFormat> list, @NotNull InterfaceC3103c<? super BiddingSignals> interfaceC3103c) {
        return H.R(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), interfaceC3103c);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getVersion(@NotNull InterfaceC3103c<? super String> interfaceC3103c) {
        return H.R(5000L, new C22862(null), interfaceC3103c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, int r20, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r21) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r14 = this;
            r0 = r21
            boolean r2 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1
            if (r2 == 0) goto L16
            r2 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = (com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            kf.a r10 = kf.a.f39711a
            int r2 = r9.label
            r11 = 0
            r12 = 1
            if (r2 == 0) goto L34
            if (r2 != r12) goto L2c
            Fe.e.U(r0)
            goto L69
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L34:
            Fe.e.U(r0)
            java.lang.String r0 = "INTERSTITIAL"
            boolean r2 = Bf.r.c0(r15, r0, r12)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r14.scarEventReceiver
            Hf.g0 r13 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r1 = r14
            r3 = r16
            r5 = r17
            r6 = r18
            r4 = r19
            r7 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            Hf.C0 r1 = new Hf.C0
            r1.<init>(r13, r0)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r3 = r16
            r0.<init>(r3, r11)
            r9.label = r12
            java.lang.Object r0 = Hf.k0.p(r1, r0, r9)
            if (r0 != r10) goto L69
            return r10
        L69:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.b r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.b r2 = com.unity3d.scar.adapter.common.b.k
            if (r1 == r2) goto L75
            r11 = r0
        L75:
            com.unity3d.ads.core.domain.scar.GmaEventData r11 = (com.unity3d.ads.core.domain.scar.GmaEventData) r11
            if (r11 == 0) goto L98
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.<init>(r2)
            java.lang.String r2 = r11.getErrorMessage()
            if (r2 != 0) goto L8c
            com.unity3d.scar.adapter.common.b r2 = r11.getGmaEvent()
        L8c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        L98:
            ef.C r0 = ef.C2515C.f34653a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public InterfaceC0602l loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull c scarAdMetadata, @NotNull UnityBannerSize bannerSize, @NotNull final String opportunityId) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(bannerView, "bannerView");
        AbstractC3340k.e(scarAdMetadata, "scarAdMetadata");
        AbstractC3340k.e(bannerSize, "bannerSize");
        AbstractC3340k.e(opportunityId, "opportunityId");
        final C0611v c0611v = new C0611v(new C22881(context, bannerView, opportunityId, scarAdMetadata, bannerSize, null), this.scarEventReceiver.getGmaEventFlow());
        return new InterfaceC0602l() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC0603m interfaceC0603m, String str) {
                    this.$this_unsafeFlow = interfaceC0603m;
                    this.$opportunityId$inlined = str;
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
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r8)
                        goto L54
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        Fe.e.U(r8)
                        Hf.m r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.b r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.b r5 = com.unity3d.scar.adapter.common.b.f32685F
                        if (r4 != r5) goto L54
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = kotlin.jvm.internal.AbstractC3340k.a(r2, r4)
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L54
                        return r1
                    L54:
                        ef.C r7 = ef.C2515C.f34653a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                Object objCollect = c0611v.collect(new AnonymousClass2(interfaceC0603m, opportunityId), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public InterfaceC0602l show(@NotNull String placementId, @NotNull String queryId) {
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(queryId, "queryId");
        return new f0(new J(new C0(this.scarEventReceiver.getGmaEventFlow(), new C22891(placementId, queryId, null)), new C22902(null), null));
    }
}
