package D6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcdb;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0361b extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2407d;

    public C0361b(C0388o c0388o, Context context, String str, zzbvf zzbvfVar) {
        this.f2405b = context;
        this.f2406c = str;
        this.f2407d = zzbvfVar;
        Objects.requireNonNull(c0388o);
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2405b, "rewarded");
        return new l1();
    }

    @Override // D6.AbstractC0390p
    public final /* bridge */ /* synthetic */ Object b() {
        return zzcdb.zza(this.f2405b, this.f2406c, this.f2407d);
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.A(new BinderC3877b(this.f2405b), this.f2406c, this.f2407d, 261710000);
    }
}
