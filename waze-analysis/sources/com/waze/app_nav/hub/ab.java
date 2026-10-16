package com.waze.app_nav.hub;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.waze.map.ed;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f15239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f15240b;

    public ab(af afVar, View view) {
        this.f15239a = afVar;
        this.f15240b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        h.g.b.x.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        af afVar = this.f15239a;
        if (afVar.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            ed edVarBy = afVar.by();
            Window window = afVar.getWindow();
            h.g.b.x.e(window, "getWindow(...)");
            edVarBy.a(window);
            ad adVar = new ad(afVar);
            afVar.getLifecycle().addObserver(new ac(this.f15240b, adVar));
        }
    }
}
