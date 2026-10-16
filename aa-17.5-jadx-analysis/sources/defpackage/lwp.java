package defpackage;

/* loaded from: classes2.dex */
public final class lwp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lwp(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwp)) {
            return false;
        }
        lwp lwpVar = (lwp) obj;
        return affa.f(this.a, lwpVar.a) && affa.f(this.b, lwpVar.b) && affa.f(this.c, lwpVar.c) && affa.f(this.d, lwpVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        String str3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "FulfillmentData(phoneNumber=" + this.a + ", destination=" + this.b + ", contactName=" + this.c + ", replyText=" + this.d + ")";
    }

    public lwp() {
        this(null, null, null, null);
    }
}
