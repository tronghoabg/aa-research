package defpackage;

/* loaded from: classes.dex */
public final class bpf implements cjy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bpf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [cwc, java.lang.Object] */
    @Override // defpackage.cjy
    public final long a() {
        if (this.b == 0) {
            throw null;
        }
        ?? r5 = this.a;
        long j = ((bpg) ((bpf) ((bno) r5).d).a).a;
        if (j != 16) {
            return j;
        }
        bpc bpcVar = (bpc) bzi.x(r5, bpe.b);
        if (bpcVar != null) {
            long j2 = bpcVar.a;
            if (j2 != 16) {
                return j2;
            }
        }
        return ((cjv) bzi.x(r5, bnm.a)).a;
    }
}
