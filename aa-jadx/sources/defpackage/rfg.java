package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rfg {
    public boolean a;
    public boolean b;
    public byte c;
    public java.lang.Object d;
    public java.lang.Object e;

    public final void a(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public final defpackage.mlz c() {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (this.c == 3 && (obj = this.e) != null && (obj2 = this.d) != null) {
            return new defpackage.mlz((defpackage.rzs) obj, (defpackage.rzq) obj2, this.b, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e == null) {
            sb.append(" usbState");
        }
        if (this.d == null) {
            sb.append(" portStatus");
        }
        if ((this.c & 1) == 0) {
            sb.append(" androidAutoStarted");
        }
        if ((this.c & 2) == 0) {
            sb.append(" projectionStarted");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 1);
    }

    public final void e(defpackage.rzq rzqVar) {
        if (rzqVar == null) {
            throw new java.lang.NullPointerException("Null portStatus");
        }
        this.d = rzqVar;
    }

    public final void f(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 2);
    }
}
