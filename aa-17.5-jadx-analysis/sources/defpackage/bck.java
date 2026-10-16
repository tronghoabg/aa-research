package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bck implements afdr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bck(afec afecVar, boolean z, int i) {
        this.c = i;
        this.b = afecVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.c;
        if (i == 0) {
            this.b.invoke(Boolean.valueOf(!this.a));
            return afak.a;
        }
        if (i == 1) {
            alp alpVar = alw.a;
            if (this.a) {
                this.b.invoke();
            }
            return afak.a;
        }
        boolean z = this.a;
        if (i != 2) {
            if (z) {
                this.b.b(Boolean.valueOf(true));
            }
            return afak.a;
        }
        if (z) {
            ((nmj) this.b).f.invoke();
        }
        return afak.a;
    }

    public /* synthetic */ bck(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
