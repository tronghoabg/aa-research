package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class agwr extends aiek {
    private final aiec<List<agee>> parameters;
    final /* synthetic */ agws this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwr(agws agwsVar) {
        super(agwsVar.c.getStorageManager());
        this.this$0 = agwsVar;
        this.parameters = agwsVar.c.getStorageManager().createLazyValue(new agwq(agwsVar));
    }

    private final aigl getPurelyImplementedSupertype() {
        ahnf purelyImplementedInterface;
        ArrayList arrayList;
        ahnf purelyImplementsFqNameFromAnnotation = getPurelyImplementsFqNameFromAnnotation();
        if (purelyImplementsFqNameFromAnnotation == null || purelyImplementsFqNameFromAnnotation.isRoot() || !purelyImplementsFqNameFromAnnotation.startsWith(afyo.BUILT_INS_PACKAGE_NAME)) {
            purelyImplementsFqNameFromAnnotation = null;
        }
        if (purelyImplementsFqNameFromAnnotation == null) {
            purelyImplementedInterface = agsj.INSTANCE.getPurelyImplementedInterface(ahvz.getFqNameSafe(this.this$0));
            if (purelyImplementedInterface != null) {
            }
            return null;
        }
        purelyImplementedInterface = purelyImplementsFqNameFromAnnotation;
        agba agbaVarResolveTopLevelClass = ahvz.resolveTopLevelClass(this.this$0.c.getModule(), purelyImplementedInterface, aglr.FROM_JAVA_LOADER);
        if (agbaVarResolveTopLevelClass != null) {
            int size = agbaVarResolveTopLevelClass.getTypeConstructor().getParameters().size();
            List<agee> parameters = this.this$0.getTypeConstructor().getParameters();
            parameters.getClass();
            int size2 = parameters.size();
            if (size2 == size) {
                arrayList = new ArrayList(woy.bp(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new aiip(aijg.INVARIANT, ((agee) it.next()).getDefaultType()));
                }
            } else if (size2 == 1 && size > 1 && purelyImplementsFqNameFromAnnotation == null) {
                aiip aiipVar = new aiip(aijg.INVARIANT, ((agee) woy.bN(parameters)).getDefaultType());
                afha afhaVar = new afha(1, size);
                ArrayList arrayList2 = new ArrayList(woy.bp(afhaVar, 10));
                afbk it2 = afhaVar.iterator();
                while (((afgz) it2).a) {
                    it2.a();
                    arrayList2.add(aiipVar);
                }
                arrayList = arrayList2;
            }
            return aigq.simpleNotNullType(aihr.Companion.getEmpty(), agbaVarResolveTopLevelClass, arrayList);
        }
        return null;
    }

    private final ahnf getPurelyImplementsFqNameFromAnnotation() {
        String str;
        agfk annotations = this.this$0.getAnnotations();
        ahnf ahnfVar = agti.PURELY_IMPLEMENTS_ANNOTATION;
        ahnfVar.getClass();
        agfc agfcVarFindAnnotation = annotations.findAnnotation(ahnfVar);
        if (agfcVarFindAnnotation == null) {
            return null;
        }
        Object objBO = woy.bO(agfcVarFindAnnotation.getAllValueArguments().values());
        ahvh ahvhVar = objBO instanceof ahvh ? (ahvh) objBO : null;
        if (ahvhVar == null || (str = (String) ahvhVar.getValue()) == null || !ahni.isValidJavaFqName(str)) {
            return null;
        }
        return new ahnf(str);
    }

    @Override // defpackage.aifc
    protected Collection<aigl> computeSupertypes() {
        Collection<agzl> supertypes = this.this$0.getJClass().getSupertypes();
        ArrayList arrayList = new ArrayList(supertypes.size());
        ArrayList<agzw> arrayList2 = new ArrayList(0);
        aigl purelyImplementedSupertype = getPurelyImplementedSupertype();
        Iterator<agzl> it = supertypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            agzl next = it.next();
            aigl aiglVarEnhanceSuperType = this.this$0.c.getComponents().getSignatureEnhancement().enhanceSuperType(this.this$0.c.getTypeResolver().transformJavaType(next, agys.toAttributes$default(aija.SUPERTYPE, false, false, null, 7, null)), this.this$0.c);
            if (aiglVarEnhanceSuperType.getConstructor().getDeclarationDescriptor() instanceof agda) {
                arrayList2.add(next);
            }
            if (!affa.f(aiglVarEnhanceSuperType.getConstructor(), purelyImplementedSupertype != null ? purelyImplementedSupertype.getConstructor() : null) && !afye.isAnyOrNullableAny(aiglVarEnhanceSuperType)) {
                arrayList.add(aiglVarEnhanceSuperType);
            }
        }
        agba agbaVar = this.this$0.additionalSupertypeClassDescriptor;
        aiow.addIfNotNull(arrayList, agbaVar != null ? agat.createMappedTypeParametersSubstitution(agbaVar, this.this$0).buildSubstitutor().substitute(agbaVar.getDefaultType(), aijg.INVARIANT) : null);
        aiow.addIfNotNull(arrayList, purelyImplementedSupertype);
        if (!arrayList2.isEmpty()) {
            ahzh errorReporter = this.this$0.c.getComponents().getErrorReporter();
            agba declarationDescriptor = getDeclarationDescriptor();
            ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
            for (agzw agzwVar : arrayList2) {
                agzwVar.getClass();
                arrayList3.add(((agzl) agzwVar).getPresentableText());
            }
            errorReporter.reportIncompleteHierarchy(declarationDescriptor, arrayList3);
        }
        return !arrayList.isEmpty() ? woy.cf(arrayList) : woy.bg(this.this$0.c.getModule().getBuiltIns().getAnyType());
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return this.parameters.invoke();
    }

    @Override // defpackage.aifc
    protected agec getSupertypeLoopChecker() {
        return this.this$0.c.getComponents().getSupertypeLoopChecker();
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        String strAsString = this.this$0.getName().asString();
        strAsString.getClass();
        return strAsString;
    }

    @Override // defpackage.aiek, defpackage.aifk, defpackage.aiid
    public agba getDeclarationDescriptor() {
        return this.this$0;
    }
}
