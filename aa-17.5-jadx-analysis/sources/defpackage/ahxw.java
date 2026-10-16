package defpackage;

/* loaded from: classes3.dex */
public final class ahxw extends ahxu implements ahxz {
    private final ahnj customLabelName;
    private final agav declarationDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxw(agav agavVar, aigl aiglVar, ahnj ahnjVar, ahya ahyaVar) {
        super(aiglVar, ahyaVar);
        agavVar.getClass();
        aiglVar.getClass();
        this.declarationDescriptor = agavVar;
        this.customLabelName = ahnjVar;
    }

    @Override // defpackage.ahxz
    public ahnj getCustomLabelName() {
        return this.customLabelName;
    }

    public agav getDeclarationDescriptor() {
        return this.declarationDescriptor;
    }

    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
