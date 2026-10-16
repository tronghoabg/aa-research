package D6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbrh;
import com.google.android.gms.internal.ads.zzbvf;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0372g extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2426c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B6.b f2427d;

    public C0372g(C0388o c0388o, Context context, zzbvf zzbvfVar, B6.b bVar) {
        this.f2425b = context;
        this.f2426c = zzbvfVar;
        this.f2427d = bVar;
        Objects.requireNonNull(c0388o);
    }

    @Override // D6.AbstractC0390p
    public final /* synthetic */ Object a() {
        return new zzbrh();
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        Context context = this.f2425b;
        BinderC3877b binderC3877b = new BinderC3877b(context);
        try {
            try {
                return zzbrc.zzb(tg.b.X(context).b("com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl")).zze(binderC3877b, this.f2426c, 261710000, new zzbqu(this.f2427d));
            } catch (H6.n | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e7) {
            throw new H6.n(e7);
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.I(new BinderC3877b(this.f2425b), this.f2426c, 261710000, new zzbqu(this.f2427d));
    }
}
