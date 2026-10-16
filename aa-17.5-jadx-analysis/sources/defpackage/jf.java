package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class jf extends ImageView {
    private final iw a;
    private boolean b;
    private final imr c;

    public jf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        nb.d(this, getContext());
        iw iwVar = new iw(this);
        this.a = iwVar;
        iwVar.b(attributeSet, i);
        imr imrVar = new imr(this);
        this.c = imrVar;
        imrVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.a();
        }
        imr imrVar = this.c;
        if (imrVar != null) {
            imrVar.c();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.g() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        imr imrVar = this.c;
        if (imrVar != null) {
            imrVar.c();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        imr imrVar = this.c;
        if (imrVar != null && drawable != null && !this.b) {
            imrVar.e(drawable);
        }
        super.setImageDrawable(drawable);
        if (imrVar != null) {
            imrVar.c();
            if (this.b) {
                return;
            }
            imrVar.b();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        imr imrVar = this.c;
        if (imrVar != null) {
            imrVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        imr imrVar = this.c;
        if (imrVar != null) {
            imrVar.c();
        }
    }

    public jf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jf(Context context) {
        this(context, null);
    }
}
