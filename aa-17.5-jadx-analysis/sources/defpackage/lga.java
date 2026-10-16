package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
final class lga extends Drawable {
    private final Drawable a;
    private float b;
    private float c;

    public lga(Drawable drawable, float f) {
        this.b = 1.0f;
        this.c = 1.0f;
        this.a = drawable;
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float intrinsicWidth = drawable.getIntrinsicWidth();
        this.b = f;
        this.c = f;
        if (intrinsicHeight > intrinsicWidth && intrinsicWidth > BitmapDescriptorFactory.HUE_RED) {
            this.b = f * (intrinsicWidth / intrinsicHeight);
        } else {
            if (intrinsicWidth <= intrinsicHeight || intrinsicHeight <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            this.c = f * (intrinsicHeight / intrinsicWidth);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.scale(this.b, this.c, getBounds().exactCenterX(), getBounds().exactCenterY());
        this.a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
    }
}
