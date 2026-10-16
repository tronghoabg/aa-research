package Q1;

import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9712a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f9713b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9714c;

    /* renamed from: d, reason: collision with root package name */
    public int f9715d;

    /* renamed from: e, reason: collision with root package name */
    public int f9716e;

    public t(int i5) {
        this.f9712a = i5;
        switch (i5) {
            case 1:
                this.f9713b = new long[10];
                this.f9714c = new Object[10];
                break;
            default:
                this.f9713b = new long[10];
                this.f9714c = new Object[10];
                break;
        }
    }

    private final synchronized void b(long j8, Object obj) {
        if (this.f9716e > 0) {
            if (j8 <= this.f9713b[((this.f9715d + r0) - 1) % this.f9714c.length]) {
                d();
            }
        }
        g();
        int i5 = this.f9715d;
        int i10 = this.f9716e;
        Object[] objArr = this.f9714c;
        int length = (i5 + i10) % objArr.length;
        this.f9713b[length] = j8;
        objArr[length] = obj;
        this.f9716e = i10 + 1;
    }

    private final synchronized void c(long j8, Object obj) {
        if (this.f9716e > 0) {
            if (j8 <= this.f9713b[((this.f9715d + r0) - 1) % this.f9714c.length]) {
                d();
            }
        }
        g();
        int i5 = this.f9715d;
        int i10 = this.f9716e;
        Object[] objArr = this.f9714c;
        int length = (i5 + i10) % objArr.length;
        this.f9713b[length] = j8;
        objArr[length] = obj;
        this.f9716e = i10 + 1;
    }

    private final synchronized void e() {
        this.f9715d = 0;
        this.f9716e = 0;
        Arrays.fill(this.f9714c, (Object) null);
    }

    private final synchronized void f() {
        this.f9715d = 0;
        this.f9716e = 0;
        Arrays.fill(this.f9714c, (Object) null);
    }

    private final synchronized Object k(long j8) {
        Object objM;
        objM = null;
        while (this.f9716e > 0 && j8 - this.f9713b[this.f9715d] >= 0) {
            objM = m();
        }
        return objM;
    }

    private final synchronized Object l(long j8) {
        return h(j8, true);
    }

    public final synchronized void a(long j8, Object obj) {
        switch (this.f9712a) {
            case 0:
                b(j8, obj);
                break;
            default:
                c(j8, obj);
                break;
        }
    }

    public final synchronized void d() {
        switch (this.f9712a) {
            case 0:
                e();
                break;
            default:
                f();
                break;
        }
    }

    public final void g() {
        switch (this.f9712a) {
            case 0:
                int length = this.f9714c.length;
                if (this.f9716e >= length) {
                    int i5 = length * 2;
                    long[] jArr = new long[i5];
                    Object[] objArr = new Object[i5];
                    int i10 = this.f9715d;
                    int i11 = length - i10;
                    System.arraycopy(this.f9713b, i10, jArr, 0, i11);
                    System.arraycopy(this.f9714c, this.f9715d, objArr, 0, i11);
                    int i12 = this.f9715d;
                    if (i12 > 0) {
                        System.arraycopy(this.f9713b, 0, jArr, i11, i12);
                        System.arraycopy(this.f9714c, 0, objArr, i11, this.f9715d);
                    }
                    this.f9713b = jArr;
                    this.f9714c = objArr;
                    this.f9715d = 0;
                    break;
                }
                break;
            default:
                int length2 = this.f9714c.length;
                if (this.f9716e >= length2) {
                    int i13 = length2 * 2;
                    long[] jArr2 = new long[i13];
                    Object[] objArr2 = new Object[i13];
                    int i14 = this.f9715d;
                    int i15 = length2 - i14;
                    System.arraycopy(this.f9713b, i14, jArr2, 0, i15);
                    System.arraycopy(this.f9714c, this.f9715d, objArr2, 0, i15);
                    int i16 = this.f9715d;
                    if (i16 > 0) {
                        System.arraycopy(this.f9713b, 0, jArr2, i15, i16);
                        System.arraycopy(this.f9714c, 0, objArr2, i15, this.f9715d);
                    }
                    this.f9713b = jArr2;
                    this.f9714c = objArr2;
                    this.f9715d = 0;
                    break;
                }
                break;
        }
    }

    public Object h(long j8, boolean z2) {
        Object objM = null;
        long j10 = Long.MAX_VALUE;
        while (this.f9716e > 0) {
            long j11 = j8 - this.f9713b[this.f9715d];
            if (j11 < 0 && (z2 || (-j11) >= j10)) {
                break;
            }
            objM = m();
            j10 = j11;
        }
        return objM;
    }

    public synchronized Object i() {
        return this.f9716e == 0 ? null : m();
    }

    public final synchronized Object j(long j8) {
        switch (this.f9712a) {
            case 0:
                return k(j8);
            default:
                return l(j8);
        }
    }

    public final Object m() {
        switch (this.f9712a) {
            case 0:
                k.g(this.f9716e > 0);
                Object[] objArr = this.f9714c;
                int i5 = this.f9715d;
                Object obj = objArr[i5];
                objArr[i5] = null;
                this.f9715d = (i5 + 1) % objArr.length;
                this.f9716e--;
                return obj;
            default:
                AbstractC4256a.i(this.f9716e > 0);
                Object[] objArr2 = this.f9714c;
                int i10 = this.f9715d;
                Object obj2 = objArr2[i10];
                objArr2[i10] = null;
                this.f9715d = (i10 + 1) % objArr2.length;
                this.f9716e--;
                return obj2;
        }
    }

    public synchronized int n() {
        return this.f9716e;
    }
}
