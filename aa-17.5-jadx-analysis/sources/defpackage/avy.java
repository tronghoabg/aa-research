package defpackage;

/* loaded from: classes.dex */
public final class avy implements avx {
    private final /* synthetic */ int c;
    public static final avy b = new avy(1);
    public static final avy a = new avy(0);

    private avy(int i) {
        this.c = i;
    }

    @Override // defpackage.avx
    public final cfy a(cfy cfyVar, csl cslVar) {
        if (this.c == 0) {
            return cfyVar.a(new awt(cslVar));
        }
        throw null;
    }

    @Override // defpackage.avx
    public final cfy b(cfy cfyVar, float f, boolean z) {
        if (this.c != 0) {
            throw null;
        }
        if (f <= 0.0d) {
            awx.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return cfyVar.a(new ave(f, z));
    }

    @Override // defpackage.avx
    public final cfy c(cfy cfyVar, cfr cfrVar) {
        if (this.c == 0) {
            return cfyVar.a(new awm(cfrVar));
        }
        throw null;
    }
}
