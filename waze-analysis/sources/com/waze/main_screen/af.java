package com.waze.main_screen;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.car_lib.r.cq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f25749a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f25750b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f25751c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f25752d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f25753e;

    /* renamed from: f, reason: collision with root package name */
    private final MutableIntState f25754f;

    public af() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new com.waze.settings.i.a.h(1));
        h.g.b.x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f25749a = activityResultLauncherRegisterForActivityResult;
        af afVar = this;
        this.f25750b = org.a.b.b.d.a(afVar);
        this.f25751c = h.g.b(h.h.f48132c, new ae(afVar, new ad(afVar)));
        af afVar2 = this;
        h.h hVar = h.h.f48130a;
        this.f25752d = h.g.b(hVar, new ac(afVar2, 1));
        this.f25753e = h.g.b(hVar, new ac(afVar2, 0));
        this.f25754f = SnapshotIntStateKt.mutableIntStateOf(0);
    }

    public static final /* synthetic */ com.waze.app_nav.w d(af afVar) {
        return (com.waze.app_nav.w) afVar.f25752d.getValue();
    }

    public static final /* synthetic */ com.waze.app_nav.a.ag e(af afVar) {
        return (com.waze.app_nav.a.ag) afVar.bE();
    }

    public static /* synthetic */ h.ab h(af afVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-139053332, i2, -1, "com.waze.main_screen.WazeMainMenuFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (WazeMainMenuFragment.kt:67)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.ui.o.ai aiVar = (com.waze.ui.o.ai) state.getValue();
            int intValue = afVar.f25754f.getIntValue();
            ax axVarK = afVar.k();
            boolean zChangedInstance = composer.changedInstance(axVarK);
            v vVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || vVarRememberedValue == Composer.Companion.getEmpty()) {
                vVarRememberedValue = new v(axVarK, 2, (char[]) null);
                composer.updateRememberedValue(vVarRememberedValue);
            }
            com.waze.ui.o.ae.b(aiVar, (h.g.a.l) ((h.l.f) vVarRememberedValue), null, intValue, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab i(af afVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135948752, i2, -1, "com.waze.main_screen.WazeMainMenuFragment.onCreateView.<anonymous>.<anonymous> (WazeMainMenuFragment.kt:65)");
            }
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-139053332, true, new com.waze.v.a(afVar, SnapshotStateKt.collectAsState(afVar.k().n(), null, composer, 0, 1), 9, null), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void j(af afVar, String str) {
        android.support.v4.app.av activity;
        Context context = afVar.getContext();
        ClipboardManager clipboardManager = context != null ? (ClipboardManager) ContextCompat.getSystemService(context, ClipboardManager.class) : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Version number", str));
            if (Build.VERSION.SDK_INT > 32 || (activity = afVar.getActivity()) == null) {
                return;
            }
            com.waze.design_components.d.a(activity, afVar.n().c(R.string.MAIN_MENU_VERSION_COPIED_SNACK_BAR_TEXT, new Object[0]), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ax k() {
        return (ax) this.f25751c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.shared_infra.o.a n() {
        return (com.waze.shared_infra.o.a) this.f25753e.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f25750b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-135948752, true, new com.waze.beacons.a.c(this, 1)));
        return composeView;
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        k().q();
        this.f25754f.setIntValue(com.waze.design_components.d.b.c(view));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new aj(this, (h.c.e) null, 1), 3);
    }
}
