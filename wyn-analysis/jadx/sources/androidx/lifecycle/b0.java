package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final I1.a f18657a = new I1.a();

    public final void a() {
        I1.a aVar = this.f18657a;
        if (aVar != null && !aVar.f5280d) {
            aVar.f5280d = true;
            synchronized (aVar.f5277a) {
                try {
                    Iterator it = aVar.f5278b.values().iterator();
                    while (it.hasNext()) {
                        I1.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f5279c.iterator();
                    while (it2.hasNext()) {
                        I1.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f5279c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
