package defpackage;

/* loaded from: classes.dex */
public final class bkj {
    public final int a;
    public final long b = 1;
    private final int c;

    public bkj(int i, int i2) {
        this.c = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkj)) {
            return false;
        }
        bkj bkjVar = (bkj) obj;
        if (this.c != bkjVar.c || this.a != bkjVar.a) {
            return false;
        }
        long j = bkjVar.b;
        return true;
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a) * 31) + 1;
    }

    public final String toString() {
        return "AnchorInfo(direction=" + ((Object) dka.e(this.c)) + ", offset=" + this.a + ", selectableId=1)";
    }
}
