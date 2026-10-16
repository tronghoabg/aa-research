package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import h.a.i;
import h.a.u;
import h.g.a.r;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CompositionCallStack<T, R> implements SourceContext {
    private IntRect bounds;
    private final Map<CompositionGroup, List<R>> childrenToAdd;
    private final Map<String, Object> contexts;
    private final r<CompositionGroup, SourceContext, List<? extends T>, List<? extends R>, T> createNode;
    private int currentCallIndex;
    private final u<CompositionGroup> stack;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionCallStack(r<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? super List<? extends R>, ? extends T> rVar, Map<String, Object> map, Map<CompositionGroup, List<R>> map2) {
        this.createNode = rVar;
        this.contexts = map;
        this.childrenToAdd = map2;
        this.stack = new u<>();
        this.bounds = SlotTreeKt.getEmptyBox();
    }

    private final SourceInformationContext contextOf(String str) {
        Map<String, Object> map = this.contexts;
        Object objSourceInformationContextOf$default = map.get(str);
        if (objSourceInformationContextOf$default == null) {
            objSourceInformationContextOf$default = SlotTreeKt.sourceInformationContextOf$default(str, null, 2, null);
            map.put(str, objSourceInformationContextOf$default);
        }
        if (objSourceInformationContextOf$default instanceof SourceInformationContext) {
            return (SourceInformationContext) objSourceInformationContextOf$default;
        }
        return null;
    }

    private final CompositionGroup getCurrent() {
        return (CompositionGroup) this.stack.c();
    }

    private final boolean isCall(CompositionGroup compositionGroup) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo != null) {
            return o.ah(sourceInfo, "C");
        }
        return false;
    }

    private final CompositionGroup parentGroup(int i2) {
        if (this.stack.size() <= i2) {
            return null;
        }
        return this.stack.get((r1.size() - i2) - 1);
    }

    private final CompositionGroup pop() {
        return this.stack.removeLast();
    }

    private final void push(CompositionGroup compositionGroup) {
        this.stack.addLast(compositionGroup);
    }

    public final IntRect convert(CompositionGroup compositionGroup, int i2, List<T> list) {
        ArrayList arrayList = new ArrayList();
        IntRect emptyBox = SlotTreeKt.getEmptyBox();
        push(compositionGroup);
        int i3 = 0;
        for (CompositionGroup compositionGroup2 : compositionGroup.getCompositionGroups()) {
            emptyBox = SlotTreeKt.union(emptyBox, convert(compositionGroup2, i3, arrayList));
            if (isCall(compositionGroup2)) {
                i3++;
            }
        }
        Object node = compositionGroup.getNode();
        List<R> listH = null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (layoutInfo == null || layoutInfo.isVirtual()) {
            layoutInfo = null;
        }
        if (layoutInfo != null) {
            emptyBox = SlotTreeKt.boundsOfLayoutNode(layoutInfo);
        }
        this.currentCallIndex = i2;
        this.bounds = emptyBox;
        Map<CompositionGroup, List<R>> map = this.childrenToAdd;
        if (map != null) {
            if (true == map.isEmpty()) {
                map = null;
            }
            if (map != null) {
                listH = map.remove(compositionGroup);
            }
        }
        r<CompositionGroup, SourceContext, List<? extends T>, List<? extends R>, T> rVar = this.createNode;
        if (listH == null) {
            listH = i.h();
        }
        T tInvoke = rVar.invoke(compositionGroup, this, arrayList, listH);
        if (tInvoke != null) {
            list.add(tInvoke);
        }
        pop();
        return emptyBox;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.size();
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        String sourceInfo;
        SourceInformationContext sourceInformationContextContextOf;
        String sourceInfo2;
        CompositionGroup compositionGroupParentGroup = parentGroup(1);
        if (compositionGroupParentGroup == null || (sourceInfo = compositionGroupParentGroup.getSourceInfo()) == null || (sourceInformationContextContextOf = contextOf(sourceInfo)) == null) {
            return null;
        }
        int i2 = 2;
        SourceInformationContext sourceInformationContextContextOf2 = sourceInformationContextContextOf;
        while (i2 < this.stack.size()) {
            if ((sourceInformationContextContextOf2 != null ? sourceInformationContextContextOf2.getSourceFile() : null) != null) {
                break;
            }
            int i3 = i2 + 1;
            CompositionGroup compositionGroupParentGroup2 = parentGroup(i2);
            sourceInformationContextContextOf2 = (compositionGroupParentGroup2 == null || (sourceInfo2 = compositionGroupParentGroup2.getSourceInfo()) == null) ? null : contextOf(sourceInfo2);
            i2 = i3;
        }
        return sourceInformationContextContextOf.sourceLocation(this.currentCallIndex, sourceInformationContextContextOf2);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public String getName() {
        int i2;
        String sourceInfo = getCurrent().getSourceInfo();
        if (sourceInfo == null) {
            return null;
        }
        if (o.ah(sourceInfo, "CC(")) {
            i2 = 3;
        } else {
            if (!o.ah(sourceInfo, "C(")) {
                return null;
            }
            i2 = 2;
        }
        int iW = o.W(sourceInfo, ')', 0, 6);
        if (iW <= 2) {
            return null;
        }
        String strSubstring = sourceInfo.substring(i2, iW);
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public List<ParameterInformation> getParameters() {
        SourceInformationContext sourceInformationContextContextOf;
        CompositionGroup current = getCurrent();
        String sourceInfo = current.getSourceInfo();
        if (sourceInfo == null || (sourceInformationContextContextOf = contextOf(sourceInfo)) == null) {
            return i.h();
        }
        ArrayList arrayList = new ArrayList();
        i.aD(arrayList, current.getData());
        return SlotTreeKt.extractParameterInfo(arrayList, sourceInformationContextContextOf);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String sourceInfo = getCurrent().getSourceInfo();
        return sourceInfo != null && o.ah(sourceInfo, "CC");
    }

    public /* synthetic */ CompositionCallStack(r rVar, Map map, Map map2, int i2, h.g.b.o oVar) {
        this(rVar, map, (i2 & 4) != 0 ? null : map2);
    }
}
