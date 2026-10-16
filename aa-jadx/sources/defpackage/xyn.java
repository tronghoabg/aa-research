package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xyn implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public static defpackage.xyn g(java.lang.Object obj) {
        return obj == null ? defpackage.xxe.a : new defpackage.xys(obj);
    }

    public static defpackage.xyn h(java.lang.Object obj) {
        obj.getClass();
        return new defpackage.xys(obj);
    }

    public abstract defpackage.xyn a(defpackage.xyd xydVar);

    public abstract java.lang.Object b();

    public abstract java.lang.Object c(defpackage.xzi xziVar);

    public abstract java.lang.Object d(java.lang.Object obj);

    public abstract java.lang.Object e();

    public abstract boolean equals(java.lang.Object obj);

    public abstract boolean f();

    public abstract int hashCode();

    public final j$.util.Optional i() {
        return j$.util.Optional.ofNullable(e());
    }
}
