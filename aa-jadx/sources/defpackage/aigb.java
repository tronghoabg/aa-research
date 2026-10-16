package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aigb {
    private final java.util.Collection<defpackage.aihl> allSupertypes;
    private java.util.List<? extends defpackage.aihl> supertypesWithoutCycles;

    /* JADX WARN: Multi-variable type inference failed */
    public aigb(java.util.Collection<? extends defpackage.aihl> collection) {
        collection.getClass();
        this.allSupertypes = collection;
        this.supertypesWithoutCycles = defpackage.afga.aa(defpackage.aimm.INSTANCE.getErrorTypeForLoopInSupertypes());
    }

    public final java.util.Collection<defpackage.aihl> getAllSupertypes() {
        return this.allSupertypes;
    }

    public final java.util.List<defpackage.aihl> getSupertypesWithoutCycles() {
        return this.supertypesWithoutCycles;
    }

    public final void setSupertypesWithoutCycles(java.util.List<? extends defpackage.aihl> list) {
        list.getClass();
        this.supertypesWithoutCycles = list;
    }
}
