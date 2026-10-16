package com.unity3d.services;

import Ef.E;
import Fe.e;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.InterfaceC2525i;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "", "<anonymous>", "(LEf/E;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends AbstractC3471j implements p {
    final /* synthetic */ InterfaceC2525i $getHeaderBiddingToken$delegate;
    final /* synthetic */ InterfaceC2525i $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(InterfaceC2525i interfaceC2525i, InterfaceC2525i interfaceC2525i2, InterfaceC3103c<? super UnityAdsSDK$fetchToken$token$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$getHeaderBiddingToken$delegate = interfaceC2525i;
        this.$tokenNumberProvider$delegate = interfaceC2525i2;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super String> interfaceC3103c) {
        return ((UnityAdsSDK$fetchToken$token$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            return obj;
        }
        e.U(obj);
        GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$17 = UnityAdsSDK.fetchToken$lambda$17(this.$getHeaderBiddingToken$delegate);
        int iInvoke = UnityAdsSDK.fetchToken$lambda$16(this.$tokenNumberProvider$delegate).invoke();
        this.label = 1;
        Object objInvoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$17, iInvoke, null, this, 2, null);
        return objInvoke$default == aVar ? aVar : objInvoke$default;
    }
}
