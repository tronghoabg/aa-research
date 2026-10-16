package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aigf extends aiit {
    private final boolean approximateContravariantCapturedTypes;
    private final aiin[] arguments;
    private final agee[] parameters;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aigf(List<? extends agee> list, List<? extends aiin> list2) {
        this((agee[]) list.toArray(new agee[0]), (aiin[]) list2.toArray(new aiin[0]), false, 4, null);
        list.getClass();
        list2.getClass();
    }

    @Override // defpackage.aiit
    public boolean approximateContravariantCapturedTypes() {
        return this.approximateContravariantCapturedTypes;
    }

    @Override // defpackage.aiit
    public aiin get(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        agee ageeVar = declarationDescriptor instanceof agee ? (agee) declarationDescriptor : null;
        if (ageeVar != null) {
            agee[] ageeVarArr = this.parameters;
            int index = ageeVar.getIndex();
            if (index < ageeVarArr.length && affa.f(this.parameters[index].getTypeConstructor(), ageeVar.getTypeConstructor())) {
                return this.arguments[index];
            }
        }
        return null;
    }

    public final aiin[] getArguments() {
        return this.arguments;
    }

    public final agee[] getParameters() {
        return this.parameters;
    }

    @Override // defpackage.aiit
    public boolean isEmpty() {
        return this.arguments.length == 0;
    }

    public aigf(agee[] ageeVarArr, aiin[] aiinVarArr, boolean z) {
        ageeVarArr.getClass();
        aiinVarArr.getClass();
        this.parameters = ageeVarArr;
        this.arguments = aiinVarArr;
        this.approximateContravariantCapturedTypes = z;
        int length = ageeVarArr.length;
        int length2 = aiinVarArr.length;
    }

    public /* synthetic */ aigf(agee[] ageeVarArr, aiin[] aiinVarArr, boolean z, int i, afeu afeuVar) {
        this(ageeVarArr, aiinVarArr, z & ((i & 4) == 0));
    }
}
