package defpackage;

/* loaded from: classes2.dex */
public final class maa {
    public final String a;
    public final String b;

    public maa(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maa)) {
            return false;
        }
        maa maaVar = (maa) obj;
        return affa.f(this.a, maaVar.a) && affa.f(this.b, maaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NotificationIdentifierData(tag=" + this.a + ", packageName=" + this.b + ")";
    }
}
