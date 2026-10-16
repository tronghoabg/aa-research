package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccq<E> extends defpackage.afbx<E> implements j$.util.Set<E>, java.util.Set, java.util.Collection, defpackage.afhc {
    public static final defpackage.ccq a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final defpackage.cca d;

    static {
        defpackage.cct cctVar = defpackage.cct.a;
        a = new defpackage.ccq(cctVar, cctVar, defpackage.cca.a);
    }

    public ccq(java.lang.Object obj, java.lang.Object obj2, defpackage.cca ccaVar) {
        this.b = obj;
        this.c = obj2;
        this.d = ccaVar;
    }

    @Override // defpackage.afbm
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.afbm, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.afbx, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return new defpackage.ccr(this.b, this.d);
    }
}
