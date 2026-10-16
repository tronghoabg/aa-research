package com.vungle.ads;

import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class BaseFullscreenAd$play$2$onAdClick$1 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseFullscreenAd f32795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd$play$2$onAdClick$1(BaseFullscreenAd baseFullscreenAd) {
        super(0);
        this.f32795a = baseFullscreenAd;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m312invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m312invoke() {
        BaseAdListener adListener = this.f32795a.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this.f32795a);
        }
    }
}
