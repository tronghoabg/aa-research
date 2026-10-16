package defpackage;

/* loaded from: classes3.dex */
public class aifp extends aiit {
    private final aiit substitution;

    public aifp(aiit aiitVar) {
        aiitVar.getClass();
        this.substitution = aiitVar;
    }

    @Override // defpackage.aiit
    public boolean approximateCapturedTypes() {
        return this.substitution.approximateCapturedTypes();
    }

    @Override // defpackage.aiit
    public boolean approximateContravariantCapturedTypes() {
        return this.substitution.approximateContravariantCapturedTypes();
    }

    @Override // defpackage.aiit
    public agfk filterAnnotations(agfk agfkVar) {
        agfkVar.getClass();
        return this.substitution.filterAnnotations(agfkVar);
    }

    @Override // defpackage.aiit
    public aiin get(aigl aiglVar) {
        aiglVar.getClass();
        return this.substitution.get(aiglVar);
    }

    @Override // defpackage.aiit
    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    @Override // defpackage.aiit
    public aigl prepareTopLevelType(aigl aiglVar, aijg aijgVar) {
        aiglVar.getClass();
        aijgVar.getClass();
        return this.substitution.prepareTopLevelType(aiglVar, aijgVar);
    }
}
