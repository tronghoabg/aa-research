package com.waze.z.a.c;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.waze.authentication.as;
import com.waze.bw.c.d.ct;
import com.waze.dv;
import com.waze.search.h.bx;
import com.waze.search.v2.cu;
import com.waze.ui.d.s;
import com.waze.ui.d.t;
import com.waze.ui.m.dc;
import com.waze.ui.x.u;
import com.waze.z.a.d.aj;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f45863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45867e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f45868f;

    public /* synthetic */ l(WindowInsets windowInsets, h.g.a.q qVar, String str, com.waze.design_components.b.d dVar, h.g.a.a aVar, int i2) {
        this.f45868f = i2;
        this.f45865c = windowInsets;
        this.f45864b = qVar;
        this.f45866d = str;
        this.f45867e = dVar;
        this.f45863a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.waze.av.b.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.foundation.layout.WindowInsets, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.waze.z.a.c.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.compose.runtime.MutableFloatState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, kotlinx.coroutines.af] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 14;
        int i3 = 13;
        int i4 = 11;
        byte[] bArr = null;
        switch (this.f45868f) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i5 = iIntValue & 3;
                int i6 = iIntValue & 1;
                int i7 = q.f45886a;
                if (composer.shouldExecute(i5 != 2, i6)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1934941954, iIntValue, -1, "com.waze.design_components_compose.components.dialog.WazeDialog.<anonymous> (WazeDialog.kt:171)");
                    }
                    q.j((String) this.f45863a, (String) this.f45864b, (c) this.f45865c, (h) this.f45866d, this.f45867e, composer, 0, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(440506873, iIntValue2, -1, "com.waze.design_components_compose.components.WazeHeaderImpl.<anonymous> (WazeHeader.kt:145)");
                    }
                    ?? r2 = this.f45865c;
                    Alignment bottomCenter = Alignment.Companion.getBottomCenter();
                    Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, r2);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWindowInsetsPadding);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Object obj3 = this.f45863a;
                    Object obj4 = this.f45867e;
                    Object obj5 = this.f45866d;
                    ?? r0 = this.f45864b;
                    Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AppBarKt.m3957TopAppBarxWeB9s(ComposableLambdaKt.rememberComposableLambda(251362619, true, new dv(obj5, i4), composer2, 54), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(148066425, true, new com.waze.v.a(obj4, obj3, 4), composer2, 54), r0, Color.Companion.m8264getUnspecified0d7_KjU(), 0L, 0.0f, composer2, 1597878, 32);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i8 = iIntValue3 & 3;
                int i9 = iIntValue3 & 1;
                int i10 = q.f45886a;
                if (composer3.shouldExecute(i8 != 2, i9)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(452095084, iIntValue3, -1, "com.waze.design_components_compose.components.dialog.WazeDialog.<anonymous> (WazeDialog.kt:194)");
                    }
                    q.f((String) this.f45863a, (c) this.f45865c, null, (h) this.f45866d, null, (h.g.a.p) this.f45867e, this.f45864b, composer3, 0, 20);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 3:
                com.waze.menus.a.a aVar = (com.waze.menus.a.a) obj;
                com.waze.av.b.n nVar = (com.waze.av.b.n) obj2;
                x.f(aVar, "destinationMenuOption");
                x.f(nVar, "genericPlace");
                ((bx) this.f45864b).r(aVar, nVar);
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f45867e;
                ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) this.f45866d;
                aj ajVar = aj.f45920a;
                com.waze.menus.a.a aVar2 = com.waze.menus.a.a.f29638a;
                int iOrdinal = aVar.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    activityResultLauncher = activityResultLauncher2;
                }
                Object obj6 = this.f45865c;
                ?? r02 = this.f45863a;
                x.f(r02, "<this>");
                x.f(obj6, "context");
                x.f(activityResultLauncher, "activityLauncher");
                x.f(aVar, "destinationMenuOption");
                x.f(nVar, "genericPlace");
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 != 20 && iOrdinal2 != 21) {
                    switch (iOrdinal2) {
                        case 0:
                        case 1:
                            r02.q((Context) obj6, activityResultLauncher, nVar);
                            break;
                        case 2:
                            r02.s(nVar, new com.waze.main_screen.ac.k(11), new com.waze.main_screen.ac.k(12));
                            break;
                        case 3:
                            r02.r(nVar);
                            break;
                        case 4:
                            r02.A((com.waze.av.b.k) nVar, new com.waze.main_screen.ac.k(13), new com.waze.main_screen.ac.k(14));
                            break;
                        case 5:
                            r02.y(nVar);
                            break;
                        case 6:
                            r02.w();
                            break;
                        case 7:
                            r02.p((Context) obj6, nVar);
                            break;
                        case 8:
                            r02.o((Context) obj6, nVar);
                            break;
                        case 9:
                            r02.w();
                            break;
                        case 10:
                            r02.F((Context) obj6, nVar);
                            break;
                        case 11:
                            r02.x((Context) obj6, nVar);
                            break;
                        case 12:
                            r02.f(nVar);
                            break;
                        case 13:
                        case 14:
                            r02.d(nVar);
                            break;
                        case 15:
                            r02.e((com.waze.av.b.j) nVar);
                            break;
                        case 16:
                            r02.c(nVar);
                            break;
                    }
                } else {
                    r02.b((com.waze.av.b.j) nVar);
                }
                return ab.f48028a;
            case 4:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i11 = iIntValue4 & 3;
                int i12 = iIntValue4 & 1;
                int i13 = cu.f36302a;
                if (composer4.shouldExecute(i11 != 2, i12)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-773762969, iIntValue4, -1, "com.waze.search.v2.SearchV2SheetsOverlay.<anonymous>.<anonymous>.<anonymous> (SearchV2.kt:242)");
                    }
                    com.waze.ui.m.k kVar = (com.waze.ui.m.k) this.f45865c.getValue();
                    if (kVar == null) {
                        composer4.startReplaceGroup(-83072698);
                        composer4.endReplaceGroup();
                    } else {
                        Object obj7 = this.f45866d;
                        composer4.startReplaceGroup(-83072697);
                        composer4.startReplaceGroup(-556868266);
                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier.Companion companion = Modifier.Companion;
                        boolean zChanged = composer4.changed(obj7) | composer4.changed(density);
                        Object objRememberedValue = composer4.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new as(obj7, density, i3, bArr);
                            composer4.updateRememberedValue(objRememberedValue);
                        }
                        Object obj8 = this.f45864b;
                        Object obj9 = this.f45863a;
                        Object obj10 = this.f45867e;
                        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(companion, (h.g.a.l) objRememberedValue);
                        float fMo2124toDpu2uoSUM = density.mo2124toDpu2uoSUM(((com.waze.search.v2.h) obj10).a());
                        boolean zChanged2 = composer4.changed(obj9) | composer4.changedInstance(obj8);
                        Object objRememberedValue2 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new as(obj9, obj8, i2);
                            composer4.updateRememberedValue(objRememberedValue2);
                        }
                        dc.u(modifierOnSizeChanged, kVar, fMo2124toDpu2uoSUM, (h.g.a.l) objRememberedValue2, composer4, 0);
                        composer4.endReplaceGroup();
                        composer4.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return ab.f48028a;
            case 5:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2049237011, iIntValue5, -1, "com.waze.startstate.mobile.ui.StartStateBottomSheet.<anonymous>.<anonymous> (StartStateBottomSheet.kt:211)");
                    }
                    ct.c(((com.waze.bw.c.d.l) this.f45863a).b(), (com.waze.z.a.b.ab) this.f45866d, this.f45864b, NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), (NestedScrollConnection) this.f45867e, null, 2, null), (LazyListState) this.f45865c, composer5, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return ab.f48028a;
            case 6:
                return s.c(this.f45866d, (t) this.f45863a, this.f45864b, this.f45865c, this.f45867e, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-560883499, iIntValue6, -1, "com.waze.ui.route_settings.RouteSettingsMenuBottomSheet.<anonymous>.<anonymous> (RouteSettingsMenu.kt:266)");
                    }
                    Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 12.0f, 0.0f, WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer6, 6), composer6, 0).mo2704calculateBottomPaddingD9Ej5fM(), 5, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer6, 0);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, modifierM2759paddingqDBjuR0$default);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer6.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor2);
                    } else {
                        composer6.useNode();
                    }
                    Object obj11 = this.f45865c;
                    final ?? r7 = this.f45867e;
                    final ?? r8 = this.f45864b;
                    Updater.m7351setimpl(composer6, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer6, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer6, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer6, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer6, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    boolean zChangedInstance = composer6.changedInstance(r8) | composer6.changed((Object) r7) | composer6.changedInstance(obj11);
                    Object objRememberedValue3 = composer6.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        final ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) obj11;
                        objRememberedValue3 = new h.g.a.l() { // from class: com.waze.ui.x.o
                            @Override // h.g.a.l
                            public final Object invoke(Object obj12) {
                                n nVar2 = (n) obj12;
                                x.f(nVar2, "it");
                                boolean zN = x.n(nVar2, l.f43822a);
                                State state = r7;
                                if (zN) {
                                    kotlinx.coroutines.aj.z(r8, null, null, new t(modalBottomSheetState, state, null, 0), 3);
                                }
                                a.a.q(state).invoke(nVar2);
                                return ab.f48028a;
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue3);
                    }
                    u.i((com.waze.ui.x.g) this.f45866d, (com.waze.ui.x.g) this.f45863a, (h.g.a.l) objRememberedValue3, composer6, 0);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            default:
                d dVar = (d) obj2;
                x.f((c) obj, "<unused var>");
                x.f(dVar, "cta");
                if (x.n(dVar, this.f45865c)) {
                    this.f45866d.invoke();
                } else if (x.n(dVar, this.f45867e)) {
                    this.f45863a.invoke();
                }
                this.f45864b.invoke();
                return ab.f48028a;
        }
    }

    public /* synthetic */ l(MutableIntState mutableIntState, t tVar, h.g.a.l lVar, PaddingValues paddingValues, MutableFloatState mutableFloatState, int i2) {
        this.f45868f = i2;
        this.f45866d = mutableIntState;
        this.f45863a = tVar;
        this.f45864b = lVar;
        this.f45865c = paddingValues;
        this.f45867e = mutableFloatState;
    }

    public /* synthetic */ l(com.waze.bw.c.d.l lVar, com.waze.z.a.b.ab abVar, h.g.a.l lVar2, com.waze.z.a.b.x xVar, LazyListState lazyListState, int i2) {
        this.f45868f = i2;
        this.f45863a = lVar;
        this.f45866d = abVar;
        this.f45864b = lVar2;
        this.f45867e = xVar;
        this.f45865c = lazyListState;
    }

    public /* synthetic */ l(bx bxVar, com.waze.av.b.o oVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, int i2) {
        this.f45868f = i2;
        this.f45864b = bxVar;
        this.f45863a = oVar;
        this.f45865c = context;
        this.f45867e = managedActivityResultLauncher;
        this.f45866d = managedActivityResultLauncher2;
    }

    public /* synthetic */ l(com.waze.ui.x.g gVar, com.waze.ui.x.g gVar2, af afVar, State state, ModalBottomSheetState modalBottomSheetState, int i2) {
        this.f45868f = i2;
        this.f45866d = gVar;
        this.f45863a = gVar2;
        this.f45864b = afVar;
        this.f45867e = state;
        this.f45865c = modalBottomSheetState;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.f45868f = i2;
        this.f45865c = obj;
        this.f45866d = obj2;
        this.f45867e = obj3;
        this.f45863a = obj4;
        this.f45864b = obj5;
    }

    public /* synthetic */ l(String str, c cVar, h hVar, g gVar, h.g.a.p pVar, int i2) {
        this.f45868f = i2;
        this.f45863a = str;
        this.f45865c = cVar;
        this.f45866d = hVar;
        this.f45867e = gVar;
        this.f45864b = pVar;
    }

    public /* synthetic */ l(String str, String str2, c cVar, h hVar, g gVar, int i2) {
        this.f45868f = i2;
        this.f45863a = str;
        this.f45864b = str2;
        this.f45865c = cVar;
        this.f45866d = hVar;
        this.f45867e = gVar;
    }
}
