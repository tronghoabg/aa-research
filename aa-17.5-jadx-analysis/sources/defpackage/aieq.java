package defpackage;

/* loaded from: classes3.dex */
final class aieq implements afdr {
    private final aiic arg$0;
    private final aimg arg$1;
    private final ailx arg$2;
    private final ailx arg$3;

    public aieq(aiic aiicVar, aimg aimgVar, ailx ailxVar, ailx ailxVar2) {
        this.arg$0 = aiicVar;
        this.arg$1 = aimgVar;
        this.arg$2 = ailxVar;
        this.arg$3 = ailxVar2;
    }

    @Override // defpackage.afdr
    public Object invoke() {
        return Boolean.valueOf(aier.isSubtypeOfForSingleClassifierType$lambda$3$0(this.arg$0, this.arg$1, this.arg$2, this.arg$3));
    }
}
