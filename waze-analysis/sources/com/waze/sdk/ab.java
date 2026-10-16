package com.waze.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f35203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaBrowserCompat$MediaItem f35204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f35205c;

    ab(ac acVar, String str, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        this.f35203a = str;
        this.f35204b = mediaBrowserCompat$MediaItem;
        Objects.requireNonNull(acVar);
        this.f35205c = acVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        ac acVar = this.f35205c;
        if (TextUtils.equals(this.f35203a, acVar.f35210e.getMediaId())) {
            acVar.f35209d.setImageDrawable(new BitmapDrawable(acVar.f35206a.f35214b.getResources(), bitmap));
            acVar.f35211f = bitmap;
            acVar.f35212g = this.f35204b.getDescription().getIconUri().toString();
        }
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
