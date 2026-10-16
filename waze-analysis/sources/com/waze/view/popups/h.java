package com.waze.view.popups;

import android.graphics.Bitmap;
import android.widget.ImageView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ImageView f45308a;

    h(j jVar, ImageView imageView) {
        this.f45308a = imageView;
        Objects.requireNonNull(jVar);
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        ImageView imageView = this.f45308a;
        imageView.setImageDrawable(new com.waze.sharedui.views.h(imageView.getContext(), bitmap, 4));
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
