package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahpg {
    private static final defpackage.ahpg EMPTY = new defpackage.ahpg(true);
    private static volatile boolean eagerlyParseMessageSets = false;
    private final java.util.Map<defpackage.ahpf, defpackage.ahpp<?, ?>> extensionsByNumber;

    public ahpg(defpackage.ahpg ahpgVar) {
        if (ahpgVar == EMPTY) {
            this.extensionsByNumber = java.util.Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = j$.util.DesugarCollections.unmodifiableMap(ahpgVar.extensionsByNumber);
        }
    }

    public static defpackage.ahpg getEmptyRegistry() {
        return EMPTY;
    }

    public static defpackage.ahpg newInstance() {
        return new defpackage.ahpg();
    }

    public final void add(defpackage.ahpp<?, ?> ahppVar) {
        this.extensionsByNumber.put(new defpackage.ahpf(ahppVar.getContainingTypeDefaultInstance(), ahppVar.getNumber()), ahppVar);
    }

    public <ContainingType extends defpackage.ahqg> defpackage.ahpp<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (defpackage.ahpp) this.extensionsByNumber.get(new defpackage.ahpf(containingtype, i));
    }

    public defpackage.ahpg getUnmodifiable() {
        return new defpackage.ahpg(this);
    }

    public ahpg() {
        this.extensionsByNumber = new java.util.HashMap();
    }

    private ahpg(boolean z) {
        this.extensionsByNumber = java.util.Collections.EMPTY_MAP;
    }
}
