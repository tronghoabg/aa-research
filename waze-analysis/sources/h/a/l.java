package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f48013a;

    l(m mVar) {
        this.f48013a = mVar;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f48013a.containsValue(obj);
    }

    @Override // h.a.a
    public final int getSize() {
        return this.f48013a.size();
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k(this.f48013a.entrySet().iterator(), 0);
    }
}
