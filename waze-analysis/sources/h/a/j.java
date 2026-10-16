package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f48010a;

    j(m mVar) {
        this.f48010a = mVar;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f48010a.containsKey(obj);
    }

    @Override // h.a.a
    public final int getSize() {
        return this.f48010a.size();
    }

    @Override // h.a.s, h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k(this.f48010a.entrySet().iterator(), 1);
    }
}
