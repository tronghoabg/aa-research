package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ymz extends defpackage.yhx {
    public final transient java.lang.Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient defpackage.yhe d;

    public ymz(defpackage.yhe yheVar, java.lang.Object[] objArr, int i, int i2) {
        this.d = yheVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // defpackage.yhx
    public final defpackage.ygw k() {
        return new defpackage.ymy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
