package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wlv extends android.widget.FrameLayout.LayoutParams {
    public int a;
    public float b;

    public wlv(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wlz.d);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public wlv() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public wlv(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}
