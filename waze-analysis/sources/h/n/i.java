package h.n;

import h.g.b.x;
import j$.util.Collection;
import java.util.Iterator;
import java.util.regex.MatchResult;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class i extends h.a.a implements Collection, java.util.Collection, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f48243a;

    i(j jVar) {
        this.f48243a = jVar;
    }

    public final f a(int i2) {
        j jVar = this.f48243a;
        MatchResult matchResultG = jVar.g();
        h.k.j jVarU = h.k.n.u(matchResultG.start(i2), matchResultG.end(i2));
        if (jVarU.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = jVar.g().group(i2);
        x.e(strGroup, "group(...)");
        return new f(strGroup, jVarU);
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj == null || (obj instanceof f)) {
            return super.contains((f) obj);
        }
        return false;
    }

    @Override // h.a.a
    public final int getSize() {
        return this.f48243a.g().groupCount() + 1;
    }

    @Override // h.a.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<f> iterator() {
        return h.m.k.o(h.a.i.av(h.a.i.n(this)), new com.waze.uid.b(this, 8)).iterator();
    }
}
