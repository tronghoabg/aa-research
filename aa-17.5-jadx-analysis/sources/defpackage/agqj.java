package defpackage;

/* loaded from: classes3.dex */
public final class agqj {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affh(agqj.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z", 1), new affh(agqj.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z", 1), new affh(agqj.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z", 1), new affh(agqj.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agqj.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new affh(agqj.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z", 1), new affh(agqj.class, "isMovedFromInterfaceCompanion", "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z", 1), new affh(agqj.class, "hasMethodBodiesInInterface", "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z", 1), new affh(agqj.class, "isCompiledInCompatibilityMode", "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z", 1)};
    private static final agpa hasAnnotationsInBytecode$delegate;
    private static final agpa hasAnnotationsInBytecode$delegate$1;
    private static final agpa hasAnnotationsInBytecode$delegate$2;
    private static final agpa hasAnnotationsInBytecode$delegate$3;
    private static final agpa hasAnnotationsInBytecode$delegate$4;
    private static final agpa hasAnnotationsInBytecode$delegate$5;
    private static final agpa hasMethodBodiesInInterface$delegate;
    private static final agpa isCompiledInCompatibilityMode$delegate;
    private static final agpa isMovedFromInterfaceCompanion$delegate;

    static {
        ahkx ahkxVar = ahla.HAS_ANNOTATIONS;
        ahkxVar.getClass();
        hasAnnotationsInBytecode$delegate = agpk.classBooleanFlag(new agpl(ahkxVar));
        ahkx ahkxVar2 = ahla.HAS_ANNOTATIONS;
        ahkxVar2.getClass();
        hasAnnotationsInBytecode$delegate$1 = agpk.constructorBooleanFlag(new agpl(ahkxVar2));
        ahkx ahkxVar3 = ahla.HAS_ANNOTATIONS;
        ahkxVar3.getClass();
        hasAnnotationsInBytecode$delegate$2 = agpk.functionBooleanFlag(new agpl(ahkxVar3));
        ahkx ahkxVar4 = ahla.HAS_ANNOTATIONS;
        ahkxVar4.getClass();
        hasAnnotationsInBytecode$delegate$3 = agpk.propertyBooleanFlag(new agpl(ahkxVar4));
        ahkx ahkxVar5 = ahla.HAS_ANNOTATIONS;
        ahkxVar5.getClass();
        hasAnnotationsInBytecode$delegate$4 = agpk.propertyAccessorBooleanFlag(new agpl(ahkxVar5));
        ahkx ahkxVar6 = ahla.HAS_ANNOTATIONS;
        ahkxVar6.getClass();
        hasAnnotationsInBytecode$delegate$5 = agpk.valueParameterBooleanFlag(new agpl(ahkxVar6));
        agqi agqiVar = new affh() { // from class: agqi
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(agqj.getJvmFlags((agoj) obj));
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                agqj.setJvmFlags((agoj) obj, ((Number) obj2).intValue());
            }
        };
        ahkx is_moved_from_interface_companion = ahmk.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        is_moved_from_interface_companion.getClass();
        isMovedFromInterfaceCompanion$delegate = new agpa(agqiVar, booleanFlag(is_moved_from_interface_companion));
        agqg agqgVar = new affh() { // from class: agqg
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(agqj.getJvmFlags((agnq) obj));
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                agqj.setJvmFlags((agnq) obj, ((Number) obj2).intValue());
            }
        };
        ahkx is_compiled_in_jvm_default_mode = ahmk.INSTANCE.getIS_COMPILED_IN_JVM_DEFAULT_MODE();
        is_compiled_in_jvm_default_mode.getClass();
        hasMethodBodiesInInterface$delegate = new agpa(agqgVar, booleanFlag(is_compiled_in_jvm_default_mode));
        agqh agqhVar = new affh() { // from class: agqh
            @Override // defpackage.affh, defpackage.afhx
            public Object get(Object obj) {
                return Integer.valueOf(agqj.getJvmFlags((agnq) obj));
            }

            @Override // defpackage.affh, defpackage.afhm
            public void set(Object obj, Object obj2) {
                agqj.setJvmFlags((agnq) obj, ((Number) obj2).intValue());
            }
        };
        ahkx is_compiled_in_compatibility_mode = ahmk.INSTANCE.getIS_COMPILED_IN_COMPATIBILITY_MODE();
        is_compiled_in_compatibility_mode.getClass();
        isCompiledInCompatibilityMode$delegate = new agpa(agqhVar, booleanFlag(is_compiled_in_compatibility_mode));
    }

    private static final agpl booleanFlag(ahkx ahkxVar) {
        return new agpl(ahkxVar.offset, ahkxVar.bitWidth, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getJvmFlags(agnq agnqVar) {
        return agrd.getJvm(agnqVar).getJvmFlags();
    }

    public static final boolean isMovedFromInterfaceCompanion(agoj agojVar) {
        agojVar.getClass();
        return isMovedFromInterfaceCompanion$delegate.getValue(agojVar, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setJvmFlags(agnq agnqVar, int i) {
        agrd.getJvm(agnqVar).setJvmFlags(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setJvmFlags(agoj agojVar, int i) {
        agrd.getJvm(agojVar).setJvmFlags(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getJvmFlags(agoj agojVar) {
        return agrd.getJvm(agojVar).getJvmFlags();
    }
}
