package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BitmapDrawableKt {
    public static final BitmapDrawable toDrawable(Bitmap bitmap, Resources resources) {
        x.f(bitmap, "<this>");
        x.f(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
