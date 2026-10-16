package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dlh {
    public static final defpackage.dlh a;
    public final long b;
    public final long c;

    static {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        a = new defpackage.dlh(4294967296L, 4294967296L);
    }

    public dlh(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dlh)) {
            return false;
        }
        long j = this.b;
        defpackage.dlh dlhVar = (defpackage.dlh) obj;
        long j2 = dlhVar.b;
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return j == j2 && this.c == dlhVar.c;
    }

    public final int hashCode() {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return (((int) (this.b ^ 1)) * 31) + ((int) (this.c ^ 1));
    }

    public final java.lang.String toString() {
        long j = this.c;
        return "TextIndent(firstLine=" + defpackage.dmb.c(this.b) + ", restLine=" + defpackage.dmb.c(j) + ")";
    }
}
