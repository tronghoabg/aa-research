package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dbm {
    public static final defpackage.dbm a = new defpackage.dbm(0, 0);
    public final long b;
    private final long c;

    public dbm(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dbm)) {
            return false;
        }
        defpackage.dbm dbmVar = (defpackage.dbm) obj;
        return defpackage.a.i(this.b, dbmVar.b) && defpackage.a.i(this.c, dbmVar.c);
    }

    public final int hashCode() {
        return (defpackage.a.f(this.b) * 31) + defpackage.a.f(this.c);
    }
}
