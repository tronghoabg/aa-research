package Q3;

import A7.V1;
import J3.r;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: f, reason: collision with root package name */
    public final V1 f9827f;

    public d(Context context, b7.k kVar) {
        super(context, kVar);
        this.f9827f = new V1(this, 6);
    }

    @Override // Q3.f
    public final void d() {
        r.d().a(e.f9828a, getClass().getSimpleName().concat(": registering receiver"));
        this.f9830b.registerReceiver(this.f9827f, f());
    }

    @Override // Q3.f
    public final void e() {
        r.d().a(e.f9828a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f9830b.unregisterReceiver(this.f9827f);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
