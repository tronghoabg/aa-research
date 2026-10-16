package C6;

import G6.B;
import G6.U;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcdu;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1808a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1809b;

    /* renamed from: c, reason: collision with root package name */
    public final zzcdu f1810c;

    /* renamed from: d, reason: collision with root package name */
    public final zzcar f1811d = new zzcar(false, Collections.EMPTY_LIST);

    public b(Context context, zzcdu zzcduVar) {
        this.f1808a = context;
        this.f1810c = zzcduVar;
    }

    public final boolean a() {
        zzcdu zzcduVar = this.f1810c;
        return ((zzcduVar == null || !zzcduVar.zza().zzf) && !this.f1811d.zza) || this.f1809b;
    }

    public final void b(String str) {
        List<String> list;
        zzcar zzcarVar = this.f1811d;
        zzcdu zzcduVar = this.f1810c;
        if ((zzcduVar == null || !zzcduVar.zza().zzf) && !zzcarVar.zza) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (zzcduVar != null) {
            zzcduVar.zze(str, null, 3);
            return;
        }
        if (!zzcarVar.zza || (list = zzcarVar.zzb) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                U u10 = n.f1857D.f1863c;
                new B(this.f1808a, "", strReplace, null).zzb();
            }
        }
    }
}
