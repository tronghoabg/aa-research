package com.waze.map.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.waze.ad.a.j;
import com.waze.jni.protos.NativeBitmap;
import com.waze.map.ap;
import com.waze.map.aq;
import com.waze.map.ax;
import com.waze.map.ay;
import com.waze.map.az;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final aq f28729a;

    public c(aq aqVar) {
        x.f(aqVar, "config");
        this.f28729a = aqVar;
    }

    @Override // com.waze.map.ap
    public final NativeBitmap a(Context context, com.waze.gas.a aVar) {
        Bitmap bitmap$default;
        x.f(context, "context");
        x.f(aVar, "renderable");
        NativeBitmap defaultInstance = NativeBitmap.getDefaultInstance();
        x.e(defaultInstance, "getDefaultInstance(...)");
        if (aVar instanceof ax) {
            return com.waze.destination_cell.b.e.g((Bitmap) ((ax) aVar).f().invoke(context));
        }
        if (aVar instanceof ay) {
            ay ayVar = (ay) aVar;
            Size sizeF = ayVar.f();
            Bitmap bitmapA = j.a((View) ayVar.g().invoke(context), sizeF.getWidth(), sizeF.getHeight(), Integer.MIN_VALUE);
            NativeBitmap nativeBitmapG = com.waze.destination_cell.b.e.g(bitmapA);
            if (this.f28729a.a()) {
                bitmapA.recycle();
            }
            return nativeBitmapG;
        }
        if (!(aVar instanceof az)) {
            throw new i();
        }
        Drawable drawable = ContextCompat.getDrawable(context, ((az) aVar).f());
        if (drawable == null || (bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)) == null) {
            return defaultInstance;
        }
        aq aqVar = this.f28729a;
        NativeBitmap nativeBitmapG2 = com.waze.destination_cell.b.e.g(bitmap$default);
        if (aqVar.a()) {
            bitmap$default.recycle();
        }
        return nativeBitmapG2;
    }
}
