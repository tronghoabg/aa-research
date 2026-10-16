package D3;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class f extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public static final f f2305i = new f(0);

    @Override // tf.a
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentA;
        int i5 = 2;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new Y9.c(loader, i5)) : null;
            if (eVar != null && (windowLayoutComponentA = eVar.a()) != null) {
                AbstractC3340k.d(loader, "loader");
                Y9.c cVar = new Y9.c(loader, i5);
                int iA = A3.e.a();
                return iA >= 2 ? new F3.d(windowLayoutComponentA) : iA == 1 ? new F3.c(windowLayoutComponentA, cVar) : new F3.a();
            }
        } catch (Throwable unused) {
            g gVar = g.f2306a;
        }
        return null;
    }
}
