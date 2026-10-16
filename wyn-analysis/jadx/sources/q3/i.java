package Q3;

import J3.r;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f9837f;

    /* renamed from: g, reason: collision with root package name */
    public final h f9838g;

    public i(Context context, b7.k kVar) {
        super(context, kVar);
        Object systemService = this.f9830b.getSystemService("connectivity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f9837f = (ConnectivityManager) systemService;
        this.f9838g = new h(this, 0);
    }

    @Override // Q3.f
    public final Object a() {
        return j.a(this.f9837f);
    }

    @Override // Q3.f
    public final void d() {
        try {
            r.d().a(j.f9839a, "Registering network callback");
            T3.j.a(this.f9837f, this.f9838g);
        } catch (IllegalArgumentException e7) {
            r.d().c(j.f9839a, "Received exception while registering network callback", e7);
        } catch (SecurityException e10) {
            r.d().c(j.f9839a, "Received exception while registering network callback", e10);
        }
    }

    @Override // Q3.f
    public final void e() {
        try {
            r.d().a(j.f9839a, "Unregistering network callback");
            T3.h.c(this.f9837f, this.f9838g);
        } catch (IllegalArgumentException e7) {
            r.d().c(j.f9839a, "Received exception while unregistering network callback", e7);
        } catch (SecurityException e10) {
            r.d().c(j.f9839a, "Received exception while unregistering network callback", e10);
        }
    }
}
