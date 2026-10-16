package j$.nio.file;

import java.util.Iterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f49780a;

    public u(Iterator it) {
        this.f49780a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49780a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a.g(this.f49780a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f49780a.remove();
    }
}
