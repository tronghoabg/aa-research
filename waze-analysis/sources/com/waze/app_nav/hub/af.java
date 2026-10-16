package com.waze.app_nav.hub;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.dv;
import com.waze.map.ed;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class af extends android.support.v7.app.o {
    private final h.f aaP;
    private final h.f aaQ;
    private final h.f aaR;
    private com.waze.app_nav.hub.b.i aaS;
    private final bn aaT;
    private final boolean aaU;

    /* renamed from: l, reason: collision with root package name */
    private final bm f15246l;
    private final boolean m;
    private ActivityResultLauncher n;
    private j o;

    public af() {
        af afVar = this;
        h.h hVar = h.h.f48130a;
        this.aaP = h.g.b(hVar, new ae(afVar, 1));
        this.aaQ = h.g.b(hVar, new ae(afVar, 0));
        this.aaR = h.g.b(hVar, new ae(afVar, 2));
        this.aaT = ck.b(null);
        this.aaU = true;
        this.f15246l = bu.c(1, 1, kotlinx.coroutines.a.a.f51272b);
        this.m = true;
    }

    public static final /* synthetic */ com.waze.shared_infra.i.b an(af afVar) {
        return (com.waze.shared_infra.i.b) afVar.aaR.getValue();
    }

    public static /* synthetic */ h.ab ao(af afVar, Composer composer, int i2) {
        int i3 = 2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1782651011, i2, -1, "com.waze.app_nav.hub.WazeHubActivity.addComposablePopUpsLayer.<anonymous>.<anonymous> (WazeHubActivity.kt:124)");
            }
            com.waze.app_nav.hub.b.e eVar = (com.waze.app_nav.hub.b.e) SnapshotStateKt.collectAsState(afVar.aaT, null, null, composer, 48, 2).getValue();
            if (eVar == null) {
                composer.startReplaceGroup(314445602);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(314445603);
                DialogProperties dialogProperties = new DialogProperties(eVar.e(), eVar.e(), false);
                boolean zChangedInstance = composer.changedInstance(eVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.ads.b(eVar, 7);
                    composer.updateRememberedValue(objRememberedValue);
                }
                AndroidDialog_androidKt.Dialog((h.g.a.a) objRememberedValue, dialogProperties, ComposableLambdaKt.rememberComposableLambda(26690220, true, new dv(eVar, i3), composer, 54), composer, 384, 0);
                h.ab abVar = h.ab.f48028a;
                boolean zChangedInstance2 = composer.changedInstance(eVar);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (h.g.a.p) new s(eVar, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue2, composer, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab ap(af afVar, com.waze.app_nav.hub.b.k kVar) {
        com.waze.shared_infra.i.e eVarC = afVar.al().c();
        Objects.toString(kVar);
        eVarC.e("composable popup dismissed model=".concat(kVar.toString()));
        afVar.aaT.e(null);
        afVar.al().b().c(kVar);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void ar(af afVar, boolean z) {
        afVar.al().c().a("dismiss popup called for " + afVar.aaS + ", isRecreate: " + z);
        com.waze.app_nav.hub.b.i iVar = afVar.aaS;
        if (iVar != null) {
            iVar.b(z);
        }
        afVar.aaS = null;
    }

    public static final /* synthetic */ void as(af afVar, com.waze.app_nav.hub.b.i iVar, com.waze.app_nav.hub.b.k kVar) {
        int i2 = 0;
        if (iVar instanceof com.waze.app_nav.hub.b.e) {
            afVar.aaT.e(iVar);
            ((com.waze.app_nav.hub.b.e) iVar).d(new n(afVar, kVar, i2));
        } else {
            if (!(iVar instanceof com.waze.app_nav.hub.b.h)) {
                throw new h.i();
            }
            ((com.waze.app_nav.hub.b.h) iVar).a(new o(afVar, kVar, iVar, i2));
        }
    }

    static final void au(af afVar, j jVar) {
        if (!afVar.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) || jVar == null) {
            return;
        }
        afVar.g(jVar);
    }

    static final void av(af afVar, Boolean bool) {
        if (bool.booleanValue()) {
            com.waze.shared_infra.i.e eVarC = afVar.al().c();
            j jVar = afVar.o;
            if (jVar == null) {
                h.g.b.x.j("activityEntry");
                jVar = null;
            }
            Objects.toString(jVar);
            eVarC.e("activity is stopped, entry=".concat(String.valueOf(jVar)));
            afVar.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed by() {
        return (ed) this.aaQ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.waze.app_nav.hub.j] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.waze.app_nav.hub.j] */
    private final void g(j jVar) {
        ActivityResultLauncher activityResultLauncher = null;
        if (!j()) {
            com.waze.shared_infra.i.e eVarC = al().c();
            ?? r7 = this.o;
            if (r7 == 0) {
                h.g.b.x.j("activityEntry");
            } else {
                activityResultLauncher = r7;
            }
            eVarC.g("launchActivity launcher is disabled selfEntry=" + activityResultLauncher + ", entry=" + jVar);
            return;
        }
        m mVarD = jVar.d();
        m mVar = m.f15354b;
        if (mVarD == mVar) {
            com.waze.shared_infra.i.e eVarC2 = al().c();
            ?? r72 = this.o;
            if (r72 == 0) {
                h.g.b.x.j("activityEntry");
            } else {
                activityResultLauncher = r72;
            }
            eVarC2.e("launchActivity activity is already launched selfEntry=" + activityResultLauncher + ", entry=" + jVar);
            return;
        }
        com.waze.shared_infra.i.e eVarC3 = al().c();
        j jVar2 = this.o;
        if (jVar2 == null) {
            h.g.b.x.j("activityEntry");
            jVar2 = null;
        }
        eVarC3.e("launchActivity selfEntry=" + jVar2 + ", entry=" + jVar);
        jVar.g(mVar);
        Intent intentPutExtra = jVar.b().a(this).putExtra("ARG_ACTIVITY_ENTRY_ID", jVar.e().a());
        h.g.b.x.e(intentPutExtra, "putExtra(...)");
        if (jVar instanceof f) {
            startActivityForResult(intentPutExtra, ((f) jVar).a());
            return;
        }
        ActivityResultLauncher activityResultLauncher2 = this.n;
        if (activityResultLauncher2 == null) {
            h.g.b.x.j("launcher");
        } else {
            activityResultLauncher = activityResultLauncher2;
        }
        activityResultLauncher.launch(intentPutExtra);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ah al() {
        return (ah) this.aaP.getValue();
    }

    protected final void aw() {
        k kVarA = al().a();
        j jVar = this.o;
        if (jVar == null) {
            h.g.b.x.j("activityEntry");
            jVar = null;
        }
        kVarA.d(jVar.e());
    }

    protected boolean j() {
        return this.aaU;
    }

    public boolean k() {
        return this.m;
    }

    @Override // android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        h.g.b.x.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        this.f15246l.c(new r(configuration.orientation, (getResources().getConfiguration().uiMode & 48) == 32));
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (org.a.d.b.a.b() == null) {
            Log.e("Waze", "Application not initialized");
            finishAndRemoveTask();
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        final long longExtra = getIntent().getLongExtra("ARG_ACTIVITY_ENTRY_ID", 0L);
        h hVarA = al().a().a(new ag(longExtra));
        if (hVarA == null) {
            hVarA = new h(getClass());
        }
        this.o = hVarA;
        com.waze.shared_infra.i.e eVarC = al().c();
        j jVar = this.o;
        j jVar2 = null;
        if (jVar == null) {
            h.g.b.x.j("activityEntry");
            jVar = null;
        }
        Objects.toString(jVar);
        eVarC.e("activity created, entry=".concat(String.valueOf(jVar)));
        j jVar3 = this.o;
        if (jVar3 == null) {
            h.g.b.x.j("activityEntry");
        } else {
            jVar2 = jVar3;
        }
        FlowLiveDataConversions.asLiveData$default(jVar2.f(), (h.c.j) null, 0L, 3, (Object) null).observe(this, new p(this, 0));
        this.n = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.waze.app_nav.hub.q
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                h.g.b.x.f(activityResult, "it");
                this.f15365a.al().c().e("launched activity is done selfEntryId=" + longExtra + ", resultCode=" + activityResult.getResultCode());
            }
        });
    }

    @Override // android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.waze.shared_infra.i.e eVarC = al().c();
        j jVar = this.o;
        j jVar2 = null;
        if (jVar == null) {
            h.g.b.x.j("activityEntry");
            jVar = null;
        }
        eVarC.e("activity destroyed, entry=" + jVar + ", isFinishing=" + isFinishing());
        if (isFinishing()) {
            j jVar3 = this.o;
            if (jVar3 == null) {
                h.g.b.x.j("activityEntry");
            } else {
                jVar2 = jVar3;
            }
            jVar2.g(m.f15353a);
        }
        com.waze.app_nav.hub.b.i iVar = this.aaS;
        if (iVar == null || !(iVar instanceof com.waze.app_nav.hub.b.h)) {
            return;
        }
        al().c().e("activity destroyed, clearing popup on dismiss listener");
        ((com.waze.app_nav.hub.b.h) iVar).b(true);
    }

    @Override // android.support.v7.app.o, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        af afVar = this;
        FlowLiveDataConversions.asLiveData$default(new z(al().a().b(), 1), (h.c.j) null, 0L, 3, (Object) null).observe(afVar, new p(this, 1));
        this.f15246l.c(new r(getResources().getConfiguration().orientation, (getResources().getConfiguration().uiMode & 48) == 32));
        int i2 = 3;
        if (k()) {
            aj.z(LifecycleOwnerKt.getLifecycleScope(afVar), null, null, new aa(this, null), 3);
        }
        View viewFindViewById = findViewById(R.id.content);
        h.g.b.x.c(viewFindViewById);
        if (!viewFindViewById.isLaidOut() || viewFindViewById.isLayoutRequested()) {
            viewFindViewById.addOnLayoutChangeListener(new ab(this, viewFindViewById));
        } else if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            ed edVarBy = by();
            Window window = getWindow();
            h.g.b.x.e(window, "getWindow(...)");
            edVarBy.a(window);
            getLifecycle().addObserver(new ac(viewFindViewById, new ad(this)));
        }
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1782651011, true, new dv(this, i2)));
        addContentView(composeView, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        j jVar = (j) h.a.i.U((List) al().a().b().d());
        if (jVar != null) {
            g(jVar);
        }
    }
}
