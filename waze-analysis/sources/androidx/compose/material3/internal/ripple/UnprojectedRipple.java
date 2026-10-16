package androidx.compose.material3.internal.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UnprojectedRipple extends RippleDrawable {
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;

    public UnprojectedRipple(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.bounded = z;
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m6409calculateRippleColor5vOe2sY(long j2, float f2) {
        return Color.m8227copywmQWz5c$default(j2, n.f(f2, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m6410setColorDxMtmZc(long j2, float f2) {
        long jM6409calculateRippleColor5vOe2sY = m6409calculateRippleColor5vOe2sY(j2, f2);
        Color color = this.rippleColor;
        if (color != null && Color.m8229equalsimpl0(color.m8238unboximpl(), jM6409calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m8218boximpl(jM6409calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m8282toArgb8_81llA(jM6409calculateRippleColor5vOe2sY)));
    }
}
