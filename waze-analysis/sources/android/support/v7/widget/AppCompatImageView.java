package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AppCompatImageView extends ImageView implements TintableBackgroundView, TintableImageSourceView {
    private final x mBackgroundTintHelper;
    private boolean mHasLevel;
    private final al mImageHelper;

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mHasLevel = false;
        fz.d(this, getContext());
        x xVar = new x(this);
        this.mBackgroundTintHelper = xVar;
        xVar.d(attributeSet, i2);
        al alVar = new al(this);
        this.mImageHelper = alVar;
        alVar.e(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.c();
        }
        al alVar = this.mImageHelper;
        if (alVar != null) {
            alVar.d();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public ColorStateList getSupportImageTintList() {
        al alVar = this.mImageHelper;
        if (alVar != null) {
            return alVar.a();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public PorterDuff.Mode getSupportImageTintMode() {
        al alVar = this.mImageHelper;
        if (alVar != null) {
            return alVar.b();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.j() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        al alVar = this.mImageHelper;
        if (alVar != null) {
            alVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        al alVar = this.mImageHelper;
        if (alVar != null && drawable != null && !this.mHasLevel) {
            alVar.f(drawable);
        }
        super.setImageDrawable(drawable);
        al alVar2 = this.mImageHelper;
        if (alVar2 != null) {
            alVar2.d();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        al alVar = this.mImageHelper;
        if (alVar != null) {
            alVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        al alVar = this.mImageHelper;
        if (alVar != null) {
            alVar.d();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(ColorStateList colorStateList) {
        al alVar = this.mImageHelper;
        if (alVar != null) {
            alVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        al alVar = this.mImageHelper;
        if (alVar != null) {
            alVar.i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
