package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$resendMotionEventOnLayout$1 extends y implements a<ab> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MotionEvent motionEvent = this.this$0.previousMotionEvent;
        if (motionEvent != null) {
            boolean zContains = i.i(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
            MotionEvent motionEvent2 = this.this$0.previousMotionEvent;
            boolean z = motionEvent2 == null || motionEvent2.getButtonState() != 0;
            if (zContains && !z) {
                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.post(androidComposeView.resendMotionEventRunnable);
            }
        }
        this.this$0.layoutChildViewsIfNeeded.invoke();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
