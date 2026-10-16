package G6;

import D6.C0395s;
import android.content.Context;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzbix;
import java.util.HashMap;
import java.util.Map;

/* renamed from: G6.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0560y {

    /* renamed from: a, reason: collision with root package name */
    public static zzato f4647a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4648b = new Object();

    public C0560y(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f4648b) {
            try {
                if (f4647a == null) {
                    zzbix.zza(context);
                    f4647a = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfy)).booleanValue() ? C0550n.a(context) : zzauq.zza(context, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0558w a(int i5, String str, HashMap map, byte[] bArr) {
        C0558w c0558w = new C0558w();
        S3.s sVar = new S3.s(this, str, c0558w);
        H6.i iVar = new H6.i();
        C0557v c0557v = new C0557v(this, i5, str, c0558w, sVar, bArr, map, iVar);
        if (H6.i.c()) {
            try {
                Map mapZzm = c0557v.zzm();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (H6.i.c()) {
                    iVar.e("onNetworkRequest", new S3.n(str, "GET", mapZzm, bArr2));
                }
            } catch (zzast e7) {
                String message = e7.getMessage();
                int i10 = L.f4523b;
                H6.l.f(message);
            }
        }
        f4647a.zzb(c0557v);
        return c0558w;
    }
}
