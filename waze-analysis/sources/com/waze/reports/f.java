package com.waze.reports;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends android.support.v4.app.ar {

    /* renamed from: a, reason: collision with root package name */
    ed f33922a;

    /* renamed from: e, reason: collision with root package name */
    private TextView f33926e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f33927f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f33928g;

    /* renamed from: h, reason: collision with root package name */
    private d f33929h;

    /* renamed from: i, reason: collision with root package name */
    private View f33930i;

    /* renamed from: j, reason: collision with root package name */
    private LinearLayout f33931j;
    private PointsView m;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33924c = com.waze.shared_infra.o.b.a();

    /* renamed from: d, reason: collision with root package name */
    private int f33925d = 0;

    /* renamed from: b, reason: collision with root package name */
    boolean f33923b = false;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f33932k = new ArrayList(4);

    /* renamed from: l, reason: collision with root package name */
    private final e f33933l = new a(this);

    static /* bridge */ /* synthetic */ void e(f fVar) {
        ArrayList arrayList = fVar.f33932k;
        int size = arrayList.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            PointsView pointsView = (PointsView) arrayList.get(i2);
            if (!pointsView.e()) {
                com.waze.view.anim.c.a(pointsView);
                z = false;
            }
        }
        if (fVar.f33923b && !fVar.f33922a.f33905a) {
            com.waze.view.anim.c.a(fVar.f33930i.findViewById(R.id.addPlaceNewAddressMapMustSetText));
            return;
        }
        if (z) {
            fVar.f33922a.T(fVar.f33928g.getText().toString());
            int iE = fVar.f33925d + (fVar.f33922a.e() * bc.b(1));
            fVar.f33925d = iE;
            if (!fVar.f33923b) {
                iE += bc.b(4);
                fVar.f33925d = iE;
            }
            fVar.f33925d = iE + bc.b(13);
            com.waze.ui.x.u.j(fVar.getActivity(), fVar.f33930i);
            ((AddPlaceFlowActivity) fVar.getActivity()).E(fVar.f33922a, fVar.f33925d);
        }
    }

    private final void h() {
        TitleBar titleBar = (TitleBar) this.f33930i.findViewById(R.id.theTitleBar);
        boolean z = this.f33923b;
        com.waze.shared_infra.o.a aVar = this.f33924c;
        if (z) {
            titleBar.c(aVar.c(R.string.RESIDENTIAL_PLACE, new Object[0]));
        } else {
            titleBar.c(aVar.c(R.string.NEW_PLACE, new Object[0]));
        }
        titleBar.m(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 10));
        titleBar.n(new b(this, 1, (byte[]) null));
        WazeTextView wazeTextView = (WazeTextView) this.f33930i.findViewById(R.id.addPlaceNewDoneText);
        com.waze.shared_infra.o.a aVar2 = this.f33924c;
        wazeTextView.setText(aVar2.c(R.string.DONE, new Object[0]));
        ((WazeTextView) this.f33930i.findViewById(R.id.addPlaceNewSubText)).setText(aVar2.c(R.string.TELL_US_MORE_ABOUT_THIS_PLACE, new Object[0]));
        ((com.waze.design_components.text_view.WazeTextView) this.f33930i.findViewById(R.id.shareNote)).setText(aVar2.c(R.string.EDIT_PLACE_SHARE_NOTE, new Object[0]));
        this.f33930i.findViewById(R.id.addPlaceNewDoneButton).setOnClickListener(new b(this, 0));
        ((SettingsTitleText) this.f33930i.findViewById(R.id.addPlaceNewCategoriesTitle)).a(aVar2.c(R.string.CATEGORIES, new Object[0]));
        ((SettingsTitleText) this.f33930i.findViewById(R.id.addPlaceNewDetailsTitle)).a(aVar2.c(R.string.ADDRESS, new Object[0]));
        int iB = bc.b(7);
        PointsView pointsView = (PointsView) this.f33930i.findViewById(R.id.addPlaceNewDetailsCityStreetPoints);
        this.f33926e = (WazeTextView) this.f33930i.findViewById(R.id.addPlaceNewDetailsCityStreetMain);
        this.f33927f = (WazeTextView) this.f33930i.findViewById(R.id.addPlaceNewDetailsCityStreetSub);
        this.f33926e.addTextChangedListener(new d(this, pointsView, iB, new c(this)));
        this.f33926e.setHint(aVar2.c(R.string.STREET_NAME, new Object[0]));
        this.f33927f.setHint(aVar2.c(R.string.CITY, new Object[0]));
        this.f33930i.findViewById(R.id.addPlaceNewDetailsCityStreetLayout).setOnClickListener(new b(this, 2, (char[]) null));
        int iB2 = bc.b(6);
        PointsView pointsView2 = (PointsView) this.f33930i.findViewById(R.id.addPlaceNewDetailsNumberPoints);
        this.f33928g = (EditText) this.f33930i.findViewById(R.id.addPlaceNewDetailsNumber);
        d dVar = new d(this, pointsView2, iB2, this.f33923b ? this.f33933l : null);
        this.f33929h = dVar;
        this.f33928g.addTextChangedListener(dVar);
        this.f33928g.setHint(aVar2.c(R.string.HOUSE_NUMBER, new Object[0]));
        if (this.f33923b) {
            this.f33930i.findViewById(R.id.addPlaceNewPlaceName).setVisibility(8);
            this.f33930i.findViewById(R.id.addPlaceNewSubText).setVisibility(8);
            this.f33930i.findViewById(R.id.addPlaceNewCategoriesPlaceholder).setVisibility(8);
            this.f33930i.findViewById(R.id.addPlaceNewCategoriesTitle).setVisibility(8);
        }
        ((SettingsTitleText) this.f33930i.findViewById(R.id.addPlaceNewLocationTitle)).a(aVar2.c(R.string.LOCATION, new Object[0]));
        ((TextView) this.f33930i.findViewById(R.id.addPlaceNewAddressMapMustSetText)).setText(aVar2.c(R.string.PLACE_CONFIRM_LOCATION, new Object[0]));
        this.f33930i.findViewById(R.id.addPlaceNewAddressMapFrame).setOnClickListener(new b(this, 3, (short[]) null));
    }

    final void f() {
        LinearLayout linearLayout = this.f33931j;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        ed edVar = this.f33922a;
        if (edVar != null) {
            List listE = edVar.E();
            boolean zEquals = false;
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String str = (String) listE.get(i2);
                zEquals |= str.equals("PARKING_LOT");
                g(this.f33931j, str, ar.a(str), true).setPadding(0, 0, 0, 0);
            }
            if (zEquals) {
                com.waze.bm.a.a.ad.d(this.f33931j);
                this.f33930i.findViewById(R.id.addPlaceCategoryCommentLayout).setVisibility(0);
                ((TextView) this.f33930i.findViewById(R.id.addPlaceCategoryComment)).setText(this.f33924c.c(R.string.PLACE_PARKING_CATEGORY_FOOTER, new Object[0]));
                return;
            }
        }
        View viewG = g(this.f33931j, null, this.f33924c.c(R.string.TAP_TO_ADD_CATEGORIES, new Object[0]), false);
        viewG.setPadding(0, 0, 0, 0);
        viewG.setOnClickListener(new b(this, 4, (int[]) null));
        this.f33930i.findViewById(R.id.addPlaceCategoryCommentLayout).setVisibility(8);
    }

    final View g(LinearLayout linearLayout, String str, String str2, boolean z) {
        if (linearLayout.getChildCount() > 0) {
            com.waze.bm.a.a.ad.d(linearLayout);
        }
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.two_line_clearable, (ViewGroup) linearLayout, false);
        ((WazeTextView) viewInflate.findViewById(R.id.twoLineClearableLine1)).setText(str2);
        ((WazeTextView) viewInflate.findViewById(R.id.twoLineClearableLine2)).setVisibility(8);
        if (z) {
            viewInflate.findViewById(R.id.twoLineClearableClear).setOnClickListener(new cu(this, str, 1));
        } else {
            viewInflate.findViewById(R.id.twoLineClearableClear).setVisibility(8);
            PointsView pointsView = this.m;
            if (pointsView != null) {
                this.f33932k.remove(pointsView);
            }
            PointsView pointsView2 = (PointsView) viewInflate.findViewById(R.id.twoLineClearablePoints);
            this.m = pointsView2;
            pointsView2.setVisibility(0);
            boolean z2 = this.f33922a.c() > 0;
            this.m.c(z2);
            this.f33932k.add(this.m);
            this.m.a(bc.b(4));
            this.m.f(z2, false);
        }
        linearLayout.addView(viewInflate);
        viewInflate.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.settingsItemHeight);
        return viewInflate;
    }

    @Override // android.support.v4.app.ar, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.f33922a = (ed) bundle.getParcelable(String.valueOf(f.class.getName()).concat(".mVenue"));
            this.f33923b = bundle.getBoolean(String.valueOf(f.class.getName()).concat(".mIsResidential"));
        }
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        getActivity().getWindow().setSoftInputMode(3);
        NativeManager.getInstance();
        this.f33930i = layoutInflater.inflate(R.layout.add_place_new, viewGroup, false);
        this.f33932k.clear();
        h();
        this.f33928g.setText(this.f33922a.r() == null ? "" : this.f33922a.r());
        ((WazeTextView) this.f33930i.findViewById(R.id.addPlaceNewPlaceName)).setText(this.f33922a.t());
        return this.f33930i;
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(this.f33922a.z())) {
            this.f33926e.setText(this.f33922a.n() == null ? "" : this.f33922a.n());
            this.f33927f.setVisibility(8);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f33922a.n());
            TextView textView = this.f33926e;
            if (zIsEmpty) {
                textView.setText(this.f33922a.z() == null ? "" : this.f33922a.z());
                this.f33927f.setVisibility(8);
            } else {
                textView.setText(this.f33922a.z());
                this.f33927f.setText(this.f33922a.n());
                this.f33927f.setVisibility(0);
            }
        }
        PointsView pointsView = (PointsView) this.f33930i.findViewById(R.id.addPlaceNewDetailsNumberPoints);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f33922a.z());
        EditText editText = this.f33928g;
        if (zIsEmpty2) {
            editText.setText("");
            this.f33928g.setEnabled(false);
            this.f33928g.setAlpha(0.5f);
            pointsView.setAlpha(0.5f);
        } else {
            editText.setEnabled(true);
            this.f33928g.setAlpha(1.0f);
            pointsView.setAlpha(1.0f);
        }
        if (!this.f33923b) {
            this.f33931j = (LinearLayout) this.f33930i.findViewById(R.id.addPlaceNewCategoriesPlaceholder);
            f();
        }
        super.onResume();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        bundle.putParcelable(String.valueOf(f.class.getName()).concat(".mVenue"), this.f33922a);
        bundle.putBoolean(String.valueOf(f.class.getName()).concat(".mIsResidential"), this.f33923b);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.shared_infra.g.e.d(view, view.findViewById(R.id.theScrollView));
    }
}
