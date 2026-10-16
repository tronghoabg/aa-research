package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzapx implements zzarn {
    private final List zza;

    public zzapx(int i5, List list) {
        this.zza = list;
    }

    private final zzard zzc(zzarm zzarmVar) {
        return new zzard(zze(zzarmVar), "video/mp2t");
    }

    private final zzars zzd(zzarm zzarmVar) {
        return new zzars(zze(zzarmVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzarm zzarmVar) {
        String str;
        int i5;
        List listSingletonList;
        zzeu zzeuVar = new zzeu(zzarmVar.zze);
        ArrayList arrayList = this.zza;
        while (zzeuVar.zzd() > 0) {
            int iZzs = zzeuVar.zzs();
            int iZzg = zzeuVar.zzg() + zzeuVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzeuVar.zzs() & 31;
                for (int i10 = 0; i10 < iZzs2; i10++) {
                    String strZzK = zzeuVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzeuVar.zzs();
                    boolean z2 = (iZzs3 & 128) != 0;
                    if (z2) {
                        i5 = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i5 = 1;
                    }
                    byte bZzs = (byte) zzeuVar.zzs();
                    zzeuVar.zzk(1);
                    if (z2) {
                        int i11 = bZzs & 64;
                        int i12 = zzdr.zza;
                        listSingletonList = Collections.singletonList(i11 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzo(str);
                    zztVar.zze(strZzK);
                    zztVar.zzM(i5);
                    zztVar.zzr(listSingletonList);
                    arrayList.add(zztVar.zzP());
                }
            }
            zzeuVar.zzh(iZzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final zzarp zzb(int i5, zzarm zzarmVar) {
        if (i5 != 2) {
            if (i5 == 3 || i5 == 4) {
                return new zzaqt(new zzaqm(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
            }
            if (i5 == 21) {
                return new zzaqt(new zzaqk("video/mp2t"));
            }
            if (i5 == 27) {
                return new zzaqt(new zzaqh(zzc(zzarmVar), false, false, "video/mp2t"));
            }
            if (i5 == 36) {
                return new zzaqt(new zzaqj(zzc(zzarmVar), "video/mp2t"));
            }
            if (i5 == 45) {
                return new zzaqt(new zzaqn("video/mp2t"));
            }
            if (i5 == 89) {
                return new zzaqt(new zzapz(zzarmVar.zzd, "video/mp2t"));
            }
            if (i5 == 172) {
                return new zzaqt(new zzapt(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
            }
            if (i5 == 257) {
                return new zzarb(new zzaqs("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i5 != 128) {
                if (i5 != 129) {
                    if (i5 != 138) {
                        if (i5 == 139) {
                            return new zzaqt(new zzapy(zzarmVar.zzb, zzarmVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i5) {
                            case 15:
                                return new zzaqt(new zzapw(false, zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzaqt(new zzaqf(zzd(zzarmVar), "video/mp2t"));
                            case 17:
                                return new zzaqt(new zzaql(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
                            default:
                                switch (i5) {
                                    case STORE_REGION_CODE_ERROR_VALUE:
                                        return new zzarb(new zzaqs("application/x-scte35", "video/mp2t"));
                                    case INVALID_CONFIG_RESPONSE_VALUE:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzaqt(new zzapy(zzarmVar.zzb, zzarmVar.zza(), 4096, "video/mp2t"));
                }
                return new zzaqt(new zzapq(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
            }
        }
        return new zzaqt(new zzaqc(zzd(zzarmVar), "video/mp2t"));
    }

    public zzapx() {
        this(0);
    }

    public zzapx(int i5) {
        this.zza = zzgwt.zzi();
    }
}
