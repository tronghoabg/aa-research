package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class e7 extends c implements Consumer, Iterable, j$.lang.a {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f50390e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    public Object[][] f50391f;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void u(Object obj) {
        long length;
        int i2 = this.f50343b;
        Object[] objArr = this.f50390e;
        if (i2 == objArr.length) {
            Object[][] objArr2 = this.f50391f;
            if (objArr2 == null) {
                Object[][] objArr3 = new Object[8][];
                this.f50391f = objArr3;
                this.f50345d = new long[8];
                objArr3[0] = objArr;
                objArr2 = objArr3;
            }
            int i3 = this.f50344c;
            int i4 = i3 + 1;
            if (i4 >= objArr2.length || objArr2[i4] == null) {
                if (i3 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr2[i3].length + this.f50345d[i3];
                }
                w(length + 1);
            }
            this.f50343b = 0;
            int i5 = this.f50344c + 1;
            this.f50344c = i5;
            objArr = this.f50391f[i5];
            this.f50390e = objArr;
            i2 = 0;
        }
        this.f50343b = i2 + 1;
        objArr[i2] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[][] objArr = this.f50391f;
        if (objArr != null) {
            this.f50390e = objArr[0];
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.f50390e;
                if (i2 >= objArr2.length) {
                    break;
                }
                objArr2[i2] = null;
                i2++;
            }
            this.f50391f = null;
            this.f50345d = null;
        } else {
            for (int i3 = 0; i3 < this.f50343b; i3++) {
                this.f50390e[i3] = null;
            }
        }
        this.f50343b = 0;
        this.f50344c = 0;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(Consumer consumer) {
        for (int i2 = 0; i2 < this.f50344c; i2++) {
            for (Object obj : this.f50391f[i2]) {
                consumer.u(obj);
            }
        }
        for (int i3 = 0; i3 < this.f50343b; i3++) {
            consumer.u(this.f50390e[i3]);
        }
    }

    public void h(Object[] objArr, int i2) {
        long j2 = i2;
        long jCount = count() + j2;
        if (jCount > objArr.length || jCount < j2) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f50344c == 0) {
            System.arraycopy(this.f50390e, 0, objArr, i2, this.f50343b);
            return;
        }
        for (int i3 = 0; i3 < this.f50344c; i3++) {
            Object[] objArr2 = this.f50391f[i3];
            System.arraycopy(objArr2, 0, objArr, i2, objArr2.length);
            i2 += this.f50391f[i3].length;
        }
        int i4 = this.f50343b;
        if (i4 > 0) {
            System.arraycopy(this.f50390e, 0, objArr, i2, i4);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.d1(spliterator);
    }

    public Object[] k(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        h(objArr, 0);
        return objArr;
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public Spliterator spliterator() {
        return new v6(this, 0, this.f50344c, 0, this.f50343b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new j$.desugar.sun.nio.fs.g(9, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    public final void w(long j2) {
        int i2 = this.f50344c;
        long length = i2 == 0 ? this.f50390e.length : this.f50345d[i2] + this.f50391f[i2].length;
        if (j2 > length) {
            if (this.f50391f == null) {
                Object[][] objArr = new Object[8][];
                this.f50391f = objArr;
                this.f50345d = new long[8];
                objArr[0] = this.f50390e;
            }
            int i3 = i2 + 1;
            while (j2 > length) {
                Object[][] objArr2 = this.f50391f;
                if (i3 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f50391f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f50345d = Arrays.copyOf(this.f50345d, length2);
                }
                int iMin = this.f50342a;
                if (i3 != 0 && i3 != 1) {
                    iMin = Math.min((iMin + i3) - 1, 30);
                }
                int i4 = 1 << iMin;
                this.f50391f[i3] = new Object[i4];
                long[] jArr = this.f50345d;
                jArr[i3] = jArr[i3 - 1] + r5[r7].length;
                length += i4;
                i3++;
            }
        }
    }
}
