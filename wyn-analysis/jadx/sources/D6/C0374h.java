package D6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbvj;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0374h extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f2430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbvj f2432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0388o f2433f;

    public C0374h(C0388o c0388o, Context context, x1 x1Var, String str, zzbvj zzbvjVar) {
        this.f2429b = context;
        this.f2430c = x1Var;
        this.f2431d = str;
        this.f2432e = zzbvjVar;
        Objects.requireNonNull(c0388o);
        this.f2433f = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2429b, "banner");
        return new i1();
    }

    @Override // D6.AbstractC0390p
    public final /* synthetic */ Object b() {
        return ((u1) this.f2433f.f2462a).a(this.f2429b, this.f2430c, this.f2431d, this.f2432e, 1);
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.y(new BinderC3877b(this.f2429b), this.f2430c, this.f2431d, this.f2432e, 261710000);
    }
}
