package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class nzc implements defpackage.mnj {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.AppProvider");
    private final java.lang.String b;

    protected nzc(java.lang.String str) {
        this.b = str;
    }

    public static final defpackage.ygw m(java.util.Collection collection, defpackage.absk abskVar) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) it.next();
            if (resolveInfo.serviceInfo != null) {
                android.content.ComponentName componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                if (defpackage.kmv.b(abskVar, componentName)) {
                    ygrVar.i(componentName);
                } else {
                    ((defpackage.yqj) a.l().ai((char) 5572)).y("%s is not allowed by filter", componentName.flattenToString());
                }
            }
        }
        return ygrVar.g();
    }

    protected static final defpackage.ygw n(java.util.Collection collection) {
        defpackage.abor aborVarN = defpackage.absk.a.n();
        aborVarN.t();
        defpackage.absk abskVar = (defpackage.absk) aborVarN.b;
        abskVar.c = 4;
        abskVar.b |= 1;
        return m(collection, (defpackage.absk) aborVarN.q());
    }

    public abstract defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar);

    @Override // defpackage.mnj
    public void h(java.io.PrintWriter printWriter) {
        printWriter.printf("Provider: %s\n", this.b);
        ez(printWriter);
    }

    public final java.lang.String l(defpackage.nze nzeVar) {
        return this.b.concat(nzeVar.toString());
    }

    public final java.lang.String toString() {
        return this.b;
    }

    protected void ez(java.io.PrintWriter printWriter) {
    }
}
