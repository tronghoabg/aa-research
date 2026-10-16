package R;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public final g f10029c;

    /* renamed from: d, reason: collision with root package name */
    public int f10030d;

    /* renamed from: e, reason: collision with root package name */
    public k f10031e;

    /* renamed from: f, reason: collision with root package name */
    public int f10032f;

    public i(g gVar, int i5) {
        super(i5, gVar.f10026h);
        this.f10029c = gVar;
        this.f10030d = gVar.f();
        this.f10032f = -1;
        c();
    }

    public final void a() {
        if (this.f10030d != this.f10029c.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // R.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i5 = this.f10007a;
        g gVar = this.f10029c;
        gVar.add(i5, obj);
        this.f10007a++;
        this.f10008b = gVar.a();
        this.f10030d = gVar.f();
        this.f10032f = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        g gVar = this.f10029c;
        Object[] objArr = gVar.f10024f;
        if (objArr == null) {
            this.f10031e = null;
            return;
        }
        int i5 = (gVar.f10026h - 1) & (-32);
        int i10 = this.f10007a;
        if (i10 > i5) {
            i10 = i5;
        }
        int i11 = (gVar.f10022d / 5) + 1;
        k kVar = this.f10031e;
        if (kVar == null) {
            this.f10031e = new k(objArr, i10, i5, i11);
            return;
        }
        kVar.f10007a = i10;
        kVar.f10008b = i5;
        kVar.f10035c = i11;
        if (kVar.f10036d.length < i11) {
            kVar.f10036d = new Object[i11];
        }
        kVar.f10036d[0] = objArr;
        ?? r62 = i10 == i5 ? 1 : 0;
        kVar.f10037e = r62;
        kVar.c(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f10007a;
        this.f10032f = i5;
        k kVar = this.f10031e;
        g gVar = this.f10029c;
        if (kVar == null) {
            Object[] objArr = gVar.f10025g;
            this.f10007a = i5 + 1;
            return objArr[i5];
        }
        if (kVar.hasNext()) {
            this.f10007a++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f10025g;
        int i10 = this.f10007a;
        this.f10007a = i10 + 1;
        return objArr2[i10 - kVar.f10008b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f10007a;
        this.f10032f = i5 - 1;
        k kVar = this.f10031e;
        g gVar = this.f10029c;
        if (kVar == null) {
            Object[] objArr = gVar.f10025g;
            int i10 = i5 - 1;
            this.f10007a = i10;
            return objArr[i10];
        }
        int i11 = kVar.f10008b;
        if (i5 <= i11) {
            this.f10007a = i5 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f10025g;
        int i12 = i5 - 1;
        this.f10007a = i12;
        return objArr2[i12 - i11];
    }

    @Override // R.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i5 = this.f10032f;
        if (i5 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f10029c;
        gVar.c(i5);
        int i10 = this.f10032f;
        if (i10 < this.f10007a) {
            this.f10007a = i10;
        }
        this.f10008b = gVar.a();
        this.f10030d = gVar.f();
        this.f10032f = -1;
        c();
    }

    @Override // R.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i5 = this.f10032f;
        if (i5 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f10029c;
        gVar.set(i5, obj);
        this.f10030d = gVar.f();
        c();
    }
}
