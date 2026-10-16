package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class alu {
    public final long a = -4294967296L;
    public final long b = -72057594037927936L;
    public final long c = -72057594037927936L;
    public final long d;
    public final long e;

    public alu(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.alu)) {
            return false;
        }
        defpackage.alu aluVar = (defpackage.alu) obj;
        return defpackage.a.i(-4294967296L, -4294967296L) && defpackage.a.i(-72057594037927936L, -72057594037927936L) && defpackage.a.i(-72057594037927936L, -72057594037927936L) && defpackage.a.i(this.d, aluVar.d) && defpackage.a.i(this.e, aluVar.e);
    }

    public final int hashCode() {
        int iF = defpackage.a.f(-4294967296L) * 31;
        long j = this.e;
        return ((((((iF + defpackage.a.f(-72057594037927936L)) * 31) + defpackage.a.f(-72057594037927936L)) * 31) + defpackage.a.f(this.d)) * 31) + defpackage.a.f(j);
    }

    public final java.lang.String toString() {
        long j = this.e;
        long j2 = this.d;
        return "ContextMenuColors(backgroundColor=" + defpackage.ckd.g(-4294967296L) + ", textColor=" + defpackage.ckd.g(-72057594037927936L) + ", iconColor=" + defpackage.ckd.g(-72057594037927936L) + ", disabledTextColor=" + defpackage.ckd.g(j2) + ", disabledIconColor=" + defpackage.ckd.g(j) + ")";
    }
}
