package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes2.dex */
public final class els extends ViewGroup.MarginLayoutParams {
    public int a;
    public float b;
    public boolean c;
    public int d;

    public els(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public els() {
        super(-1, -1);
        this.a = 0;
    }

    public els(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public els(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 0;
    }

    public els(els elsVar) {
        super((ViewGroup.MarginLayoutParams) elsVar);
        this.a = 0;
        this.a = elsVar.a;
    }
}
