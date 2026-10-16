package androidx.compose.ui.platform;

import android.view.Choreographer;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidUiFrameClock$withFrameNanos$2$2 extends y implements l<Throwable, ab> {
    final /* synthetic */ Choreographer.FrameCallback $callback;
    final /* synthetic */ AndroidUiFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidUiFrameClock$withFrameNanos$2$2(AndroidUiFrameClock androidUiFrameClock, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.this$0 = androidUiFrameClock;
        this.$callback = frameCallback;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.getChoreographer().removeFrameCallback(this.$callback);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
        invoke2(th);
        return ab.f48028a;
    }
}
