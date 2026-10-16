package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahxa implements defpackage.ahxg {
    private final java.util.List<defpackage.ahxg> inner;

    /* JADX WARN: Multi-variable type inference failed */
    public ahxa(java.util.List<? extends defpackage.ahxg> list) {
        list.getClass();
        this.inner = list;
    }

    @Override // defpackage.ahxg
    public void generateConstructors(defpackage.agca agcaVar, java.util.List<defpackage.agbz> list, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        list.getClass();
        agwuVar.getClass();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((defpackage.ahxg) it.next()).generateConstructors(agcaVar, list, agwuVar);
        }
    }

    @Override // defpackage.ahxg
    public void generateMethods(defpackage.agca agcaVar, defpackage.ahoj ahojVar, java.util.Collection<defpackage.agev> collection, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        ahojVar.getClass();
        collection.getClass();
        agwuVar.getClass();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((defpackage.ahxg) it.next()).generateMethods(agcaVar, ahojVar, collection, agwuVar);
        }
    }

    @Override // defpackage.ahxg
    public void generateNestedClass(defpackage.agca agcaVar, defpackage.ahoj ahojVar, java.util.List<defpackage.agca> list, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        ahojVar.getClass();
        list.getClass();
        agwuVar.getClass();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((defpackage.ahxg) it.next()).generateNestedClass(agcaVar, ahojVar, list, agwuVar);
        }
    }

    @Override // defpackage.ahxg
    public void generateStaticFunctions(defpackage.agca agcaVar, defpackage.ahoj ahojVar, java.util.Collection<defpackage.agev> collection, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        ahojVar.getClass();
        collection.getClass();
        agwuVar.getClass();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((defpackage.ahxg) it.next()).generateStaticFunctions(agcaVar, ahojVar, collection, agwuVar);
        }
    }

    @Override // defpackage.ahxg
    public java.util.List<defpackage.ahoj> getMethodNames(defpackage.agca agcaVar, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        agwuVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, ((defpackage.ahxg) it.next()).getMethodNames(agcaVar, agwuVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahxg
    public java.util.List<defpackage.ahoj> getNestedClassNames(defpackage.agca agcaVar, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        agwuVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, ((defpackage.ahxg) it.next()).getNestedClassNames(agcaVar, agwuVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahxg
    public java.util.List<defpackage.ahoj> getStaticFunctionNames(defpackage.agca agcaVar, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        agwuVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, ((defpackage.ahxg) it.next()).getStaticFunctionNames(agcaVar, agwuVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahxg
    public defpackage.agjk modifyField(defpackage.agca agcaVar, defpackage.agjk agjkVar, defpackage.agwu agwuVar) {
        agcaVar.getClass();
        agjkVar.getClass();
        agwuVar.getClass();
        java.util.Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            agjkVar = ((defpackage.ahxg) it.next()).modifyField(agcaVar, agjkVar, agwuVar);
        }
        return agjkVar;
    }
}
