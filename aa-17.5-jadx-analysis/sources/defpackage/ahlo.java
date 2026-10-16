package defpackage;

/* loaded from: classes3.dex */
public final class ahlo {
    public static final boolean isKotlin1Dot4OrLater(ahkv ahkvVar) {
        ahkvVar.getClass();
        return (ahkvVar.getMajor() == 1 && ahkvVar.getMinor() >= 4) || ahkvVar.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(ahkv ahkvVar) {
        ahkvVar.getClass();
        return isKotlin1Dot4OrLater(ahkvVar);
    }
}
