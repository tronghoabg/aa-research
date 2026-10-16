package androidx.compose.ui.semantics;

import h.a.i;
import h.g.a.p;
import h.g.b.y;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SemanticsActions$CustomActions$1 extends y implements p<List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>> {
    public static final SemanticsActions$CustomActions$1 INSTANCE = new SemanticsActions$CustomActions$1();

    SemanticsActions$CustomActions$1() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<CustomAccessibilityAction> invoke2(List<CustomAccessibilityAction> list, List<CustomAccessibilityAction> list2) {
        if (list == null) {
            list = i.h();
        }
        return i.af(list, list2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ List<? extends CustomAccessibilityAction> invoke(List<? extends CustomAccessibilityAction> list, List<? extends CustomAccessibilityAction> list2) {
        return invoke2((List<CustomAccessibilityAction>) list, (List<CustomAccessibilityAction>) list2);
    }
}
