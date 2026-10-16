package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ed extends android.view.ViewGroup.MarginLayoutParams {
    public int a;

    public ed(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ft.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ed() {
        super(-2, -2);
        this.a = 8388627;
    }

    public ed(defpackage.ed edVar) {
        super((android.view.ViewGroup.MarginLayoutParams) edVar);
        this.a = 0;
        this.a = edVar.a;
    }

    public ed(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
