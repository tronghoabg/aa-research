package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qcu {
    public final java.lang.String a;
    public final defpackage.qcr b;

    @java.lang.Deprecated
    protected qcu(java.lang.String str, defpackage.qcr qcrVar) {
        this.a = str;
        this.b = qcrVar;
    }

    public abstract java.lang.Object a();

    public final java.lang.String toString() {
        return java.lang.String.format("%s; FeatureType: %s, Name: %s", getClass().getSimpleName(), this.b, this.a);
    }
}
