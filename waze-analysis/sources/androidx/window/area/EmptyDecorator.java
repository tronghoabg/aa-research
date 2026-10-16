package androidx.window.area;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class EmptyDecorator implements WindowAreaControllerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.area.WindowAreaControllerDecorator
    public WindowAreaController decorate(WindowAreaController windowAreaController) {
        x.f(windowAreaController, "controller");
        return windowAreaController;
    }
}
