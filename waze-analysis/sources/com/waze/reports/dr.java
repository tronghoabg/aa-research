package com.waze.reports;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.work.WorkRequest;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.gp;
import com.waze.lm;
import com.waze.sharedui.utils.RequestPermissionActivity;
import com.waze.view.button.ReportMenuButton;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dr extends android.support.v4.app.ar {

    /* renamed from: c, reason: collision with root package name */
    private NativeManager f33863c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f33864d;

    /* renamed from: e, reason: collision with root package name */
    private di f33865e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33866f;

    /* renamed from: g, reason: collision with root package name */
    private Context f33867g;
    private View m;
    private TextView n;
    private TextView o;
    private View p;
    private RelativeLayout q;
    private boolean r;
    private View s;
    private View t;
    private com.waze.view.b.d u;
    private dp w;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f33861a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f33862b = false;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f33868h = new ArrayList(20);

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f33869i = new ArrayList(20);

    /* renamed from: j, reason: collision with root package name */
    private int f33870j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f33871k = 0;

    /* renamed from: l, reason: collision with root package name */
    private ReportMenuButton f33872l = null;
    private final com.waze.shared_infra.o.a v = com.waze.shared_infra.o.b.a();

    public static /* synthetic */ void B(dr drVar) {
        if (com.waze.ui.x.u.n()) {
            com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34565c, new com.waze.reports_v2.c.ck(com.waze.reports_v2.b.ad.f34023g));
            if (!drVar.f33863c.hasNetworkNTV()) {
                com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("ReportMenu", new gp(drVar, 17)));
                return;
            }
            Location lastLocation = com.waze.location.z.a().getLastLocation();
            if (lastLocation == null || System.currentTimeMillis() - lastLocation.getTime() > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("ReportMenu", new gp(drVar, 15)));
                return;
            }
            com.waze.sharedui.utils.h hVar = new com.waze.sharedui.utils.h();
            Intent intent = new Intent(drVar.f33867g, (Class<?>) RequestPermissionActivity.class);
            intent.putExtra("needed_permissions", new String[]{"android.permission.CAMERA"});
            intent.putExtra("on_granted", hVar);
            if (lm.d().c() != null) {
                com.waze.shared_infra.i.h.k("ReportMenu", "initLayout: Requesting permission CAMERA");
                lm.d().c().startActivityForResult(intent, 0);
            }
        }
    }

    public static /* synthetic */ void C(dr drVar) {
        com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34565c, new com.waze.reports_v2.c.ck(com.waze.reports_v2.b.ad.f34018b));
        drVar.H(drVar.E());
    }

    private final Context E() {
        if (this.f33867g == null) {
            this.f33867g = getActivity();
        }
        if (this.f33867g == null) {
            this.f33867g = lm.d().e();
        }
        return this.f33867g;
    }

    private final void F(ReportMenuButton reportMenuButton) {
        View view;
        if (this.f33865e == null || (view = this.s) == null) {
            return;
        }
        ((ViewGroup) view.findViewById(R.id.reportMenuViewReport)).addView(this.f33865e, new RelativeLayout.LayoutParams(-1, -1));
        this.f33872l = reportMenuButton;
        if (reportMenuButton != null) {
            reportMenuButton.h();
        }
        ArrayList arrayList = this.f33868h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReportMenuButton reportMenuButton2 = (ReportMenuButton) arrayList.get(i2);
            reportMenuButton2.setEnabled(false);
            reportMenuButton2.setClickable(false);
            if (reportMenuButton2 != this.f33872l) {
                reportMenuButton2.d();
            }
        }
        ArrayList arrayList2 = this.f33869i;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            TextView textView = (TextView) arrayList2.get(i3);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(0L);
            alphaAnimation.setFillAfter(true);
            textView.startAnimation(alphaAnimation);
        }
        this.f33865e.K();
        this.f33861a = true;
    }

    private final void G(LayoutInflater layoutInflater) {
        View viewInflate;
        boolean z;
        this.t = this.s.findViewById(R.id.reportMenuDrawableBg);
        com.waze.view.b.d dVar = new com.waze.view.b.d(ContextCompat.getColor(this.f33867g, R.color.background_default));
        this.u = dVar;
        this.t.setBackground(dVar);
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.reportMenuViewMenu);
        viewGroup.removeAllViews();
        int i2 = 1;
        this.r = this.f33867g.getResources().getConfiguration().orientation == 1;
        int iG = com.waze.ui.z.as.g(this.f33867g, 100);
        int iG2 = com.waze.ui.z.as.g(this.f33867g, 118);
        int identifier = this.f33867g.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int iG3 = -(identifier > 0 ? this.f33867g.getResources().getDimensionPixelSize(identifier) : 0);
        int i3 = 2;
        if (this.r) {
            viewInflate = layoutInflater.inflate(R.layout.report_menu_portrait, viewGroup);
            int i4 = 0 / iG;
            com.waze.shared_infra.i.h.d("ReportMenu", "initLayout: num lines = 0; setting to 1");
            com.waze.shared_infra.i.h.b("ReportMenu", "initLayout: container width = 0, button width = " + iG + ", numLines = 1");
            this.f33870j = 0;
            this.f33871k = iG2;
            if (iG3 > iG2 * 16) {
                this.f33871k = iG3 / 16;
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.report_menu_landscape, viewGroup);
            if (!this.v.c(R.string.REPORT_MENU_TITLE, new Object[0]).isEmpty()) {
                iG3 -= com.waze.ui.z.as.g(this.f33867g, 48);
            }
            int i5 = iG3 / iG2;
            if (i5 > 2) {
                i5--;
                z = true;
            } else {
                z = false;
            }
            int i6 = iG3 - (i5 * iG2);
            while (i5 > 1 && i6 < com.waze.ui.z.as.g(this.f33867g, 13)) {
                i5--;
                i6 = iG3 - (i5 * iG2);
            }
            if (i5 <= 0) {
                com.waze.shared_infra.i.h.d("ReportMenu", "initLayout: num lines = 0; setting to 1");
                i5 = 1;
            }
            com.waze.shared_infra.i.h.b("ReportMenu", "initLayout: container height = " + iG3 + ", button height = " + iG2 + ", numLines = " + i5);
            int i7 = i6 / ((true != z ? 2 : 1) + i5);
            this.f33871k = (iG3 - (i7 + i7)) / i5;
            this.f33870j = iG;
            int i8 = 16 / i5;
            if (iG * i8 < 0) {
                int i9 = 0 / i8;
                this.f33870j = 0;
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.reportButtonsContainer);
        this.q = relativeLayout;
        relativeLayout.removeAllViews();
        this.q.setOnClickListener(new com.waze.mywaze.f(this, 18));
        View viewFindViewById = viewInflate.findViewById(R.id.reportMenuCloseButton);
        this.m = viewFindViewById;
        viewFindViewById.setOnClickListener(new com.waze.mywaze.f(this, 19));
        this.p = viewInflate.findViewById(R.id.reportMenuScrollView);
        if (this.f33867g.getResources().getConfiguration().orientation == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.addRule(1, 0);
            layoutParams.addRule(13);
            RelativeLayout relativeLayout2 = this.q;
            relativeLayout2.setPadding(0, relativeLayout2.getPaddingTop(), this.q.getPaddingRight(), this.q.getPaddingBottom());
            this.p.setLayoutParams(layoutParams);
        }
        this.f33868h.clear();
        this.f33869i.clear();
        dq dqVar = new dq(this, this.q);
        if (this.f33863c.isGasUpdateable()) {
            com.waze.shared_infra.o.a aVar = this.v;
            dqVar.a(aVar.c(R.string.GAS_REPORT_MENU_ITEM, new Object[0]), R.drawable.icon_report_gas, -9719662, new com.waze.mywaze.f(aVar, 17));
        }
        com.waze.shared_infra.o.a aVar2 = this.v;
        dqVar.a(aVar2.c(R.string.MAP_CHAT_REPORT_MENU_ITEM, new Object[0]), R.drawable.icon_report_chitchat, -4598636, new com.waze.mywaze.f(this, 20));
        dqVar.a(aVar2.c(R.string.MAP_ISSUE_REPORT_MENU_ITEM, new Object[0]), R.drawable.icon_report_map_editor, -1052689, new com.waze.navigate.ai(this, i2));
        dqVar.a(aVar2.c(R.string.VENUE_REPORT_MENU_ITEM, new Object[0]), R.drawable.icon_report_places, -4152624, new com.waze.navigate.ai(this, i3));
        if (ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_SOS_FEATURE_ENABLED)) {
            dqVar.a(aVar2.c(R.string.SOS_REPORT_MENU_ITEM, new Object[0]), R.drawable.icon_report_assistance, -44976, new com.waze.navigate.ai(this, 3));
        }
        dqVar.a(aVar2.c(R.string.CLOSURE_REPORT_MENU_ITEM, new Object[0]), R.drawable.icon_report_closure, -28305, new com.waze.navigate.ai(this, 4));
        this.n = (TextView) viewInflate.findViewById(R.id.reportMenuTitle);
        String strC = aVar2.c(R.string.REPORT_MENU_TITLE, new Object[0]);
        boolean zIsEmpty = strC.isEmpty();
        TextView textView = this.n;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(strC);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.reportMenuFooter);
        this.o = textView2;
        textView2.setText(aVar2.c(R.string.REPORT_MENU_FOOTER, new Object[0]));
    }

    private final void H(Context context) {
        ReportMenuButton reportMenuButton;
        du duVar = new du(context, this);
        this.f33865e = duVar;
        ArrayList arrayList = this.f33868h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                reportMenuButton = null;
                break;
            }
            reportMenuButton = (ReportMenuButton) arrayList.get(i2);
            i2++;
            if (reportMenuButton.b() == R.drawable.icon_report_assistance) {
                break;
            }
        }
        if (reportMenuButton == null) {
            reportMenuButton = new ReportMenuButton(context);
            reportMenuButton.setBackgroundColor(-44976);
            reportMenuButton.f(R.drawable.icon_report_assistance);
        }
        F(reportMenuButton);
        duVar.I(R.drawable.icon_report_assistance, -44976);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i i(dr drVar, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = drVar.v;
        oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
        oVar.P(aVar.c(R.string.SORRY__THERESS_NO_GPS_RECEPTION_IN_THIS_LOCATION__MAKE_SURE_YOU_ARE_OUTDOORS, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i j(dr drVar, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = drVar.v;
        oVar.Q(aVar.c(R.string.OFFLINE_REPORT_PLACE_TITLE, new Object[0]));
        oVar.P(aVar.c(R.string.OFFLINE_REPORT_PLACE_BODY, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ void q(dr drVar, View view) {
        com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34565c, new com.waze.reports_v2.c.ck(com.waze.reports_v2.b.q.f34117g));
        drVar.f33865e = new bp(drVar.E(), drVar);
        drVar.F((ReportMenuButton) view);
    }

    public static /* synthetic */ void r(dr drVar, View view) {
        com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34565c, new com.waze.reports_v2.c.ck(com.waze.reports_v2.b.ad.f34020d));
        drVar.f33865e = new k(drVar.E(), drVar);
        drVar.F((ReportMenuButton) view);
    }

    public static /* synthetic */ void s(dr drVar, View view) {
        com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34565c, new com.waze.reports_v2.c.ck(com.waze.reports_v2.b.ad.f34021e));
        if (drVar.f33866f) {
            drVar.f33863c.randomUserMsg();
        } else {
            drVar.f33865e = new g(drVar.E(), drVar);
            drVar.F((ReportMenuButton) view);
        }
    }

    public final void A() {
        H(E());
    }

    public final void D() {
        if (this.w != null) {
            di diVar = this.f33865e;
            if (diVar != null) {
                diVar.L();
            }
            this.f33862b = false;
            this.f33863c.restorePoiFocus();
            this.w.a();
        }
    }

    public final di l() {
        return this.f33865e;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33866f = arguments.getBoolean("isRandomUser");
        }
        this.f33867g = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.report_menu, viewGroup, false);
        this.s = viewInflate;
        this.f33864d = (ViewGroup) viewInflate.findViewById(R.id.reportMainLayout);
        this.f33863c = NativeManager.getInstance();
        G(layoutInflater);
        return this.s;
    }

    public final void t() {
        G((LayoutInflater) this.f33867g.getSystemService("layout_inflater"));
    }

    public final void u(boolean z) {
        if (this.f33864d == null) {
            com.waze.shared_infra.i.h.d("ReportMenu", "open: mainLayout is null");
            return;
        }
        if (this.m == null) {
            com.waze.shared_infra.i.h.d("ReportMenu", "open: closeButton is null");
            return;
        }
        this.f33862b = true;
        this.f33864d.clearAnimation();
        this.m.setAlpha(0.0f);
        this.t.setAlpha(1.0f);
        this.s.getViewTreeObserver().addOnGlobalLayoutListener(new Cdo(this, z));
    }

    final void v(ReportMenuButton reportMenuButton) {
        dp dpVar = this.w;
        if (dpVar != null) {
            dpVar.b(reportMenuButton);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new dn(this));
        this.f33864d.startAnimation(alphaAnimation);
    }

    public final void w(dp dpVar) {
        this.w = dpVar;
    }

    public final void x() {
        ReportMenuButton reportMenuButton;
        Context contextE = E();
        if (contextE == null) {
            return;
        }
        k kVar = new k(contextE, this);
        this.f33865e = kVar;
        ArrayList arrayList = this.f33868h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                reportMenuButton = null;
                break;
            }
            reportMenuButton = (ReportMenuButton) arrayList.get(i2);
            i2++;
            if (reportMenuButton.b() == R.drawable.icon_report_closure) {
                break;
            }
        }
        F(reportMenuButton);
        if (reportMenuButton == null) {
            com.waze.shared_infra.i.h.k("ReportMenu", "showClosureReport: Failed to find icon_report_closure in clip views");
            return;
        }
        this.f33872l = reportMenuButton;
        kVar.I(reportMenuButton.b(), this.f33872l.a());
        this.f33872l.setVisibility(4);
    }

    public final void y() {
        ReportMenuButton reportMenuButton;
        Context contextE = E();
        if (contextE == null) {
            return;
        }
        g gVar = new g(contextE, this);
        this.f33865e = gVar;
        ArrayList arrayList = this.f33868h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                reportMenuButton = null;
                break;
            }
            reportMenuButton = (ReportMenuButton) arrayList.get(i2);
            i2++;
            if (reportMenuButton.b() == R.drawable.icon_report_chitchat) {
                break;
            }
        }
        F(reportMenuButton);
        if (reportMenuButton == null) {
            com.waze.shared_infra.i.h.k("ReportMenu", "Failed to find icon_report_chitchat in clip views");
            return;
        }
        this.f33872l = reportMenuButton;
        gVar.I(reportMenuButton.b(), this.f33872l.a());
        this.f33872l.setVisibility(4);
    }

    public final void z() {
        ReportMenuButton reportMenuButton;
        Context contextE = E();
        if (contextE == null) {
            return;
        }
        bp bpVar = new bp(contextE, this);
        this.f33865e = bpVar;
        ArrayList arrayList = this.f33868h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                reportMenuButton = null;
                break;
            }
            reportMenuButton = (ReportMenuButton) arrayList.get(i2);
            i2++;
            if (reportMenuButton.b() == R.drawable.icon_report_map_editor) {
                break;
            }
        }
        F(reportMenuButton);
        if (reportMenuButton == null) {
            com.waze.shared_infra.i.h.k("ReportMenu", "setRoadRecording: Failed to find icon_report_map_editor in clip views");
            return;
        }
        this.f33872l = reportMenuButton;
        bpVar.I(reportMenuButton.b(), this.f33872l.a());
        this.f33872l.setVisibility(4);
    }
}
