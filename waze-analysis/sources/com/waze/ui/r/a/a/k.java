package com.waze.ui.r.a.a;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import com.waze.reports.cx;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends com.bumptech.glide.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cx f43287a;

    k(cx cxVar) {
        this.f43287a = cxVar;
    }

    @Override // com.bumptech.glide.e.a.g
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        x.f(bitmap, "resource");
        this.f43287a.b(new d(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null)));
    }

    @Override // com.bumptech.glide.e.a.g
    public final void c() {
        this.f43287a.b(f.f43271a);
    }

    @Override // com.bumptech.glide.e.a.c, com.bumptech.glide.e.a.g
    public final void l() {
        this.f43287a.b(e.f43270a);
    }

    @Override // com.bumptech.glide.e.a.c, com.bumptech.glide.e.a.g
    public final void m() {
        this.f43287a.b(f.f43271a);
    }
}
