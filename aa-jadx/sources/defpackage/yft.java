package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yft<E> extends defpackage.yfi<E> implements java.util.Set<E> {
    protected yft() {
    }

    @Override // defpackage.yfi
    protected /* bridge */ /* synthetic */ java.util.Collection a() {
        throw null;
    }

    protected abstract java.util.Set c();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return c().hashCode();
    }
}
