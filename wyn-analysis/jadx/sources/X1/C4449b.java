package x1;

import ff.o;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4449b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f47646a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f47647b;

    public C4449b(LinkedHashMap linkedHashMap, boolean z2) {
        this.f47646a = linkedHashMap;
        this.f47647b = new AtomicBoolean(z2);
    }

    public final void a() {
        if (this.f47647b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object b(C4452e key) {
        AbstractC3340k.e(key, "key");
        return this.f47646a.get(key);
    }

    public final void c(C4452e key, Object obj) {
        AbstractC3340k.e(key, "key");
        d(key, obj);
    }

    public final void d(C4452e key, Object obj) {
        AbstractC3340k.e(key, "key");
        a();
        LinkedHashMap linkedHashMap = this.f47646a;
        if (obj == null) {
            a();
            linkedHashMap.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(key, obj);
                return;
            }
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(o.X0((Iterable) obj));
            AbstractC3340k.d(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4449b)) {
            return false;
        }
        return AbstractC3340k.a(this.f47646a, ((C4449b) obj).f47646a);
    }

    public final int hashCode() {
        return this.f47646a.hashCode();
    }

    public final String toString() {
        return o.w0(this.f47646a.entrySet(), ",\n", "{\n", "\n}", C4448a.f47645i, 24);
    }

    public /* synthetic */ C4449b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
