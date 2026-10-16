package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f1064a;

    /* renamed from: b, reason: collision with root package name */
    private gb f1065b;

    /* renamed from: c, reason: collision with root package name */
    private int f1066c = 0;

    public al(ImageView imageView) {
        this.f1064a = imageView;
    }

    final ColorStateList a() {
        gb gbVar = this.f1065b;
        if (gbVar != null) {
            return gbVar.f1540a;
        }
        return null;
    }

    final PorterDuff.Mode b() {
        gb gbVar = this.f1065b;
        if (gbVar != null) {
            return gbVar.f1541b;
        }
        return null;
    }

    final void c() {
        ImageView imageView = this.f1064a;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.f1066c);
        }
    }

    final void d() {
        gb gbVar;
        ImageView imageView = this.f1064a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            cg.b(drawable);
        }
        if (drawable == null || (gbVar = this.f1065b) == null) {
            return;
        }
        fj.h(drawable, gbVar, imageView.getDrawableState());
    }

    public final void e(AttributeSet attributeSet, int i2) {
        int iF;
        ImageView imageView = this.f1064a;
        Context context = imageView.getContext();
        int[] iArr = android.support.v7.a.a.f484f;
        gc gcVarN = gc.n(context, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), iArr, attributeSet, gcVarN.h(), i2, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iF = gcVarN.f(1, -1)) != -1 && (drawable = android.support.a.i.d(imageView.getContext(), iF)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                cg.b(drawable);
            }
            if (gcVarN.s(2)) {
                ImageViewCompat.setImageTintList(imageView, gcVarN.g(2));
            }
            if (gcVarN.s(3)) {
                int iC = gcVarN.c(3, -1);
                Rect rect = cg.f1231a;
                ImageViewCompat.setImageTintMode(imageView, com.waze.c.c.e.h(iC, null));
            }
        } finally {
            gcVarN.q();
        }
    }

    final void f(Drawable drawable) {
        this.f1066c = drawable.getLevel();
    }

    public final void g(int i2) {
        ImageView imageView = this.f1064a;
        if (i2 != 0) {
            Drawable drawableD = android.support.a.i.d(imageView.getContext(), i2);
            if (drawableD != null) {
                cg.b(drawableD);
            }
            imageView.setImageDrawable(drawableD);
        } else {
            imageView.setImageDrawable(null);
        }
        d();
    }

    final void h(ColorStateList colorStateList) {
        gb gbVar = this.f1065b;
        if (gbVar == null) {
            gbVar = new gb();
            this.f1065b = gbVar;
        }
        gbVar.f1540a = colorStateList;
        gbVar.f1543d = true;
        d();
    }

    final void i(PorterDuff.Mode mode) {
        gb gbVar = this.f1065b;
        if (gbVar == null) {
            gbVar = new gb();
            this.f1065b = gbVar;
        }
        gbVar.f1541b = mode;
        gbVar.f1542c = true;
        d();
    }

    final boolean j() {
        return !(this.f1064a.getBackground() instanceof RippleDrawable);
    }
}
