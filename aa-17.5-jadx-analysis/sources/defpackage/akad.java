package defpackage;

/* loaded from: classes2.dex */
public final class akad {
    public static final akad a = new akad();

    protected static final int a(ajpt ajptVar) {
        return ajptVar.d.length() + 4;
    }

    protected static final akbh b(akbh akbhVar) {
        if (akbhVar == null) {
            return new akbh(64);
        }
        akbhVar.i();
        return akbhVar;
    }

    public static final void c(akbh akbhVar, ajpt ajptVar) {
        akbhVar.j(a(ajptVar));
        akbhVar.f(ajptVar.d);
        akbhVar.e('/');
        akbhVar.f(Integer.toString(ajptVar.e));
        akbhVar.e('.');
        akbhVar.f(Integer.toString(ajptVar.f));
    }

    public static final akbh d(akbh akbhVar, ajoy ajoyVar) {
        ahgm.e(ajoyVar, "Header");
        if (ajoyVar instanceof akak) {
            return ((akak) ajoyVar).a;
        }
        akbh akbhVarB = b(akbhVar);
        String strB = ajoyVar.b();
        String strC = ajoyVar.c();
        int length = strB.length() + 2;
        if (strC != null) {
            length += strC.length();
        }
        akbhVarB.j(length);
        akbhVarB.f(strB);
        akbhVarB.f(": ");
        if (strC != null) {
            akbhVarB.j(akbhVarB.b + strC.length());
            for (int i = 0; i < strC.length(); i++) {
                char cCharAt = strC.charAt(i);
                if (cCharAt == '\r' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == 11) {
                    cCharAt = ' ';
                }
                akbhVarB.e(cCharAt);
            }
        }
        return akbhVarB;
    }

    public static final akbh e(akbh akbhVar, akah akahVar) {
        ahgm.e(akahVar, "Request line");
        String str = akahVar.b;
        int length = str.length();
        String str2 = akahVar.c;
        int length2 = str2.length();
        akbh akbhVarB = b(akbhVar);
        ajpt ajptVar = akahVar.a;
        akbhVarB.j(length + 1 + length2 + 1 + a(ajptVar));
        akbhVarB.f(str);
        akbhVarB.e(' ');
        akbhVarB.f(str2);
        akbhVarB.e(' ');
        c(akbhVarB, ajptVar);
        return akbhVarB;
    }
}
