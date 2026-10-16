package q;

import K8.C0694f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: q.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3837t extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final R1.q f43903a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.n f43904b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3837t(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        f1.a(context);
        this.f43905c = false;
        e1.a(getContext(), this);
        R1.q qVar = new R1.q(this);
        this.f43903a = qVar;
        qVar.t(attributeSet, i5);
        E4.n nVar = new E4.n(this);
        this.f43904b = nVar;
        nVar.n(attributeSet, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            qVar.n();
        }
        E4.n nVar = this.f43904b;
        if (nVar != null) {
            nVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0694f c0694f;
        E4.n nVar = this.f43904b;
        if (nVar == null || (c0694f = (C0694f) nVar.f2940d) == null) {
            return null;
        }
        return (ColorStateList) c0694f.f6641c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0694f c0694f;
        E4.n nVar = this.f43904b;
        if (nVar == null || (c0694f = (C0694f) nVar.f2940d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0694f.f6642d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f43904b.f2939c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        E4.n nVar = this.f43904b;
        if (nVar != null) {
            nVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        E4.n nVar = this.f43904b;
        if (nVar != null && drawable != null && !this.f43905c) {
            nVar.f2938b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (nVar != null) {
            nVar.c();
            if (this.f43905c) {
                return;
            }
            ImageView imageView = (ImageView) nVar.f2939c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(nVar.f2938b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i5) {
        super.setImageLevel(i5);
        this.f43905c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        E4.n nVar = this.f43904b;
        ImageView imageView = (ImageView) nVar.f2939c;
        if (i5 != 0) {
            Drawable drawableB = Fe.g.B(imageView.getContext(), i5);
            if (drawableB != null) {
                AbstractC3827n0.a(drawableB);
            }
            imageView.setImageDrawable(drawableB);
        } else {
            imageView.setImageDrawable(null);
        }
        nVar.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        E4.n nVar = this.f43904b;
        if (nVar != null) {
            nVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R1.q qVar = this.f43903a;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        E4.n nVar = this.f43904b;
        if (nVar != null) {
            if (((C0694f) nVar.f2940d) == null) {
                nVar.f2940d = new C0694f();
            }
            C0694f c0694f = (C0694f) nVar.f2940d;
            c0694f.f6641c = colorStateList;
            c0694f.f6640b = true;
            nVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        E4.n nVar = this.f43904b;
        if (nVar != null) {
            if (((C0694f) nVar.f2940d) == null) {
                nVar.f2940d = new C0694f();
            }
            C0694f c0694f = (C0694f) nVar.f2940d;
            c0694f.f6642d = mode;
            c0694f.f6639a = true;
            nVar.c();
        }
    }
}
