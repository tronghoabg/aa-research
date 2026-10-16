package org.a.b.b;

import android.content.ComponentCallbacks;
import android.support.v4.app.ar;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.LifecycleOwner;
import com.waze.uid.state_impl.email.n;
import e.a.dw;
import h.f;
import h.g;
import h.g.b.x;
import k.a.k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d {
    public static final f a(ar arVar) {
        x.f(arVar, "<this>");
        return g.a(new n(arVar, 18));
    }

    public static final f b(ComponentActivity componentActivity) {
        x.f(componentActivity, "<this>");
        return g.a(new n(componentActivity, 17));
    }

    public static final f c(ComponentActivity componentActivity) {
        x.f(componentActivity, "<this>");
        return g.a(new n(componentActivity, 16));
    }

    public static final org.a.d.k.b d(ComponentCallbacks componentCallbacks, LifecycleOwner lifecycleOwner) {
        x.f(componentCallbacks, "<this>");
        x.f(lifecycleOwner, "owner");
        org.a.d.k.b bVarC = k.i(componentCallbacks).c(org.a.b.c.a.c(componentCallbacks), org.a.b.c.a.d(componentCallbacks), componentCallbacks);
        bVarC.l(new b(lifecycleOwner));
        x.f(lifecycleOwner, "<this>");
        x.f(bVarC, "scope");
        lifecycleOwner.getLifecycle().addObserver(new c(bVarC));
        return bVarC;
    }

    public static org.a.d.a e() {
        dw.e();
        return org.a.d.b.a.a();
    }

    public static final void f(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1231974547, 0, -1, "org.koin.compose.stable.rememberStableParametersDefinition (StableHolders.kt:13)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new org.a.c.b.a();
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
