package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xxy implements defpackage.xyd {
    public transient defpackage.xxy b;

    @Override // defpackage.xyd
    @java.lang.Deprecated
    public final java.lang.Object a(java.lang.Object obj) {
        return b(obj);
    }

    public java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return c(obj);
    }

    protected abstract java.lang.Object c(java.lang.Object obj);
}
