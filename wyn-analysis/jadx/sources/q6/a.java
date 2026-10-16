package Q6;

import A7.W0;
import D6.C0395s;
import D6.c1;
import H6.c;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbzz;
import x6.C4476g;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f9884a;

    public a(c1 c1Var) {
        this.f9884a = c1Var;
    }

    public static void a(Context context, EnumC4471b enumC4471b, C4476g c4476g, b bVar) {
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzj.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                c.f4936b.execute(new W0(context, enumC4471b, c4476g, bVar, 8, false));
                return;
            }
        }
        new zzbzz(context, enumC4471b, c4476g == null ? null : c4476g.f47736a, null).zzb(bVar);
    }
}
