package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agmo {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new affh(agmo.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new affh(agmo.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new affh(agmo.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new affh(agmo.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", 1), new affh(agmo.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new affh(agmo.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new affh(agmo.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new affh(agmo.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new affh(agmo.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new affh(agmo.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new affh(agmo.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new affh(agmo.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new affh(agmo.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agmo.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new affh(agmo.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new affh(agmo.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new affh(agmo.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new affh(agmo.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agmo.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new affh(agmo.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new affh(agmo.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new affh(agmo.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new affh(agmo.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new affh(agmo.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new affh(agmo.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new affh(agmo.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new affh(agmo.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new affh(agmo.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new affh(agmo.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new affh(agmo.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new affh(agmo.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new affh(agmo.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new affh(agmo.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new affh(agmo.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};
    private static final agpa declaresDefaultValue$delegate;
    private static final agpa hasAnnotations$delegate;
    private static final agpa hasAnnotations$delegate$1;
    private static final agpa hasAnnotations$delegate$2;
    private static final agpa hasAnnotations$delegate$3;
    private static final agpa hasAnnotations$delegate$4;
    private static final agpa hasAnnotations$delegate$5;
    private static final agpa hasAnnotations$delegate$6;
    private static final agpa hasConstant$delegate;
    private static final agpa hasEnumEntries$delegate;
    private static final agpa hasNonStableParameterNames$delegate;
    private static final agpa hasNonStableParameterNames$delegate$1;
    private static final agpa isConst$delegate;
    private static final agpa isCrossinline$delegate;
    private static final agpa isData$delegate;
    private static final agpa isDefinitelyNonNull$delegate;
    private static final agpa isDelegated$delegate;
    private static final agpa isExpect$delegate;
    private static final agpa isExpect$delegate$1;
    private static final agpa isExpect$delegate$2;
    private static final agpa isExternal$delegate;
    private static final agpa isExternal$delegate$1;
    private static final agpa isExternal$delegate$2;
    private static final agpa isExternal$delegate$3;
    private static final agpa isFunInterface$delegate;
    private static final agpa isInfix$delegate;
    private static final agpa isInline$delegate;
    private static final agpa isInline$delegate$1;
    private static final agpa isInner$delegate;
    private static final agpa isLateinit$delegate;
    private static final agpa isNegated$delegate;
    private static final agpa isNoinline$delegate;
    private static final agpa isNotDefault$delegate;
    private static final agpa isNullCheckPredicate$delegate;
    private static final agpa isNullable$delegate;
    private static final agpa isOperator$delegate;
    private static final agpa isReified$delegate;
    private static final agpa isSecondary$delegate;
    private static final agpa isSuspend$delegate;
    private static final agpa isSuspend$delegate$1;
    private static final agpa isTailrec$delegate;
    private static final agpa isValue$delegate;
    private static final agpa isVar$delegate;
    private static final agpb kind$delegate;
    private static final agpb kind$delegate$1;
    private static final agpb kind$delegate$2;
    private static final agpb modality$delegate;
    private static final agpb modality$delegate$1;
    private static final agpb modality$delegate$2;
    private static final agpb modality$delegate$3;
    private static final agpb returnValueStatus$delegate;
    private static final agpb returnValueStatus$delegate$1;
    private static final agpb returnValueStatus$delegate$2;
    private static final agpb visibility$delegate;
    private static final agpb visibility$delegate$1;
    private static final agpb visibility$delegate$2;
    private static final agpb visibility$delegate$3;
    private static final agpb visibility$delegate$4;
    private static final agpb visibility$delegate$5;

    static {
        ahkx ahkxVar = ahla.HAS_ANNOTATIONS;
        ahkxVar.getClass();
        hasAnnotations$delegate = agpk.classBooleanFlag(new agpl(ahkxVar));
        ahkx ahkxVar2 = ahla.HAS_ANNOTATIONS;
        ahkxVar2.getClass();
        hasAnnotations$delegate$1 = agpk.constructorBooleanFlag(new agpl(ahkxVar2));
        ahkx ahkxVar3 = ahla.HAS_ANNOTATIONS;
        ahkxVar3.getClass();
        hasAnnotations$delegate$2 = agpk.functionBooleanFlag(new agpl(ahkxVar3));
        ahkx ahkxVar4 = ahla.HAS_ANNOTATIONS;
        ahkxVar4.getClass();
        hasAnnotations$delegate$3 = agpk.propertyBooleanFlag(new agpl(ahkxVar4));
        ahkx ahkxVar5 = ahla.HAS_ANNOTATIONS;
        ahkxVar5.getClass();
        hasAnnotations$delegate$4 = agpk.propertyAccessorBooleanFlag(new agpl(ahkxVar5));
        ahkx ahkxVar6 = ahla.HAS_ANNOTATIONS;
        ahkxVar6.getClass();
        hasAnnotations$delegate$5 = agpk.valueParameterBooleanFlag(new agpl(ahkxVar6));
        ahkx ahkxVar7 = ahla.HAS_ANNOTATIONS;
        ahkxVar7.getClass();
        hasAnnotations$delegate$6 = agpk.typeAliasBooleanFlag(new agpl(ahkxVar7));
        modality$delegate = agpk.modalityDelegate(new affh() { // from class: agmd
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnq) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnq) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        visibility$delegate = agpk.visibilityDelegate(new affh() { // from class: agmm
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnq) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnq) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        aglz aglzVar = new affh() { // from class: aglz
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnq) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnq) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        };
        ahkz<ahhb> ahkzVar = ahla.CLASS_KIND;
        ahkzVar.getClass();
        afdf<agmp> entries = agmp.getEntries();
        afdf<agmp> entries2 = agmp.getEntries();
        ArrayList arrayList = new ArrayList(woy.bp(entries2, 10));
        Iterator<agmp> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$org_jetbrains_kotlin_kotlin_metadata());
        }
        kind$delegate = new agpb(aglzVar, ahkzVar, entries, arrayList);
        ahkx ahkxVar8 = ahla.IS_INNER;
        ahkxVar8.getClass();
        isInner$delegate = agpk.classBooleanFlag(new agpl(ahkxVar8));
        ahkx ahkxVar9 = ahla.IS_DATA;
        ahkxVar9.getClass();
        isData$delegate = agpk.classBooleanFlag(new agpl(ahkxVar9));
        ahkx ahkxVar10 = ahla.IS_EXTERNAL_CLASS;
        ahkxVar10.getClass();
        isExternal$delegate = agpk.classBooleanFlag(new agpl(ahkxVar10));
        ahkx ahkxVar11 = ahla.IS_EXPECT_CLASS;
        ahkxVar11.getClass();
        isExpect$delegate = agpk.classBooleanFlag(new agpl(ahkxVar11));
        ahkx ahkxVar12 = ahla.IS_VALUE_CLASS;
        ahkxVar12.getClass();
        isValue$delegate = agpk.classBooleanFlag(new agpl(ahkxVar12));
        ahkx ahkxVar13 = ahla.IS_FUN_INTERFACE;
        ahkxVar13.getClass();
        isFunInterface$delegate = agpk.classBooleanFlag(new agpl(ahkxVar13));
        ahkx ahkxVar14 = ahla.HAS_ENUM_ENTRIES;
        ahkxVar14.getClass();
        hasEnumEntries$delegate = agpk.classBooleanFlag(new agpl(ahkxVar14));
        visibility$delegate$1 = agpk.visibilityDelegate(new affh() { // from class: agmn
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnw) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnw) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        ahkx ahkxVar15 = ahla.IS_SECONDARY;
        ahkxVar15.getClass();
        isSecondary$delegate = agpk.constructorBooleanFlag(new agpl(ahkxVar15));
        ahkx ahkxVar16 = ahla.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
        ahkxVar16.getClass();
        hasNonStableParameterNames$delegate = agpk.constructorBooleanFlag(new agpl(ahkxVar16));
        agmg agmgVar = new affh() { // from class: agmg
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agnw) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agnw) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        };
        ahkz<ahjc> ahkzVar2 = ahla.RETURN_VALUE_STATUS_CTOR;
        ahkzVar2.getClass();
        returnValueStatus$delegate = agpk.returnValueStatusDelegate(agmgVar, ahkzVar2);
        kind$delegate$1 = agpk.memberKindDelegate(new affh() { // from class: agma
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agog) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agog) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        visibility$delegate$2 = agpk.visibilityDelegate(new affh() { // from class: agmi
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agog) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agog) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        modality$delegate$1 = agpk.modalityDelegate(new affh() { // from class: agme
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agog) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agog) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        ahkx ahkxVar17 = ahla.IS_OPERATOR;
        ahkxVar17.getClass();
        isOperator$delegate = agpk.functionBooleanFlag(new agpl(ahkxVar17));
        ahkx ahkxVar18 = ahla.IS_INFIX;
        ahkxVar18.getClass();
        isInfix$delegate = agpk.functionBooleanFlag(new agpl(ahkxVar18));
        ahkx ahkxVar19 = ahla.IS_INLINE;
        ahkxVar19.getClass();
        isInline$delegate = agpk.functionBooleanFlag(new agpl(ahkxVar19));
        ahkx ahkxVar20 = ahla.IS_TAILREC;
        ahkxVar20.getClass();
        isTailrec$delegate = agpk.functionBooleanFlag(new agpl(ahkxVar20));
        ahkx ahkxVar21 = ahla.IS_EXTERNAL_FUNCTION;
        ahkxVar21.getClass();
        isExternal$delegate$1 = agpk.functionBooleanFlag(new agpl(ahkxVar21));
        ahkx ahkxVar22 = ahla.IS_SUSPEND;
        ahkxVar22.getClass();
        isSuspend$delegate = agpk.functionBooleanFlag(new agpl(ahkxVar22));
        ahkx ahkxVar23 = ahla.IS_EXPECT_FUNCTION;
        ahkxVar23.getClass();
        isExpect$delegate$1 = agpk.functionBooleanFlag(new agpl(ahkxVar23));
        ahkx ahkxVar24 = ahla.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
        ahkxVar24.getClass();
        hasNonStableParameterNames$delegate$1 = agpk.functionBooleanFlag(new agpl(ahkxVar24));
        agmh agmhVar = new affh() { // from class: agmh
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agog) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agog) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        };
        ahkz<ahjc> ahkzVar3 = ahla.RETURN_VALUE_STATUS_FUNCTION;
        ahkzVar3.getClass();
        returnValueStatus$delegate$1 = agpk.returnValueStatusDelegate(agmhVar, ahkzVar3);
        visibility$delegate$3 = agpk.visibilityDelegate(new affh() { // from class: agmj
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoj) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoj) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        modality$delegate$2 = agpk.modalityDelegate(new affh() { // from class: agmb
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoj) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoj) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        kind$delegate$2 = agpk.memberKindDelegate(new affh() { // from class: agly
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoj) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoj) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        ahkx ahkxVar25 = ahla.IS_VAR;
        ahkxVar25.getClass();
        isVar$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar25));
        ahkx ahkxVar26 = ahla.IS_CONST;
        ahkxVar26.getClass();
        isConst$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar26));
        ahkx ahkxVar27 = ahla.IS_LATEINIT;
        ahkxVar27.getClass();
        isLateinit$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar27));
        ahkx ahkxVar28 = ahla.HAS_CONSTANT;
        ahkxVar28.getClass();
        hasConstant$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar28));
        ahkx ahkxVar29 = ahla.IS_EXTERNAL_PROPERTY;
        ahkxVar29.getClass();
        isExternal$delegate$2 = agpk.propertyBooleanFlag(new agpl(ahkxVar29));
        ahkx ahkxVar30 = ahla.IS_DELEGATED;
        ahkxVar30.getClass();
        isDelegated$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar30));
        ahkx ahkxVar31 = ahla.IS_EXPECT_PROPERTY;
        ahkxVar31.getClass();
        isExpect$delegate$2 = agpk.propertyBooleanFlag(new agpl(ahkxVar31));
        agmf agmfVar = new affh() { // from class: agmf
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoj) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoj) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        };
        ahkz<ahjc> ahkzVar4 = ahla.RETURN_VALUE_STATUS_PROPERTY;
        ahkzVar4.getClass();
        returnValueStatus$delegate$2 = agpk.returnValueStatusDelegate(agmfVar, ahkzVar4);
        visibility$delegate$4 = agpk.visibilityDelegate(new affh() { // from class: agmk
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agok) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agok) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        modality$delegate$3 = agpk.modalityDelegate(new affh() { // from class: agmc
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agok) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agok) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        ahkx ahkxVar32 = ahla.IS_NOT_DEFAULT;
        ahkxVar32.getClass();
        isNotDefault$delegate = agpk.propertyAccessorBooleanFlag(new agpl(ahkxVar32));
        ahkx ahkxVar33 = ahla.IS_EXTERNAL_ACCESSOR;
        ahkxVar33.getClass();
        isExternal$delegate$3 = agpk.propertyAccessorBooleanFlag(new agpl(ahkxVar33));
        ahkx ahkxVar34 = ahla.IS_INLINE_ACCESSOR;
        ahkxVar34.getClass();
        isInline$delegate$1 = agpk.propertyAccessorBooleanFlag(new agpl(ahkxVar34));
        isNullable$delegate = agpk.typeBooleanFlag(new agpl(0, 1, 1));
        ahkx ahkxVar35 = ahla.SUSPEND_TYPE;
        isSuspend$delegate$1 = agpk.typeBooleanFlag(new agpl(ahkxVar35.offset + 1, ahkxVar35.bitWidth, 1));
        ahkx ahkxVar36 = ahla.DEFINITELY_NOT_NULL_TYPE;
        isDefinitelyNonNull$delegate = agpk.typeBooleanFlag(new agpl(ahkxVar36.offset + 1, ahkxVar36.bitWidth, 1));
        isReified$delegate = new agpa(new affh() { // from class: aglx
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agon) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agon) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        }, new agpl(0, 1, 1));
        visibility$delegate$5 = agpk.visibilityDelegate(new affh() { // from class: agml
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agom) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agom) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        });
        ahkx ahkxVar37 = ahla.DECLARES_DEFAULT_VALUE;
        ahkxVar37.getClass();
        declaresDefaultValue$delegate = agpk.valueParameterBooleanFlag(new agpl(ahkxVar37));
        ahkx ahkxVar38 = ahla.IS_CROSSINLINE;
        ahkxVar38.getClass();
        isCrossinline$delegate = agpk.valueParameterBooleanFlag(new agpl(ahkxVar38));
        ahkx ahkxVar39 = ahla.IS_NOINLINE;
        ahkxVar39.getClass();
        isNoinline$delegate = agpk.valueParameterBooleanFlag(new agpl(ahkxVar39));
        aglv aglvVar = new affh() { // from class: aglv
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoa) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoa) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        };
        ahkx ahkxVar40 = ahla.IS_NEGATED;
        ahkxVar40.getClass();
        isNegated$delegate = new agpa(aglvVar, new agpl(ahkxVar40));
        aglw aglwVar = new affh() { // from class: aglw
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(((agoa) obj).getFlags$org_jetbrains_kotlin_kotlin_metadata());
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                ((agoa) obj).setFlags$org_jetbrains_kotlin_kotlin_metadata(((Number) obj2).intValue());
            }
        };
        ahkx ahkxVar41 = ahla.IS_NULL_CHECK_PREDICATE;
        ahkxVar41.getClass();
        isNullCheckPredicate$delegate = new agpa(aglwVar, new agpl(ahkxVar41));
    }

    public static final boolean getDeclaresDefaultValue(agoq agoqVar) {
        agoqVar.getClass();
        return declaresDefaultValue$delegate.getValue(agoqVar, $$delegatedProperties[54]);
    }

    public static final agmp getKind(agnq agnqVar) {
        agnqVar.getClass();
        return (agmp) kind$delegate.getValue(agnqVar, $$delegatedProperties[9]);
    }

    public static final agox getModality(agog agogVar) {
        agogVar.getClass();
        return (agox) modality$delegate$1.getValue(agogVar, $$delegatedProperties[23]);
    }

    public static final agoz getVisibility(agnw agnwVar) {
        agnwVar.getClass();
        return (agoz) visibility$delegate$1.getValue(agnwVar, $$delegatedProperties[17]);
    }

    public static final boolean isConst(agoj agojVar) {
        agojVar.getClass();
        return isConst$delegate.getValue(agojVar, $$delegatedProperties[37]);
    }

    public static final boolean isData(agnq agnqVar) {
        agnqVar.getClass();
        return isData$delegate.getValue(agnqVar, $$delegatedProperties[11]);
    }

    public static final boolean isDefinitelyNonNull(agol agolVar) {
        agolVar.getClass();
        return isDefinitelyNonNull$delegate.getValue(agolVar, $$delegatedProperties[51]);
    }

    public static final boolean isDelegated(agoj agojVar) {
        agojVar.getClass();
        return isDelegated$delegate.getValue(agojVar, $$delegatedProperties[41]);
    }

    public static final boolean isExternal(agog agogVar) {
        agogVar.getClass();
        return isExternal$delegate$1.getValue(agogVar, $$delegatedProperties[28]);
    }

    public static final boolean isFunInterface(agnq agnqVar) {
        agnqVar.getClass();
        return isFunInterface$delegate.getValue(agnqVar, $$delegatedProperties[15]);
    }

    public static final boolean isInfix(agog agogVar) {
        agogVar.getClass();
        return isInfix$delegate.getValue(agogVar, $$delegatedProperties[25]);
    }

    public static final boolean isInline(agog agogVar) {
        agogVar.getClass();
        return isInline$delegate.getValue(agogVar, $$delegatedProperties[26]);
    }

    public static final boolean isInner(agnq agnqVar) {
        agnqVar.getClass();
        return isInner$delegate.getValue(agnqVar, $$delegatedProperties[10]);
    }

    public static final boolean isLateinit(agoj agojVar) {
        agojVar.getClass();
        return isLateinit$delegate.getValue(agojVar, $$delegatedProperties[38]);
    }

    public static final boolean isNullable(agol agolVar) {
        agolVar.getClass();
        return isNullable$delegate.getValue(agolVar, $$delegatedProperties[49]);
    }

    public static final boolean isOperator(agog agogVar) {
        agogVar.getClass();
        return isOperator$delegate.getValue(agogVar, $$delegatedProperties[24]);
    }

    public static final boolean isReified(agon agonVar) {
        agonVar.getClass();
        return isReified$delegate.getValue(agonVar, $$delegatedProperties[52]);
    }

    public static final boolean isSecondary(agnw agnwVar) {
        agnwVar.getClass();
        return isSecondary$delegate.getValue(agnwVar, $$delegatedProperties[18]);
    }

    public static final boolean isSuspend(agog agogVar) {
        agogVar.getClass();
        return isSuspend$delegate.getValue(agogVar, $$delegatedProperties[29]);
    }

    public static final boolean isValue(agnq agnqVar) {
        agnqVar.getClass();
        return isValue$delegate.getValue(agnqVar, $$delegatedProperties[14]);
    }

    public static final boolean isVar(agoj agojVar) {
        agojVar.getClass();
        return isVar$delegate.getValue(agojVar, $$delegatedProperties[36]);
    }

    public static final void setKind(agnq agnqVar, agmp agmpVar) {
        agnqVar.getClass();
        agmpVar.getClass();
        kind$delegate.setValue(agnqVar, $$delegatedProperties[9], agmpVar);
    }

    public static final void setModality(agnq agnqVar, agox agoxVar) {
        agnqVar.getClass();
        agoxVar.getClass();
        modality$delegate.setValue(agnqVar, $$delegatedProperties[7], agoxVar);
    }

    public static final void setVisibility(agnq agnqVar, agoz agozVar) {
        agnqVar.getClass();
        agozVar.getClass();
        visibility$delegate.setValue(agnqVar, $$delegatedProperties[8], agozVar);
    }

    public static final boolean isExternal(agok agokVar) {
        agokVar.getClass();
        return isExternal$delegate$3.getValue(agokVar, $$delegatedProperties[47]);
    }

    public static final boolean isInline(agok agokVar) {
        agokVar.getClass();
        return isInline$delegate$1.getValue(agokVar, $$delegatedProperties[48]);
    }

    public static final boolean isSuspend(agol agolVar) {
        agolVar.getClass();
        return isSuspend$delegate$1.getValue(agolVar, $$delegatedProperties[50]);
    }

    public static final agox getModality(agnq agnqVar) {
        agnqVar.getClass();
        return (agox) modality$delegate.getValue(agnqVar, $$delegatedProperties[7]);
    }

    public static final agoz getVisibility(agog agogVar) {
        agogVar.getClass();
        return (agoz) visibility$delegate$2.getValue(agogVar, $$delegatedProperties[22]);
    }

    public static final agox getModality(agoj agojVar) {
        agojVar.getClass();
        return (agox) modality$delegate$2.getValue(agojVar, $$delegatedProperties[34]);
    }

    public static final agoz getVisibility(agoj agojVar) {
        agojVar.getClass();
        return (agoz) visibility$delegate$3.getValue(agojVar, $$delegatedProperties[33]);
    }

    public static final agox getModality(agok agokVar) {
        agokVar.getClass();
        return (agox) modality$delegate$3.getValue(agokVar, $$delegatedProperties[45]);
    }

    public static final agoz getVisibility(agok agokVar) {
        agokVar.getClass();
        return (agoz) visibility$delegate$4.getValue(agokVar, $$delegatedProperties[44]);
    }
}
