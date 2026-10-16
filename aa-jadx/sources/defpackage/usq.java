package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class usq {
    public final defpackage.trt a;
    public defpackage.trr c;
    private final int d;
    private int e = 0;
    public int b = 0;
    private final java.util.List f = new java.util.ArrayList();

    public usq(int i, defpackage.trt trtVar) {
        this.d = i;
        this.a = trtVar;
    }

    final synchronized int a(defpackage.usm usmVar) {
        int iB;
        this.f.add(usmVar);
        iB = b() - 1;
        defpackage.trr trrVar = this.c;
        if (trrVar != null) {
            usmVar.a(trrVar);
        }
        return iB;
    }

    final synchronized int b() {
        return this.f.size();
    }

    final synchronized defpackage.usr c() {
        defpackage.trr trrVar;
        if (this.c == null) {
            defpackage.trt trtVar = this.a;
            int i = this.d;
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            int i2 = this.e;
            this.e = i2 + 1;
            defpackage.trr trrVarC = trtVar.c(java.lang.String.format(locale, "style_collection_%d_%d", numValueOf, java.lang.Integer.valueOf(i2)));
            java.util.Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((defpackage.usm) it.next()).a(trrVarC);
            }
            this.c = trrVarC;
        }
        this.b++;
        trrVar = this.c;
        trrVar.getClass();
        return new defpackage.usr(trrVar, this);
    }
}
