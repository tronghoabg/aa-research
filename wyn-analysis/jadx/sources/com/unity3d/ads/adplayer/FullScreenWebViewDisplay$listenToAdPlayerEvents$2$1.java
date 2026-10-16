package com.unity3d.ads.adplayer;

import Ef.E;
import Ef.H;
import Ef.InterfaceC0498l;
import Fe.e;
import Hf.InterfaceC0590b0;
import Hf.InterfaceC0603m;
import androidx.lifecycle.V;
import com.unity3d.ads.adplayer.DisplayMessage;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "Lef/C;", "<anonymous>", "(LHf/m;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends AbstractC3471j implements p {
    final /* synthetic */ InterfaceC0498l $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {104, 120}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ InterfaceC0498l $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", l = {108}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01961 extends AbstractC3471j implements p {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01961(FullScreenWebViewDisplay fullScreenWebViewDisplay, InterfaceC3103c<? super C01961> interfaceC3103c) {
                super(2, interfaceC3103c);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                return new C01961(this.this$0, interfaceC3103c);
            }

            @Override // tf.p
            @Nullable
            public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((C01961) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }

            @Override // lf.AbstractC3462a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f39711a;
                int i5 = this.label;
                if (i5 == 0) {
                    e.U(obj);
                    InterfaceC0590b0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.this$0.opportunityId, "Error loading webView");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == aVar) {
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
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, InterfaceC0498l interfaceC0498l, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = interfaceC0498l;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, interfaceC3103c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        
            if (r7 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                kf.a r0 = kf.a.f39711a
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r0 = r6.L$0
                Ef.E r0 = (Ef.E) r0
                Fe.e.U(r7)
                goto Lab
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.L$0
                Ef.E r1 = (Ef.E) r1
                Fe.e.U(r7)
                goto L5d
            L26:
                Fe.e.U(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                Ef.E r1 = (Ef.E) r1
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getAdObject(r7)
                if (r7 == 0) goto L3b
                com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData r7 = r7.getWebViewLessLoadingRequiredData()
                goto L3c
            L3b:
                r7 = r2
            L3c:
                if (r7 == 0) goto L8e
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getAdObject(r7)
                if (r7 == 0) goto L60
                com.unity3d.ads.adplayer.AdPlayer r7 = r7.getAdPlayer()
                if (r7 == 0) goto L60
                Hf.l r7 = r7.getOnLoadEvent()
                if (r7 == 0) goto L60
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r7 = Hf.k0.w(r7, r6)
                if (r7 != r0) goto L5d
                goto La9
            L5d:
                com.unity3d.ads.adplayer.model.LoadEvent r7 = (com.unity3d.ads.adplayer.model.LoadEvent) r7
                goto L61
            L60:
                r7 = r2
            L61:
                boolean r7 = r7 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
                if (r7 == 0) goto L8e
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                r4 = 0
                r7.setResult(r4)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.services.core.domain.ISDKDispatchers r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getDispatchers(r7)
                Ef.A r7 = r7.getDefault()
                Kd.a r7 = Ef.H.c(r7)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1 r4 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r5 = r6.this$0
                r4.<init>(r5, r2)
                r5 = 3
                Ef.H.D(r7, r2, r4, r5)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                r7.finish()
                Ef.l r7 = r6.$continuation
                r7.a(r2)
            L8e:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE
                Hf.b0 r7 = r7.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceRequest
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r6.this$0
                java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
                r2.<init>(r4)
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r7.emit(r2, r6)
                if (r7 != r0) goto Laa
            La9:
                return r0
            Laa:
                r0 = r1
            Lab:
                Ef.H.o(r0)
                Ef.l r7 = r6.$continuation
                ef.C r0 = ef.C2515C.f34653a
                r7.resumeWith(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, InterfaceC0498l interfaceC0498l, InterfaceC3103c<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = interfaceC0498l;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(interfaceC0603m, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.U(obj);
        H.D(V.f(this.this$0), this.this$0.getDispatchers().getDefault(), new AnonymousClass1(this.this$0, this.$continuation, null), 2);
        return C2515C.f34653a;
    }
}
