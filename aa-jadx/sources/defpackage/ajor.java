package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajor implements java.lang.Comparable {
    public static final java.lang.String a;
    public final defpackage.ajob b;

    static {
        java.lang.String str = java.io.File.separator;
        str.getClass();
        a = str;
    }

    public ajor(defpackage.ajob ajobVar) {
        ajobVar.getClass();
        this.b = ajobVar;
    }

    public final j$.nio.file.Path a() {
        j$.nio.file.Path path = j$.nio.file.Paths.get(toString(), new java.lang.String[0]);
        path.getClass();
        return path;
    }

    public final java.io.File b() {
        return new java.io.File(toString());
    }

    public final java.lang.Character c() {
        defpackage.ajob ajobVar = this.b;
        if (ajobVar.d(defpackage.ajpi.a, 0) != -1 || ajobVar.c() < 2 || ajobVar.a(1) != 58) {
            return null;
        }
        char cA = (char) ajobVar.a(0);
        if ((cA < 'a' || cA >= '{') && (cA < 'A' || cA >= '[')) {
            return null;
        }
        return java.lang.Character.valueOf(cA);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.ajor ajorVar = (defpackage.ajor) obj;
        ajorVar.getClass();
        return this.b.compareTo(ajorVar.b);
    }

    public final java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iB = defpackage.ajpi.b(this);
        if (iB == -1) {
            iB = 0;
        } else {
            defpackage.ajob ajobVar = this.b;
            if (iB < ajobVar.c() && ajobVar.a(iB) == 92) {
                iB++;
            }
        }
        defpackage.ajob ajobVar2 = this.b;
        int iC = ajobVar2.c();
        int i = iB;
        while (iB < iC) {
            int i2 = iB + 1;
            if (ajobVar2.a(iB) == 47 || ajobVar2.a(iB) == 92) {
                arrayList.add(ajobVar2.j(i, iB));
                i = i2;
            }
            iB = i2;
        }
        if (i < ajobVar2.c()) {
            arrayList.add(ajobVar2.j(i, ajobVar2.c()));
        }
        return arrayList;
    }

    public final defpackage.ajor e() {
        int iB = defpackage.ajpi.b(this);
        if (iB == -1) {
            return null;
        }
        return new defpackage.ajor(this.b.j(0, iB));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ajor) && defpackage.afga.f(((defpackage.ajor) obj).b, this.b);
    }

    public final defpackage.ajor f() {
        defpackage.ajob ajobVar = this.b;
        defpackage.ajob ajobVar2 = defpackage.ajpi.c;
        if (!defpackage.afga.f(ajobVar, ajobVar2)) {
            defpackage.ajob ajobVar3 = defpackage.ajpi.a;
            if (!defpackage.afga.f(ajobVar, ajobVar3)) {
                defpackage.ajob ajobVar4 = defpackage.ajpi.b;
                if (!defpackage.afga.f(ajobVar, ajobVar4)) {
                    defpackage.ajob ajobVar5 = defpackage.ajpi.d;
                    ajobVar5.getClass();
                    if (ajobVar.p(ajobVar.c() - ajobVar5.c(), ajobVar5, ajobVar5.c()) && (ajobVar.c() == 2 || ajobVar.p(ajobVar.c() - 3, ajobVar3, 1) || ajobVar.p(ajobVar.c() - 3, ajobVar4, 1))) {
                        return null;
                    }
                    int iA = defpackage.ajpi.a(this);
                    if (iA == 2) {
                        if (c() != null) {
                            if (ajobVar.c() == 3) {
                                return null;
                            }
                            return new defpackage.ajor(ajobVar.j(0, 3));
                        }
                        iA = 2;
                    }
                    if (iA == 1) {
                        if (ajobVar.m(ajobVar4)) {
                            return null;
                        }
                        iA = 1;
                    }
                    if (iA != -1 || c() == null) {
                        if (iA == -1) {
                            return new defpackage.ajor(ajobVar2);
                        }
                        return iA == 0 ? new defpackage.ajor(ajobVar.j(0, 1)) : new defpackage.ajor(ajobVar.j(0, iA));
                    }
                    if (ajobVar.c() == 2) {
                        return null;
                    }
                    return new defpackage.ajor(ajobVar.j(0, 2));
                }
            }
        }
        return null;
    }

    public final defpackage.ajor g(defpackage.ajor ajorVar) {
        ajorVar.getClass();
        if (!defpackage.afga.f(e(), ajorVar.e())) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(ajorVar, this, "Paths of different roots cannot be relative to each other: ", " and "));
        }
        java.util.List listD = d();
        java.util.List listD2 = ajorVar.d();
        int iMin = java.lang.Math.min(listD.size(), listD2.size());
        int i = 0;
        while (i < iMin && defpackage.afga.f(listD.get(i), listD2.get(i))) {
            i++;
        }
        if (i == iMin) {
            if (this.b.c() == ajorVar.b.c()) {
                return defpackage.airt.a(".");
            }
        }
        java.util.List listSubList = listD2.subList(i, listD2.size());
        defpackage.ajob ajobVar = defpackage.ajpi.d;
        if (listSubList.indexOf(ajobVar) != -1) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(ajorVar, this, "Impossible relative path to resolve: ", " and "));
        }
        if (defpackage.afga.f(ajorVar.b, defpackage.ajpi.c)) {
            return this;
        }
        defpackage.ajny ajnyVar = new defpackage.ajny();
        defpackage.ajob ajobVarC = defpackage.ajpi.c(ajorVar);
        if (ajobVarC == null && (ajobVarC = defpackage.ajpi.c(this)) == null) {
            ajobVarC = defpackage.ajpi.d(a);
        }
        int size = listD2.size();
        for (int i2 = i; i2 < size; i2++) {
            ajnyVar.K(ajobVar);
            ajnyVar.K(ajobVarC);
        }
        int size2 = listD.size();
        while (i < size2) {
            ajnyVar.K((defpackage.ajob) listD.get(i));
            ajnyVar.K(ajobVarC);
            i++;
        }
        return defpackage.ajpi.f(ajnyVar, false);
    }

    public final defpackage.ajor h(java.lang.String str) {
        defpackage.ajny ajnyVar = new defpackage.ajny();
        ajnyVar.V(str);
        return defpackage.ajpi.e(this, defpackage.ajpi.f(ajnyVar, false), false);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b.i();
    }
}
