package androidx.core.os;

import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ a<ab> $action;

    public HandlerKt$postDelayed$runnable$1(a<ab> aVar) {
        this.$action = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
