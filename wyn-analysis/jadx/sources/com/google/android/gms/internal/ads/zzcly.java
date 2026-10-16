package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcly implements zzbpx {
    final /* synthetic */ zzcme zza;

    public zzcly(zzcme zzcmeVar) {
        Objects.requireNonNull(zzcmeVar);
        this.zza = zzcmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i5 = Integer.parseInt(str);
                zzcme zzcmeVar = this.zza;
                synchronized (zzcmeVar) {
                    try {
                        if (zzcmeVar.zzaX() != i5) {
                            zzcmeVar.zzaY(i5);
                            zzcmeVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e7) {
                int i10 = G6.L.f4523b;
                H6.l.g("Exception occurred while getting webview content height", e7);
            }
        }
    }
}
