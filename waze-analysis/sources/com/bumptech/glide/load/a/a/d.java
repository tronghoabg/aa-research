package com.bumptech.glide.load.a.a;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class d implements c {
    @Override // com.bumptech.glide.load.a.a.c
    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final Bitmap b(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final void c() {
    }

    @Override // com.bumptech.glide.load.a.a.c
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final void e(int i2) {
    }
}
