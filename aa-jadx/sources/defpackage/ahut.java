package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahut {
    private static final defpackage.agds<defpackage.ahus> STDLIB_CLASS_FINDER_CAPABILITY = new defpackage.agds<>("StdlibClassFinder");

    public static final defpackage.ahus getStdlibClassFinder(defpackage.agdu agduVar) {
        agduVar.getClass();
        defpackage.ahus ahusVar = (defpackage.ahus) agduVar.getCapability(STDLIB_CLASS_FINDER_CAPABILITY);
        return ahusVar == null ? defpackage.ahtl.INSTANCE : ahusVar;
    }
}
