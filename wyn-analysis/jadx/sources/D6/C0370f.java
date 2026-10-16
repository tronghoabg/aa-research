package D6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzd;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0370f extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2423c;

    public C0370f(C0388o c0388o, Context context, zzbvf zzbvfVar) {
        this.f2422b = context;
        this.f2423c = zzbvfVar;
        Objects.requireNonNull(c0388o);
    }

    @Override // D6.AbstractC0390p
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        Context context = this.f2422b;
        BinderC3877b binderC3877b = new BinderC3877b(context);
        try {
            try {
                return zzbzd.zzb(tg.b.X(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl")).zze(binderC3877b, this.f2423c, 261710000);
            } catch (H6.n | RemoteException | NullPointerException unused) {
                return null;
            }
        } catch (Exception e7) {
            throw new H6.n(e7);
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.J(new BinderC3877b(this.f2422b), this.f2423c, 261710000);
    }
}
