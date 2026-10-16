package com.waze.settings.tree.views;

import android.view.View;
import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeSettingsView f37650a;

    x(WazeSettingsView wazeSettingsView) {
        Objects.requireNonNull(wazeSettingsView);
        this.f37650a = wazeSettingsView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WazeSettingsView wazeSettingsView = this.f37650a;
        wazeSettingsView.f37607k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        wazeSettingsView.r = ((((View) wazeSettingsView.f37607k.getParent()).getHeight() - ((int) (wazeSettingsView.f37607k.getHeight() * 1.2f))) / 2) - wazeSettingsView.f37607k.getTop();
    }
}
