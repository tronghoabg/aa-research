package com.waze.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.gw.Gateway;
import com.waze.ifs.ui.ScrollViewTopShadowOnly;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.view.title.WazeDefaultHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dc extends android.support.v4.app.ar implements de, org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37017a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f37018b;

    /* renamed from: c, reason: collision with root package name */
    private ScrollViewTopShadowOnly f37019c;

    /* renamed from: d, reason: collision with root package name */
    private WazeDefaultHeaderView f37020d;

    /* renamed from: e, reason: collision with root package name */
    private ComposeView f37021e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.settings.tree.g f37022f;

    /* renamed from: g, reason: collision with root package name */
    private int f37023g;

    /* renamed from: h, reason: collision with root package name */
    private final List f37024h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37025i;

    /* renamed from: j, reason: collision with root package name */
    private String f37026j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f37027k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f37028l;
    private final h.f m;
    private final ActivityResultLauncher n;

    public dc() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SettingsPageFragment");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(eVarD, "logger");
        this.f37017a = eVarD;
        this.f37018b = org.a.b.b.d.a(this);
        this.f37024h = new ArrayList();
        this.f37027k = h.g.a(new com.waze.bk.f(this, 5));
        this.f37028l = h.g.a(new com.waze.bk.f(this, 6));
        this.m = h.g.a(new cv((Object) this, 0));
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.waze.settings.cw
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                dc.r(this.f36992a, (Boolean) obj);
            }
        });
        h.g.b.x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.n = activityResultLauncherRegisterForActivityResult;
    }

    static final cx f(dc dcVar) {
        return new cx(dcVar, (cs) dcVar.f37028l.getValue());
    }

    public static /* synthetic */ h.ab n(dc dcVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(20240082, i2, -1, "com.waze.settings.SettingsPageFragment.onViewCreated.<anonymous>.<anonymous> (SettingsPageFragment.kt:164)");
            }
            com.waze.ab.a.l.c(dcVar.w().a(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab o(dc dcVar, Boolean bool) {
        h.g.b.x.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        WazeDefaultHeaderView wazeDefaultHeaderView = dcVar.f37020d;
        if (wazeDefaultHeaderView == null) {
            h.g.b.x.j("settingsHeaderView");
            wazeDefaultHeaderView = null;
        }
        wazeDefaultHeaderView.e(zBooleanValue);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void p(dc dcVar) {
        com.waze.shared_infra.i.e eVar = dcVar.f37017a;
        eVar.a("voice and sound page, askForAudioPermission called");
        if (ContextCompat.checkSelfPermission(dcVar.requireContext(), "android.permission.RECORD_AUDIO") == 0) {
            eVar.a("voice and sound page, audio permission granted");
            dcVar.k().k().c();
        } else if (dcVar.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            eVar.a("voice and sound page, user declined audio permission before, showing rational");
            gy gyVarW = dcVar.w();
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(gyVarW), null, null, new u(gyVarW, (h.c.e) null, 9, (byte[]) null), 3);
        } else {
            eVar.a("voice and sound page, requesting audio record permission via OS permission dialog");
            dcVar.w().m();
            dcVar.n.launch("android.permission.RECORD_AUDIO");
        }
    }

    static final void q(dc dcVar, View view) {
        Iterator it = dcVar.f37024h.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dcVar.a().b(dcVar.f37023g);
    }

    static final void r(dc dcVar, Boolean bool) {
        h.g.b.x.f(bool, "isGranted");
        Objects.toString(bool);
        dcVar.f37017a.a("recordAudioPermissionLauncher isGranted ".concat(String.valueOf(bool)));
        dcVar.w().l(bool);
        if (bool.booleanValue()) {
            dcVar.k().k().c();
        } else {
            dcVar.k().k().d();
        }
    }

    static final void s(dc dcVar) {
        ScrollViewTopShadowOnly scrollViewTopShadowOnly = dcVar.f37019c;
        ScrollViewTopShadowOnly scrollViewTopShadowOnly2 = null;
        if (scrollViewTopShadowOnly == null) {
            h.g.b.x.j("scroll");
            scrollViewTopShadowOnly = null;
        }
        scrollViewTopShadowOnly.setSmoothScrollingEnabled(true);
        ScrollViewTopShadowOnly scrollViewTopShadowOnly3 = dcVar.f37019c;
        if (scrollViewTopShadowOnly3 == null) {
            h.g.b.x.j("scroll");
        } else {
            scrollViewTopShadowOnly2 = scrollViewTopShadowOnly3;
        }
        scrollViewTopShadowOnly2.fullScroll(33);
    }

    static final h.ab u(dc dcVar) {
        dcVar.x();
        return h.ab.f48028a;
    }

    static final h.ab v(dc dcVar) {
        dcVar.x();
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gy w() {
        return (gy) this.f37027k.getValue();
    }

    private final void x() {
        View viewRequireView = requireView();
        LinearLayout linearLayout = (LinearLayout) viewRequireView.findViewById(R.id.settingsLinearLayout);
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        com.waze.settings.tree.g gVar = this.f37022f;
        h.g.b.x.c(gVar);
        if (!gVar.i().isEmpty()) {
            com.waze.settings.tree.g gVar2 = this.f37022f;
            h.g.b.x.c(gVar2);
            if (((com.waze.settings.tree.f) gVar2.i().get(0)).l() != bk.n) {
                com.waze.settings.tree.g gVar3 = this.f37022f;
                h.g.b.x.c(gVar3);
                if (((com.waze.settings.tree.f) gVar3.i().get(0)).l() != bk.f36872b) {
                    com.waze.settings.tree.g gVar4 = this.f37022f;
                    h.g.b.x.c(gVar4);
                    if (((com.waze.settings.tree.f) gVar4.i().get(0)).l() != bk.f36880j) {
                        com.waze.settings.tree.g gVar5 = this.f37022f;
                        h.g.b.x.c(gVar5);
                        if (((com.waze.settings.tree.f) gVar5.i().get(0)).l() != bk.f36882l) {
                            View viewK = new com.waze.settings.tree.d.q().k(this);
                            h.g.b.x.c(viewK);
                            viewK.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            linearLayout.addView(viewK);
                        }
                    }
                }
            }
        }
        com.waze.settings.tree.g gVar6 = this.f37022f;
        h.g.b.x.c(gVar6);
        View view = null;
        for (com.waze.settings.tree.f fVar : gVar6.i()) {
            View viewK2 = fVar.k(this);
            if (viewK2 != null) {
                viewK2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                viewK2.setTag(fVar.s());
                linearLayout.addView(viewK2);
                if ((view instanceof WazeSettingsView) && !(viewK2 instanceof WazeSettingsView)) {
                    ((WazeSettingsView) view).M();
                }
                view = viewK2;
            }
        }
        if (view instanceof WazeSettingsView) {
            ((WazeSettingsView) view).M();
        }
        View view2 = new View(getContext());
        view2.setMinimumHeight(h.h.a.b(getResources().getDisplayMetrics().density * 50.0f));
        linearLayout.addView(view2);
        Gateway.attachSettingsButton(viewRequireView);
    }

    @Override // com.waze.settings.de
    public final void A(View.OnClickListener onClickListener) {
        h.g.b.x.f(onClickListener, "listener");
        WazeDefaultHeaderView wazeDefaultHeaderView = this.f37020d;
        WazeDefaultHeaderView wazeDefaultHeaderView2 = null;
        if (wazeDefaultHeaderView == null) {
            h.g.b.x.j("settingsHeaderView");
            wazeDefaultHeaderView = null;
        }
        wazeDefaultHeaderView.d(com.waze.shared_infra.o.b.a().c(R.string.SAVE, new Object[0]));
        WazeDefaultHeaderView wazeDefaultHeaderView3 = this.f37020d;
        if (wazeDefaultHeaderView3 == null) {
            h.g.b.x.j("settingsHeaderView");
        } else {
            wazeDefaultHeaderView2 = wazeDefaultHeaderView3;
        }
        wazeDefaultHeaderView2.g(com.waze.design_components.header_view.a.f23475c);
        this.f37023g = 20002;
        this.f37024h.add(onClickListener);
    }

    @Override // com.waze.settings.de
    public final boolean E() {
        return this.f37025i;
    }

    @Override // com.waze.settings.ce
    public final cs a() {
        return (cs) this.m.getValue();
    }

    @Override // com.waze.settings.dd
    public final com.waze.settings.tree.g b() {
        return this.f37022f;
    }

    @Override // com.waze.settings.de, com.waze.settings.dd
    public final /* synthetic */ String c() {
        return com.waze.bs.a.d(this);
    }

    @Override // com.waze.settings.dd
    public final String d() {
        return this.f37026j;
    }

    @Override // com.waze.settings.de
    public final Context g() {
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    @Override // com.waze.settings.de
    public final LifecycleOwner h() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }

    @Override // com.waze.settings.de
    public final com.waze.as.a j() {
        return w().b();
    }

    @Override // com.waze.settings.de
    public final ds k() {
        return w().e();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f37018b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.settings_page_mk2, viewGroup, false);
        h.g.b.x.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        String string;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("model")) == null) {
            string = "";
        }
        if (h.g.b.x.n(string, "settings_main.voice")) {
            w().j(ContextCompat.checkSelfPermission(requireContext(), "android.permission.RECORD_AUDIO") == 0);
        }
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        h.g.b.x.f(view, "view");
        View viewFindViewById = view.findViewById(R.id.scroll);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f37019c = (ScrollViewTopShadowOnly) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.settingsHeaderView);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f37020d = (WazeDefaultHeaderView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.userImageContainer);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        this.f37021e = (ComposeView) viewFindViewById3;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("model")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        this.f37026j = arguments2 != null ? arguments2.getString(TtmlNode.ATTR_TTS_ORIGIN) : null;
        com.waze.settings.tree.f fVarC = w().o().c(string);
        com.waze.settings.tree.g gVar = fVarC instanceof com.waze.settings.tree.g ? (com.waze.settings.tree.g) fVarC : null;
        this.f37022f = gVar;
        int i2 = 3;
        if (gVar == null) {
            this.f37017a.g("SettingPageActivity cannot find container with id ".concat(String.valueOf(string)));
            a().b(3);
            return;
        }
        android.support.v4.app.av avVarRequireActivity = requireActivity();
        h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        avVarRequireActivity.getOnBackPressedDispatcher().addCallback(viewLifecycleOwner, new db(this, a()));
        com.waze.settings.tree.g gVar2 = this.f37022f;
        if (gVar2 != null) {
            gVar2.h(this);
        }
        com.waze.settings.tree.g gVar3 = this.f37022f;
        if (gVar3 != null && gVar3.f37568e != null) {
            ai.d(gVar3);
        }
        com.waze.settings.tree.g gVar4 = this.f37022f;
        if (gVar4 != null) {
            FlowLiveDataConversions.asLiveData$default(gVar4.j(), (h.c.j) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new aw(new am(this, 4), 3, (short[]) null));
        }
        this.f37023g = 3;
        this.f37024h.clear();
        da daVar = new da(this);
        ScrollViewTopShadowOnly scrollViewTopShadowOnly = this.f37019c;
        if (scrollViewTopShadowOnly == null) {
            h.g.b.x.j("scroll");
            scrollViewTopShadowOnly = null;
        }
        scrollViewTopShadowOnly.a(daVar);
        ScrollViewTopShadowOnly scrollViewTopShadowOnly2 = this.f37019c;
        if (scrollViewTopShadowOnly2 == null) {
            h.g.b.x.j("scroll");
            scrollViewTopShadowOnly2 = null;
        }
        ScrollViewTopShadowOnly scrollViewTopShadowOnly3 = scrollViewTopShadowOnly2;
        if (!scrollViewTopShadowOnly3.isLaidOut() || scrollViewTopShadowOnly3.isLayoutRequested()) {
            scrollViewTopShadowOnly3.addOnLayoutChangeListener(new cy(this));
        } else {
            ScrollViewTopShadowOnly scrollViewTopShadowOnly4 = this.f37019c;
            if (scrollViewTopShadowOnly4 == null) {
                h.g.b.x.j("scroll");
                scrollViewTopShadowOnly4 = null;
            }
            this.f37025i = scrollViewTopShadowOnly4.canScrollVertically(1);
            com.waze.search.v2.o.f(this);
        }
        WazeDefaultHeaderView wazeDefaultHeaderView = this.f37020d;
        if (wazeDefaultHeaderView == null) {
            h.g.b.x.j("settingsHeaderView");
            wazeDefaultHeaderView = null;
        }
        com.waze.settings.tree.g gVar5 = this.f37022f;
        wazeDefaultHeaderView.h(gVar5 != null ? gVar5.t() : null);
        WazeDefaultHeaderView wazeDefaultHeaderView2 = this.f37020d;
        if (wazeDefaultHeaderView2 == null) {
            h.g.b.x.j("settingsHeaderView");
            wazeDefaultHeaderView2 = null;
        }
        wazeDefaultHeaderView2.f(new g(this, 11));
        k().d().observe(getViewLifecycleOwner(), new aw(new am(this, 5), 3, (short[]) null));
        k().c().observe(getViewLifecycleOwner(), new aw(new am(this, 6), 3, (short[]) null));
        if (h.g.b.x.n(string, "settings_main.account.account_and_login")) {
            ComposeView composeView = this.f37021e;
            if (composeView == null) {
                h.g.b.x.j("userImageContainer");
                composeView = null;
            }
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-832315122, true, new com.waze.z.a.c.n(this, i2)));
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new u(this, (h.c.e) null, 4, (byte[]) null), 3);
        }
        if (h.g.b.x.n(string, "settings_main.voice")) {
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new cz(this, (h.c.e) null, 0), 3);
        }
    }

    public final void t(boolean z) {
        this.f37025i = z;
    }

    @Override // com.waze.settings.de
    public final void y() {
        ScrollViewTopShadowOnly scrollViewTopShadowOnly = this.f37019c;
        if (scrollViewTopShadowOnly == null) {
            h.g.b.x.j("scroll");
            scrollViewTopShadowOnly = null;
        }
        scrollViewTopShadowOnly.postDelayed(new m(this, 6), 0L);
    }
}
