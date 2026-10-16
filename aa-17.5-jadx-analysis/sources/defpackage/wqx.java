package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes3.dex */
public class wqx extends ImageButton {
    public int d;

    public wqx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }

    public final void g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        g(i, true);
    }

    public wqx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public wqx(Context context) {
        this(context, null);
    }
}
