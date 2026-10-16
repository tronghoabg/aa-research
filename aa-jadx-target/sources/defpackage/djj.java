package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class djj {
    public int a;
    public char[] b;
    public int c;
    public int d;

    public djj(char[] cArr, int i, int i2) {
        this.a = cArr.length;
        this.b = cArr;
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        return this.d - this.c;
    }

    public final int b() {
        return this.a - a();
    }

    public final java.lang.String toString() {
        return "";
    }
}
