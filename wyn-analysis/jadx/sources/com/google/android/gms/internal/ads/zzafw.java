package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzafw implements zzagg {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzafv zzc = new zzafv(zzaft.zza);
    private static final zzafv zzd = new zzafv(zzafs.zza);
    private zzgwt zze;
    private final zzanq zzf = new zzanl();

    private final void zzc(int i5, List list) {
        switch (i5) {
            case 0:
                list.add(new zzapp());
                break;
            case 1:
                list.add(new zzaps());
                break;
            case 2:
                list.add(new zzapv(0));
                break;
            case 3:
                list.add(new zzahr(0));
                break;
            case 4:
                zzaga zzagaVarZza = zzc.zza(0);
                if (zzagaVarZza == null) {
                    list.add(new zzaii(0));
                    break;
                } else {
                    list.add(zzagaVarZza);
                    break;
                }
            case 5:
                list.add(new zzail());
                break;
            case 6:
                list.add(new zzakm(this.zzf, 0));
                break;
            case 7:
                list.add(new zzaku(0));
                break;
            case 8:
                zzanq zzanqVar = this.zzf;
                list.add(new zzalw(zzanqVar, 704, null, null, zzgwt.zzi(), null));
                list.add(new zzami(zzanqVar, 160));
                break;
            case 9:
                list.add(new zzamz());
                break;
            case 10:
                list.add(new zzaqz());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgwt.zzi();
                }
                list.add(new zzark(1, 0, this.zzf, new zzfj(0L), new zzapx(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzarx());
                break;
            case 14:
                list.add(new zzait(0));
                break;
            case 15:
                zzaga zzagaVarZza2 = zzd.zza(new Object[0]);
                if (zzagaVarZza2 != null) {
                    list.add(zzagaVarZza2);
                    break;
                }
                break;
            case 16:
                list.add(new zzahv(0, this.zzf));
                break;
            case 17:
                list.add(new zzanj());
                break;
            case 18:
                list.add(new zzasc());
                break;
            case 19:
                list.add(new zzaid());
                break;
            case 20:
                list.add(new zzair(0));
                break;
            case 21:
                list.add(new zzaic());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final synchronized zzaga[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzagg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzaga[] zzb(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafw.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzaga[]");
    }
}
