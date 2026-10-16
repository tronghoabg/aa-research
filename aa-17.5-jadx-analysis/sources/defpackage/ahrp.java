package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahrp extends ahre implements ahrt {
    private final aezr functionTypeAnnotationsRenderer$delegate;
    private final ahry options;

    public ahrp(ahry ahryVar) {
        ahryVar.getClass();
        this.options = ahryVar;
        ahryVar.isLocked();
        this.functionTypeAnnotationsRenderer$delegate = woy.dG(new ahrf(this));
    }

    private final void appendDefinedIn(StringBuilder sb, agbi agbiVar) {
        agbi containingDeclaration;
        String name;
        if ((agbiVar instanceof agdc) || (agbiVar instanceof agdj) || (containingDeclaration = agbiVar.getContainingDeclaration()) == null || (containingDeclaration instanceof agcu)) {
            return;
        }
        sb.append(" ");
        sb.append(renderMessage("defined in"));
        sb.append(" ");
        ahnh fqName = ahst.getFqName(containingDeclaration);
        fqName.getClass();
        sb.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
        if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof agdc) && (agbiVar instanceof agbl) && (name = ((agbl) agbiVar).getSource().getContainingFile().getName()) != null) {
            sb.append(" ");
            sb.append(renderMessage("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    private final void appendTypeProjections(StringBuilder sb, List<? extends aiin> list) throws IOException {
        woy.ct(list, sb, ", ", "", "", -1, "...", new ahrj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence appendTypeProjections$lambda$0(ahrp ahrpVar, aiin aiinVar) {
        aiinVar.getClass();
        if (aiinVar.isStarProjection()) {
            return "*";
        }
        aigl type = aiinVar.getType();
        type.getClass();
        String strRenderType = ahrpVar.renderType(type);
        if (aiinVar.getProjectionKind() == aijg.INVARIANT) {
            return strRenderType;
        }
        return aiinVar.getProjectionKind() + ' ' + strRenderType;
    }

    private final String arrow() {
        ahsg textFormat = getTextFormat();
        ahsg ahsgVar = ahsg.PLAIN;
        ahsc ahscVar = ahsc.ALL;
        int iOrdinal = textFormat.ordinal();
        if (iOrdinal == 0) {
            return escape("->");
        }
        if (iOrdinal == 1) {
            return "&rarr;";
        }
        throw new aezs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String escape(String str) {
        return getTextFormat().escape(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahrp functionTypeAnnotationsRenderer_delegate$lambda$0(ahrp ahrpVar) {
        return (ahrp) ahrpVar.withOptions(ahrm.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak functionTypeAnnotationsRenderer_delegate$lambda$0$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setExcludedTypeAnnotationClasses(woy.aS(ahrtVar.getExcludedTypeAnnotationClasses(), woy.bi(afyn.extensionFunctionType, afyn.contextFunctionTypeParams)));
        return afak.a;
    }

    private final ahrp getFunctionTypeAnnotationsRenderer() {
        return (ahrp) this.functionTypeAnnotationsRenderer$delegate.a();
    }

    private final String gt() {
        return escape(">");
    }

    private final boolean hasModifiersOrAnnotations(aigl aiglVar) {
        return afxy.isSuspendFunctionType(aiglVar) || !aiglVar.getAnnotations().isEmpty();
    }

    private final agcq implicitModalityWithoutExtensions(agco agcoVar) {
        if (agcoVar instanceof agba) {
            return ((agba) agcoVar).getKind() == agbb.INTERFACE ? agcq.ABSTRACT : agcq.FINAL;
        }
        agbi containingDeclaration = agcoVar.getContainingDeclaration();
        agba agbaVar = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
        if (agbaVar == null) {
            return agcq.FINAL;
        }
        if (!(agcoVar instanceof agax)) {
            return agcq.FINAL;
        }
        agax agaxVar = (agax) agcoVar;
        Collection<? extends agax> overriddenDescriptors = agaxVar.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        if (overriddenDescriptors.isEmpty() || agbaVar.getModality() == agcq.FINAL) {
            if (agbaVar.getKind() != agbb.INTERFACE || affa.f(agaxVar.getVisibility(), agcb.PRIVATE)) {
                return agcq.FINAL;
            }
            agcq modality = agaxVar.getModality();
            agcq agcqVar = agcq.ABSTRACT;
            if (modality == agcqVar) {
                return agcqVar;
            }
        }
        return agcq.OPEN;
    }

    private final boolean isParameterName(agfc agfcVar) {
        return affa.f(agfcVar.getFqName(), afyn.parameterName);
    }

    private final String lt() {
        return escape("<");
    }

    private final boolean overridesSomething(agax agaxVar) {
        return !agaxVar.getOverriddenDescriptors().isEmpty();
    }

    private final void renderAbbreviatedTypeComment(StringBuilder sb, aiej aiejVar) {
        if (getTextFormat() == ahsg.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* from: ");
        renderNormalizedTypeAsIs(sb, aiejVar.getAbbreviation());
        sb.append(" */");
        if (getTextFormat() == ahsg.HTML) {
            sb.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAccessorModifiers(agdm agdmVar, StringBuilder sb) {
        renderMemberModifiers(agdmVar, sb);
    }

    private final void renderAdditionalModifiers(agcj agcjVar, StringBuilder sb) {
        boolean z;
        boolean z2 = false;
        if (agcjVar.isOperator()) {
            Collection<? extends agcj> overriddenDescriptors = agcjVar.getOverriddenDescriptors();
            overriddenDescriptors.getClass();
            if (!overriddenDescriptors.isEmpty()) {
                Iterator<T> it = overriddenDescriptors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((agcj) it.next()).isOperator()) {
                        if (getAlwaysRenderModifiers()) {
                            break;
                        }
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        if (agcjVar.isInfix()) {
            Collection<? extends agcj> overriddenDescriptors2 = agcjVar.getOverriddenDescriptors();
            overriddenDescriptors2.getClass();
            if (overriddenDescriptors2.isEmpty()) {
                z2 = true;
            } else {
                Iterator<T> it2 = overriddenDescriptors2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((agcj) it2.next()).isInfix()) {
                        if (getAlwaysRenderModifiers()) {
                            break;
                        }
                    }
                }
            }
        }
        renderModifier(sb, agcjVar.isTailrec(), "tailrec");
        renderSuspendModifier(agcjVar, sb);
        renderModifier(sb, agcjVar.isInline(), "inline");
        renderModifier(sb, z2, "infix");
        renderModifier(sb, z, "operator");
    }

    private final List<String> renderAndSortAnnotationArguments(agfc agfcVar) {
        agaz unsubstitutedPrimaryConstructor;
        List<agel> valueParameters;
        Map<ahnj, ahuh<?>> allValueArguments = agfcVar.getAllValueArguments();
        List list = null;
        agba annotationClass = getRenderDefaultAnnotationArguments() ? ahvz.getAnnotationClass(agfcVar) : null;
        if (annotationClass != null && (unsubstitutedPrimaryConstructor = annotationClass.getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = unsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                if (((agel) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            List arrayList2 = new ArrayList(woy.bp(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((agel) it.next()).getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = afbe.a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!allValueArguments.containsKey((ahnj) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(woy.bp(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(String.valueOf(((ahnj) it2.next()).asString()).concat(" = ..."));
        }
        Set<Map.Entry<ahnj, ahuh<?>>> setEntrySet = allValueArguments.entrySet();
        ArrayList arrayList5 = new ArrayList(woy.bp(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            ahnj ahnjVar = (ahnj) entry.getKey();
            ahuh<?> ahuhVar = (ahuh) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(ahnjVar.asString());
            sb.append(" = ");
            sb.append(!list.contains(ahnjVar) ? renderConstant(ahuhVar) : "...");
            arrayList5.add(sb.toString());
        }
        return woy.cb(woy.bY(arrayList4, arrayList5));
    }

    private final void renderAnnotations(StringBuilder sb, agez agezVar, agfe agfeVar) {
        if (getModifiers().contains(ahrr.ANNOTATIONS)) {
            Set<ahnf> excludedTypeAnnotationClasses = agezVar instanceof aigl ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            afec<agfc, Boolean> annotationFilter = getAnnotationFilter();
            for (agfc agfcVar : agezVar.getAnnotations()) {
                if (!woy.cn(excludedTypeAnnotationClasses, agfcVar.getFqName()) && !isParameterName(agfcVar) && (annotationFilter == null || annotationFilter.invoke(agfcVar).booleanValue())) {
                    sb.append(renderAnnotation(agfcVar, agfeVar));
                    if (getEachAnnotationOnNewLine()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    static /* synthetic */ void renderAnnotations$default(ahrp ahrpVar, StringBuilder sb, agez agezVar, agfe agfeVar, int i, Object obj) {
        if ((i & 2) != 0) {
            agfeVar = null;
        }
        ahrpVar.renderAnnotations(sb, agezVar, agfeVar);
    }

    private final void renderCapturedTypeParametersIfRequired(agbe agbeVar, StringBuilder sb) {
        List<agee> declaredTypeParameters = agbeVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        List<agee> parameters = agbeVar.getTypeConstructor().getParameters();
        parameters.getClass();
        if (getVerbose() && agbeVar.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            renderTypeParameterList(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderClass(agba agbaVar, StringBuilder sb) throws IOException {
        agaz unsubstitutedPrimaryConstructor;
        agbb kind = agbaVar.getKind();
        agbb agbbVar = agbb.ENUM_ENTRY;
        boolean startFromName = getStartFromName();
        boolean z = kind == agbbVar;
        if (!startFromName) {
            List<agdq> contextReceivers = agbaVar.getContextReceivers();
            contextReceivers.getClass();
            renderContextReceivers(contextReceivers, sb);
            renderAnnotations$default(this, sb, agbaVar, null, 2, null);
            if (!z) {
                agcc visibility = agbaVar.getVisibility();
                visibility.getClass();
                renderVisibility(visibility, sb);
            }
            if ((agbaVar.getKind() != agbb.INTERFACE || agbaVar.getModality() != agcq.ABSTRACT) && (!agbaVar.getKind().isSingleton() || agbaVar.getModality() != agcq.FINAL)) {
                agcq modality = agbaVar.getModality();
                modality.getClass();
                renderModality(modality, sb, implicitModalityWithoutExtensions(agbaVar));
            }
            renderMemberModifiers(agbaVar, sb);
            renderModifier(sb, getModifiers().contains(ahrr.INNER) && agbaVar.isInner(), "inner");
            renderModifier(sb, getModifiers().contains(ahrr.DATA) && agbaVar.isData(), "data");
            renderModifier(sb, getModifiers().contains(ahrr.INLINE) && agbaVar.isInline(), "inline");
            renderModifier(sb, getModifiers().contains(ahrr.VALUE) && agbaVar.isValue(), "value");
            renderModifier(sb, getModifiers().contains(ahrr.FUN) && agbaVar.isFun(), "fun");
            renderClassKindPrefix(agbaVar, sb);
        }
        if (ahst.isCompanionObject(agbaVar)) {
            renderCompanionObjectName(agbaVar, sb);
        } else {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            renderName(agbaVar, sb, true);
        }
        if (z) {
            return;
        }
        List<agee> declaredTypeParameters = agbaVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        renderTypeParameters(declaredTypeParameters, sb, false);
        renderCapturedTypeParametersIfRequired(agbaVar, sb);
        if (!agbaVar.getKind().isSingleton() && getClassWithPrimaryConstructor() && (unsubstitutedPrimaryConstructor = agbaVar.getUnsubstitutedPrimaryConstructor()) != null) {
            sb.append(" ");
            renderAnnotations$default(this, sb, unsubstitutedPrimaryConstructor, null, 2, null);
            agcc visibility2 = unsubstitutedPrimaryConstructor.getVisibility();
            visibility2.getClass();
            renderVisibility(visibility2, sb);
            sb.append(renderKeyword("constructor"));
            List<agel> valueParameters = unsubstitutedPrimaryConstructor.getValueParameters();
            valueParameters.getClass();
            renderValueParameters(valueParameters, unsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
        }
        renderSuperTypes(agbaVar, sb);
        renderWhereSuffix(declaredTypeParameters, sb);
    }

    private final void renderClassKindPrefix(agba agbaVar, StringBuilder sb) {
        sb.append(renderKeyword(ahre.Companion.getClassifierKindPrefix(agbaVar)));
    }

    private final void renderCompanionObjectName(agbi agbiVar, StringBuilder sb) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb.append("companion object");
            }
            renderSpaceIfNeeded(sb);
            agbi containingDeclaration = agbiVar.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb.append("of ");
                ahnj name = containingDeclaration.getName();
                name.getClass();
                sb.append(renderName(name, false));
            }
        }
        if (getVerbose() || !affa.f(agbiVar.getName(), ahnm.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            ahnj name2 = agbiVar.getName();
            name2.getClass();
            sb.append(renderName(name2, true));
        }
    }

    private final String renderConstant(ahuh<?> ahuhVar) {
        afec<ahuh<?>, String> propertyConstantRenderer = this.options.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return propertyConstantRenderer.invoke(ahuhVar);
        }
        if (ahuhVar instanceof ahuc) {
            List<? extends ahuh<?>> value = ((ahuc) ahuhVar).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String strRenderConstant = renderConstant((ahuh) it.next());
                if (strRenderConstant != null) {
                    arrayList.add(strRenderConstant);
                }
            }
            return woy.cu(arrayList, ", ", "{", "}", null, 56);
        }
        if (ahuhVar instanceof ahub) {
            return afyh.m(ahre.renderAnnotation$default(this, (agfc) ((ahub) ahuhVar).getValue(), null, 2, null), "@");
        }
        if (!(ahuhVar instanceof ahvc)) {
            return ahuhVar.toString();
        }
        ahvb ahvbVar = (ahvb) ((ahvc) ahuhVar).getValue();
        if (ahvbVar instanceof ahuz) {
            aigl type = ((ahuz) ahvbVar).getType();
            Objects.toString(type);
            return String.valueOf(type).concat("::class");
        }
        if (!(ahvbVar instanceof ahva)) {
            throw new aezs();
        }
        ahva ahvaVar = (ahva) ahvbVar;
        String strAsString = ahvaVar.getClassId().asSingleFqName().asString();
        for (int i = 0; i < ahvaVar.getArrayDimensions(); i++) {
            strAsString = "kotlin.Array<" + strAsString + '>';
        }
        return String.valueOf(strAsString).concat("::class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void renderConstructor(defpackage.agbh r10, java.lang.StringBuilder r11) throws java.io.IOException {
        /*
            r9 = this;
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r9
            r2 = r10
            r1 = r11
            renderAnnotations$default(r0, r1, r2, r3, r4, r5)
            ahry r9 = r0.options
            boolean r9 = r9.getRenderDefaultVisibility()
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L1f
            agba r9 = r2.getConstructedClass()
            agcq r9 = r9.getModality()
            agcq r3 = defpackage.agcq.SEALED
            if (r9 == r3) goto L2e
        L1f:
            agcc r9 = r2.getVisibility()
            r9.getClass()
            boolean r9 = r0.renderVisibility(r9, r1)
            if (r9 == 0) goto L2e
            r9 = r11
            goto L2f
        L2e:
            r9 = r10
        L2f:
            r0.renderMemberKind(r2, r1)
            boolean r3 = r0.getRenderConstructorKeyword()
            if (r3 != 0) goto L43
            boolean r3 = r2.isPrimary()
            if (r3 == 0) goto L43
            if (r9 == 0) goto L41
            goto L43
        L41:
            r9 = r10
            goto L44
        L43:
            r9 = r11
        L44:
            if (r9 == 0) goto L4f
            java.lang.String r3 = "constructor"
            java.lang.String r3 = r0.renderKeyword(r3)
            r1.append(r3)
        L4f:
            agbe r3 = r2.getContainingDeclaration()
            r3.getClass()
            boolean r4 = r0.getSecondaryConstructorsAsPrimary()
            if (r4 == 0) goto L70
            if (r9 == 0) goto L63
            java.lang.String r9 = " "
            r1.append(r9)
        L63:
            r0.renderName(r3, r1, r11)
            java.util.List r9 = r2.getTypeParameters()
            r9.getClass()
            r0.renderTypeParameters(r9, r1, r10)
        L70:
            java.util.List r9 = r2.getValueParameters()
            r9.getClass()
            boolean r10 = r2.hasSynthesizedParameterNames()
            r0.renderValueParameters(r9, r10, r1)
            boolean r9 = r0.getRenderConstructorDelegation()
            if (r9 == 0) goto Le8
            boolean r9 = r2.isPrimary()
            if (r9 != 0) goto Le8
            boolean r9 = r3 instanceof defpackage.agba
            if (r9 == 0) goto Le8
            agba r3 = (defpackage.agba) r3
            agaz r9 = r3.getUnsubstitutedPrimaryConstructor()
            if (r9 == 0) goto Le8
            java.util.List r9 = r9.getValueParameters()
            r9.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        La6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc3
            java.lang.Object r10 = r9.next()
            r11 = r10
            agel r11 = (defpackage.agel) r11
            boolean r4 = r11.declaresDefaultValue()
            if (r4 != 0) goto La6
            aigl r11 = r11.getVarargElementType()
            if (r11 != 0) goto La6
            r3.add(r10)
            goto La6
        Lc3:
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto Le8
            java.lang.String r9 = " : "
            r1.append(r9)
            java.lang.String r9 = "this"
            java.lang.String r9 = r0.renderKeyword(r9)
            r1.append(r9)
            ahrk r7 = defpackage.ahrk.INSTANCE
            r8 = 24
            java.lang.String r4 = ", "
            java.lang.String r5 = "("
            java.lang.String r6 = ")"
            java.lang.String r9 = defpackage.woy.cu(r3, r4, r5, r6, r7, r8)
            r1.append(r9)
        Le8:
            boolean r9 = r0.getSecondaryConstructorsAsPrimary()
            if (r9 == 0) goto Lf8
            java.util.List r9 = r2.getTypeParameters()
            r9.getClass()
            r0.renderWhereSuffix(r9, r1)
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrp.renderConstructor(agbh, java.lang.StringBuilder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderConstructor$lambda$1(agel agelVar) {
        return "";
    }

    private final void renderContextReceivers(List<? extends agdq> list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            aigl type = ((agdq) it.next()).getType();
            type.getClass();
            sb.append(renderForReceiver(type, true));
            if (i == woy.bh(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    private final void renderDefaultType(StringBuilder sb, aigl aiglVar) {
        renderAnnotations$default(this, sb, aiglVar, null, 2, null);
        aifo aifoVar = aiglVar instanceof aifo ? (aifo) aiglVar : null;
        aigw original = aifoVar != null ? aifoVar.getOriginal() : null;
        if (aigr.isError(aiglVar)) {
            if (aimr.isUnresolvedType(aiglVar) && getPresentableUnresolvedTypes()) {
                sb.append(renderError(ailm.INSTANCE.unresolvedTypeAsItIs(aiglVar)));
            } else {
                if (!(aiglVar instanceof ailj) || getInformativeErrorType()) {
                    sb.append(aiglVar.getConstructor().toString());
                } else {
                    sb.append(((ailj) aiglVar).getDebugMessage());
                }
                sb.append(renderTypeArguments(aiglVar.getArguments()));
            }
        } else if (aiglVar instanceof aihg) {
            sb.append(((aihg) aiglVar).getOriginalTypeVariable().toString());
        } else if (original instanceof aihg) {
            sb.append(((aihg) original).getOriginalTypeVariable().toString());
        } else {
            renderTypeConstructorAndArguments$default(this, sb, aiglVar, null, 2, null);
        }
        if (aiglVar.isMarkedNullable()) {
            sb.append("?");
        }
        if (aiha.isDefinitelyNotNullType(aiglVar)) {
            sb.append(" & Any");
        }
    }

    private final String renderError(String str) {
        ahsg textFormat = getTextFormat();
        ahsg ahsgVar = ahsg.PLAIN;
        ahsc ahscVar = ahsc.ALL;
        int iOrdinal = textFormat.ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return a.bq(str, "<font color=red><b>", "</b></font>");
        }
        throw new aezs();
    }

    private final void renderExpandedTypeComment(StringBuilder sb, aiej aiejVar) {
        if (getTextFormat() == ahsg.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        renderNormalizedTypeAsIs(sb, aiejVar.getExpandedType());
        sb.append(" */");
        if (getTextFormat() == ahsg.HTML) {
            sb.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderFlexibleType$lambda$0(ahrp ahrpVar, afye afyeVar) {
        ahqp classifierNamePolicy = ahrpVar.getClassifierNamePolicy();
        agba collection = afyeVar.getCollection();
        collection.getClass();
        String strRenderClassifier = classifierNamePolicy.renderClassifier(collection, ahrpVar);
        return afyh.r(strRenderClassifier, "Collection", strRenderClassifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderFlexibleType$lambda$1(ahrp ahrpVar, afye afyeVar) {
        ahqp classifierNamePolicy = ahrpVar.getClassifierNamePolicy();
        agba array = afyeVar.getArray();
        array.getClass();
        String strRenderClassifier = classifierNamePolicy.renderClassifier(array, ahrpVar);
        return afyh.r(strRenderClassifier, "Array", strRenderClassifier);
    }

    private final String renderForReceiver(aigl aiglVar, boolean z) {
        String strRenderType = renderType(aiglVar);
        if ((!shouldRenderAsPrettyFunctionType(aiglVar) || aijc.isNullableType(aiglVar)) && !(aiglVar instanceof aifo) && (!z || aiglVar.getAnnotations().isEmpty())) {
            return strRenderType;
        }
        return "(" + strRenderType + ')';
    }

    static /* synthetic */ String renderForReceiver$default(ahrp ahrpVar, aigl aiglVar, boolean z, int i, Object obj) {
        return ahrpVar.renderForReceiver(aiglVar, 1 == ((z ? 1 : 0) & ((i & 1) ^ 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFunction(agcj agcjVar, StringBuilder sb) throws IOException {
        ahrp ahrpVar;
        agcj agcjVar2;
        StringBuilder sb2;
        if (getStartFromName()) {
            ahrpVar = this;
            agcjVar2 = agcjVar;
            sb2 = sb;
        } else {
            if (getStartFromDeclarationKeyword()) {
                ahrpVar = this;
                agcjVar2 = agcjVar;
                sb2 = sb;
            } else {
                List<agdq> contextReceiverParameters = agcjVar.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                renderContextReceivers(contextReceiverParameters, sb);
                ahrpVar = this;
                agcjVar2 = agcjVar;
                sb2 = sb;
                renderAnnotations$default(ahrpVar, sb2, agcjVar2, null, 2, null);
                agcc visibility = agcjVar2.getVisibility();
                visibility.getClass();
                ahrpVar.renderVisibility(visibility, sb2);
                ahrpVar.renderModalityForCallable(agcjVar2, sb2);
                if (ahrpVar.getIncludeAdditionalModifiers()) {
                    ahrpVar.renderMemberModifiers(agcjVar2, sb2);
                }
                ahrpVar.renderOverride(agcjVar2, sb2);
                if (ahrpVar.getIncludeAdditionalModifiers()) {
                    ahrpVar.renderAdditionalModifiers(agcjVar2, sb2);
                } else {
                    ahrpVar.renderSuspendModifier(agcjVar2, sb2);
                }
                ahrpVar.renderMemberKind(agcjVar2, sb2);
                if (ahrpVar.getVerbose()) {
                    if (agcjVar2.isHiddenToOvercomeSignatureClash()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (agcjVar2.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(ahrpVar.renderKeyword("fun"));
            sb2.append(" ");
            List<agee> typeParameters = agcjVar2.getTypeParameters();
            typeParameters.getClass();
            ahrpVar.renderTypeParameters(typeParameters, sb2, true);
            ahrpVar.renderReceiver(agcjVar2, sb2);
        }
        ahrpVar.renderName(agcjVar2, sb2, true);
        List<agel> valueParameters = agcjVar2.getValueParameters();
        valueParameters.getClass();
        ahrpVar.renderValueParameters(valueParameters, agcjVar2.hasSynthesizedParameterNames(), sb2);
        ahrpVar.renderReceiverAfterName(agcjVar2, sb2);
        aigl returnType = agcjVar2.getReturnType();
        if (!ahrpVar.getWithoutReturnType() && (ahrpVar.getUnitReturnType() || returnType == null || !afye.isUnit(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : ahrpVar.renderType(returnType));
        }
        List<agee> typeParameters2 = agcjVar2.getTypeParameters();
        typeParameters2.getClass();
        ahrpVar.renderWhereSuffix(typeParameters2, sb2);
    }

    private final void renderFunctionType(StringBuilder sb, aigl aiglVar) {
        ahnj ahnjVarExtractParameterNameFromFunctionTypeArgument;
        int length = sb.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb, aiglVar, null, 2, null);
        int length2 = sb.length();
        aigl receiverTypeFromFunctionType = afxy.getReceiverTypeFromFunctionType(aiglVar);
        List<aigl> contextReceiverTypesFromFunctionType = afxy.getContextReceiverTypesFromFunctionType(aiglVar);
        boolean zIsSuspendFunctionType = afxy.isSuspendFunctionType(aiglVar);
        boolean zIsMarkedNullable = aiglVar.isMarkedNullable();
        boolean z = length2 != length;
        boolean z2 = zIsMarkedNullable || (z && receiverTypeFromFunctionType != null);
        if (z2) {
            if (zIsSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    afuq.a(afyh.x(sb));
                    if (sb.charAt(afyh.i(sb) - 1) != ')') {
                        sb.insert(afyh.i(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        renderModifier(sb, zIsSuspendFunctionType, "suspend");
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb.append("context(");
            Iterator<aigl> it = contextReceiverTypesFromFunctionType.subList(0, woy.bh(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                renderNormalizedType(sb, it.next());
                sb.append(", ");
            }
            renderNormalizedType(sb, (aigl) woy.bK(contextReceiverTypesFromFunctionType));
            sb.append(") ");
        }
        if (receiverTypeFromFunctionType != null) {
            boolean z3 = (shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || hasModifiersOrAnnotations(receiverTypeFromFunctionType) || (receiverTypeFromFunctionType instanceof aifo);
            if (z3) {
                sb.append("(");
            }
            renderNormalizedType(sb, receiverTypeFromFunctionType);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!afxy.isBuiltinExtensionFunctionalType(aiglVar) || aiglVar.getArguments().size() > 1) {
            int i = 0;
            for (aiin aiinVar : afxy.getValueParameterTypesFromFunctionType(aiglVar)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    aigl type = aiinVar.getType();
                    type.getClass();
                    ahnjVarExtractParameterNameFromFunctionTypeArgument = afxy.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    ahnjVarExtractParameterNameFromFunctionTypeArgument = null;
                }
                if (ahnjVarExtractParameterNameFromFunctionTypeArgument != null) {
                    sb.append(renderName(ahnjVarExtractParameterNameFromFunctionTypeArgument, false));
                    sb.append(": ");
                }
                sb.append(renderTypeProjection(aiinVar));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(arrow());
        sb.append(" ");
        renderNormalizedType(sb, afxy.getReturnTypeFromFunctionType(aiglVar));
        if (z2) {
            sb.append(")");
        }
        if (zIsMarkedNullable) {
            sb.append("?");
        }
    }

    private final void renderInitializer(agem agemVar, StringBuilder sb) {
        ahuh<?> compileTimeInitializer;
        String strRenderConstant;
        if (!getIncludePropertyConstant() || (compileTimeInitializer = agemVar.getCompileTimeInitializer()) == null || (strRenderConstant = renderConstant(compileTimeInitializer)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(escape(strRenderConstant));
    }

    private final String renderKeyword(String str) {
        ahsg textFormat = getTextFormat();
        ahsg ahsgVar = ahsg.PLAIN;
        ahsc ahscVar = ahsc.ALL;
        int iOrdinal = textFormat.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            if (!getBoldOnlyForNamesInHtml()) {
                return a.bq(str, "<b>", "</b>");
            }
        }
        return str;
    }

    private final void renderMemberKind(agax agaxVar, StringBuilder sb) {
        if (getModifiers().contains(ahrr.MEMBER_KIND) && getVerbose() && agaxVar.getKind() != agaw.DECLARATION) {
            sb.append("/*");
            sb.append(aiou.toLowerCaseAsciiOnly(agaxVar.getKind().name()));
            sb.append("*/ ");
        }
    }

    private final void renderMemberModifiers(agco agcoVar, StringBuilder sb) {
        renderModifier(sb, agcoVar.isExternal(), "external");
        renderModifier(sb, getModifiers().contains(ahrr.EXPECT) && agcoVar.isExpect(), "expect");
        renderModifier(sb, getModifiers().contains(ahrr.ACTUAL) && agcoVar.isActual(), "actual");
    }

    private final void renderModality(agcq agcqVar, StringBuilder sb, agcq agcqVar2) {
        if (getRenderDefaultModality() || agcqVar != agcqVar2) {
            renderModifier(sb, getModifiers().contains(ahrr.MODALITY), aiou.toLowerCaseAsciiOnly(agcqVar.name()));
        }
    }

    private final void renderModalityForCallable(agax agaxVar, StringBuilder sb) {
        if (ahst.isTopLevelDeclaration(agaxVar) && agaxVar.getModality() == agcq.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == ahsb.RENDER_OVERRIDE && agaxVar.getModality() == agcq.OPEN && overridesSomething(agaxVar)) {
            return;
        }
        agcq modality = agaxVar.getModality();
        modality.getClass();
        renderModality(modality, sb, implicitModalityWithoutExtensions(agaxVar));
    }

    private final void renderModifier(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(renderKeyword(str));
            sb.append(" ");
        }
    }

    private final void renderNormalizedType(StringBuilder sb, aigl aiglVar) {
        aijf aijfVarUnwrap = aiglVar.unwrap();
        aiej aiejVar = aijfVarUnwrap instanceof aiej ? (aiej) aijfVarUnwrap : null;
        if (aiejVar == null) {
            renderNormalizedTypeAsIs(sb, aiglVar);
            return;
        }
        if (getRenderTypeExpansions()) {
            renderNormalizedTypeAsIs(sb, aiejVar.getExpandedType());
            if (getRenderAbbreviatedTypeComments()) {
                renderAbbreviatedTypeComment(sb, aiejVar);
                return;
            }
            return;
        }
        renderNormalizedTypeAsIs(sb, aiejVar.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            renderExpandedTypeComment(sb, aiejVar);
        }
    }

    private final void renderNormalizedTypeAsIs(StringBuilder sb, aigl aiglVar) {
        if ((aiglVar instanceof aijh) && getDebugMode() && !((aijh) aiglVar).isComputed()) {
            sb.append("<Not computed yet>");
            return;
        }
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiga) {
            sb.append(((aiga) aijfVarUnwrap).render(this, this));
        } else {
            if (!(aijfVarUnwrap instanceof aigw)) {
                throw new aezs();
            }
            renderSimpleType(sb, (aigw) aijfVarUnwrap);
        }
    }

    private final void renderOverride(agax agaxVar, StringBuilder sb) {
        if (getModifiers().contains(ahrr.OVERRIDE) && overridesSomething(agaxVar) && getOverrideRenderingPolicy() != ahsb.RENDER_OPEN) {
            renderModifier(sb, true, "override");
            if (getVerbose()) {
                sb.append("/*");
                sb.append(agaxVar.getOverriddenDescriptors().size());
                sb.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageFragment(agdc agdcVar, StringBuilder sb) {
        renderPackageHeader(agdcVar.getFqName(), "package-fragment", sb);
        if (getDebugMode()) {
            sb.append(" in ");
            renderName(agdcVar.getContainingDeclaration(), sb, false);
        }
    }

    private final void renderPackageHeader(ahnf ahnfVar, String str, StringBuilder sb) {
        sb.append(renderKeyword(str));
        String strRenderFqName = renderFqName(ahnfVar.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb.append(" ");
            sb.append(strRenderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageView(agdj agdjVar, StringBuilder sb) {
        renderPackageHeader(agdjVar.getFqName(), "package", sb);
        if (getDebugMode()) {
            sb.append(" in context of ");
            renderName(agdjVar.getModule(), sb, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void renderPossiblyInnerType(java.lang.StringBuilder r3, defpackage.agdl r4) {
        /*
            r2 = this;
            agdl r0 = r4.getOuterType()
            if (r0 == 0) goto L23
            r2.renderPossiblyInnerType(r3, r0)
            r0 = 46
            r3.append(r0)
            agbe r0 = r4.getClassifierDescriptor()
            ahnj r0 = r0.getName()
            r0.getClass()
            r1 = 0
            java.lang.String r0 = r2.renderName(r0, r1)
            r3.append(r0)
            if (r3 != 0) goto L35
        L23:
            agbe r0 = r4.getClassifierDescriptor()
            aiid r0 = r0.getTypeConstructor()
            r0.getClass()
            java.lang.String r0 = r2.renderTypeConstructor(r0)
            r3.append(r0)
        L35:
            java.util.List r4 = r4.getArguments()
            java.lang.String r2 = r2.renderTypeArguments(r4)
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrp.renderPossiblyInnerType(java.lang.StringBuilder, agdl):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderProperty(agdn agdnVar, StringBuilder sb) throws IOException {
        ahrp ahrpVar;
        agdn agdnVar2;
        StringBuilder sb2;
        if (getStartFromName()) {
            ahrpVar = this;
            agdnVar2 = agdnVar;
            sb2 = sb;
        } else {
            if (!getStartFromDeclarationKeyword()) {
                List<agdq> contextReceiverParameters = agdnVar.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                renderContextReceivers(contextReceiverParameters, sb);
                renderPropertyAnnotations(agdnVar, sb);
                agcc visibility = agdnVar.getVisibility();
                visibility.getClass();
                renderVisibility(visibility, sb);
                boolean z = false;
                renderModifier(sb, getModifiers().contains(ahrr.CONST) && agdnVar.isConst(), "const");
                renderMemberModifiers(agdnVar, sb);
                renderModalityForCallable(agdnVar, sb);
                renderOverride(agdnVar, sb);
                if (getModifiers().contains(ahrr.LATEINIT) && agdnVar.isLateInit()) {
                    z = true;
                }
                renderModifier(sb, z, "lateinit");
                renderMemberKind(agdnVar, sb);
            }
            ahrpVar = this;
            agdnVar2 = agdnVar;
            sb2 = sb;
            renderValVarPrefix$default(ahrpVar, agdnVar2, sb2, false, 4, null);
            List<agee> typeParameters = agdnVar2.getTypeParameters();
            typeParameters.getClass();
            ahrpVar.renderTypeParameters(typeParameters, sb2, true);
            ahrpVar.renderReceiver(agdnVar2, sb2);
        }
        ahrpVar.renderName(agdnVar2, sb2, true);
        sb2.append(": ");
        aigl type = agdnVar2.getType();
        type.getClass();
        sb2.append(ahrpVar.renderType(type));
        ahrpVar.renderReceiverAfterName(agdnVar2, sb2);
        ahrpVar.renderInitializer(agdnVar2, sb2);
        List<agee> typeParameters2 = agdnVar2.getTypeParameters();
        typeParameters2.getClass();
        ahrpVar.renderWhereSuffix(typeParameters2, sb2);
    }

    private final void renderPropertyAnnotations(agdn agdnVar, StringBuilder sb) {
        if (getModifiers().contains(ahrr.ANNOTATIONS)) {
            renderAnnotations$default(this, sb, agdnVar, null, 2, null);
            agce backingField = agdnVar.getBackingField();
            if (backingField != null) {
                renderAnnotations(sb, backingField, agfe.FIELD);
            }
            agce delegateField = agdnVar.getDelegateField();
            if (delegateField != null) {
                renderAnnotations(sb, delegateField, agfe.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == ahsd.NONE) {
                agdo getter = agdnVar.getGetter();
                if (getter != null) {
                    renderAnnotations(sb, getter, agfe.PROPERTY_GETTER);
                }
                agdp setter = agdnVar.getSetter();
                if (setter != null) {
                    renderAnnotations(sb, setter, agfe.PROPERTY_SETTER);
                    List<agel> valueParameters = setter.getValueParameters();
                    valueParameters.getClass();
                    agel agelVar = (agel) woy.bN(valueParameters);
                    agelVar.getClass();
                    renderAnnotations(sb, agelVar, agfe.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void renderReceiver(agav agavVar, StringBuilder sb) {
        agdq extensionReceiverParameter = agavVar.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb, extensionReceiverParameter, agfe.RECEIVER);
            aigl type = extensionReceiverParameter.getType();
            type.getClass();
            sb.append(renderForReceiver$default(this, type, false, 1, null));
            sb.append(".");
        }
    }

    private final void renderReceiverAfterName(agav agavVar, StringBuilder sb) {
        agdq extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = agavVar.getExtensionReceiverParameter()) != null) {
            sb.append(" on ");
            aigl type = extensionReceiverParameter.getType();
            type.getClass();
            sb.append(renderType(type));
        }
    }

    private final void renderSimpleType(StringBuilder sb, aigw aigwVar) {
        if (affa.f(aigwVar, aijc.CANNOT_INFER_FUNCTION_PARAM_TYPE) || aijc.isDontCarePlaceholder(aigwVar)) {
            sb.append("???");
            return;
        }
        if (ailm.isUninferredTypeVariable(aigwVar)) {
            if (!getUninferredTypeParameterAsName()) {
                sb.append("???");
                return;
            }
            aiid constructor = aigwVar.getConstructor();
            constructor.getClass();
            sb.append(renderError(((ailk) constructor).getParam(0)));
            return;
        }
        if (aigr.isError(aigwVar)) {
            renderDefaultType(sb, aigwVar);
        } else if (shouldRenderAsPrettyFunctionType(aigwVar)) {
            renderFunctionType(sb, aigwVar);
        } else {
            renderDefaultType(sb, aigwVar);
        }
    }

    private final void renderSpaceIfNeeded(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final void renderSuperTypes(agba agbaVar, StringBuilder sb) throws IOException {
        if (getWithoutSuperTypes() || afye.isNothing(agbaVar.getDefaultType())) {
            return;
        }
        Collection<aigl> collectionMo89getSupertypes = agbaVar.getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        if (collectionMo89getSupertypes.isEmpty()) {
            return;
        }
        if (collectionMo89getSupertypes.size() == 1 && afye.isAnyOrNullableAny(collectionMo89getSupertypes.iterator().next())) {
            return;
        }
        renderSpaceIfNeeded(sb);
        sb.append(": ");
        woy.ct(collectionMo89getSupertypes, sb, ", ", "", "", -1, "...", new ahrl(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderSuperTypes$lambda$0(ahrp ahrpVar, aigl aiglVar) {
        aiglVar.getClass();
        return ahrpVar.renderType(aiglVar);
    }

    private final void renderSuspendModifier(agcj agcjVar, StringBuilder sb) {
        renderModifier(sb, agcjVar.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeAlias(aged agedVar, StringBuilder sb) {
        renderAnnotations$default(this, sb, agedVar, null, 2, null);
        agcc visibility = agedVar.getVisibility();
        visibility.getClass();
        renderVisibility(visibility, sb);
        renderMemberModifiers(agedVar, sb);
        sb.append(renderKeyword("typealias"));
        sb.append(" ");
        renderName(agedVar, sb, true);
        List<agee> declaredTypeParameters = agedVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        renderTypeParameters(declaredTypeParameters, sb, false);
        renderCapturedTypeParametersIfRequired(agedVar, sb);
        sb.append(" = ");
        sb.append(renderType(agedVar.getUnderlyingType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object renderTypeConstructor$lambda$0(aigl aiglVar) {
        aiglVar.getClass();
        return aiglVar instanceof aihg ? ((aihg) aiglVar).getOriginalTypeVariable() : aiglVar;
    }

    private final void renderTypeConstructorAndArguments(StringBuilder sb, aigl aiglVar, aiid aiidVar) {
        agdl agdlVarBuildPossiblyInnerType = agei.buildPossiblyInnerType(aiglVar);
        if (agdlVarBuildPossiblyInnerType != null) {
            renderPossiblyInnerType(sb, agdlVarBuildPossiblyInnerType);
        } else {
            sb.append(renderTypeConstructor(aiidVar));
            sb.append(renderTypeArguments(aiglVar.getArguments()));
        }
    }

    static /* synthetic */ void renderTypeConstructorAndArguments$default(ahrp ahrpVar, StringBuilder sb, aigl aiglVar, aiid aiidVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aiidVar = aiglVar.getConstructor();
        }
        ahrpVar.renderTypeConstructorAndArguments(sb, aiglVar, aiidVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeParameter(agee ageeVar, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(lt());
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(ageeVar.getIndex());
            sb.append("*/ ");
        }
        renderModifier(sb, ageeVar.isReified(), "reified");
        String label = ageeVar.getVariance().getLabel();
        boolean z2 = true;
        renderModifier(sb, label.length() > 0, label);
        renderAnnotations$default(this, sb, ageeVar, null, 2, null);
        renderName(ageeVar, sb, z);
        int size = ageeVar.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            aigl next = ageeVar.getUpperBounds().iterator().next();
            if (!afye.isDefaultBound(next)) {
                sb.append(" : ");
                next.getClass();
                sb.append(renderType(next));
            }
        } else if (z) {
            for (aigl aiglVar : ageeVar.getUpperBounds()) {
                if (!afye.isDefaultBound(aiglVar)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    aiglVar.getClass();
                    sb.append(renderType(aiglVar));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(gt());
        }
    }

    private final void renderTypeParameterList(StringBuilder sb, List<? extends agee> list) {
        Iterator<? extends agee> it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final void renderTypeParameters(List<? extends agee> list, StringBuilder sb, boolean z) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb.append(lt());
        renderTypeParameterList(sb, list);
        sb.append(gt());
        if (z) {
            sb.append(" ");
        }
    }

    private final void renderValVarPrefix(agem agemVar, StringBuilder sb, boolean z) {
        if (z || !(agemVar instanceof agel)) {
            sb.append(renderKeyword(true != agemVar.isVar() ? "val" : "var"));
            sb.append(" ");
        }
    }

    static /* synthetic */ void renderValVarPrefix$default(ahrp ahrpVar, agem agemVar, StringBuilder sb, boolean z, int i, Object obj) {
        ahrpVar.renderValVarPrefix(agemVar, sb, z & ((i & 4) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void renderValueParameter(defpackage.agel r7, boolean r8, java.lang.StringBuilder r9, boolean r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r6.renderKeyword(r2)
            r9.append(r2)
            java.lang.String r2 = " "
            r9.append(r2)
        L10:
            boolean r2 = r6.getVerbose()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r9.append(r2)
            int r2 = r7.getIndex()
            r9.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r9.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r1 = r9
            renderAnnotations$default(r0, r1, r2, r3, r4, r5)
            boolean r2 = r7.isCrossinline()
            java.lang.String r3 = "crossinline"
            r6.renderModifier(r9, r2, r3)
            boolean r2 = r7.isNoinline()
            java.lang.String r3 = "noinline"
            r6.renderModifier(r9, r2, r3)
            boolean r2 = r6.getRenderPrimaryConstructorParametersAsProperties()
            r3 = 0
            if (r2 == 0) goto L60
            agav r2 = r7.getContainingDeclaration()
            boolean r4 = r2 instanceof defpackage.agaz
            if (r4 == 0) goto L54
            agaz r2 = (defpackage.agaz) r2
            goto L55
        L54:
            r2 = 0
        L55:
            if (r2 == 0) goto L60
            boolean r2 = r2.isPrimary()
            r4 = 1
            if (r2 != r4) goto L60
            r5 = r4
            goto L61
        L60:
            r5 = r3
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r6.getActualPropertiesInPrimaryConstructor()
            java.lang.String r3 = "actual"
            r6.renderModifier(r9, r2, r3)
        L6c:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.renderVariable(r1, r2, r3, r4, r5)
            afec r0 = r6.getDefaultParameterValueRenderer()
            if (r0 == 0) goto La5
            boolean r0 = r6.getDebugMode()
            if (r0 == 0) goto L85
            boolean r0 = r7.declaresDefaultValue()
            goto L89
        L85:
            boolean r0 = defpackage.ahvz.declaresOrInheritsDefaultValue(r7)
        L89:
            if (r0 == 0) goto La5
            afec r0 = r6.getDefaultParameterValueRenderer()
            r0.getClass()
            java.lang.Object r0 = r0.invoke(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " = "
            java.lang.String r0 = r2.concat(r0)
            r9.append(r0)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrp.renderValueParameter(agel, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final void renderValueParameters(Collection<? extends agel> collection, boolean z, StringBuilder sb) {
        boolean zShouldRenderParameterNames = shouldRenderParameterNames(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        int i = 0;
        for (agel agelVar : collection) {
            getValueParametersHandler().appendBeforeValueParameter(agelVar, i, size, sb);
            renderValueParameter(agelVar, zShouldRenderParameterNames, sb, false);
            getValueParametersHandler().appendAfterValueParameter(agelVar, i, size, sb);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    private final void renderVariable(agem agemVar, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        aigl type = agemVar.getType();
        type.getClass();
        agel agelVar = agemVar instanceof agel ? (agel) agemVar : null;
        aigl varargElementType = agelVar != null ? agelVar.getVarargElementType() : null;
        aigl aiglVar = varargElementType == null ? type : varargElementType;
        renderModifier(sb, varargElementType != null, "vararg");
        if (z3 || (z2 && !getStartFromName())) {
            renderValVarPrefix(agemVar, sb, z3);
        }
        if (z) {
            renderName(agemVar, sb, z2);
            sb.append(": ");
        }
        sb.append(renderType(aiglVar));
        renderInitializer(agemVar, sb);
        if (!getVerbose() || varargElementType == null) {
            return;
        }
        sb.append(" /*");
        sb.append(renderType(type));
        sb.append("*/");
    }

    private final boolean renderVisibility(agcc agccVar, StringBuilder sb) {
        if (!getModifiers().contains(ahrr.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            agccVar = agccVar.normalize();
        }
        if (!getRenderDefaultVisibility() && affa.f(agccVar, agcb.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(renderKeyword(agccVar.getInternalDisplayName()));
        sb.append(" ");
        return true;
    }

    private final void renderWhereSuffix(List<? extends agee> list, StringBuilder sb) throws IOException {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (agee ageeVar : list) {
            List<aigl> upperBounds = ageeVar.getUpperBounds();
            upperBounds.getClass();
            for (aigl aiglVar : woy.bR(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                ahnj name = ageeVar.getName();
                name.getClass();
                sb2.append(renderName(name, false));
                sb2.append(" : ");
                aiglVar.getClass();
                sb2.append(renderType(aiglVar));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(renderKeyword("where"));
        sb.append(" ");
        woy.ct(arrayList, sb, ", ", "", "", -1, "...", null);
    }

    private final boolean shouldRenderAsPrettyFunctionType(aigl aiglVar) {
        if (!afxy.isBuiltinFunctionalType(aiglVar)) {
            return false;
        }
        List<aiin> arguments = aiglVar.getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            return true;
        }
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            if (((aiin) it.next()).isStarProjection()) {
                return false;
            }
        }
        return true;
    }

    private final boolean shouldRenderParameterNames(boolean z) {
        ahsc parameterNameRenderingPolicy = getParameterNameRenderingPolicy();
        ahsg ahsgVar = ahsg.PLAIN;
        ahsc ahscVar = ahsc.ALL;
        int iOrdinal = parameterNameRenderingPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
                throw new aezs();
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // defpackage.ahrt
    public ahql getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public afec<agfc, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    public ahqp getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // defpackage.ahrt
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    public afec<agel, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // defpackage.ahrt
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    public Set<ahnf> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // defpackage.ahrt
    public Set<ahnf> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.options.getInformativeErrorType();
    }

    public Set<ahrr> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    public final ahry getOptions() {
        return this.options;
    }

    public ahsb getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    public ahsc getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    public ahsd getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return this.options.getRenderAbbreviatedTypeComments();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    public ahsg getTextFormat() {
        return this.options.getTextFormat();
    }

    public afec<aigl, aigl> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    public ahrd getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // defpackage.ahre
    public String render(agbi agbiVar) {
        agbiVar.getClass();
        StringBuilder sb = new StringBuilder();
        agbiVar.accept(new ahrn(this), sb);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb, agbiVar);
        }
        return sb.toString();
    }

    @Override // defpackage.ahre
    public String renderAnnotation(agfc agfcVar, agfe agfeVar) throws IOException {
        agfcVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (agfeVar != null) {
            sb.append(agfeVar.getRenderName() + ':');
        }
        aigl type = agfcVar.getType();
        sb.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> listRenderAndSortAnnotationArguments = renderAndSortAnnotationArguments(agfcVar);
            if (getIncludeEmptyAnnotationArguments() || !listRenderAndSortAnnotationArguments.isEmpty()) {
                woy.ct(listRenderAndSortAnnotationArguments, sb, ", ", "(", ")", -1, "...", null);
            }
        }
        if (getVerbose() && (aigr.isError(type) || (type.getConstructor().getDeclarationDescriptor() instanceof agda))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public String renderClassifierName(agbd agbdVar) {
        agbdVar.getClass();
        return ailm.isError(agbdVar) ? agbdVar.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(agbdVar, this);
    }

    @Override // defpackage.ahre
    public String renderFlexibleType(String str, String str2, afye afyeVar) {
        str.getClass();
        str2.getClass();
        afyeVar.getClass();
        if (ahsi.typeStringsDifferOnlyInNullability(str, str2)) {
            if (afyh.g(str2, "(", false)) {
                return "(" + str + ")!";
            }
            return str + '!';
        }
        String strRenderFlexibleMutabilityOrArrayElementVarianceType = ahsi.renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, new ahrg(this, afyeVar), new ahrh(this, afyeVar), new ahro(this));
        if (strRenderFlexibleMutabilityOrArrayElementVarianceType != null) {
            return strRenderFlexibleMutabilityOrArrayElementVarianceType;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @Override // defpackage.ahre
    public String renderFqName(ahnh ahnhVar) {
        ahnhVar.getClass();
        return renderFqName(ahnhVar.pathSegments());
    }

    public String renderMessage(String str) {
        str.getClass();
        ahsg textFormat = getTextFormat();
        ahsg ahsgVar = ahsg.PLAIN;
        ahsc ahscVar = ahsc.ALL;
        int iOrdinal = textFormat.ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return a.bq(str, "<i>", "</i>");
        }
        throw new aezs();
    }

    @Override // defpackage.ahre
    public String renderName(ahnj ahnjVar, boolean z) {
        ahnjVar.getClass();
        String strEscape = escape(ahnk.render$default(ahnjVar, false, 1, null));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == ahsg.HTML && z) ? a.bq(strEscape, "<b>", "</b>") : strEscape;
    }

    @Override // defpackage.ahre
    public String renderType(aigl aiglVar) {
        aiglVar.getClass();
        StringBuilder sb = new StringBuilder();
        renderNormalizedType(sb, getTypeNormalizer().invoke(aiglVar));
        return sb.toString();
    }

    public String renderTypeArguments(List<? extends aiin> list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lt());
        appendTypeProjections(sb, list);
        sb.append(gt());
        return sb.toString();
    }

    public String renderTypeConstructor(aiid aiidVar) {
        aiidVar.getClass();
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        if ((declarationDescriptor instanceof agee) || (declarationDescriptor instanceof agba) || (declarationDescriptor instanceof aged)) {
            return renderClassifierName(declarationDescriptor);
        }
        if (declarationDescriptor == null) {
            return aiidVar instanceof aigk ? ((aigk) aiidVar).makeDebugNameForIntersectionType(ahri.INSTANCE) : aiidVar.toString();
        }
        Class<?> cls = declarationDescriptor.getClass();
        Objects.toString(cls);
        throw new IllegalStateException("Unexpected classifier: ".concat(String.valueOf(cls)));
    }

    @Override // defpackage.ahre
    public String renderTypeProjection(aiin aiinVar) throws IOException {
        aiinVar.getClass();
        StringBuilder sb = new StringBuilder();
        appendTypeProjections(sb, woy.bg(aiinVar));
        return sb.toString();
    }

    @Override // defpackage.ahrt
    public void setAnnotationArgumentsRenderingPolicy(ahql ahqlVar) {
        ahqlVar.getClass();
        this.options.setAnnotationArgumentsRenderingPolicy(ahqlVar);
    }

    @Override // defpackage.ahrt
    public void setClassifierNamePolicy(ahqp ahqpVar) {
        ahqpVar.getClass();
        this.options.setClassifierNamePolicy(ahqpVar);
    }

    @Override // defpackage.ahrt
    public void setDebugMode(boolean z) {
        this.options.setDebugMode(z);
    }

    @Override // defpackage.ahrt
    public void setExcludedTypeAnnotationClasses(Set<ahnf> set) {
        set.getClass();
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // defpackage.ahrt
    public void setModifiers(Set<? extends ahrr> set) {
        set.getClass();
        this.options.setModifiers(set);
    }

    @Override // defpackage.ahrt
    public void setParameterNameRenderingPolicy(ahsc ahscVar) {
        ahscVar.getClass();
        this.options.setParameterNameRenderingPolicy(ahscVar);
    }

    @Override // defpackage.ahrt
    public void setReceiverAfterName(boolean z) {
        this.options.setReceiverAfterName(z);
    }

    @Override // defpackage.ahrt
    public void setRenderCompanionObjectName(boolean z) {
        this.options.setRenderCompanionObjectName(z);
    }

    @Override // defpackage.ahrt
    public void setStartFromName(boolean z) {
        this.options.setStartFromName(z);
    }

    @Override // defpackage.ahrt
    public void setTextFormat(ahsg ahsgVar) {
        ahsgVar.getClass();
        this.options.setTextFormat(ahsgVar);
    }

    @Override // defpackage.ahrt
    public void setVerbose(boolean z) {
        this.options.setVerbose(z);
    }

    @Override // defpackage.ahrt
    public void setWithDefinedIn(boolean z) {
        this.options.setWithDefinedIn(z);
    }

    @Override // defpackage.ahrt
    public void setWithoutSuperTypes(boolean z) {
        this.options.setWithoutSuperTypes(z);
    }

    @Override // defpackage.ahrt
    public void setWithoutTypeParameters(boolean z) {
        this.options.setWithoutTypeParameters(z);
    }

    private final String renderFqName(List<ahnj> list) {
        return escape(ahsi.renderFqName(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderName(agbi agbiVar, StringBuilder sb, boolean z) {
        ahnj name = agbiVar.getName();
        name.getClass();
        sb.append(renderName(name, z));
    }
}
