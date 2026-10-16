package com.unity3d.ads.core.domain;

import Ef.C0502n;
import Ef.D;
import Ef.E;
import Ef.F;
import Ef.F0;
import Ef.H;
import Ef.L;
import Ef.w0;
import Ef.x0;
import Ef.z0;
import Fe.e;
import Hf.InterfaceC0590b0;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.Z;
import Hf.k0;
import Mf.b;
import Mf.f;
import S3.l;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ff.m;
import java.util.Set;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh;", "Lcom/unity3d/ads/core/domain/AdRefresh;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/CacheAssets;", "cacheAssets", "Lcom/unity3d/ads/core/domain/Refresh;", "refresh", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/Refresh;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lef/C;", "performRefresh", "(Lcom/google/protobuf/ByteString;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "", "canUpdateRefreshData", "(Lcom/unity3d/ads/core/data/model/AdObjectState;)Z", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lcom/unity3d/ads/core/domain/Refresh;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidAdRefresh implements AdRefresh {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final Set<AdObjectState> NON_UPDATABLE_STATES = m.P0(new AdObjectState[]{AdObjectState.SHOWING, AdObjectState.COMPLETED, AdObjectState.EXPIRED});

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheAssets cacheAssets;

    @NotNull
    private final Refresh refresh;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh$Companion;", "", "()V", "NON_UPDATABLE_STATES", "", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "getNON_UPDATABLE_STATES", "()Ljava/util/Set;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<AdObjectState> getNON_UPDATABLE_STATES() {
            return AndroidAdRefresh.NON_UPDATABLE_STATES;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3471j implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ E $refreshScope;
        int label;
        final /* synthetic */ AndroidAdRefresh this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1", f = "AndroidAdRefresh.kt", l = {125}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3471j implements p {
            final /* synthetic */ AdObject $adObject;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ AndroidAdRefresh this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdObject adObject, AndroidAdRefresh androidAdRefresh, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
                super(2, interfaceC3103c);
                this.$adObject = adObject;
                this.this$0 = androidAdRefresh;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, interfaceC3103c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // tf.p
            @Nullable
            public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objS;
                kf.a aVar = kf.a.f39711a;
                int i5 = this.label;
                if (i5 == 0) {
                    e.U(obj);
                    E e7 = (E) this.L$0;
                    L lH = H.h(e7, null, new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, null), 3);
                    L lH2 = H.h(e7, null, new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, null), 3);
                    AdObject adObject = this.$adObject;
                    this.L$0 = lH;
                    this.L$1 = lH2;
                    this.L$2 = adObject;
                    this.label = 1;
                    b bVar = new b(this);
                    C0502n c0502n = bVar.f7639g;
                    try {
                        l lVarB = lH.B();
                        AndroidAdRefresh$invoke$3$1$1$1 androidAdRefresh$invoke$3$1$1$1 = new AndroidAdRefresh$invoke$3$1$1$1(lH2, adObject, null);
                        z0 z0Var = (z0) lVarB.f10967a;
                        w0 w0Var = w0.f3786a;
                        x0 x0Var = x0.f3789a;
                        bVar.f(new f(bVar, z0Var, androidAdRefresh$invoke$3$1$1$1), false);
                        l lVarB2 = lH2.B();
                        bVar.f(new f(bVar, (z0) lVarB2.f10967a, new AndroidAdRefresh$invoke$3$1$1$2(lH, null)), false);
                    } catch (Throwable th) {
                        c0502n.resumeWith(e.z(th));
                    }
                    c0502n.getClass();
                    if (C0502n.f3752g.get(c0502n) instanceof F0) {
                        Kd.a aVarC = H.c(bVar.f7651a);
                        F f10 = F.f3663a;
                        H.D(aVarC, null, new Mf.a(bVar, null), 1);
                        objS = c0502n.s();
                    } else {
                        objS = c0502n.s();
                    }
                    kf.a aVar2 = kf.a.f39711a;
                    if (objS == aVar) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(E e7, AdObject adObject, AndroidAdRefresh androidAdRefresh, InterfaceC3103c<? super AnonymousClass3> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$refreshScope = e7;
            this.$adObject = adObject;
            this.this$0 = androidAdRefresh;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass3(this.$refreshScope, this.$adObject, this.this$0, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            H.D(this.$refreshScope, null, new AnonymousClass1(this.$adObject, this.this$0, null), 3);
            return C2515C.f34653a;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull String str, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass3) create(str, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh", f = "AndroidAdRefresh.kt", l = {75, 79, 95}, m = "performRefresh")
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$performRefresh$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
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
            return AndroidAdRefresh.this.performRefresh(null, this);
        }
    }

    public AndroidAdRefresh(@NotNull AdRepository adRepository, @NotNull CacheAssets cacheAssets, @NotNull Refresh refresh) {
        AbstractC3340k.e(adRepository, "adRepository");
        AbstractC3340k.e(cacheAssets, "cacheAssets");
        AbstractC3340k.e(refresh, "refresh");
        this.adRepository = adRepository;
        this.cacheAssets = cacheAssets;
        this.refresh = refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUpdateRefreshData(AdObjectState state) {
        return !NON_UPDATABLE_STATES.contains(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performRefresh(com.google.protobuf.ByteString r12, jf.InterfaceC3103c<? super ef.C2515C> r13) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidAdRefresh.performRefresh(com.google.protobuf.ByteString, jf.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.domain.AdRefresh
    @Nullable
    public Object invoke(@NotNull AdObject adObject, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Kd.a aVarC = H.c(adObject.getAdScope().getCoroutineContext().plus(new D("Ad_Refresh")));
        final InterfaceC0590b0 broadcastEventChannel = AdPlayer.INSTANCE.getBroadcastEventChannel();
        final String str = "AD_REFRESH";
        k0.u(new Z(new InterfaceC0602l() { // from class: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0603m {
                final /* synthetic */ InterfaceC0603m $this_unsafeFlow;
                final /* synthetic */ String receiver$inlined;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2", f = "AndroidAdRefresh.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1, reason: invalid class name */
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
                    this.receiver$inlined = str;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        kf.a r1 = kf.a.f39711a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        Fe.e.U(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        Fe.e.U(r6)
                        Hf.m r6 = r4.$this_unsafeFlow
                        java.lang.String r2 = r4.receiver$inlined
                        boolean r2 = r2.equals(r5)
                        if (r2 == 0) goto L45
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        ef.C r5 = ef.C2515C.f34653a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                }
            }

            @Override // Hf.InterfaceC0602l
            @Nullable
            public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c2) {
                Object objCollect = broadcastEventChannel.collect(new AnonymousClass2(interfaceC0603m, str), interfaceC3103c2);
                return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
            }
        }, new AnonymousClass3(aVarC, adObject, this, null), 0), aVarC);
        return C2515C.f34653a;
    }
}
