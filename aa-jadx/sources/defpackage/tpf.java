package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpf implements java.io.Serializable {
    public final int a;
    public final int b;
    public final int c;

    public tpf(defpackage.tpm tpmVar) {
        this.a = tpmVar.a;
        this.b = tpmVar.b;
        this.c = tpmVar.c;
    }

    public final defpackage.tpm a() {
        return new defpackage.tpm(this.a, this.b, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.tpf) {
            defpackage.tpf tpfVar = (defpackage.tpf) obj;
            if (this.a == tpfVar.a && this.b == tpfVar.b && this.c == tpfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "ImmutablePoint{(" + this.a + "," + this.b + "," + this.c + ")}";
    }

    public tpf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public tpf(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
    }
}
