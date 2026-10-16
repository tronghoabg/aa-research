package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tj {
    public boolean a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public tj(byte[] bArr, byte[] bArr2) {
        this.a = false;
    }

    public final androidx.car.app.model.Badge a() {
        boolean z = this.a;
        if (!z && this.c == null) {
            throw new java.lang.IllegalStateException("A badge must have a dot or an icon set");
        }
        if (z || this.b == null) {
            return new androidx.car.app.model.Badge(this);
        }
        throw new java.lang.IllegalStateException("The dot must be enabled to set the dot color.");
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        this.a = false;
        this.d = defpackage.upo.NOT_FOUND_LOCALLY;
        this.b = null;
        this.c = null;
    }

    public tj() {
    }

    public tj(char[] cArr) {
        c();
    }
}
