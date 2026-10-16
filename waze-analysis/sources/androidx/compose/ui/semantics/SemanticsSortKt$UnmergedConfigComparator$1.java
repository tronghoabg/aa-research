package androidx.compose.ui.semantics;

import h.g.a.a;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SemanticsSortKt$UnmergedConfigComparator$1 extends y implements p<SemanticsNode, SemanticsNode, Integer> {
    public static final SemanticsSortKt$UnmergedConfigComparator$1 INSTANCE = new SemanticsSortKt$UnmergedConfigComparator$1();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<Float> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements a<Float> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    SemanticsSortKt$UnmergedConfigComparator$1() {
        super(2);
    }

    @Override // h.g.a.p
    public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        return Integer.valueOf(Float.compare(((Number) semanticsNode.getUnmergedConfig$ui().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), AnonymousClass1.INSTANCE)).floatValue(), ((Number) semanticsNode2.getUnmergedConfig$ui().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), AnonymousClass2.INSTANCE)).floatValue()));
    }
}
