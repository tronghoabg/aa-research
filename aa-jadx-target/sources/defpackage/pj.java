package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pj extends defpackage.pi {
    @Override // defpackage.pi
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i, android.content.Intent intent) {
        if (i != -1) {
            return defpackage.afcf.a;
        }
        if (intent == null) {
            return defpackage.afcf.a;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return defpackage.afcf.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(java.lang.Boolean.valueOf(i2 == 0));
        }
        return defpackage.afga.W(defpackage.afga.bc(defpackage.afga.bU(stringArrayExtra), arrayList));
    }

    @Override // defpackage.pi
    public final /* bridge */ /* synthetic */ android.content.Intent b(java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        strArr.getClass();
        android.content.Intent intentPutExtra = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.pi
    public final /* bridge */ /* synthetic */ defpackage.sr c(android.content.Context context, java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new defpackage.sr(defpackage.afcf.a, (byte[]) null);
        }
        for (java.lang.String str : strArr) {
            if (defpackage.duw.c(context, str) != 0) {
                return null;
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(strArr.length), 16));
        for (java.lang.String str2 : strArr) {
            defpackage.afau afauVar = new defpackage.afau(str2, java.lang.Boolean.TRUE);
            linkedHashMap.put(afauVar.a, afauVar.b);
        }
        return new defpackage.sr(linkedHashMap, (byte[]) null);
    }
}
