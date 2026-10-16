package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajtm implements java.lang.Cloneable {
    public static final defpackage.ajtm a = new defpackage.ajtm(-1, -1);
    public final int b;
    public final int c;

    public ajtm(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return (defpackage.ajtm) super.clone();
    }

    public final java.lang.String toString() {
        return "[maxLineLength=" + this.b + ", maxHeaderCount=" + this.c + "]";
    }
}
