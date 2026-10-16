package com.unity3d.ads.core.domain;

import Ef.E;
import Fe.e;
import Hf.x0;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf/E;", "Lef/n;", "Lef/C;", "<anonymous>", "(LEf/E;)Lef/n;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$refreshTask$1", f = "AndroidAdRefresh.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidAdRefresh$invoke$3$1$refreshTask$1 extends AbstractC3471j implements p {
    final /* synthetic */ AdObject $adObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$refreshTask$1(AndroidAdRefresh androidAdRefresh, AdObject adObject, InterfaceC3103c<? super AndroidAdRefresh$invoke$3$1$refreshTask$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = androidAdRefresh;
        this.$adObject = adObject;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        AndroidAdRefresh$invoke$3$1$refreshTask$1 androidAdRefresh$invoke$3$1$refreshTask$1 = new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, interfaceC3103c);
        androidAdRefresh$invoke$3$1$refreshTask$1.L$0 = obj;
        return androidAdRefresh$invoke$3$1$refreshTask$1;
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((AndroidAdRefresh$invoke$3$1$refreshTask$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objZ;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        try {
            if (i5 == 0) {
                e.U(obj);
                AndroidAdRefresh androidAdRefresh = this.this$0;
                ByteString opportunityId = this.$adObject.getOpportunityId();
                this.label = 1;
                if (androidAdRefresh.performRefresh(opportunityId, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        AndroidAdRefresh androidAdRefresh2 = this.this$0;
        AdObject adObject = this.$adObject;
        if (C2530n.a(objZ) != null && androidAdRefresh2.canUpdateRefreshData((AdObjectState) ((x0) adObject.getState()).getValue()) && (webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData()) != null) {
            webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_ERROR);
        }
        return new C2530n(objZ);
    }
}
