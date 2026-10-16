package com.waze.ui.ae;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.bumptech.glide.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f41794a;

    c(MutableState mutableState) {
        this.f41794a = mutableState;
    }

    @Override // com.bumptech.glide.e.a.g
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        x.f(bitmap, "resource");
        this.f41794a.setValue(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null));
    }

    @Override // com.bumptech.glide.e.a.g
    public final void c() {
        this.f41794a.setValue(null);
    }
}
