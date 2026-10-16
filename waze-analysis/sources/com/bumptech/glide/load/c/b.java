package com.bumptech.glide.load.c;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.c.a.ag;
import com.bumptech.glide.load.c.a.t;
import com.bumptech.glide.load.c.a.w;
import com.bumptech.glide.load.r;
import com.bumptech.glide.load.s;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final ag f3378a = ag.a();

    /* renamed from: b, reason: collision with root package name */
    private final int f3379b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3380c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.a f3381d;

    /* renamed from: e, reason: collision with root package name */
    private final t f3382e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3383f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.t f3384g;

    public b(int i2, int i3, s sVar) {
        this.f3379b = i2;
        this.f3380c = i3;
        this.f3381d = (com.bumptech.glide.load.a) sVar.b(w.f3364a);
        this.f3382e = (t) sVar.b(t.f3362g);
        r rVar = w.f3367d;
        boolean z = false;
        if (sVar.b(rVar) != null && ((Boolean) sVar.b(rVar)).booleanValue()) {
            z = true;
        }
        this.f3383f = z;
        this.f3384g = (com.bumptech.glide.load.t) sVar.b(w.f3365b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ag agVar = this.f3378a;
        int width = this.f3379b;
        int height = this.f3380c;
        if (agVar.b(width, height, this.f3383f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f3381d == com.bumptech.glide.load.a.f2936b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a(this));
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.f3382e.a(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fA);
        int iRound2 = Math.round(size.getHeight() * fA);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fA);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        com.bumptech.glide.load.t tVar = this.f3384g;
        if (tVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((tVar == com.bumptech.glide.load.t.f3515b && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
