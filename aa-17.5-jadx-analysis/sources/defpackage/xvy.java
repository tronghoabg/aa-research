package defpackage;

/* loaded from: classes.dex */
public final class xvy extends xxh {
    public static final xvy a = new xvy();
    private static final long serialVersionUID = 0;

    private xvy() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.xxh
    public final xxh a(xwx xwxVar) {
        return a;
    }

    @Override // defpackage.xxh
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.xxh
    public final Object c(xyc xycVar) {
        Object objGu = xycVar.gu();
        objGu.getClass();
        return objGu;
    }

    @Override // defpackage.xxh
    public final Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.xxh
    public final Object e() {
        return null;
    }

    @Override // defpackage.xxh
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.xxh
    public final boolean f() {
        return false;
    }

    @Override // defpackage.xxh
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
