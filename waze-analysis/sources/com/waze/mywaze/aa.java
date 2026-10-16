package com.waze.mywaze;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa extends ViewModel implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f30539a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f30540b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableLiveData f30541c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ag.b f30542d;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MyWazeViewModel");
        h.g.b.x.e(eVarD, "create(...)");
        f30539a = eVarD;
    }

    public /* synthetic */ aa(byte[] bArr) {
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(av.b());
        com.waze.ag.b bVar = new com.waze.ag.b(new com.waze.location.q(null), com.waze.shared_infra.l.b.e());
        com.waze.z.a.b.n nVar = new com.waze.z.a.b.n((char[]) null);
        MutableLiveData mutableLiveData = new MutableLiveData();
        h.g.b.x.f(afVarE, "scope");
        h.g.b.x.f(bVar, "network");
        h.g.b.x.f(nVar, "configuration");
        h.g.b.x.f(mutableLiveData, "mutableUnseenBadeCountLiveData");
        this.f30540b = afVarE;
        this.f30542d = bVar;
        this.f30541c = mutableLiveData;
    }

    public final LiveData a() {
        return this.f30541c;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        if (com.waze.z.a.b.n.c()) {
            kotlinx.coroutines.aj.z(this.f30540b, null, null, new z(this, null), 3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    public aa() {
        this(null);
    }
}
