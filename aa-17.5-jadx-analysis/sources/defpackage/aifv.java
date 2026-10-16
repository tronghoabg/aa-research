package defpackage;

/* loaded from: classes3.dex */
public final class aifv extends aiga implements ailu {
    private final aihr attributes;

    /* JADX WARN: Illegal instructions before constructor call */
    public aifv(afye afyeVar, aihr aihrVar) {
        afyeVar.getClass();
        aihrVar.getClass();
        aigw nothingType = afyeVar.getNothingType();
        nothingType.getClass();
        aigw nullableAnyType = afyeVar.getNullableAnyType();
        nullableAnyType.getClass();
        super(nothingType, nullableAnyType);
        this.attributes = aihrVar;
    }

    @Override // defpackage.aiga, defpackage.aigl
    public aihr getAttributes() {
        return this.attributes;
    }

    @Override // defpackage.aiga
    public aigw getDelegate() {
        return getUpperBound();
    }

    @Override // defpackage.aiga, defpackage.aigl
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aifv refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }

    @Override // defpackage.aiga
    public String render(ahre ahreVar, ahrt ahrtVar) {
        ahreVar.getClass();
        ahrtVar.getClass();
        return "dynamic";
    }

    @Override // defpackage.aijf
    public aifv replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new aifv(aimr.getBuiltIns(getDelegate()), aihrVar);
    }

    @Override // defpackage.aijf
    public /* bridge */ /* synthetic */ aijf makeNullableAsSpecified(boolean z) {
        return this;
    }

    @Override // defpackage.aigl
    public /* bridge */ /* synthetic */ aigl refine(aiju aijuVar) {
        refine(aijuVar);
        return this;
    }

    @Override // defpackage.aijf, defpackage.aigl
    public /* bridge */ /* synthetic */ aijf refine(aiju aijuVar) {
        refine(aijuVar);
        return this;
    }

    @Override // defpackage.aijf
    public aifv makeNullableAsSpecified(boolean z) {
        return this;
    }
}
