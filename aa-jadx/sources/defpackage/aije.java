package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aije extends defpackage.aijg {
    final /* synthetic */ boolean $approximateCapturedTypes;
    final /* synthetic */ java.util.Map<defpackage.aijd, defpackage.aijn> $map;

    /* JADX WARN: Multi-variable type inference failed */
    public aije(java.util.Map<defpackage.aijd, ? extends defpackage.aijn> map, boolean z) {
        this.$map = map;
        this.$approximateCapturedTypes = z;
    }

    @Override // defpackage.aijt
    public boolean approximateCapturedTypes() {
        return this.$approximateCapturedTypes;
    }

    @Override // defpackage.aijg
    public defpackage.aijn get(defpackage.aijd aijdVar) {
        aijdVar.getClass();
        return this.$map.get(aijdVar);
    }

    @Override // defpackage.aijt
    public boolean isEmpty() {
        return this.$map.isEmpty();
    }
}
