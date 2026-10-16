package defpackage;

/* loaded from: classes.dex */
public final class ylr<K, V> extends yfd<K, V> {
    static final ylr a = new ylr();
    final transient Object[] c;
    public final transient ylr d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    public ylr(Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int iJ = i >= 2 ? ygr.j(i) : 0;
        this.e = ylx.e(objArr, i, iJ, 0);
        this.d = new ylr(ylx.e(objArr, i, iJ, 1), objArr, i, this);
    }

    @Override // defpackage.yfd
    public final yfd b() {
        return this.d;
    }

    @Override // defpackage.yfy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: f */
    public final ygr entrySet() {
        return new ylu(this, this.c, this.f, this.g);
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: g */
    public final ygr keySet() {
        return new ylv(this, new ylw(this.c, this.f, this.g));
    }

    @Override // defpackage.yfy, java.util.Map
    public final V get(Object obj) {
        V v = (V) ylx.s(this.e, this.c, this.g, this.f, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.yfd, defpackage.yfy
    public Object writeReplace() {
        return super.writeReplace();
    }

    private ylr(Object obj, Object[] objArr, int i, ylr ylrVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = ylrVar;
    }

    private ylr() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }
}
