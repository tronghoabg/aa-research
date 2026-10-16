package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectangleShapeKt {
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
            return new Outline.Rectangle(SizeKt.m8070toRectuvyYCjk(j2));
        }

        public String toString() {
            return "RectangleShape";
        }
    };

    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
