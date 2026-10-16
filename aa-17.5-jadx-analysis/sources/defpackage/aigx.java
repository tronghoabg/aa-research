package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class aigx extends aigw {
    private final List<aiin> arguments;
    private final aiid constructor;
    private final boolean isMarkedNullable;
    private final ahxe memberScope;
    private final afec<aiju, aigw> refinedTypeFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public aigx(aiid aiidVar, List<? extends aiin> list, boolean z, ahxe ahxeVar, afec<? super aiju, ? extends aigw> afecVar) {
        aiidVar.getClass();
        list.getClass();
        ahxeVar.getClass();
        afecVar.getClass();
        this.constructor = aiidVar;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.memberScope = ahxeVar;
        this.refinedTypeFactory = afecVar;
        if (!(getMemberScope() instanceof ailh) || (getMemberScope() instanceof ailn)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + getMemberScope() + '\n' + getConstructor());
    }

    @Override // defpackage.aigl
    public List<aiin> getArguments() {
        return this.arguments;
    }

    @Override // defpackage.aigl
    public aihr getAttributes() {
        return aihr.Companion.getEmpty();
    }

    @Override // defpackage.aigl
    public aiid getConstructor() {
        return this.constructor;
    }

    @Override // defpackage.aigl
    public ahxe getMemberScope() {
        return this.memberScope;
    }

    @Override // defpackage.aigl
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : z ? new aigv(this) : new aigu(this);
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aigw refine(aiju aijuVar) {
        aijuVar.getClass();
        aigw aigwVarInvoke = this.refinedTypeFactory.invoke(aijuVar);
        return aigwVarInvoke == null ? this : aigwVarInvoke;
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return aihrVar.isEmpty() ? this : new aigy(this, aihrVar);
    }
}
