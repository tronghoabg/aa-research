package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aguw {
    private aguw() {
    }

    public static void a(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void b(java.lang.CharSequence charSequence, java.lang.String str) {
        if (charSequence == null) {
            throw new java.lang.IllegalArgumentException(str.concat(" may not be null"));
        }
        if (defpackage.agwh.a(charSequence)) {
            throw new java.lang.IllegalArgumentException(str.concat(" may not be blank"));
        }
    }

    public static void c(java.util.Collection collection, java.lang.String str) {
        if (collection.isEmpty()) {
            throw new java.lang.IllegalArgumentException(str.concat(" may not be empty"));
        }
    }

    public static void d(int i, java.lang.String str) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(str.concat(" may not be negative"));
        }
    }

    public static void e(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str.concat(" may not be null"));
        }
    }

    public static final void f(defpackage.akch akchVar, java.lang.String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = " ;,:@()<>\\\"/[]?={}\t".indexOf(str.charAt(i)) >= 0;
            }
        }
        if (z) {
            akchVar.e('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ("\"\\".indexOf(cCharAt) >= 0) {
                akchVar.e('\\');
            }
            akchVar.e(cCharAt);
        }
        if (z) {
            akchVar.e('\"');
        }
    }

    public static final int g(defpackage.ajqp ajqpVar) {
        if (ajqpVar == null) {
            return 0;
        }
        int length = ajqpVar.b().length();
        java.lang.String strC = ajqpVar.c();
        return strC != null ? length + strC.length() + 3 : length;
    }

    public static final void h(defpackage.akch akchVar, defpackage.ajqp ajqpVar, boolean z) {
        e(ajqpVar, "Name / value pair");
        akchVar.j(g(ajqpVar));
        akchVar.f(ajqpVar.b());
        java.lang.String strC = ajqpVar.c();
        if (strC != null) {
            akchVar.e('=');
            f(akchVar, strC, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final defpackage.aguv method(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return method(str, defpackage.ahoj.identifier(str2), str3, str4);
    }

    public final defpackage.ahoj getBuiltinFunctionNamesByJvmName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(ahojVar);
    }

    public final java.util.List<java.lang.String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
        return defpackage.agva.ERASED_COLLECTION_PARAMETER_SIGNATURES;
    }

    public final java.util.Set<defpackage.ahoj> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
        return defpackage.agva.ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    }

    public final java.util.Set<java.lang.String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
        return defpackage.agva.ERASED_VALUE_PARAMETERS_SIGNATURES;
    }

    public final java.util.Map<defpackage.ahoj, defpackage.ahoj> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
        return defpackage.agva.JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    }

    public final java.util.Set<defpackage.ahoj> getORIGINAL_SHORT_NAMES() {
        return defpackage.agva.ORIGINAL_SHORT_NAMES;
    }

    public final defpackage.aguv getREMOVE_AT_NAME_AND_SIGNATURE() {
        return defpackage.agva.REMOVE_AT_NAME_AND_SIGNATURE;
    }

    public final java.util.Map<java.lang.String, defpackage.aguz> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
        return defpackage.agva.SIGNATURE_TO_DEFAULT_VALUES_MAP;
    }

    public final java.util.Map<java.lang.String, defpackage.ahoj> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
        return defpackage.agva.SIGNATURE_TO_JVM_REPRESENTATION_NAME;
    }

    public final boolean getSameAsRenamedInJvmBuiltin(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return getORIGINAL_SHORT_NAMES().contains(ahojVar);
    }

    public final defpackage.agux getSpecialSignatureInfo(java.lang.String str) {
        str.getClass();
        if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(str)) {
            return defpackage.agux.ONE_COLLECTION_PARAMETER;
        }
        return ((defpackage.aguz) defpackage.afga.S(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), str)) == defpackage.aguz.NULL ? defpackage.agux.OBJECT_PARAMETER_GENERIC : defpackage.agux.OBJECT_PARAMETER_NON_GENERIC;
    }

    public /* synthetic */ aguw(defpackage.affu affuVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final defpackage.aguv method(java.lang.String str, defpackage.ahoj ahojVar, java.lang.String str2, java.lang.String str3) {
        return new defpackage.aguv(str, ahojVar, str2, str3);
    }
}
