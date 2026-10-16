package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SizeKt {
    public static final int component1(Size size) {
        x.f(size, "<this>");
        return size.getWidth();
    }

    public static final int component2(Size size) {
        x.f(size, "<this>");
        return size.getHeight();
    }

    public static final float component1(SizeF sizeF) {
        x.f(sizeF, "<this>");
        return sizeF.getWidth();
    }

    public static final float component2(SizeF sizeF) {
        x.f(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        x.f(sizeFCompat, "<this>");
        return sizeFCompat.getWidth();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        x.f(sizeFCompat, "<this>");
        return sizeFCompat.getHeight();
    }
}
