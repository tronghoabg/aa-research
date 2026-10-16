package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1460y extends Service implements InterfaceC1457v {

    /* renamed from: a, reason: collision with root package name */
    public final b7.k f18699a = new b7.k(this);

    @Override // androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        return (C1459x) this.f18699a.f19396b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC3340k.e(intent, "intent");
        this.f18699a.E(EnumC1449m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f18699a.E(EnumC1449m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC1449m enumC1449m = EnumC1449m.ON_STOP;
        b7.k kVar = this.f18699a;
        kVar.E(enumC1449m);
        kVar.E(EnumC1449m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i5) {
        this.f18699a.E(EnumC1449m.ON_START);
        super.onStart(intent, i5);
    }
}
