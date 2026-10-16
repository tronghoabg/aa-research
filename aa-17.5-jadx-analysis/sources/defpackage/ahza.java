package defpackage;

/* loaded from: classes3.dex */
public abstract class ahza extends agie {
    private final aiei storageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahza(ahnf ahnfVar, aiei aieiVar, agcu agcuVar) {
        super(agcuVar, ahnfVar);
        ahnfVar.getClass();
        aieiVar.getClass();
        agcuVar.getClass();
        this.storageManager = aieiVar;
    }

    public abstract ahyn getClassDataFinder();

    public boolean hasTopLevelClass(ahnj ahnjVar) {
        ahnjVar.getClass();
        ahxe memberScope = getMemberScope();
        return (memberScope instanceof aics) && ((aics) memberScope).getClassNames$org_jetbrains_kotlin_deserialization().contains(ahnjVar);
    }

    public abstract void initialize(ahyv ahyvVar);
}
