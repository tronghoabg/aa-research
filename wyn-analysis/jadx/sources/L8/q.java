package L8;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class q implements O9.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f7026a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f7027b;

    public final synchronized void a() {
        try {
            Iterator it = this.f7026a.iterator();
            while (it.hasNext()) {
                this.f7027b.add(((O9.b) it.next()).get());
            }
            this.f7026a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O9.b
    public final Object get() {
        if (this.f7027b == null) {
            synchronized (this) {
                try {
                    if (this.f7027b == null) {
                        this.f7027b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f7027b);
    }
}
