package I6;

import A7.W0;
import D6.C0395s;
import D6.L;
import H6.c;
import H6.l;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbss;
import x6.AbstractC4473d;
import x6.AbstractC4480k;
import x6.C4476g;
import x6.InterfaceC4486q;
import x6.t;
import x6.x;

/* loaded from: classes3.dex */
public abstract class a {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return x.a(context).zzj(str);
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(Context context, String str, C4476g c4476g, b bVar) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        AbstractC1732v.j(c4476g, "AdRequest cannot be null.");
        AbstractC1732v.j(bVar, "LoadCallback cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzi.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                c.f4936b.execute(new W0(context, str, c4476g, (AbstractC4473d) bVar, 6));
                return;
            }
        }
        new zzbss(context, str).zza(c4476g.f47736a, bVar);
    }

    @Deprecated
    public static a pollAd(Context context, String str) {
        try {
            L lZzk = x.a(context).zzk(str);
            if (lZzk != null) {
                return new zzbss(context, str, lZzk);
            }
            l.i("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract t getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC4480k abstractC4480k);

    public abstract void setImmersiveMode(boolean z2);

    public abstract void setOnPaidEventListener(InterfaceC4486q interfaceC4486q);

    public abstract void show(Activity activity);
}
