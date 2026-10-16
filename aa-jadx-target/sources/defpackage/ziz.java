package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ziz extends defpackage.adpn {
    final /* synthetic */ android.content.pm.PackageManager a;
    final /* synthetic */ defpackage.yhx b;
    final /* synthetic */ defpackage.slj c;

    public ziz(android.content.pm.PackageManager packageManager, defpackage.yhx yhxVar, defpackage.slj sljVar) {
        this.a = packageManager;
        this.b = yhxVar;
        this.c = sljVar;
    }

    @Override // defpackage.adpn
    public final defpackage.ador a(int i) {
        java.lang.String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (this.b.contains(str)) {
                    return !this.c.c(i) ? defpackage.ador.g.e("Rejected by (1st-party only Allowlist) security policy. Not google-signed.") : defpackage.ador.b;
                }
            }
        }
        return defpackage.ador.g.e("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
    }
}
