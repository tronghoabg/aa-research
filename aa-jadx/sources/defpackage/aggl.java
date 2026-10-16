package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aggl implements defpackage.aggk {
    private final java.util.List<defpackage.aggc> annotations;

    /* JADX WARN: Multi-variable type inference failed */
    public aggl(java.util.List<? extends defpackage.aggc> list) {
        list.getClass();
        this.annotations = list;
    }

    @Override // defpackage.aggk
    public /* bridge */ defpackage.aggc findAnnotation(defpackage.ahof ahofVar) {
        return defpackage.aggj.findAnnotation(this, ahofVar);
    }

    @Override // defpackage.aggk
    public /* bridge */ boolean hasAnnotation(defpackage.ahof ahofVar) {
        return defpackage.aggj.hasAnnotation(this, ahofVar);
    }

    @Override // defpackage.aggk
    public boolean isEmpty() {
        return this.annotations.isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<defpackage.aggc> iterator() {
        return this.annotations.iterator();
    }

    public java.lang.String toString() {
        return this.annotations.toString();
    }
}
