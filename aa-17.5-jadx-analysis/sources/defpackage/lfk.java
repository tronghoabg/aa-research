package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class lfk {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public lfk(String str, boolean z) {
        String[] strArrSplit = str.split(":", 3);
        int iIntValue = 0;
        this.a = strArrSplit[0];
        if (strArrSplit.length >= 2) {
            try {
                iIntValue = Integer.decode(strArrSplit[1]).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        this.c = iIntValue;
        this.b = strArrSplit.length == 3 ? strArrSplit[2] : null;
        this.d = z;
    }

    public final int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(this.a, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            ((ype) lfm.a.l().ai(3868)).y("Package %s not found.", this.a);
            return -1;
        }
    }

    protected final int b(Context context) {
        int iA = a(context);
        if (iA == -1) {
            return this.d ? 3 : 1;
        }
        ype ypeVar = (ype) lfm.a.l().ai(3869);
        String str = this.a;
        int i = this.c;
        ypeVar.R("Package %s: installed ver=%d minimum required ver=%d", str, Integer.valueOf(iA), Integer.valueOf(i));
        return iA >= i ? 1 : 2;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        String str = this.a;
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        return intent;
    }

    final boolean d(Context context) {
        return b(context) == 1;
    }

    public final String toString() {
        return "packageName=".concat(String.valueOf(this.a));
    }
}
