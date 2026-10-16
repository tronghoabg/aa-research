package Uf;

import Wf.C1266y;
import ef.C2535s;
import ef.C2537u;
import ef.C2539w;
import ef.C2542z;
import ff.AbstractC2651f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public class h implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12826a;

    /* renamed from: b, reason: collision with root package name */
    public int f12827b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12828c;

    public /* synthetic */ h(Object obj, int i5) {
        this.f12826a = i5;
        this.f12828c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12826a) {
            case 0:
                if (this.f12827b > 0) {
                }
                break;
            case 1:
                if (this.f12827b < ((byte[]) this.f12828c).length) {
                }
                break;
            case 2:
                if (this.f12827b < ((int[]) this.f12828c).length) {
                }
                break;
            case 3:
                if (this.f12827b < ((long[]) this.f12828c).length) {
                }
                break;
            case 4:
                if (this.f12827b < ((short[]) this.f12828c).length) {
                }
                break;
            case 5:
                if (this.f12827b < ((AbstractC2651f) this.f12828c).size()) {
                }
                break;
            default:
                if (this.f12827b < ((Object[]) this.f12828c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12826a) {
            case 0:
                C1266y c1266y = (C1266y) this.f12828c;
                int i5 = this.f12827b;
                this.f12827b = i5 - 1;
                return c1266y.f15589e[c1266y.f15587c - i5];
            case 1:
                int i10 = this.f12827b;
                byte[] bArr = (byte[]) this.f12828c;
                if (i10 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12827b));
                }
                this.f12827b = i10 + 1;
                return new C2535s(bArr[i10]);
            case 2:
                int i11 = this.f12827b;
                int[] iArr = (int[]) this.f12828c;
                if (i11 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12827b));
                }
                this.f12827b = i11 + 1;
                return new C2537u(iArr[i11]);
            case 3:
                int i12 = this.f12827b;
                long[] jArr = (long[]) this.f12828c;
                if (i12 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12827b));
                }
                this.f12827b = i12 + 1;
                return new C2539w(jArr[i12]);
            case 4:
                int i13 = this.f12827b;
                short[] sArr = (short[]) this.f12828c;
                if (i13 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12827b));
                }
                this.f12827b = i13 + 1;
                return new C2542z(sArr[i13]);
            case 5:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.f12827b;
                this.f12827b = i14 + 1;
                return ((AbstractC2651f) this.f12828c).get(i14);
            default:
                try {
                    Object[] objArr = (Object[]) this.f12828c;
                    int i15 = this.f12827b;
                    this.f12827b = i15 + 1;
                    return objArr[i15];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f12827b--;
                    throw new NoSuchElementException(e7.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12826a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(Object[] array) {
        this.f12826a = 6;
        AbstractC3340k.e(array, "array");
        this.f12828c = array;
    }

    public h(C1266y c1266y) {
        this.f12826a = 0;
        this.f12828c = c1266y;
        this.f12827b = c1266y.f15587c;
    }
}
