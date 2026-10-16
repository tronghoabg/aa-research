package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.dx;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButton;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z extends aq {

    /* renamed from: b, reason: collision with root package name */
    private int f6497b;

    /* renamed from: c, reason: collision with root package name */
    private c f6498c;

    /* renamed from: d, reason: collision with root package name */
    private l f6499d;

    /* renamed from: e, reason: collision with root package name */
    private aj f6500e;

    /* renamed from: f, reason: collision with root package name */
    private e f6501f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView f6502g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView f6503h;

    /* renamed from: i, reason: collision with root package name */
    private View f6504i;

    /* renamed from: j, reason: collision with root package name */
    private View f6505j;

    /* renamed from: k, reason: collision with root package name */
    private View f6506k;

    /* renamed from: l, reason: collision with root package name */
    private View f6507l;
    private MaterialButton m;
    private AccessibilityManager n;
    private dx o;
    private boolean p;
    private int q;
    private at r;

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int i2) {
        View view = this.f6505j;
        if (view != null) {
            view.setEnabled(i2 + 1 < this.f6503h.j().getItemCount());
        }
        View view2 = this.f6504i;
        if (view2 != null) {
            view2.setEnabled(i2 + (-1) >= 0);
        }
    }

    static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    static /* bridge */ /* synthetic */ boolean s(z zVar, boolean z) {
        aj ajVar;
        if (zVar.p) {
            return false;
        }
        if (zVar.f6503h.g() != 0) {
            return true;
        }
        ao aoVar = (ao) zVar.f6503h.j();
        if (aoVar == null || (ajVar = zVar.f6500e) == null) {
            return false;
        }
        int iA = aoVar.a(ajVar) + (true != z ? -1 : 1);
        if (iA >= 0 && iA < aoVar.getItemCount()) {
            aoVar.d(true != z ? 1 : 2);
            zVar.q(aoVar.b(iA));
            return true;
        }
        return false;
    }

    private final void x(int i2) {
        this.f6503h.post(new p(this, i2));
    }

    private final void y(View view) {
        if (view == null) {
            return;
        }
        int i2 = this.q;
        if (i2 == 2) {
            ViewCompat.setAccessibilityPaneTitle(view, getString(R.string.mtrl_picker_pane_title_year_view));
        } else if (i2 == 1) {
            ViewCompat.setAccessibilityPaneTitle(view, getString(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        ao aoVar = (ao) this.f6503h.j();
        if (aoVar == null || this.p) {
            return;
        }
        aoVar.e(this.f6500e);
    }

    final LinearLayoutManager b() {
        return (LinearLayoutManager) this.f6503h.l();
    }

    final c i() {
        return this.f6498c;
    }

    final e k() {
        return this.f6501f;
    }

    final aj l() {
        return this.f6500e;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6497b = bundle.getInt("THEME_RES_ID_KEY");
        this.r = (at) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6498c = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6499d = (l) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f6500e = (aj) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f6497b);
        this.f6501f = new e(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.n = (AccessibilityManager) requireContext().getSystemService("accessibility");
        aj ajVarM = this.f6498c.m();
        boolean zE = ag.e(contextThemeWrapper);
        this.p = zE;
        View viewInflate = layoutInflaterCloneInContext.inflate(true != zE ? R.layout.mtrl_calendar_horizontal : R.layout.mtrl_calendar_vertical, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i2 = ak.f6405a;
        viewInflate.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new q(this));
        int iB = this.f6498c.b();
        gridView.setAdapter((ListAdapter) (iB > 0 ? new m(iB) : new m()));
        gridView.setNumColumns(ajVarM.f6400c);
        gridView.setEnabled(false);
        this.f6503h = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f6503h.al(new r(this, zE ? 1 : 0, zE ? 1 : 0));
        this.f6503h.setTag("MONTHS_VIEW_GROUP_TAG");
        ao aoVar = new ao(contextThemeWrapper, this.r, this.f6498c, this.f6499d, new s(this), new t(this));
        this.f6503h.ak(aoVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f6502g = recyclerView;
        if (recyclerView != null) {
            recyclerView.aC();
            this.f6502g.al(new GridLayoutManager(integer));
            this.f6502g.ak(new ba(this));
            this.f6502g.A(new v(this));
        }
        if (!this.p) {
            dx dxVar = new dx();
            this.o = dxVar;
            dxVar.f(this.f6503h);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.m = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(this.m, new w(this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.f6504i = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            this.f6504i.setTooltipText(getString(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f6505j = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f6505j.setTooltipText(getString(R.string.mtrl_picker_next_month_tooltip));
            this.f6506k = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f6507l = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            u(1);
            this.m.setText(this.f6500e.k());
            this.f6503h.aF(new x(this, aoVar));
            this.m.setOnClickListener(new y(this));
            this.f6505j.setOnClickListener(new n(this, aoVar));
            this.f6504i.setOnClickListener(new o(this, aoVar));
            A(aoVar.a(this.f6500e));
        }
        this.f6503h.ai(aoVar.a(this.f6500e));
        ViewCompat.setAccessibilityDelegate(this.f6503h, new u(this));
        y(viewInflate);
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6497b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.r);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6498c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f6499d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6500e);
    }

    final void p() {
        MaterialButton materialButton = this.m;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    final void q(aj ajVar) {
        ao aoVar = (ao) this.f6503h.j();
        int iA = aoVar.a(ajVar);
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iA2 = iA - aoVar.a(this.f6500e);
            int iAbs = Math.abs(iA2);
            this.f6500e = ajVar;
            if (iAbs > 3) {
                RecyclerView recyclerView = this.f6503h;
                if (iA2 > 0) {
                    recyclerView.ai(iA - 3);
                    x(iA);
                } else {
                    recyclerView.ai(iA + 3);
                    x(iA);
                }
            } else {
                x(iA);
            }
        } else {
            this.f6500e = ajVar;
            this.f6503h.ai(iA);
        }
        z();
        A(iA);
    }

    final void r() {
        int i2 = this.q;
        if (i2 == 2) {
            u(1);
        } else if (i2 == 1) {
            u(2);
        }
        y(getView());
    }

    @Override // com.google.android.material.datepicker.aq
    public final boolean t(ap apVar) {
        return super.t(apVar);
    }

    final void u(int i2) {
        this.q = i2;
        if (i2 == 2) {
            this.f6502g.l().aa(((ba) this.f6502g.j()).a(this.f6500e.f6399b));
            this.f6506k.setVisibility(0);
            this.f6507l.setVisibility(8);
            this.f6504i.setVisibility(8);
            this.f6505j.setVisibility(8);
            return;
        }
        this.f6506k.setVisibility(8);
        this.f6507l.setVisibility(0);
        this.f6504i.setVisibility(0);
        this.f6505j.setVisibility(0);
        q(this.f6500e);
    }

    public final at w() {
        return this.r;
    }
}
