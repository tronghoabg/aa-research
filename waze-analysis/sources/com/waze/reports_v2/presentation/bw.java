package com.waze.reports_v2.presentation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.waze.gw.Gateway;
import com.waze.reports_v2.c.dj;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34916a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f34917b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f34918c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f34919d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f34920e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f34921f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f34922g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f34923h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f34924i;

    /* renamed from: j, reason: collision with root package name */
    private final MutableIntState f34925j;

    /* renamed from: k, reason: collision with root package name */
    private com.waze.reports_v2.presentation.a.am f34926k;

    public bw() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ReportMenuFragment");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34916a = eVarD;
        bw bwVar = this;
        this.f34917b = org.a.b.b.d.a(bwVar);
        this.f34918c = h.g.b(h.h.f48132c, new bv(bwVar, new bu(bwVar)));
        bw bwVar2 = this;
        h.h hVar = h.h.f48130a;
        this.f34919d = h.g.b(hVar, new bq((ComponentCallbacks) bwVar2, 2));
        this.f34920e = h.g.b(hVar, new bq((ComponentCallbacks) bwVar2, 3));
        this.f34921f = h.g.b(hVar, new bq((ComponentCallbacks) bwVar2, 4));
        this.f34922g = h.g.b(hVar, new bq((ComponentCallbacks) bwVar2, 5));
        this.f34923h = h.g.b(hVar, new bq((ComponentCallbacks) bwVar2, 6));
        this.f34924i = h.g.b(hVar, new bq((ComponentCallbacks) bwVar2, 7));
        this.f34925j = SnapshotIntStateKt.mutableIntStateOf(0);
    }

    public static final /* synthetic */ com.waze.reports_v2.c.ca c(bw bwVar) {
        return (com.waze.reports_v2.c.ca) bwVar.f34923h.getValue();
    }

    public static final /* synthetic */ com.waze.reports_v2.c.ch d(bw bwVar) {
        return (com.waze.reports_v2.c.ch) bwVar.f34924i.getValue();
    }

    public static final /* synthetic */ al e(bw bwVar) {
        return (al) bwVar.f34921f.getValue();
    }

    public static /* synthetic */ h.ab i(bw bwVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1725019794, i2, -1, "com.waze.reports_v2.presentation.ReportMenuFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ReportMenuFragment.kt:120)");
            }
            com.waze.ui.k.q qVar = (com.waze.ui.k.q) Gateway.patchNativeReportMenuState((com.waze.ui.k.q) SnapshotStateKt.collectAsState(bwVar.u().p(), null, composer, 0, 1).getValue());
            boolean zChangedInstance = composer.changedInstance(bwVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.o.ab(bwVar, 5);
                composer.updateRememberedValue(objRememberedValue);
            }
            com.waze.ui.w.ai.t(qVar, (h.g.a.l) objRememberedValue, bwVar.f34925j.getIntValue(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab j(bw bwVar) {
        bwVar.u().v(new com.waze.ui.w.b.f(com.waze.ui.w.b.b.f43630e, null));
        return h.ab.f48028a;
    }

    static final h.ab k(bw bwVar, com.waze.speech.s sVar) {
        com.waze.ui.w.b.bc bcVar;
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.speech.p) {
            cz czVarU = bwVar.u();
            com.waze.speech.n nVarA = ((com.waze.speech.p) sVar).a();
            h.g.b.x.f(nVarA, "<this>");
            com.waze.ui.w.b.be beVar = com.waze.ui.w.b.be.f43645a;
            com.waze.speech.n nVar = com.waze.speech.n.f40462a;
            com.waze.reports_v2.c.ar arVar = com.waze.reports_v2.c.ar.f34210a;
            com.waze.ui.w.b.ab abVar = com.waze.ui.w.b.ab.f43566a;
            com.waze.ui.w.b.bg bgVar = com.waze.ui.w.b.bg.f43652a;
            com.waze.reports_v2.c.aq aqVar = com.waze.reports_v2.c.aq.f34202a;
            int iOrdinal = nVarA.ordinal();
            if (iOrdinal == 0) {
                bcVar = com.waze.ui.w.b.bc.f43635a;
            } else if (iOrdinal == 1) {
                bcVar = com.waze.ui.w.b.bc.f43638d;
            } else if (iOrdinal == 2) {
                bcVar = com.waze.ui.w.b.bc.f43636b;
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                bcVar = com.waze.ui.w.b.bc.f43637c;
            }
            czVarU.v(new com.waze.ui.w.b.e(new com.waze.ui.w.b.p(bcVar)));
        } else if (!h.g.b.x.n(sVar, com.waze.speech.q.f40469a) && !h.g.b.x.n(sVar, com.waze.speech.o.f40467a)) {
            if (!(sVar instanceof com.waze.speech.r)) {
                throw new h.i();
            }
            bwVar.u().v(new com.waze.ui.w.b.e(new com.waze.ui.w.b.s(((com.waze.speech.r) sVar).a())));
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void p(bw bwVar, cg cgVar) {
        com.waze.reports_v2.presentation.a.am amVar;
        Objects.toString(cgVar);
        bwVar.f34916a.a("handleCommand: ".concat(String.valueOf(cgVar)));
        if (cgVar instanceof cb) {
            com.waze.reports_v2.b.ad adVarA = ((cb) cgVar).a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("legacy_category", adVarA);
            com.waze.reports_v2.presentation.a.am amVar2 = bwVar.f34926k;
            if (amVar2 != null) {
                amVar2.b(cgVar);
                return;
            } else {
                ((com.waze.app_nav.b.c) com.waze.ads.c.e.d(bwVar).getValue()).b(bundle);
                return;
            }
        }
        if (cgVar instanceof ca) {
            com.waze.reports_v2.presentation.a.am amVar3 = bwVar.f34926k;
            if (amVar3 != null) {
                amVar3.b(cgVar);
                return;
            }
            com.waze.app_nav.b.c cVar = (com.waze.app_nav.b.c) com.waze.ads.c.e.d(bwVar).getValue();
            ca caVar = (ca) cgVar;
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("report_type", caVar.b());
            bundle2.putSerializable("report_subtype", caVar.c());
            com.waze.reports_v2.b.i iVarA = caVar.a();
            if (iVarA instanceof com.waze.reports_v2.b.g) {
                bundle2.putSerializable("closure_additional_data", caVar.a());
            } else if (!(iVarA instanceof com.waze.reports_v2.b.h) && iVarA != null) {
                throw new h.i();
            }
            cVar.b(bundle2);
            return;
        }
        if (h.g.b.x.n(cgVar, cc.f34943a)) {
            com.waze.reports_v2.presentation.a.am amVar4 = bwVar.f34926k;
            if (amVar4 != null) {
                amVar4.b(cgVar);
                return;
            } else {
                ((com.waze.app_nav.b.c) com.waze.ads.c.e.d(bwVar).getValue()).a();
                return;
            }
        }
        if (cgVar instanceof bz) {
            com.waze.reports_v2.presentation.a.am amVar5 = bwVar.f34926k;
            if (amVar5 != null) {
                amVar5.b(cgVar);
                return;
            }
            com.waze.app_nav.b.c cVar2 = (com.waze.app_nav.b.c) com.waze.ads.c.e.d(bwVar).getValue();
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("mid_flow_error", ((bz) cgVar).a());
            cVar2.b(bundle3);
            return;
        }
        if (cgVar instanceof cf) {
            int iA = bwVar.getResources().getConfiguration().orientation == 2 ? 0 : ((cf) cgVar).a();
            if (iA >= bwVar.getResources().getDisplayMetrics().heightPixels || (amVar = bwVar.f34926k) == null) {
                return;
            }
            amVar.a(iA);
            return;
        }
        if (cgVar instanceof ce) {
            bwVar.u().v(new com.waze.ui.w.b.i(com.waze.ui.f.s.f42311a));
            ce ceVar = (ce) cgVar;
            com.waze.bl.d.a.d dVarA = ceVar.a();
            if (dVarA instanceof com.waze.bl.d.d) {
                com.waze.reports_v2.presentation.a.am amVar6 = bwVar.f34926k;
                if (amVar6 != null) {
                    amVar6.b(cgVar);
                    return;
                } else {
                    bwVar.y(((com.waze.bl.d.d) ceVar.a()).b(), ((com.waze.bl.d.d) ceVar.a()).a());
                    return;
                }
            }
            if (!h.g.b.x.n(dVarA, com.waze.bl.d.e.f17079a) && !h.g.b.x.n(dVarA, com.waze.bl.d.c.f17075a)) {
                throw new h.i();
            }
            com.waze.reports_v2.presentation.a.am amVar7 = bwVar.f34926k;
            if (amVar7 != null) {
                amVar7.b(cgVar);
                return;
            }
            return;
        }
        if (!(cgVar instanceof cd)) {
            throw new h.i();
        }
        cd cdVar = (cd) cgVar;
        aa aaVarA = cdVar.a();
        if (aaVarA instanceof v) {
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(bwVar), null, null, new bt(bwVar, cgVar, h.o.a.m(bwVar.u().a()), null), 3);
            return;
        }
        if (aaVarA instanceof w) {
            if (((w) cdVar.a()).a() != com.waze.ui.w.b.ab.f43568c) {
                LifecycleOwner viewLifecycleOwner = bwVar.getViewLifecycleOwner();
                h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new bj(bwVar, (h.c.e) null, 5), 3);
                return;
            }
            return;
        }
        if (aaVarA instanceof x) {
            String strA = ((x) cdVar.a()).a();
            com.waze.ui.w.b.bf bfVar = com.waze.ui.w.b.bf.f43649a;
            LifecycleOwner viewLifecycleOwner2 = bwVar.getViewLifecycleOwner();
            h.g.b.x.e(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new ck(bwVar, strA, bfVar, (h.c.e) null, 1), 3);
            return;
        }
        if (aaVarA instanceof u) {
            LifecycleOwner viewLifecycleOwner3 = bwVar.getViewLifecycleOwner();
            h.g.b.x.e(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new bj(bwVar, (h.c.e) null, 6, (byte[]) null), 3);
            return;
        }
        if (aaVarA instanceof z) {
            bwVar.w().i(((com.waze.reports_v2.c.bs) bwVar.f34922g.getValue()).c(), new by(bwVar, 1));
            return;
        }
        if (aaVarA instanceof y) {
            com.waze.ui.w.b.an anVarA = ((y) cdVar.a()).a();
            LifecycleOwner viewLifecycleOwner4 = bwVar.getViewLifecycleOwner();
            h.g.b.x.e(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new bl(bwVar, anVarA, (h.c.e) null, 4), 3);
            return;
        }
        if (!(aaVarA instanceof t)) {
            throw new h.i();
        }
        com.waze.ui.w.b.bg bgVarA = ((t) cdVar.a()).a();
        LifecycleOwner viewLifecycleOwner5 = bwVar.getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new bl(bwVar, bgVarA, (h.c.e) null, 3), 3);
    }

    public static /* synthetic */ h.ab t(bw bwVar, com.waze.ui.w.ai aiVar) {
        h.g.b.x.f(aiVar, "action");
        if (Gateway.handleNativeReportMenuAction(bwVar, aiVar)) {
            return h.ab.f48028a;
        }
        bwVar.u().v(aiVar);
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cz u() {
        return (cz) this.f34918c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.sound.m v() {
        return (com.waze.sound.m) this.f34919d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.speech.w w() {
        return (com.waze.speech.w) this.f34920e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        v().i();
        w().h();
        u().v(new com.waze.ui.w.b.e(com.waze.ui.w.b.m.f43703a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(com.waze.reports_v2.b.at atVar, int i2) {
        com.waze.app_nav.b.c cVar = (com.waze.app_nav.b.c) com.waze.ads.c.e.d(this).getValue();
        Bundle bundle = new Bundle();
        bundle.putSerializable("report_subtype", atVar);
        bundle.putBoolean("success_from_conversation", true);
        bundle.putInt("conversation_points", i2);
        cVar.b(bundle);
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f34917b.getValue();
    }

    @Override // org.a.a.b.a
    public final void m() {
        x();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        dj djVar;
        dj djVar2;
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Context context = getContext();
        if (context != null) {
            cz czVarU = u();
            Bundle arguments = getArguments();
            if (arguments == null) {
                djVar = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    djVar2 = (dj) arguments.getSerializable("menu_to_open", dj.class);
                } else {
                    Serializable serializable = arguments.getSerializable("menu_to_open");
                    if (serializable instanceof dj) {
                        djVar2 = (dj) serializable;
                    }
                    djVar = null;
                }
                djVar = djVar2;
            }
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(czVarU), null, null, new cu(czVarU, djVar, bx.a(context), (h.c.e) null, 0), 3);
        }
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        com.waze.ad.a.j.r(this, this, new bq((Object) this, 0));
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1889562154, true, new com.waze.v.b(this, 2)));
        return composeView;
    }

    @Override // android.support.v4.app.ar
    public void onPause() {
        Gateway.onNativeReportMenuVisibility(false);
        super.onPause();
    }

    @Override // android.support.v4.app.ar
    public void onResume() {
        super.onResume();
        Gateway.onNativeReportMenuVisibility(true);
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        super.onViewCreated(view, bundle);
        if (u().i() != da.f35012a) {
            Context context = view.getContext();
            h.g.b.x.e(context, "getContext(...)");
            if (!bx.a(context)) {
                u().v(new com.waze.ui.w.b.e(com.waze.ui.w.b.o.f43705a));
            }
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new bj(this, (h.c.e) null, 7, (char[]) null), 3);
    }

    public final void q(int i2) {
        this.f34925j.setIntValue(i2);
    }

    public final com.waze.reports_v2.presentation.a.am r() {
        return this.f34926k;
    }

    public final void s(com.waze.reports_v2.presentation.a.am amVar) {
        this.f34926k = amVar;
    }
}
