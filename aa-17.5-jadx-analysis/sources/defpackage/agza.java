package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agza extends aiit {
    public static final agyz Companion = new agyz(null);
    private static final agyr lowerTypeAttr = agys.toAttributes$default(aija.COMMON, false, true, null, 5, null).withFlexibility(agyt.FLEXIBLE_LOWER_BOUND);
    private static final agyr upperTypeAttr = agys.toAttributes$default(aija.COMMON, false, true, null, 5, null).withFlexibility(agyt.FLEXIBLE_UPPER_BOUND);
    private final agyx projectionComputer;
    private final aiim typeParameterUpperBoundEraser;

    /* JADX WARN: Multi-variable type inference failed */
    public agza(aiim aiimVar) {
        agyx agyxVar = new agyx();
        this.projectionComputer = agyxVar;
        if (aiimVar == null) {
            aiimVar = new aiim(agyxVar, null, 2, 0 == true ? 1 : 0);
        }
        this.typeParameterUpperBoundEraser = aiimVar;
    }

    private final aezu<aigw, Boolean> eraseInflexibleBasedOnClassDescriptor(aigw aigwVar, agba agbaVar, agyr agyrVar) {
        if (aigwVar.getConstructor().getParameters().isEmpty()) {
            return new aezu<>(aigwVar, false);
        }
        if (afye.isArray(aigwVar)) {
            aiin aiinVar = aigwVar.getArguments().get(0);
            aijg projectionKind = aiinVar.getProjectionKind();
            aigl type = aiinVar.getType();
            type.getClass();
            return new aezu<>(aigq.simpleType$default(aigwVar.getAttributes(), aigwVar.getConstructor(), woy.bg(new aiip(projectionKind, eraseType(type, agyrVar))), aigwVar.isMarkedNullable(), (aiju) null, 16, (Object) null), false);
        }
        if (aigr.isError(aigwVar)) {
            return new aezu<>(ailm.createErrorType(aill.ERROR_RAW_TYPE, aigwVar.getConstructor().toString()), false);
        }
        ahxe memberScope = agbaVar.getMemberScope(this);
        memberScope.getClass();
        aihr attributes = aigwVar.getAttributes();
        aiid typeConstructor = agbaVar.getTypeConstructor();
        typeConstructor.getClass();
        List<agee> parameters = agbaVar.getTypeConstructor().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
        for (agee ageeVar : parameters) {
            agyx agyxVar = this.projectionComputer;
            ageeVar.getClass();
            arrayList.add(aifx.computeProjection$default(agyxVar, ageeVar, agyrVar, this.typeParameterUpperBoundEraser, null, 8, null));
        }
        return new aezu<>(aigq.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, aigwVar.isMarkedNullable(), memberScope, new agyy(agbaVar, this, aigwVar, agyrVar)), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw eraseInflexibleBasedOnClassDescriptor$lambda$1(agba agbaVar, agza agzaVar, aigw aigwVar, agyr agyrVar, aiju aijuVar) {
        agba agbaVarFindClassAcrossModuleDependencies;
        aijuVar.getClass();
        ahnd classId = ahvz.getClassId(agbaVar);
        if (classId == null || (agbaVarFindClassAcrossModuleDependencies = aijuVar.findClassAcrossModuleDependencies(classId)) == null || affa.f(agbaVarFindClassAcrossModuleDependencies, agbaVar)) {
            return null;
        }
        return (aigw) agzaVar.eraseInflexibleBasedOnClassDescriptor(aigwVar, agbaVarFindClassAcrossModuleDependencies, agyrVar).a;
    }

    private final aigl eraseType(aigl aiglVar, agyr agyrVar) {
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agee) {
            return eraseType(this.typeParameterUpperBoundEraser.getErasedUpperBound((agee) declarationDescriptor, agyrVar.markIsRaw(true)), agyrVar);
        }
        if (!(declarationDescriptor instanceof agba)) {
            Objects.toString(declarationDescriptor);
            throw new IllegalStateException("Unexpected declaration kind: ".concat(String.valueOf(declarationDescriptor)));
        }
        agbd declarationDescriptor2 = aige.upperIfFlexible(aiglVar).getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor2 instanceof agba)) {
            throw new IllegalStateException(a.cj((byte) 34, declarationDescriptor, declarationDescriptor2, "For some reason declaration for upper bound is not a class but \"", "\" while for lower it's \""));
        }
        aezu<aigw, Boolean> aezuVarEraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(aige.lowerIfFlexible(aiglVar), (agba) declarationDescriptor, lowerTypeAttr);
        aigw aigwVar = (aigw) aezuVarEraseInflexibleBasedOnClassDescriptor.a;
        boolean zBooleanValue = ((Boolean) aezuVarEraseInflexibleBasedOnClassDescriptor.b).booleanValue();
        aezu<aigw, Boolean> aezuVarEraseInflexibleBasedOnClassDescriptor2 = eraseInflexibleBasedOnClassDescriptor(aige.upperIfFlexible(aiglVar), (agba) declarationDescriptor2, upperTypeAttr);
        aigw aigwVar2 = (aigw) aezuVarEraseInflexibleBasedOnClassDescriptor2.a;
        return (zBooleanValue || ((Boolean) aezuVarEraseInflexibleBasedOnClassDescriptor2.b).booleanValue()) ? new agzc(aigwVar, aigwVar2) : aigq.flexibleType(aigwVar, aigwVar2);
    }

    static /* synthetic */ aigl eraseType$default(agza agzaVar, aigl aiglVar, agyr agyrVar, int i, Object obj) {
        if ((i & 2) != 0) {
            agyrVar = new agyr(aija.COMMON, null, false, false, null, null, 62, null);
        }
        return agzaVar.eraseType(aiglVar, agyrVar);
    }

    @Override // defpackage.aiit
    public aiip get(aigl aiglVar) {
        aiglVar.getClass();
        return new aiip(eraseType$default(this, aiglVar, null, 2, null));
    }

    @Override // defpackage.aiit
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public agza() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ agza(aiim aiimVar, int i, afeu afeuVar) {
        this(1 == (i & 1) ? null : aiimVar);
    }
}
