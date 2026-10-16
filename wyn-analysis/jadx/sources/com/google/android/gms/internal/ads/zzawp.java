package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzawp implements Comparator {
    private final boolean zza;

    public zzawp(boolean z2) {
        this.zza = z2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iB = AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15);
        int i17 = i16 % 496612959;
        zzawt zzawtVar = (zzawt) obj;
        zzawt zzawtVar2 = (zzawt) obj2;
        int i18 = zzawtVar.zza;
        if (i18 != zzawtVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i19 = i17 ^ iB;
        try {
            if (i18 == 0) {
                throw null;
            }
            switch (i18 + i19) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzawtVar.zzl() != zzawtVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzawtVar.zzm(), zzawtVar2.zzm());
                case 3:
                    comparatorZza = zzavx.zzc;
                    objZzn = zzawtVar.zzn();
                    objZzn2 = zzawtVar2.zzn();
                    break;
                case 4:
                    objZzn = zzawtVar.zzo();
                    objZzn2 = zzawtVar2.zzo();
                    comparatorZza = zzgwd.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzawtVar.zzp() != zzawtVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzawtVar.zzq(), zzawtVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzawq e7) {
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e7);
        }
    }
}
