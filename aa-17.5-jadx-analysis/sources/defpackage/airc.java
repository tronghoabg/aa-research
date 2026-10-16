package defpackage;

/* loaded from: classes3.dex */
public final class airc extends aihx {
    final /* synthetic */ aiqu $substitutor;

    public airc(aiqu aiquVar) {
        this.$substitutor = aiquVar;
    }

    @Override // defpackage.aiib
    public ailx transformType(aiic aiicVar, ailw ailwVar) {
        aiicVar.getClass();
        ailwVar.getClass();
        afib afibVar = aiqu.substitute$default(this.$substitutor, (afib) aird.INSTANCE.lowerBoundIfFlexible(ailwVar), null, 2, null).c;
        afibVar.getClass();
        return (aiqc) afibVar;
    }
}
