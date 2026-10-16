package androidx.compose.ui.spatial;

import android.os.Trace;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RectManager$dispatchLambda$1 extends y implements a<ab> {
    final /* synthetic */ RectManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RectManager$dispatchLambda$1(RectManager rectManager) {
        super(0);
        this.this$0 = rectManager;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.dispatchToken = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            this.this$0.dispatchCallbacks();
        } finally {
            Trace.endSection();
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
