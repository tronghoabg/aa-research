package com.unity3d.ads.adplayer;

import Fe.c;
import Fe.e;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import ef.C2529m;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/AdObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullScreenWebViewDisplay$adObject$2 extends AbstractC3343n implements a {
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$adObject$2(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        super(0);
        this.this$0 = fullScreenWebViewDisplay;
    }

    private static final AdRepository invoke$lambda$0(InterfaceC2525i interfaceC2525i) {
        return (AdRepository) interfaceC2525i.getValue();
    }

    @Override // tf.a
    @Nullable
    public final AdObject invoke() {
        Object objZ;
        InterfaceC2525i interfaceC2525iY = c.y(EnumC2526j.f34669c, new FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1(this.this$0, ""));
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            AdRepository adRepositoryInvoke$lambda$0 = invoke$lambda$0(interfaceC2525iY);
            UUID uuidFromString = UUID.fromString(fullScreenWebViewDisplay.opportunityId);
            AbstractC3340k.d(uuidFromString, "fromString(opportunityId)");
            objZ = adRepositoryInvoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        return (AdObject) objZ;
    }
}
