package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class euf {
    public int a;
    public int b;

    public euf(byte[] bArr, byte[] bArr2) {
        this.a = Integer.MAX_VALUE;
        this.b = 0;
    }

    static /* synthetic */ java.lang.Object a(java.lang.String str) {
        int i;
        str.getClass();
        if (afzh.g(str, "0x", false)) {
            java.lang.String strSubstring = str.substring(2);
            strSubstring.getClass();
            i = java.lang.Integer.parseInt(strSubstring, 16);
        } else {
            i = java.lang.Integer.parseInt(str);
        }
        return java.lang.Integer.valueOf(i);
    }

    public final int b() {
        return this.a | this.b;
    }

    public final void c(int i, int i2) {
        if (i2 == 1) {
            this.a = i;
        } else {
            this.b = i;
        }
    }

    public final void d(int i) {
        if (i == 1) {
            this.a = 0;
        } else {
            this.b = 0;
        }
    }

    public final void e() {
        this.b = 2;
    }

    public final void f(defpackage.mr mrVar) {
        android.view.View view = mrVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public euf(byte[] bArr) {
    }

    public euf() {
        this.a = -1;
        this.b = -1;
    }
}
