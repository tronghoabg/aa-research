package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahcu {
    private final ahao typeEnhancement;

    public ahcu(ahao ahaoVar) {
        ahaoVar.getClass();
        this.typeEnhancement = ahaoVar;
    }

    private final boolean containsFunctionN(aigl aiglVar) {
        return aijc.contains(aiglVar, ahct.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsFunctionN$lambda$0(aijf aijfVar) {
        agbd declarationDescriptor = aijfVar.getConstructor().getDeclarationDescriptor();
        boolean z = false;
        if (declarationDescriptor == null) {
            return false;
        }
        if (affa.f(declarationDescriptor.getName(), afzq.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) && affa.f(ahvz.fqNameOrNull(declarationDescriptor), afzq.INSTANCE.getFUNCTION_N_FQ_NAME())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private final aigl enhance(agax agaxVar, agez agezVar, boolean z, agvu agvuVar, agrv agrvVar, ahdb ahdbVar, boolean z2, afec<? super agax, ? extends aigl> afecVar) {
        ahcy ahcyVar = new ahcy(agezVar, z, agvuVar, agrvVar, false, 16, null);
        aigl aiglVarInvoke = afecVar.invoke(agaxVar);
        Collection<? extends agax> overriddenDescriptors = agaxVar.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(overriddenDescriptors, 10));
        for (agax agaxVar2 : overriddenDescriptors) {
            agaxVar2.getClass();
            arrayList.add(afecVar.invoke(agaxVar2));
        }
        return enhance(ahcyVar, aiglVarInvoke, arrayList, ahdbVar, z2);
    }

    static /* synthetic */ aigl enhance$default(ahcu ahcuVar, ahcy ahcyVar, aigl aiglVar, List list, ahdb ahdbVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            ahdbVar = null;
        }
        return ahcuVar.enhance(ahcyVar, aiglVar, list, ahdbVar, ((i & 8) == 0) & z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01eb, code lost:
    
        if (r4 == null) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends defpackage.agax> D enhanceSignature(D r17, defpackage.agvu r18) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahcu.enhanceSignature(agax, agvu):agax");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl enhanceSignature$lambda$0(agax agaxVar) {
        agaxVar.getClass();
        agdq extensionReceiverParameter = agaxVar.getExtensionReceiverParameter();
        extensionReceiverParameter.getClass();
        aigl type = extensionReceiverParameter.getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl enhanceSignature$lambda$4$0(agel agelVar, agax agaxVar) {
        agaxVar.getClass();
        aigl type = agaxVar.getValueParameters().get(agelVar.getIndex()).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl enhanceSignature$lambda$5(agax agaxVar) {
        agaxVar.getClass();
        aigl returnType = agaxVar.getReturnType();
        returnType.getClass();
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enhanceTypeParameterBounds$lambda$0$0(aijf aijfVar) {
        aijfVar.getClass();
        return aijfVar instanceof agzc;
    }

    private final aigl enhanceValueParameter(agax agaxVar, agel agelVar, agvu agvuVar, ahdb ahdbVar, boolean z, afec<? super agax, ? extends aigl> afecVar) {
        if (agelVar != null) {
            agvuVar = agvk.copyWithNewDefaultTypeQualifiers(agvuVar, agelVar.getAnnotations());
        }
        return enhance(agaxVar, agelVar, false, agvuVar, agrv.VALUE_PARAMETER, ahdbVar, z, afecVar);
    }

    private final <D extends agax> agfk getDefaultAnnotations(D d, agvu agvuVar) {
        agbd topLevelContainingClassifier = agbo.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        agws agwsVar = topLevelContainingClassifier instanceof agws ? (agws) topLevelContainingClassifier : null;
        List<agzf> moduleAnnotations = agwsVar != null ? agwsVar.getModuleAnnotations() : null;
        if (moduleAnnotations == null || moduleAnnotations.isEmpty()) {
            return d.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(woy.bp(moduleAnnotations, 10));
        Iterator<T> it = moduleAnnotations.iterator();
        while (it.hasNext()) {
            arrayList.add(new agwl(agvuVar, (agzf) it.next(), true));
        }
        return agfk.Companion.create(woy.bW(d.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends agax> Collection<D> enhanceSignatures(agvu agvuVar, Collection<? extends D> collection) {
        agvuVar.getClass();
        collection.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((agax) it.next(), agvuVar));
        }
        return arrayList;
    }

    public final aigl enhanceSuperType(aigl aiglVar, agvu agvuVar) {
        aiglVar.getClass();
        agvuVar.getClass();
        aigl aiglVarEnhance$default = enhance$default(this, new ahcy(null, false, agvuVar, agrv.TYPE_USE, true), aiglVar, afbe.a, null, false, 12, null);
        return aiglVarEnhance$default == null ? aiglVar : aiglVarEnhance$default;
    }

    public final List<aigl> enhanceTypeParameterBounds(agee ageeVar, List<? extends aigl> list, agvu agvuVar) {
        ageeVar.getClass();
        list.getClass();
        agvuVar.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        for (aigl aiglVar : list) {
            if (!aimr.contains(aiglVar, ahcs.INSTANCE)) {
                aigl aiglVarEnhance$default = enhance$default(this, new ahcy(ageeVar, false, agvuVar, agrv.TYPE_PARAMETER_BOUNDS, false, 16, null), aiglVar, afbe.a, null, false, 12, null);
                if (aiglVarEnhance$default != null) {
                    aiglVar = aiglVarEnhance$default;
                }
            }
            arrayList.add(aiglVar);
        }
        return arrayList;
    }

    static /* synthetic */ aigl enhance$default(ahcu ahcuVar, agax agaxVar, agez agezVar, boolean z, agvu agvuVar, agrv agrvVar, ahdb ahdbVar, boolean z2, afec afecVar, int i, Object obj) {
        return ahcuVar.enhance(agaxVar, agezVar, z, agvuVar, agrvVar, ahdbVar, z2 & ((i & 32) == 0), afecVar);
    }

    private final aigl enhance(ahcy ahcyVar, aigl aiglVar, List<? extends aigl> list, ahdb ahdbVar, boolean z) {
        return this.typeEnhancement.enhance(aiglVar, ahcyVar.computeIndexedQualifiers(aiglVar, list, ahdbVar, z), ahcyVar.getSkipRawTypeArguments());
    }
}
