package G6;

import D6.C0392q;
import D6.C0395s;
import android.content.Context;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatu;
import com.google.android.gms.internal.ads.zzaua;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzfzu;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: G6.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0550n extends zzaua {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4625a;

    public C0550n(Context context, zzaum zzaumVar) {
        super(zzaumVar);
        this.f4625a = context;
    }

    public static zzato a(Context context) {
        zzato zzatoVar = new zzato(new zzauh(new File(zzfzu.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new C0550n(context, new zzaum(null, null)), 4);
        zzatoVar.zza();
        return zzatoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaua, com.google.android.gms.internal.ads.zzate
    public final zzath zza(zzatl zzatlVar) throws zzatu {
        if (zzatlVar.zza() == 0) {
            if (Pattern.matches((String) C0395s.f2489e.f2492c.zzd(zzbix.zzfz), zzatlVar.zzh())) {
                H6.f fVar = C0392q.f2477g.f2478a;
                d7.f fVar2 = d7.f.f34129b;
                Context context = this.f4625a;
                if (fVar2.d(context, 13400000) == 0) {
                    zzath zzathVarZza = new zzbrv(context).zza(zzatlVar);
                    if (zzathVarZza != null) {
                        L.k("Got gmscore asset response: ".concat(String.valueOf(zzatlVar.zzh())));
                        return zzathVarZza;
                    }
                    L.k("Failed to get gmscore asset response: ".concat(String.valueOf(zzatlVar.zzh())));
                }
            }
        }
        return super.zza(zzatlVar);
    }
}
