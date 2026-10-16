package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ie extends android.graphics.drawable.Drawable {
    final android.support.v7.widget.ActionBarContainer a;

    public ie(android.support.v7.widget.ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.support.v7.widget.ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (actionBarContainer.b != null) {
            boolean z = actionBarContainer.e;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        android.support.v7.widget.ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            if (actionBarContainer.c != null) {
                actionBarContainer.a.getOutline(outline);
            }
        } else {
            android.graphics.drawable.Drawable drawable = actionBarContainer.a;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
