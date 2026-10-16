package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aguo {
    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static final int b(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }

    public static final java.util.List<defpackage.ahoj> getPropertyNamesCandidatesByAccessorName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        java.lang.String strAsString = ahojVar.asString();
        strAsString.getClass();
        if (defpackage.aguh.isGetterName(strAsString)) {
            return defpackage.afga.ad(propertyNameByGetMethodName(ahojVar));
        }
        return defpackage.aguh.isSetterName(strAsString) ? propertyNamesBySetMethodName(ahojVar) : defpackage.agtc.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(ahojVar);
    }

    public static final defpackage.ahoj propertyNameByGetMethodName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        defpackage.ahoj ahojVarPropertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(ahojVar, "get", false, null, 12, null);
        return ahojVarPropertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(ahojVar, "is", false, null, 8, null) : ahojVarPropertyNameFromAccessorMethodName$default;
    }

    public static final defpackage.ahoj propertyNameBySetMethodName(defpackage.ahoj ahojVar, boolean z) {
        ahojVar.getClass();
        return propertyNameFromAccessorMethodName$default(ahojVar, "set", false, true != z ? null : "is", 4, null);
    }

    private static final defpackage.ahoj propertyNameFromAccessorMethodName(defpackage.ahoj ahojVar, java.lang.String str, boolean z, java.lang.String str2) {
        if (ahojVar.isSpecial()) {
            return null;
        }
        java.lang.String identifier = ahojVar.getIdentifier();
        identifier.getClass();
        if (!defpackage.afzh.g(identifier, str, false) || identifier.length() == str.length()) {
            return null;
        }
        char cCharAt = identifier.charAt(str.length());
        if (cCharAt >= 'a' && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return defpackage.ahoj.identifier(str2.concat(defpackage.afzh.m(identifier, str)));
        }
        if (!z) {
            return ahojVar;
        }
        java.lang.String strDecapitalizeSmartForCompiler = defpackage.aipu.decapitalizeSmartForCompiler(defpackage.afzh.m(identifier, str), true);
        if (defpackage.ahoj.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
            return defpackage.ahoj.identifier(strDecapitalizeSmartForCompiler);
        }
        return null;
    }

    static /* synthetic */ defpackage.ahoj propertyNameFromAccessorMethodName$default(defpackage.ahoj ahojVar, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(ahojVar, str, z2, str2);
    }

    public static final java.util.List<defpackage.ahoj> propertyNamesBySetMethodName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return defpackage.afga.bU(new defpackage.ahoj[]{propertyNameBySetMethodName(ahojVar, false), propertyNameBySetMethodName(ahojVar, true)});
    }
}
