package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import w0.C4349a;

/* renamed from: u0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C4201y implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f46409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.c f46410b;

    public ComponentCallbacks2C4201y(kotlin.jvm.internal.G g9, w0.c cVar) {
        this.f46409a = g9;
        this.f46410b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC3340k.e(configuration, "configuration");
        kotlin.jvm.internal.G g9 = this.f46409a;
        Configuration configuration2 = (Configuration) g9.f39740a;
        int iUpdateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        Iterator it = this.f46410b.f47272a.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3340k.d(next, "it.next()");
            C4349a c4349a = (C4349a) ((WeakReference) ((Map.Entry) next).getValue()).get();
            if (c4349a == null || Configuration.needNewResources(iUpdateFrom, c4349a.f47269b)) {
                it.remove();
            }
        }
        g9.f39740a = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f46410b.f47272a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        this.f46410b.f47272a.clear();
    }
}
