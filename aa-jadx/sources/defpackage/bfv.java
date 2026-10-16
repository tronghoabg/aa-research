package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bfv {
    private final int a;

    public bfv(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.bfv) && this.a == ((defpackage.bfv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
