package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aibw implements defpackage.aggk {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.aibw.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    private final defpackage.aifc annotations$delegate;

    public aibw(defpackage.aifi aifiVar, defpackage.afer<? extends java.util.List<? extends defpackage.aggc>> aferVar) {
        aifiVar.getClass();
        aferVar.getClass();
        this.annotations$delegate = aifiVar.createLazyValue(aferVar);
    }

    private final java.util.List<defpackage.aggc> getAnnotations() {
        return (java.util.List) defpackage.aifh.getValue(this.annotations$delegate, this, $$delegatedProperties[0]);
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
        return getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<defpackage.aggc> iterator() {
        return getAnnotations().iterator();
    }
}
