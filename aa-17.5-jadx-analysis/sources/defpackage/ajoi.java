package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ajoi {
    public static final ajnb a;
    public static final ajnb b;
    public static final ajnb c;
    public static final ajnb d;
    private static final ajnb e;

    static {
        ajnb ajnbVar = ajnb.a;
        a = ahfd.b("/");
        b = ahfd.b("\\");
        e = ahfd.b("/\\");
        c = ahfd.b(".");
        d = ahfd.b("..");
    }

    public static final int a(ajnr ajnrVar) {
        ajnb ajnbVar = ajnrVar.b;
        int iS = ajnbVar.s(a);
        return iS != -1 ? iS : ajnbVar.s(b);
    }

    public static final int b(ajnr ajnrVar) {
        ajnb ajnbVar = ajnrVar.b;
        if (ajnbVar.c() == 0) {
            return -1;
        }
        if (ajnbVar.a(0) == 47) {
            return 1;
        }
        if (ajnbVar.a(0) == 92) {
            if (ajnbVar.c() <= 2 || ajnbVar.a(1) != 92) {
                return 1;
            }
            int iD = ajnbVar.d(b, 2);
            return iD == -1 ? ajnbVar.c() : iD;
        }
        if (ajnbVar.c() > 2 && ajnbVar.a(1) == 58 && ajnbVar.a(2) == 92) {
            char cA = (char) ajnbVar.a(0);
            if (cA >= 'a' && cA < '{') {
                return 3;
            }
            if (cA >= 'A' && cA < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final ajnb c(ajnr ajnrVar) {
        ajnb ajnbVar = ajnrVar.b;
        ajnb ajnbVar2 = a;
        if (ajnbVar.d(ajnbVar2, 0) != -1) {
            return ajnbVar2;
        }
        ajnb ajnbVar3 = b;
        if (ajnbVar.d(ajnbVar3, 0) == -1) {
            return null;
        }
        return ajnbVar3;
    }

    public static final ajnb d(String str) {
        if (affa.f(str, "/")) {
            return a;
        }
        if (affa.f(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: ".concat(str));
    }

    public static final ajnr e(ajnr ajnrVar, ajnr ajnrVar2, boolean z) {
        if (b(ajnrVar2) != -1 || ajnrVar2.c() != null) {
            return ajnrVar2;
        }
        ajnb ajnbVarC = c(ajnrVar);
        if (ajnbVarC == null && (ajnbVarC = c(ajnrVar2)) == null) {
            ajnbVarC = d(ajnr.a);
        }
        ajmy ajmyVar = new ajmy();
        ajmyVar.K(ajnrVar.b);
        if (ajmyVar.b > 0) {
            ajmyVar.K(ajnbVarC);
        }
        ajmyVar.K(ajnrVar2.b);
        return f(ajmyVar, z);
    }

    public static final ajnr f(ajmy ajmyVar, boolean z) throws EOFException {
        ajnb ajnbVar;
        char c2;
        ajnb ajnbVarS;
        ajmy ajmyVar2 = new ajmy();
        ajnb ajnbVarG = null;
        int i = 0;
        while (true) {
            if (!ajmyVar.H(a)) {
                ajnbVar = b;
                if (!ajmyVar.H(ajnbVar)) {
                    break;
                }
            }
            byte bD = ajmyVar.d();
            if (ajnbVarG == null) {
                ajnbVarG = g(bD);
            }
            i++;
        }
        boolean z2 = i >= 2 && affa.f(ajnbVarG, ajnbVar);
        if (z2) {
            ajnbVarG.getClass();
            ajmyVar2.K(ajnbVarG);
            ajmyVar2.K(ajnbVarG);
        } else if (i > 0) {
            ajnbVarG.getClass();
            ajmyVar2.K(ajnbVarG);
        } else {
            long j = ajmyVar.j(e);
            if (ajnbVarG == null) {
                ajnbVarG = j == -1 ? d(ajnr.a) : g(ajmyVar.c(j));
            }
            if (affa.f(ajnbVarG, ajnbVar) && ajmyVar.b >= 2 && ajmyVar.c(1L) == 58 && (((c2 = (char) ajmyVar.c(0L)) >= 'a' && c2 < '{') || (c2 >= 'A' && c2 < '['))) {
                if (j == 2) {
                    ajmyVar2.a(ajmyVar, 3L);
                } else {
                    ajmyVar2.a(ajmyVar, 2L);
                }
            }
        }
        boolean z3 = ajmyVar2.b > 0;
        ArrayList arrayList = new ArrayList();
        while (!ajmyVar.B()) {
            long j2 = ajmyVar.j(e);
            if (j2 == -1) {
                ajnbVarS = ajmyVar.r();
            } else {
                ajnbVarS = ajmyVar.s(j2);
                ajmyVar.d();
            }
            ajnb ajnbVar2 = d;
            if (affa.f(ajnbVarS, ajnbVar2)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || affa.f(woy.bK(arrayList), ajnbVar2)))) {
                        arrayList.add(ajnbVarS);
                    } else if (!z2 || arrayList.size() != 1) {
                        woy.cA(arrayList);
                    }
                }
            } else if (!affa.f(ajnbVarS, c) && !affa.f(ajnbVarS, ajnb.a)) {
                arrayList.add(ajnbVarS);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                ajmyVar2.K(ajnbVarG);
            }
            ajmyVar2.K((ajnb) arrayList.get(i2));
        }
        if (ajmyVar2.b == 0) {
            ajmyVar2.K(c);
        }
        return new ajnr(ajmyVar2.r());
    }

    private static final ajnb g(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(a.bp(b2, "not a directory separator: "));
    }
}
