package com.waze.uid.c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends be {

    /* renamed from: a, reason: collision with root package name */
    public com.waze.uid.f.g f44431a;

    public x() {
        super(0, null, com.waze.uid.activities.e.f44087a, false, null, 26);
    }

    public final com.waze.uid.f.g a() {
        com.waze.uid.f.g gVar = this.f44431a;
        if (gVar != null) {
            return gVar;
        }
        h.g.b.x.j("viewModel");
        return null;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        com.waze.uid.f.g gVar = (com.waze.uid.f.g) new ViewModelProvider(this).get(com.waze.uid.f.g.class);
        h.g.b.x.f(gVar, "<set-?>");
        this.f44431a = gVar;
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1937746795, true, new com.waze.main_screen.o(this, 13)));
        return composeView;
    }
}
