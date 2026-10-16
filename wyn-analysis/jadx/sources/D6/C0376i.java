package D6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbvj;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0376i extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f2436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbvj f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0388o f2439f;

    public C0376i(C0388o c0388o, Context context, x1 x1Var, String str, zzbvj zzbvjVar) {
        this.f2435b = context;
        this.f2436c = x1Var;
        this.f2437d = str;
        this.f2438e = zzbvjVar;
        Objects.requireNonNull(c0388o);
        this.f2439f = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2435b, "app_open");
        return new i1();
    }

    @Override // D6.AbstractC0390p
    public final /* synthetic */ Object b() {
        return ((u1) this.f2439f.f2462a).a(this.f2435b, this.f2436c, this.f2437d, this.f2438e, 4);
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.O(new BinderC3877b(this.f2435b), this.f2436c, this.f2437d, this.f2438e, 261710000);
    }
}
