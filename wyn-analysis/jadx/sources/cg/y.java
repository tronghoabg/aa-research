package cg;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19937b;

    /* renamed from: a, reason: collision with root package name */
    public final C1621j f19938a;

    static {
        String separator = File.separator;
        AbstractC3340k.d(separator, "separator");
        f19937b = separator;
    }

    public y(C1621j bytes) {
        AbstractC3340k.e(bytes, "bytes");
        this.f19938a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = dg.c.a(this);
        C1621j c1621j = this.f19938a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < c1621j.d() && c1621j.i(iA) == 92) {
            iA++;
        }
        int iD = c1621j.d();
        int i5 = iA;
        while (iA < iD) {
            if (c1621j.i(iA) == 47 || c1621j.i(iA) == 92) {
                arrayList.add(c1621j.p(i5, iA));
                i5 = iA + 1;
            }
            iA++;
        }
        if (i5 < c1621j.d()) {
            arrayList.add(c1621j.p(i5, c1621j.d()));
        }
        return arrayList;
    }

    public final y b() {
        C1621j c1621j = dg.c.f34293d;
        C1621j c1621j2 = this.f19938a;
        if (AbstractC3340k.a(c1621j2, c1621j)) {
            return null;
        }
        C1621j c1621j3 = dg.c.f34290a;
        if (AbstractC3340k.a(c1621j2, c1621j3)) {
            return null;
        }
        C1621j c1621j4 = dg.c.f34291b;
        if (AbstractC3340k.a(c1621j2, c1621j4)) {
            return null;
        }
        C1621j suffix = dg.c.f34294e;
        c1621j2.getClass();
        AbstractC3340k.e(suffix, "suffix");
        int iD = c1621j2.d();
        byte[] bArr = suffix.f19904a;
        if (c1621j2.m(iD - bArr.length, suffix, bArr.length) && (c1621j2.d() == 2 || c1621j2.m(c1621j2.d() - 3, c1621j3, 1) || c1621j2.m(c1621j2.d() - 3, c1621j4, 1))) {
            return null;
        }
        int iK = C1621j.k(c1621j2, c1621j3);
        if (iK == -1) {
            iK = C1621j.k(c1621j2, c1621j4);
        }
        if (iK == 2 && g() != null) {
            if (c1621j2.d() == 3) {
                return null;
            }
            return new y(C1621j.q(c1621j2, 0, 3, 1));
        }
        if (iK == 1 && c1621j2.o(c1621j4)) {
            return null;
        }
        if (iK != -1 || g() == null) {
            return iK == -1 ? new y(c1621j) : iK == 0 ? new y(C1621j.q(c1621j2, 0, 1, 1)) : new y(C1621j.q(c1621j2, 0, iK, 1));
        }
        if (c1621j2.d() == 2) {
            return null;
        }
        return new y(C1621j.q(c1621j2, 0, 2, 1));
    }

    public final y c(y other) {
        AbstractC3340k.e(other, "other");
        int iA = dg.c.a(this);
        C1621j c1621j = this.f19938a;
        y yVar = iA == -1 ? null : new y(c1621j.p(0, iA));
        int iA2 = dg.c.a(other);
        C1621j c1621j2 = other.f19938a;
        if (!AbstractC3340k.a(yVar, iA2 != -1 ? new y(c1621j2.p(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i5 = 0;
        while (i5 < iMin && AbstractC3340k.a(arrayListA.get(i5), arrayListA2.get(i5))) {
            i5++;
        }
        if (i5 == iMin && c1621j.d() == c1621j2.d()) {
            return ad.r.g(".");
        }
        if (arrayListA2.subList(i5, arrayListA2.size()).indexOf(dg.c.f34294e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C1618g c1618g = new C1618g();
        C1621j c1621jC = dg.c.c(other);
        if (c1621jC == null && (c1621jC = dg.c.c(this)) == null) {
            c1621jC = dg.c.f(f19937b);
        }
        int size = arrayListA2.size();
        for (int i10 = i5; i10 < size; i10++) {
            c1618g.Q(dg.c.f34294e);
            c1618g.Q(c1621jC);
        }
        int size2 = arrayListA.size();
        while (i5 < size2) {
            c1618g.Q((C1621j) arrayListA.get(i5));
            c1618g.Q(c1621jC);
            i5++;
        }
        return dg.c.d(c1618g, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y other = (y) obj;
        AbstractC3340k.e(other, "other");
        return this.f19938a.compareTo(other.f19938a);
    }

    public final y d(String child) {
        AbstractC3340k.e(child, "child");
        C1618g c1618g = new C1618g();
        c1618g.d0(child);
        return dg.c.b(this, dg.c.d(c1618g, false), false);
    }

    public final File e() {
        return new File(this.f19938a.t());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && AbstractC3340k.a(((y) obj).f19938a, this.f19938a);
    }

    public final Path f() {
        Path path = Paths.get(this.f19938a.t(), new String[0]);
        AbstractC3340k.d(path, "get(...)");
        return path;
    }

    public final Character g() {
        C1621j c1621j = dg.c.f34290a;
        C1621j c1621j2 = this.f19938a;
        if (C1621j.g(c1621j2, c1621j) != -1 || c1621j2.d() < 2 || c1621j2.i(1) != 58) {
            return null;
        }
        char cI = (char) c1621j2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f19938a.hashCode();
    }

    public final String toString() {
        return this.f19938a.t();
    }
}
