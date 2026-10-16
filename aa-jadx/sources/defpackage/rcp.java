package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rcp {
    public final int a;

    public rcp(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.rcp)) {
            return false;
        }
        int i = this.a;
        int i2 = ((defpackage.rcp) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        defpackage.a.aI(i);
        return (i ^ 1000003) * 1000003;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 2 || i == 0) {
            throw null;
        }
        return defpackage.sqg.o(i);
    }

    public rcp() {
        throw null;
    }
}
