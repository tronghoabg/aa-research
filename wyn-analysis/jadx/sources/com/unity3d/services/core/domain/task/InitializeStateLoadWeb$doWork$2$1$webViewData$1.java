package com.unity3d.services.core.domain.task;

import Ef.E;
import com.unity3d.services.core.network.model.HttpRequest;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "", "<anonymous>", "(LEf/E;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {71, 71}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends AbstractC3471j implements p {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, InterfaceC3103c<? super InitializeStateLoadWeb$doWork$2$1$webViewData$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super String> interfaceC3103c) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            Fe.e.U(r10)
            goto L40
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            Fe.e.U(r10)
            goto L2e
        L1c:
            Fe.e.U(r10)
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r10 = r9.this$0
            com.unity3d.ads.core.domain.HttpClientProvider r10 = com.unity3d.services.core.domain.task.InitializeStateLoadWeb.access$getHttpClientProvider$p(r10)
            r9.label = r3
            java.lang.Object r10 = r10.invoke(r9)
            if (r10 != r0) goto L2e
            goto L3f
        L2e:
            r3 = r10
            com.unity3d.services.core.network.core.HttpClient r3 = (com.unity3d.services.core.network.core.HttpClient) r3
            com.unity3d.services.core.network.model.HttpRequest r4 = r9.$request
            r9.label = r2
            r5 = 0
            r7 = 2
            r8 = 0
            r6 = r9
            java.lang.Object r10 = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L40
        L3f:
            return r0
        L40:
            com.unity3d.services.core.network.model.HttpResponse r10 = (com.unity3d.services.core.network.model.HttpResponse) r10
            java.lang.Object r10 = r10.getBody()
            java.lang.String r10 = r10.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
