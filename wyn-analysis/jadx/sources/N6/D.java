package N6;

import com.google.android.gms.internal.ads.zzdls;
import com.google.android.gms.internal.ads.zzdzo;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class D implements zzdls {

    /* renamed from: a, reason: collision with root package name */
    public final zzdzo f8440a;

    /* renamed from: b, reason: collision with root package name */
    public final C f8441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8442c;

    public D(zzdzo zzdzoVar, C c10, String str) {
        this.f8440a = zzdzoVar;
        this.f8441b = c10;
        this.f8442c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(s sVar) {
        if (sVar == null) {
            return;
        }
        C c10 = this.f8441b;
        String str = this.f8442c;
        zzdzo zzdzoVar = this.f8440a;
        String str2 = sVar.f8541b;
        synchronized (c10) {
            C6.n.f1857D.k.getClass();
            c10.f8435e.put(str, new B(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            c10.e();
            c10.f(zzdzoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
    }
}
