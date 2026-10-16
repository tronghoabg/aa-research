package q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3800a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f43734a;

    public C3800a(ActionBarContainer actionBarContainer) {
        this.f43734a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f43734a;
        if (actionBarContainer.f17791g) {
            Drawable drawable = actionBarContainer.f17790f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f17788d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f17789e;
        if (drawable3 == null || !actionBarContainer.f17792h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f43734a;
        if (actionBarContainer.f17791g) {
            if (actionBarContainer.f17790f != null) {
                actionBarContainer.f17788d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f17788d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
