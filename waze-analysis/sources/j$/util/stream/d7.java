package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class d7 extends c implements Iterable, j$.lang.a {

    /* renamed from: e, reason: collision with root package name */
    public Object f50380e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f50381f;

    public d7(int i2) {
        super(i2);
        this.f50380e = newArray(1 << this.f50342a);
    }

    public abstract Object[] A();

    public final void D() {
        long jX;
        if (this.f50343b == x(this.f50380e)) {
            Object[] objArrA = this.f50381f;
            if (objArrA == null) {
                objArrA = A();
                this.f50381f = objArrA;
                this.f50345d = new long[8];
                objArrA[0] = this.f50380e;
            }
            int i2 = this.f50344c;
            int i3 = i2 + 1;
            if (i3 >= objArrA.length || objArrA[i3] == null) {
                if (i2 == 0) {
                    jX = x(this.f50380e);
                } else {
                    jX = x(objArrA[i2]) + this.f50345d[i2];
                }
                z(jX + 1);
            }
            this.f50343b = 0;
            int i4 = this.f50344c + 1;
            this.f50344c = i4;
            this.f50380e = this.f50381f[i4];
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) jCount);
        c(0, objNewArray);
        return objNewArray;
    }

    public void c(int i2, Object obj) {
        long j2 = i2;
        long jCount = count() + j2;
        if (jCount > x(obj) || jCount < j2) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f50344c == 0) {
            System.arraycopy(this.f50380e, 0, obj, i2, this.f50343b);
            return;
        }
        for (int i3 = 0; i3 < this.f50344c; i3++) {
            Object obj2 = this.f50381f[i3];
            System.arraycopy(obj2, 0, obj, i2, x(obj2));
            i2 += x(this.f50381f[i3]);
        }
        int i4 = this.f50343b;
        if (i4 > 0) {
            System.arraycopy(this.f50380e, 0, obj, i2, i4);
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f50381f;
        if (objArr != null) {
            this.f50380e = objArr[0];
            this.f50381f = null;
            this.f50345d = null;
        }
        this.f50343b = 0;
        this.f50344c = 0;
    }

    public void d(Object obj) {
        for (int i2 = 0; i2 < this.f50344c; i2++) {
            Object obj2 = this.f50381f[i2];
            w(obj2, 0, x(obj2), obj);
        }
        w(this.f50380e, 0, this.f50343b, obj);
    }

    public abstract Object newArray(int i2);

    public abstract void w(Object obj, int i2, int i3, Object obj2);

    public abstract int x(Object obj);

    public final int y(long j2) {
        if (this.f50344c == 0) {
            if (j2 < this.f50343b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        if (j2 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        for (int i2 = 0; i2 <= this.f50344c; i2++) {
            if (j2 < this.f50345d[i2] + x(this.f50381f[i2])) {
                return i2;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j2));
    }

    public final void z(long j2) {
        long jX;
        int i2 = this.f50344c;
        if (i2 == 0) {
            jX = x(this.f50380e);
        } else {
            jX = x(this.f50381f[i2]) + this.f50345d[i2];
        }
        if (j2 > jX) {
            if (this.f50381f == null) {
                Object[] objArrA = A();
                this.f50381f = objArrA;
                this.f50345d = new long[8];
                objArrA[0] = this.f50380e;
            }
            int i3 = this.f50344c + 1;
            while (j2 > jX) {
                Object[] objArr = this.f50381f;
                if (i3 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f50381f = Arrays.copyOf(objArr, length);
                    this.f50345d = Arrays.copyOf(this.f50345d, length);
                }
                int iMin = this.f50342a;
                if (i3 != 0 && i3 != 1) {
                    iMin = Math.min((iMin + i3) - 1, 30);
                }
                int i4 = 1 << iMin;
                this.f50381f[i3] = newArray(i4);
                long[] jArr = this.f50345d;
                jArr[i3] = jArr[i3 - 1] + x(this.f50381f[r6]);
                jX += i4;
                i3++;
            }
        }
    }

    public d7() {
        this.f50380e = newArray(16);
    }
}
