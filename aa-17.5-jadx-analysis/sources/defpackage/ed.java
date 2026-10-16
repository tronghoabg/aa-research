package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ed extends ViewGroup.MarginLayoutParams {
    public int a;

    public ed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fs.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ed() {
        super(-2, -2);
        this.a = 8388627;
    }

    public ed(ed edVar) {
        super((ViewGroup.MarginLayoutParams) edVar);
        this.a = 0;
        this.a = edVar.a;
    }

    public ed(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
