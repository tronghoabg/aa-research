package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayu {
    public final int a;
    public final int b;

    public ayu(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            defpackage.asq.c("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        defpackage.asq.c("end index greater than start");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ayu)) {
            return false;
        }
        defpackage.ayu ayuVar = (defpackage.ayu) obj;
        return this.a == ayuVar.a && this.b == ayuVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ")";
    }
}
