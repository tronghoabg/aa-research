package defpackage;

/* loaded from: classes.dex */
public final class xxm extends xxh {
    private static final long serialVersionUID = 0;
    public final Object a;

    public xxm(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xxh
    public final xxh a(xwx xwxVar) {
        Object objA = xwxVar.a(this.a);
        objA.getClass();
        return new xxm(objA);
    }

    @Override // defpackage.xxh
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.xxh
    public final Object c(xyc xycVar) {
        return this.a;
    }

    @Override // defpackage.xxh
    public final Object d(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.xxh
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.xxh
    public final boolean equals(Object obj) {
        if (obj instanceof xxm) {
            return this.a.equals(((xxm) obj).a);
        }
        return false;
    }

    @Override // defpackage.xxh
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xxh
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
