package O6;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcop;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* loaded from: classes3.dex */
public final class b implements zzimz {

    /* renamed from: a, reason: collision with root package name */
    public final zzcnz f8881a;

    /* renamed from: b, reason: collision with root package name */
    public final zzcop f8882b;

    /* renamed from: c, reason: collision with root package name */
    public final zzini f8883c;

    /* renamed from: d, reason: collision with root package name */
    public final zzini f8884d;

    /* renamed from: e, reason: collision with root package name */
    public final zzini f8885e;

    public b(zzcnz zzcnzVar, zzcop zzcopVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.f8881a = zzcnzVar;
        this.f8882b = zzcopVar;
        this.f8883c = zziniVar;
        this.f8884d = zziniVar2;
        this.f8885e = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a zzb() {
        return new a((Context) this.f8881a.zzb(), (H6.a) this.f8882b.zzb(), (PackageInfo) this.f8883c.zzb(), (String) this.f8884d.zzb(), (M6.d) this.f8885e.zzb());
    }
}
