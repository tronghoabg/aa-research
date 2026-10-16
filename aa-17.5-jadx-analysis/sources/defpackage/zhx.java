package defpackage;

import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class zhx extends adom {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ ygr b;
    final /* synthetic */ skn c;

    public zhx(PackageManager packageManager, ygr ygrVar, skn sknVar) {
        this.a = packageManager;
        this.b = ygrVar;
        this.c = sknVar;
    }

    @Override // defpackage.adom
    public final adnq a(int i) {
        String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (this.b.contains(str)) {
                    return !this.c.c(i) ? adnq.g.e("Rejected by (1st-party only Allowlist) security policy. Not google-signed.") : adnq.b;
                }
            }
        }
        return adnq.g.e("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
    }
}
