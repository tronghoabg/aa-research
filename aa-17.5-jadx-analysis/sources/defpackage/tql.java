package defpackage;

/* loaded from: classes3.dex */
public final class tql {
    private final abcs a;

    public tql(abcs abcsVar) {
        this.a = abcsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tql) {
            return ((tql) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
