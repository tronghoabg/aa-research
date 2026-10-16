package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.auto.components.apphost.basewidgets.action.MaterialActionStripView;

/* loaded from: classes2.dex */
public final class klu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ klu(kce kceVar, geu geuVar, int i) {
        this.c = i;
        this.b = kceVar;
        this.a = geuVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.c == 0) {
            ((View) this.a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            klx klxVar = (klx) this.b;
            klxVar.c = klxVar.e.getY();
            return;
        }
        Rect rect = new Rect();
        kce kceVar = (kce) this.b;
        rect.left = kceVar.b.getRight();
        MaterialActionStripView materialActionStripView = kceVar.c;
        rect.top = materialActionStripView.getBottom();
        ViewGroup viewGroup = kceVar.a;
        rect.bottom = viewGroup.getBottom() - viewGroup.getPaddingBottom();
        rect.right = viewGroup.getRight() - viewGroup.getPaddingRight();
        Rect rect2 = new Rect(rect);
        if (materialActionStripView.getVisibility() != 0) {
            rect2.top = viewGroup.getTop() + viewGroup.getPaddingTop();
        }
        ((geu) this.a).C().g(rect2, rect);
    }

    public klu(klx klxVar, View view, int i) {
        this.c = i;
        this.a = view;
        this.b = klxVar;
    }
}
