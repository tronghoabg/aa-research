package android.support.v7.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class m implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f612a;

    m(o oVar) {
        this.f612a = oVar;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        this.f612a.d();
        return bundle;
    }
}
