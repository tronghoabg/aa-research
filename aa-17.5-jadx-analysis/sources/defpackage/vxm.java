package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class vxm implements xyc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ vxm(qau qauVar, ackk ackkVar, zgt zgtVar, tmb tmbVar, int i) {
        this.e = i;
        this.a = qauVar;
        this.d = ackkVar;
        this.c = zgtVar;
        this.b = tmbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ackk, aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zgt] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, tmb] */
    @Override // defpackage.xyc
    public final Object gu() {
        int i = this.e;
        ?? r1 = this.d;
        if (i == 0) {
            return ((wci) this.a).d(this.b, this.c, r1);
        }
        uyh uyhVar = ((htm) r1.a()).B().e;
        if (uyhVar == null) {
            uyhVar = uyh.a;
        }
        return new qbc(this.c, new ykd(this.a), uyhVar.r * 1000, this.b);
    }

    public /* synthetic */ vxm(wci wciVar, zgt zgtVar, ackk ackkVar, aezk aezkVar, int i) {
        this.e = i;
        this.a = wciVar;
        this.b = zgtVar;
        this.c = ackkVar;
        this.d = aezkVar;
    }
}
