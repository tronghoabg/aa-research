package androidx.window;

import androidx.window.core.ExtensionsUtil;
import h.g.b.o;
import h.g.b.x;
import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class WindowSdkExtensions {
    public static final Companion Companion = new Companion(null);
    private static WindowSdkExtensionsDecorator decorator = EmptyDecoratorWindowSdk.INSTANCE;
    private final int extensionVersion = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();

    public static final WindowSdkExtensions getInstance() {
        return Companion.getInstance();
    }

    public int getExtensionVersion() {
        return this.extensionVersion;
    }

    public final void requireExtensionVersion$window(j jVar) {
        x.f(jVar, "range");
        int iA = jVar.a();
        int iB = jVar.b();
        int extensionVersion = getExtensionVersion();
        if (iA > extensionVersion || extensionVersion > iB) {
            throw new UnsupportedOperationException("This API requires extension version " + jVar + ", but the device is on " + getExtensionVersion());
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WindowSdkExtensions getInstance() {
            return WindowSdkExtensions.decorator.decorate(new WindowSdkExtensions() { // from class: androidx.window.WindowSdkExtensions$Companion$getInstance$1
            });
        }

        public final void overrideDecorator(WindowSdkExtensionsDecorator windowSdkExtensionsDecorator) {
            x.f(windowSdkExtensionsDecorator, "overridingDecorator");
            WindowSdkExtensions.decorator = windowSdkExtensionsDecorator;
        }

        public final void reset() {
            WindowSdkExtensions.decorator = EmptyDecoratorWindowSdk.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void requireExtensionVersion$window(int i2) {
        if (getExtensionVersion() >= i2) {
            return;
        }
        throw new UnsupportedOperationException("This API requires extension version " + i2 + ", but the device is on " + getExtensionVersion());
    }
}
