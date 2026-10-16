package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aggr implements defpackage.aggk {
    private final java.util.List<defpackage.aggk> delegates;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aggr(defpackage.aggk... aggkVarArr) {
        this((java.util.List<? extends defpackage.aggk>) defpackage.afga.bZ(aggkVarArr));
        aggkVarArr.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aggc findAnnotation$lambda$0(defpackage.ahof ahofVar, defpackage.aggk aggkVar) {
        aggkVar.getClass();
        return aggkVar.findAnnotation(ahofVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aisp iterator$lambda$0(defpackage.aggk aggkVar) {
        aggkVar.getClass();
        return defpackage.afga.bg(aggkVar);
    }

    @Override // defpackage.aggk
    public defpackage.aggc findAnnotation(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return (defpackage.aggc) defpackage.afsg.h(defpackage.afsg.r(defpackage.afga.bg(this.delegates), new defpackage.aggp(ahofVar)));
    }

    @Override // defpackage.aggk
    public boolean hasAnnotation(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        java.util.Iterator itA = defpackage.afga.bg(this.delegates).a();
        while (itA.hasNext()) {
            if (((defpackage.aggk) itA.next()).hasAnnotation(ahofVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aggk
    public boolean isEmpty() {
        java.util.List<defpackage.aggk> list = this.delegates;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((defpackage.aggk) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<defpackage.aggc> iterator() {
        return new defpackage.aisl((defpackage.aism) defpackage.afsg.o(defpackage.afga.bg(this.delegates), defpackage.aggq.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aggr(java.util.List<? extends defpackage.aggk> list) {
        list.getClass();
        this.delegates = list;
    }
}
