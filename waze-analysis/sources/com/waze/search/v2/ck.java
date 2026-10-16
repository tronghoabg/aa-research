package com.waze.search.v2;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ck extends android.support.v4.app.ar implements org.a.a.b.a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36249b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final b f36250c = new b(Float.valueOf(0.5f), Float.valueOf(0.68f));

    /* renamed from: a, reason: collision with root package name */
    public fi f36251a;

    /* renamed from: d, reason: collision with root package name */
    private fr f36252d;

    /* renamed from: e, reason: collision with root package name */
    private fr f36253e;

    /* renamed from: f, reason: collision with root package name */
    private final ScrollState f36254f = new ScrollState(0);

    /* renamed from: g, reason: collision with root package name */
    private final ScrollState f36255g = new ScrollState(0);

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.navigate.location_preview.bk f36256h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f36257i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f36258j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f36259k;

    /* renamed from: l, reason: collision with root package name */
    private final MutableState f36260l;
    private final MutableState m;
    private final MutableState n;
    private final MutableState o;
    private final MutableState p;
    private h.g.a.l q;

    public ck() {
        ck ckVar = this;
        this.f36256h = new com.waze.navigate.location_preview.bk(ckVar, new com.waze.v.b(this, 19));
        this.f36257i = org.a.b.b.d.a(ckVar);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SearchV2Fragment");
        h.g.b.x.e(eVarD, "create(...)");
        this.f36258j = eVarD;
        this.f36259k = h.g.b(h.h.f48130a, new bv((ComponentCallbacks) this, 6));
        this.f36260l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new h(0, 0), null, 2, null);
        this.m = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(b.f36170a, null, 2, null);
        this.n = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(b.f36170a, null, 2, null);
        this.o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(0.0f), null, 2, null);
        this.p = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(b.f36171b, null, 2, null);
        this.q = new com.waze.network.q(17);
    }

    public static final /* synthetic */ void C(ck ckVar, fr frVar, fr frVar2) {
        boolean zN = h.g.b.x.n(frVar, ckVar.f36253e);
        byte[] bArr = null;
        if (ckVar.Y()) {
            float fJ = ckVar.J(zN);
            if (frVar != null) {
                frVar.j(-fJ, new com.google.firebase.messaging.m(ckVar, frVar, 5, bArr));
            }
            if (frVar2 != null) {
                ckVar.W(frVar2, 4);
                frVar2.k(-fJ);
            }
        } else {
            int i2 = 6;
            if (frVar != null) {
                frVar.j(ckVar.L(zN).b(), new com.google.firebase.messaging.m(ckVar, frVar, i2, bArr));
            }
            if (frVar2 != null) {
                com.waze.design_components.a.a aVarL = ckVar.L(!zN);
                ckVar.W(frVar2, 6);
                frVar2.k(aVarL.b());
            }
        }
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(ckVar), null, null, new ev(ckVar, (h.c.e) null, 1), 3);
    }

    public static final /* synthetic */ boolean H(ck ckVar) {
        if (ckVar.Y()) {
            return true;
        }
        return ((double) com.waze.x.g.f((com.waze.design_components.a.d) ckVar.P().d(ckVar.i().P()), ckVar.K()).a()) < 0.25d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float I() {
        return ((Dp) this.o.getValue()).m11178unboximpl();
    }

    private final float J(boolean z) {
        float fA;
        if (getContext() == null) {
            this.f36258j.b("sheetPeekHeight called with context = null");
            return 0.0f;
        }
        float f2 = getResources().getDisplayMetrics().density;
        if (Y()) {
            return K() - (((Dp) O().d(z)).m11178unboximpl() * f2);
        }
        if (z) {
            int i2 = cu.f36302a;
            return (f2 * 180.0f) + Q().a();
        }
        if (((dt) i().F().d()).d().c().isEmpty()) {
            int i3 = cu.f36302a;
            fA = 82.0f;
        } else {
            fA = cu.a();
        }
        return (fA * f2) + Q().a();
    }

    private final int K() {
        return getResources().getDisplayMetrics().heightPixels;
    }

    private final com.waze.design_components.a.a L(boolean z) {
        return new com.waze.design_components.a.a(K(), ((Number) f36250c.d(z)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.map.b.ed M() {
        return (com.waze.map.b.ed) this.f36259k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b N() {
        return (b) this.n.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b O() {
        return (b) this.m.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b P() {
        return (b) this.p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final h Q() {
        return (h) this.f36260l.getValue();
    }

    private static final dt R(State state) {
        return (dt) state.getValue();
    }

    private final void S(boolean z) {
        if (getContext() == null) {
            this.f36258j.b("handleSheetUpdateEventInLandscape called with context = null");
            return;
        }
        if (Y()) {
            if (z != i().P()) {
                this.f36258j.a("Ignoring sheet update of invisible sheet isLpp=" + z);
                return;
            }
            int iB = h.h.a.b(getResources().getDisplayMetrics().density * 40.0f);
            int iK = K();
            int i2 = getResources().getDisplayMetrics().widthPixels;
            Rect rect = new Rect();
            rect.left = iK + iB;
            rect.top = iB;
            rect.right = i2 - iB;
            rect.bottom = iK - iB;
            this.q.invoke(rect);
        }
    }

    private final void T(boolean z, com.waze.design_components.a.d dVar) {
        if (getContext() == null) {
            this.f36258j.b("handleSheetUpdateEventInPortrait called with context = null");
            return;
        }
        if (Y()) {
            return;
        }
        if (z != i().P()) {
            this.f36258j.a("Ignoring sheet update of invisible sheet isLpp=" + z);
            return;
        }
        int iB = h.h.a.b(getResources().getDisplayMetrics().density * 40.0f);
        int i2 = getResources().getDisplayMetrics().widthPixels;
        if (dVar != null) {
            this.p.setValue(P().c(z, dVar));
        }
        int iD = com.waze.x.g.f((com.waze.design_components.a.d) P().d(z), K()).d();
        int iH = h.k.n.h(iD, L(z).d());
        Rect rect = new Rect();
        rect.left = iB;
        rect.top = iB;
        rect.right = i2 - iB;
        rect.bottom = iH - iB;
        this.q.invoke(rect);
        if (Y()) {
            return;
        }
        View viewFindViewById = requireView().findViewById(R.id.searchV2AgainPortraitContainer);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        int i3 = com.waze.ui.r.f43259a;
        if (iD > getResources().getDisplayMetrics().density * 80.0f) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        h.g.b.x.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = iD;
        viewFindViewById.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(b bVar) {
        this.n.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(fr frVar) {
        frVar.i((int) J(frVar.m()));
        if (Y()) {
            S(frVar.m());
            return;
        }
        frVar.e(Math.max(Q().b(), h.h.a.b((((Dp) O().d(frVar.m())).m11178unboximpl() - ((Dp) N().d(frVar.m())).m11178unboximpl()) * frVar.getResources().getDisplayMetrics().density)));
        T(frVar.m(), frVar.b(K()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(fr frVar, int i2) {
        frVar.h(i2, frVar.m() ? !Y() : X());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X() {
        return !Y() && ((dt) i().F().d()).a() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        Resources resources;
        Configuration configuration;
        Context context = getContext();
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    private static final void Z(fr frVar) {
        frVar.g(((Number) f36250c.d(frVar.m())).floatValue());
    }

    static final Dp c(ck ckVar) {
        return (Dp) ckVar.N().e();
    }

    static final Dp d(ck ckVar) {
        return (Dp) ckVar.O().f();
    }

    static final Dp e(ck ckVar) {
        return (Dp) ckVar.N().f();
    }

    static final Dp f(ck ckVar) {
        return (Dp) ckVar.O().e();
    }

    static final h h(ck ckVar) {
        return ckVar.Q();
    }

    public static /* synthetic */ h.ab n(ck ckVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115327116, i2, -1, "com.waze.search.v2.SearchV2Fragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SearchV2Fragment.kt:127)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(ckVar.i().F(), null, composer, 0, 1);
            Modifier.Companion companion = Modifier.Companion;
            float fG = com.waze.z.a.be.G(ckVar.Q().a(), composer, 0);
            int i3 = cu.f36302a;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fG + 16.0f, 7, null);
            boolean zF = R(stateCollectAsState).f();
            boolean zG = R(stateCollectAsState).g();
            boolean zChangedInstance = composer.changedInstance(ckVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bi.a(ckVar, 6);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(ckVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.bi.a(ckVar, 7);
                composer.updateRememberedValue(objRememberedValue2);
            }
            cu.j(modifierM2759paddingqDBjuR0$default, zF, zG, aVar, (h.g.a.a) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab o(ColumnScope columnScope, ck ckVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1789139234, i2, -1, "com.waze.search.v2.SearchV2Fragment.initSearchResultsSheet.<anonymous>.<anonymous> (SearchV2Fragment.kt:192)");
            }
            dt dtVar = (dt) state.getValue();
            h hVarQ = ckVar.Q();
            float fM11178unboximpl = ((Dp) ckVar.O().f()).m11178unboximpl();
            boolean zChangedInstance = composer.changedInstance(ckVar);
            bx bxVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || bxVarRememberedValue == Composer.Companion.getEmpty()) {
                bxVarRememberedValue = new bx((Object) ckVar, 2, (char[]) null);
                composer.updateRememberedValue(bxVarRememberedValue);
            }
            h.g.a.l lVar = (h.g.a.l) bxVarRememberedValue;
            fi fiVarI = ckVar.i();
            boolean zChangedInstance2 = composer.changedInstance(fiVarI);
            bx bxVarRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || bxVarRememberedValue2 == Composer.Companion.getEmpty()) {
                bxVarRememberedValue2 = new bx((Object) fiVarI, 3, (byte[]) null);
                composer.updateRememberedValue(bxVarRememberedValue2);
            }
            cu.g(columnScope, dtVar, hVarQ, fM11178unboximpl, lVar, (h.g.a.l) bxVarRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab p(ck ckVar, Composer composer, int i2) {
        float fG;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-427928441, i2, -1, "com.waze.search.v2.SearchV2Fragment.initLocationPreviewSheet.<anonymous>.<anonymous> (SearchV2Fragment.kt:228)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(ckVar.i().C(), null, composer, 0, 1);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(stateCollectAsState.getValue(), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            com.waze.ui.m.dl dlVar = (com.waze.ui.m.dl) stateCollectAsState.getValue();
            com.waze.ui.m.ae aeVarI = dlVar != null ? dlVar.i() : null;
            if (aeVarI == null) {
                composer.startReplaceGroup(-953086599);
            } else {
                composer.startReplaceGroup(-953086598);
                com.waze.ui.m.dc.P(aeVarI, composer, 0);
            }
            composer.endReplaceGroup();
            com.waze.ui.m.dl dlVar2 = (com.waze.ui.m.dl) stateCollectAsState.getValue();
            if (dlVar2 == null) {
                dlVar2 = (com.waze.ui.m.dl) mutableState.getValue();
            }
            com.waze.ui.m.dl dlVar3 = dlVar2;
            if (dlVar3 == null) {
                composer.startReplaceGroup(-952999055);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-952999054);
                fi fiVarI = ckVar.i();
                boolean zChangedInstance = composer.changedInstance(fiVarI);
                bx bxVarRememberedValue = composer.rememberedValue();
                if (zChangedInstance || bxVarRememberedValue == Composer.Companion.getEmpty()) {
                    bxVarRememberedValue = new bx((Object) fiVarI, 1, (byte[]) null);
                    composer.updateRememberedValue(bxVarRememberedValue);
                }
                h.g.a.l lVar = (h.g.a.l) bxVarRememberedValue;
                kotlinx.coroutines.b.bm bmVarX = ckVar.i().x();
                float fM11178unboximpl = ((Dp) ckVar.O().e()).m11178unboximpl();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-650337410, 0, -1, "com.waze.search.v2.SearchV2Fragment.calculateLocationPreviewBottomBarHeight (SearchV2Fragment.kt:631)");
                }
                if (ckVar.Y()) {
                    composer.startReplaceGroup(396110688);
                    composer.endReplaceGroup();
                    fG = ckVar.I() + fM11178unboximpl;
                } else {
                    composer.startReplaceGroup(396184716);
                    fG = com.waze.z.a.be.G(ckVar.Q().b(), composer, 0) + ckVar.I();
                    composer.endReplaceGroup();
                }
                float f2 = fG;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean zChangedInstance2 = composer.changedInstance(ckVar);
                bx bxVarRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || bxVarRememberedValue2 == Composer.Companion.getEmpty()) {
                    bxVarRememberedValue2 = new bx(ckVar, 0);
                    composer.updateRememberedValue(bxVarRememberedValue2);
                }
                cu.d(dlVar3, lVar, bmVarX, f2, (h.g.a.l) bxVarRememberedValue2, composer, 8);
                composer.endReplaceGroup();
            }
            if (!h.g.b.x.n(mutableState.getValue(), stateCollectAsState.getValue()) && stateCollectAsState.getValue() != null) {
                mutableState.setValue(stateCollectAsState.getValue());
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab q(ck ckVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1071648772, i2, -1, "com.waze.search.v2.SearchV2Fragment.initSheetOverlay.<anonymous>.<anonymous> (SearchV2Fragment.kt:267)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(ckVar.i().F(), null, composer, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(ckVar.i().C(), null, composer, 0, 1);
            dt dtVar = (dt) stateCollectAsState.getValue();
            com.waze.ui.m.dl dlVar = (com.waze.ui.m.dl) stateCollectAsState2.getValue();
            h hVarQ = ckVar.Q();
            b bVarN = ckVar.N();
            b bVarP = ckVar.P();
            kotlinx.coroutines.b.bm bmVarX = ckVar.i().x();
            fi fiVarI = ckVar.i();
            boolean zChangedInstance = composer.changedInstance(fiVarI);
            bx bxVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || bxVarRememberedValue == Composer.Companion.getEmpty()) {
                bxVarRememberedValue = new bx((Object) fiVarI, 4, (byte[]) null);
                composer.updateRememberedValue(bxVarRememberedValue);
            }
            h.g.a.l lVar = (h.g.a.l) bxVarRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(ckVar);
            bx bxVarRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || bxVarRememberedValue2 == Composer.Companion.getEmpty()) {
                bxVarRememberedValue2 = new bx(ckVar, 5, (boolean[]) null);
                composer.updateRememberedValue(bxVarRememberedValue2);
            }
            h.g.a.l lVar2 = (h.g.a.l) bxVarRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(ckVar);
            by byVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance3 || byVarRememberedValue == Composer.Companion.getEmpty()) {
                byVarRememberedValue = new by((Object) ckVar, 2, (char[]) null);
                composer.updateRememberedValue(byVarRememberedValue);
            }
            cu.h(dtVar, dlVar, hVarQ, bVarN, bVarP, bmVarX, lVar, lVar2, (h.g.a.p) byVarRememberedValue, composer, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab r(ck ckVar, com.waze.map.b.bi biVar) {
        h.g.b.x.f(biVar, "it");
        ckVar.M().b(biVar);
        return h.ab.f48028a;
    }

    static final h.ab s(ck ckVar, com.waze.map.b.bg bgVar) {
        h.g.b.x.f(bgVar, "it");
        ckVar.M().a(bgVar);
        return h.ab.f48028a;
    }

    public static /* synthetic */ void t(ck ckVar, fr frVar) {
        ckVar.V(frVar);
        ckVar.W(frVar, 4);
    }

    public static /* synthetic */ void u(ck ckVar, fr frVar) {
        ckVar.V(frVar);
        ckVar.W(frVar, 6);
    }

    public static final /* synthetic */ void v(ck ckVar, boolean z, com.waze.design_components.a.d dVar) {
        if (ckVar.i().P() == z) {
            if (ckVar.Y()) {
                ckVar.S(z);
            } else {
                ckVar.T(z, dVar);
            }
        }
    }

    public final void D(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "<set-?>");
        this.q = lVar;
    }

    public final void E(h hVar) {
        h.g.b.x.f(hVar, "padding");
        this.f36260l.setValue(hVar);
    }

    public final fi i() {
        fi fiVar = this.f36251a;
        if (fiVar != null) {
            return fiVar;
        }
        h.g.b.x.j("viewModel");
        return null;
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f36257i.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final void onAttach(Context context) {
        h.g.b.x.f(context, "context");
        super.onAttach(context);
        this.f36256h.b();
        l().i(((org.a.a.b.a) requireActivity()).l());
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        android.support.v4.app.av avVarRequireActivity = requireActivity();
        h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
        fi fiVar = (fi) h.g.b(h.h.f48132c, new bz(avVarRequireActivity)).getValue();
        h.g.b.x.f(fiVar, "<set-?>");
        this.f36251a = fiVar;
        View viewInflate = layoutInflater.inflate(R.layout.search_v2_fragment, viewGroup, false);
        if (Y()) {
            View viewFindViewById = viewInflate.findViewById(R.id.searchV2SheetsContainer);
            h.g.b.x.e(viewFindViewById, "findViewById(...)");
            int i2 = (int) (getResources().getConfiguration().screenHeightDp * getResources().getDisplayMetrics().density);
            viewFindViewById.getLayoutParams().width = i2;
            View viewFindViewById2 = viewInflate.findViewById(R.id.searchV2AgainLandscapeContainer);
            h.g.b.x.e(viewFindViewById2, "findViewById(...)");
            ComposeView composeView = (ComposeView) viewFindViewById2;
            ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
            h.g.b.x.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMarginStart(i2);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1329554632, true, new com.waze.v.b(this, 17)));
        } else {
            View viewFindViewById3 = viewInflate.findViewById(R.id.searchV2AgainPortraitContainer);
            h.g.b.x.e(viewFindViewById3, "findViewById(...)");
            ((ComposeView) viewFindViewById3).setContent(ComposableLambdaKt.composableLambdaInstance(956618399, true, new com.waze.v.b(this, 18)));
        }
        h.g.b.x.e(viewInflate, "also(...)");
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.f36256h.c();
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        int i2 = fr.f36540b;
        Context context = view.getContext();
        h.g.b.x.e(context, "getContext(...)");
        int i3 = 1;
        int i4 = 0;
        fr frVarH = com.waze.search.e.g.h(false, context, !Y(), this.f36254f, new by(this, 0), ComposableLambdaKt.composableLambdaInstance(1129731686, true, new com.waze.main_screen.c.b.a(this, 6)));
        frVarH.setVisibility(8);
        W(frVarH, true != Y() ? 6 : 4);
        Z(frVarH);
        V(frVarH);
        if (!i().P()) {
            if (Y()) {
                frVarH.j(J(false), null);
            } else {
                frVarH.j(L(false).b(), null);
            }
        }
        this.f36252d = frVarH;
        ((FrameLayout) view.findViewById(R.id.searchV2ResultsSheetContainer)).addView(frVarH);
        Context context2 = view.getContext();
        h.g.b.x.e(context2, "getContext(...)");
        fr frVarH2 = com.waze.search.e.g.h(true, context2, !Y(), this.f36255g, new by(this, 1), ComposableLambdaKt.composableLambdaInstance(1536577739, true, new com.waze.main_screen.c.b.a(this, 7)));
        frVarH2.setVisibility(8);
        W(frVarH2, true != Y() ? 6 : 4);
        Z(frVarH2);
        V(frVarH2);
        if (i().P()) {
            if (Y()) {
                frVarH2.j(J(true), null);
            } else {
                frVarH2.j(L(true).b(), null);
            }
        }
        this.f36253e = frVarH2;
        ((FrameLayout) view.findViewById(R.id.searchV2LPPSheetContainer)).addView(frVarH2);
        ((ComposeView) view.findViewById(R.id.searchV2SheetsOverlay)).setContent(ComposableLambdaKt.composableLambdaInstance(-951527096, true, new com.waze.v.b(this, 12)));
        kotlinx.coroutines.b.k kVarK = kotlinx.coroutines.b.ai.K(new cc(new cc(i().F(), 2), 0), new cj(this, (h.c.e) null, 1, (byte[]) null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.b.ai.m(kVarK, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        kotlinx.coroutines.b.k kVarK2 = kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(i().F(), 3)), new ci(this, null, 1, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.b.ai.m(kVarK2, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
        ck ckVar = this;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(new cc(i().C(), 4), new ci(this, null, 0)), LifecycleOwnerKt.getLifecycleScope(ckVar));
        i().K(LifecycleOwnerKt.getLifecycleScope(ckVar), new bx(this.f36256h, 6, (float[]) null));
        i().y().c(null);
        kotlinx.coroutines.b.k kVarK3 = kotlinx.coroutines.b.ai.K(i().y(), new cj(this, (h.c.e) null, 0));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.b.ai.m(kVarK3, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3));
        i().O(LifecycleOwnerKt.getLifecycleScope(ckVar), new bw(this, i4));
        i().N(LifecycleOwnerKt.getLifecycleScope(ckVar), new bw(this, i3));
        fi fiVarI = i();
        kotlinx.coroutines.b.k kVarJ = M().j();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(ckVar);
        h.g.b.x.f(kVarJ, "mapEvents");
        h.g.b.x.f(lifecycleScope, "scope");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kVarJ, new ch(fiVarI, (h.c.e) null, 3, (byte[]) null)), lifecycleScope);
        fi fiVarI2 = i();
        cc ccVar = new cc(M().w(), 5);
        kotlinx.coroutines.b.ch chVarT = M().t();
        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(ckVar);
        y yVar = new y(this, 2, (char[]) null);
        h.g.b.x.f(ccVar, "mapVisiblePolygonFlow");
        h.g.b.x.f(chVarT, "mapMovementState");
        h.g.b.x.f(lifecycleScope2, "scope");
        h.g.b.x.f(yVar, "isMapExpanded");
        kotlinx.coroutines.b.ch chVar = chVarT;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(new cc(kotlinx.coroutines.b.ai.K(chVar, new et(null)), 8), new eb(fiVarI2, yVar, (h.c.e) null, 3)), lifecycleScope2);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(new cc(new cc(kotlinx.coroutines.b.ai.F(ccVar, chVar, new eu(null)), 9), 10), new cj(fiVarI2, (h.c.e) null, 6, (int[]) null)), lifecycleScope2);
        kotlinx.coroutines.b.k kVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new bv((Object) this, i4));
        kotlinx.coroutines.b.k kVarK4 = kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.I(kVarSnapshotFlow, SnapshotStateKt.snapshotFlow(new bv((Object) this, 2)), SnapshotStateKt.snapshotFlow(new bv((Object) this, 3))), new ch(this, (h.c.e) null, 1, (byte[]) null));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.b.ai.m(kVarK4, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4));
        kotlinx.coroutines.b.k kVarK5 = kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.I(kVarSnapshotFlow, SnapshotStateKt.snapshotFlow(new bv((Object) this, 4)), SnapshotStateKt.snapshotFlow(new bv((Object) this, 5))), new ch(this, (h.c.e) null, 0));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.b.ai.m(kVarK5, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5));
    }
}
