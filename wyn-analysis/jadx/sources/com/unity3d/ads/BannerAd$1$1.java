package com.unity3d.ads;

import Ef.E;
import Fe.e;
import Hf.F;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3464c;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.BannerAd$1$1", f = "BannerAd.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BannerAd$1$1 extends AbstractC3471j implements p {
    int label;
    final /* synthetic */ BannerAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$1$1(BannerAd bannerAd, InterfaceC3103c<? super BannerAd$1$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = bannerAd;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new BannerAd$1$1(this.this$0, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((BannerAd$1$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        if (i5 == 0) {
            e.U(obj);
            final InterfaceC0592c0 state = this.this$0.adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            F f10 = new F(new InterfaceC0602l() { // from class: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1

                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "emit", "(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC0603m {
                    final /* synthetic */ InterfaceC0603m $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @InterfaceC3466e(c = "com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2", f = "BannerAd.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    /* renamed from: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(InterfaceC0603m interfaceC0603m, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = interfaceC0603m;
                        this.receiver$inlined = adObjectState;
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
                            boolean r0 = r6 instanceof com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1
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
                            com.unity3d.ads.core.data.model.AdObjectState r2 = r4.receiver$inlined
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
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, jf.c):java.lang.Object");
                    }
                }

                @Override // Hf.InterfaceC0602l
                @Nullable
                public Object collect(@NotNull InterfaceC0603m interfaceC0603m, @NotNull InterfaceC3103c interfaceC3103c) {
                    Object objCollect = state.collect(new AnonymousClass2(interfaceC0603m, adObjectState), interfaceC3103c);
                    return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
                }
            }, 0);
            final BannerAd bannerAd = this.this$0;
            InterfaceC0603m interfaceC0603m = new InterfaceC0603m() { // from class: com.unity3d.ads.BannerAd$1$1.2

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: com.unity3d.ads.BannerAd$1$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC3343n implements tf.a {
                    final /* synthetic */ BannerAd this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(BannerAd bannerAd) {
                        super(0);
                        this.this$0 = bannerAd;
                    }

                    @Override // tf.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m239invoke();
                        return C2515C.f34653a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m239invoke() {
                        AdExpiredListener<BannerAd> onAdExpired = this.this$0.getOnAdExpired();
                        if (onAdExpired != null) {
                            onAdExpired.onAdExpired(this.this$0);
                        }
                    }
                }

                @Override // Hf.InterfaceC0603m
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC3103c interfaceC3103c) {
                    return emit((AdObjectState) obj2, (InterfaceC3103c<? super C2515C>) interfaceC3103c);
                }

                @Nullable
                public final Object emit(@NotNull AdObjectState adObjectState2, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
                    bannerAd.safeCallbackInvoke.invoke(new AnonymousClass1(bannerAd));
                    return C2515C.f34653a;
                }
            };
            this.label = 1;
            if (f10.collect(interfaceC0603m, this) == aVar) {
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
