package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class c extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f32927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(0);
        this.f32927a = context;
    }

    @Override // tf.a
    public final Object invoke() {
        return ServiceLocator.f32912d.a(this.f32927a).getService(VungleApiClient.class);
    }
}
