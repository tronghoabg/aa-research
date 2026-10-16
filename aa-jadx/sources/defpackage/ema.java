package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ema extends android.view.ViewGroup.MarginLayoutParams {
    public int a;
    public float b;
    public boolean c;
    public int d;

    public ema(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.widget.DrawerLayout.a);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ema() {
        super(-1, -1);
        this.a = 0;
    }

    public ema(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public ema(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 0;
    }

    public ema(defpackage.ema emaVar) {
        super((android.view.ViewGroup.MarginLayoutParams) emaVar);
        this.a = 0;
        this.a = emaVar.a;
    }
}
