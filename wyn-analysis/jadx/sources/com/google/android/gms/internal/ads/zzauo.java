package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzauo extends zzatl {
    private final Object zza;
    private final zzatq zzb;

    public zzauo(int i5, String str, zzatq zzatqVar, zzatp zzatpVar) {
        super(i5, str, zzatpVar);
        this.zza = new Object();
        this.zzb = zzatqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final zzatr zzr(zzath zzathVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzathVar.zzb;
            Map map = zzathVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i5 = 1;
                while (true) {
                    if (i5 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i5].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i5++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzathVar.zzb);
        }
        return zzatr.zza(str, zzaui.zza(zzathVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzatq zzatqVar;
        synchronized (this.zza) {
            zzatqVar = this.zzb;
        }
        zzatqVar.zza(str);
    }
}
