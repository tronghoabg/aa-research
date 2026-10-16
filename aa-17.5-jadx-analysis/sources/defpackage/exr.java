package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* loaded from: classes2.dex */
final class exr extends lv {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ exv d;

    public exr(exv exvVar) {
        this.d = exvVar;
    }

    private final boolean c(View view, RecyclerView recyclerView) {
        mo moVarJ = recyclerView.j(view);
        if (!(moVarJ instanceof eyg) || !((eyg) moVarJ).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        mo moVarJ2 = recyclerView.j(recyclerView.getChildAt(iIndexOfChild + 1));
        return (moVarJ2 instanceof eyg) && ((eyg) moVarJ2).u;
    }

    @Override // defpackage.lv
    public final void a(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        if (c(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.lv
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (c(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
