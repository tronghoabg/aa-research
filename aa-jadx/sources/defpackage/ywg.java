package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ywg implements java.io.Serializable {
    public final int a;
    public final int b;
    public final int c;
    private final int d = 1;

    public ywg(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ywg)) {
            return false;
        }
        defpackage.ywg ywgVar = (defpackage.ywg) obj;
        if (this.a != ywgVar.a || this.b != ywgVar.b || this.c != ywgVar.c) {
            return false;
        }
        int i = ywgVar.d;
        return true;
    }

    public final int hashCode() {
        return ((((((this.a + 403) * 31) + this.b) * 31) + this.c) * 31) + 1;
    }
}
