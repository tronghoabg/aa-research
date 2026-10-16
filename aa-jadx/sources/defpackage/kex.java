package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kex implements java.lang.Comparable {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;

    public kex(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null metadata");
        }
        this.b = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null recommendation");
        }
        this.c = str3;
        this.d = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.d - 1, ((defpackage.kex) obj).d - 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kex) {
            defpackage.kex kexVar = (defpackage.kex) obj;
            if (this.a.equals(kexVar.a) && this.b.equals(kexVar.b) && this.c.equals(kexVar.c) && this.d == kexVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "PASS" : "FAIL_TESTS";
        } else {
            str = "FAIL_PRECONDITIONS";
        }
        return "TestReport{reportSummary=" + this.a + ", metadata=" + this.b + ", recommendation=" + this.c + ", resultType=" + str + "}";
    }

    public kex() {
        throw null;
    }
}
