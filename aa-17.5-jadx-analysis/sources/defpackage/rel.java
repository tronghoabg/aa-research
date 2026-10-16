package defpackage;

/* loaded from: classes2.dex */
public final class rel {
    public boolean a;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;

    public final void a(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public final mlu c() {
        Object obj;
        Object obj2;
        if (this.c == 3 && (obj = this.e) != null && (obj2 = this.d) != null) {
            return new mlu((ryx) obj, (ryv) obj2, this.b, this.a);
        }
        StringBuilder sb = new StringBuilder();
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
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 1);
    }

    public final void e(ryv ryvVar) {
        if (ryvVar == null) {
            throw new NullPointerException("Null portStatus");
        }
        this.d = ryvVar;
    }

    public final void f(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 2);
    }
}
