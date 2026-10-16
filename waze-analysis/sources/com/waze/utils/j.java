package com.waze.utils;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f44887a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f44888b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f44889c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f44890d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f44891e;

    j(k kVar, Bitmap bitmap, ImageView imageView, View view, boolean z) {
        this.f44887a = bitmap;
        this.f44888b = imageView;
        this.f44889c = view;
        this.f44890d = z;
        Objects.requireNonNull(kVar);
        this.f44891e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        Bitmap bitmap = this.f44887a;
        if (bitmap == null || (imageView = this.f44888b) == null) {
            return;
        }
        k kVar = this.f44891e;
        ImageView imageView2 = kVar.f44892a;
        if (imageView2 == null || kVar.f44895d.equals(imageView2.getTag())) {
            if (this.f44890d) {
                imageView.setImageDrawable(new com.waze.sharedui.views.i(bitmap, 0));
            } else {
                imageView.setImageBitmap(bitmap);
            }
            View view = this.f44889c;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
