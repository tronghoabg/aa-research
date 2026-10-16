package defpackage;

/* loaded from: classes3.dex */
final class aigv extends aifr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigv(aigw aigwVar) {
        super(aigwVar);
        aigwVar.getClass();
    }

    @Override // defpackage.aifq, defpackage.aigl
    public boolean isMarkedNullable() {
        return true;
    }

    @Override // defpackage.aifq
    public aigv replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new aigv(aigwVar);
    }
}
