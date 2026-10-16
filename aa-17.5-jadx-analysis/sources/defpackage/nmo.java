package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nmo extends Drawable {
    public boolean a;
    public int b;
    private final Context c;
    private final Paint d;

    public nmo(Context context) throws Resources.NotFoundException {
        this.c = context;
        Paint paint = new Paint(1);
        leh.a.a();
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(127);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.coolwalk_rail_dock_icon_outline_stroke_width_gm3));
        this.d = paint;
        context.getResources().getDimensionPixelSize(R.dimen.coolwalk_rail_dock_button_icon_size);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        if (this.a) {
            Paint paint = this.d;
            paint.setColor(this.b);
            leh.a.a();
            canvas.drawPath(lfr.a.a().a(getBounds().width()), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
