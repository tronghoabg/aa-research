package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final h.a.u f51158a = new h.a.u();

    /* renamed from: b, reason: collision with root package name */
    private int f51159b;

    protected final void b(char[] cArr) {
        h.g.b.x.f(cArr, "array");
        synchronized (this) {
            int i2 = this.f51159b;
            int length = cArr.length;
            if (i2 + length < c.f51153a) {
                this.f51159b += length;
                this.f51158a.addLast(cArr);
            }
        }
    }

    protected final char[] c() {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f51158a.f();
            if (cArr != null) {
                this.f51159b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[128] : cArr;
    }
}
