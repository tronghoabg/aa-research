package defpackage;

/* loaded from: classes3.dex */
final class ypb implements yol {
    private final yol a;
    private final Object b;

    public ypb(yol yolVar, Object obj) {
        yolVar.getClass();
        this.a = yolVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ypb)) {
            return false;
        }
        ypb ypbVar = (ypb) obj;
        return this.a.equals(ypbVar.a) && this.b.equals(ypbVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
