package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidDialog_androidKt$Dialog$dialog$1$1$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ State<p<Composer, Integer, ab>> $currentContent$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidDialog_androidKt$Dialog$dialog$1$1$1(State<? extends p<? super Composer, ? super Integer, ab>> state) {
        super(2);
        this.$currentContent$delegate = state;
    }

    public final void invoke(Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1338939603, i2, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:265)");
        }
        Modifier.Companion companion = Modifier.Companion;
        AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1 androidDialog_androidKt$Dialog$dialog$1$1$1$1$1RememberedValue = composer.rememberedValue();
        if (androidDialog_androidKt$Dialog$dialog$1$1$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
            androidDialog_androidKt$Dialog$dialog$1$1$1$1$1RememberedValue = AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1.INSTANCE;
            composer.updateRememberedValue(androidDialog_androidKt$Dialog$dialog$1$1$1$1$1RememberedValue);
        }
        AndroidDialog_androidKt.DialogLayout(SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) androidDialog_androidKt$Dialog$dialog$1$1$1$1$1RememberedValue), AndroidDialog_androidKt.Dialog$lambda$0(this.$currentContent$delegate), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
