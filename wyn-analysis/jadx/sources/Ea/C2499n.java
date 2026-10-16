package ea;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import jf.InterfaceC3108h;

/* renamed from: ea.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2499n {

    /* renamed from: a, reason: collision with root package name */
    public final s8.g f34567a;

    /* renamed from: b, reason: collision with root package name */
    public final ga.j f34568b;

    public C2499n(s8.g gVar, ga.j jVar, InterfaceC3108h interfaceC3108h, V v2) {
        this.f34567a = gVar;
        this.f34568b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.f45328a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(X.f34506a);
            Ef.H.D(Ef.H.c(interfaceC3108h), null, new C2498m(this, interfaceC3108h, v2, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
