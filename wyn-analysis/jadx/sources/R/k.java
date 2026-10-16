package R;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f10035c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f10036d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10037e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i5, int i10, int i11) {
        super(i5, i10);
        this.f10035c = i11;
        Object[] objArr2 = new Object[i11];
        this.f10036d = objArr2;
        ?? r52 = i5 == i10 ? 1 : 0;
        this.f10037e = r52;
        objArr2[0] = objArr;
        c(i5 - r52, 1);
    }

    public final Object a() {
        int i5 = this.f10007a & 31;
        Object obj = this.f10036d[this.f10035c - 1];
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i5];
    }

    public final void c(int i5, int i10) {
        int i11 = (this.f10035c - i10) * 5;
        while (i10 < this.f10035c) {
            Object[] objArr = this.f10036d;
            Object obj = objArr[i10 - 1];
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i10] = ((Object[]) obj)[ic.d.D(i5, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void d(int i5) {
        int i10 = 0;
        while (ic.d.D(this.f10007a, i10) == i5) {
            i10 += 5;
        }
        if (i10 > 0) {
            c(this.f10007a, ((this.f10035c - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i5 = this.f10007a + 1;
        this.f10007a = i5;
        if (i5 == this.f10008b) {
            this.f10037e = true;
            return objA;
        }
        d(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f10007a--;
        if (this.f10037e) {
            this.f10037e = false;
            return a();
        }
        d(31);
        return a();
    }
}
