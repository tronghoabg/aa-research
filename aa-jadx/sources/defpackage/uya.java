package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uya {
    public int a;
    public boolean b;
    public java.lang.Object c;

    public uya(defpackage.wr wrVar) {
        this.c = defpackage.wq.a;
        this.a = wrVar.e;
        this.c = wrVar.f;
        this.b = wrVar.g;
    }

    public final synchronized int a() {
        return this.a;
    }

    public final synchronized void b(int i) {
        defpackage.ysr.bk(this.b, "GrowableByteArray has not been released");
        this.b = false;
        this.a = i;
        if (i > ((byte[]) this.c).length) {
            this.c = new byte[i];
        }
    }

    public final synchronized void c() {
        this.b = true;
    }

    public final synchronized void d(int i) {
        defpackage.ysr.aY(i >= 0, "Invalid length");
        java.lang.Object obj = this.c;
        if (((byte[]) obj).length >= i) {
            this.a = i;
            return;
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(obj, 0, bArr, 0, java.lang.Math.min(this.a, i));
        this.a = i;
        this.c = bArr;
    }

    public final synchronized byte[] e() {
        defpackage.ysr.bk(!this.b, "GrowableByteArray has been released");
        return (byte[]) this.c;
    }

    public uya(byte[] bArr) {
        this.c = defpackage.wq.a;
    }

    public uya() {
        this.b = true;
        byte[] bArr = new byte[0];
        this.c = bArr;
        b(bArr.length);
    }
}
