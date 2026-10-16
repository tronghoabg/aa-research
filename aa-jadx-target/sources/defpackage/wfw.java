package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wfw {
    private final java.lang.String a;
    private final java.lang.String b = "files";
    private java.lang.String c = "common";
    private final android.accounts.Account d = defpackage.wfx.b;
    private java.lang.String e = "";
    private final defpackage.ygr f;

    public wfw(android.content.Context context) {
        int i = defpackage.ygw.d;
        this.f = new defpackage.ygr(4);
        defpackage.acmj.h(context != null, "Context cannot be null", new java.lang.Object[0]);
        this.a = context.getPackageName();
    }

    public final android.net.Uri a() {
        java.lang.String str;
        java.lang.String str2 = this.c;
        android.accounts.Account account = defpackage.wfu.a;
        android.accounts.Account account2 = this.d;
        defpackage.acmj.h(account2.type.indexOf(58) == -1, "Account type contains ':'.", new java.lang.Object[0]);
        defpackage.acmj.h(account2.type.indexOf(47) == -1, "Account type contains '/'.", new java.lang.Object[0]);
        defpackage.acmj.h(account2.name.indexOf(47) == -1, "Account name contains '/'.", new java.lang.Object[0]);
        if (defpackage.wfu.a.equals(account2)) {
            str = "shared";
        } else {
            str = account2.type + ":" + account2.name;
        }
        return new android.net.Uri.Builder().scheme("android").authority(this.a).path("/" + this.b + "/" + str2 + "/" + str + "/" + this.e).encodedFragment(defpackage.wgo.a(this.f.g())).build();
    }

    public final void b(java.lang.String str) {
        defpackage.acmj.h(defpackage.wfx.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", new java.lang.Object[]{str});
        defpackage.acmj.h(!defpackage.wfx.c.contains(str), "Module name is reserved and cannot be used: %s", new java.lang.Object[]{str});
        this.c = str;
    }

    public final void c(java.lang.String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        java.util.regex.Pattern pattern = defpackage.wfx.a;
        this.e = str;
    }
}
