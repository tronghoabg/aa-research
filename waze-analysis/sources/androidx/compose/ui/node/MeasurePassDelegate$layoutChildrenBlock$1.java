package androidx.compose.ui.node;

import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MeasurePassDelegate$layoutChildrenBlock$1 extends y implements a<ab> {
    final /* synthetic */ MeasurePassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeasurePassDelegate$layoutChildrenBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.clearPlaceOrder();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass1.INSTANCE);
        if (this.this$0.getInnerCoordinator().isPlacingForAlignment$ui()) {
            List<LayoutNode> children$ui = this.this$0.getLayoutNode().getChildren$ui();
            int size = children$ui.size();
            for (int i2 = 0; i2 < size; i2++) {
                children$ui.get(i2).getOuterCoordinator$ui().setPlacingForAlignment$ui(true);
            }
        }
        this.this$0.getInnerCoordinator().getMeasureResult$ui().placeChildren();
        if (this.this$0.getInnerCoordinator().isPlacingForAlignment$ui()) {
            List<LayoutNode> children$ui2 = this.this$0.getLayoutNode().getChildren$ui();
            int size2 = children$ui2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                children$ui2.get(i3).getOuterCoordinator$ui().setPlacingForAlignment$ui(false);
            }
        }
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass4.INSTANCE);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<AlignmentLinesOwner, ab> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui(false);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(AlignmentLinesOwner alignmentLinesOwner) {
            invoke2(alignmentLinesOwner);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$4, reason: invalid class name */
    final class AnonymousClass4 extends y implements l<AlignmentLinesOwner, ab> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui());
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(AlignmentLinesOwner alignmentLinesOwner) {
            invoke2(alignmentLinesOwner);
            return ab.f48028a;
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
