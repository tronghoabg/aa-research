package R;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10027c;

    /* renamed from: d, reason: collision with root package name */
    public final k f10028d;

    public h(Object[] objArr, int i5, Object[] objArr2, int i10, int i11) {
        super(i5, i10);
        this.f10027c = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f10028d = new k(objArr, i5 > i12 ? i12 : i5, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f10028d;
        if (kVar.hasNext()) {
            this.f10007a++;
            return kVar.next();
        }
        int i5 = this.f10007a;
        this.f10007a = i5 + 1;
        return this.f10027c[i5 - kVar.f10008b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f10007a;
        k kVar = this.f10028d;
        int i10 = kVar.f10008b;
        if (i5 <= i10) {
            this.f10007a = i5 - 1;
            return kVar.previous();
        }
        int i11 = i5 - 1;
        this.f10007a = i11;
        return this.f10027c[i11 - i10];
    }
}
