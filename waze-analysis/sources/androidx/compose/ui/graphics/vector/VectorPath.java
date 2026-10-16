package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, o oVar) {
        int defaultStrokeLineCap = (i5 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i3;
        int defaultStrokeLineJoin = (i5 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i4;
        int i6 = i5 & 64;
        int i7 = i5 & 32;
        int i8 = i5 & 16;
        int i9 = i5 & 8;
        int i10 = i5 & 1;
        float f9 = (i5 & 128) != 0 ? 0.0f : f4;
        float f10 = i6 != 0 ? 1.0f : f3;
        Brush brush3 = i7 != 0 ? null : brush2;
        float f11 = i8 != 0 ? 1.0f : f2;
        Brush brush4 = i9 == 0 ? brush : null;
        this(1 == i10 ? "" : str, list, i2, brush4, f11, brush3, f10, f9, defaultStrokeLineCap, defaultStrokeLineJoin, (i5 & 1024) != 0 ? 4.0f : f5, (i5 & 2048) != 0 ? 0.0f : f6, (i5 & 4096) != 0 ? 1.0f : f7, (i5 & 8192) != 0 ? 0.0f : f8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return x.n(this.name, vectorPath.name) && x.n(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && x.n(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m8628equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m8638equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m8550equalsimpl0(this.pathFillType, vectorPath.pathFillType) && x.n(this.pathData, vectorPath.pathData);
        }
        return false;
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m9027getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m9028getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m9029getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public int hashCode() {
        int iHashCode = (this.name.hashCode() * 31) + this.pathData.hashCode();
        Brush brush = this.fill;
        int iHashCode2 = ((((iHashCode * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (brush2 != null ? brush2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.strokeAlpha)) * 31) + Float.floatToIntBits(this.strokeLineWidth)) * 31) + this.strokeLineCap) * 31) + this.strokeLineJoin) * 31) + Float.floatToIntBits(this.strokeLineMiter)) * 31) + Float.floatToIntBits(this.trimPathStart)) * 31) + Float.floatToIntBits(this.trimPathEnd)) * 31) + Float.floatToIntBits(this.trimPathOffset)) * 31) + this.pathFillType;
    }

    public /* synthetic */ VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, o oVar) {
        this(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i2;
        this.fill = brush;
        this.fillAlpha = f2;
        this.stroke = brush2;
        this.strokeAlpha = f3;
        this.strokeLineWidth = f4;
        this.strokeLineCap = i3;
        this.strokeLineJoin = i4;
        this.strokeLineMiter = f5;
        this.trimPathStart = f6;
        this.trimPathEnd = f7;
        this.trimPathOffset = f8;
    }
}
