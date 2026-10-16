package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcaf;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0366d extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f2413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2414c;

    public C0366d(C0388o c0388o, OutOfContextTestingActivity outOfContextTestingActivity, zzbvf zzbvfVar) {
        this.f2413b = outOfContextTestingActivity;
        this.f2414c = zzbvfVar;
        Objects.requireNonNull(c0388o);
    }

    @Override // D6.AbstractC0390p
    public final /* bridge */ /* synthetic */ Object a() {
        C0388o.k(this.f2413b, "out_of_context_tester");
        return null;
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        E0 e02;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f2413b;
        BinderC3877b binderC3877b = new BinderC3877b(outOfContextTestingActivity);
        zzbix.zza(outOfContextTestingActivity);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkU)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = tg.b.X(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        e02 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        e02 = iInterfaceQueryLocalInterface instanceof E0 ? (E0) iInterfaceQueryLocalInterface : new E0(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    }
                    return e02.R(binderC3877b, this.f2414c);
                } catch (Exception e7) {
                    throw new H6.n(e7);
                }
            } catch (H6.n e10) {
                e = e10;
                zzcaf.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            } catch (RemoteException e11) {
                e = e11;
                zzcaf.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                zzcaf.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f2413b;
        BinderC3877b binderC3877b = new BinderC3877b(outOfContextTestingActivity);
        zzbix.zza(outOfContextTestingActivity);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkU)).booleanValue()) {
            return interfaceC0367d0.N(binderC3877b, this.f2414c, 261710000);
        }
        return null;
    }
}
