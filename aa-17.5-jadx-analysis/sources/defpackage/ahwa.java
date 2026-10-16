package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahwa implements ahwg {
    private final List<ahwg> inner;

    /* JADX WARN: Multi-variable type inference failed */
    public ahwa(List<? extends ahwg> list) {
        list.getClass();
        this.inner = list;
    }

    @Override // defpackage.ahwg
    public void generateConstructors(agba agbaVar, List<agaz> list, agvu agvuVar) {
        agbaVar.getClass();
        list.getClass();
        agvuVar.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((ahwg) it.next()).generateConstructors(agbaVar, list, agvuVar);
        }
    }

    @Override // defpackage.ahwg
    public void generateMethods(agba agbaVar, ahnj ahnjVar, Collection<agdv> collection, agvu agvuVar) {
        agbaVar.getClass();
        ahnjVar.getClass();
        collection.getClass();
        agvuVar.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((ahwg) it.next()).generateMethods(agbaVar, ahnjVar, collection, agvuVar);
        }
    }

    @Override // defpackage.ahwg
    public void generateNestedClass(agba agbaVar, ahnj ahnjVar, List<agba> list, agvu agvuVar) {
        agbaVar.getClass();
        ahnjVar.getClass();
        list.getClass();
        agvuVar.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((ahwg) it.next()).generateNestedClass(agbaVar, ahnjVar, list, agvuVar);
        }
    }

    @Override // defpackage.ahwg
    public void generateStaticFunctions(agba agbaVar, ahnj ahnjVar, Collection<agdv> collection, agvu agvuVar) {
        agbaVar.getClass();
        ahnjVar.getClass();
        collection.getClass();
        agvuVar.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((ahwg) it.next()).generateStaticFunctions(agbaVar, ahnjVar, collection, agvuVar);
        }
    }

    @Override // defpackage.ahwg
    public List<ahnj> getMethodNames(agba agbaVar, agvu agvuVar) {
        agbaVar.getClass();
        agvuVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((ahwg) it.next()).getMethodNames(agbaVar, agvuVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahwg
    public List<ahnj> getNestedClassNames(agba agbaVar, agvu agvuVar) {
        agbaVar.getClass();
        agvuVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((ahwg) it.next()).getNestedClassNames(agbaVar, agvuVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahwg
    public List<ahnj> getStaticFunctionNames(agba agbaVar, agvu agvuVar) {
        agbaVar.getClass();
        agvuVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((ahwg) it.next()).getStaticFunctionNames(agbaVar, agvuVar));
        }
        return arrayList;
    }

    @Override // defpackage.ahwg
    public agik modifyField(agba agbaVar, agik agikVar, agvu agvuVar) {
        agbaVar.getClass();
        agikVar.getClass();
        agvuVar.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            agikVar = ((ahwg) it.next()).modifyField(agbaVar, agikVar, agvuVar);
        }
        return agikVar;
    }
}
