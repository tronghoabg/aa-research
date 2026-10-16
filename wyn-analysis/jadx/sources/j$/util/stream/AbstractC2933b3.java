package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2933b3 extends AbstractC2939d implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    Object f38156e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f38157f;

    public abstract Object c(int i5);

    protected abstract void s(Object obj, int i5, int i10, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    protected abstract int t(Object obj);

    protected abstract Object[] w();

    AbstractC2933b3(int i5) {
        super(i5);
        this.f38156e = c(1 << this.f38164a);
    }

    AbstractC2933b3() {
        this.f38156e = c(16);
    }

    protected final void v(long j8) {
        long jT;
        int i5 = this.f38166c;
        if (i5 == 0) {
            jT = t(this.f38156e);
        } else {
            jT = t(this.f38157f[i5]) + this.f38167d[i5];
        }
        if (j8 > jT) {
            if (this.f38157f == null) {
                Object[] objArrW = w();
                this.f38157f = objArrW;
                this.f38167d = new long[8];
                objArrW[0] = this.f38156e;
            }
            int i10 = this.f38166c + 1;
            while (j8 > jT) {
                Object[] objArr = this.f38157f;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f38157f = Arrays.copyOf(objArr, length);
                    this.f38167d = Arrays.copyOf(this.f38167d, length);
                }
                int iMin = this.f38164a;
                if (i10 != 0 && i10 != 1) {
                    iMin = Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                this.f38157f[i10] = c(i11);
                long[] jArr = this.f38167d;
                jArr[i10] = jArr[i10 - 1] + t(this.f38157f[r6]);
                jT += i11;
                i10++;
            }
        }
    }

    protected final int u(long j8) {
        if (this.f38166c == 0) {
            if (j8 < this.f38165b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        if (j8 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        for (int i5 = 0; i5 <= this.f38166c; i5++) {
            if (j8 < this.f38167d[i5] + t(this.f38157f[i5])) {
                return i5;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j8));
    }

    public void r(int i5, Object obj) {
        long j8 = i5;
        long jCount = count() + j8;
        if (jCount > t(obj) || jCount < j8) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f38166c == 0) {
            System.arraycopy(this.f38156e, 0, obj, i5, this.f38165b);
            return;
        }
        for (int i10 = 0; i10 < this.f38166c; i10++) {
            Object obj2 = this.f38157f[i10];
            System.arraycopy(obj2, 0, obj, i5, t(obj2));
            i5 += t(this.f38157f[i10]);
        }
        int i11 = this.f38165b;
        if (i11 > 0) {
            System.arraycopy(this.f38156e, 0, obj, i5, i11);
        }
    }

    public Object d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        r(0, objC);
        return objC;
    }

    protected final void x() {
        long jT;
        if (this.f38165b == t(this.f38156e)) {
            if (this.f38157f == null) {
                Object[] objArrW = w();
                this.f38157f = objArrW;
                this.f38167d = new long[8];
                objArrW[0] = this.f38156e;
            }
            int i5 = this.f38166c;
            int i10 = i5 + 1;
            Object[] objArr = this.f38157f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i5 == 0) {
                    jT = t(this.f38156e);
                } else {
                    jT = t(objArr[i5]) + this.f38167d[i5];
                }
                v(jT + 1);
            }
            this.f38165b = 0;
            int i11 = this.f38166c + 1;
            this.f38166c = i11;
            this.f38156e = this.f38157f[i11];
        }
    }

    @Override // j$.util.stream.AbstractC2939d
    public final void clear() {
        Object[] objArr = this.f38157f;
        if (objArr != null) {
            this.f38156e = objArr[0];
            this.f38157f = null;
            this.f38167d = null;
        }
        this.f38165b = 0;
        this.f38166c = 0;
    }

    public void e(Object obj) {
        for (int i5 = 0; i5 < this.f38166c; i5++) {
            Object obj2 = this.f38157f[i5];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.f38156e, 0, this.f38165b, obj);
    }
}
