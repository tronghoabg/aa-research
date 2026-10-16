package G6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfsd;

/* loaded from: classes3.dex */
public final class B extends AbstractC0552p {

    /* renamed from: a, reason: collision with root package name */
    public final H6.p f4494a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4495b;

    /* renamed from: c, reason: collision with root package name */
    public final H6.q f4496c;

    public B(Context context, String str, String str2, H6.q qVar) {
        this.f4494a = new H6.p(context, C6.n.f1857D.f1863c.E(context, str));
        this.f4495b = str2;
        this.f4496c = qVar;
    }

    @Override // G6.AbstractC0552p
    public final void zza() {
        String str = this.f4495b;
        H6.q qVar = this.f4496c;
        if (qVar == null) {
            this.f4494a.a(null, str);
        } else {
            new zzfsd(qVar.f4969a, this.f4494a, zzcfy.zze, null, null).zza(str);
        }
    }
}
