package com.unity3d.services;

import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.services.core.di.IServiceComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.H;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;", "com/unity3d/services/core/di/IServiceComponentKt$inject$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnityAdsSDK$fetchToken$$inlined$inject$default$1 extends AbstractC3343n implements a {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$$inlined$inject$default$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
    @Override // tf.a
    @NotNull
    public final TokenNumberProvider invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, H.f39741a.getOrCreateKotlinClass(TokenNumberProvider.class));
    }
}
