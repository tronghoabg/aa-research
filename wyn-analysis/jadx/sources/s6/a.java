package S6;

import A7.W0;
import D6.C0395s;
import H6.c;
import R6.e;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcdj;
import x6.AbstractC4473d;
import x6.AbstractC4480k;
import x6.C4476g;
import x6.InterfaceC4486q;
import x6.InterfaceC4487r;
import x6.t;

/* loaded from: classes3.dex */
public abstract class a {
    public static void load(Context context, String str, C4476g c4476g, b bVar) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        AbstractC1732v.j(c4476g, "AdRequest cannot be null.");
        AbstractC1732v.j(bVar, "LoadCallback cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzk.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                c.f4936b.execute(new W0(context, str, c4476g, (AbstractC4473d) bVar, 12));
                return;
            }
        }
        new zzcdj(context, str).zza(c4476g.f47736a, bVar);
    }

    public abstract t getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC4480k abstractC4480k);

    public abstract void setImmersiveMode(boolean z2);

    public abstract void setOnAdMetadataChangedListener(R6.a aVar);

    public abstract void setOnPaidEventListener(InterfaceC4486q interfaceC4486q);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, InterfaceC4487r interfaceC4487r);

    public static void load(Context context, String str, y6.b bVar, b bVar2) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        AbstractC1732v.j(bVar, "AdManagerAdRequest cannot be null.");
        AbstractC1732v.j(bVar2, "LoadCallback cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzk.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                c.f4936b.execute(new W0(context, str, (C4476g) bVar, (AbstractC4473d) bVar2, 11));
                return;
            }
        }
        new zzcdj(context, str).zza(bVar.f47736a, bVar2);
    }
}
