package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class wey {
    private final String a;
    private final String b = "files";
    private String c = "common";
    private final Account d = wez.b;
    private String e = "";
    private final yfl f;

    public wey(Context context) {
        int i = yfq.d;
        this.f = new yfl(4);
        aclh.o(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        String str;
        String str2 = this.c;
        Account account = wew.a;
        Account account2 = this.d;
        aclh.o(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        aclh.o(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        aclh.o(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (wew.a.equals(account2)) {
            str = "shared";
        } else {
            str = account2.type + ":" + account2.name;
        }
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.b + "/" + str2 + "/" + str + "/" + this.e).encodedFragment(wfp.a(this.f.g())).build();
    }

    public final void b(String str) {
        aclh.o(wez.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", new Object[]{str});
        aclh.o(!wez.c.contains(str), "Module name is reserved and cannot be used: %s", new Object[]{str});
        this.c = str;
    }

    public final void c(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = wez.a;
        this.e = str;
    }
}
