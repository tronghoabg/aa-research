package R4;

import Y4.m;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Set f10255a = Collections.newSetFromMap(new WeakHashMap());

    @Override // R4.e
    public final void a() {
        Iterator it = m.d(this.f10255a).iterator();
        while (it.hasNext()) {
            ((V4.a) it.next()).getClass();
        }
    }

    @Override // R4.e
    public final void b() {
        Iterator it = m.d(this.f10255a).iterator();
        while (it.hasNext()) {
            ((V4.a) it.next()).getClass();
        }
    }

    @Override // R4.e
    public final void onDestroy() {
        Iterator it = m.d(this.f10255a).iterator();
        while (it.hasNext()) {
            ((V4.a) it.next()).getClass();
        }
    }
}
