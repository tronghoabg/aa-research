package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class i1 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f33022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f33023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.f33022a = imageView;
        this.f33023b = bitmap;
    }

    @Override // tf.a
    public final Object invoke() {
        this.f33022a.setImageBitmap(this.f33023b);
        return C2515C.f34653a;
    }
}
