package com.waze.bl.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.waze.R;
import com.waze.bl.b.c.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d {
    public d() {
    }

    public static /* synthetic */ a c(Context context) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        a aVar = (a) c.f17046a.get(context);
        if (aVar != null && aVar.d() && aVar.a() == i2) {
            return aVar;
        }
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.closure_arrow);
        Bitmap bitmap$default = drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null;
        Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.closure_pill);
        Bitmap bitmap$default2 = drawable2 != null ? DrawableKt.toBitmap$default(drawable2, 0, 0, null, 7, null) : null;
        if (bitmap$default == null || bitmap$default2 == null) {
            return null;
        }
        a aVar2 = new a(bitmap$default, bitmap$default2, i2);
        c.f17046a.put(context, aVar2);
        return aVar2;
    }

    public static r d(com.waze.bl.c.b.j jVar) {
        x.f(jVar, "<this>");
        if (jVar instanceof com.waze.bl.c.b.f) {
            com.waze.bl.c.b.f fVar = (com.waze.bl.c.b.f) jVar;
            return !fVar.e() ? com.waze.bl.c.c.e.f17027a : fVar.a().isEmpty() ? com.waze.bl.c.c.e.f17027a : new com.waze.bl.c.c.f(fVar.a());
        }
        if ((jVar instanceof com.waze.bl.c.b.g) || (jVar instanceof com.waze.bl.c.b.h) || (jVar instanceof com.waze.bl.c.b.i)) {
            return com.waze.bl.c.c.e.f17027a;
        }
        throw new h.i();
    }

    public /* synthetic */ d(byte[] bArr, byte[] bArr2) {
    }
}
