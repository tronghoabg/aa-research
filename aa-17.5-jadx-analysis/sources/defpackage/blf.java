package defpackage;

/* loaded from: classes.dex */
public final class blf {
    public final boolean a;
    public final bkk b;
    public final bkh c;

    public blf(boolean z, bkk bkkVar, bkh bkhVar) {
        this.a = z;
        this.b = bkkVar;
        this.c = bkhVar;
    }

    public final int a() {
        return this.c.c();
    }

    public final String toString() {
        int iA = a();
        StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb.append(this.a);
        sb.append(", crossed=");
        String str = iA != 1 ? iA != 2 ? "COLLAPSED" : "NOT_CROSSED" : "CROSSED";
        bkh bkhVar = this.c;
        sb.append((Object) str);
        sb.append(", info=\n\t");
        sb.append(bkhVar);
        sb.append(")");
        return sb.toString();
    }
}
