package com.waze.settings;

import android.view.View;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fx implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f37282a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WazeSettingsView f37283b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.br f37284c;

    public fx(View view, WazeSettingsView wazeSettingsView, kotlinx.coroutines.br brVar) {
        this.f37282a = view;
        this.f37283b = wazeSettingsView;
        this.f37284c = brVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h.g.b.x.f(view, "view");
        this.f37282a.removeOnAttachStateChangeListener(this);
        WazeSettingsView wazeSettingsView = this.f37283b;
        boolean zIsAttachedToWindow = wazeSettingsView.isAttachedToWindow();
        kotlinx.coroutines.br brVar = this.f37284c;
        if (zIsAttachedToWindow) {
            wazeSettingsView.addOnAttachStateChangeListener(new fy(wazeSettingsView, brVar));
        } else {
            brVar.s(null);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        h.g.b.x.f(view, "view");
    }
}
