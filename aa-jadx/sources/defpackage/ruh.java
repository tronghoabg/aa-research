package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ruh {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public ruh(int i, int i2, boolean z, boolean z2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = i3;
    }

    public static defpackage.rug a() {
        defpackage.rug rugVar = new defpackage.rug();
        rugVar.a = 16128;
        rugVar.b = (byte) (rugVar.b | 1);
        rugVar.d(false);
        rugVar.b(0);
        rugVar.e(false);
        rugVar.c(-1);
        return rugVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ruh) {
            defpackage.ruh ruhVar = (defpackage.ruh) obj;
            if (this.a == ruhVar.a && this.b == ruhVar.b && this.c == ruhVar.c && this.d == ruhVar.d && this.e == ruhVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.c ? 1237 : 1231;
        int i2 = this.a;
        int i3 = this.b;
        return this.e ^ ((((i ^ ((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003);
    }

    public final java.lang.String toString() {
        return "FramerConnectionSettings{fragmentSize=" + this.a + ", bufferedStreamSize=" + this.b + ", useConcurrentChannelMap=" + this.c + ", isQoSEnabled=" + this.d + ", connectionType=" + this.e + "}";
    }

    public ruh() {
        throw null;
    }
}
