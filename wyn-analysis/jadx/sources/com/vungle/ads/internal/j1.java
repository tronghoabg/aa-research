package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class j1 extends AbstractC3343n implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f33027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ImageView imageView) {
        super(1);
        this.f33027a = imageView;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Bitmap it = (Bitmap) obj;
        AbstractC3340k.e(it, "it");
        ImageView imageView = this.f33027a;
        if (imageView != null) {
            Handler handler = com.vungle.ads.internal.util.y.f33878a;
            com.vungle.ads.internal.util.y.a(new i1(imageView, it));
        }
        return C2515C.f34653a;
    }
}
