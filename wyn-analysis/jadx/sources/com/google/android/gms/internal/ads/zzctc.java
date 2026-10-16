package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.C0395s;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzctc implements zzcsa {
    private final CookieManager zza = C6.n.f1857D.f1866f.h();

    public zzctc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) C0395s.f2489e.f2492c.zzd(zzbix.zzbE), str);
            return;
        }
        String str2 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzbE);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZzg = zzgug.zza(zzgtf.zzd(';')).zzg(cookie);
            for (int i5 = 0; i5 < listZzg.size(); i5++) {
                Iterator it = zzgug.zza(zzgtf.zzd('=')).zzf((String) listZzg.get(i5)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(AbstractC0279p0.o(new StringBuilder(String.valueOf(0).length() + 70), "position (0) must be less than the number of elements that remained (", 0, ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) C0395s.f2489e.f2492c.zzd(zzbix.zzbp))));
            }
        }
    }
}
