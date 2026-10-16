package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionDataKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CompositionDataTree<T, R> {
    private final ContextCache cache;
    private final Set<CompositionData> compositions;
    private final r<CompositionGroup, SourceContext, List<? extends T>, List<? extends R>, T> createNode;
    private final q<CompositionInstance, T, List<? extends CompositionInstance>, R> createResult;
    private final l<CompositionInstance, ab> prepareResult;
    private final Map<CompositionInstance, List<CompositionInstance>> hierarchy = new LinkedHashMap();
    private final Map<CompositionInstance, R> processedNodes = new LinkedHashMap();
    private final Set<CompositionInstance> rootCompositionInstances = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionDataTree(Set<? extends CompositionData> set, l<? super CompositionInstance, ab> lVar, r<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? super List<? extends R>, ? extends T> rVar, q<? super CompositionInstance, ? super T, ? super List<? extends CompositionInstance>, ? extends R> qVar, ContextCache contextCache) {
        this.compositions = set;
        this.prepareResult = lVar;
        this.createNode = rVar;
        this.createResult = qVar;
        this.cache = contextCache;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CompositionInstance compositionInstanceFindCompositionInstance = CompositionDataKt.findCompositionInstance((CompositionData) it.next());
            if (compositionInstanceFindCompositionInstance != null) {
                buildCompositionParentHierarchy(compositionInstanceFindCompositionInstance);
            }
        }
    }

    private final void buildCompositionParentHierarchy(CompositionInstance compositionInstance) {
        CompositionInstance parent = compositionInstance.getParent();
        while (true) {
            CompositionInstance compositionInstance2 = parent;
            CompositionInstance compositionInstance3 = compositionInstance;
            compositionInstance = compositionInstance2;
            if (compositionInstance == null) {
                this.rootCompositionInstances.add(compositionInstance3);
                return;
            }
            Map<CompositionInstance, List<CompositionInstance>> map = this.hierarchy;
            ArrayList arrayList = map.get(compositionInstance);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(compositionInstance, arrayList);
            }
            List<CompositionInstance> list = arrayList;
            if (list.contains(compositionInstance3)) {
                return;
            }
            list.add(compositionInstance3);
            parent = compositionInstance.getParent();
        }
    }

    private final R mapTree(CompositionInstance compositionInstance) {
        if (this.processedNodes.containsKey(compositionInstance)) {
            return this.processedNodes.get(compositionInstance);
        }
        CompositionData data = compositionInstance.getData();
        List<CompositionInstance> listH = this.hierarchy.get(compositionInstance);
        if (listH == null) {
            listH = i.h();
        }
        Iterator<CompositionInstance> it = listH.iterator();
        while (it.hasNext()) {
            mapTree(it.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<CompositionInstance> arrayList = new ArrayList();
        for (T t : listH) {
            if (this.processedNodes.containsKey((CompositionInstance) t)) {
                arrayList.add(t);
            }
        }
        for (CompositionInstance compositionInstance2 : arrayList) {
            CompositionGroup compositionGroupFindContextGroup = compositionInstance2.findContextGroup();
            x.c(compositionGroupFindContextGroup);
            Object obj = linkedHashMap.get(compositionGroupFindContextGroup);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(compositionGroupFindContextGroup, obj);
            }
            R r = this.processedNodes.get(compositionInstance2);
            x.c(r);
            ((List) obj).add(r);
        }
        this.prepareResult.invoke(compositionInstance);
        R r2 = (R) this.createResult.invoke(compositionInstance, SlotTreeKt.mapTreeWithStitching(data, this.createNode, this.cache, linkedHashMap), listH);
        this.processedNodes.put(compositionInstance, r2);
        return r2;
    }

    public final List<R> build() {
        Set<CompositionInstance> set = this.rootCompositionInstances;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            R rMapTree = mapTree((CompositionInstance) it.next());
            if (rMapTree != null) {
                arrayList.add(rMapTree);
            }
        }
        return arrayList;
    }
}
