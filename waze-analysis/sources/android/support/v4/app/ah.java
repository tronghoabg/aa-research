package android.support.v4.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ah extends ao {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ar arVar) {
        super(null);
        this.f114a = arVar;
    }

    @Override // android.support.v4.app.ao
    final void a() {
        ar arVar = this.f114a;
        arVar.mSavedStateRegistryController.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(arVar);
        Bundle bundle = arVar.mSavedFragmentState;
        arVar.mSavedStateRegistryController.performRestore(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
