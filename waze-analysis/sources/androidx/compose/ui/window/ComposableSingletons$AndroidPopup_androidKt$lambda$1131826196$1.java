package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* renamed from: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda$-1131826196$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1 extends y implements p<Composer, Integer, ab> {
    public static final ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1 INSTANCE = new ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1();

    ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1() {
        super(2);
    }

    public final void invoke(Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1131826196, i2, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda$-1131826196.<anonymous> (AndroidPopup.android.kt:698)");
        }
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
