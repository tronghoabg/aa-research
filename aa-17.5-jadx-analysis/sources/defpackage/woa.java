package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.Month;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class woa extends wom {
    public DateSelector a;
    public CalendarConstraints b;
    public Month c;
    public wnr d;
    public RecyclerView e;
    public RecyclerView f;
    public View g;
    public MaterialButton h;
    public ls i;
    public int j;
    private int l;
    private DayViewDecorator m;
    private View n;
    private View o;
    private View p;
    private AccessibilityManager q;
    private boolean r;

    static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private final void i(int i) {
        this.f.post(new rgm(this, i, 14));
    }

    public final LinearLayoutManager b() {
        return (LinearLayoutManager) this.f.g();
    }

    public final void c(Month month) {
        wol wolVar = (wol) this.f.m;
        int iB = wolVar.b(month);
        AccessibilityManager accessibilityManager = this.q;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iB2 = iB - wolVar.b(this.c);
            int iAbs = Math.abs(iB2);
            this.c = month;
            if (iAbs > 3) {
                RecyclerView recyclerView = this.f;
                if (iB2 > 0) {
                    recyclerView.X(iB - 3);
                    i(iB);
                } else {
                    recyclerView.X(iB + 3);
                    i(iB);
                }
            } else {
                i(iB);
            }
        } else {
            this.c = month;
            this.f.X(iB);
        }
        e();
        f(iB);
    }

    public final void d(View view) {
        if (view == null) {
            return;
        }
        int i = this.j;
        if (i == 2) {
            ebm.q(view, getString(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            ebm.q(view, getString(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void e() {
        Month month;
        wol wolVar = (wol) this.f.m;
        if (wolVar == null || this.r || (month = this.c) == null || month.equals(wolVar.a)) {
            return;
        }
        int iB = wolVar.b(wolVar.a);
        wolVar.a = month;
        int iB2 = wolVar.b(wolVar.a);
        wolVar.h(iB);
        wolVar.h(iB2);
    }

    public final void f(int i) {
        View view = this.o;
        if (view != null) {
            view.setEnabled(i + 1 < this.f.m.a());
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setEnabled(i + (-1) >= 0);
        }
    }

    public final boolean g(boolean z) {
        Month month;
        if (this.r) {
            return false;
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView.F != 0) {
            return true;
        }
        wol wolVar = (wol) recyclerView.m;
        if (wolVar != null && (month = this.c) != null) {
            int iB = wolVar.b(month) + (true != z ? -1 : 1);
            if (iB >= 0 && iB < wolVar.a()) {
                wolVar.e = true != z ? 1 : 2;
                c(wolVar.c(iB));
                return true;
            }
        }
        return false;
    }

    public final void h(int i) {
        this.j = i;
        if (i == 2) {
            this.e.g().ad(((wos) this.e.m).b(this.c.c));
            this.p.setVisibility(0);
            this.g.setVisibility(8);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        this.p.setVisibility(8);
        this.g.setVisibility(0);
        this.n.setVisibility(0);
        this.o.setVisibility(0);
        c(this.c);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.l = bundle.getInt("THEME_RES_ID_KEY");
        this.a = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.m = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.c = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.l);
        this.d = new wnr(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.q = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.b.a;
        boolean zO = wod.o(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.r = zO;
        View viewInflate = layoutInflaterCloneInContext.inflate(true != zO ? R.layout.mtrl_calendar_horizontal : R.layout.mtrl_calendar_vertical, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i = woh.a;
        viewInflate.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ebm.o(gridView, new wnt());
        int i2 = this.b.e;
        gridView.setAdapter((ListAdapter) (i2 > 0 ? new wns(i2) : new wns()));
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.f = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f.ab(new wnu(this, zO ? 1 : 0, zO ? 1 : 0));
        this.f.setTag("MONTHS_VIEW_GROUP_TAG");
        wol wolVar = new wol(contextThemeWrapper, this.a, this.b, this.m, new ykd(this, null), new ykd(this, null));
        this.f.Z(wolVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e = recyclerView;
        if (recyclerView != null) {
            recyclerView.r = true;
            recyclerView.ab(new wnv(integer));
            this.e.Z(new wos(this));
            this.e.aw(new wnx(this));
        }
        if (!this.r) {
            ls lsVar = new ls();
            this.i = lsVar;
            lsVar.e(this.f);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.h = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ebm.o(this.h, new wny(this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.n = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            this.n.setTooltipText(getString(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.o = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.o.setTooltipText(getString(R.string.mtrl_picker_next_month_tooltip));
            this.p = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.g = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            h(1);
            this.h.setText(this.c.f());
            this.f.ay(new wnz(this, wolVar));
            this.h.setOnClickListener(new sdo((Fragment) this, 14));
            this.o.setOnClickListener(new sqd(this, wolVar, 14));
            this.n.setOnClickListener(new sqd(this, wolVar, 15));
            f(wolVar.b(this.c));
        }
        this.f.X(wolVar.b(this.c));
        ebm.o(this.f, new wnw());
        d(viewInflate);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.l);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.m);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c);
    }
}
