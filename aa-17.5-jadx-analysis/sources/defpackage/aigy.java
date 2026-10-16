package defpackage;

/* loaded from: classes3.dex */
final class aigy extends aifr {
    private final aihr attributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigy(aigw aigwVar, aihr aihrVar) {
        super(aigwVar);
        aigwVar.getClass();
        aihrVar.getClass();
        this.attributes = aihrVar;
    }

    @Override // defpackage.aifq, defpackage.aigl
    public aihr getAttributes() {
        return this.attributes;
    }

    @Override // defpackage.aifq
    public aigy replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new aigy(aigwVar, getAttributes());
    }
}
