package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aibt {
    private aibt() {
    }

    public static defpackage.afeb a(java.util.List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return new defpackage.aixa(i, list);
    }

    public static boolean b(java.lang.StackTraceElement stackTraceElement) {
        return defpackage.afzh.g(stackTraceElement.getMethodName(), "runBlocking", false) && defpackage.afzh.g(stackTraceElement.getClassName(), "kotlinx.coroutines.BuildersKt", false);
    }

    public final defpackage.aibu create(defpackage.ahof ahofVar, defpackage.aifi aifiVar, defpackage.agdu agduVar, java.io.InputStream inputStream, boolean z) throws java.io.IOException {
        ahofVar.getClass();
        aifiVar.getClass();
        agduVar.getClass();
        inputStream.getClass();
        defpackage.afau<defpackage.ahjp, defpackage.ahlq> builtinsPackageFragment = defpackage.ahlt.readBuiltinsPackageFragment(inputStream);
        defpackage.ahjp ahjpVar = (defpackage.ahjp) builtinsPackageFragment.a;
        defpackage.ahlq ahlqVar = (defpackage.ahlq) builtinsPackageFragment.b;
        if (ahjpVar != null) {
            return new defpackage.aibu(ahofVar, aifiVar, agduVar, ahjpVar, ahlqVar, z, null);
        }
        throw new java.lang.UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + defpackage.ahlq.INSTANCE + ", actual " + ahlqVar + ". Please update Kotlin");
    }

    public /* synthetic */ aibt(defpackage.affu affuVar) {
        this();
    }
}
