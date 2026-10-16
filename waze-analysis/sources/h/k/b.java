package h.k;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends a implements f {
    static {
        new b((char) 1, (char) 0);
    }

    @Override // h.k.a
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (isEmpty() && ((b) obj).isEmpty()) {
                return true;
            }
            b bVar = (b) obj;
            return a() == bVar.a() && b() == bVar.b();
        }
        return false;
    }

    @Override // h.k.f
    public final /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return Character.valueOf(b());
    }

    @Override // h.k.f
    public final /* bridge */ /* synthetic */ Comparable getStart() {
        return Character.valueOf(a());
    }

    @Override // h.k.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // h.k.a, h.k.f
    public final boolean isEmpty() {
        return x.a(a(), b()) > 0;
    }

    @Override // h.k.a
    public final String toString() {
        return a() + ".." + b();
    }
}
