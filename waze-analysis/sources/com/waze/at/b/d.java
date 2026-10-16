package com.waze.at.b;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.av;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.waze.shared_infra.r.p;
import h.ab;
import h.g;
import h.g.b.x;
import h.h;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f15661a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f15662b;

    public d() {
        d dVar = this;
        this.f15661a = org.a.b.b.d.a(dVar);
        this.f15662b = g.b(h.f48132c, new c(dVar, new b(dVar)));
    }

    public static /* synthetic */ ab c(d dVar) {
        dVar.e().e();
        return ab.f48028a;
    }

    public static /* synthetic */ ab d(d dVar) {
        dVar.e().f();
        return ab.f48028a;
    }

    private final f e() {
        return (f) this.f15662b.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f15661a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        OnBackPressedDispatcher onBackPressedDispatcher;
        x.f(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("isLoggedInCurrentSession") : false;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("appType")) == null) {
            string = "WAZE";
        }
        p pVar = p.f37983a;
        p pVar2 = (p) Enum.valueOf(p.class, string);
        av activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.addCallback(viewLifecycleOwner, new a());
        }
        ch chVarD = e().d(z, pVar2);
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-345923415, true, new com.waze.v.a(chVarD, this, 7, null)));
        return composeView;
    }
}
