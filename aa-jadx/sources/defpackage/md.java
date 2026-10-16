package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class md extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.mr c;
    public final android.graphics.Rect d;
    public boolean e;
    boolean f;

    public md(int i, int i2) {
        super(i, i2);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public final int eX() {
        return this.c.c();
    }

    public final boolean eY() {
        return this.c.y();
    }

    public final boolean eZ() {
        return this.c.v();
    }

    public md(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public md(defpackage.md mdVar) {
        super((android.view.ViewGroup.LayoutParams) mdVar);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public md(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public md(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }
}
