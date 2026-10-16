package A3;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.H;

/* loaded from: classes.dex */
public abstract class e {
    static {
        H.f39741a.getOrCreateKotlinClass(e.class).getSimpleName();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
