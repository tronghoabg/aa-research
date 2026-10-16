package com.waze.sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f35322a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f35323b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Resources f35324c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Drawable f35325d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bi f35326e;

    bg(bi biVar, String str, boolean z, Resources resources, Drawable drawable) {
        this.f35322a = str;
        this.f35323b = z;
        this.f35324c = resources;
        this.f35325d = drawable;
        Objects.requireNonNull(biVar);
        this.f35326e = biVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        bi.k(this.f35326e, this.f35322a, this.f35323b, new BitmapDrawable(this.f35324c, bitmap));
    }

    @Override // com.waze.utils.h
    public final void b() {
        bi.k(this.f35326e, this.f35322a, this.f35323b, this.f35325d);
    }
}
