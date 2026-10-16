package com.waze.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f35999a;

    public r() {
        h.g.b.x.e(com.waze.shared_infra.i.a.d("SearchFragment"), "create(...)");
        this.f35999a = org.a.b.b.d.a(this);
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f35999a.getValue();
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
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-352414672, true, new com.waze.v.b(this, 4)));
        return composeView;
    }
}
