package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfc {
    public static final defpackage.dfb a = new defpackage.dfb("");

    public static final java.util.List a(defpackage.dfb dfbVar, int i, int i2, defpackage.affc affcVar) {
        java.util.List list;
        if (i == i2 || (list = dfbVar.a) == null) {
            return null;
        }
        if (i == 0) {
            if (i2 >= dfbVar.b.length()) {
                if (affcVar == null) {
                    return list;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    java.lang.Object obj = list.get(i3);
                    if (((java.lang.Boolean) affcVar.invoke(((defpackage.dfa) obj).a)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            i = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            defpackage.dfa dfaVar = (defpackage.dfa) list.get(i4);
            if (affcVar == null || ((java.lang.Boolean) affcVar.invoke(dfaVar.a)).booleanValue()) {
                int i5 = dfaVar.b;
                int i6 = dfaVar.c;
                if ((((i == i2) | (i5 == i6)) & (i == i5)) | ((i5 < i2) & (i < i6))) {
                    arrayList2.add(new defpackage.dfa((defpackage.dex) dfaVar.a, defpackage.afqt.g(i5, i, i2) - i, defpackage.afqt.g(i6, i, i2) - i, dfaVar.d));
                }
            }
        }
        return arrayList2;
    }
}
