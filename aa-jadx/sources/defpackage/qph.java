package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qph {
    public byte a;
    private java.lang.String b;

    public final com.google.android.gms.auth.aang.GetAccountsRequest a() {
        java.lang.String str;
        if (this.a == 3 && (str = this.b) != null) {
            return new com.google.android.gms.auth.aang.GetAccountsRequest(str, null, null, false, false);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" accountType");
        }
        if ((this.a & 1) == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        if ((this.a & 2) == 0) {
            sb.append(" includeTransientAccounts");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accountType");
        }
        this.b = str;
    }
}
