package com.unity3d.ads.core.data.manager;

import Fe.e;
import Hf.C0;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.J;
import Hf.f0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import ef.C2515C;
import ff.m;
import java.lang.reflect.InvocationTargetException;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.p;
import tf.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "offerwallBridge", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;Lcom/unity3d/ads/core/log/Logger;)V", "", MobileAdsBridge.versionMethodName, "(Ljf/c;)Ljava/lang/Object;", "", "isConnected", HandleInvocationsFromAdViewer.KEY_PLACEMENT_NAME, "isAdReady", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lef/C;", "loadAd", "LHf/l;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "showAd", "(Ljava/lang/String;)LHf/l;", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidOfferwallManager implements OfferwallManager {

    @NotNull
    private final Logger logger;

    @NotNull
    private final OfferwallAdapterBridge offerwallBridge;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {29}, m = "loadAd")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1, reason: invalid class name */
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
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$placementName = str;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidOfferwallManager.this.new AnonymousClass2(this.$placementName, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3471j implements p {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, InterfaceC3103c<? super AnonymousClass3> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$placementName = str;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementName, interfaceC3103c);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull OfferwallEventData offerwallEventData, @Nullable InterfaceC3103c<? super Boolean> interfaceC3103c) {
            return ((AnonymousClass3) create(offerwallEventData, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            return Boolean.valueOf(AbstractC3935e.D(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && AbstractC3340k.a(offerwallEventData.getPlacementName(), this.$placementName));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22841 extends AbstractC3471j implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22841(String str, InterfaceC3103c<? super C22841> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$placementName = str;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidOfferwallManager.this.new C22841(this.$placementName, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C22841) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "it", "", "<anonymous>", "(LHf/m;Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;)Z"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22852 extends AbstractC3471j implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C22852(InterfaceC3103c<? super C22852> interfaceC3103c) {
            super(3, interfaceC3103c);
        }

        @Override // tf.q
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @NotNull OfferwallEventData offerwallEventData, @Nullable InterfaceC3103c<? super Boolean> interfaceC3103c) {
            C22852 c22852 = new C22852(interfaceC3103c);
            c22852.L$0 = interfaceC0603m;
            c22852.L$1 = offerwallEventData;
            return c22852.invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OfferwallEventData offerwallEventData;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (interfaceC0603m.emit(offerwallEventData2, this) == aVar) {
                    return aVar;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                e.U(obj);
            }
            return Boolean.valueOf(!m.e0(offerwallEventData.getOfferwallEvent(), new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}));
        }
    }

    public AndroidOfferwallManager(@NotNull OfferwallAdapterBridge offerwallBridge, @NotNull Logger logger) {
        AbstractC3340k.e(offerwallBridge, "offerwallBridge");
        AbstractC3340k.e(logger, "logger");
        this.offerwallBridge = offerwallBridge;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object getVersion(@NotNull InterfaceC3103c<? super String> interfaceC3103c) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isAdReady(@NotNull String str, @NotNull InterfaceC3103c<? super Boolean> interfaceC3103c) {
        return Boolean.valueOf(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isConnected(@NotNull InterfaceC3103c<? super Boolean> interfaceC3103c) {
        return Boolean.valueOf(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r8) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            Fe.e.U(r8)
            goto L64
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            Fe.e.U(r8)
            com.unity3d.ads.core.log.Logger r8 = r6.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Offerwall Manager - loadAd: "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r8.debug(r2)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r8 = r6.offerwallBridge
            Hf.g0 r8 = r8.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r2.<init>(r7, r4)
            Hf.C0 r5 = new Hf.C0
            r5.<init>(r8, r2)
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r8 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r8.<init>(r7, r4)
            r0.label = r3
            java.lang.Object r8 = Hf.k0.p(r5, r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r7 = r8
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r7 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r7
            com.unity3d.services.ads.offerwall.OfferwallEvent r7 = r7.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            if (r7 == r0) goto L70
            r4 = r8
        L70:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r4
            if (r4 == 0) goto L9e
            com.unity3d.ads.core.data.model.exception.LoadException r7 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.Integer r8 = r4.getErrorCode()
            if (r8 == 0) goto L81
            int r8 = r8.intValue()
            goto L82
        L81:
            r8 = 0
        L82:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error loading offerwall ad: "
            r0.<init>(r1)
            java.lang.String r1 = r4.getErrorMessage()
            if (r1 != 0) goto L93
            com.unity3d.services.ads.offerwall.OfferwallEvent r1 = r4.getOfferwallEvent()
        L93:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r8, r0)
            throw r7
        L9e:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @NotNull
    public InterfaceC0602l showAd(@NotNull String placementName) {
        AbstractC3340k.e(placementName, "placementName");
        this.logger.debug("Offerwall Manager - showAd: ".concat(placementName));
        return new f0(new J(new C0(this.offerwallBridge.getOfferwallEventFlow(), new C22841(placementName, null)), new C22852(null), null));
    }
}
