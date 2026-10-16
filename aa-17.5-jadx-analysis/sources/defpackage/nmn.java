package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nmn extends Drawable {
    private final Paint a;
    private int b;
    private final ColorStateList c;
    private final int d;
    private final int e;
    private final int f;

    public nmn(Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.a = paint;
        ColorStateList colorStateListAM = spu.aM(context, R.attr.gearheadFocusAccentColor);
        if (colorStateListAM == null) {
            int i = kwi.c;
            colorStateListAM = context.getColorStateList(R.color.gearhead_focus_blue);
            colorStateListAM.getClass();
        }
        this.c = colorStateListAM;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_hovered);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_focused);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.coolwalk_rail_dock_icon_padding_gm3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        if (this.b == 0) {
            return;
        }
        leh.a.a();
        int iWidth = getBounds().width();
        int i = this.f;
        int i2 = ((iWidth - (i + i)) + this.b) - 1;
        int iWidth2 = getBounds().width() - i2;
        Path pathA = lfr.a.a().a(i2);
        int iSave = canvas.save();
        float f = iWidth2 / 2.0f;
        canvas.translate(f, f);
        try {
            Paint paint = this.a;
            paint.setStrokeWidth(this.b);
            paint.setColor(this.c.getColorForState(getState(), 0));
            canvas.drawPath(pathA, paint);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        iArr.getClass();
        int i = 0;
        if (!StateSet.stateSetMatches(new int[]{-16842909}, iArr)) {
            if (StateSet.stateSetMatches(new int[]{android.R.attr.state_focused}, iArr)) {
                i = this.e;
            } else if (StateSet.stateSetMatches(new int[]{android.R.attr.state_hovered}, iArr)) {
                i = this.d;
            }
        }
        this.b = i;
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
