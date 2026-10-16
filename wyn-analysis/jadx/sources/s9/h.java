package s9;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class h implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final q6.d f45373b;

    /* renamed from: c, reason: collision with root package name */
    public static final c9.d f45374c;

    /* renamed from: a, reason: collision with root package name */
    public final m f45375a;

    static {
        q6.d dVar = new q6.d(17);
        f45373b = dVar;
        f45374c = new c9.d(Collections.EMPTY_LIST, dVar);
    }

    public h(m mVar) {
        A6.c.z(e(mVar), "Not a document key path: %s", mVar);
        this.f45375a = mVar;
    }

    public static h b() {
        List list = Collections.EMPTY_LIST;
        m mVar = m.f45388b;
        return new h(list.isEmpty() ? m.f45388b : new m(list));
    }

    public static h c(String str) {
        m mVarL = m.l(str);
        A6.c.z(mVarL.f45369a.size() > 4 && mVarL.g(0).equals("projects") && mVarL.g(2).equals("databases") && mVarL.g(4).equals("documents"), "Tried to parse an invalid key: %s", mVarL);
        return new h((m) mVarL.j());
    }

    public static boolean e(m mVar) {
        return mVar.f45369a.size() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        return this.f45375a.compareTo(hVar.f45375a);
    }

    public final m d() {
        return (m) this.f45375a.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f45375a.equals(((h) obj).f45375a);
    }

    public final int hashCode() {
        return this.f45375a.hashCode();
    }

    public final String toString() {
        return this.f45375a.c();
    }
}
