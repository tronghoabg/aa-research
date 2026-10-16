package com.unity3d.ads.core.domain;

import Ef.K;
import Fe.e;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObjectState;", "it", "Lef/C;", "<anonymous>", "(Lcom/unity3d/ads/core/data/model/AdObjectState;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$1", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidAdRefresh$invoke$3$1$1$1 extends AbstractC3471j implements p {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ K $refreshTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$1(K k, AdObject adObject, InterfaceC3103c<? super AndroidAdRefresh$invoke$3$1$1$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$refreshTask = k;
        this.$adObject = adObject;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new AndroidAdRefresh$invoke$3$1$1$1(this.$refreshTask, this.$adObject, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull AdObjectState adObjectState, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((AndroidAdRefresh$invoke$3$1$1$1) create(adObjectState, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kf.a aVar = kf.a.f39711a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.U(obj);
        this.$refreshTask.cancel(null);
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.$adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null) {
            webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_DURING_RELOAD);
        }
        return C2515C.f34653a;
    }
}
