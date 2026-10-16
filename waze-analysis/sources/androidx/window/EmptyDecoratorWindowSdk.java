package androidx.window;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class EmptyDecoratorWindowSdk implements WindowSdkExtensionsDecorator {
    public static final EmptyDecoratorWindowSdk INSTANCE = new EmptyDecoratorWindowSdk();

    private EmptyDecoratorWindowSdk() {
    }

    @Override // androidx.window.WindowSdkExtensionsDecorator
    public WindowSdkExtensions decorate(WindowSdkExtensions windowSdkExtensions) {
        x.f(windowSdkExtensions, "windowSdkExtensions");
        return windowSdkExtensions;
    }
}
