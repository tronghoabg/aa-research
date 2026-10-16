package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NestedContentMap {
    private final MutableScatterMap<Object, Object> contentMap = MultiValueMap.m7360constructorimpl$default(null, 1, null);
    private final MutableScatterMap<Object, Object> containerMap = MultiValueMap.m7360constructorimpl$default(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean usedContainer$lambda$0$0(MovableContentStateReference movableContentStateReference, NestedMovableContent nestedMovableContent) {
        return x.n(nestedMovableContent.getContainer(), movableContentStateReference);
    }

    public final void add(MovableContent<Object> movableContent, NestedMovableContent nestedMovableContent) {
        MultiValueMap.m7356addimpl(this.contentMap, movableContent, nestedMovableContent);
        MultiValueMap.m7356addimpl(this.containerMap, nestedMovableContent.getContainer(), movableContent);
    }

    public final void clear() {
        MultiValueMap.m7358clearimpl(this.contentMap);
        MultiValueMap.m7358clearimpl(this.containerMap);
    }

    public final boolean contains(MovableContent<Object> movableContent) {
        return MultiValueMap.m7361containsimpl(this.contentMap, movableContent);
    }

    public final NestedMovableContent removeLast(MovableContent<Object> movableContent) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m7371removeLastimpl(this.contentMap, movableContent);
        if (MultiValueMap.m7368isEmptyimpl(this.contentMap)) {
            MultiValueMap.m7358clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void usedContainer(final MovableContentStateReference movableContentStateReference) {
        Object obj = this.containerMap.get(movableContentStateReference);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                MultiValueMap.m7372removeValueIfimpl(this.contentMap, (MovableContent) obj, new l() { // from class: androidx.compose.runtime.NestedContentMap$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(NestedContentMap.usedContainer$lambda$0$0(movableContentStateReference, (NestedMovableContent) obj2));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i2 = objectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj2 = objArr[i3];
                x.d(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.m7372removeValueIfimpl(this.contentMap, (MovableContent) obj2, new l() { // from class: androidx.compose.runtime.NestedContentMap$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj22) {
                        return Boolean.valueOf(NestedContentMap.usedContainer$lambda$0$0(movableContentStateReference, (NestedMovableContent) obj22));
                    }
                });
            }
        }
    }
}
