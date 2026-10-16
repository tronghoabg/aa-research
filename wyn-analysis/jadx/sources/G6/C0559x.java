package G6;

import A.C0230x;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzaui;
import com.google.android.gms.internal.ads.zzcgd;
import java.io.IOException;
import java.util.Map;

/* renamed from: G6.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0559x extends zzatl {

    /* renamed from: a, reason: collision with root package name */
    public final zzcgd f4645a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.i f4646b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0559x(String str, zzcgd zzcgdVar) throws IOException {
        super(0, str, new S3.l(zzcgdVar));
        this.f4645a = zzcgdVar;
        H6.i iVar = new H6.i();
        this.f4646b = iVar;
        if (H6.i.c()) {
            iVar.e("onNetworkRequest", new S3.n(str, "GET", null, 0 == true ? 1 : 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final zzatr zzr(zzath zzathVar) {
        return zzatr.zza(zzathVar, zzaui.zza(zzathVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final void zzs(Object obj) throws IOException {
        zzath zzathVar = (zzath) obj;
        Map map = zzathVar.zzc;
        int i5 = zzathVar.zza;
        H6.i iVar = this.f4646b;
        iVar.getClass();
        if (H6.i.c()) {
            iVar.e("onNetworkResponse", new C0230x(i5, map, 3));
            if (i5 < 200 || i5 >= 300) {
                iVar.e("onNetworkRequestError", new H6.g(null, 0));
            }
        }
        byte[] bArr = zzathVar.zzb;
        if (H6.i.c() && bArr != null) {
            iVar.e("onNetworkResponseBody", new S3.l(bArr));
        }
        this.f4645a.zzc(zzathVar);
    }
}
