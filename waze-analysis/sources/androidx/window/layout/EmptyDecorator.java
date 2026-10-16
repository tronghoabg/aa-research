package androidx.window.layout;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        x.f(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
