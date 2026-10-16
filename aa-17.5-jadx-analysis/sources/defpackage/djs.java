package defpackage;

/* loaded from: classes.dex */
public final class djs implements diz {
    private final int a;
    private final int b;

    public djs(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.diz
    public final void a(dja djaVar) {
        if (djaVar.k()) {
            djaVar.f();
        }
        int iG = afpt.g(this.a, 0, djaVar.c());
        int iG2 = afpt.g(this.b, 0, djaVar.c());
        if (iG != iG2) {
            if (iG < iG2) {
                djaVar.i(iG, iG2);
            } else {
                djaVar.i(iG2, iG);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djs)) {
            return false;
        }
        djs djsVar = (djs) obj;
        return this.a == djsVar.a && this.b == djsVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ")";
    }
}
