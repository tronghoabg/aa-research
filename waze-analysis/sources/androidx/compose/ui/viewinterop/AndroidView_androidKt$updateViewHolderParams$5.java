package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.p;
import h.g.b.y;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidView_androidKt$updateViewHolderParams$5 extends y implements p<LayoutNode, LayoutDirection, ab> {
    public static final AndroidView_androidKt$updateViewHolderParams$5 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$5();

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AndroidView_androidKt$updateViewHolderParams$5() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        int i2;
        ViewFactoryHolder viewFactoryHolderRequireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal != 1) {
                throw new i();
            }
        } else {
            i2 = 0;
        }
        viewFactoryHolderRequireViewFactoryHolder.setLayoutDirection(i2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        invoke2(layoutNode, layoutDirection);
        return ab.f48028a;
    }
}
