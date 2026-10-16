package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agve {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 18) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static void a(defpackage.ajqb ajqbVar) throws java.io.IOException {
        java.io.InputStream inputStreamB;
        if (ajqbVar == null || !ajqbVar.i() || (inputStreamB = ajqbVar.b()) == null) {
            return;
        }
        inputStreamB.close();
    }

    public static byte[] b(java.lang.String str, java.lang.String str2) {
        defpackage.aguw.e(str, "Input");
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("Charset may not be null");
        }
        if (defpackage.agwh.b(str2)) {
            throw new java.lang.IllegalArgumentException("Charset may not be empty");
        }
        try {
            return str.getBytes(str2);
        } catch (java.io.UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static defpackage.agfl getAnnotationParameterByName(defpackage.ahoj ahojVar, defpackage.agca agcaVar) {
        if (ahojVar == null) {
            $$$reportNull$$$0(19);
        }
        if (agcaVar == null) {
            $$$reportNull$$$0(20);
        }
        java.util.Collection<defpackage.agbz> constructors = agcaVar.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (defpackage.agfl agflVar : constructors.iterator().next().getValueParameters()) {
            if (agflVar.getName().equals(ahojVar)) {
                return agflVar;
            }
        }
        return null;
    }

    private static <D extends defpackage.agbx> java.util.Collection<D> resolveOverrides(defpackage.ahoj ahojVar, java.util.Collection<D> collection, java.util.Collection<D> collection2, defpackage.agca agcaVar, defpackage.aiah aiahVar, defpackage.ahuj ahujVar, boolean z) {
        if (ahojVar == null) {
            $$$reportNull$$$0(12);
        }
        if (collection == null) {
            $$$reportNull$$$0(13);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(14);
        }
        if (agcaVar == null) {
            $$$reportNull$$$0(15);
        }
        if (aiahVar == null) {
            $$$reportNull$$$0(16);
        }
        if (ahujVar == null) {
            $$$reportNull$$$0(17);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        ahujVar.generateOverridesInFunctionGroup(ahojVar, collection, collection2, agcaVar, new defpackage.agvd(aiahVar, linkedHashSet, z));
        return linkedHashSet;
    }

    public static <D extends defpackage.agbx> java.util.Collection<D> resolveOverridesForNonStaticMembers(defpackage.ahoj ahojVar, java.util.Collection<D> collection, java.util.Collection<D> collection2, defpackage.agca agcaVar, defpackage.aiah aiahVar, defpackage.ahuj ahujVar) {
        if (ahojVar == null) {
            $$$reportNull$$$0(0);
        }
        if (collection == null) {
            $$$reportNull$$$0(1);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(2);
        }
        if (agcaVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aiahVar == null) {
            $$$reportNull$$$0(4);
        }
        if (ahujVar == null) {
            $$$reportNull$$$0(5);
        }
        return resolveOverrides(ahojVar, collection, collection2, agcaVar, aiahVar, ahujVar, false);
    }

    public static <D extends defpackage.agbx> java.util.Collection<D> resolveOverridesForStaticMembers(defpackage.ahoj ahojVar, java.util.Collection<D> collection, java.util.Collection<D> collection2, defpackage.agca agcaVar, defpackage.aiah aiahVar, defpackage.ahuj ahujVar) {
        if (ahojVar == null) {
            $$$reportNull$$$0(6);
        }
        if (collection == null) {
            $$$reportNull$$$0(7);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(8);
        }
        if (agcaVar == null) {
            $$$reportNull$$$0(9);
        }
        if (aiahVar == null) {
            $$$reportNull$$$0(10);
        }
        if (ahujVar == null) {
            $$$reportNull$$$0(11);
        }
        return resolveOverrides(ahojVar, collection, collection2, agcaVar, aiahVar, ahujVar, true);
    }
}
