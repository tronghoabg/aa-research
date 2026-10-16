package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class nb implements DefaultLifecycleObserver {
    public final /* synthetic */ z a;

    public nb(z zVar) {
        this.a = zVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        qb qbVar = (qb) this.a.b;
        qbVar.c = false;
        qbVar.b = null;
    }
}
