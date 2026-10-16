package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cda {
    public int a;

    public cda(byte[] bArr) {
        this.a = 0;
    }

    public final java.lang.String toString() {
        int i = this.a;
        java.lang.String string = java.lang.Integer.toString(hashCode(), 16);
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }

    public cda() {
        this(null);
    }
}
