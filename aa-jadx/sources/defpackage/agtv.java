package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agtv {
    public static final defpackage.agdc PACKAGE_VISIBILITY;
    public static final defpackage.agdc PROTECTED_AND_PACKAGE;
    public static final defpackage.agdc PROTECTED_STATIC_VISIBILITY;
    private static final java.util.Map<defpackage.agfy, defpackage.agdc> visibilitiesMapping;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    static {
        defpackage.agts agtsVar = new defpackage.agts(defpackage.agkb.INSTANCE);
        PACKAGE_VISIBILITY = agtsVar;
        defpackage.agtt agttVar = new defpackage.agtt(defpackage.agkd.INSTANCE);
        PROTECTED_STATIC_VISIBILITY = agttVar;
        defpackage.agtu agtuVar = new defpackage.agtu(defpackage.agkc.INSTANCE);
        PROTECTED_AND_PACKAGE = agtuVar;
        visibilitiesMapping = new java.util.HashMap();
        recordVisibilityMapping(agtsVar);
        recordVisibilityMapping(agttVar);
        recordVisibilityMapping(agtuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areInSamePackage(defpackage.agci agciVar, defpackage.agci agciVar2) {
        if (agciVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agciVar2 == null) {
            $$$reportNull$$$0(3);
        }
        defpackage.agec agecVar = (defpackage.agec) defpackage.ahtt.getParentOfType(agciVar, defpackage.agec.class, false);
        defpackage.agec agecVar2 = (defpackage.agec) defpackage.ahtt.getParentOfType(agciVar2, defpackage.agec.class, false);
        return (agecVar2 == null || agecVar == null || !agecVar.getFqName().equals(agecVar2.getFqName())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVisibleForProtectedAndPackage(defpackage.ahza ahzaVar, defpackage.agcm agcmVar, defpackage.agci agciVar) {
        if (agcmVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agciVar == null) {
            $$$reportNull$$$0(1);
        }
        if (areInSamePackage(defpackage.ahtt.unwrapFakeOverrideToAnyDeclaration(agcmVar), agciVar)) {
            return true;
        }
        return defpackage.agdb.PROTECTED.isVisible(ahzaVar, agcmVar, agciVar, false);
    }

    private static void recordVisibilityMapping(defpackage.agdc agdcVar) {
        visibilitiesMapping.put(agdcVar.getDelegate(), agdcVar);
    }

    public static defpackage.agdc toDescriptorVisibility(defpackage.agfy agfyVar) {
        if (agfyVar == null) {
            $$$reportNull$$$0(4);
        }
        defpackage.agdc agdcVar = visibilitiesMapping.get(agfyVar);
        return agdcVar == null ? defpackage.agdb.toDescriptorVisibility(agfyVar) : agdcVar;
    }
}
