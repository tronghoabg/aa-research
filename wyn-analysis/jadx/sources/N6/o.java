package N6;

import com.google.android.gms.internal.ads.zzdky;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* loaded from: classes3.dex */
public final class o implements zzimz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8529a;

    /* renamed from: b, reason: collision with root package name */
    public final zzini f8530b;

    public /* synthetic */ o(zzini zziniVar, int i5) {
        this.f8529a = i5;
        this.f8530b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f8529a) {
            case 0:
                return new zzdky((D) this.f8530b.zzb(), zzfoi.zzc());
            default:
                return new C((zzdzy) this.f8530b.zzb());
        }
    }
}
