package defpackage;

/* loaded from: classes3.dex */
public final class aiia extends aiib {
    public static final aiia INSTANCE = new aiia();

    private aiia() {
        super(null);
    }

    @Override // defpackage.aiib
    public ailx transformType(aiic aiicVar, ailw ailwVar) {
        aiicVar.getClass();
        ailwVar.getClass();
        return aiicVar.getTypeSystemContext().upperBoundIfFlexible(ailwVar);
    }
}
