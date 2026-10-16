package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzaue {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzaue(String str, String str2, long j8, long j10, long j11, long j12, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j8;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = list;
    }

    public static zzaue zza(zzauf zzaufVar) throws IOException {
        if (zzauh.zzi(zzaufVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzauh.zzm(zzaufVar);
        String strZzm2 = zzauh.zzm(zzaufVar);
        long jZzk = zzauh.zzk(zzaufVar);
        long jZzk2 = zzauh.zzk(zzaufVar);
        long jZzk3 = zzauh.zzk(zzaufVar);
        long jZzk4 = zzauh.zzk(zzaufVar);
        int iZzi = zzauh.zzi(zzaufVar);
        if (iZzi < 0) {
            throw new IOException(N0.a.d(iZzi, "readHeaderList size=", new StringBuilder(String.valueOf(iZzi).length() + 20)));
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i5 = 0; i5 < iZzi; i5++) {
            arrayList.add(new zzatd(zzauh.zzm(zzaufVar).intern(), zzauh.zzm(zzaufVar).intern()));
        }
        return new zzaue(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public zzaue(String str, zzasu zzasuVar) {
        String str2 = zzasuVar.zzb;
        long j8 = zzasuVar.zzc;
        long j10 = zzasuVar.zzd;
        long j11 = zzasuVar.zze;
        long j12 = zzasuVar.zzf;
        List arrayList = zzasuVar.zzh;
        if (arrayList == 0) {
            Map map = zzasuVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j8, j10, j11, j12, arrayList);
    }
}
