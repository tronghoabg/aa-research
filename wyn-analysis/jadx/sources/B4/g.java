package B4;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final Y4.d f1589b = new Y4.d(0);

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        int i5 = 0;
        while (true) {
            Y4.d dVar = this.f1589b;
            if (i5 >= dVar.f47563c) {
                return;
            }
            f fVar = (f) dVar.g(i5);
            Object objK = this.f1589b.k(i5);
            e eVar = fVar.f1586b;
            if (fVar.f1588d == null) {
                fVar.f1588d = fVar.f1587c.getBytes(d.f1583a);
            }
            eVar.c(fVar.f1588d, objK, messageDigest);
            i5++;
        }
    }

    public final Object c(f fVar) {
        Y4.d dVar = this.f1589b;
        return dVar.containsKey(fVar) ? dVar.get(fVar) : fVar.f1585a;
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f1589b.equals(((g) obj).f1589b);
        }
        return false;
    }

    @Override // B4.d
    public final int hashCode() {
        return this.f1589b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f1589b + '}';
    }
}
