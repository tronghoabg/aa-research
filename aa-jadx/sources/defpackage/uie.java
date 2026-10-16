package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class uie {
    public abstract defpackage.uka a();

    public abstract int b();

    public int c() {
        throw null;
    }

    public final boolean d() {
        return c() > 1;
    }

    public final defpackage.ukz[] e() {
        int iB = b();
        defpackage.uka ukaVarA = a();
        return iB == 2 ? ukaVarA.n : ukaVarA.o;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uie) {
            return java.util.Arrays.equals(e(), ((defpackage.uie) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(e());
    }
}
