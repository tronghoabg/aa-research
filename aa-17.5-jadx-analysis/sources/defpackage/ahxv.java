package defpackage;

/* loaded from: classes3.dex */
public final class ahxv extends ahxu implements ahxz {
    private final agba classDescriptor;
    private final ahnj customLabelName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxv(agba agbaVar, aigl aiglVar, ahnj ahnjVar, ahya ahyaVar) {
        super(aiglVar, ahyaVar);
        agbaVar.getClass();
        aiglVar.getClass();
        this.classDescriptor = agbaVar;
        this.customLabelName = ahnjVar;
    }

    @Override // defpackage.ahxz
    public ahnj getCustomLabelName() {
        return this.customLabelName;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.classDescriptor + " }";
    }
}
