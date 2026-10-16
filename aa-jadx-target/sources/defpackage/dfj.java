package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfj implements defpackage.dfm {
    public final defpackage.dfb a;
    public final java.util.List b;
    public final java.util.List c;
    private final defpackage.afar d = defpackage.afga.cB(3, new defpackage.cew(this, 20));
    private final defpackage.afar e = defpackage.afga.cB(3, new defpackage.djm(this, 1));

    public dfj(defpackage.dfb dfbVar, defpackage.dgd dgdVar, java.util.List list, defpackage.dlo dloVar, defpackage.wde wdeVar) {
        int i;
        java.lang.String strSubstring;
        int i2;
        defpackage.dfb dfbVar2 = dfbVar;
        defpackage.dgd dgdVar2 = dgdVar;
        this.a = dfbVar2;
        this.b = list;
        defpackage.dfn dfnVar = dgdVar2.c;
        defpackage.dfb dfbVar3 = defpackage.dfc.a;
        java.util.List list2 = dfbVar2.d;
        java.util.List listAW = list2 != null ? defpackage.afga.aW(list2, new defpackage.azq(5)) : defpackage.afce.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.afbz afbzVar = new defpackage.afbz();
        int size = listAW.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            defpackage.dfa dfaVar = (defpackage.dfa) listAW.get(i4);
            defpackage.dfa dfaVarA = defpackage.dfa.a(dfaVar, dfnVar.a((defpackage.dfn) dfaVar.a), i3, 14);
            while (true) {
                i2 = dfaVarA.b;
                if (i5 >= i2 || afbzVar.isEmpty()) {
                    break;
                }
                defpackage.dfa dfaVar2 = (defpackage.dfa) afbzVar.e();
                int i6 = dfaVarA.b;
                int i7 = dfaVar2.c;
                if (i6 < i7) {
                    arrayList.add(new defpackage.dfa(dfaVar2.a, i5, i6, ""));
                    i5 = dfaVarA.b;
                } else {
                    arrayList.add(new defpackage.dfa(dfaVar2.a, i5, i7, ""));
                    i5 = dfaVar2.c;
                    while (!afbzVar.isEmpty() && i5 == ((defpackage.dfa) afbzVar.e()).c) {
                        afbzVar.removeLast();
                    }
                }
            }
            if (i5 < i2) {
                arrayList.add(new defpackage.dfa(dfnVar, i5, i2, ""));
                i5 = dfaVarA.b;
            }
            defpackage.dfa dfaVar3 = (defpackage.dfa) afbzVar.f();
            if (dfaVar3 != null) {
                int i8 = dfaVar3.b;
                if (i8 == dfaVarA.b && dfaVar3.c == dfaVarA.c) {
                    afbzVar.removeLast();
                    afbzVar.addLast(new defpackage.dfa(((defpackage.dfn) dfaVar3.a).a((defpackage.dfn) dfaVarA.a), dfaVarA.b, dfaVarA.c, ""));
                } else {
                    int i9 = dfaVar3.c;
                    if (i8 == i9) {
                        arrayList.add(new defpackage.dfa(dfaVar3.a, i8, i9, ""));
                        afbzVar.removeLast();
                        afbzVar.addLast(new defpackage.dfa(dfaVarA.a, dfaVarA.b, dfaVarA.c, ""));
                    } else {
                        if (i9 < dfaVarA.c) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        afbzVar.addLast(new defpackage.dfa(((defpackage.dfn) dfaVar3.a).a((defpackage.dfn) dfaVarA.a), dfaVarA.b, dfaVarA.c, ""));
                    }
                }
            } else {
                afbzVar.addLast(new defpackage.dfa(dfaVarA.a, dfaVarA.b, dfaVarA.c, ""));
            }
            i4++;
            i3 = 0;
        }
        while (i5 <= dfbVar2.b.length() && !afbzVar.isEmpty()) {
            defpackage.dfa dfaVar4 = (defpackage.dfa) afbzVar.e();
            arrayList.add(new defpackage.dfa(dfaVar4.a, i5, dfaVar4.c, ""));
            i5 = dfaVar4.c;
            while (!afbzVar.isEmpty() && i5 == ((defpackage.dfa) afbzVar.e()).c) {
                afbzVar.removeLast();
            }
        }
        if (i5 < dfbVar2.b.length()) {
            arrayList.add(new defpackage.dfa(dfnVar, i5, dfbVar2.b.length(), ""));
        }
        if (arrayList.isEmpty()) {
            i = 0;
            arrayList.add(new defpackage.dfa(dfnVar, 0, 0, ""));
        } else {
            i = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i10 = i;
        while (i10 < size2) {
            defpackage.dfa dfaVar5 = (defpackage.dfa) arrayList.get(i10);
            int i11 = dfaVar5.b;
            int i12 = dfaVar5.c;
            if (i11 != i12) {
                strSubstring = dfbVar2.b.substring(i11, i12);
                strSubstring.getClass();
            } else {
                strSubstring = "";
            }
            java.util.List listA = defpackage.dfc.a(dfbVar2, i11, i12, new defpackage.cyw(9));
            defpackage.dfb dfbVar4 = new defpackage.dfb(strSubstring, listA == null ? defpackage.afce.a : listA);
            defpackage.dfn dfnVar2 = (defpackage.dfn) dfaVar5.a;
            dfnVar2 = dfnVar2.b == 0 ? new defpackage.dfn(dfnVar2.a, dfnVar.b, dfnVar2.c, dfnVar2.d, dfnVar2.e, dfnVar2.f, dfnVar2.g, dfnVar2.h, dfnVar2.i) : dfnVar2;
            java.lang.String str = dfbVar4.b;
            defpackage.dgd dgdVar3 = new defpackage.dgd(dgdVar2.b, dgdVar2.c.a(dfnVar2));
            java.util.List list3 = dfbVar4.a;
            java.util.List list4 = list3 == null ? defpackage.afce.a : list3;
            java.util.List list5 = this.b;
            int i13 = dfaVar5.b;
            int i14 = dfaVar5.c;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list5.size());
            int size3 = list5.size();
            defpackage.dfn dfnVar3 = dfnVar;
            int i15 = 0;
            while (i15 < size3) {
                int i16 = size3;
                defpackage.dfa dfaVar6 = (defpackage.dfa) list5.get(i15);
                int i17 = i15;
                int i18 = dfaVar6.b;
                java.util.List list6 = list5;
                int i19 = dfaVar6.c;
                boolean z = i18 < i14;
                if ((((i13 == i14) | (i18 == i19)) & (i13 == i18)) | ((i13 < i19) & z)) {
                    if (i13 > i18 || i19 > i14) {
                        defpackage.dki.c("placeholder can not overlap with paragraph.");
                    }
                    arrayList3.add(new defpackage.dfa(dfaVar6.a, dfaVar6.b - i13, dfaVar6.c - i13, ""));
                }
                i15 = i17 + 1;
                size3 = i16;
                list5 = list6;
                arrayList = arrayList;
            }
            arrayList2.add(new defpackage.dfl(new defpackage.dew(str, dgdVar3, list4, arrayList3, wdeVar, dloVar), dfaVar5.b, dfaVar5.c));
            i10++;
            dfbVar2 = dfbVar;
            dgdVar2 = dgdVar;
            dfnVar = dfnVar3;
        }
        this.c = arrayList2;
    }

    @Override // defpackage.dfm
    public final float a() {
        return ((java.lang.Number) this.e.a()).floatValue();
    }

    @Override // defpackage.dfm
    public final float b() {
        return ((java.lang.Number) this.d.a()).floatValue();
    }

    @Override // defpackage.dfm
    public final boolean c() {
        java.util.List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.dfl) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
