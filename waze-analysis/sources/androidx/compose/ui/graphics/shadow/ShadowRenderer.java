package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ShadowRenderer {
    public static final int $stable = 8;
    private final Outline outline;
    private Path path;
    private ColorFilter shadowTint;
    private long shadowTintColor = Color.Companion.m8264getUnspecified0d7_KjU();
    private long cornerRadius = CornerRadius.Companion.m7952getZerokKHJgLs();
    private long generatedSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    private LayoutDirection generatedLayoutDirection = LayoutDirection.Ltr;
    private float generatedDensity = 1.0f;

    public ShadowRenderer(Outline outline) {
        this.outline = outline;
    }

    /* renamed from: obtainTint-8_81llA, reason: not valid java name */
    private final ColorFilter m8987obtainTint8_81llA(long j2) {
        ColorFilter colorFilter = this.shadowTint;
        if (colorFilter != null && Color.m8229equalsimpl0(this.shadowTintColor, j2)) {
            return colorFilter;
        }
        ColorFilter colorFilterM8269tintxETnrds$default = ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, null);
        this.shadowTintColor = j2;
        this.shadowTint = colorFilterM8269tintxETnrds$default;
        return colorFilterM8269tintxETnrds$default;
    }

    private final void updateParamsFromOutline(Outline outline) {
        if (outline instanceof Outline.Generic) {
            this.path = ((Outline.Generic) outline).getPath();
            this.cornerRadius = CornerRadius.Companion.m7952getZerokKHJgLs();
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Rectangle)) {
                throw new i();
            }
            this.path = null;
            this.cornerRadius = CornerRadius.Companion.m7952getZerokKHJgLs();
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            this.path = null;
            this.cornerRadius = rounded.getRoundRect().m8030getTopLeftCornerRadiuskKHJgLs();
        } else {
            this.path = rounded.getRoundRectPath$ui_graphics();
            this.cornerRadius = CornerRadius.Companion.m7952getZerokKHJgLs();
        }
    }

    /* renamed from: buildShadow-_SMYjrA */
    protected abstract void mo8977buildShadow_SMYjrA(DrawScope drawScope, long j2, long j3, Path path);

    /* renamed from: drawShadow-erFMhIw, reason: not valid java name */
    public final void m8988drawShadowerFMhIw(DrawScope drawScope, ColorFilter colorFilter, long j2, long j3, Brush brush, float f2, int i2) {
        updateParamsFromOutline(this.outline);
        if (colorFilter == null) {
            colorFilter = null;
            if (brush == null && j3 != 16) {
                colorFilter = m8987obtainTint8_81llA(j3);
            }
        }
        ColorFilter colorFilter2 = colorFilter;
        long j4 = this.generatedSize;
        if (j4 == InlineClassHelperKt.UnspecifiedPackedFloats || !Size.m8045equalsimpl0(j4, j2) || this.generatedLayoutDirection != drawScope.getLayoutDirection() || this.generatedDensity != drawScope.getDensity()) {
            mo8977buildShadow_SMYjrA(drawScope, j2, this.cornerRadius, this.path);
            this.generatedSize = j2;
            this.generatedLayoutDirection = drawScope.getLayoutDirection();
            this.generatedDensity = drawScope.getDensity();
        }
        mo8978onDrawShadowMLmccfk(drawScope, j2, this.cornerRadius, this.path, f2, colorFilter2, brush, i2);
    }

    public final Outline getOutline() {
        return this.outline;
    }

    public void invalidateShadow() {
        this.generatedSize = Size.Companion.m8057getUnspecifiedNHjbRc();
        this.generatedLayoutDirection = LayoutDirection.Ltr;
        this.generatedDensity = 1.0f;
    }

    /* renamed from: onDrawShadow-MLmccfk */
    protected abstract void mo8978onDrawShadowMLmccfk(DrawScope drawScope, long j2, long j3, Path path, float f2, ColorFilter colorFilter, Brush brush, int i2);
}
