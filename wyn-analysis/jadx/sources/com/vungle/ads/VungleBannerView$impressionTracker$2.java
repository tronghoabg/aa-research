package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vungle/ads/internal/f1;", "invoke", "()Lcom/vungle/ads/internal/f1;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class VungleBannerView$impressionTracker$2 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f32850a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView$impressionTracker$2(Context context) {
        super(0);
        this.f32850a = context;
    }

    @Override // tf.a
    @NotNull
    public final f1 invoke() {
        return new f1(this.f32850a);
    }
}
