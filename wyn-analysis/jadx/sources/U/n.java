package u;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import b.C1489b;
import b.InterfaceC1491d;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f46074a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1491d f46075b;

    /* renamed from: c, reason: collision with root package name */
    public final f f46076c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f46077d;

    public n(InterfaceC1491d interfaceC1491d, f fVar, ComponentName componentName) {
        this.f46075b = interfaceC1491d;
        this.f46076c = fVar;
        this.f46077d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f46074a) {
            try {
                try {
                    ((C1489b) this.f46075b).T(this.f46076c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
