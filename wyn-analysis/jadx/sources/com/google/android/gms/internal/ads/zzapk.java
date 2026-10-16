package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzapk implements zzans {
    private final zzeu zza = new zzeu();
    private final zzapb zzb = new zzapb();

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i5, int i10, zzanr zzanrVar, zzdu zzduVar) throws zzat {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i10 + i5);
        zzeuVar.zzh(i5);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzeuVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzeuVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzeuVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzeuVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c10 = 65535;
                int iZzg2 = 0;
                while (c10 == 65535) {
                    iZzg2 = zzeuVar.zzg();
                    String strZzN2 = zzeuVar.zzN(StandardCharsets.UTF_8);
                    c10 = strZzN2 == null ? (char) 0 : "STYLE".equals(strZzN2) ? (char) 2 : strZzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzeuVar.zzh(iZzg2);
                if (c10 == 0) {
                    zzanm.zza(new zzapn(arrayList2), zzanrVar, zzduVar);
                    return;
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c10 != 2) {
                    zzapd zzapdVarZza = zzapj.zza(zzeuVar, arrayList);
                    if (zzapdVarZza != null) {
                        arrayList2.add(zzapdVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzeuVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzeuVar));
                }
            }
        } catch (zzat e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
