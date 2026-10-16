package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class usc {
    public boolean a;

    public usc(byte[] bArr) {
        this.a = true;
    }

    public final defpackage.ifh a() {
        return new defpackage.ifh(this.a);
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

    public usc() {
    }

    public usc(char[] cArr, byte[] bArr) {
        this.a = false;
    }
}
