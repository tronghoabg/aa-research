package z6;

import A7.W0;
import D6.C0395s;
import H6.c;
import H6.l;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import x6.AbstractC4473d;
import x6.AbstractC4480k;
import x6.C4476g;
import x6.InterfaceC4486q;
import x6.t;
import x6.x;

/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4619b {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return x.a(context).zzh(str);
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(Context context, String str, C4476g c4476g, AbstractC4618a abstractC4618a) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "adUnitId cannot be null.");
        AbstractC1732v.j(c4476g, "AdRequest cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzd.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                c.f4936b.execute(new W0(context, str, c4476g, (AbstractC4473d) abstractC4618a, 27));
                return;
            }
        }
        new zzbgy(context, str, c4476g.f47736a, abstractC4618a).zza();
    }

    @Deprecated
    public static AbstractC4619b pollAd(Context context, String str) {
        try {
            zzbgq zzbgqVarZzi = x.a(context).zzi(str);
            if (zzbgqVarZzi != null) {
                return new zzbgm(zzbgqVarZzi, str);
            }
            l.i("Failed to obtain an App Open ad from the preloader.", null);
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
