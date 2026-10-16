package defpackage;

/* loaded from: classes3.dex */
final class aigu extends aifr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigu(aigw aigwVar) {
        super(aigwVar);
        aigwVar.getClass();
    }

    @Override // defpackage.aifq, defpackage.aigl
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // defpackage.aifq
    public aigu replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new aigu(aigwVar);
    }
}
