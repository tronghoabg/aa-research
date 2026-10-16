package R;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10011c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10012d;

    public d(Object[] objArr, int i5, int i10) {
        super(i5, i10);
        this.f10012d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f10011c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i5 = this.f10007a;
                this.f10007a = i5 + 1;
                return ((Object[]) this.f10012d)[i5];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f10007a++;
                return this.f10012d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f10011c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i5 = this.f10007a - 1;
                this.f10007a = i5;
                return ((Object[]) this.f10012d)[i5];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f10007a--;
                return this.f10012d;
        }
    }

    public d(Object obj, int i5) {
        super(i5, 1);
        this.f10012d = obj;
    }
}
