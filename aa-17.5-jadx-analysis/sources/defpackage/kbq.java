package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentModerationWrapperLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.HeaderView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ObservableScrollView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ScrollableContentView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class kbq extends hlf implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final TextView a;
    private final ActionButtonListView b;
    private final ViewGroup c;
    private final HeaderView d;
    private final ViewGroup e;
    private final ActionStripView f;
    private final ScrollableContentView g;
    private final ObservableScrollView h;
    private final View p;
    private final View q;
    private boolean r;

    public kbq(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.long_message_template_layout, (ViewGroup) null);
        this.c = viewGroup;
        ScrollableContentView scrollableContentView = (ScrollableContentView) viewGroup.findViewById(R.id.scrollable_content_view);
        this.g = scrollableContentView;
        scrollableContentView.b((ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.long_message_template_content, (ViewGroup) null));
        this.a = (TextView) viewGroup.findViewById(R.id.message_text);
        this.b = (ActionButtonListView) viewGroup.findViewById(R.id.action_button_list_view);
        this.d = (HeaderView) viewGroup.findViewById(R.id.header_view);
        this.f = (ActionStripView) viewGroup.findViewById(R.id.action_strip);
        this.e = (ViewGroup) viewGroup.findViewById(R.id.header_container);
        this.h = (ObservableScrollView) viewGroup.findViewById(R.id.scroll_view);
        this.p = viewGroup.findViewById(R.id.focus_dummy_top);
        this.q = viewGroup.findViewById(R.id.focus_dummy_bottom);
        ((ContentModerationWrapperLayout) viewGroup.findViewById(R.id.park_only_container)).a(geuVar, this.k);
        scrollableContentView.setFocusable(true);
        scrollableContentView.setDescendantFocusability(393216);
    }

    private final void h(boolean z) {
        this.p.setFocusable(z);
        this.q.setFocusable(z);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void A() {
        this.c.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        super.A();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void B() {
        super.B();
        this.c.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.hlf
    protected final View a() {
        ScrollableContentView scrollableContentView = this.g;
        if (scrollableContentView.getVisibility() == 0) {
            return scrollableContentView;
        }
        HeaderView headerView = this.d;
        return headerView.getVisibility() == 0 ? headerView : this.c;
    }

    @Override // defpackage.hlf
    public final void d() throws kdb {
        f();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.c;
    }

    public final void f() throws kdb {
        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) C();
        ActionStrip actionStrip = longMessageTemplate.getActionStrip();
        CarText title = longMessageTemplate.getTitle();
        Action headerAction = longMessageTemplate.getHeaderAction();
        if (CarText.isNullOrEmpty(title) && headerAction == null) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.d.a(this.i, title, headerAction, null);
        }
        CarText message = longMessageTemplate.getMessage();
        boolean zIsNullOrEmpty = CarText.isNullOrEmpty(message);
        TextView textView = this.a;
        if (zIsNullOrEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(hlb.d(this.i, message).toString());
            textView.setVisibility(0);
        }
        List<Action> actions = longMessageTemplate.getActions();
        boolean zIsEmpty = actions.isEmpty();
        ActionButtonListView actionButtonListView = this.b;
        if (zIsEmpty) {
            actionButtonListView.setVisibility(8);
        } else {
            actionButtonListView.a(this.i, actions, 2);
            actionButtonListView.setVisibility(0);
            for (int i = 0; i < actionButtonListView.getChildCount(); i++) {
                actionButtonListView.getChildAt(i).setNextFocusUpId(R.id.scrollable_content_view);
            }
        }
        this.f.b(this.i, actionStrip, ghu.a, false, false);
        if (this.k.isRefresh()) {
            return;
        }
        this.g.a();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        if (i == 19) {
            this.r = true;
            if (hlf.J(yfq.r(this.b, this.g), yfq.q(this.d), false)) {
                return true;
            }
        } else if (i == 20) {
            ActionButtonListView actionButtonListView = this.b;
            if (!actionButtonListView.hasFocus()) {
                this.r = true;
                ScrollableContentView scrollableContentView = this.g;
                scrollableContentView.setDescendantFocusability(131072);
                if (hlf.J(yfq.s(this.d, this.f, scrollableContentView), yfq.q(actionButtonListView), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        if (this.r) {
            this.r = false;
            this.a.setSelected(false);
            h(false);
            return;
        }
        ScrollableContentView scrollableContentView = this.g;
        if (!view.equals(scrollableContentView) || view2.equals(scrollableContentView)) {
            if (view2.equals(scrollableContentView)) {
                this.a.setSelected(true);
                h(true);
                return;
            }
            return;
        }
        TextView textView = this.a;
        textView.setSelected(false);
        h(false);
        int iC = jtu.c(view, view2);
        ObservableScrollView observableScrollView = this.h;
        int scrollY = observableScrollView.getScrollY();
        if (iC == 33) {
            if (scrollY <= 0) {
                if (this.f.requestFocus()) {
                    return;
                }
                this.d.requestFocus();
                return;
            } else {
                observableScrollView.pageScroll(33);
                textView.setSelected(true);
                scrollableContentView.setDescendantFocusability(393216);
                h(true);
                scrollableContentView.requestFocus();
                return;
            }
        }
        if (iC == 130) {
            Rect rect = new Rect();
            scrollableContentView.getHitRect(rect);
            ActionButtonListView actionButtonListView = this.b;
            if (actionButtonListView.getLocalVisibleRect(rect)) {
                scrollableContentView.setDescendantFocusability(131072);
                actionButtonListView.requestFocus();
                return;
            }
            observableScrollView.pageScroll(130);
            textView.setSelected(true);
            scrollableContentView.setDescendantFocusability(393216);
            h(true);
            scrollableContentView.requestFocus();
        }
    }
}
