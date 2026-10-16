package k1;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: k1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3126m {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f38846a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f38847b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f38848c = new HashMap();

    public C3126m(Runnable runnable) {
        this.f38846a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f38847b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.V) ((InterfaceC3127n) it.next())).f18344a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC3127n interfaceC3127n) {
        this.f38847b.remove(interfaceC3127n);
        C3125l c3125l = (C3125l) this.f38848c.remove(interfaceC3127n);
        if (c3125l != null) {
            c3125l.f38842a.c(c3125l.f38843b);
            c3125l.f38843b = null;
        }
        this.f38846a.run();
    }
}
