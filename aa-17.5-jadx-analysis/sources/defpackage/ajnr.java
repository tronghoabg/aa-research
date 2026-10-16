package defpackage;

import j$.nio.file.Path;
import j$.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajnr implements Comparable {
    public static final String a;
    public final ajnb b;

    static {
        String str = File.separator;
        str.getClass();
        a = str;
    }

    public ajnr(ajnb ajnbVar) {
        ajnbVar.getClass();
        this.b = ajnbVar;
    }

    public final Path a() {
        Path path = Paths.get(toString(), new String[0]);
        path.getClass();
        return path;
    }

    public final File b() {
        return new File(toString());
    }

    public final Character c() {
        ajnb ajnbVar = this.b;
        if (ajnbVar.d(ajoi.a, 0) != -1 || ajnbVar.c() < 2 || ajnbVar.a(1) != 58) {
            return null;
        }
        char cA = (char) ajnbVar.a(0);
        if ((cA < 'a' || cA >= '{') && (cA < 'A' || cA >= '[')) {
            return null;
        }
        return Character.valueOf(cA);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajnr ajnrVar = (ajnr) obj;
        ajnrVar.getClass();
        return this.b.compareTo(ajnrVar.b);
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        int iB = ajoi.b(this);
        if (iB == -1) {
            iB = 0;
        } else {
            ajnb ajnbVar = this.b;
            if (iB < ajnbVar.c() && ajnbVar.a(iB) == 92) {
                iB++;
            }
        }
        ajnb ajnbVar2 = this.b;
        int iC = ajnbVar2.c();
        int i = iB;
        while (iB < iC) {
            int i2 = iB + 1;
            if (ajnbVar2.a(iB) == 47 || ajnbVar2.a(iB) == 92) {
                arrayList.add(ajnbVar2.j(i, iB));
                i = i2;
            }
            iB = i2;
        }
        if (i < ajnbVar2.c()) {
            arrayList.add(ajnbVar2.j(i, ajnbVar2.c()));
        }
        return arrayList;
    }

    public final ajnr e() {
        int iB = ajoi.b(this);
        if (iB == -1) {
            return null;
        }
        return new ajnr(this.b.j(0, iB));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ajnr) && affa.f(((ajnr) obj).b, this.b);
    }

    public final ajnr f() {
        ajnb ajnbVar = this.b;
        ajnb ajnbVar2 = ajoi.c;
        if (!affa.f(ajnbVar, ajnbVar2)) {
            ajnb ajnbVar3 = ajoi.a;
            if (!affa.f(ajnbVar, ajnbVar3)) {
                ajnb ajnbVar4 = ajoi.b;
                if (!affa.f(ajnbVar, ajnbVar4)) {
                    ajnb ajnbVar5 = ajoi.d;
                    ajnbVar5.getClass();
                    if (ajnbVar.p(ajnbVar.c() - ajnbVar5.c(), ajnbVar5, ajnbVar5.c()) && (ajnbVar.c() == 2 || ajnbVar.p(ajnbVar.c() - 3, ajnbVar3, 1) || ajnbVar.p(ajnbVar.c() - 3, ajnbVar4, 1))) {
                        return null;
                    }
                    int iA = ajoi.a(this);
                    if (iA == 2) {
                        if (c() != null) {
                            if (ajnbVar.c() == 3) {
                                return null;
                            }
                            return new ajnr(ajnbVar.j(0, 3));
                        }
                        iA = 2;
                    }
                    if (iA == 1) {
                        if (ajnbVar.m(ajnbVar4)) {
                            return null;
                        }
                        iA = 1;
                    }
                    if (iA != -1 || c() == null) {
                        return iA == -1 ? new ajnr(ajnbVar2) : iA == 0 ? new ajnr(ajnbVar.j(0, 1)) : new ajnr(ajnbVar.j(0, iA));
                    }
                    if (ajnbVar.c() == 2) {
                        return null;
                    }
                    return new ajnr(ajnbVar.j(0, 2));
                }
            }
        }
        return null;
    }

    public final ajnr g(ajnr ajnrVar) {
        ajnrVar.getClass();
        if (!affa.f(e(), ajnrVar.e())) {
            throw new IllegalArgumentException(a.bt(ajnrVar, this, "Paths of different roots cannot be relative to each other: ", " and "));
        }
        List listD = d();
        List listD2 = ajnrVar.d();
        int iMin = Math.min(listD.size(), listD2.size());
        int i = 0;
        while (i < iMin && affa.f(listD.get(i), listD2.get(i))) {
            i++;
        }
        if (i == iMin) {
            if (this.b.c() == ajnrVar.b.c()) {
                return ahfo.a(".");
            }
        }
        List listSubList = listD2.subList(i, listD2.size());
        ajnb ajnbVar = ajoi.d;
        if (listSubList.indexOf(ajnbVar) != -1) {
            throw new IllegalArgumentException(a.bt(ajnrVar, this, "Impossible relative path to resolve: ", " and "));
        }
        if (affa.f(ajnrVar.b, ajoi.c)) {
            return this;
        }
        ajmy ajmyVar = new ajmy();
        ajnb ajnbVarC = ajoi.c(ajnrVar);
        if (ajnbVarC == null && (ajnbVarC = ajoi.c(this)) == null) {
            ajnbVarC = ajoi.d(a);
        }
        int size = listD2.size();
        for (int i2 = i; i2 < size; i2++) {
            ajmyVar.K(ajnbVar);
            ajmyVar.K(ajnbVarC);
        }
        int size2 = listD.size();
        while (i < size2) {
            ajmyVar.K((ajnb) listD.get(i));
            ajmyVar.K(ajnbVarC);
            i++;
        }
        return ajoi.f(ajmyVar, false);
    }

    public final ajnr h(String str) {
        ajmy ajmyVar = new ajmy();
        ajmyVar.V(str);
        return ajoi.e(this, ajoi.f(ajmyVar, false), false);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.i();
    }
}
