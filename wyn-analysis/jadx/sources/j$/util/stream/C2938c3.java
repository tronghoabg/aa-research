package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2938c3 extends AbstractC2939d implements Consumer, Iterable {

    /* renamed from: e, reason: collision with root package name */
    protected Object[] f38161e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    protected Object[][] f38162f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    C2938c3() {
    }

    protected final void s(long j8) {
        long length;
        int i5 = this.f38166c;
        if (i5 == 0) {
            length = this.f38161e.length;
        } else {
            length = this.f38167d[i5] + this.f38162f[i5].length;
        }
        if (j8 > length) {
            if (this.f38162f == null) {
                Object[][] objArr = new Object[8][];
                this.f38162f = objArr;
                this.f38167d = new long[8];
                objArr[0] = this.f38161e;
            }
            int i10 = i5 + 1;
            while (j8 > length) {
                Object[][] objArr2 = this.f38162f;
                if (i10 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f38162f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f38167d = Arrays.copyOf(this.f38167d, length2);
                }
                int iMin = this.f38164a;
                if (i10 != 0 && i10 != 1) {
                    iMin = Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                this.f38162f[i10] = new Object[i11];
                long[] jArr = this.f38167d;
                jArr[i10] = jArr[i10 - 1] + r5[r7].length;
                length += i11;
                i10++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC2939d
    public final void clear() {
        Object[][] objArr = this.f38162f;
        if (objArr != null) {
            this.f38161e = objArr[0];
            int i5 = 0;
            while (true) {
                Object[] objArr2 = this.f38161e;
                if (i5 >= objArr2.length) {
                    break;
                }
                objArr2[i5] = null;
                i5++;
            }
            this.f38162f = null;
            this.f38167d = null;
        } else {
            for (int i10 = 0; i10 < this.f38165b; i10++) {
                this.f38161e[i10] = null;
            }
        }
        this.f38165b = 0;
        this.f38166c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i5 = 0; i5 < this.f38166c; i5++) {
            for (Object obj : this.f38162f[i5]) {
                consumer.accept(obj);
            }
        }
        for (int i10 = 0; i10 < this.f38165b; i10++) {
            consumer.accept(this.f38161e[i10]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i5 = this.f38165b;
        Object[] objArr = this.f38161e;
        if (i5 == objArr.length) {
            if (this.f38162f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f38162f = objArr2;
                this.f38167d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.f38166c;
            int i11 = i10 + 1;
            Object[][] objArr3 = this.f38162f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i10].length + this.f38167d[i10];
                }
                s(length + 1);
            }
            this.f38165b = 0;
            int i12 = this.f38166c + 1;
            this.f38166c = i12;
            this.f38161e = this.f38162f[i12];
        }
        Object[] objArr4 = this.f38161e;
        int i13 = this.f38165b;
        this.f38165b = i13 + 1;
        objArr4[i13] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C2924a(10, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new T2(this, 0, this.f38166c, 0, this.f38165b);
    }
}
