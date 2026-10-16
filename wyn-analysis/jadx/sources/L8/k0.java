package l8;

/* loaded from: classes4.dex */
public final class k0 extends AbstractC3414P {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f40127i;

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f40128j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f40129d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f40130e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f40131f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f40132g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f40133h;

    static {
        Object[] objArr = new Object[0];
        f40127i = objArr;
        f40128j = new k0(objArr, 0, objArr, 0, 0);
    }

    public k0(Object[] objArr, int i5, Object[] objArr2, int i10, int i11) {
        this.f40129d = objArr;
        this.f40130e = i5;
        this.f40131f = objArr2;
        this.f40132g = i10;
        this.f40133h = i11;
    }

    @Override // l8.AbstractC3404F
    public final int b(int i5, Object[] objArr) {
        Object[] objArr2 = this.f40129d;
        int i10 = this.f40133h;
        System.arraycopy(objArr2, 0, objArr, i5, i10);
        return i5 + i10;
    }

    @Override // l8.AbstractC3404F
    public final Object[] c() {
        return this.f40129d;
    }

    @Override // l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f40131f;
            if (objArr.length != 0) {
                int iS = AbstractC3437s.s(obj);
                while (true) {
                    int i5 = iS & this.f40132g;
                    Object obj2 = objArr[i5];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iS = i5 + 1;
                }
            }
        }
        return false;
    }

    @Override // l8.AbstractC3404F
    public final int d() {
        return this.f40133h;
    }

    @Override // l8.AbstractC3404F
    public final int e() {
        return 0;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return false;
    }

    @Override // l8.AbstractC3404F
    /* renamed from: g */
    public final t0 iterator() {
        return a().listIterator(0);
    }

    @Override // l8.AbstractC3414P, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40130e;
    }

    @Override // l8.AbstractC3414P
    public final AbstractC3409K k() {
        return AbstractC3409K.h(this.f40133h, this.f40129d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40133h;
    }
}
