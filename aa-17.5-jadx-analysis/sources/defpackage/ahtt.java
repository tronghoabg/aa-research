package defpackage;

/* loaded from: classes3.dex */
public final class ahtt {
    private static final agcs<ahts> STDLIB_CLASS_FINDER_CAPABILITY = new agcs<>("StdlibClassFinder");

    public static final ahts getStdlibClassFinder(agcu agcuVar) {
        agcuVar.getClass();
        ahts ahtsVar = (ahts) agcuVar.getCapability(STDLIB_CLASS_FINDER_CAPABILITY);
        return ahtsVar == null ? ahsl.INSTANCE : ahtsVar;
    }
}
