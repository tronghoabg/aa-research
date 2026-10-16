package defpackage;

/* loaded from: classes3.dex */
public final class aikf implements aike {
    private final aijs kotlinTypePreparator;
    private final aiju kotlinTypeRefiner;
    private final ahtj overridingUtil;

    public aikf(aiju aijuVar, aijs aijsVar) {
        aijuVar.getClass();
        aijsVar.getClass();
        this.kotlinTypeRefiner = aijuVar;
        this.kotlinTypePreparator = aijsVar;
        this.overridingUtil = ahtj.createWithTypeRefiner(getKotlinTypeRefiner());
    }

    @Override // defpackage.aijp
    public boolean equalTypes(aigl aiglVar, aigl aiglVar2) {
        aiglVar.getClass();
        aiglVar2.getClass();
        return equalTypes(aiji.createClassicTypeCheckerState$default(false, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), aiglVar.unwrap(), aiglVar2.unwrap());
    }

    public aijs getKotlinTypePreparator() {
        return this.kotlinTypePreparator;
    }

    @Override // defpackage.aike
    public aiju getKotlinTypeRefiner() {
        return this.kotlinTypeRefiner;
    }

    @Override // defpackage.aike
    public ahtj getOverridingUtil() {
        return this.overridingUtil;
    }

    @Override // defpackage.aijp
    public boolean isSubtypeOf(aigl aiglVar, aigl aiglVar2) {
        aiglVar.getClass();
        aiglVar2.getClass();
        return isSubtypeOf(aiji.createClassicTypeCheckerState$default(true, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), aiglVar.unwrap(), aiglVar2.unwrap());
    }

    public /* synthetic */ aikf(aiju aijuVar, aijs aijsVar, int i, afeu afeuVar) {
        this(aijuVar, (i & 2) != 0 ? aijq.INSTANCE : aijsVar);
    }

    public final boolean equalTypes(aiic aiicVar, aijf aijfVar, aijf aijfVar2) {
        aiicVar.getClass();
        aijfVar.getClass();
        aijfVar2.getClass();
        return aier.INSTANCE.equalTypes(aiicVar, aijfVar, aijfVar2);
    }

    public final boolean isSubtypeOf(aiic aiicVar, aijf aijfVar, aijf aijfVar2) {
        aiicVar.getClass();
        aijfVar.getClass();
        aijfVar2.getClass();
        return aier.isSubtypeOf$default(aier.INSTANCE, aiicVar, aijfVar, aijfVar2, false, 8, null);
    }
}
