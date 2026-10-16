package com.waze.ui.r.a.a;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import com.waze.reports.cx;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43293a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f43294b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.ac.h f43295c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cx f43296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(q qVar, com.waze.ui.ac.h hVar, cx cxVar, h.c.e eVar) {
        super(2, eVar);
        this.f43294b = qVar;
        this.f43295c = hVar;
        this.f43296d = cxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new n(this.f43294b, this.f43295c, this.f43296d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43293a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43293a = 1;
            obj = this.f43294b.a(this.f43295c.b(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        ImageBitmap imageBitmapAsImageBitmap = bitmap != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmap) : null;
        cx cxVar = this.f43296d;
        if (imageBitmapAsImageBitmap == null) {
            cxVar.b(e.f43270a);
        } else {
            cxVar.b(new d(new BitmapPainter(imageBitmapAsImageBitmap, 0L, 0L, 6, null)));
        }
        return ab.f48028a;
    }
}
