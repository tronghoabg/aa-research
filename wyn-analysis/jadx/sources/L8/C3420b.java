package l8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: l8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3420b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f40084a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40085b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f40086c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f40087d = EnumC3417T.f40068a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f40088e;

    public C3420b(a0 a0Var) {
        this.f40088e = a0Var;
        this.f40084a = a0Var.f40081d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40084a.hasNext() || this.f40087d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f40087d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f40084a.next();
            this.f40085b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f40086c = collection;
            this.f40087d = collection.iterator();
        }
        return this.f40087d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40087d.remove();
        Collection collection = this.f40086c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f40084a.remove();
        }
        a0 a0Var = this.f40088e;
        a0Var.f40082e--;
    }
}
