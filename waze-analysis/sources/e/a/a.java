package e.a;

import java.util.IdentityHashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private c f46219a;

    /* renamed from: b, reason: collision with root package name */
    private IdentityHashMap f46220b;

    /* synthetic */ a(c cVar) {
        this.f46219a = cVar;
    }

    private final IdentityHashMap d(int i2) {
        if (this.f46220b == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.f46219a.f46515c.size() + i2);
            this.f46220b = identityHashMap;
            identityHashMap.putAll(this.f46219a.f46515c);
            this.f46219a = null;
        }
        return this.f46220b;
    }

    public final c a() {
        if (this.f46220b != null) {
            this.f46219a = new c(this.f46220b, null);
            this.f46220b = null;
        }
        return this.f46219a;
    }

    public final void b(b bVar) {
        c cVar = this.f46219a;
        if (cVar == null) {
            this.f46220b.remove(bVar);
        } else if (cVar.f46515c.containsKey(bVar)) {
            d(0).remove(bVar);
        }
    }

    public final void c(b bVar, Object obj) {
        d(1).put(bVar, obj);
    }
}
