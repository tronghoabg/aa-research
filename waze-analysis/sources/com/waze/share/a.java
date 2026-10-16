package com.waze.share;

import android.graphics.Bitmap;
import android.widget.ImageView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ImageView f37687a;

    a(f fVar, ImageView imageView) {
        this.f37687a = imageView;
        Objects.requireNonNull(fVar);
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        this.f37687a.setImageDrawable(new com.waze.sharedui.views.i(bitmap, 0));
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
