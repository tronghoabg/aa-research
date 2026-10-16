package defpackage;

/* loaded from: classes.dex */
final class doz {
    dpb a;
    final /* synthetic */ dpa b;

    public doz(dpa dpaVar) {
        this.b = dpaVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + String.valueOf(this.a);
    }
}
