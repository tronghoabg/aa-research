package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f1201a;

    public c(ActionBarContainer actionBarContainer) {
        this.f1201a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1201a;
        if (actionBarContainer.f867d) {
            Drawable drawable = actionBarContainer.f866c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f864a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (actionBarContainer.f865b != null) {
            boolean z = actionBarContainer.f868e;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1201a;
        if (actionBarContainer.f867d) {
            if (actionBarContainer.f866c != null) {
                actionBarContainer.f864a.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f864a;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
