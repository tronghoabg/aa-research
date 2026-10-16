package com.vungle.ads;

import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class NativeAd$adPlayCallback$1$onAdStart$1 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAd f32819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$adPlayCallback$1$onAdStart$1(NativeAd nativeAd) {
        super(0);
        this.f32819a = nativeAd;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m323invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m323invoke() {
        BaseAdListener adListener = this.f32819a.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(this.f32819a);
        }
    }
}
