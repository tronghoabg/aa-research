package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bmr {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bmr(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bmr)) {
            defpackage.bmr bmrVar = (defpackage.bmr) obj;
            if (this.a == bmrVar.a && this.b == bmrVar.b && this.c == bmrVar.c && this.d == bmrVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = defpackage.a.f(this.a) * 31;
        long j = this.d;
        return ((((iF + defpackage.a.f(this.b)) * 31) + defpackage.a.f(this.c)) * 31) + defpackage.a.f(j);
    }
}
