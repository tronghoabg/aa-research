package com.waze.uid.c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends be {
    public ad() {
        super(0, null, null, false, null, 30);
    }

    public static /* synthetic */ h.ab a(ad adVar) {
        e(com.waze.uid.stats.h.f44748d);
        adVar.j(new com.waze.uid.state_impl.b.b(InstallParameters.Community.GOOGLE));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab b(ad adVar) {
        e(com.waze.uid.stats.h.f44746b);
        adVar.j(new com.waze.uid.state_impl.b.b(InstallParameters.Community.EMAIL));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(ad adVar) {
        e(com.waze.uid.stats.h.f44747c);
        adVar.d();
        return h.ab.f48028a;
    }

    private static final void e(com.waze.uid.stats.h hVar) {
        com.waze.uid.d.q.f44463a.a().c().a(hVar, com.waze.uid.stats.p.f44779a, com.waze.uid.stats.o.f44774a);
    }

    @Override // com.waze.uid.c.be
    public final boolean d() {
        e(com.waze.uid.stats.h.f44745a);
        return false;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        if (bundle == null) {
            com.waze.uid.d.q.f44463a.a().c().b(com.waze.uid.stats.p.f44779a, com.waze.uid.stats.o.f44774a);
        }
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1075015505, true, new com.waze.main_screen.o(this, 15)));
        return composeView;
    }
}
