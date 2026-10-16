package defpackage;

import android.accounts.Account;

/* loaded from: classes3.dex */
final class uxp implements uxs {
    private final aezk a;
    private final xxh b;

    static {
        new Account("signedout@", "com.google.android.apps.maps");
    }

    public uxp(aezk aezkVar, xxh xxhVar) {
        this.a = aezkVar;
        this.b = xxhVar;
    }

    @Override // defpackage.uxs
    public final Account a() {
        return (Account) ((xxm) ((uyq) this.a).b()).a;
    }

    @Override // defpackage.uxs
    public final zgp b() {
        return ((uxr) this.b.d(new uxo())).a();
    }
}
