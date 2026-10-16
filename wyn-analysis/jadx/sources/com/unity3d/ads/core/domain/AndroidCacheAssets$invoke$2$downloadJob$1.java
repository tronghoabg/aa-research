package com.unity3d.ads.core.domain;

import Ef.E;
import Fe.e;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.CacheFile;
import ef.C2515C;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$2$downloadJob$1", f = "AndroidCacheAssets.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidCacheAssets$invoke$2$downloadJob$1 extends AbstractC3471j implements p {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset $asset;
    int label;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheAssets$invoke$2$downloadJob$1(AndroidCacheAssets androidCacheAssets, CampaignMetadataOuterClass.CampaignAsset campaignAsset, AdObject adObject, InterfaceC3103c<? super AndroidCacheAssets$invoke$2$downloadJob$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = androidCacheAssets;
        this.$asset = campaignAsset;
        this.$adObject = adObject;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new AndroidCacheAssets$invoke$2$downloadJob$1(this.this$0, this.$asset, this.$adObject, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((AndroidCacheAssets$invoke$2$downloadJob$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AndroidCacheAssets$invoke$2$downloadJob$1 androidCacheAssets$invoke$2$downloadJob$1;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        if (i5 == 0) {
            e.U(obj);
            CacheFile cacheFile = this.this$0.cacheFile;
            String url = this.$asset.getUrl();
            AbstractC3340k.d(url, "asset.url");
            AdObject adObject = this.$adObject;
            int priority = this.$asset.getPriority();
            this.label = 1;
            androidCacheAssets$invoke$2$downloadJob$1 = this;
            obj = CacheFile.DefaultImpls.invoke$default(cacheFile, url, adObject, null, priority, 0, null, androidCacheAssets$invoke$2$downloadJob$1, 48, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            androidCacheAssets$invoke$2$downloadJob$1 = this;
        }
        if (!(((CacheResult) obj) instanceof CacheResult.Failure)) {
            return C2515C.f34653a;
        }
        throw new RuntimeException("Failed To Load Asset: " + androidCacheAssets$invoke$2$downloadJob$1.$asset.getUrl());
    }
}
