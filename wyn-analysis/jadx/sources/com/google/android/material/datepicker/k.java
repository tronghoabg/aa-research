package com.google.android.material.datepicker;

import a2.C1323c;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import k1.S;

/* loaded from: classes4.dex */
public final class k<S> extends s {

    /* renamed from: b, reason: collision with root package name */
    public int f26916b;

    /* renamed from: c, reason: collision with root package name */
    public b f26917c;

    /* renamed from: d, reason: collision with root package name */
    public n f26918d;

    /* renamed from: e, reason: collision with root package name */
    public int f26919e;

    /* renamed from: f, reason: collision with root package name */
    public c f26920f;

    /* renamed from: g, reason: collision with root package name */
    public RecyclerView f26921g;

    /* renamed from: h, reason: collision with root package name */
    public RecyclerView f26922h;

    /* renamed from: i, reason: collision with root package name */
    public View f26923i;

    /* renamed from: j, reason: collision with root package name */
    public View f26924j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f26925l;

    public final void G(n nVar) {
        r rVar = (r) this.f26922h.getAdapter();
        int iG = rVar.f26965i.f26892a.g(nVar);
        int iG2 = iG - rVar.f26965i.f26892a.g(this.f26918d);
        boolean z2 = Math.abs(iG2) > 3;
        boolean z10 = iG2 > 0;
        this.f26918d = nVar;
        if (z2 && z10) {
            this.f26922h.scrollToPosition(iG - 3);
            this.f26922h.post(new R3.c(this, iG, 2));
        } else if (!z2) {
            this.f26922h.post(new R3.c(this, iG, 2));
        } else {
            this.f26922h.scrollToPosition(iG + 3);
            this.f26922h.post(new R3.c(this, iG, 2));
        }
    }

    public final void H(int i5) {
        this.f26919e = i5;
        if (i5 == 2) {
            this.f26921g.getLayoutManager().scrollToPosition(this.f26918d.f26951c - ((x) this.f26921g.getAdapter()).f26970i.f26917c.f26892a.f26951c);
            this.k.setVisibility(0);
            this.f26925l.setVisibility(8);
            this.f26923i.setVisibility(8);
            this.f26924j.setVisibility(8);
            return;
        }
        if (i5 == 1) {
            this.k.setVisibility(8);
            this.f26925l.setVisibility(0);
            this.f26923i.setVisibility(0);
            this.f26924j.setVisibility(0);
            G(this.f26918d);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26916b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f26917c = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f26918d = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.F
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i5;
        int i10;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f26916b);
        this.f26920f = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f26917c.f26892a;
        if (l.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i5 = com.wynauto.wyn.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i5 = com.wynauto.wyn.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i5, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.wynauto.wyn.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.wynauto.wyn.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = o.f26956d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.wynauto.wyn.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.wynauto.wyn.R.id.mtrl_calendar_days_of_week);
        S.m(gridView, new g(0));
        int i12 = this.f26917c.f26896e;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new e(i12) : new e()));
        gridView.setNumColumns(nVar.f26952d);
        gridView.setEnabled(false);
        this.f26922h = (RecyclerView) viewInflate.findViewById(com.wynauto.wyn.R.id.mtrl_calendar_months);
        getContext();
        this.f26922h.setLayoutManager(new h(this, i10, i10));
        this.f26922h.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f26917c, new C1323c(this, 5));
        this.f26922h.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.wynauto.wyn.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.wynauto.wyn.R.id.mtrl_calendar_year_selector_frame);
        this.f26921g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f26921g.setLayoutManager(new GridLayoutManager(integer));
            this.f26921g.setAdapter(new x(this));
            this.f26921g.addItemDecoration(new i(this));
        }
        if (viewInflate.findViewById(com.wynauto.wyn.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.wynauto.wyn.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            S.m(materialButton, new O7.e(this, 3));
            View viewFindViewById = viewInflate.findViewById(com.wynauto.wyn.R.id.month_navigation_previous);
            this.f26923i = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.wynauto.wyn.R.id.month_navigation_next);
            this.f26924j = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.k = viewInflate.findViewById(com.wynauto.wyn.R.id.mtrl_calendar_year_selector_frame);
            this.f26925l = viewInflate.findViewById(com.wynauto.wyn.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f26918d.f());
            this.f26922h.addOnScrollListener(new j(this, rVar, materialButton));
            int i13 = 1;
            materialButton.setOnClickListener(new F6.f(this, i13));
            this.f26924j.setOnClickListener(new f(this, rVar, i13));
            this.f26923i.setOnClickListener(new f(this, rVar, 0));
        }
        if (!l.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            new D().attachToRecyclerView(this.f26922h);
        }
        this.f26922h.scrollToPosition(rVar.f26965i.f26892a.g(this.f26918d));
        S.m(this.f26922h, new g(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.F
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f26916b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f26917c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f26918d);
    }
}
