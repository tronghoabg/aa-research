package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fvr implements defpackage.fvp {
    public static final java.util.List b;
    private static final defpackage.afhv c = new defpackage.afhv('0', '9');
    private static final java.util.List d;
    private static final defpackage.fvn e;

    static {
        defpackage.afhv afhvVar = new defpackage.afhv('A', 'Z');
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(afhvVar, 10));
        defpackage.afcc it = afhvVar.iterator();
        while (it.a) {
            arrayList.add(new defpackage.fvn(java.lang.String.valueOf(it.a())));
        }
        java.util.List listAZ = defpackage.afga.aZ(arrayList);
        d = listAZ;
        defpackage.fvn fvnVar = new defpackage.fvn("123");
        e = fvnVar;
        defpackage.afct afctVar = new defpackage.afct(10);
        afctVar.add(fvnVar);
        afctVar.addAll(listAZ);
        afctVar.add(defpackage.fvo.a);
        b = afctVar.f();
    }

    @Override // defpackage.fvp
    public final defpackage.fvn a(java.lang.String str) {
        str.getClass();
        if (str.length() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(str.length());
            for (int i = 0; i < str.length(); i++) {
                arrayList.add(java.lang.Character.valueOf(java.lang.Character.toUpperCase(str.charAt(i))));
            }
            char cCharValue = ((java.lang.Character) arrayList.get(0)).charValue();
            if (c.e(cCharValue)) {
                return e;
            }
            for (defpackage.fvn fvnVar : d) {
                if (fvnVar.a.charAt(0) == cCharValue) {
                    return fvnVar;
                }
            }
        }
        return defpackage.fvo.a;
    }

    @Override // defpackage.fvp
    public final java.util.List c() {
        return b;
    }

    @Override // defpackage.fvp
    public final java.lang.String b(java.lang.String str) {
        return str;
    }
}
