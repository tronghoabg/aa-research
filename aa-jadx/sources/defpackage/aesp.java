package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aesp<K> extends defpackage.aerk<K> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final java.lang.Object a;

    protected aesp(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aerk, defpackage.aefe
    public final boolean containsKey(java.lang.Object obj) {
        return j$.util.Objects.equals(this.a, obj);
    }

    @Override // defpackage.aesn
    public final int o(java.lang.Object obj) {
        j$.util.Objects.equals(this.a, obj);
        return 0;
    }

    @Override // defpackage.aerk, defpackage.aefe
    public final int size() {
        return 1;
    }

    public final java.lang.Object clone() {
        return this;
    }
}
