package com.waze.main_screen.bottom_bars.scrollable_eta;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.internal.bc;
import com.google.android.material.textfield.ao;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.kq;
import com.waze.lm;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.NavResultData;
import com.waze.reports.cs;
import com.waze.sdk.bd;
import com.waze.share.aa;
import com.waze.share.z;
import com.waze.sharedui.g.t;
import com.waze.sharedui.views.CirclePulseFrame;
import com.waze.sharedui.views.OvalButton;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private static d f25948a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f25949b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f25950c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f25951d;

    /* renamed from: e, reason: collision with root package name */
    private final CirclePulseFrame f25952e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f25953f;

    /* renamed from: g, reason: collision with root package name */
    private final OvalButton f25954g;

    /* renamed from: h, reason: collision with root package name */
    private final OvalButton f25955h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f25956i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f25957j;

    /* renamed from: k, reason: collision with root package name */
    private final ComposeView f25958k;

    /* renamed from: l, reason: collision with root package name */
    private s f25959l;
    private NavResultData m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final com.waze.shared_infra.o.a t;
    private final q u;
    private final View v;
    private boolean w;
    private com.waze.sharedui.views.p x;

    public d(Context context) throws Resources.NotFoundException {
        super(context, null, 0);
        this.u = (q) com.waze.web.r.h(q.class);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.eta_control_panel_layout, (ViewGroup) this, false);
        this.v = viewInflate;
        this.t = com.waze.design_components.g.b.d(this);
        this.f25949b = (ViewGroup) viewInflate.findViewById(R.id.mainContainer);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.btnSendEta);
        this.f25950c = viewGroup;
        this.f25951d = (TextView) viewInflate.findViewById(R.id.lblSendEta);
        this.f25953f = (ImageView) viewInflate.findViewById(R.id.imgSendEta);
        CirclePulseFrame circlePulseFrame = (CirclePulseFrame) viewInflate.findViewById(R.id.sharePulseFrame);
        this.f25952e = circlePulseFrame;
        OvalButton ovalButton = (OvalButton) viewInflate.findViewById(R.id.btnStopNav);
        this.f25954g = ovalButton;
        OvalButton ovalButton2 = (OvalButton) viewInflate.findViewById(R.id.btnGo);
        this.f25955h = ovalButton2;
        this.f25956i = (TextView) viewInflate.findViewById(R.id.lblStopNav);
        this.f25957j = (TextView) viewInflate.findViewById(R.id.lblGo);
        this.f25958k = (ComposeView) viewInflate.findViewById(R.id.shareDriveButtonCompose);
        circlePulseFrame.c(ContextCompat.getColor(getContext(), R.color.report_chat));
        ovalButton2.setOnClickListener(new com.waze.feedback.b(this, 3));
        ovalButton2.F();
        ovalButton2.setContentDescription(com.waze.ui.r.a.d.c.bu.name());
        ovalButton2.J(new com.google.firebase.messaging.l(this));
        ovalButton.setOnClickListener(new com.waze.feedback.b(this, 4));
        viewGroup.setOnClickListener(new com.waze.feedback.b(this, 5));
        addView(viewInflate);
        e();
        d dVar = f25948a;
        if (dVar != null) {
            this.p = dVar.p;
            this.o = dVar.o;
            this.n = dVar.n;
            this.q = dVar.q;
            o();
            f(f25948a.m);
            com.waze.sharedui.views.p pVar = f25948a.x;
        }
        f25948a = this;
    }

    public static /* synthetic */ ab a(d dVar) {
        s sVar = dVar.f25959l;
        if (sVar != null) {
            sVar.d();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab b(d dVar) {
        s sVar = dVar.f25959l;
        if (sVar != null) {
            sVar.b();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.f25952e.a();
        dVar.n();
    }

    public static /* synthetic */ void d(d dVar) {
        dVar.u.b(l.f25984d);
        dVar.q();
    }

    public static /* synthetic */ void k(d dVar) {
        dVar.u.b(l.f25988h);
        dVar.f25959l.h();
        dVar.f25959l.j();
    }

    public static /* synthetic */ void l(d dVar) {
        AddressItem addressItem;
        NavResultData navResultData = dVar.m;
        String venueId = null;
        if (navResultData != null && (addressItem = navResultData.destination) != null && !addressItem.getVenueId().isEmpty()) {
            venueId = dVar.m.destination.getVenueId();
        }
        dVar.u.c(l.f25982b, false, null, venueId, null, null);
        dVar.q();
    }

    public static /* synthetic */ void m(d dVar) {
        if (dVar.o) {
            return;
        }
        dVar.p();
        dVar.u.c(l.f25986f, false, false, null, null, null);
        if (!NativeManager.getInstance().isFollowActiveNTV()) {
            aa.e(lm.d().c(), z.f37754a, ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getCurrentNavigatingAddressItem());
            return;
        }
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            com.waze.shared_infra.o.a aVar = dVar.t;
            t tVar = new t(eVarE, com.waze.sharedui.g.f.COLUMN_TEXT, aVar.c(R.string.NAVIGATION_RESULT_SHAREING_OPTIONS_TITLE, new Object[0]), new com.waze.sharedui.g.s[]{new com.waze.sharedui.g.s(1, aVar.c(R.string.NAVIGATION_RESULT_SHAREING_OPTIONS_MORE, new Object[0]), null), new com.waze.sharedui.g.s(0, aVar.c(R.string.NAVIGATION_RESULT_SHAREING_OPTIONS_STOP, new Object[0]), null)}, null);
            tVar.l(new kq(2));
            tVar.q(new cs(tVar, 1));
            tVar.show();
        }
    }

    private final void n() {
        boolean z = false;
        if (NativeManager.isAppStarted() && NativeManager.getInstance().isFollowActiveNTV()) {
            z = true;
        }
        CirclePulseFrame circlePulseFrame = this.f25952e;
        circlePulseFrame.b(z);
        if (z) {
            circlePulseFrame.d((int) (this.f25953f.getMeasuredHeight() * 0.41f));
        }
    }

    private final void o() {
        boolean z = !this.o;
        OvalButton ovalButton = this.f25955h;
        ovalButton.setEnabled(z);
        this.f25950c.setAlpha(true != this.o ? 1.0f : 0.5f);
        int color = ContextCompat.getColor(getContext(), R.color.alarming);
        OvalButton ovalButton2 = this.f25954g;
        ovalButton2.bz(color);
        ovalButton2.g(ContextCompat.getColor(getContext(), R.color.alarming));
        ovalButton2.v(ContextCompat.getColor(getContext(), R.color.alarming_variant));
        if (NativeManager.isAppStarted()) {
            this.f25957j.setText(this.t.c(true != this.p ? R.string.ETA_SCREEN_GO_NOW : R.string.ETA_SCREEN_RESUME, new Object[0]));
        }
        ovalButton.bz(ContextCompat.getColor(getContext(), R.color.primary));
        ovalButton.g(ContextCompat.getColor(getContext(), R.color.primary));
        ovalButton.v(ContextCompat.getColor(getContext(), R.color.primary_variant));
        r();
    }

    private final void p() {
        if (this.w) {
            this.w = false;
            this.f25955h.A();
        }
    }

    private final void q() {
        Context context = getContext();
        int i2 = lm.f25154a;
        Activity activityS = com.waze.shared_infra.i.h.s(context);
        if (activityS != null && activityS.isFinishing()) {
            com.waze.shared_infra.i.h.j("EtaControlPanelView onGoTap - activity is being destroyed");
            return;
        }
        this.f25959l.j();
        p();
        if (this.f25959l.k() || this.o) {
            return;
        }
        if (!ConfigValues.CONFIG_VALUE_DIALOGS_SAFETY_DIALOG_SHOWN.b().booleanValue()) {
            com.waze.shared_infra.o.a aVar = this.t;
            com.waze.design_components.d.c(getContext(), new com.waze.design_components.c.j(aVar.c(R.string.SAFETY_DIALOG_TITLE, new Object[0]), new com.waze.design_components.cta_bar.b(aVar.c(R.string.SAFETY_DIALOG_OK_BUTTTON, new Object[0]), true, com.waze.design_components.button.g.f23359b, 1.0f, com.waze.design_components.b.d.f23300a, com.waze.design_components.b.e.f23312a, new com.waze.ab.z(11)), new com.waze.location.aa(8), aVar.c(R.string.SAFETY_DIALOG_MESSAGE, new Object[0]), false, new com.waze.design_components.c.c(new com.waze.design_components.b.a(R.drawable.safety_dialog_image), com.waze.design_components.c.d.f23384a)));
        }
        NativeManager.Post(new bc(12));
    }

    private final void r() {
        this.f25951d.setText(this.t.c(true != NativeManager.getInstance().isFollowActiveNTV() ? R.string.SEND_LOCATION_TITLE_ETA : R.string.NAVIGATION_RESULT_DRIVE_SHARED, new Object[0]));
    }

    public final void e() throws Resources.NotFoundException {
        boolean z = false;
        if (NativeManager.isAppStarted() && NativeManager.getInstance().isFollowActiveNTV()) {
            z = true;
        }
        int color = ContextCompat.getColor(getContext(), R.color.content_p3);
        com.waze.shared_infra.i.h.z(this.f25950c, ContextCompat.getDrawable(getContext(), R.drawable.eta_bar_bg), ContextCompat.getColor(getContext(), R.color.brand_waze));
        this.f25949b.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        this.f25951d.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p2));
        int color2 = ContextCompat.getColor(getContext(), R.color.on_primary);
        this.f25957j.setTextColor(color2);
        this.f25956i.setTextColor(color2);
        if (z) {
            color = getResources().getColor(R.color.always_white);
        }
        ImageView imageView = this.f25953f;
        com.waze.utils.o.b(imageView, color);
        imageView.setImageResource(true != z ? R.drawable.sharedrive_eta_icon : R.drawable.eta_link_icon_large);
        imageView.setAlpha(1.0f);
        n();
    }

    public final void f(NavResultData navResultData) {
        this.m = navResultData;
        o();
    }

    public final void g() {
        if (this.o) {
            return;
        }
        com.waze.shared_infra.i.h.a("EtaControlPanelView start calculation state");
        p();
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = true;
        this.m = null;
        this.f25955h.bz(ContextCompat.getColor(getContext(), R.color.primary));
        o();
    }

    public final void h() {
        this.f25956i.setText(this.t.c(R.string.STOP, new Object[0]));
        r();
    }

    public final void i(s sVar) {
        this.f25959l = sVar;
    }

    public final void j(com.waze.main_screen.p.a.b.b.s sVar, boolean z) throws Resources.NotFoundException {
        NavResultData navResultData;
        if (z != this.s) {
            this.s = z;
            if (z) {
                o();
                post(new ao(this, 19));
            } else {
                p();
                if (!this.o) {
                    this.p = true;
                }
            }
        }
        NavResultData navResultData2 = sVar.f26989a;
        if (navResultData2 == null || sVar.f26990b) {
            g();
        } else {
            f(navResultData2);
            boolean z2 = this.r;
            boolean z3 = sVar.f26991c;
            if (z2 != z3) {
                this.r = z3;
                e();
                h();
            }
            if (this.o) {
                com.waze.shared_infra.i.h.a("EtaControlPanelView calculation completed");
                this.o = false;
                if (!this.p) {
                    bd.d();
                    if (!bd.R() && !this.w && !this.n && this.q && (navResultData = this.m) != null && this.s) {
                        this.q = false;
                        this.n = true;
                        this.w = true;
                        this.f25955h.z(navResultData.iTimeOut);
                    }
                }
                o();
            } else {
                o();
            }
        }
        com.waze.sharedrive.e.n nVar = sVar.f26993e;
        ViewGroup viewGroup = this.f25950c;
        if (nVar == null) {
            viewGroup.setVisibility(0);
            this.f25958k.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(8);
        ComposeView composeView = this.f25958k;
        composeView.setVisibility(0);
        com.waze.beacons.a.a aVar = new com.waze.beacons.a.a(this, 17);
        com.waze.beacons.a.a aVar2 = new com.waze.beacons.a.a(this, 18);
        x.f(composeView, "composeView");
        x.f(nVar, "stateHolder");
        x.f(aVar, "onOpenLiveDrive");
        x.f(aVar2, "onCreateShareDrive");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1010150480, true, new com.waze.c.e.x(nVar, aVar, aVar2, 11)));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }
}
