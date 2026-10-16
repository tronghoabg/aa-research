package androidx.camera.camera2.impl;

import android.graphics.Point;
import android.util.Size;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SizesKt {
    public static final int area(Size size) {
        x.f(size, "<this>");
        return size.getWidth() * size.getHeight();
    }

    public static final Size asLandscape(Size size) {
        x.f(size, "<this>");
        return size.getWidth() >= size.getHeight() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static final Size asPortrait(Size size) {
        x.f(size, "<this>");
        return size.getWidth() <= size.getHeight() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static final Size maxByArea(Size size, Size size2) {
        x.f(size, TtmlNode.LEFT);
        x.f(size2, TtmlNode.RIGHT);
        return area(size) > area(size2) ? size : size2;
    }

    public static final Size minByArea(Size size, Size size2) {
        x.f(size, TtmlNode.LEFT);
        x.f(size2, TtmlNode.RIGHT);
        return area(size) < area(size2) ? size : size2;
    }

    public static final Size toSize(Point point) {
        x.f(point, "<this>");
        return new Size(point.x, point.y);
    }

    public static final int area(Point point) {
        x.f(point, "<this>");
        return point.x * point.y;
    }
}
