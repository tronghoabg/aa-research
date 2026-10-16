package Q3;

import J3.r;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f9840g;

    public k(Context context, b7.k kVar) {
        super(context, kVar);
        Object systemService = this.f9830b.getSystemService("connectivity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f9840g = (ConnectivityManager) systemService;
    }

    @Override // Q3.f
    public final Object a() {
        return j.a(this.f9840g);
    }

    @Override // Q3.d
    public final IntentFilter f() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // Q3.d
    public final void g(Intent intent) {
        if (AbstractC3340k.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            r.d().a(j.f9839a, "Network broadcast received");
            c(j.a(this.f9840g));
        }
    }
}
