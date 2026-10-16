package defpackage;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ajwv extends AbstractList {
    private final Set a = new HashSet();
    private final List b = new ArrayList();

    public final void a(URI uri) {
        this.a.add(uri);
        this.b.add(uri);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        URI uri = (URI) obj;
        this.b.add(i, uri);
        this.a.add(uri);
    }

    public final boolean b(URI uri) {
        return this.a.contains(uri);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (URI) this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        List list = this.b;
        URI uri = (URI) list.remove(i);
        Set set = this.a;
        set.remove(uri);
        if (list.size() != set.size()) {
            set.addAll(list);
        }
        return uri;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        URI uri = (URI) obj;
        List list = this.b;
        URI uri2 = (URI) list.set(i, uri);
        Set set = this.a;
        set.remove(uri2);
        set.add(uri);
        if (list.size() != set.size()) {
            set.addAll(list);
        }
        return uri2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
