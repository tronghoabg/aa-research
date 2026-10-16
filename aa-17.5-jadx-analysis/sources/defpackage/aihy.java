package defpackage;

/* loaded from: classes3.dex */
public final class aihy extends aiib {
    public static final aihy INSTANCE = new aihy();

    private aihy() {
        super(null);
    }

    @Override // defpackage.aiib
    public ailx transformType(aiic aiicVar, ailw ailwVar) {
        aiicVar.getClass();
        ailwVar.getClass();
        return aiicVar.getTypeSystemContext().lowerBoundIfFlexible(ailwVar);
    }
}
