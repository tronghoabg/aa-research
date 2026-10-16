package defpackage;

/* loaded from: classes.dex */
public final class izz {
    public final int a;
    public final int b;
    public final boolean c;
    public final jbu d;
    public final int e;

    public izz(int i, int i2, boolean z, jbu jbuVar, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = jbuVar;
        this.e = i3;
    }

    public static izy a() {
        izy izyVar = new izy();
        izyVar.d(16128);
        izyVar.e(jbu.a);
        izyVar.b(0);
        izyVar.a = true;
        izyVar.b = (byte) (izyVar.b | 4);
        izyVar.c(-1);
        return izyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof izz) {
            izz izzVar = (izz) obj;
            if (this.a == izzVar.a && this.b == izzVar.b && this.c == izzVar.c && this.d.equals(izzVar.d) && this.e == izzVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ (((((true != this.c ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "FramerConnectionSettings{fragmentSize=" + this.a + ", bufferedStreamSize=" + this.b + ", allowAudioPacketDrops=" + this.c + ", senderLibConfig=" + String.valueOf(this.d) + ", connectionType=" + this.e + "}";
    }

    public izz() {
        throw null;
    }
}
