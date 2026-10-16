package defpackage;

/* loaded from: classes3.dex */
public final class uxe {
    public int a;
    public boolean b;
    public Object c;

    public uxe(wk wkVar) {
        this.c = wj.a;
        this.a = wkVar.e;
        this.c = wkVar.f;
        this.b = wkVar.g;
    }

    public final synchronized int a() {
        return this.a;
    }

    public final synchronized void b(int i) {
        woy.aa(this.b, "GrowableByteArray has not been released");
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
        woy.O(i >= 0, "Invalid length");
        Object obj = this.c;
        if (((byte[]) obj).length >= i) {
            this.a = i;
            return;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(obj, 0, bArr, 0, Math.min(this.a, i));
        this.a = i;
        this.c = bArr;
    }

    public final synchronized byte[] e() {
        woy.aa(!this.b, "GrowableByteArray has been released");
        return (byte[]) this.c;
    }

    public uxe(byte[] bArr) {
        this.c = wj.a;
    }

    public uxe() {
        this.b = true;
        byte[] bArr = new byte[0];
        this.c = bArr;
        b(bArr.length);
    }
}
