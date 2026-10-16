package com.waze.navigate.location_preview;

import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.waze.map.b.co;
import com.waze.map.b.ct;
import com.waze.map.b.dz;
import com.waze.map.b.ed;
import com.waze.search.v2.cu;
import com.waze.strings.DisplayStrings;
import java.net.UnknownHostException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public /* synthetic */ class ba {
    public /* synthetic */ ba(byte[] bArr) {
    }

    static h.ab c(ed edVar, kotlinx.coroutines.b.bq bqVar, com.waze.shared_infra.h.c cVar, int i2, int i3, Composer composer) {
        j(edVar, bqVar, cVar, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public static com.waze.navigate.b.g e() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = com.waze.navigate.b.g.f31068a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.navigate.b.g.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.navigate.b.g.class);
        }
        return (com.waze.navigate.b.g) bVarC.a(mVar, null, null);
    }

    public static com.waze.network.b.q f(UnknownHostException unknownHostException) {
        Object next;
        h.g.b.x.f(unknownHostException, "clientNetworkException");
        String message = unknownHostException.getMessage();
        String str = message;
        if (str == null || str.length() == 0) {
            return new com.waze.network.b.l(message);
        }
        Iterator it = com.waze.network.b.q.f32091b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = ((com.waze.network.b.q) next).f32092c;
            if (str2 != null ? h.n.o.F(str, str2, false) : false) {
                break;
            }
        }
        com.waze.network.b.q qVar = (com.waze.network.b.q) next;
        return qVar == null ? new com.waze.network.b.l(message) : qVar;
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null) ? false : true;
    }

    public static com.waze.i.s h(com.waze.authentication.ax axVar, i.b.l.ao aoVar) {
        h.g.b.x.f(axVar, "<this>");
        h.g.b.x.f(aoVar, "clientInfo");
        boolean z = axVar instanceof com.waze.authentication.k;
        com.waze.i.q qVarNewBuilder = com.waze.i.s.newBuilder();
        if (z) {
            com.waze.i.ad adVarNewBuilder = com.waze.i.ae.newBuilder();
            com.waze.authentication.k kVar = (com.waze.authentication.k) axVar;
            adVarNewBuilder.a(kVar.a());
            adVarNewBuilder.b(kVar.b());
            qVarNewBuilder.b(adVarNewBuilder.build());
        } else {
            if (!(axVar instanceof com.waze.authentication.j)) {
                throw new h.i();
            }
            qVarNewBuilder.c(((com.waze.authentication.j) axVar).a());
        }
        qVarNewBuilder.a(aoVar);
        com.waze.i.s sVarBuild = qVarNewBuilder.build();
        h.g.b.x.e(sVarBuild, "build(...)");
        return sVarBuild;
    }

    public static boolean i(ba baVar) {
        if (h.g.b.x.n(baVar, com.waze.network.aj.f31881a)) {
            return false;
        }
        if ((baVar instanceof com.waze.network.ah) || baVar == null) {
            return true;
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(final ed edVar, final kotlinx.coroutines.b.bq bqVar, com.waze.shared_infra.h.c cVar, int i2, Composer composer, int i3) {
        int i4;
        Composer composer2;
        com.waze.shared_infra.h.c cVar2 = cVar;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1933953993);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(edVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(bqVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(cVar2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1933953993, i4, -1, "com.waze.navigate.location_preview.WazeMapLayout (LocationPreviewActivity.kt:342)");
            }
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            h.ab abVar = h.ab.f48028a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(edVar) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(cVar2);
            boolean z = (i4 & 7168) == 2048;
            l lVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || lVarRememberedValue == Composer.Companion.getEmpty()) {
                cVar2 = cVar;
                lVarRememberedValue = new l(edVar, context, cVar, i2, null);
                composerStartRestartGroup.updateRememberedValue(lVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) lVarRememberedValue, composerStartRestartGroup, 6);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(cVar2) | composerStartRestartGroup.changedInstance(edVar);
            m mVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || mVarRememberedValue == Composer.Companion.getEmpty()) {
                mVarRememberedValue = new m(cVar2, edVar, null);
                composerStartRestartGroup.updateRememberedValue(mVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(edVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) mVarRememberedValue, composerStartRestartGroup, i4 & 14);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(edVar) | composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changedInstance(bqVar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new h.g.a.l() { // from class: com.waze.navigate.location_preview.j
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        Context context2 = (Context) obj;
                        h.g.b.x.f(context2, "context");
                        ComposeView composeView = new ComposeView(context2, null, 0, 6, null);
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1185118580, true, new com.waze.beacons.a.c(edVar, 7)));
                        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ar(bqVar, composeView, (h.c.e) null, 1), 3);
                        return composeView;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            AndroidView_androidKt.AndroidView((h.g.a.l) objRememberedValue, modifierFillMaxSize$default, null, composer2, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k(edVar, bqVar, cVar2, i2, i3, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(ed edVar, Context context, com.waze.shared_infra.h.c cVar, int i2) {
        Rect rect;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = context.getResources().getConfiguration().orientation;
        com.waze.shared_infra.h.c cVarF = cVar.f(new com.waze.shared_infra.h.c(0.0019795030493696686d, -0.0019795030493696686d));
        com.waze.shared_infra.h.c cVarF2 = cVar.f(new com.waze.shared_infra.h.c(0.0019795030493696686d, 0.0019795030493696686d));
        com.waze.shared_infra.h.c cVarF3 = cVar.f(new com.waze.shared_infra.h.c(-0.0019795030493696686d, -0.0019795030493696686d));
        com.waze.shared_infra.h.c cVarF4 = cVar.f(new com.waze.shared_infra.h.c(-0.0019795030493696686d, 0.0019795030493696686d));
        if (i3 == 1) {
            rect = new Rect();
            rect.left = 0;
            rect.top = 0;
            rect.right = displayMetrics.widthPixels;
            rect.bottom = i2;
        } else {
            rect = new Rect();
            float f2 = displayMetrics.density;
            int i4 = cu.f36302a;
            rect.left = h.h.a.b(f2 * 44.0f) + displayMetrics.heightPixels;
            rect.top = 0;
            rect.right = displayMetrics.widthPixels;
            rect.bottom = displayMetrics.heightPixels;
        }
        com.waze.install.ah.e(edVar, new dz(rect), new co(h.a.i.i(cVarF, cVarF2, cVarF3, cVarF4), ct.f28166b, 0.0f, 4), false, 12);
    }

    private ba() {
        throw null;
    }
}
