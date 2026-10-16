package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kim {
    public final java.lang.String a;
    public final defpackage.krg b;
    public final int c;
    public final long d;
    public final android.net.Uri e;
    public final android.telecom.PhoneAccount f;

    public kim(java.lang.String str, defpackage.krg krgVar, int i, long j, android.net.Uri uri, android.telecom.PhoneAccount phoneAccount) {
        this.a = str;
        this.b = krgVar;
        this.c = i;
        this.d = j;
        this.e = uri;
        this.f = phoneAccount;
    }

    public final boolean equals(java.lang.Object obj) {
        android.net.Uri uri;
        android.telecom.PhoneAccount phoneAccount;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kim) {
            defpackage.kim kimVar = (defpackage.kim) obj;
            if (this.a.equals(kimVar.a) && this.b.equals(kimVar.b) && this.c == kimVar.c && this.d == kimVar.d && ((uri = this.e) != null ? uri.equals(kimVar.e) : kimVar.e == null) && ((phoneAccount = this.f) != null ? phoneAccount.equals(kimVar.f) : kimVar.f == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        android.net.Uri uri = this.e;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        long j = this.d;
        int i = ((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ iHashCode2) * 1000003;
        android.telecom.PhoneAccount phoneAccount = this.f;
        return i ^ (phoneAccount != null ? phoneAccount.hashCode() : 0);
    }

    public final java.lang.String toString() {
        android.telecom.PhoneAccount phoneAccount = this.f;
        android.net.Uri uri = this.e;
        return "CallLogEntry{displayName=" + this.a + ", phoneNumber=" + java.lang.String.valueOf(this.b) + ", callType=" + this.c + ", lastCallEpochMs=" + this.d + ", cachedPhotoUri=" + java.lang.String.valueOf(uri) + ", selfManagedPhoneAccount=" + java.lang.String.valueOf(phoneAccount) + "}";
    }

    public kim() {
        throw null;
    }
}
