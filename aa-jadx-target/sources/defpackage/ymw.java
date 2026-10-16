package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ymw<K, V> extends defpackage.ygj<K, V> {
    static final defpackage.ymw a = new defpackage.ymw();
    final transient java.lang.Object[] c;
    public final transient defpackage.ymw d;
    private final transient java.lang.Object e;
    private final transient int f;
    private final transient int g;

    public ymw(java.lang.Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int iJ = i >= 2 ? defpackage.yhx.j(i) : 0;
        this.e = defpackage.ync.e(objArr, i, iJ, 0);
        this.d = new defpackage.ymw(defpackage.ync.e(objArr, i, iJ, 1), objArr, i, this);
    }

    @Override // defpackage.ygj
    public final defpackage.ygj b() {
        return this.d;
    }

    @Override // defpackage.yhe
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: f */
    public final defpackage.yhx entrySet() {
        return new defpackage.ymz(this, this.c, this.f, this.g);
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: g */
    public final defpackage.yhx keySet() {
        return new defpackage.yna(this, new defpackage.ynb(this.c, this.f, this.g));
    }

    @Override // defpackage.yhe, java.util.Map
    public final V get(java.lang.Object obj) {
        V v = (V) defpackage.ync.s(this.e, this.c, this.g, this.f, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.ygj, defpackage.yhe
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }

    private ymw(java.lang.Object obj, java.lang.Object[] objArr, int i, defpackage.ymw ymwVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = ymwVar;
    }

    private ymw() {
        this.e = null;
        this.c = new java.lang.Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }
}
