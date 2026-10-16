package defpackage;

/* loaded from: classes2.dex */
public final class kev implements Comparable {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public kev(String str, String str2, String str3, int i) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null metadata");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null recommendation");
        }
        this.c = str3;
        this.d = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.d - 1, ((kev) obj).d - 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kev) {
            kev kevVar = (kev) obj;
            if (this.a.equals(kevVar.a) && this.b.equals(kevVar.b) && this.c.equals(kevVar.c) && this.d == kevVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        int i = this.d;
        return "TestReport{reportSummary=" + this.a + ", metadata=" + this.b + ", recommendation=" + this.c + ", resultType=" + (i != 1 ? i != 2 ? "PASS" : "FAIL_TESTS" : "FAIL_PRECONDITIONS") + "}";
    }

    public kev() {
        throw null;
    }
}
