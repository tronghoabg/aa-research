package defpackage;

/* loaded from: classes.dex */
public final class dju implements diz {
    private final int a;
    private final int b;

    public dju(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.diz
    public final void a(dja djaVar) {
        int iG = afpt.g(this.a, 0, djaVar.c());
        int iG2 = afpt.g(this.b, 0, djaVar.c());
        if (iG < iG2) {
            djaVar.j(iG, iG2);
        } else {
            djaVar.j(iG2, iG);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dju)) {
            return false;
        }
        dju djuVar = (dju) obj;
        return this.a == djuVar.a && this.b == djuVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ")";
    }
}
