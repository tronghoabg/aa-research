package D6;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0386n extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f2457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0388o f2460e;

    public C0386n(C0388o c0388o, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f2457b = nativeAdView;
        this.f2458c = frameLayout;
        this.f2459d = context;
        Objects.requireNonNull(c0388o);
        this.f2460e = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2459d, "native_ad_view_delegate");
        return new k1();
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        Context context = this.f2459d;
        zzbix.zza(context);
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmo)).booleanValue();
        FrameLayout frameLayout = this.f2458c;
        NativeAdView nativeAdView = this.f2457b;
        C0388o c0388o = this.f2460e;
        if (!zBooleanValue) {
            return ((zzboe) c0388o.f2465d).zza(context, nativeAdView, frameLayout);
        }
        try {
            try {
                return zzbmo.zzdG(zzbmr.zzb(tg.b.X(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl")).zze(new BinderC3877b(context), new BinderC3877b(nativeAdView), new BinderC3877b(frameLayout), 261710000));
            } catch (Exception e7) {
                throw new H6.n(e7);
            }
        } catch (H6.n e10) {
            e = e10;
            zzcah zzcahVarZza = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza;
            zzcahVarZza.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzcah zzcahVarZza2 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza2;
            zzcahVarZza2.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzcah zzcahVarZza22 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza22;
            zzcahVarZza22.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.C(new BinderC3877b(this.f2457b), new BinderC3877b(this.f2458c));
    }
}
