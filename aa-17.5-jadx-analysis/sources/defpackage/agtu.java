package defpackage;

/* loaded from: classes3.dex */
public final class agtu {
    public static final boolean doesOverrideBuiltinWithDifferentJvmName(agax agaxVar) {
        agaxVar.getClass();
        return getOverriddenBuiltinWithDifferentJvmName(agaxVar) != null;
    }

    public static final String getJvmMethodNameIfSpecial(agax agaxVar) {
        ahnj jvmName;
        agaxVar.getClass();
        agax overriddenBuiltinThatAffectsJvmName = getOverriddenBuiltinThatAffectsJvmName(agaxVar);
        if (overriddenBuiltinThatAffectsJvmName != null) {
            agax propertyIfAccessor = ahvz.getPropertyIfAccessor(overriddenBuiltinThatAffectsJvmName);
            if (propertyIfAccessor instanceof agdn) {
                return agsf.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyIfAccessor);
            }
            if (!(propertyIfAccessor instanceof agdv) || (jvmName = agry.INSTANCE.getJvmName((agdv) propertyIfAccessor)) == null) {
                return null;
            }
            return jvmName.asString();
        }
        return null;
    }

    private static final agax getOverriddenBuiltinThatAffectsJvmName(agax agaxVar) {
        if (afye.isBuiltIn(agaxVar)) {
            return getOverriddenBuiltinWithDifferentJvmName(agaxVar);
        }
        return null;
    }

    public static final <T extends agax> T getOverriddenBuiltinWithDifferentJvmName(T t) {
        t.getClass();
        if (!agua.Companion.getORIGINAL_SHORT_NAMES().contains(t.getName()) && !agsc.INSTANCE.getSPECIAL_SHORT_NAMES().contains(ahvz.getPropertyIfAccessor(t).getName())) {
            return null;
        }
        if ((t instanceof agdn) || (t instanceof agdm)) {
            return (T) ahvz.firstOverridden(t, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), agtr.INSTANCE);
        }
        if (t instanceof agdv) {
            return (T) ahvz.firstOverridden(t, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), agts.INSTANCE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenBuiltinWithDifferentJvmName$lambda$0(agax agaxVar) {
        agaxVar.getClass();
        return agsf.INSTANCE.hasBuiltinSpecialPropertyFqName(ahvz.getPropertyIfAccessor(agaxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenBuiltinWithDifferentJvmName$lambda$1(agax agaxVar) {
        agaxVar.getClass();
        return agry.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((agdv) agaxVar);
    }

    public static final <T extends agax> T getOverriddenSpecialBuiltin(T t) {
        t.getClass();
        T t2 = (T) getOverriddenBuiltinWithDifferentJvmName(t);
        if (t2 != null) {
            return t2;
        }
        agsb agsbVar = agsb.INSTANCE;
        ahnj name = t.getName();
        name.getClass();
        if (agsbVar.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (T) ahvz.firstOverridden(t, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), agtt.INSTANCE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenSpecialBuiltin$lambda$1(agax agaxVar) {
        agaxVar.getClass();
        return afye.isBuiltIn(agaxVar) && agsb.getSpecialSignatureInfo(agaxVar) != null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(agba agbaVar, agav agavVar) {
        agbaVar.getClass();
        agavVar.getClass();
        agbi containingDeclaration = agavVar.getContainingDeclaration();
        containingDeclaration.getClass();
        aigw defaultType = ((agba) containingDeclaration).getDefaultType();
        defaultType.getClass();
        for (agba superClassDescriptor = ahst.getSuperClassDescriptor(agbaVar); superClassDescriptor != null; superClassDescriptor = ahst.getSuperClassDescriptor(superClassDescriptor)) {
            if (!(superClassDescriptor instanceof aguz) && aikn.findCorrespondingSupertype(superClassDescriptor.getDefaultType(), defaultType) != null) {
                return !afye.isBuiltIn(superClassDescriptor);
            }
        }
        return false;
    }

    public static final boolean isFromJava(agax agaxVar) {
        agaxVar.getClass();
        return ahvz.getPropertyIfAccessor(agaxVar).getContainingDeclaration() instanceof aguz;
    }

    public static final boolean isFromJavaOrBuiltins(agax agaxVar) {
        agaxVar.getClass();
        return isFromJava(agaxVar) || afye.isBuiltIn(agaxVar);
    }
}
