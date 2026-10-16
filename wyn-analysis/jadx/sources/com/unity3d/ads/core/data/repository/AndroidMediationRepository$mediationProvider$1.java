package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidMediationRepository$mediationProvider$1 extends AbstractC3343n implements a {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    @Override // tf.a
    @NotNull
    public final ClientInfoOuterClass.MediationProvider invoke() {
        return this.this$0.mediationProviderParser.invoke(this.this$0.getName());
    }
}
