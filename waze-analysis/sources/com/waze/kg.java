package com.waze;

import android.view.ViewTreeObserver;
import com.waze.view.pages.LinePageIndicator;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinePageIndicator f25037a;

    kg(kj kjVar, LinePageIndicator linePageIndicator) {
        this.f25037a = linePageIndicator;
        Objects.requireNonNull(kjVar);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        LinePageIndicator linePageIndicator = this.f25037a;
        linePageIndicator.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        linePageIndicator.onPageScrolled(0, 0.0f, 0);
    }
}
