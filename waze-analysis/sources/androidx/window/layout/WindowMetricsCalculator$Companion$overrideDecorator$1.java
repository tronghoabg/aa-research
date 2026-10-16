package androidx.window.layout;

import h.g.a.l;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends u implements l<WindowMetricsCalculator, WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // h.g.a.l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        x.f(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
