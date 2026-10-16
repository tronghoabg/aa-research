package z3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import v6.l;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4610a extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f48340j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4610a(l lVar, int i5) {
        super(0);
        this.f48339i = i5;
        this.f48340j = lVar;
    }

    @Override // tf.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        switch (this.f48339i) {
            case 0:
                Class<?> clsLoadClass = ((ClassLoader) this.f48340j.f46890a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                AbstractC3340k.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return clsLoadClass;
            default:
                l lVar = this.f48340j;
                Class<?> clsLoadClass2 = ((ClassLoader) lVar.f46890a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                AbstractC3340k.d(clsLoadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z2 = false;
                Method getWindowExtensionsMethod = clsLoadClass2.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class<?> clsLoadClass3 = ((ClassLoader) lVar.f46890a).loadClass("androidx.window.extensions.WindowExtensions");
                AbstractC3340k.d(clsLoadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                AbstractC3340k.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                if (getWindowExtensionsMethod.getReturnType().equals(clsLoadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
