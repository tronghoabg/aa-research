package defpackage;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ty {
    public ty() {
    }

    public static defpackage.yr a(java.util.Map map, android.content.Context context) {
        return new defpackage.yr(context.getPackageManager(), map, false);
    }

    public static void b(java.util.Map map, android.content.Context context) {
        java.lang.String[] stringArray = context.getResources().getStringArray(com.google.android.projection.gearhead.R.array.hosts_allowlist_sample);
        if (stringArray == null) {
            throw new java.lang.IllegalArgumentException("Invalid allowlist res id: 2130903060");
        }
        for (java.lang.String str : stringArray) {
            java.lang.String[] strArrSplit = str.split(",", -1);
            if (strArrSplit.length != 2) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Invalid allowed host entry: '", "'"));
            }
            java.lang.String strJ = j(strArrSplit[1]);
            java.lang.String strJ2 = j(strArrSplit[0]);
            strJ.getClass();
            strJ2.getClass();
            java.util.List arrayList = (java.util.List) map.get(strJ);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                map.put(strJ, arrayList);
            }
            arrayList.add(strJ2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public static float c(defpackage.cuw cuwVar, boolean z, defpackage.cvd[] cvdVarArr, float f) {
        float f2 = Float.NaN;
        for (defpackage.cvd cvdVar : cvdVarArr) {
            float fP = cuwVar.p(cvdVar);
            if (java.lang.Float.isNaN(f2)) {
                f2 = fP;
            } else if (z == (fP > f2)) {
                f2 = fP;
            }
        }
        return java.lang.Float.isNaN(f2) ? f : f2;
    }

    public static defpackage.cgf d(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.cup(affcVar));
    }

    public static defpackage.cgf e(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.cui(affcVar));
    }

    public static int f(defpackage.cuf cufVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.cud((defpackage.csy) list2.get(i3), 2, 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return cufVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static int g(defpackage.cuf cufVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.cud((defpackage.csy) list2.get(i3), 2, 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return cufVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    public static int h(defpackage.cuf cufVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.cud((defpackage.csy) list2.get(i3), 1, 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return cufVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    public static int i(defpackage.cuf cufVar, defpackage.csz cszVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.cud((defpackage.csy) list2.get(i3), 1, 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return cufVar.e(new defpackage.ctb(cszVar, cszVar.p()), arrayList, defpackage.dln.d(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    private static java.lang.String j(java.lang.String str) {
        return str.toLowerCase(java.util.Locale.US).replace(" ", "");
    }

    public ty(byte[] bArr) {
    }
}
