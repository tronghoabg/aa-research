package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class aifo extends aifq implements aifl, ailt {
    public static final aifn Companion = new aifn(null);
    private final aigw original;
    private final boolean useCorrectedNullabilityForTypeParameters;

    private aifo(aigw aigwVar, boolean z) {
        this.original = aigwVar;
        this.useCorrectedNullabilityForTypeParameters = z;
    }

    @Override // defpackage.aifq
    protected aigw getDelegate() {
        return this.original;
    }

    public final aigw getOriginal() {
        return this.original;
    }

    @Override // defpackage.aifq, defpackage.aigl
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // defpackage.aifl
    public boolean isTypeParameter() {
        return (getDelegate().getConstructor() instanceof aikg) || (getDelegate().getConstructor().getDeclarationDescriptor() instanceof agee);
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new aifo(getDelegate().replaceAttributes(aihrVar), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // defpackage.aifq
    public aifo replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new aifo(aigwVar, this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // defpackage.aifl
    public aigl substitutionResult(aigl aiglVar) {
        aiglVar.getClass();
        return aiha.makeDefinitelyNotNullOrNotNull(aiglVar.unwrap(), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // defpackage.aigw
    public String toString() {
        aigw delegate = getDelegate();
        Objects.toString(delegate);
        return String.valueOf(delegate).concat(" & Any");
    }

    public /* synthetic */ aifo(aigw aigwVar, boolean z, afeu afeuVar) {
        this(aigwVar, z);
    }
}
