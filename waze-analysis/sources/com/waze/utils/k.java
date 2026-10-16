package com.waze.utils;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ImageView f44892a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f44893b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f44894c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44895d;

    k(n nVar, ImageView imageView, View view, boolean z, String str) {
        this.f44892a = imageView;
        this.f44893b = view;
        this.f44894c = z;
        this.f44895d = str;
        Objects.requireNonNull(nVar);
    }

    @Override // com.waze.utils.m
    public final void a(Bitmap bitmap) {
        new Handler(Looper.getMainLooper()).post(new j(this, bitmap, this.f44892a, this.f44893b, this.f44894c));
    }
}
