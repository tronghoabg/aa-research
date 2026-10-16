package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final h.a.u f51155a = new h.a.u();

    /* renamed from: b, reason: collision with root package name */
    private int f51156b;

    protected final void b(byte[] bArr) {
        h.g.b.x.f(bArr, "array");
        synchronized (this) {
            int i2 = this.f51156b;
            int length = bArr.length;
            if (i2 + length < c.f51153a) {
                this.f51156b += length >> 1;
                this.f51155a.addLast(bArr);
            }
        }
    }

    protected final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f51155a.f();
            if (bArr != null) {
                this.f51156b -= bArr.length >> 1;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[512] : bArr;
    }
}
