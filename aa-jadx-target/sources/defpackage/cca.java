package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class cca<K, V> extends defpackage.afbs<K, V> implements j$.util.Map<K, V>, defpackage.cbm {
    public static final defpackage.cca a = new defpackage.cca(defpackage.cck.a, 0);
    public final defpackage.cck b;
    public final int c;

    public cca(defpackage.cck cckVar, int i) {
        this.b = cckVar;
        this.c = i;
    }

    @Override // defpackage.afbs
    public final int a() {
        return this.c;
    }

    public final defpackage.cca b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ccj ccjVarD = this.b.d(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return ccjVarD == null ? this : new defpackage.cca(ccjVarD.a, a() + ccjVarD.b);
    }

    @Override // defpackage.afbs
    public final /* synthetic */ java.util.Collection c() {
        return new defpackage.cci(this);
    }

    @Override // defpackage.afbs, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.afbs
    public final java.util.Set d() {
        return new defpackage.cch(this, 1);
    }

    @Override // defpackage.afbs
    public final /* synthetic */ java.util.Set e() {
        return new defpackage.cch(this, 0);
    }

    @Override // defpackage.afbs, java.util.Map
    public V get(java.lang.Object obj) {
        return (V) this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
