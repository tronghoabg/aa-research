package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.waze.sound.fl$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3345a = new com.bumptech.glide.load.a.a.d();

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return c(fl$$ExternalSyntheticApiModelOutline0.m(obj), i2, i3, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        fl$$ExternalSyntheticApiModelOutline0.m(obj);
        return true;
    }

    public final com.bumptech.glide.load.a.aw c(ImageDecoder.Source source, int i2, int i3, com.bumptech.glide.load.s sVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new com.bumptech.glide.load.c.b(i2, i3, sVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i2 + "x" + i3 + "]");
        }
        return new ak(bitmapDecodeBitmap, this.f3345a, 1);
    }
}
