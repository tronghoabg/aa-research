package defpackage;

/* loaded from: classes3.dex */
public final class aiac extends aiad {
    private final ahnf fqName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiac(ahnf ahnfVar, ahld ahldVar, ahlh ahlhVar, agdx agdxVar) {
        super(ahldVar, ahlhVar, agdxVar, null);
        ahnfVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        this.fqName = ahnfVar;
    }

    @Override // defpackage.aiad
    public ahnf debugFqName() {
        return this.fqName;
    }
}
