package defpackage;

/* loaded from: classes2.dex */
final class eom {
    public final eor a;
    public final eot b;
    public boolean c = true;

    public eom(eor eorVar, eot eotVar) {
        this.a = eorVar;
        this.b = eotVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(true != this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
