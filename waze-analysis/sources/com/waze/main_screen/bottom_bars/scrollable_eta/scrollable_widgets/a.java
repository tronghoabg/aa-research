package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.text.Layout;
import android.view.ViewTreeObserver;
import com.waze.sharedui.views.OvalButton;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AddAStopWidget f26018a;

    a(AddAStopWidget addAStopWidget) {
        Objects.requireNonNull(addAStopWidget);
        this.f26018a = addAStopWidget;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AddAStopWidget addAStopWidget = this.f26018a;
        Layout layout = addAStopWidget.f26009d.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        addAStopWidget.f26009d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        addAStopWidget.f26016k = 2;
        if (addAStopWidget.f26012g.size() > addAStopWidget.f26016k) {
            ((OvalButton) addAStopWidget.f26012g.get(addAStopWidget.f26016k)).setVisibility(8);
        }
    }
}
