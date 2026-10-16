package h.a.a;

import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends g implements Iterator, h.g.b.a.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(iVar);
        x.f(iVar, "map");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        d();
        if (a() >= c().f47952g) {
            throw new NoSuchElementException();
        }
        int iA = a();
        f(iA + 1);
        g(iA);
        f fVar = new f(c(), b());
        e();
        return fVar;
    }
}
