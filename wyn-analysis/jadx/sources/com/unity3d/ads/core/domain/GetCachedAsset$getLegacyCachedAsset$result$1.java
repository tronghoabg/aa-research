package com.unity3d.ads.core.domain;

import Ef.E;
import Fe.e;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.GetCachedAsset$getLegacyCachedAsset$result$1", f = "GetCachedAsset.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetCachedAsset$getLegacyCachedAsset$result$1 extends AbstractC3471j implements p {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getLegacyCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, InterfaceC3103c<? super GetCachedAsset$getLegacyCachedAsset$result$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new GetCachedAsset$getLegacyCachedAsset$result$1(this.this$0, this.$fileName, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super CacheResult> interfaceC3103c) {
        return ((GetCachedAsset$getLegacyCachedAsset$result$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
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
        CacheRepository cacheRepository = this.this$0.cacheRepository;
        String str = this.$fileName;
        this.label = 1;
        Object objRetrieveFile = cacheRepository.retrieveFile(str, this);
        return objRetrieveFile == aVar ? aVar : objRetrieveFile;
    }
}
