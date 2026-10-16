package G6;

import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzefo;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzimz;

/* loaded from: classes3.dex */
public final class H implements zzimz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4507a;

    /* renamed from: b, reason: collision with root package name */
    public final zzimz f4508b;

    public /* synthetic */ H(zzimz zzimzVar, int i5) {
        this.f4507a = i5;
        this.f4508b = zzimzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        switch (this.f4507a) {
            case 0:
                return new G(((zzcnz) this.f4508b).zza());
            case 1:
                return new M6.d(((zzcnz) this.f4508b).zza());
            default:
                return new N6.r(zzfoi.zzc(), ((zzefo) this.f4508b).zzb());
        }
    }
}
