package defpackage;

import com.google.android.gms.auth.aang.GetAccountsRequest;

/* loaded from: classes2.dex */
public final class qol {
    public byte a;
    private String b;

    public final GetAccountsRequest a() {
        String str;
        if (this.a == 3 && (str = this.b) != null) {
            return new GetAccountsRequest(str, null, null, false, false);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" accountType");
        }
        if ((this.a & 1) == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        if ((this.a & 2) == 0) {
            sb.append(" includeTransientAccounts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountType");
        }
        this.b = str;
    }
}
