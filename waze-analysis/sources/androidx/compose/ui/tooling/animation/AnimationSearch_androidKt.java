package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.data.Group;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimationSearch_androidKt {
    private static final String ANIMATED_CONTENT = "AnimatedContent";
    private static final String ANIMATED_VISIBILITY = "AnimatedVisibility";
    private static final String ANIMATE_VALUE_AS_STATE = "animateValueAsState";
    private static final String REMEMBER = "remember";
    private static final String REMEMBER_INFINITE_TRANSITION = "rememberInfiniteTransition";
    private static final String REMEMBER_UPDATED_STATE = "rememberUpdatedState";
    private static final String SIZE_ANIMATION_MODIFIER = "androidx.compose.animation.SizeAnimationModifierElement";
    private static final String UPDATE_TRANSITION = "updateTransition";

    private static final /* synthetic */ <T> T findData(Group group, boolean z) {
        T next;
        Collection<Object> data = group.getData();
        List children = group.getChildren();
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                i.aD(arrayList, ((Group) it.next()).getChildren());
            }
            children = i.af(children, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            i.aD(arrayList2, ((Group) it2.next()).getData());
        }
        Iterator<T> it3 = i.af(data, arrayList2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            x.i();
            if (next instanceof Object) {
                break;
            }
        }
        x.i();
        return next;
    }

    static /* synthetic */ Object findData$default(Group group, boolean z, int i2, Object obj) {
        Object next;
        Collection<Object> data = group.getData();
        List children = group.getChildren();
        if (((z ? 1 : 0) & ((i2 & 1) ^ 1)) != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                i.aD(arrayList, ((Group) it.next()).getChildren());
            }
            children = i.af(children, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            i.aD(arrayList2, ((Group) it2.next()).getData());
        }
        Iterator it3 = i.af(data, arrayList2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            x.i();
            if (next instanceof Object) {
                break;
            }
        }
        x.i();
        return next;
    }

    private static final /* synthetic */ <T> List<T> findRememberedData(Group group) {
        T next;
        List listH;
        T next2;
        T next3;
        Iterator<T> it = group.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            x.i();
            if (next instanceof Object) {
                break;
            }
        }
        x.i();
        if (next == null || (listH = i.d(next)) == null) {
            listH = i.h();
        }
        List list = listH;
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                x.i();
                if (next3 instanceof Object) {
                    break;
                }
            }
            x.i();
            if (next3 != null) {
                arrayList.add(next3);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = children.iterator();
        while (it4.hasNext()) {
            Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (groupFirstOrNull != null) {
                arrayList3.add(groupFirstOrNull);
            }
        }
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
                x.i();
                if (next2 instanceof Object) {
                    break;
                }
            }
            x.i();
            if (next2 != null) {
                arrayList5.add(next2);
            }
        }
        return i.af(list, i.af(arrayList4, arrayList5));
    }

    private static final /* synthetic */ <T> List<T> findRememberedData(Collection<? extends Group> collection) {
        T next;
        Collection<? extends Group> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (true) {
            T t = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it2 = ((Group) it.next()).getData().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                x.i();
                if (next2 instanceof Object) {
                    t = next2;
                    break;
                }
            }
            x.i();
            if (t != null) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it3.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (groupFirstOrNull != null) {
                arrayList3.add(groupFirstOrNull);
            }
        }
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Iterator<T> it5 = ((Group) it4.next()).getData().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                x.i();
                if (next instanceof Object) {
                    break;
                }
            }
            x.i();
            if (next != null) {
                arrayList5.add(next);
            }
        }
        return i.af(arrayList4, arrayList5);
    }
}
