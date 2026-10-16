package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahac extends defpackage.aiha {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahac(defpackage.aihw aihwVar, defpackage.aihw aihwVar2) {
        this(aihwVar, aihwVar2, false);
        aihwVar.getClass();
        aihwVar2.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence render$lambda$1(java.lang.String str) {
        str.getClass();
        return "(raw) ".concat(str);
    }

    private static final boolean render$onlyOutDiffers(java.lang.String str, java.lang.String str2) {
        return defpackage.afga.f(str, defpackage.afzh.m(str2, "out ")) || defpackage.afga.f(str2, "*");
    }

    private static final java.util.List<java.lang.String> render$renderArguments(defpackage.ahse ahseVar, defpackage.aihl aihlVar) {
        java.util.List<defpackage.aijn> arguments = aihlVar.getArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(arguments, 10));
        java.util.Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(ahseVar.renderTypeProjection((defpackage.aijn) it.next()));
        }
        return arrayList;
    }

    private static final java.lang.String render$replaceArgs(java.lang.String str, java.lang.String str2) {
        if (!defpackage.afzh.A(str, '<')) {
            return str;
        }
        return defpackage.afzh.q(str, '<', str) + '<' + str2 + '>' + defpackage.afzh.p(str, '>', str);
    }

    @Override // defpackage.aiha
    public defpackage.aihw getDelegate() {
        return getLowerBound();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiha, defpackage.aihl
    public defpackage.ahye getMemberScope() {
        defpackage.agcd declarationDescriptor = getConstructor().getDeclarationDescriptor();
        defpackage.aijm aijmVar = null;
        java.lang.Object[] objArr = 0;
        defpackage.agca agcaVar = declarationDescriptor instanceof defpackage.agca ? (defpackage.agca) declarationDescriptor : null;
        if (agcaVar != null) {
            defpackage.ahye memberScope = agcaVar.getMemberScope(new defpackage.ahaa(aijmVar, 1, objArr == true ? 1 : 0));
            memberScope.getClass();
            return memberScope;
        }
        defpackage.agcd declarationDescriptor2 = getConstructor().getDeclarationDescriptor();
        java.util.Objects.toString(declarationDescriptor2);
        throw new java.lang.IllegalStateException("Incorrect classifier: ".concat(java.lang.String.valueOf(declarationDescriptor2)));
    }

    @Override // defpackage.aikf
    public defpackage.ahac makeNullableAsSpecified(boolean z) {
        return new defpackage.ahac(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // defpackage.aikf, defpackage.aihl
    public defpackage.aiha refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        defpackage.aihl aihlVarRefineType = aikuVar.refineType((defpackage.aimw) getLowerBound());
        aihlVarRefineType.getClass();
        defpackage.aihl aihlVarRefineType2 = aikuVar.refineType((defpackage.aimw) getUpperBound());
        aihlVarRefineType2.getClass();
        return new defpackage.ahac((defpackage.aihw) aihlVarRefineType, (defpackage.aihw) aihlVarRefineType2, true);
    }

    @Override // defpackage.aiha
    public java.lang.String render(defpackage.ahse ahseVar, defpackage.ahst ahstVar) throws java.io.IOException {
        defpackage.afau afauVar;
        ahseVar.getClass();
        ahstVar.getClass();
        java.lang.String strRenderType = ahseVar.renderType(getLowerBound());
        java.lang.String strRenderType2 = ahseVar.renderType(getUpperBound());
        if (ahstVar.getDebugMode()) {
            return "raw (" + strRenderType + ".." + strRenderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return ahseVar.renderFlexibleType(strRenderType, strRenderType2, defpackage.ainr.getBuiltIns(this));
        }
        java.util.List<java.lang.String> listRender$renderArguments = render$renderArguments(ahseVar, getLowerBound());
        java.util.List<java.lang.String> listRender$renderArguments2 = render$renderArguments(ahseVar, getUpperBound());
        java.lang.String strBo = defpackage.afga.bo(listRender$renderArguments, ", ", null, null, defpackage.ahab.INSTANCE, 30);
        java.util.List listBc = defpackage.afga.bc(listRender$renderArguments, listRender$renderArguments2);
        if (!listBc.isEmpty()) {
            java.util.Iterator it = listBc.iterator();
            do {
                if (!it.hasNext()) {
                    strRenderType2 = render$replaceArgs(strRenderType2, strBo);
                    break;
                }
                afauVar = (defpackage.afau) it.next();
            } while (render$onlyOutDiffers((java.lang.String) afauVar.a, (java.lang.String) afauVar.b));
        } else {
            strRenderType2 = render$replaceArgs(strRenderType2, strBo);
            break;
        }
        java.lang.String strRender$replaceArgs = render$replaceArgs(strRenderType, strBo);
        return defpackage.afga.f(strRender$replaceArgs, strRenderType2) ? strRender$replaceArgs : ahseVar.renderFlexibleType(strRender$replaceArgs, strRenderType2, defpackage.ainr.getBuiltIns(this));
    }

    @Override // defpackage.aikf
    public defpackage.ahac replaceAttributes(defpackage.aiir aiirVar) {
        aiirVar.getClass();
        return new defpackage.ahac(getLowerBound().replaceAttributes(aiirVar), getUpperBound().replaceAttributes(aiirVar));
    }

    private ahac(defpackage.aihw aihwVar, defpackage.aihw aihwVar2, boolean z) {
        super(aihwVar, aihwVar2);
        if (z) {
            return;
        }
        defpackage.aikp.DEFAULT.isSubtypeOf(aihwVar, aihwVar2);
    }
}
