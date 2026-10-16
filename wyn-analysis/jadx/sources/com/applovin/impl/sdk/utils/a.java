package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f23265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f23266c;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.f23264a = 1;
        this.f23265b = uri;
        this.f23266c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23264a) {
            case 0:
                ImageViewUtils.b(this.f23266c, this.f23265b);
                break;
            case 1:
                ImageViewUtils.a(this.f23265b, this.f23266c);
                break;
            default:
                ImageViewUtils.setAndDownscaleBitmap(this.f23266c, this.f23265b);
                break;
        }
    }

    public /* synthetic */ a(ImageView imageView, Uri uri, int i5) {
        this.f23264a = i5;
        this.f23266c = imageView;
        this.f23265b = uri;
    }
}
