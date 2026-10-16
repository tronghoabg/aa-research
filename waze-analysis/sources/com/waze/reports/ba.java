package com.waze.reports;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.waze.R;
import com.waze.jni.protos.Position;
import com.waze.navigate.gn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33677a;

    public ba(Context context, com.waze.settings.cs csVar, View view) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(csVar, "settingsNavigator");
        h.g.b.x.f(view, "view");
        this.f33677a = context;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [com.waze.map.b.ed, java.lang.Object] */
    static final h.ab a(ba baVar, Runnable runnable, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1226053195, i2, -1, "com.waze.reports.EditPlaceFragmentMapViewHelper.inflateMapIntoComposeView.<anonymous> (EditPlaceFragmentMapViewHelper.kt:25)");
            }
            com.waze.ui.p.i iVarF = com.waze.ui.p.t.f(baVar.f33677a, null, composer, 2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            boolean zChangedInstance = composer.changedInstance(runnable);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new gn(runnable, 15);
                composer.updateRememberedValue(objRememberedValue);
            }
            com.waze.ui.p.t.b(iVarF, com.waze.z.a.be.J(modifierFillMaxSize$default, false, null, (h.g.a.a) objRememberedValue, composer, 6, 15), false, null, false, composer, 384, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.map.b.ed, java.lang.Object] */
    public final void b(Position.IntPosition intPosition) {
        h.g.b.x.f(intPosition, "position");
        com.waze.coroutines.b bVarB = com.waze.map.c.b(new com.waze.map.bc(com.waze.notifications.c.k.i(intPosition), new com.waze.map.az(R.drawable.WazeMap_SelectionMarker), com.waze.map.as.f27963e, com.waze.map.aw.f27972b, null, 0.0f, null, 1008));
        com.waze.map.b.ea eaVar = new com.waze.map.b.ea(false, null, 3);
        com.waze.map.b.co coVar = new com.waze.map.b.co(h.a.i.d(com.waze.notifications.c.k.i(intPosition)), null, 0.0f, 6);
        ?? r4 = this.f33677a;
        com.waze.install.ah.e(r4, eaVar, coVar, false, 4);
        com.waze.install.ah.d(r4, null, null, h.a.i.d(bVarB), null, null, null, 251);
    }

    public final Context c() {
        return (Context) this.f33677a;
    }

    public ba(com.waze.map.b.ed edVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(edVar, "mapViewController");
        h.g.b.x.f(eVar, "logger");
        this.f33677a = edVar;
    }
}
