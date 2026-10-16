package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class wla extends wlc {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public wla() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public float J(View view) {
        throw null;
    }

    public int K(View view) {
        throw null;
    }

    public abstract View L(List list);

    public final int N(View view) {
        if (this.d == 0) {
            return 0;
        }
        float fJ = J(view);
        int i = this.d;
        return dlz.j((int) (fJ * i), 0, i);
    }

    public boolean P() {
        return false;
    }

    @Override // defpackage.wlc
    protected final void gG(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewL = L(coordinatorLayout.a(view));
        if (viewL == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        dsj dsjVar = (dsj) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + dsjVar.leftMargin, viewL.getBottom() + dsjVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dsjVar.rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - dsjVar.bottomMargin);
        ecy ecyVar = coordinatorLayout.e;
        if (ecyVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += ecyVar.b();
            rect.right -= ecyVar.c();
        }
        Rect rect2 = this.b;
        int i2 = dsjVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iN = N(viewL);
        view.layout(rect2.left, rect2.top - iN, rect2.right, rect2.bottom - iN);
        this.c = rect2.top - viewL.getBottom();
    }

    public wla(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
