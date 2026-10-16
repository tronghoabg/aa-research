package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agtw {
    private agtw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agtv method(String str, String str2, String str3, String str4) {
        return method(str, ahnj.identifier(str2), str3, str4);
    }

    public final ahnj getBuiltinFunctionNamesByJvmName(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(ahnjVar);
    }

    public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
        return agua.ERASED_COLLECTION_PARAMETER_SIGNATURES;
    }

    public final Set<ahnj> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
        return agua.ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    }

    public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
        return agua.ERASED_VALUE_PARAMETERS_SIGNATURES;
    }

    public final Map<ahnj, ahnj> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
        return agua.JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    }

    public final Set<ahnj> getORIGINAL_SHORT_NAMES() {
        return agua.ORIGINAL_SHORT_NAMES;
    }

    public final agtv getREMOVE_AT_NAME_AND_SIGNATURE() {
        return agua.REMOVE_AT_NAME_AND_SIGNATURE;
    }

    public final Map<String, agtz> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
        return agua.SIGNATURE_TO_DEFAULT_VALUES_MAP;
    }

    public final Map<String, ahnj> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
        return agua.SIGNATURE_TO_JVM_REPRESENTATION_NAME;
    }

    public final boolean getSameAsRenamedInJvmBuiltin(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getORIGINAL_SHORT_NAMES().contains(ahnjVar);
    }

    public final agtx getSpecialSignatureInfo(String str) {
        str.getClass();
        return getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(str) ? agtx.ONE_COLLECTION_PARAMETER : ((agtz) woy.aY(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), str)) == agtz.NULL ? agtx.OBJECT_PARAMETER_GENERIC : agtx.OBJECT_PARAMETER_NON_GENERIC;
    }

    public /* synthetic */ agtw(afeu afeuVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agtv method(String str, ahnj ahnjVar, String str2, String str3) {
        return new agtv(str, ahnjVar, str2, str3);
    }
}
