package com.waze.cb;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.av;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import com.waze.R;
import com.waze.location.af;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends com.waze.app_nav.hub.service.d {
    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        x.f(layoutInflater, "inflater");
        Object objD = com.waze.app_nav.hub.service.k.f15395a.a().a(a()).d();
        if (true != (objD instanceof k)) {
            objD = null;
        }
        k kVar = (k) objD;
        if (kVar == null) {
            throw new RuntimeException("invalid arguments class");
        }
        av activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(!com.waze.shared_infra.i.h.B(getActivity()));
        }
        requireActivity().getWindow().setNavigationBarContrastEnforced(false);
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setBackgroundColor(ContextCompat.getColor(composeView.getContext(), R.color.background_default));
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-106465924, true, new af(kVar, 9)));
        return composeView;
    }
}
