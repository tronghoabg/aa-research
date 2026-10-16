package N6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcop;
import com.google.android.gms.internal.ads.zzcri;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* loaded from: classes3.dex */
public final class q implements zzimz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8535a;

    /* renamed from: b, reason: collision with root package name */
    public final zzcnz f8536b;

    /* renamed from: c, reason: collision with root package name */
    public final zzini f8537c;

    public /* synthetic */ q(zzcnz zzcnzVar, zzini zziniVar, int i5) {
        this.f8535a = i5;
        this.f8536b = zzcnzVar;
        this.f8537c = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f8535a) {
            case 0:
                Context contextZza = this.f8536b.zza();
                zzcri.zza();
                return new C0777b(contextZza, zzexz.zzc(), ((zzcop) this.f8537c).zza());
            default:
                return new x(this.f8536b.zza(), (zzdzy) this.f8537c.zzb(), zzfoi.zzc());
        }
    }
}
