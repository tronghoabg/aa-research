package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class imz {
    public int a;
    public final java.lang.Object b;

    public imz(int i) {
        this.b = new java.util.LinkedList();
        this.a = i;
    }

    final int a() {
        return ((java.util.LinkedList) this.b).size();
    }

    public final void b() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) this.b).getDrawable();
        if (drawable != null) {
            defpackage.kp.b(drawable);
        }
    }

    public final void d(android.util.AttributeSet attributeSet, int i) {
        int iQ;
        java.lang.Object obj = this.b;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        android.content.Context context = imageView.getContext();
        int[] iArr = defpackage.ft.f;
        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        defpackage.ebt.m((android.view.View) obj, imageView.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lamVar.a, i, 0);
        try {
            android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) obj).getDrawable();
            if (drawable == null && (iQ = lamVar.q(1, -1)) != -1) {
                drawable = defpackage.mu.e().c(((android.widget.ImageView) obj).getContext(), iQ);
                if (drawable != null) {
                    ((android.widget.ImageView) obj).setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                defpackage.kp.b(drawable);
            }
            if (lamVar.y(2)) {
                ((android.widget.ImageView) obj).setImageTintList(lamVar.r(2));
            }
            if (lamVar.y(3)) {
                int iN = lamVar.n(3, -1);
                android.graphics.Rect rect = defpackage.kp.a;
                ((android.widget.ImageView) obj).setImageTintMode(defpackage.a.Q(iN, null));
            }
        } finally {
            lamVar.w();
        }
    }

    public final void e(android.graphics.drawable.Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void f(int i) {
        java.lang.Object obj = this.b;
        if (i != 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) obj;
            android.graphics.drawable.Drawable drawableC = defpackage.mu.e().c(imageView.getContext(), i);
            if (drawableC != null) {
                defpackage.kp.b(drawableC);
            }
            imageView.setImageDrawable(drawableC);
        } else {
            ((android.widget.ImageView) obj).setImageDrawable(null);
        }
        c();
    }

    public final boolean g() {
        return !(((android.widget.ImageView) this.b).getBackground() instanceof android.graphics.drawable.RippleDrawable);
    }

    public final java.lang.Object h() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        java.lang.Object[] objArr = (java.lang.Object[]) this.b;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void i(java.lang.Object obj) {
        int i = this.a;
        if (i < 256) {
            ((java.lang.Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public imz(android.widget.ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public imz(defpackage.jhl jhlVar) {
        this.b = jhlVar;
    }

    public imz() {
        this.b = new java.lang.Object[256];
    }
}
