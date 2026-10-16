package R6;

import A7.W0;
import D6.C0395s;
import H6.l;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzccy;
import x6.AbstractC4473d;
import x6.AbstractC4480k;
import x6.C4476g;
import x6.InterfaceC4486q;
import x6.InterfaceC4487r;
import x6.t;
import x6.x;

/* loaded from: classes3.dex */
public abstract class c {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        try {
            return x.a(context).zzf(str);
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(Context context, String str, C4476g c4476g, d dVar) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        AbstractC1732v.j(c4476g, "AdRequest cannot be null.");
        AbstractC1732v.j(dVar, "LoadCallback cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzk.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                H6.c.f4936b.execute(new W0(context, str, c4476g, (AbstractC4473d) dVar, 10));
                return;
            }
        }
        l.a("Loading on UI thread");
        new zzccy(context, str).zza(c4476g.f47736a, dVar);
    }

    @Deprecated
    public static c pollAd(Context context, String str) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        try {
            zzccp zzccpVarZzg = x.a(context).zzg(str);
            if (zzccpVarZzg != null) {
                return new zzccy(context, str, zzccpVarZzg);
            }
            l.i("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract t getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC4480k abstractC4480k);

    public abstract void setImmersiveMode(boolean z2);

    public abstract void setOnAdMetadataChangedListener(a aVar);

    public abstract void setOnPaidEventListener(InterfaceC4486q interfaceC4486q);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, InterfaceC4487r interfaceC4487r);

    public static void load(Context context, String str, y6.b bVar, d dVar) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        AbstractC1732v.j(bVar, "AdManagerAdRequest cannot be null.");
        AbstractC1732v.j(dVar, "LoadCallback cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzk.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                l.a("Loading on background thread");
                H6.c.f4936b.execute(new W0(context, str, (C4476g) bVar, (AbstractC4473d) dVar, 9));
                return;
            }
        }
        l.a("Loading on UI thread");
        new zzccy(context, str).zza(bVar.f47736a, dVar);
    }
}
