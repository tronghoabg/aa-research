package android.support.v4.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class be implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f170a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f171b;

    public /* synthetic */ be(Object obj, int i2) {
        this.f171b = i2;
        this.f170a = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        int i2 = this.f171b;
        Object obj = this.f170a;
        if (i2 == 0) {
            return ((bv) obj).c();
        }
        av avVar = (av) obj;
        avVar.c();
        avVar.f137a.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }
}
