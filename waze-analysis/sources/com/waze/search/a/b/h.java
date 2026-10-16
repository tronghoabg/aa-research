package com.waze.search.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.search.s;
import com.waze.search.t;
import com.waze.sharedui.utils.o;
import h.a.i;
import h.ab;
import h.c.j;
import h.g.a.p;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f35453a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f35454b = h.g.b(h.h.f48130a, new e(this));

    /* renamed from: c, reason: collision with root package name */
    private final h.f f35455c;

    /* renamed from: d, reason: collision with root package name */
    private ActivityResultLauncher f35456d;

    public h() {
        h hVar = this;
        this.f35453a = h.g.b(h.h.f48132c, new g(hVar, new f(hVar)));
        this.f35455c = org.a.b.b.d.a(hVar);
    }

    public static /* synthetic */ ab d(h hVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1511239314, i2, -1, "com.waze.search.categories.presentation.CategoriesListFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CategoriesListFragment.kt:76)");
            }
            ab abVar = ab.f48028a;
            boolean zChangedInstance = composer.changedInstance(hVar);
            b bVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || bVarRememberedValue == Composer.Companion.getEmpty()) {
                bVarRememberedValue = new b(hVar, null);
                composer.updateRememberedValue(bVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) bVarRememberedValue, composer, 6);
            k kVarB = hVar.g().b();
            List listH = i.h();
            Lifecycle lifecycle = hVar.getLifecycle();
            x.e(lifecycle, "<get-lifecycle>(...)");
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((k<? extends List>) kVarB, listH, lifecycle, (Lifecycle.State) null, (j) null, composer, 48, 12);
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer, 0).h(), null, 2, null);
            com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.CATEGORICAL_SEARCH_MORE_TITLE);
            List list = (List) stateCollectAsStateWithLifecycle.getValue();
            com.waze.search.a.c.g gVarG = hVar.g();
            boolean zChangedInstance2 = composer.changedInstance(gVarG);
            c cVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance2 || cVarRememberedValue == Composer.Companion.getEmpty()) {
                cVarRememberedValue = new c(gVarG, 1, null);
                composer.updateRememberedValue(cVarRememberedValue);
            }
            h.l.f fVar = (h.l.f) cVarRememberedValue;
            com.waze.search.a.c.g gVarG2 = hVar.g();
            boolean zChangedInstance3 = composer.changedInstance(gVarG2);
            c cVarRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance3 || cVarRememberedValue2 == Composer.Companion.getEmpty()) {
                cVarRememberedValue2 = new c(gVarG2, 0);
                composer.updateRememberedValue(cVarRememberedValue2);
            }
            com.waze.search.a.j.a(jVar, list, modifierM1972backgroundbw27NRU$default, (h.g.a.a) fVar, (h.g.a.a) ((h.l.f) cVarRememberedValue2), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final /* synthetic */ void e(h hVar, com.waze.search.d.a.a.a aVar) {
        ActivityResultLauncher activityResultLauncher = null;
        if (x.n(aVar.d(), "parking")) {
            ActivityResultLauncher activityResultLauncher2 = hVar.f35456d;
            if (activityResultLauncher2 == null) {
                x.j("searchLauncher");
            } else {
                activityResultLauncher = activityResultLauncher2;
            }
            Intent intentCreateParkingSearchIntent = NativeManager.createParkingSearchIntent(hVar.getContext());
            x.e(intentCreateParkingSearchIntent, "createParkingSearchIntent(...)");
            activityResultLauncher.launch(intentCreateParkingSearchIntent);
            return;
        }
        o.a((com.waze.shared_infra.o.a) hVar.f35454b.getValue(), aVar.c());
        ActivityResultLauncher activityResultLauncher3 = hVar.f35456d;
        if (activityResultLauncher3 == null) {
            x.j("searchLauncher");
        } else {
            activityResultLauncher = activityResultLauncher3;
        }
        t tVarD = new t().d(aVar.d());
        Context contextRequireContext = hVar.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(tVarD.a(contextRequireContext));
    }

    static final void f(h hVar, ActivityResult activityResult) {
        x.f(activityResult, "it");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            String stringExtra = data != null ? data.getStringExtra("search_results_result_key") : null;
            s sVarA = stringExtra != null ? s.a(stringExtra) : null;
            if (sVarA == s.f36000a || sVarA == s.f36001b) {
                hVar.g().h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.search.a.c.g g() {
        return (com.waze.search.a.c.g) this.f35453a.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f35455c.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final void onAttach(Context context) {
        x.f(context, "context");
        super.onAttach(context);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.waze.search.a.b.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                h.f(this.f35444a, (ActivityResult) obj);
            }
        });
        x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f35456d = activityResultLauncherRegisterForActivityResult;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(426992334, true, new com.waze.v.b(this, 6)));
        return composeView;
    }

    @Override // android.support.v4.app.ar
    public final void onDetach() {
        super.onDetach();
        ActivityResultLauncher activityResultLauncher = this.f35456d;
        if (activityResultLauncher == null) {
            x.j("searchLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.unregister();
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        super.onViewCreated(view, bundle);
        k kVarK = ai.K(g().c(), new d(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ai.m(kVarK, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }
}
