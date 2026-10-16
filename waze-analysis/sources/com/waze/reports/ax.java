package com.waze.reports;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.jni.protos.OpeningHours;
import com.waze.jni.protos.VenueImage;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.title.TitleBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends android.support.v4.app.ar implements org.a.a.b.a {
    private boolean B;

    /* renamed from: a, reason: collision with root package name */
    private bz f33658a;

    /* renamed from: b, reason: collision with root package name */
    private NativeManager f33659b;

    /* renamed from: k, reason: collision with root package name */
    private float f33668k;

    /* renamed from: l, reason: collision with root package name */
    private ed f33669l;
    private ed m;
    private WazeTextView o;
    private ArrayList p;
    private View q;
    private WazeTextView r;
    private WazeTextView s;
    private EditText t;
    private EditText u;
    private EditText v;
    private EditText w;
    private PointsView y;

    /* renamed from: c, reason: collision with root package name */
    private int f33660c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f33661d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33662e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33663f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33664g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33665h = false;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f33666i = new ArrayList(16);

    /* renamed from: j, reason: collision with root package name */
    private final cp f33667j = new cn(1);
    private boolean n = false;
    private int x = 0;
    private final com.waze.shared_infra.o.a z = com.waze.shared_infra.o.b.a();
    private final h.f A = com.waze.z.a.a.h.e(this);

    public static /* synthetic */ void H(ax axVar) {
        String string = axVar.t.getText().toString();
        ArrayList arrayList = axVar.f33666i;
        int size = arrayList.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            PointsView pointsView = (PointsView) arrayList.get(i2);
            if (!pointsView.e()) {
                if (z) {
                    axVar.Q(pointsView);
                }
                com.waze.view.anim.c.a(pointsView);
                z = false;
            }
        }
        if (axVar.w.getText().toString().isEmpty() && !axVar.m.t().isEmpty()) {
            if (z) {
                axVar.Q(axVar.q.findViewById(R.id.editPlaceNameLayout));
            }
            com.waze.view.anim.c.a(axVar.q.findViewById(R.id.editPlaceNamePoints));
            z = false;
        }
        if (TextUtils.isEmpty(axVar.f33669l.n()) && !TextUtils.isEmpty(axVar.m.n())) {
            if (z) {
                axVar.Q(axVar.q.findViewById(R.id.editPlaceDetailsCityStreetLayout));
            }
            com.waze.view.anim.c.a(axVar.q.findViewById(R.id.editPlaceDetailsCityStreetPoints));
            z = false;
        }
        if (axVar.f33669l.c() == 0 && axVar.m.c() != 0) {
            if (z) {
                axVar.Q(axVar.q.findViewById(R.id.editPlaceCategoriesPlaceholder));
            }
            com.waze.view.anim.c.a(axVar.y);
        } else if (z) {
            axVar.f33669l.T(string);
            axVar.f33669l.W(axVar.w.getText().toString());
            axVar.f33669l.Y(axVar.u.getText().toString());
            axVar.f33669l.ah(axVar.v.getText().toString());
            axVar.f33669l.e();
            ((EditPlaceFlowActivity) axVar.requireActivity()).N(axVar.f33669l, axVar.m, axVar.f33660c);
            axVar.f33659b.OpenProgressPopup(axVar.z.c(R.string.PLEASE_WAIT___, new Object[0]));
        }
    }

    public static /* synthetic */ void I(ax axVar) {
        EditPlaceFlowActivity editPlaceFlowActivity = (EditPlaceFlowActivity) axVar.requireActivity();
        axVar.o.getText().toString();
        editPlaceFlowActivity.M();
    }

    public static /* synthetic */ void J(ax axVar, String str, LinearLayout linearLayout) throws NoSuchMethodException, SecurityException {
        axVar.f33669l.ao(str);
        axVar.v(linearLayout);
    }

    public static /* synthetic */ void K(ax axVar) {
        com.waze.ui.x.u.j(axVar.getActivity(), axVar.q);
        ((EditPlaceFlowActivity) axVar.requireActivity()).H();
    }

    private final EditText O(int i2, int i3, int i4, String str, int i5, cp cpVar) {
        PointsView pointsView = (PointsView) this.q.findViewById(i2);
        EditText editText = (EditText) this.q.findViewById(i3);
        editText.setText(str);
        editText.addTextChangedListener(new cq(this, pointsView, i5, cpVar, str));
        editText.setHint(this.z.c(i4, new Object[0]));
        return editText;
    }

    private final ba P() {
        return (ba) com.waze.web.r.t((org.a.d.k.b) this.A.getValue(), ba.class);
    }

    private final void Q(View view) {
        ScrollView scrollView = (ScrollView) this.q.findViewById(R.id.theScrollView);
        while (view.getParent().getParent() != scrollView) {
            view = (View) view.getParent();
        }
        scrollView.post(new android.support.v4.app.n(this, scrollView, view, 12));
    }

    private final void R() {
        this.p = new ArrayList(this.f33669l.d());
        for (VenueImage venueImage : this.f33669l.F()) {
            String url = venueImage.getUrl();
            this.p.add(url.startsWith(DomExceptionUtils.SEPARATOR) ? new bx(Uri.fromFile(new File(url)).toString(), venueImage.getThumbnailUrl(), "", "", true) : new bx(venueImage));
        }
    }

    private final void S(ScrollView scrollView, ScrollView scrollView2, boolean z, boolean z2) throws NoSuchMethodException, SecurityException {
        new com.waze.f.a.d(new aw(this, z, scrollView, scrollView2)).b(z2 ? com.waze.f.a.f.class : com.waze.f.a.e.class, this.f33668k * 20.0f, true != z2 ? 100 : 600);
    }

    private final void T() throws NoSuchMethodException, SecurityException {
        TitleBar titleBar = (TitleBar) this.q.findViewById(R.id.theTitleBar);
        int i2 = 0;
        com.waze.shared_infra.o.a aVar = this.z;
        titleBar.d(aVar.c(R.string.EDIT_PLACE, new Object[0]), aVar.c(R.string.DONE, new Object[0]));
        ((com.waze.design_components.text_view.WazeTextView) this.q.findViewById(R.id.shareNote)).setText(aVar.c(R.string.EDIT_PLACE_SHARE_NOTE, new Object[0]));
        titleBar.n(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 17));
        titleBar.m(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 18));
        int i3 = 1;
        if (!this.n) {
            titleBar.g(true);
        }
        ((WazeTextView) this.q.findViewById(R.id.editPlacePointsCollected)).setText(aVar.c(R.string.POINTS_COLLECTED, new Object[0]));
        int iD = this.f33669l.d();
        View view = this.q;
        if (iD > 1) {
            ((SettingsTitleText) view.findViewById(R.id.editPlaceAddPhotoTitle)).a(aVar.c(R.string.PHOTOS, new Object[0]));
        } else {
            ((SettingsTitleText) view.findViewById(R.id.editPlaceAddPhotoTitle)).a(aVar.c(R.string.PHOTO, new Object[0]));
        }
        bz bzVar = new bz((com.waze.ifs.ui.a) requireActivity(), this.q, new b(this, 10));
        this.f33658a = bzVar;
        bzVar.h(this.f33662e);
        R();
        this.f33658a.i(this.p, new bs(this, 1));
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceNameTitle)).a(aVar.c(R.string.NAME, new Object[0]));
        this.w = O(R.id.editPlaceNamePoints, R.id.editPlaceName, R.string.ADD_NAME, this.m.t(), bc.b(3), new co(be.b(1), this.m.t().isEmpty()));
        this.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceDetailsTitle)).a(aVar.c(R.string.ADDRESS, new Object[0]));
        int iB = bc.b(7);
        PointsView pointsView = (PointsView) this.q.findViewById(R.id.editPlaceDetailsCityStreetPoints);
        this.r = (WazeTextView) this.q.findViewById(R.id.editPlaceDetailsCityStreetMain);
        this.s = (WazeTextView) this.q.findViewById(R.id.editPlaceDetailsCityStreetSub);
        String strZ = this.m.z();
        if (strZ.isEmpty()) {
            strZ = this.m.n();
        }
        this.r.addTextChangedListener(new cq(this, pointsView, iB, this.f33667j, strZ));
        this.r.setHint(aVar.c(R.string.STREET_NAME, new Object[0]));
        this.s.setHint(aVar.c(R.string.CITY, new Object[0]));
        this.q.findViewById(R.id.editPlaceDetailsCityStreetLayout).setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 19));
        EditText editTextO = O(R.id.editPlaceDetailsNumberPoints, R.id.editPlaceDetailsNumber, R.string.EMPTY, this.m.r(), bc.b(6), be.b(3) != null ? new co(be.b(3), true) : null);
        this.t = editTextO;
        editTextO.setHint(aVar.c(R.string.HOUSE_NUMBER, new Object[0]));
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceLocationTitle)).a(aVar.c(R.string.LOCATION, new Object[0]));
        ComposeView composeView = (ComposeView) this.q.findViewById(R.id.editPlaceAddressMapFrame);
        ba baVarP = P();
        com.waze.g.f fVar = new com.waze.g.f(this, 5);
        h.g.b.x.f(composeView, "view");
        h.g.b.x.f(fVar, "onClick");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1226053195, true, new az(baVarP, fVar, i2)));
        if (this.f33669l != null) {
            P().b(this.f33669l.g());
        }
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceCategoriesTitle)).a(aVar.c(R.string.CATEGORIES, new Object[0]));
        v((LinearLayout) this.q.findViewById(R.id.editPlaceCategoriesPlaceholder));
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceServicesTitle)).a(aVar.c(R.string.SERVICES, new Object[0]));
        this.q.findViewById(R.id.editPlaceServices).setOnClickListener(new b(this, 11, (byte[]) null));
        ((WazeTextView) this.q.findViewById(R.id.editPlaceServicesText)).setHint(aVar.c(R.string.TAP_TO_ADD, new Object[0]));
        PointsView pointsView2 = (PointsView) this.q.findViewById(R.id.editPlaceServicesPts);
        int iB2 = bc.b(8);
        String strB = bd.b(this.m);
        WazeTextView wazeTextView = (WazeTextView) this.q.findViewById(R.id.editPlaceServicesText);
        wazeTextView.setText(strB);
        wazeTextView.addTextChangedListener(new cq(this, pointsView2, iB2, null, strB));
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceOpeningHrsTitle)).a(aVar.c(R.string.OPENING_HOURS, new Object[0]));
        this.q.findViewById(R.id.editPlaceOpeningHrs).setOnClickListener(new b(this, 12, (char[]) null));
        ((WazeTextView) this.q.findViewById(R.id.editPlaceOpeningHrsText)).setHint(aVar.c(R.string.TAP_TO_ADD, new Object[0]));
        PointsView pointsView3 = (PointsView) this.q.findViewById(R.id.editPlaceOpeningHrsPts);
        int iB3 = bc.b(9);
        String strU = U(this.m);
        WazeTextView wazeTextView2 = (WazeTextView) this.q.findViewById(R.id.editPlaceOpeningHrsText);
        wazeTextView2.setText(strU);
        wazeTextView2.addTextChangedListener(new cq(this, pointsView3, iB3, null, strU));
        ((SettingsTitleText) this.q.findViewById(R.id.editPlaceMoreDetailsTitle)).a(aVar.c(R.string.DETAILS, new Object[0]));
        int iB4 = bc.b(10);
        PointsView pointsView4 = (PointsView) this.q.findViewById(R.id.editPlaceAboutPoints);
        WazeTextView wazeTextView3 = (WazeTextView) this.q.findViewById(R.id.editPlaceAbout);
        this.o = wazeTextView3;
        wazeTextView3.addTextChangedListener(new cq(this, pointsView4, iB4, new cn(0), this.m.k()));
        this.o.setHint(aVar.c(R.string.ABOUT2, new Object[0]));
        this.o.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 20));
        this.u = O(R.id.editPlacePhonePoints, R.id.editPlacePhone, R.string.PHONE_NUMBER, this.m.u(), bc.b(11), new co(be.b(6), true));
        this.v = O(R.id.editPlaceWebsitePoints, R.id.editPlaceWebSite, R.string.WEBSITE, this.m.C(), bc.b(12), new co(be.b(7), true));
        WazeSettingsView wazeSettingsView = (WazeSettingsView) this.q.findViewById(R.id.editPlaceReport);
        wazeSettingsView.A(aVar.c(R.string.REPORT_A_PROBLEM, new Object[0]));
        wazeSettingsView.setOnClickListener(new com.waze.mywaze.f(this, i3));
        E();
    }

    private static final String U(ed edVar) {
        StringBuilder sb = new StringBuilder();
        Iterator it = edVar.G().iterator();
        while (it.hasNext()) {
            br brVar = new br((OpeningHours) it.next());
            sb.append(brVar.b());
            sb.append(": \u200e");
            sb.append(brVar.c());
            sb.append('\n');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() throws NoSuchMethodException, SecurityException {
        if (this.f33663f) {
            return;
        }
        ScrollView scrollView = (ScrollView) this.q.findViewById(R.id.editPlacePointsScrollRight);
        ScrollView scrollView2 = (ScrollView) this.q.findViewById(R.id.editPlacePointsScrollLeft);
        View viewFindViewById = this.q.findViewById(R.id.editPlacePointsCollectedLayout);
        if (viewFindViewById.getVisibility() != 0 && this.f33660c > 0) {
            viewFindViewById.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            viewFindViewById.setAnimation(alphaAnimation);
        }
        int i2 = this.f33661d;
        int i3 = this.f33660c;
        int i4 = 10;
        if (i2 > i3) {
            this.f33663f = true;
            boolean z = i2 - i3 == 1;
            int i5 = i2 % 10;
            TextView textView = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollAbove);
            TextView textView2 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollBelow);
            TextView textView3 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollCenter);
            StringBuilder sb = new StringBuilder();
            sb.append((i5 + 8) % 10);
            textView.setText(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i5);
            textView2.setText(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append((i5 + 9) % 10);
            textView3.setText(sb3.toString());
            scrollView.scrollTo(0, (int) (this.f33668k * 40.0f));
            int i6 = this.f33661d;
            if (i5 != 0) {
                TextView textView4 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollAbove);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i6 / 10);
                textView4.setText(sb4.toString());
                scrollView2.scrollTo(0, 0);
                S(scrollView, null, true, z);
                return;
            }
            int i7 = i6 / 10;
            int i8 = (i7 + 9) % 10;
            TextView textView5 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollAbove);
            TextView textView6 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollBelow);
            TextView textView7 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollCenter);
            StringBuilder sb5 = new StringBuilder();
            sb5.append((i7 + 8) % 10);
            textView5.setText(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(i7);
            textView6.setText(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(i8);
            textView7.setText(sb7.toString());
            scrollView2.scrollTo(0, (int) (this.f33668k * 40.0f));
            S(scrollView, scrollView2, true, z);
            return;
        }
        int i9 = 9;
        if (i2 >= i3) {
            int i10 = i3 % 10;
            TextView textView8 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollAbove);
            TextView textView9 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollBelow);
            TextView textView10 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollCenter);
            StringBuilder sb8 = new StringBuilder();
            sb8.append((i3 + 9) % 10);
            textView8.setText(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append((i3 + 1) % 10);
            textView9.setText(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(i10);
            textView10.setText(sb10.toString());
            scrollView.scrollTo(0, (int) (this.f33668k * 20.0f));
            scrollView.post(new com.google.firebase.appcheck.debug.a.a(this, scrollView, i4));
            int i11 = this.f33660c;
            int i12 = i11 / 10;
            TextView textView11 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollAbove);
            TextView textView12 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollBelow);
            TextView textView13 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollCenter);
            StringBuilder sb11 = new StringBuilder();
            sb11.append((i11 + 9) % 10);
            textView11.setText(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append((i11 + 1) % 10);
            textView12.setText(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(i12);
            textView13.setText(sb13.toString());
            scrollView2.scrollTo(0, (int) (this.f33668k * 20.0f));
            scrollView2.post(new com.google.firebase.appcheck.debug.a.a(this, scrollView2, i9));
            return;
        }
        this.f33663f = true;
        boolean z2 = i3 - i2 == 1;
        int i13 = i2 % 10;
        TextView textView14 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollAbove);
        TextView textView15 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollBelow);
        TextView textView16 = (TextView) scrollView.findViewById(R.id.editPlacePointsScrollCenter);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(i13);
        textView14.setText(sb14.toString());
        StringBuilder sb15 = new StringBuilder();
        sb15.append((i13 + 2) % 10);
        textView15.setText(sb15.toString());
        StringBuilder sb16 = new StringBuilder();
        sb16.append((i13 + 1) % 10);
        textView16.setText(sb16.toString());
        scrollView.scrollTo(0, 0);
        int i14 = this.f33661d;
        if (i13 != 9) {
            TextView textView17 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollAbove);
            StringBuilder sb17 = new StringBuilder();
            sb17.append(i14 / 10);
            textView17.setText(sb17.toString());
            scrollView2.scrollTo(0, 0);
            S(scrollView, null, false, z2);
            return;
        }
        int i15 = i14 / 10;
        int i16 = (i15 + 1) % 10;
        int i17 = (i15 + 2) % 10;
        TextView textView18 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollAbove);
        TextView textView19 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollBelow);
        TextView textView20 = (TextView) scrollView2.findViewById(R.id.editPlacePointsScrollCenter);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(i15);
        textView18.setText(sb18.toString());
        StringBuilder sb19 = new StringBuilder();
        sb19.append(i17);
        textView19.setText(sb19.toString());
        StringBuilder sb20 = new StringBuilder();
        sb20.append(i16);
        textView20.setText(sb20.toString());
        scrollView2.scrollTo(0, 0);
        S(scrollView, scrollView2, false, z2);
    }

    public static /* synthetic */ void o(ax axVar) {
        com.waze.ui.x.u.j(axVar.getActivity(), axVar.q);
        ((EditPlaceFlowActivity) axVar.requireActivity()).A();
    }

    public final void A(ed edVar) {
        this.f33669l = edVar;
        if (this.q == null) {
            this.n = true;
            return;
        }
        if (this.r == null || this.s == null) {
            return;
        }
        if (TextUtils.isEmpty(edVar.z())) {
            this.r.setText(this.f33669l.n());
            this.s.setVisibility(8);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f33669l.n());
            WazeTextView wazeTextView = this.r;
            if (zIsEmpty) {
                wazeTextView.setText(this.f33669l.z());
                this.s.setVisibility(8);
            } else {
                wazeTextView.setText(this.f33669l.z());
                this.s.setText(this.f33669l.n());
                this.s.setVisibility(0);
            }
        }
        t();
    }

    public final void B(ed edVar) throws NoSuchMethodException, SecurityException {
        this.f33669l = edVar;
        View view = this.q;
        if (view == null) {
            this.n = true;
        } else {
            v((LinearLayout) view.findViewById(R.id.editPlaceCategoriesPlaceholder));
            t();
        }
    }

    public final void C(ed edVar) throws NoSuchMethodException, SecurityException {
        this.f33669l = edVar;
        P().b(edVar.g());
        if (this.f33669l.f33905a) {
            F(bc.b(2));
            E();
            t();
        }
    }

    public final void D(ed edVar) {
        this.f33669l = edVar;
        this.f33662e = false;
        R();
        bz bzVar = this.f33658a;
        if (bzVar != null) {
            bzVar.h(this.f33662e);
            this.f33658a.j(this.p);
        }
    }

    final void E() throws NoSuchMethodException, SecurityException {
        if (this.q == null) {
            return;
        }
        V();
    }

    public final void F(int i2) {
        if (this.B) {
            return;
        }
        this.f33660c += i2;
    }

    protected final View N(LinearLayout linearLayout, String str, String str2, boolean z) throws NoSuchMethodException, SecurityException {
        if (linearLayout.getChildCount() > 0) {
            com.waze.bm.a.a.ad.d(linearLayout);
        }
        View viewInflate = requireActivity().getLayoutInflater().inflate(R.layout.two_line_clearable, (ViewGroup) linearLayout, false);
        ((WazeTextView) viewInflate.findViewById(R.id.twoLineClearableLine1)).setText(str2);
        ((WazeTextView) viewInflate.findViewById(R.id.twoLineClearableLine2)).setVisibility(8);
        char c2 = 1;
        if (z) {
            viewInflate.findViewById(R.id.twoLineClearableClear).setOnClickListener(new com.waze.sdk.i(this, str, linearLayout, c2 == true ? 1 : 0));
        } else {
            viewInflate.findViewById(R.id.twoLineClearableClear).setVisibility(8);
            PointsView pointsView = (PointsView) viewInflate.findViewById(R.id.twoLineClearablePoints);
            this.y = pointsView;
            pointsView.setVisibility(0);
            boolean z2 = this.f33669l.c() > 0;
            this.y.c(z2);
            int iB = bc.b(4);
            this.y.b(iB, this.m.c() > 0);
            this.y.f(this.f33664g && z2, false);
            if (this.f33665h) {
                F(-iB);
            }
            if (this.f33664g) {
                F(iB);
                t();
            }
            this.f33665h = this.f33664g;
            E();
        }
        linearLayout.addView(viewInflate);
        viewInflate.getLayoutParams().height = requireActivity().getResources().getDimensionPixelSize(R.dimen.settingsItemHeight);
        return viewInflate;
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.A.getValue();
    }

    @Override // org.a.a.b.a
    public final void m() {
    }

    @Override // android.support.v4.app.ar, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws NoSuchMethodException, SecurityException {
        super.onConfigurationChanged(configuration);
        T();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        getChildFragmentManager().aC(new org.a.b.a.a.a((org.a.d.k.b) this.A.getValue()));
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.f33659b = NativeManager.getInstance();
        if (bundle != null) {
            this.f33669l = (ed) bundle.getParcelable(String.valueOf(ax.class.getName()).concat(".mVenue"));
            this.m = (ed) bundle.getParcelable(String.valueOf(ax.class.getName()).concat(".mOrigVenue"));
            this.x = bundle.getInt(String.valueOf(ax.class.getName()).concat(".mScrollY"));
            this.f33662e = bundle.getBoolean(String.valueOf(ax.class.getName()).concat(".mIsUploading"));
            this.n = bundle.getBoolean(String.valueOf(ax.class.getName()).concat(".mDidEdit"));
        }
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f33668k = getResources().getDisplayMetrics().density;
        this.q = layoutInflater.inflate(R.layout.edit_place, viewGroup, false);
        this.f33666i.clear();
        this.f33660c = 0;
        this.f33665h = false;
        T();
        this.B = true;
        this.t.setText(this.f33669l.r());
        this.w.setText(this.f33669l.t());
        this.u.setText(this.f33669l.u());
        this.v.setText(this.f33669l.C());
        this.B = false;
        F((this.f33669l.e() + (this.f33662e ? 1 : 0)) * bc.b(1));
        if (this.f33669l.f33905a) {
            F(bc.b(2));
        }
        int i2 = 8;
        if (this.f33660c == 0) {
            this.q.findViewById(R.id.editPlacePointsCollectedLayout).setVisibility(8);
        }
        E();
        if (this.x > 0) {
            ScrollView scrollView = (ScrollView) this.q.findViewById(R.id.theScrollView);
            scrollView.post(new com.google.firebase.appcheck.debug.a.a(this, scrollView, i2));
        }
        return this.q;
    }

    @Override // android.support.v4.app.ar
    public final void onPause() {
        this.x = ((ScrollView) this.q.findViewById(R.id.theScrollView)).getScrollY();
        super.onPause();
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        this.B = true;
        if (TextUtils.isEmpty(this.f33669l.z())) {
            this.r.setText(this.f33669l.n());
            this.s.setVisibility(8);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f33669l.n());
            WazeTextView wazeTextView = this.r;
            if (zIsEmpty) {
                wazeTextView.setText(this.f33669l.z());
                this.s.setVisibility(8);
            } else {
                wazeTextView.setText(this.f33669l.z());
                this.s.setText(this.f33669l.n());
                this.s.setVisibility(0);
            }
        }
        PointsView pointsView = (PointsView) this.q.findViewById(R.id.editPlaceDetailsNumberPoints);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f33669l.z());
        EditText editText = this.t;
        if (zIsEmpty2) {
            editText.setText("");
            this.t.setEnabled(false);
            this.t.setAlpha(0.5f);
            pointsView.setAlpha(0.5f);
        } else {
            editText.setEnabled(true);
            this.t.setAlpha(1.0f);
            pointsView.setAlpha(1.0f);
        }
        this.o.setText(this.f33669l.k());
        ((WazeTextView) this.q.findViewById(R.id.editPlaceServicesText)).setText(bd.b(this.f33669l));
        ((WazeTextView) this.q.findViewById(R.id.editPlaceOpeningHrsText)).setText(U(this.f33669l));
        this.B = false;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        bundle.putParcelable(String.valueOf(ax.class.getName()).concat(".mVenue"), this.f33669l);
        bundle.putParcelable(String.valueOf(ax.class.getName()).concat(".mOrigVenue"), this.m);
        bundle.putInt(String.valueOf(ax.class.getName()).concat(".mScrollY"), this.x);
        bundle.putBoolean(String.valueOf(ax.class.getName()).concat(".mIsUploading"), this.f33662e);
        bundle.putBoolean(String.valueOf(ax.class.getName()).concat(".mDidEdit"), this.n);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.shared_infra.g.e.d(view.findViewById(R.id.editPlaceContainer), (ScrollView) view.findViewById(R.id.theScrollView));
    }

    public final void s(PointsView pointsView) {
        this.f33666i.add(pointsView);
    }

    public final void t() {
        if (this.n) {
            return;
        }
        this.n = true;
        ((TitleBar) this.q.findViewById(R.id.theTitleBar)).g(false);
    }

    public final void u(ed edVar) throws NoSuchMethodException, SecurityException {
        this.f33669l = edVar;
        this.f33662e = true;
        R();
        if (this.q == null) {
            this.n = true;
            return;
        }
        this.f33658a.h(this.f33662e);
        this.f33658a.j(this.p);
        F(bc.b(1));
        E();
        t();
    }

    public final void v(LinearLayout linearLayout) throws NoSuchMethodException, SecurityException {
        linearLayout.removeAllViews();
        this.f33664g = this.f33669l.c() != this.m.c();
        boolean zEquals = false;
        for (int i2 = 0; i2 < this.f33669l.c(); i2++) {
            String str = (String) this.f33669l.E().get(i2);
            if (!this.f33664g && !str.contentEquals((CharSequence) this.m.E().get(i2))) {
                this.f33664g = true;
            }
            zEquals |= str.equals("PARKING_LOT");
            N(linearLayout, str, ar.a(str), true).setPadding(0, 0, 0, 0);
        }
        if (zEquals) {
            com.waze.bm.a.a.ad.d(linearLayout);
            this.q.findViewById(R.id.editPlaceCategoryCommentLayout).setVisibility(0);
            ((TextView) this.q.findViewById(R.id.editPlaceCategoryComment)).setText(this.z.c(R.string.PLACE_PARKING_CATEGORY_FOOTER, new Object[0]));
        } else {
            View viewN = N(linearLayout, null, this.z.c(R.string.TAP_TO_ADD_CATEGORIES, new Object[0]), false);
            viewN.setPadding(0, 0, 0, 0);
            viewN.setOnClickListener(new b(this, 13, (short[]) null));
            this.q.findViewById(R.id.editPlaceCategoryCommentLayout).setVisibility(8);
        }
    }

    public final void w(ed edVar) {
        this.f33669l = edVar;
        View view = this.q;
        if (view == null) {
            this.n = true;
        } else {
            ((WazeTextView) view.findViewById(R.id.editPlaceOpeningHrsText)).setText(U(edVar));
            t();
        }
    }

    public final void x(ed edVar) {
        this.f33669l = edVar;
        View view = this.q;
        if (view == null) {
            this.n = true;
        } else {
            ((WazeTextView) view.findViewById(R.id.editPlaceServicesText)).setText(bd.b(edVar));
            t();
        }
    }

    public final void y(ed edVar) {
        this.f33669l = edVar;
        this.m = edVar.clone();
    }

    public final void z(ed edVar) {
        this.f33669l = edVar;
        WazeTextView wazeTextView = this.o;
        if (wazeTextView != null) {
            wazeTextView.setText(edVar.k());
        }
    }
}
