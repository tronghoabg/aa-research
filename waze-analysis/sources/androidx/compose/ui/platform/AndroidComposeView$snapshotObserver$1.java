package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.node.RootForTest;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$snapshotObserver$1 extends y implements l<a<? extends ab>, ab> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final a<ab> aVar) {
        RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler$ui = this.this$0.getUncaughtExceptionHandler$ui();
        if (uncaughtExceptionHandler$ui != null) {
            aVar = new AndroidComposeView$snapshotObserver$1$command$1(aVar, uncaughtExceptionHandler$ui);
        }
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(a<? extends ab> aVar) {
        invoke2((a<ab>) aVar);
        return ab.f48028a;
    }
}
