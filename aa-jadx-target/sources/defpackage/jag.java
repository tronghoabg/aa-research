package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jag {
    public final int a;
    public final int b;
    public final boolean c;
    public final defpackage.jcb d;
    public final int e;

    public jag(int i, int i2, boolean z, defpackage.jcb jcbVar, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = jcbVar;
        this.e = i3;
    }

    public static defpackage.jaf a() {
        defpackage.jaf jafVar = new defpackage.jaf();
        jafVar.d(16128);
        jafVar.e(defpackage.jcb.a);
        jafVar.b(0);
        jafVar.a = true;
        jafVar.b = (byte) (jafVar.b | 4);
        jafVar.c(-1);
        return jafVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jag) {
            defpackage.jag jagVar = (defpackage.jag) obj;
            if (this.a == jagVar.a && this.b == jagVar.b && this.c == jagVar.c && this.d.equals(jagVar.d) && this.e == jagVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ (((((true != this.c ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        return "FramerConnectionSettings{fragmentSize=" + this.a + ", bufferedStreamSize=" + this.b + ", allowAudioPacketDrops=" + this.c + ", senderLibConfig=" + java.lang.String.valueOf(this.d) + ", connectionType=" + this.e + "}";
    }

    public jag() {
        throw null;
    }
}
