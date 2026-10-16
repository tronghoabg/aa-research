package androidx.compose.ui.platform;

import androidx.compose.ui.node.RootForTest;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$snapshotObserver$1$command$1 extends y implements a<ab> {
    final /* synthetic */ a<ab> $command;
    final /* synthetic */ RootForTest.UncaughtExceptionHandler $exceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1$command$1(a<ab> aVar, RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(0);
        this.$command = aVar;
        this.$exceptionHandler = uncaughtExceptionHandler;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        try {
            this.$command.invoke();
        } catch (Exception e2) {
            this.$exceptionHandler.onUncaughtException(e2);
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
