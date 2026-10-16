package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.AnimationDebugMutableState;
import androidx.compose.ui.tooling.IsAnimationPreviewEnabled_androidKt;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.search.AnimateXAsStateSearchInfo;
import androidx.compose.ui.tooling.animation.search.AnimatedContentSearchInfo;
import androidx.compose.ui.tooling.animation.search.AnimatedVisibilitySearchInfo;
import androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo;
import androidx.compose.ui.tooling.animation.search.TransitionSearchInfo;
import androidx.compose.ui.tooling.animation.search.UnsupportedSearchInfo;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimationSearch {
    public static final int $stable = 8;
    private final AnimatedContentSearch animatedContentSearch;
    private final AnimatedVisibilitySearch animatedVisibilitySearch;
    private final a<PreviewAnimationClock> clock;
    private final Set<Search<? extends Object>> setToSearch;
    private final Set<Search<? extends Object>> setToTrack;
    private final Set<Search<? extends Object>> supportedSearch;
    private final TransitionSearch transitionSearch;
    private final List<TriggerSearch> triggerSearch;

    /* compiled from: WazeSource */
    public final class AnimateContentSizeSearch extends Search<Object> {
        public static final int $stable = 8;

        public AnimateContentSizeSearch(l<Object, ab> lVar) {
            super(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean addAnimations$lambda$1$0$0(AnimateContentSizeSearch animateContentSizeSearch, Modifier.Element element) {
            if (!x.n(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
                return false;
            }
            animateContentSizeSearch.getAnimations().add(element);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean hasAnimation$lambda$0$0(Modifier.Element element) {
            return x.n(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement");
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (!((Group) obj).getModifierInfo().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((Group) it.next()).getModifierInfo().iterator();
                while (it2.hasNext()) {
                    ((ModifierInfo) it2.next()).getModifier().any(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$$ExternalSyntheticLambda1
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(AnimationSearch.AnimateContentSizeSearch.addAnimations$lambda$1$0$0(this.f$0, (Modifier.Element) obj2));
                        }
                    });
                }
            }
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (!group.getModifierInfo().isEmpty()) {
                List<ModifierInfo> modifierInfo = group.getModifierInfo();
                if ((modifierInfo instanceof Collection) && modifierInfo.isEmpty()) {
                    return false;
                }
                Iterator<T> it = modifierInfo.iterator();
                while (it.hasNext()) {
                    if (((ModifierInfo) it.next()).getModifier().any(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(AnimationSearch.AnimateContentSizeSearch.hasAnimation$lambda$0$0((Modifier.Element) obj));
                        }
                    })) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 8;

        public AnimateXAsStateSearch(l<? super AnimateXAsStateSearchInfo<?, ?>, ab> lVar) {
            super(lVar);
        }

        private final <T> Animatable<T, AnimationVector> findAnimatable(CallGroup callGroup) {
            T next;
            List listH;
            T next2;
            T next3;
            CallGroup callGroup2 = callGroup;
            Iterator<T> it = callGroup2.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (next instanceof Animatable) {
                    break;
                }
            }
            if (true != (next instanceof Animatable)) {
                next = null;
            }
            Animatable animatable = next;
            if (animatable == null || (listH = i.d(animatable)) == null) {
                listH = i.h();
            }
            List list = listH;
            Collection<Group> children = callGroup2.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                    if (next3 instanceof Animatable) {
                        break;
                    }
                }
                if (true != (next3 instanceof Animatable)) {
                    next3 = null;
                }
                Animatable animatable2 = next3;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
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
                        next2 = (T) null;
                        break;
                    }
                    next2 = it6.next();
                    if (next2 instanceof Animatable) {
                        break;
                    }
                }
                if (true != (next2 instanceof Animatable)) {
                    next2 = null;
                }
                Animatable animatable3 = next2;
                if (animatable3 != null) {
                    arrayList5.add(animatable3);
                }
            }
            return (Animatable) i.R(i.af(list, i.af(arrayList4, arrayList5)));
        }

        private final <T> AnimationSpec<T> findAnimationSpec(CallGroup callGroup) {
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            for (T t : children) {
                if (x.n(((Group) t).getName(), "rememberUpdatedState")) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                i.aD(arrayList4, ((Group) it.next()).getChildren());
            }
            List listAf = i.af(arrayList3, arrayList4);
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it2 = listAf.iterator();
            while (it2.hasNext()) {
                i.aD(arrayList5, ((Group) it2.next()).getData());
            }
            ArrayList arrayList6 = new ArrayList();
            for (T t2 : arrayList5) {
                if (t2 instanceof State) {
                    arrayList6.add(t2);
                }
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList(i.q(arrayList7, 10));
            Iterator<T> it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(((State) it3.next()).getValue());
            }
            ArrayList arrayList9 = new ArrayList();
            for (T t3 : arrayList8) {
                if (t3 instanceof AnimationSpec) {
                    arrayList9.add(t3);
                }
            }
            return (AnimationSpec) i.R(arrayList9);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.tooling.animation.search.AnimateXAsStateSearchInfo] */
        private final <T> List<AnimateXAsStateSearchInfo<T, AnimationVector>> findAnimations(Collection<? extends Group> collection) {
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Animatable<T, AnimationVector> animatableFindAnimatable = findAnimatable(callGroup);
                AnimationSpec<T> animationSpecFindAnimationSpec = findAnimationSpec(callGroup);
                MutableState<State<T>> mutableStateFindToolingOverride = findToolingOverride(callGroup);
                if (animatableFindAnimatable != null && animationSpecFindAnimationSpec != null && mutableStateFindToolingOverride != null) {
                    State<T> value = mutableStateFindToolingOverride.getValue();
                    toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(animatableFindAnimatable.getValue());
                    }
                    ?? animateXAsStateSearchInfo = new AnimateXAsStateSearchInfo(animatableFindAnimatable, animationSpecFindAnimationSpec, new ToolingOverride(mutableStateFindToolingOverride, toolingState));
                    animateXAsStateSearchInfo.attach();
                    toolingState = animateXAsStateSearchInfo;
                }
                if (toolingState != null) {
                    arrayList2.add(toolingState);
                }
            }
            return arrayList2;
        }

        private final <T> MutableState<State<T>> findToolingOverride(Group group) {
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
                if (next instanceof MutableState) {
                    break;
                }
            }
            if (true != (next instanceof MutableState)) {
                next = null;
            }
            MutableState mutableState = (MutableState) next;
            if (mutableState == null || (listH = i.d(mutableState)) == null) {
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
                    if (next3 instanceof MutableState) {
                        break;
                    }
                }
                if (true != (next3 instanceof MutableState)) {
                    next3 = null;
                }
                MutableState mutableState2 = (MutableState) next3;
                if (mutableState2 != null) {
                    arrayList.add(mutableState2);
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
                    if (next2 instanceof MutableState) {
                        break;
                    }
                }
                if (true != (next2 instanceof MutableState)) {
                    next2 = null;
                }
                MutableState mutableState3 = (MutableState) next2;
                if (mutableState3 != null) {
                    arrayList5.add(mutableState3);
                }
            }
            return (MutableState) i.R(i.af(list, i.af(arrayList4, arrayList5)));
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() == null || !x.n(group.getName(), "animateValueAsState")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            getAnimations().addAll(findAnimations(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            CallGroup animationGroup = toAnimationGroup(group);
            return (animationGroup == null || findAnimatable(animationGroup) == null || findAnimationSpec(animationGroup) == null || findToolingOverride(animationGroup) == null) ? false : true;
        }
    }

    /* compiled from: WazeSource */
    public final class AnimatedContentSearch extends Search<AnimatedContentSearchInfo> {
        public static final int $stable = 8;

        public AnimatedContentSearch(l<? super AnimatedContentSearchInfo, ab> lVar) {
            super(lVar);
        }

        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !x.n(group.getName(), "AnimatedContent")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator<T> it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (x.n(((Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            Object next;
            Object next2;
            Set<AnimatedContentSearchInfo> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (true == (next2 instanceof Transition) ? next2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList5.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    }
                }
                if (true != (next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            List listAf = i.af(arrayList6, arrayList7);
            ArrayList arrayList8 = new ArrayList(i.q(listAf, 10));
            Iterator it7 = listAf.iterator();
            while (it7.hasNext()) {
                arrayList8.add(new AnimatedContentSearchInfo((Transition) it7.next()));
            }
            animations.addAll(arrayList8);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }
    }

    /* compiled from: WazeSource */
    public final class AnimatedVisibilitySearch extends Search<AnimatedVisibilitySearchInfo> {
        public static final int $stable = 8;

        public AnimatedVisibilitySearch(l<? super AnimatedVisibilitySearchInfo, ab> lVar) {
            super(lVar);
        }

        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !x.n(group.getName(), "AnimatedVisibility")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator<T> it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (x.n(((Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            Object next;
            Object next2;
            Set<AnimatedVisibilitySearchInfo> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (true == (next2 instanceof Transition) ? next2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList5.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    }
                }
                if (true != (next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            List listAf = i.af(arrayList6, arrayList7);
            ArrayList arrayList8 = new ArrayList(i.q(listAf, 10));
            Iterator it7 = listAf.iterator();
            while (it7.hasNext()) {
                arrayList8.add(new AnimatedVisibilitySearchInfo((Transition) it7.next()));
            }
            animations.addAll(arrayList8);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }
    }

    /* compiled from: WazeSource */
    public final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DecaySearch(l<? super DecayAnimation<?, ?>, ab> lVar) {
            super(new m(DecayAnimation.class), lVar);
            int i2 = ar.f48106a;
        }
    }

    /* compiled from: WazeSource */
    public final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        public static final int $stable = 8;

        public InfiniteTransitionSearch(l<? super InfiniteTransitionSearchInfo, ab> lVar) {
            super(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo] */
        private final List<InfiniteTransitionSearchInfo> findAnimations(Collection<? extends Group> collection) {
            ToolingState toolingState;
            Object next;
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Collection<Object> data = callGroup.getData();
                Collection<Group> children = callGroup.getChildren();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = children.iterator();
                while (it2.hasNext()) {
                    i.aD(arrayList3, ((Group) it2.next()).getData());
                }
                Iterator it3 = i.af(data, arrayList3).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (next instanceof InfiniteTransition) {
                        break;
                    }
                }
                if (true != (next instanceof InfiniteTransition)) {
                    next = null;
                }
                InfiniteTransition infiniteTransition = (InfiniteTransition) next;
                MutableState<State<Long>> mutableStateFindToolingOverride = findToolingOverride(callGroup);
                if (infiniteTransition != null && mutableStateFindToolingOverride != null) {
                    State<Long> value = mutableStateFindToolingOverride.getValue();
                    toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(0L);
                    }
                    ?? infiniteTransitionSearchInfo = new InfiniteTransitionSearchInfo(infiniteTransition, new ToolingOverride(mutableStateFindToolingOverride, toolingState));
                    infiniteTransitionSearchInfo.attach();
                    toolingState = infiniteTransitionSearchInfo;
                }
                if (toolingState != null) {
                    arrayList2.add(toolingState);
                }
            }
            return arrayList2;
        }

        private final MutableState<State<Long>> findToolingOverride(Group group) {
            Object next;
            Collection<Object> data = group.getData();
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                i.aD(arrayList, ((Group) it.next()).getChildren());
            }
            List listAf = i.af(children, arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listAf.iterator();
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
                if (next instanceof MutableState) {
                    break;
                }
            }
            return (MutableState) (true == (next instanceof MutableState) ? next : null);
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() == null || !x.n(group.getName(), "rememberInfiniteTransition")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            getAnimations().addAll(findAnimations(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            Object next;
            if (toAnimationGroup(group) != null) {
                Collection<Object> data = group.getData();
                Collection<Group> children = group.getChildren();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    i.aD(arrayList, ((Group) it.next()).getData());
                }
                Iterator it2 = i.af(data, arrayList).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next instanceof InfiniteTransition) {
                        break;
                    }
                }
                if (((InfiniteTransition) (true == (next instanceof InfiniteTransition) ? next : null)) != null && findToolingOverride(group) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    public abstract class Search<T> {
        public static final int $stable = 8;
        private final Set<T> animations = new LinkedHashSet();
        private final l<T, ab> trackAnimation;

        /* JADX WARN: Multi-variable type inference failed */
        public Search(l<? super T, ab> lVar) {
            this.trackAnimation = lVar;
        }

        public void addAnimations(Collection<? extends Group> collection) {
        }

        public final Set<T> getAnimations() {
            return this.animations;
        }

        public abstract boolean hasAnimation(Group group);

        public final boolean hasAnimations(Collection<? extends Group> collection) {
            Collection<? extends Group> collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (hasAnimation((Group) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final void track() {
            Iterator<T> it = i.ai(this.animations).iterator();
            while (it.hasNext()) {
                this.trackAnimation.invoke(it.next());
            }
        }
    }

    /* compiled from: WazeSource */
    public final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TargetBasedSearch(l<? super TargetBasedAnimation<?, ?>, ab> lVar) {
            super(new m(TargetBasedAnimation.class), lVar);
            int i2 = ar.f48106a;
        }
    }

    /* compiled from: WazeSource */
    public final class TransitionSearch extends Search<TransitionSearchInfo> {
        public static final int $stable = 8;

        public TransitionSearch(l<? super TransitionSearchInfo, ab> lVar) {
            super(lVar);
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() == null || !x.n(group.getName(), "updateTransition")) {
                return null;
            }
            return group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            Object next;
            Object next2;
            Set<TransitionSearchInfo> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (true == (next2 instanceof Transition) ? next2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (groupFirstOrNull != null) {
                    arrayList5.add(groupFirstOrNull);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    }
                }
                if (true != (next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            List listAf = i.af(arrayList6, arrayList7);
            ArrayList arrayList8 = new ArrayList(i.q(listAf, 10));
            Iterator it7 = listAf.iterator();
            while (it7.hasNext()) {
                arrayList8.add(new TransitionSearchInfo((Transition) it7.next()));
            }
            animations.addAll(arrayList8);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }
    }

    /* compiled from: WazeSource */
    public final class TriggerSearch extends Search<TriggerComposeAnimation<?>> {
        public static final int $stable = 8;

        public TriggerSearch(l<? super TriggerComposeAnimation<?>, ab> lVar) {
            super(lVar);
        }

        static final boolean hasAnimation$lambda$0(Object obj) {
            return obj instanceof AnimationDebugMutableState;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (x.n(((Group) obj).getName(), "remember")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Collection<Object> data = ((Group) obj2).getData();
                if (!(data instanceof Collection) || !data.isEmpty()) {
                    Iterator<T> it = data.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() instanceof AnimationDebugMutableState) {
                                arrayList2.add(obj2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Collection<Object> data2 = ((Group) it2.next()).getData();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : data2) {
                    if (obj3 instanceof AnimationDebugMutableState) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = arrayList4;
                ArrayList arrayList6 = new ArrayList(i.q(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(TriggerComposeAnimation.Companion.parse((AnimationDebugMutableState) it3.next()));
                }
                i.aD(arrayList3, arrayList6);
            }
            List listAc = i.ac(arrayList3);
            HashSet hashSet = new HashSet();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : listAc) {
                if (hashSet.add(((TriggerComposeAnimation) obj4).getAnimationObject())) {
                    arrayList7.add(obj4);
                }
            }
            getAnimations().addAll(arrayList7);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return group.getData().contains(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$TriggerSearch$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AnimationSearch.TriggerSearch.hasAnimation$lambda$0(obj));
                }
            });
        }
    }

    public static /* synthetic */ boolean $r8$lambda$cMvJsTJhw3hZOG60vfqxBRs6hS8(Group group) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$urFQ1uiZ_ezwuFf5ls30jKUPDSo(Group group) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationSearch(a<? extends PreviewAnimationClock> aVar) {
        this.clock = aVar;
        this.triggerSearch = IsAnimationPreviewEnabled_androidKt.isAnimationPreviewEnabled() ? i.d(new TriggerSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.triggerSearch$lambda$0(this.f$0, (TriggerComposeAnimation) obj);
            }
        })) : i.h();
        this.transitionSearch = new TransitionSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.transitionSearch$lambda$0(this.f$0, (TransitionSearchInfo) obj);
            }
        });
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.animatedContentSearch$lambda$0(this.f$0, (AnimatedContentSearchInfo) obj);
            }
        });
        this.animatedContentSearch = animatedContentSearch;
        this.animatedVisibilitySearch = new AnimatedVisibilitySearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.animatedVisibilitySearch$lambda$0(this.f$0, (AnimatedVisibilitySearchInfo) obj);
            }
        });
        Set<Search<? extends Object>> setSupportedSearch = supportedSearch();
        this.supportedSearch = setSupportedSearch;
        Set<Search<? extends Object>> setV = e.c.d.a.v(setSupportedSearch, unsupportedSearch());
        this.setToTrack = setV;
        this.setToSearch = e.c.d.a.v(setV, e.c.d.a.o(animatedContentSearch));
    }

    private final Collection<AnimateXAsStateSearch> animateXAsStateSearch() {
        return AnimateXAsStateComposeAnimation.Companion.getApiAvailable() ? e.c.d.a.o(new AnimateXAsStateSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda9
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.animateXAsStateSearch$lambda$0(this.f$0, (AnimateXAsStateSearchInfo) obj);
            }
        })) : i.h();
    }

    static final ab animateXAsStateSearch$lambda$0(AnimationSearch animationSearch, AnimateXAsStateSearchInfo animateXAsStateSearchInfo) {
        animationSearch.clock.invoke().trackComposeAnimation(animateXAsStateSearchInfo);
        return ab.f48028a;
    }

    static final ab animatedContentSearch$lambda$0(AnimationSearch animationSearch, AnimatedContentSearchInfo animatedContentSearchInfo) {
        animationSearch.clock.invoke().trackComposeAnimation(animatedContentSearchInfo);
        return ab.f48028a;
    }

    static final ab animatedVisibilitySearch$lambda$0(AnimationSearch animationSearch, AnimatedVisibilitySearchInfo animatedVisibilitySearchInfo) {
        animationSearch.clock.invoke().trackComposeAnimation(animatedVisibilitySearchInfo);
        return ab.f48028a;
    }

    private static final boolean attachAllAnimations$lambda$0$0(Group group) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachAllAnimations$lambda$0$4(Set set, TransitionSearchInfo transitionSearchInfo) {
        return set.contains(transitionSearchInfo.getTransition());
    }

    private final Set<InfiniteTransitionSearch> infiniteTransitionSearch() {
        return InfiniteTransitionComposeAnimation.Companion.getApiAvailable() ? e.c.d.a.o(new InfiniteTransitionSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda10
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.infiniteTransitionSearch$lambda$0(this.f$0, (InfiniteTransitionSearchInfo) obj);
            }
        })) : e.c.d.a.p();
    }

    static final ab infiniteTransitionSearch$lambda$0(AnimationSearch animationSearch, InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
        animationSearch.clock.invoke().trackComposeAnimation(infiniteTransitionSearchInfo);
        return ab.f48028a;
    }

    private static final boolean searchAny$lambda$0$0(Group group) {
        return true;
    }

    private final Set<Search<? extends Object>> supportedSearch() {
        return e.c.d.a.v(e.c.d.a.v(e.c.d.a.v(e.c.d.a.v(e.c.d.a.r(this.transitionSearch, this.animatedVisibilitySearch), animateXAsStateSearch()), infiniteTransitionSearch()), this.triggerSearch), AnimatedContentComposeAnimation.Companion.getApiAvailable() ? e.c.d.a.o(this.animatedContentSearch) : e.c.d.a.p());
    }

    static final ab transitionSearch$lambda$0(AnimationSearch animationSearch, TransitionSearchInfo transitionSearchInfo) {
        animationSearch.clock.invoke().trackComposeAnimation(transitionSearchInfo);
        return ab.f48028a;
    }

    static final ab triggerSearch$lambda$0(AnimationSearch animationSearch, TriggerComposeAnimation triggerComposeAnimation) {
        animationSearch.clock.invoke().trackTrigger(triggerComposeAnimation);
        return ab.f48028a;
    }

    private final Collection<Search<? extends Object>> unsupportedSearch() {
        return UnsupportedComposeAnimation.Companion.getApiAvailable() ? e.c.d.a.r(new AnimateContentSizeSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.unsupportedSearch$lambda$0(this.f$0, obj);
            }
        }), new TargetBasedSearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.unsupportedSearch$lambda$1(this.f$0, (TargetBasedAnimation) obj);
            }
        }), new DecaySearch(new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationSearch.unsupportedSearch$lambda$2(this.f$0, (DecayAnimation) obj);
            }
        })) : i.h();
    }

    static final ab unsupportedSearch$lambda$0(AnimationSearch animationSearch, Object obj) {
        animationSearch.clock.invoke().trackComposeAnimation(new UnsupportedSearchInfo(obj, "animateContentSize"));
        return ab.f48028a;
    }

    static final ab unsupportedSearch$lambda$1(AnimationSearch animationSearch, TargetBasedAnimation targetBasedAnimation) {
        animationSearch.clock.invoke().trackComposeAnimation(new UnsupportedSearchInfo(targetBasedAnimation, "TargetBasedAnimation"));
        return ab.f48028a;
    }

    static final ab unsupportedSearch$lambda$2(AnimationSearch animationSearch, DecayAnimation decayAnimation) {
        animationSearch.clock.invoke().trackComposeAnimation(new UnsupportedSearchInfo(decayAnimation, "DecayAnimation"));
        return ab.f48028a;
    }

    public final void attachAllAnimations(Collection<? extends Group> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            List<Group> listFindAll = PreviewUtils_androidKt.findAll((Group) it.next(), new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return true;
                }
            });
            Iterator<T> it2 = this.setToSearch.iterator();
            while (it2.hasNext()) {
                ((Search) it2.next()).addAnimations(listFindAll);
            }
            Set<AnimatedVisibilitySearchInfo> animations = this.animatedVisibilitySearch.getAnimations();
            ArrayList arrayList = new ArrayList(i.q(animations, 10));
            Iterator<T> it3 = animations.iterator();
            while (it3.hasNext()) {
                arrayList.add(((AnimatedVisibilitySearchInfo) it3.next()).getTransition());
            }
            Set setAu = i.au(arrayList);
            Set<AnimatedContentSearchInfo> animations2 = this.animatedContentSearch.getAnimations();
            ArrayList arrayList2 = new ArrayList(i.q(animations2, 10));
            Iterator<T> it4 = animations2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((AnimatedContentSearchInfo) it4.next()).getTransition());
            }
            final Set setV = e.c.d.a.v(setAu, i.au(arrayList2));
            i.z(this.transitionSearch.getAnimations(), new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AnimationSearch.attachAllAnimations$lambda$0$4(setV, (TransitionSearchInfo) obj));
                }
            });
        }
        Iterator<T> it5 = this.setToTrack.iterator();
        while (it5.hasNext()) {
            ((Search) it5.next()).track();
        }
    }

    public final boolean searchAny(Collection<? extends Group> collection) {
        Collection<? extends Group> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            List<Group> listFindAll = PreviewUtils_androidKt.findAll((Group) it.next(), new l() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda11
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return true;
                }
            });
            Set<Search<? extends Object>> set = this.supportedSearch;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((Search) it2.next()).hasAnimations(listFindAll)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* compiled from: WazeSource */
    public class RememberSearch<T> extends Search<T> {
        public static final int $stable = 8;
        private final c<T> clazz;

        public RememberSearch(c<T> cVar, l<? super T, ab> lVar) {
            super(lVar);
            this.clazz = cVar;
        }

        private final <T> T findRememberCallWithType(Group group, c<T> cVar) {
            T next;
            Class<?> cls;
            Iterator<T> it = group.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x.n((next == null || (cls = next.getClass()) == null) ? null : o.y(cls), cVar)) {
                    break;
                }
            }
            x.f(cVar, "<this>");
            if (!cVar.d(next)) {
                return null;
            }
            x.d(next, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return next;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (T t : collection) {
                if (((Group) t).getLocation() != null) {
                    arrayList.add(t);
                }
            }
            getAnimations().addAll(i.au(findRememberCallWithType(arrayList, this.clazz)));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return (group.getLocation() == null || findRememberCallWithType(group, this.clazz) == null) ? false : true;
        }

        private final <T> List<T> findRememberCallWithType(Collection<? extends Group> collection, c<T> cVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                T tFindRememberCallWithType = findRememberCallWithType((Group) it.next(), cVar);
                if (tFindRememberCallWithType != null) {
                    arrayList.add(tFindRememberCallWithType);
                }
            }
            return arrayList;
        }
    }
}
