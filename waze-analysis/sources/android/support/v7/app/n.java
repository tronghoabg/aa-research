package android.support.v7.app;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class n implements OnContextAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f613a;

    n(o oVar) {
        this.f613a = oVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        o oVar = this.f613a;
        t tVarD = oVar.d();
        tVarD.i();
        oVar.getSavedStateRegistry().consumeRestoredStateForKey("androidx:appcompat");
        tVarD.y();
    }
}
