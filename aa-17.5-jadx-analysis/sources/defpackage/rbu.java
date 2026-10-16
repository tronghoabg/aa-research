package defpackage;

/* loaded from: classes2.dex */
public final class rbu {
    public final int a;

    public rbu(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rbu)) {
            return false;
        }
        int i = this.a;
        int i2 = ((rbu) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aJ(i);
        return (i ^ 1000003) * 1000003;
    }

    public final String toString() {
        int i = this.a;
        if (i == 2 || i == 0) {
            throw null;
        }
        return qrv.o(i);
    }

    public rbu() {
        throw null;
    }
}
