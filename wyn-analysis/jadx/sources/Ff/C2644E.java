package ff;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ff.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2644E extends AbstractC2651f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f35409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35410b;

    /* renamed from: c, reason: collision with root package name */
    public int f35411c;

    /* renamed from: d, reason: collision with root package name */
    public int f35412d;

    public C2644E(Object[] objArr, int i5) {
        this.f35409a = objArr;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i5 <= objArr.length) {
            this.f35410b = objArr.length;
            this.f35412d = i5;
        } else {
            StringBuilder sbL = pd.f.l(i5, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbL.append(objArr.length);
            throw new IllegalArgumentException(sbL.toString().toString());
        }
    }

    public final void a() {
        if (20 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + size()).toString());
        }
        int i5 = this.f35411c;
        int i10 = this.f35410b;
        int i11 = (i5 + 20) % i10;
        Object[] objArr = this.f35409a;
        if (i5 > i11) {
            Arrays.fill(objArr, i5, i10, (Object) null);
            Arrays.fill(objArr, 0, i11, (Object) null);
        } else {
            Arrays.fill(objArr, i5, i11, (Object) null);
        }
        this.f35411c = i11;
        this.f35412d = size() - 20;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        int size = size();
        c2648c.getClass();
        C2648c.b(i5, size);
        return this.f35409a[(this.f35411c + i5) % this.f35410b];
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f35412d;
    }

    @Override // ff.AbstractC2651f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2643D(this);
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        AbstractC3340k.e(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC3340k.d(array, "copyOf(...)");
        }
        int size = size();
        int i5 = this.f35411c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr = this.f35409a;
            if (i11 >= size || i5 >= this.f35410b) {
                break;
            }
            array[i11] = objArr[i5];
            i11++;
            i5++;
        }
        while (i11 < size) {
            array[i11] = objArr[i10];
            i11++;
            i10++;
        }
        if (size < array.length) {
            array[size] = null;
        }
        return array;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
