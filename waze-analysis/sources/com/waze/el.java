package com.waze;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class el extends com.waze.ifs.ui.a implements org.a.d.a.b, org.a.a.b.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23656h = 0;
    private final h.f A;
    private final h.f B;
    private final h.f C;
    private final h.f D;
    private final h.f E;
    private final h.f F;
    private final h.f G;
    private final ActivityResultLauncher H;
    private final ActivityResultLauncher I;
    private final ActivityResultLauncher J;
    private final h.f K;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f23657f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f23658g;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f23659k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f23660l;
    private final h.f m;
    private final h.f n;
    private final h.f o;
    private final h.f p;
    private final h.f q;
    private final h.f r;
    private final h.f s;
    private final h.f t;
    private final h.f u;
    private final h.f v;
    private final h.f z;

    public el() {
        el elVar = this;
        this.f23657f = org.a.b.b.d.b(elVar);
        h.h hVar = h.h.f48132c;
        this.f23658g = h.g.b(hVar, new ek(elVar, 1));
        this.f23659k = h.g.b(hVar, new ek(elVar, 0));
        this.f23660l = h.g.b(hVar, new ek(elVar, 2));
        el elVar2 = this;
        h.h hVar2 = h.h.f48130a;
        this.m = h.g.b(hVar2, new du((Object) elVar2, 8));
        this.n = h.g.b(hVar2, new du((Object) elVar2, 9));
        this.o = h.g.b(hVar2, new du((Object) elVar2, 10));
        this.p = h.g.b(hVar2, new du((Object) elVar2, 11));
        this.q = h.g.b(hVar2, new du((Object) elVar2, 12));
        this.r = h.g.b(hVar2, new du((Object) elVar2, 13));
        this.s = h.g.b(hVar2, new du((Object) elVar2, 14));
        this.t = h.g.b(hVar2, new du((Object) elVar2, 15));
        this.u = h.g.b(hVar2, new du((Object) elVar2, 16));
        this.v = h.g.b(hVar2, new du((Object) elVar2, 3));
        this.z = h.g.b(hVar2, new du((Object) elVar2, 4));
        this.A = h.g.b(hVar2, new du((Object) elVar2, 5));
        this.B = h.g.b(hVar2, new du((Object) elVar2, 6));
        this.C = h.g.b(hVar2, new du((Object) elVar2, 7));
        el elVar3 = this;
        h.g.b(hVar2, new du((Object) elVar3, 17));
        this.D = h.g.b(hVar2, new du((Object) elVar3, 18));
        this.E = h.g.b(hVar2, new du((Object) elVar3, 19));
        this.F = h.g.b(hVar2, new du((Object) elVar3, 20));
        this.G = h.g.b(hVar2, new ln(elVar3, 1));
        this.H = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 1));
        this.I = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 0));
        this.J = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 2));
        this.K = h.g.a(new com.airbnb.lottie.b.v(this, 6));
    }

    public static /* synthetic */ h.ab ad(el elVar, com.waze.install.o oVar) {
        elVar.o().a(oVar.a());
        elVar.q(oVar.a());
        return h.ab.f48028a;
    }

    static final h.ab ae(el elVar, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        h.g.b.x.f(animatedContentScope, "$this$composable");
        h.g.b.x.f(navBackStackEntry, "backStackEntry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-226063404, i2, -1, "com.waze.MainActivityExt.forceUpgradeRoute.<anonymous> (MainActivityExt.kt:295)");
        }
        byte[] bArr = null;
        int i3 = 1;
        Object value = SnapshotStateKt.collectAsState(elVar.n().b(), null, composer, 0, 1).getValue();
        com.waze.install.o oVar = value instanceof com.waze.install.o ? (com.waze.install.o) value : null;
        if (oVar == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return h.ab.f48028a;
        }
        h.ab abVar = h.ab.f48028a;
        boolean zChangedInstance = composer.changedInstance(navBackStackEntry) | composer.changedInstance(elVar) | composer.changed(oVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (h.g.a.p) new ed(navBackStackEntry, elVar, oVar, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue, composer, 6);
        boolean zB = oVar.b();
        boolean zChangedInstance2 = composer.changedInstance(elVar) | composer.changed(oVar);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new com.waze.a.aa(elVar, oVar, i3, bArr);
            composer.updateRememberedValue(objRememberedValue2);
        }
        com.waze.ui.j.h.i(zB, (h.g.a.a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return abVar;
    }

    static final h.ab af(el elVar, Composer composer, int i2) {
        int i3 = 1;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241405868, i2, -1, "com.waze.MainActivityExt.initMainContentCompose.<anonymous> (MainActivityExt.kt:241)");
            }
            elVar.p(composer, 0);
            com.waze.car_lib.r.cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1487637352, true, new dv(elVar, i3), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final void ag(el elVar, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        elVar.n().f();
    }

    static final void ah(el elVar, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        elVar.n().g();
    }

    static final void ai(el elVar, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        elVar.n().e();
    }

    static final h.ab aj(el elVar, int i2, Composer composer) {
        elVar.p(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final co n() {
        return (co) this.f23660l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.install.a.a o() {
        return (com.waze.install.a.a) this.F.getValue();
    }

    private final void p(Composer composer, int i2) {
        int i3;
        int iH;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1956542534);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1956542534, i3, -1, "com.waze.MainActivityExt.UpdateMainContentViewLayoutParams (MainActivityExt.kt:375)");
            }
            boolean z = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
            if (Dp.m11163compareTo0680j_4(PaddingKt.calculateStartPadding(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0), (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())), 0.0f) > 0) {
                composerStartRestartGroup.startReplaceGroup(-357148794);
                iH = (int) com.waze.z.a.be.H(16.0f, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-357048075);
                composerStartRestartGroup.endReplaceGroup();
                iH = 0;
            }
            int iH2 = (int) com.waze.z.a.be.H(PaddingKt.calculateStartPadding(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0), (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())), composerStartRestartGroup, 0);
            int iH3 = (int) com.waze.z.a.be.H(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composerStartRestartGroup, 6), (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2707calculateTopPaddingD9Ej5fM(), composerStartRestartGroup, 0);
            int i6 = iH2 + iH;
            Integer numValueOf = Integer.valueOf(i6);
            Boolean boolValueOf = Boolean.valueOf(z);
            Integer numValueOf2 = Integer.valueOf(iH3);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(iH3) | composerStartRestartGroup.changed(z) | composerStartRestartGroup.changed(i6);
            dy dyVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || dyVarRememberedValue == Composer.Companion.getEmpty()) {
                dyVarRememberedValue = new dy(this, iH3, z, i6, null);
                composerStartRestartGroup.updateRememberedValue(dyVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(numValueOf, boolValueOf, numValueOf2, (h.g.a.p) dyVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(this, i2, i5));
        }
    }

    private final void q(String str) {
        try {
            Uri uri = Uri.parse(str);
            h.g.b.x.e(uri, "parse(...)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            com.waze.shared_infra.i.h.c("forceUpgrade: failed to open Play Store with url ".concat(String.valueOf(str)));
        }
    }

    protected final cq K() {
        return (cq) this.r.getValue();
    }

    protected final ez L() {
        return (ez) this.f23659k.getValue();
    }

    protected final NativeManager M() {
        return (NativeManager) this.n.getValue();
    }

    protected final lm N() {
        return (lm) this.o.getValue();
    }

    public final com.waze.app_nav.a.e O() {
        Object next;
        List listX = bv().x();
        h.g.b.x.e(listX, "getFragments(...)");
        Iterator it = listX.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((android.support.v4.app.ar) next) instanceof com.waze.app_nav.a.t) {
                break;
            }
        }
        com.waze.app_nav.a.t tVar = next instanceof com.waze.app_nav.a.t ? (com.waze.app_nav.a.t) next : null;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    protected final com.waze.app_nav.hub.b.k Q() {
        return (com.waze.app_nav.hub.b.k) this.K.getValue();
    }

    protected final com.waze.favorites.k R() {
        return (com.waze.favorites.k) this.p.getValue();
    }

    protected final com.waze.google_assistant.aa S() {
        return (com.waze.google_assistant.aa) this.t.getValue();
    }

    protected final com.waze.google_assistant.ah T() {
        return (com.waze.google_assistant.ah) this.q.getValue();
    }

    protected final com.waze.as.a V() {
        return (com.waze.as.a) this.z.getValue();
    }

    protected final com.waze.map.b.ai W() {
        return (com.waze.map.b.ai) this.B.getValue();
    }

    protected final com.waze.modules.navigation.bp X() {
        return (com.waze.modules.navigation.bp) this.C.getValue();
    }

    protected final com.waze.navigate.eo Y() {
        return (com.waze.navigate.eo) this.s.getValue();
    }

    protected final com.waze.sdk.bd Z() {
        return (com.waze.sdk.bd) this.m.getValue();
    }

    protected final com.waze.bw.c.a.c aa() {
        return (com.waze.bw.c.a.c) this.u.getValue();
    }

    protected final com.waze.tide.o ab() {
        return (com.waze.tide.o) this.E.getValue();
    }

    protected final com.waze.view.popups.b.m ac() {
        return (com.waze.view.popups.b.m) this.D.getValue();
    }

    protected final void ak() {
    }

    public /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    @Override // org.a.d.a.b
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f23657f.getValue();
    }

    public /* synthetic */ void m() {
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        org.chromium.support_lib_boundary.a.b.e(this, l());
        super.onCreate(bundle);
        android.support.v4.app.ch chVarU = bv().u();
        List listX = bv().x();
        h.g.b.x.e(listX, "getFragments(...)");
        List<android.support.v4.app.ar> list = listX;
        if ((list instanceof Collection) && list.isEmpty()) {
            chVarU.q(R.id.mainContent, new com.waze.app_nav.a.t());
        } else {
            for (android.support.v4.app.ar arVar : list) {
                if ((arVar instanceof com.waze.app_nav.a.t) && ((com.waze.app_nav.a.t) arVar).isAdded()) {
                    break;
                }
            }
            chVarU.q(R.id.mainContent, new com.waze.app_nav.a.t());
        }
        chVarU.l();
        el elVar = this;
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(elVar), null, null, new ck(this, (h.c.e) null, 5), 3);
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(elVar), null, null, new ck(this, (h.c.e) null, 6, (byte[]) null), 3);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected void onPause() {
        super.onPause();
        V().c();
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        el elVar = this;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(FlowExtKt.flowWithLifecycle$default(((ct) this.G.getValue()).b(), getLifecycle(), null, 2, null), new eh(this, null, 1, null)), LifecycleOwnerKt.getLifecycleScope(elVar));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(FlowExtKt.flowWithLifecycle$default(n().b(), getLifecycle(), null, 2, null), new eh(this, (h.c.e) null, 0)), LifecycleOwnerKt.getLifecycleScope(elVar));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(FlowExtKt.flowWithLifecycle$default(kotlinx.coroutines.b.ai.F(((com.waze.navigate.dg) this.A.getValue()).ag(), ((com.waze.as.d) this.v.getValue()).a(), new ei(this, null)), getLifecycle(), null, 2, null), new ej(this, (h.c.e) null, 0)), LifecycleOwnerKt.getLifecycleScope(elVar));
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected void onResume() {
        super.onResume();
        V().b();
    }
}
