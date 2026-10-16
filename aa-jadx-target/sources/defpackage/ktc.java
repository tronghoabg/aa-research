package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ktc {
    public static final defpackage.dhz a;
    public static final defpackage.dhz b;
    public static final defpackage.dhz c;
    public static final defpackage.dhz d;
    public static final defpackage.dil e;
    public static final defpackage.dil f;
    private static final defpackage.div g = new defpackage.div();
    private static final java.util.List h;

    static {
        java.util.List<defpackage.afau> listAc = defpackage.afga.ac(new defpackage.afau(defpackage.dil.a, new defpackage.die(0)), new defpackage.afau(defpackage.dil.b, new defpackage.die(0)), new defpackage.afau(defpackage.dil.c, new defpackage.die(0)), new defpackage.afau(defpackage.dil.d, new defpackage.die(0)), new defpackage.afau(defpackage.dil.e, new defpackage.die(0)), new defpackage.afau(defpackage.dil.f, new defpackage.die(0)), new defpackage.afau(defpackage.dil.g, new defpackage.die(0)), new defpackage.afau(defpackage.dil.h, new defpackage.die(0)), new defpackage.afau(defpackage.dil.i, new defpackage.die(0)));
        h = listAc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.afau afauVar : listAc) {
            defpackage.dil dilVar = (defpackage.dil) afauVar.a;
            int i = ((defpackage.die) afauVar.b).a;
            defpackage.dhw.a("google-sans");
            defpackage.afga.bk(arrayList, defpackage.afga.ac(defpackage.dax.l("google-sans", dilVar, i), defpackage.day.u(new defpackage.kwv("Google Sans", (byte[]) null), g, dilVar, i)));
        }
        a = new defpackage.dic(arrayList);
        java.util.List<defpackage.afau> list = h;
        b = new defpackage.dic(a(list, 0.0f));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (defpackage.afau afauVar2 : list) {
            defpackage.dil dilVar2 = (defpackage.dil) afauVar2.a;
            int i2 = ((defpackage.die) afauVar2.b).a;
            int i3 = defpackage.dik.a;
            defpackage.dij dijVarC = defpackage.dik.c(dilVar2, i2, new defpackage.dih("opsz", 17.0f));
            defpackage.dhw.a("google-sans-text");
            defpackage.afga.bk(arrayList2, defpackage.afga.ac(new defpackage.dhx("google-sans-text", dilVar2, i2, dijVarC), defpackage.day.u(new defpackage.kwv("Google Sans Text", (byte[]) null), g, dilVar2, i2)));
        }
        new defpackage.dic(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (defpackage.afau afauVar3 : h) {
            defpackage.dil dilVar3 = (defpackage.dil) afauVar3.a;
            int i4 = ((defpackage.die) afauVar3.b).a;
            defpackage.dhw.a("sans-serif");
            java.util.List listSingletonList = java.util.Collections.singletonList(defpackage.dax.l("sans-serif", dilVar3, i4));
            listSingletonList.getClass();
            defpackage.afga.bk(arrayList3, listSingletonList);
        }
        c = new defpackage.dic(arrayList3);
        d = new defpackage.dic(a(h, 100.0f));
        e = defpackage.dil.m;
        f = defpackage.dil.l;
    }

    private static final java.util.List a(java.util.List list, float f2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.afau afauVar = (defpackage.afau) it.next();
            defpackage.dil dilVar = (defpackage.dil) afauVar.a;
            int i = ((defpackage.die) afauVar.b).a;
            int i2 = dilVar.o;
            int i3 = defpackage.dik.a;
            defpackage.dij dijVar = new defpackage.dij(defpackage.dik.a(i2), new defpackage.dih("wdth", 100.0f), new defpackage.dih("ROND", f2));
            defpackage.dhw.a("google-sans-flex");
            defpackage.dhw.a("google-sans");
            defpackage.afga.bk(arrayList, defpackage.afga.ac(new defpackage.dhx("google-sans-flex", dilVar, i, dijVar), new defpackage.dip(2131296306, dilVar, i, dijVar), defpackage.dax.l("google-sans", dilVar, i), defpackage.day.u(new defpackage.kwv("Google Sans", (byte[]) null), g, dilVar, i)));
        }
        return arrayList;
    }
}
