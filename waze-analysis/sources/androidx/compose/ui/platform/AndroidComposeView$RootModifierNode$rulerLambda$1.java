package androidx.compose.ui.platform;

import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$RootModifierNode$rulerLambda$1 extends y implements l<RulerScope, ab> {
    final /* synthetic */ AndroidComposeView.RootModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$RootModifierNode$rulerLambda$1(AndroidComposeView.RootModifierNode rootModifierNode) {
        super(1);
        this.this$0 = rootModifierNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RulerScope rulerScope) {
        this.this$0.setPreviousGeneration(this.this$0.getGeneration().getIntValue());
        if (this.this$0.getPreviousGeneration() <= 0 || !ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            return;
        }
        WindowInsetsRulers_androidKt.provideWindowInsetsRulers(rulerScope, this.this$0);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(RulerScope rulerScope) {
        invoke2(rulerScope);
        return ab.f48028a;
    }
}
