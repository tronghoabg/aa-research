package androidx.compose.ui.node;

import h.d.a;
import h.d.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TraversableNode extends DelegatableNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WazeSource */
        public final class TraverseDescendantsAction {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TraverseDescendantsAction[] $VALUES;
            public static final TraverseDescendantsAction ContinueTraversal = new TraverseDescendantsAction("ContinueTraversal", 0);
            public static final TraverseDescendantsAction SkipSubtreeAndContinueTraversal = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
            public static final TraverseDescendantsAction CancelTraversal = new TraverseDescendantsAction("CancelTraversal", 2);

            private static final /* synthetic */ TraverseDescendantsAction[] $values() {
                return new TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
            }

            static {
                TraverseDescendantsAction[] traverseDescendantsActionArr$values = $values();
                $VALUES = traverseDescendantsActionArr$values;
                $ENTRIES = b.a(traverseDescendantsActionArr$values);
            }

            private TraverseDescendantsAction(String str, int i2) {
            }

            public static a<TraverseDescendantsAction> getEntries() {
                return $ENTRIES;
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) $VALUES.clone();
            }
        }

        private Companion() {
        }
    }

    Object getTraverseKey();
}
