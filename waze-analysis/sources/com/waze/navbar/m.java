package com.waze.navbar;

import android.graphics.Bitmap;
import android.widget.ImageView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ImageView f30899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f30900b;

    m(p pVar, ImageView imageView) {
        this.f30899a = imageView;
        Objects.requireNonNull(pVar);
        this.f30900b = pVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        this.f30899a.setImageBitmap(bitmap);
        this.f30900b.n = bitmap;
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
