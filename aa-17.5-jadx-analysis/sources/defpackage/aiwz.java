package defpackage;

/* loaded from: classes2.dex */
public final class aiwz implements aiwr {
    public Object a = aixj.p;
    public aitg b;
    final /* synthetic */ aixh c;

    public aiwz(aixh aixhVar) {
        this.c = aixhVar;
    }

    @Override // defpackage.aiwr
    public final void E(ajbv ajbvVar, int i) {
        aitg aitgVar = this.b;
        if (aitgVar != null) {
            aitgVar.E(ajbvVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwz.a(afck):java.lang.Object");
    }

    public final Object b() throws Throwable {
        Object obj = this.a;
        ajcz ajczVar = aixj.p;
        if (obj == ajczVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = ajczVar;
        if (obj != aixj.l) {
            return obj;
        }
        throw ajcy.b(this.c.m());
    }
}
