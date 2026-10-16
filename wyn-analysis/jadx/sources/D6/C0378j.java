package D6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbvf;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0378j extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f2442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0388o f2445f;

    public C0378j(C0388o c0388o, Context context, x1 x1Var, String str, zzbvf zzbvfVar) {
        this.f2441b = context;
        this.f2442c = x1Var;
        this.f2443d = str;
        this.f2444e = zzbvfVar;
        Objects.requireNonNull(c0388o);
        this.f2445f = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2441b, "interstitial");
        return new i1();
    }

    @Override // D6.AbstractC0390p
    public final /* synthetic */ Object b() {
        u1 u1Var = (u1) this.f2445f.f2462a;
        zzbvf zzbvfVar = this.f2444e;
        return u1Var.a(this.f2441b, this.f2442c, this.f2443d, zzbvfVar, 2);
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.u(new BinderC3877b(this.f2441b), this.f2442c, this.f2443d, this.f2444e, 261710000);
    }
}
