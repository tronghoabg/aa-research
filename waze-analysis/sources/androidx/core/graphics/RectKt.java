package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RectKt {
    public static final Rect and(Rect rect, Rect rect2) {
        x.f(rect, "<this>");
        x.f(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(Rect rect) {
        x.f(rect, "<this>");
        return rect.left;
    }

    public static final int component2(Rect rect) {
        x.f(rect, "<this>");
        return rect.top;
    }

    public static final int component3(Rect rect) {
        x.f(rect, "<this>");
        return rect.right;
    }

    public static final int component4(Rect rect) {
        x.f(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean contains(Rect rect, Point point) {
        x.f(rect, "<this>");
        x.f(point, TtmlNode.TAG_P);
        return rect.contains(point.x, point.y);
    }

    public static final Region minus(RectF rectF, RectF rectF2) {
        x.f(rectF, "<this>");
        x.f(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Rect or(Rect rect, Rect rect2) {
        x.f(rect, "<this>");
        x.f(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect plus(Rect rect, Point point) {
        x.f(rect, "<this>");
        x.f(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final RectF times(RectF rectF, int i2) {
        x.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = i2;
        rectF2.top *= f2;
        rectF2.left *= f2;
        rectF2.right *= f2;
        rectF2.bottom *= f2;
        return rectF2;
    }

    public static final Rect toRect(RectF rectF) {
        x.f(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF toRectF(Rect rect) {
        x.f(rect, "<this>");
        return new RectF(rect);
    }

    public static final Region toRegion(RectF rectF) {
        x.f(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix matrix) {
        x.f(rectF, "<this>");
        x.f(matrix, CmcdData.OBJECT_TYPE_MANIFEST);
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final Region xor(RectF rectF, RectF rectF2) {
        x.f(rectF, "<this>");
        x.f(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(RectF rectF) {
        x.f(rectF, "<this>");
        return rectF.left;
    }

    public static final float component2(RectF rectF) {
        x.f(rectF, "<this>");
        return rectF.top;
    }

    public static final float component3(RectF rectF) {
        x.f(rectF, "<this>");
        return rectF.right;
    }

    public static final float component4(RectF rectF) {
        x.f(rectF, "<this>");
        return rectF.bottom;
    }

    public static final RectF and(RectF rectF, RectF rectF2) {
        x.f(rectF, "<this>");
        x.f(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final boolean contains(RectF rectF, PointF pointF) {
        x.f(rectF, "<this>");
        x.f(pointF, TtmlNode.TAG_P);
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final RectF or(RectF rectF, RectF rectF2) {
        x.f(rectF, "<this>");
        x.f(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Region toRegion(Rect rect) {
        x.f(rect, "<this>");
        return new Region(rect);
    }

    public static final Rect plus(Rect rect, int i2) {
        x.f(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final Rect plus(Rect rect, Rect rect2) {
        x.f(rect, "<this>");
        x.f(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final RectF plus(RectF rectF, float f2) {
        x.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final RectF plus(RectF rectF, PointF pointF) {
        x.f(rectF, "<this>");
        x.f(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final RectF plus(RectF rectF, RectF rectF2) {
        x.f(rectF, "<this>");
        x.f(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final RectF times(RectF rectF, float f2) {
        x.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f2;
        rectF2.left *= f2;
        rectF2.right *= f2;
        rectF2.bottom *= f2;
        return rectF2;
    }

    public static final Rect minus(Rect rect, Point point) {
        x.f(rect, "<this>");
        x.f(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final Rect times(Rect rect, int i2) {
        x.f(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i2;
        rect2.left *= i2;
        rect2.right *= i2;
        rect2.bottom *= i2;
        return rect2;
    }

    public static final Region xor(Rect rect, Rect rect2) {
        x.f(rect, "<this>");
        x.f(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Region minus(Rect rect, Rect rect2) {
        x.f(rect, "<this>");
        x.f(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final RectF minus(RectF rectF, float f2) {
        x.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f3 = -f2;
        rectF2.offset(f3, f3);
        return rectF2;
    }

    public static final RectF minus(RectF rectF, PointF pointF) {
        x.f(rectF, "<this>");
        x.f(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    public static final Rect minus(Rect rect, int i2) {
        x.f(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i3 = -i2;
        rect2.offset(i3, i3);
        return rect2;
    }
}
