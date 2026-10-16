package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.NodeChainKt$fillVector$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Modifier.Element, Boolean> {
        final /* synthetic */ MutableVector<Modifier.Element> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableVector<Modifier.Element> mutableVector) {
            super(1);
            this.$result = mutableVector;
        }

        @Override // h.g.a.l
        public final Boolean invoke(Modifier.Element element) {
            this.$result.add(element);
            return true;
        }
    }

    public static final /* synthetic */ MutableVector access$fillVector(Modifier modifier, MutableVector mutableVector, MutableVector mutableVector2) {
        fillVector(modifier, mutableVector, mutableVector2);
        return mutableVector;
    }

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (x.n(element, element2)) {
            return 2;
        }
        return !Actual_jvmAndAndroidKt.areObjectsOfSameType(element, element2) ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final MutableVector<Modifier.Element> fillVector(Modifier modifier, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier> mutableVector2) {
        mutableVector2.add(modifier);
        AnonymousClass1 anonymousClass1 = null;
        while (mutableVector2.getSize() != 0) {
            Modifier modifierRemoveAt = mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifierRemoveAt instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifierRemoveAt;
                mutableVector2.add(combinedModifier.getInner$ui());
                mutableVector2.add(combinedModifier.getOuter$ui());
            } else if (modifierRemoveAt instanceof Modifier.Element) {
                mutableVector.add(modifierRemoveAt);
            } else {
                if (anonymousClass1 == null) {
                    anonymousClass1 = new AnonymousClass1(mutableVector);
                }
                modifierRemoveAt.all(anonymousClass1);
            }
        }
        return mutableVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        x.d(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }
}
