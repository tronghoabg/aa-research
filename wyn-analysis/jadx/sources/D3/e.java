package D3;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import z3.C4610a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f2302a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9.c f2303b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.l f2304c;

    public e(ClassLoader classLoader, Y9.c cVar) {
        this.f2302a = classLoader;
        this.f2303b = cVar;
        this.f2304c = new v6.l(classLoader);
    }

    public final WindowLayoutComponent a() {
        v6.l lVar = this.f2304c;
        lVar.getClass();
        boolean zB = false;
        try {
            new C4610a(lVar, 0).invoke();
            if (A6.h.Q("WindowExtensionsProvider#getWindowExtensions is not valid", new C4610a(lVar, 1)) && A6.h.Q("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && A6.h.Q("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = A3.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (A6.h.Q("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return A6.h.Q("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
