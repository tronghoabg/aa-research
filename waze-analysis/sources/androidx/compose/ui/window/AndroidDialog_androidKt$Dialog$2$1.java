package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidDialog_androidKt$Dialog$2$1 extends y implements a<ab> {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ a<ab> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$Dialog$2$1(DialogWrapper dialogWrapper, a<ab> aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = aVar;
        this.$properties = dialogProperties;
        this.$layoutDirection = layoutDirection;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
