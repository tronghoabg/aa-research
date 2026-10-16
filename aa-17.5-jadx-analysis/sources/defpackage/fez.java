package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.apps.auto.components.system.facetbar.ResizeButton;

/* loaded from: classes2.dex */
public final class fez implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fez(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        Layout layout;
        ResizeButton resizeButton = null;
        switch (this.b) {
            case 0:
                ffa ffaVar = (ffa) this.a;
                ffaVar.postInvalidateOnAnimation();
                ViewGroup viewGroup = ffaVar.a;
                if (viewGroup != null && (view = ffaVar.b) != null) {
                    viewGroup.endViewTransition(view);
                    ffaVar.a.postInvalidateOnAnimation();
                    ffaVar.a = null;
                    ffaVar.b = null;
                    break;
                }
                break;
            case 1:
                ((CoordinatorLayout) this.a).i(0);
                break;
            case 2:
                CarTextView carTextView = (CarTextView) this.a;
                geu geuVar = carTextView.a;
                if (geuVar != null && !((ggk) geuVar.F(ggk.class)).H() && (layout = carTextView.getLayout()) != null && carTextView.c(layout.getWidth())) {
                    carTextView.requestLayout();
                    carTextView.invalidate();
                    break;
                }
                break;
            case 3:
                TextView textView = (TextView) this.a;
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                Layout layout2 = textView.getLayout();
                if (layout2 != null && layout2.getEllipsisCount(0) > 0) {
                    ((ype) MaterialRowView.a.l().ai(2943)).w("Secondary action pill with falling back to circles, text too long to ellipse, ellipsis count: %s", layout2.getEllipsisCount(0));
                    textView.setVisibility(8);
                    break;
                } else {
                    textView.setVisibility(0);
                    break;
                }
                break;
            case 4:
                TextView textView2 = (TextView) this.a;
                textView2.getViewTreeObserver().removeOnPreDrawListener(this);
                Layout layout3 = textView2.getLayout();
                if (layout3 != null && layout3.getEllipsisCount(0) > 0) {
                    ((ype) RowView.a.l().ai(2961)).w("Secondary action pill with falling back to circles, text too long to ellipse, ellipsis count: %s", layout3.getEllipsisCount(0));
                    textView2.setVisibility(8);
                    break;
                } else {
                    textView2.setVisibility(0);
                    break;
                }
            case 5:
                RowView rowView = (RowView) this.a;
                rowView.n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (rowView.n.getHeight() > rowView.e) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) rowView.A.getLayoutParams();
                    layoutParams.topMargin = rowView.f;
                    layoutParams.gravity = 48;
                    rowView.A.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 6:
                niy niyVar = (niy) this.a;
                View view2 = niyVar.F;
                if (view2 == null) {
                    affa.d("resizeButtonTapTarget");
                    view2 = null;
                }
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                View view3 = niyVar.F;
                if (view3 == null) {
                    affa.d("resizeButtonTapTarget");
                    view3 = null;
                }
                View view4 = niyVar.F;
                if (view4 == null) {
                    affa.d("resizeButtonTapTarget");
                    view4 = null;
                }
                int width = view4.getWidth();
                View view5 = niyVar.F;
                if (view5 == null) {
                    affa.d("resizeButtonTapTarget");
                    view5 = null;
                }
                Rect rect = new Rect(0, 0, width, view5.getHeight());
                ResizeButton resizeButton2 = niyVar.E;
                if (resizeButton2 == null) {
                    affa.d("resizeButton");
                } else {
                    resizeButton = resizeButton2;
                }
                view3.setTouchDelegate(new TouchDelegate(rect, resizeButton));
                break;
            default:
                View view6 = (View) this.a;
                view6.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!view6.requestFocus()) {
                    rrd.d(5, "GH.ViewFocusInfo", null, "Attempted to request focus on the desired View asynchronously, but failed.", new Object[0]);
                    break;
                } else {
                    rrd.f("GH.ViewFocusInfo", "Restored focus asynchronously");
                    break;
                }
        }
        return true;
    }
}
