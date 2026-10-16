package androidx.compose.material3.carousel;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MaskShape implements Shape {
    private Shape baseShape;
    private MultiAspectCarouselItemDrawInfo drawInfo;
    private final Path path = AndroidPath_androidKt.Path();

    public MaskShape(Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo) {
        this.baseShape = shape;
        this.drawInfo = multiAspectCarouselItemDrawInfo;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        Path path = this.path;
        path.reset();
        Rect rectM8070toRectuvyYCjk = SizeKt.m8070toRectuvyYCjk(j2);
        if (this.drawInfo.getSize() != 0.0f) {
            rectM8070toRectuvyYCjk = this.drawInfo.isHorizontal() ? new Rect(this.drawInfo.getMaskStart(), rectM8070toRectuvyYCjk.getTop(), this.drawInfo.getMaskEnd(), rectM8070toRectuvyYCjk.getBottom()) : new Rect(rectM8070toRectuvyYCjk.getLeft(), this.drawInfo.getMaskStart(), rectM8070toRectuvyYCjk.getRight(), this.drawInfo.getMaskEnd());
        }
        OutlineKt.addOutline(path, this.baseShape.mo2037createOutlinePq9zytI(rectM8070toRectuvyYCjk.m8013getSizeNHjbRc(), layoutDirection, density));
        float left = rectM8070toRectuvyYCjk.getLeft();
        path.mo8120translatek4lQ0M((Float.floatToRawIntBits(rectM8070toRectuvyYCjk.getTop()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(left) << 32));
        path.close();
        return this.path.isEmpty() ? new Outline.Rectangle(SizeKt.m8070toRectuvyYCjk(j2)) : new Outline.Generic(this.path);
    }

    public final Shape getBaseShape() {
        return this.baseShape;
    }

    public final MultiAspectCarouselItemDrawInfo getDrawInfo() {
        return this.drawInfo;
    }

    public final void setBaseShape(Shape shape) {
        this.baseShape = shape;
    }

    public final void setDrawInfo(MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo) {
        this.drawInfo = multiAspectCarouselItemDrawInfo;
    }
}
