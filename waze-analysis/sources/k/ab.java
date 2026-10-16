package k;

import j$.nio.file.Path;
import j$.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ab implements Comparable<ab> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f50788a;

    /* renamed from: b, reason: collision with root package name */
    private final k f50789b;

    static {
        String str = File.separator;
        h.g.b.x.e(str, "separator");
        f50788a = str;
    }

    public ab(k kVar) {
        h.g.b.x.f(kVar, "bytes");
        this.f50789b = kVar;
    }

    public final Path a() {
        Path path = Paths.get(toString(), new String[0]);
        h.g.b.x.e(path, "get(...)");
        return path;
    }

    public final File b() {
        return new File(toString());
    }

    public final Character c() {
        k kVar = this.f50789b;
        if (kVar.e(k.a.c.f50749b, 0) != -1 || kVar.d() < 2 || kVar.a(1) != 58) {
            return null;
        }
        char cA = (char) kVar.a(0);
        if ((cA < 'a' || cA >= '{') && (cA < 'A' || cA >= '[')) {
            return null;
        }
        return Character.valueOf(cA);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ab abVar) {
        ab abVar2 = abVar;
        h.g.b.x.f(abVar2, "other");
        return this.f50789b.compareTo(abVar2.f50789b);
    }

    public final String d() {
        int iA = k.a.c.a(this);
        return (iA != -1 ? k.w(this.f50789b, iA + 1, 0, 2) : (c() == null || this.f50789b.d() != 2) ? this.f50789b : k.f50843a).i();
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        int iB = k.a.c.b(this);
        if (iB == -1) {
            iB = 0;
        } else {
            k kVar = this.f50789b;
            if (iB < kVar.d() && kVar.a(iB) == 92) {
                iB++;
            }
        }
        k kVar2 = this.f50789b;
        int iD = kVar2.d();
        int i2 = iB;
        while (iB < iD) {
            int i3 = iB + 1;
            if (kVar2.a(iB) == 47 || kVar2.a(iB) == 92) {
                arrayList.add(kVar2.k(i2, iB));
                i2 = i3;
            }
            iB = i3;
        }
        if (i2 < kVar2.d()) {
            arrayList.add(kVar2.k(i2, kVar2.d()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ab) && h.g.b.x.n(((ab) obj).f50789b, this.f50789b);
    }

    public final k f() {
        return this.f50789b;
    }

    public final ab g() {
        int iB = k.a.c.b(this);
        if (iB == -1) {
            return null;
        }
        return new ab(this.f50789b.k(0, iB));
    }

    public final ab h() {
        return aq.c(toString(), true);
    }

    public final int hashCode() {
        return this.f50789b.hashCode();
    }

    public final ab i() {
        k kVar = this.f50789b;
        if (h.g.b.x.n(kVar, k.a.c.f50752e) || h.g.b.x.n(kVar, k.a.c.f50749b) || h.g.b.x.n(kVar, k.a.c.f50750c) || k.a.c.k(this)) {
            return null;
        }
        int iA = k.a.c.a(this);
        if (iA == 2) {
            if (c() != null) {
                if (kVar.d() == 3) {
                    return null;
                }
                return new ab(k.w(kVar, 0, 3, 1));
            }
            iA = 2;
        }
        if (iA == 1) {
            if (kVar.p(k.a.c.f50750c)) {
                return null;
            }
            iA = 1;
        }
        if (iA != -1 || c() == null) {
            return iA == -1 ? new ab(k.a.c.f50752e) : iA == 0 ? new ab(k.w(kVar, 0, 1, 1)) : new ab(k.w(kVar, 0, iA, 1));
        }
        if (kVar.d() == 2) {
            return null;
        }
        return new ab(k.w(kVar, 0, 2, 1));
    }

    public final ab j(ab abVar) {
        h.g.b.x.f(abVar, "other");
        if (!h.g.b.x.n(g(), abVar.g())) {
            throw new IllegalArgumentException("Paths of different roots cannot be relative to each other: " + this + " and " + abVar);
        }
        List listE = e();
        List listE2 = abVar.e();
        int iMin = Math.min(listE.size(), listE2.size());
        int i2 = 0;
        while (i2 < iMin && h.g.b.x.n(listE.get(i2), listE2.get(i2))) {
            i2++;
        }
        if (i2 == iMin) {
            if (this.f50789b.d() == abVar.f50789b.d()) {
                return aq.c(".", false);
            }
        }
        if (listE2.subList(i2, listE2.size()).indexOf(k.a.c.f50753f) != -1) {
            throw new IllegalArgumentException("Impossible relative path to resolve: " + this + " and " + abVar);
        }
        if (h.g.b.x.n(abVar.f50789b, k.a.c.f50752e)) {
            return this;
        }
        h hVar = new h();
        k kVarL = k.a.c.l(abVar);
        if (kVarL == null && (kVarL = k.a.c.l(this)) == null) {
            kVarL = k.a.c.n(f50788a);
        }
        int size = listE2.size();
        for (int i3 = i2; i3 < size; i3++) {
            hVar.Z(k.a.c.f50753f);
            hVar.Z(kVarL);
        }
        int size2 = listE.size();
        while (i2 < size2) {
            hVar.Z((k) listE.get(i2));
            hVar.Z(kVarL);
            i2++;
        }
        return k.a.c.j(hVar, false);
    }

    public final ab k(String str) {
        h.g.b.x.f(str, "child");
        h hVar = new h();
        hVar.ar(str);
        return k.a.c.i(this, k.a.c.j(hVar, false), false);
    }

    public final ab l(ab abVar, boolean z) {
        h.g.b.x.f(abVar, "child");
        return k.a.c.i(this, abVar, z);
    }

    public final boolean m() {
        return k.a.c.b(this) != -1;
    }

    public final String toString() {
        return this.f50789b.i();
    }
}
