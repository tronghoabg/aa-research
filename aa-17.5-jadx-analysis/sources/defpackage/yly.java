package defpackage;

/* loaded from: classes.dex */
public final class yly extends ygr {
    public static final yly a;
    private static final Object[] e;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        a = new yly(objArr, 0, objArr, 0, 0);
    }

    public yly(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.g;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.yfg
    public final int b() {
        return this.g;
    }

    @Override // defpackage.yfg
    public final int c() {
        return 0;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int iX = wub.x(obj);
                while (true) {
                    int i = iX & this.f;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iX = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yfg
    public final Object[] g() {
        return this.b;
    }

    @Override // defpackage.ygr, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.ygr
    public final boolean i() {
        return true;
    }

    @Override // defpackage.ygr
    public final yfq k() {
        return yfq.l(this.b, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
