package defpackage;

import android.net.Uri;
import android.telecom.PhoneAccount;

/* loaded from: classes2.dex */
public final class kih {
    public final String a;
    public final kqz b;
    public final int c;
    public final long d;
    public final Uri e;
    public final PhoneAccount f;

    public kih(String str, kqz kqzVar, int i, long j, Uri uri, PhoneAccount phoneAccount) {
        this.a = str;
        this.b = kqzVar;
        this.c = i;
        this.d = j;
        this.e = uri;
        this.f = phoneAccount;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        PhoneAccount phoneAccount;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kih) {
            kih kihVar = (kih) obj;
            if (this.a.equals(kihVar.a) && this.b.equals(kihVar.b) && this.c == kihVar.c && this.d == kihVar.d && ((uri = this.e) != null ? uri.equals(kihVar.e) : kihVar.e == null) && ((phoneAccount = this.f) != null ? phoneAccount.equals(kihVar.f) : kihVar.f == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Uri uri = this.e;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        long j = this.d;
        int i = ((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ iHashCode2) * 1000003;
        PhoneAccount phoneAccount = this.f;
        return i ^ (phoneAccount != null ? phoneAccount.hashCode() : 0);
    }

    public final String toString() {
        PhoneAccount phoneAccount = this.f;
        Uri uri = this.e;
        return "CallLogEntry{displayName=" + this.a + ", phoneNumber=" + String.valueOf(this.b) + ", callType=" + this.c + ", lastCallEpochMs=" + this.d + ", cachedPhotoUri=" + String.valueOf(uri) + ", selfManagedPhoneAccount=" + String.valueOf(phoneAccount) + "}";
    }

    public kih() {
        throw null;
    }
}
