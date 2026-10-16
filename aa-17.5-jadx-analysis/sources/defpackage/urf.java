package defpackage;

/* loaded from: classes3.dex */
public final class urf {
    public boolean a;

    public urf(byte[] bArr) {
        this.a = true;
    }

    public final iez a() {
        return new iez(this.a);
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        synchronized (this) {
            this.a = true;
            notifyAll();
        }
    }

    public urf() {
    }

    public urf(char[] cArr, byte[] bArr) {
        this.a = false;
    }
}
