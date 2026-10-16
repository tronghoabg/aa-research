package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.AppCompatSpinner;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.apps.auto.components.ui.actionpanel.ExpandingActionPanel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.b) {
            case 0:
                hz hzVar = (hz) this.a;
                if (hzVar.u()) {
                    ln lnVar = hzVar.a;
                    if (lnVar.o) {
                        return;
                    }
                    View view = hzVar.c;
                    if (view == null || !view.isShown()) {
                        hzVar.k();
                        return;
                    } else {
                        lnVar.s();
                        return;
                    }
                }
                return;
            case 1:
                ha haVar = (ha) this.a;
                if (haVar.u()) {
                    List list = haVar.b;
                    if (list.size() <= 0 || ((lk) ((aagd) list.get(0)).c).o) {
                        return;
                    }
                    View view2 = haVar.d;
                    if (view2 == null || !view2.isShown()) {
                        haVar.k();
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((lk) ((aagd) it.next()).c).s();
                    }
                    return;
                }
                return;
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.a;
                if (!appCompatSpinner.b.u()) {
                    appCompatSpinner.b();
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 3:
                Object obj = this.a;
                jr jrVar = (jr) obj;
                AppCompatSpinner appCompatSpinner2 = jrVar.d;
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(jrVar.c)) {
                    ((lk) obj).k();
                    return;
                } else {
                    jrVar.n();
                    super/*lk*/.s();
                    return;
                }
            case 4:
                Object obj2 = this.a;
                hld hldVar = (hld) obj2;
                if (hldVar.e) {
                    View viewE = hldVar.e();
                    Rect rect = new Rect();
                    int left = viewE.getLeft() + viewE.getPaddingLeft();
                    int i = hldVar.f;
                    rect.left = left + i;
                    rect.top = viewE.getTop() + viewE.getPaddingTop() + i;
                    rect.bottom = (viewE.getBottom() - viewE.getPaddingBottom()) - i;
                    rect.right = (viewE.getRight() - viewE.getPaddingRight()) - i;
                    Rect rect2 = new Rect(rect);
                    hldVar.fa(rect, rect2);
                    ((hlf) obj2).i.C().g(rect, rect2);
                    hldVar.e = false;
                    return;
                }
                return;
            case 5:
                ((mhe) this.a).F();
                return;
            case 6:
                ExpandingActionPanel expandingActionPanel = (ExpandingActionPanel) this.a;
                woy.Z(expandingActionPanel.g.getChildAt(0) != null);
                Rect rect3 = new Rect();
                expandingActionPanel.g.getHitRect(rect3);
                Rect rect4 = expandingActionPanel.d;
                if (rect4 == null || !rect4.equals(rect3)) {
                    expandingActionPanel.setTouchDelegate(new TouchDelegate(rect3, expandingActionPanel.g.getChildAt(0)));
                    expandingActionPanel.d = rect3;
                    rect3.height();
                    return;
                }
                return;
            case 7:
                ((xcg) this.a).f();
                return;
            case 8:
                zwv zwvVar = (zwv) this.a;
                zwvVar.k.j(zwvVar.g);
                zwvVar.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                zwvVar.g = new ztp(Math.max(1, zwvVar.h.getMeasuredWidth()), Math.max(1, zwvVar.h.getMeasuredHeight()));
                zwvVar.n();
                zwvVar.o(1);
                return;
            case 9:
                Object obj3 = this.a;
                synchronized (obj3) {
                    ((zwv) obj3).h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ((zwv) obj3).k.j(((zwv) obj3).g);
                    ((zwv) obj3).g = new ztp(Math.max(1, ((zwv) obj3).h.getMeasuredWidth()), Math.max(1, ((zwv) obj3).h.getMeasuredHeight()));
                    ((zwv) obj3).n();
                }
                ((zwv) this.a).o(1);
                return;
            default:
                Object obj4 = ((xa) this.a).b;
                ImageView imageView = (ImageView) obj4;
                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view3 = (View) imageView.getParent();
                Rect rect5 = new Rect();
                imageView.getHitRect(rect5);
                rect5.top -= 3;
                rect5.left -= 3;
                rect5.bottom += 3;
                rect5.right += 3;
                view3.setTouchDelegate(new TouchDelegate(rect5, (View) obj4));
                return;
        }
    }

    public /* synthetic */ hx(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
