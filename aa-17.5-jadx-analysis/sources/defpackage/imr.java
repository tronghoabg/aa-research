package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class imr {
    public int a;
    public final Object b;

    public imr(int i) {
        this.b = new LinkedList();
        this.a = i;
    }

    final int a() {
        return ((LinkedList) this.b).size();
    }

    public final void b() {
        ImageView imageView = (ImageView) this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    public final void c() {
        Drawable drawable = ((ImageView) this.b).getDrawable();
        if (drawable != null) {
            ko.b(drawable);
        }
    }

    public final void d(AttributeSet attributeSet, int i) {
        int iQ;
        Object obj = this.b;
        ImageView imageView = (ImageView) obj;
        Context context = imageView.getContext();
        int[] iArr = fs.f;
        lah lahVar = new lah(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        ebm.n((View) obj, imageView.getContext(), iArr, attributeSet, (TypedArray) lahVar.a, i, 0);
        try {
            Drawable drawable = ((ImageView) obj).getDrawable();
            if (drawable == null && (iQ = lahVar.q(1, -1)) != -1) {
                drawable = mr.e().c(((ImageView) obj).getContext(), iQ);
                if (drawable != null) {
                    ((ImageView) obj).setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                ko.b(drawable);
            }
            if (lahVar.y(2)) {
                ((ImageView) obj).setImageTintList(lahVar.r(2));
            }
            if (lahVar.y(3)) {
                int iN = lahVar.n(3, -1);
                Rect rect = ko.a;
                ((ImageView) obj).setImageTintMode(a.R(iN, null));
            }
        } finally {
            lahVar.w();
        }
    }

    public final void e(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void f(int i) {
        Object obj = this.b;
        if (i != 0) {
            ImageView imageView = (ImageView) obj;
            Drawable drawableC = mr.e().c(imageView.getContext(), i);
            if (drawableC != null) {
                ko.b(drawableC);
            }
            imageView.setImageDrawable(drawableC);
        } else {
            ((ImageView) obj).setImageDrawable(null);
        }
        c();
    }

    public final boolean g() {
        return !(((ImageView) this.b).getBackground() instanceof RippleDrawable);
    }

    public final Object h() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void i(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public imr(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public imr(jhf jhfVar) {
        this.b = jhfVar;
    }

    public imr() {
        this.b = new Object[256];
    }
}
