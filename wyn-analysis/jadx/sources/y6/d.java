package y6;

import A7.W0;
import D6.C0395s;
import android.content.Context;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbss;
import x6.AbstractC4473d;
import x6.C4476g;

/* loaded from: classes3.dex */
public abstract class d extends I6.a {
    public static void load(Context context, String str, b bVar, e eVar) {
        AbstractC1732v.j(context, "Context cannot be null.");
        AbstractC1732v.j(str, "AdUnitId cannot be null.");
        AbstractC1732v.j(bVar, "AdManagerAdRequest cannot be null.");
        AbstractC1732v.j(eVar, "LoadCallback cannot be null.");
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzi.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                H6.c.f4936b.execute(new W0(context, str, (C4476g) bVar, (AbstractC4473d) eVar, 26));
                return;
            }
        }
        new zzbss(context, str).zza(bVar.f47736a, eVar);
    }

    public abstract void setAppEventListener(f fVar);
}
