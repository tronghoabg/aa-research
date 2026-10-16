package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sfp extends defpackage.sfo {
    private final java.lang.String[] e;

    public sfp(java.lang.String str, java.lang.String[] strArr) {
        super(str, true);
        this.e = strArr;
    }

    @Override // defpackage.sfo
    public final int a(android.content.Context context) {
        java.lang.String str = this.e[0];
        android.content.pm.PackageInfo packageInfoB = b(context, str);
        if (packageInfoB == null) {
            return super.a(context);
        }
        if (e(packageInfoB)) {
            return 1;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bp(str, "Beta package: ", " installed but does not meet min version"));
    }

    @Override // defpackage.sfo
    public final java.lang.String toString() {
        java.lang.String[] strArr = this.e;
        return super.toString() + ", satisfiablePkgs=" + java.util.Arrays.toString(strArr);
    }
}
