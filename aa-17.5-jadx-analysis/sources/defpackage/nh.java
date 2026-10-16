package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class nh extends ed {
    public int b;

    public nh(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public nh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public nh(ed edVar) {
        super(edVar);
        this.b = 0;
    }

    public nh(nh nhVar) {
        super((ed) nhVar);
        this.b = 0;
        this.b = nhVar.b;
    }

    public nh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public nh() {
        this.b = 0;
        this.a = 8388627;
    }
}
