package android.support.v4.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bj implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f175a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ca f176b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Lifecycle f177c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bv f178d;

    bj(bv bvVar, String str, ca caVar, Lifecycle lifecycle) {
        this.f178d = bvVar;
        this.f175a = str;
        this.f176b = caVar;
        this.f177c = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            bv bvVar = this.f178d;
            String str = this.f175a;
            Bundle bundle = (Bundle) bvVar.q.get(str);
            if (bundle != null) {
                this.f176b.onFragmentResult(str, bundle);
                bvVar.J(str);
            }
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f177c.removeObserver(this);
            bv bvVar2 = this.f178d;
            bvVar2.r.remove(this.f175a);
        }
    }
}
