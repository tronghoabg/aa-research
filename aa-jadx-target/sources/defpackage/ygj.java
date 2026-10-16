package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ygj<K, V> extends defpackage.yhe<K, V> implements j$.util.Map<K, V>, defpackage.ydi {
    private static final long serialVersionUID = 912559;

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ydi
    public final /* bridge */ /* synthetic */ defpackage.ydi a() {
        throw null;
    }

    public abstract defpackage.ygj b();

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final defpackage.yhx values() {
        return b().keySet();
    }

    @Override // defpackage.yhe
    public java.lang.Object writeReplace() {
        return new ygi(this);
    }
}
