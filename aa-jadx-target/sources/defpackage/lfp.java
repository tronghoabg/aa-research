package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lfp {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final boolean d;

    public lfp(java.lang.String str, boolean z) {
        java.lang.String[] strArrSplit = str.split(":", 3);
        int iIntValue = 0;
        this.a = strArrSplit[0];
        if (strArrSplit.length >= 2) {
            try {
                iIntValue = java.lang.Integer.decode(strArrSplit[1]).intValue();
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.c = iIntValue;
        this.b = strArrSplit.length == 3 ? strArrSplit[2] : null;
        this.d = z;
    }

    public final int a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(this.a, 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            ((defpackage.yqj) defpackage.lfr.a.l().ai(3871)).y("Package %s not found.", this.a);
            return -1;
        }
    }

    protected final int b(android.content.Context context) {
        int iA = a(context);
        if (iA == -1) {
            return this.d ? 3 : 1;
        }
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.lfr.a.l().ai(3872);
        java.lang.String str = this.a;
        int i = this.c;
        yqjVar.R("Package %s: installed ver=%d minimum required ver=%d", str, java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(i));
        return iA >= i ? 1 : 2;
    }

    public final android.content.Intent c() {
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        java.lang.String str = this.a;
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        return intent;
    }

    final boolean d(android.content.Context context) {
        return b(context) == 1;
    }

    public final java.lang.String toString() {
        return "packageName=".concat(java.lang.String.valueOf(this.a));
    }
}
