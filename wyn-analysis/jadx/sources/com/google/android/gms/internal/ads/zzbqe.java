package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;
import org.json.JSONException;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzbqe implements zzbpx {
    static final Map zza;
    private final C6.b zzb;
    private final zzbyh zzc;
    private final zzbyo zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        C4412e c4412e = new C4412e(7);
        for (int i5 = 0; i5 < 7; i5++) {
            c4412e.put(strArr[i5], numArr[i5]);
        }
        zza = DesugarCollections.unmodifiableMap(c4412e);
    }

    public zzbqe(C6.b bVar, zzbyh zzbyhVar, zzbyo zzbyoVar) {
        this.zzb = bVar;
        this.zzc = zzbyhVar;
        this.zzd = zzbyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        zzclb zzclbVar = (zzclb) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i5 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                C6.b bVar = this.zzb;
                if (!bVar.a()) {
                    bVar.b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbyk(zzclbVar, map).zza();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbye(zzclbVar, map).zza();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i10 = G6.L.f4523b;
                        H6.l.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z2 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzclbVar == null) {
            int i11 = G6.L.f4523b;
            H6.l.f("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i5 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i5 = z2 ? -1 : 14;
        }
        zzclbVar.zzam(i5);
    }
}
