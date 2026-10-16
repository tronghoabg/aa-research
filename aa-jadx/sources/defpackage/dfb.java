package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dfb implements java.lang.CharSequence {
    public final java.util.List a;
    public final java.lang.String b;
    public final java.util.List c;
    public final java.util.List d;

    public dfb(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                defpackage.dfa dfaVar = (defpackage.dfa) list.get(i);
                java.lang.Object obj = dfaVar.a;
                if (obj instanceof defpackage.dft) {
                    arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
                    dfaVar.getClass();
                    arrayList.add(dfaVar);
                } else if (obj instanceof defpackage.dfn) {
                    arrayList2 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                    dfaVar.getClass();
                    arrayList2.add(dfaVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        java.util.List listAW = arrayList2 != null ? defpackage.afga.aW(arrayList2, new defpackage.azq(4)) : null;
        if (listAW == null || listAW.isEmpty()) {
            return;
        }
        defpackage.zm zmVarA = defpackage.zn.a(((defpackage.dfa) defpackage.afga.az(listAW)).c);
        int size2 = listAW.size();
        for (int i2 = 1; i2 < size2; i2++) {
            defpackage.dfa dfaVar2 = (defpackage.dfa) listAW.get(i2);
            while (zmVarA.b != 0) {
                int iB = zmVarA.b();
                if (dfaVar2.b < iB) {
                    int i3 = dfaVar2.c;
                    if (i3 <= iB) {
                        break;
                    }
                    defpackage.dki.c(defpackage.a.bn(iB, i3, "Paragraph overlap not allowed, end ", " should be less than or equal to "));
                    break;
                }
                zmVarA.f(zmVarA.b - 1);
            }
            zmVarA.e(dfaVar2.c);
        }
    }

    public final int a() {
        return this.b.length();
    }

    public final defpackage.dfb b(defpackage.affc affcVar) {
        defpackage.dez dezVar = new defpackage.dez(this);
        java.util.List list = dezVar.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, defpackage.dbb.e((defpackage.dfa) affcVar.invoke(((defpackage.dey) list.get(i)).a(Integer.MIN_VALUE))));
        }
        return dezVar.b();
    }

    public final defpackage.dfb c(defpackage.dfb dfbVar) {
        defpackage.dez dezVar = new defpackage.dez(this);
        dezVar.e(dfbVar);
        return dezVar.b();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final defpackage.dfb subSequence(int i, int i2) {
        if (i > i2) {
            defpackage.dki.c(defpackage.a.bz(i2, i, "start (", ") should be less or equal to end (", ")"));
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        java.lang.String strSubstring = this.b.substring(i, i2);
        strSubstring.getClass();
        java.util.List list = this.a;
        defpackage.dfb dfbVar = defpackage.dfc.a;
        if (i > i2) {
            defpackage.dki.c("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        java.util.ArrayList arrayList = null;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                defpackage.dfa dfaVar = (defpackage.dfa) list.get(i3);
                int i4 = dfaVar.b;
                int i5 = dfaVar.c;
                if ((((i == i2) | (i4 == i5)) & (i == i4)) | ((i4 < i2) & (i < i5))) {
                    arrayList2.add(new defpackage.dfa(dfaVar.a, java.lang.Math.max(i, i4) - i, java.lang.Math.min(i2, i5) - i, dfaVar.d));
                }
                i3++;
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new defpackage.dfb(arrayList, strSubstring);
    }

    public final defpackage.dfb e(long j) {
        long j2 = defpackage.dgc.a;
        long j3 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        return subSequence(java.lang.Math.min(i, i2), java.lang.Math.max(i, i2));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfb)) {
            return false;
        }
        defpackage.dfb dfbVar = (defpackage.dfb) obj;
        return defpackage.afga.f(this.b, dfbVar.b) && defpackage.afga.f(this.a, dfbVar.a);
    }

    public final java.util.List f() {
        java.util.List list = this.c;
        return list == null ? defpackage.afce.a : list;
    }

    public final java.util.List g(int i) {
        java.util.List list = this.a;
        if (list == null) {
            return defpackage.afce.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            defpackage.dfa dfaVar = (defpackage.dfa) obj;
            if (dfaVar.a instanceof defpackage.dfg) {
                int i3 = dfaVar.b;
                int i4 = dfaVar.c;
                defpackage.dfb dfbVar = defpackage.dfc.a;
                if ((((i3 == i4) | (i == 0)) & (i3 == 0)) | ((i4 > 0) & (i3 < i))) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final boolean h(int i) {
        java.util.List list = this.a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.dfa dfaVar = (defpackage.dfa) list.get(i2);
                if (dfaVar.a instanceof defpackage.dfg) {
                    int i3 = dfaVar.b;
                    int i4 = dfaVar.c;
                    defpackage.dfb dfbVar = defpackage.dfc.a;
                    if ((((i3 == i4) | (i == 0)) & (i3 == 0)) | ((i4 > 0) & (i3 < i))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        java.util.List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.b;
    }

    public /* synthetic */ dfb(java.lang.String str) {
        this(str, defpackage.afce.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dfb(java.lang.String str, java.util.List list, byte[] bArr) {
        this(true == list.isEmpty() ? null : list, str);
        defpackage.dfb dfbVar = defpackage.dfc.a;
    }

    public dfb(java.lang.String str, java.util.List list) {
        this(true == list.isEmpty() ? null : list, str);
    }
}
