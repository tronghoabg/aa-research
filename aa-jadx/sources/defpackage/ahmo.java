package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmo {
    public static final boolean isKotlin1Dot4OrLater(defpackage.ahlv ahlvVar) {
        ahlvVar.getClass();
        return (ahlvVar.getMajor() == 1 && ahlvVar.getMinor() >= 4) || ahlvVar.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(defpackage.ahlv ahlvVar) {
        ahlvVar.getClass();
        return isKotlin1Dot4OrLater(ahlvVar);
    }
}
