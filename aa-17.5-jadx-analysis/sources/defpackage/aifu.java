package defpackage;

/* loaded from: classes3.dex */
public final class aifu extends aiit {
    public static final aift Companion = new aift(null);
    private final aiit first;
    private final aiit second;

    private aifu(aiit aiitVar, aiit aiitVar2) {
        this.first = aiitVar;
        this.second = aiitVar2;
    }

    public static final aiit create(aiit aiitVar, aiit aiitVar2) {
        return Companion.create(aiitVar, aiitVar2);
    }

    @Override // defpackage.aiit
    public boolean approximateCapturedTypes() {
        return this.first.approximateCapturedTypes() || this.second.approximateCapturedTypes();
    }

    @Override // defpackage.aiit
    public boolean approximateContravariantCapturedTypes() {
        return this.first.approximateContravariantCapturedTypes() || this.second.approximateContravariantCapturedTypes();
    }

    @Override // defpackage.aiit
    public agfk filterAnnotations(agfk agfkVar) {
        agfkVar.getClass();
        return this.second.filterAnnotations(this.first.filterAnnotations(agfkVar));
    }

    @Override // defpackage.aiit
    public aiin get(aigl aiglVar) {
        aiglVar.getClass();
        aiin aiinVar = this.first.get(aiglVar);
        return aiinVar == null ? this.second.get(aiglVar) : aiinVar;
    }

    @Override // defpackage.aiit
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.aiit
    public aigl prepareTopLevelType(aigl aiglVar, aijg aijgVar) {
        aiglVar.getClass();
        aijgVar.getClass();
        return this.second.prepareTopLevelType(this.first.prepareTopLevelType(aiglVar, aijgVar), aijgVar);
    }

    public /* synthetic */ aifu(aiit aiitVar, aiit aiitVar2, afeu afeuVar) {
        this(aiitVar, aiitVar2);
    }
}
