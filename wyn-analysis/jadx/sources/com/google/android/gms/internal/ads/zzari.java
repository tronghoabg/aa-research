package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzari implements zzara {
    final /* synthetic */ zzark zza;
    private final zzet zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzari(zzark zzarkVar, int i5) {
        Objects.requireNonNull(zzarkVar);
        this.zza = zzarkVar;
        this.zzb = new zzet(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzb(zzeu zzeuVar) {
        zzark zzarkVar;
        int i5;
        zzet zzetVar;
        int i10;
        int i11;
        if (zzeuVar.zzs() != 2) {
            return;
        }
        zzark zzarkVar2 = this.zza;
        zzfj zzfjVar = (zzfj) zzarkVar2.zzh().get(0);
        if ((zzeuVar.zzs() & 128) != 0) {
            zzeuVar.zzk(1);
            int iZzt = zzeuVar.zzt();
            int i12 = 3;
            zzeuVar.zzk(3);
            zzet zzetVar2 = this.zzb;
            zzeuVar.zzl(zzetVar2, 2);
            zzetVar2.zzh(3);
            int i13 = 13;
            zzarkVar2.zzq(zzetVar2.zzj(13));
            zzeuVar.zzl(zzetVar2, 2);
            int i14 = 4;
            zzetVar2.zzh(4);
            int i15 = 12;
            zzeuVar.zzk(zzetVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzeuVar.zzd();
            while (iZzd > 0) {
                int i16 = 5;
                zzeuVar.zzl(zzetVar2, 5);
                int iZzj = zzetVar2.zzj(8);
                zzetVar2.zzh(i12);
                int iZzj2 = zzetVar2.zzj(i13);
                zzetVar2.zzh(i14);
                int iZzj3 = zzetVar2.zzj(i15);
                int iZzg = zzeuVar.zzg();
                int i17 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i18 = -1;
                int iZzs = 0;
                while (zzeuVar.zzg() < i17) {
                    int iZzs2 = zzeuVar.zzs();
                    int iZzg2 = zzeuVar.zzg() + zzeuVar.zzs();
                    if (iZzg2 > i17) {
                        break;
                    }
                    if (iZzs2 == i16) {
                        long jZzz = zzeuVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i11 = 36;
                                        zzarkVar = zzarkVar2;
                                        i18 = i11;
                                        i5 = iZzg2;
                                        zzetVar = zzetVar2;
                                        i10 = iZzd;
                                    }
                                    zzarkVar = zzarkVar2;
                                    i5 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i10 = iZzd;
                                }
                                zzarkVar = zzarkVar2;
                                i5 = iZzg2;
                                zzetVar = zzetVar2;
                                i10 = iZzd;
                                i18 = 172;
                            }
                            zzarkVar = zzarkVar2;
                            zzetVar = zzetVar2;
                            i10 = iZzd;
                            i18 = 135;
                            i5 = iZzg2;
                        }
                        zzarkVar = zzarkVar2;
                        i5 = iZzg2;
                        zzetVar = zzetVar2;
                        i10 = iZzd;
                        i18 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzarkVar = zzarkVar2;
                                zzetVar = zzetVar2;
                                i10 = iZzd;
                                i18 = 135;
                                i5 = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzeuVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i11 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i11 = 139;
                                            }
                                            zzarkVar = zzarkVar2;
                                            i5 = iZzg2;
                                            zzetVar = zzetVar2;
                                            i10 = iZzd;
                                        }
                                    }
                                    zzarkVar = zzarkVar2;
                                    i5 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i10 = iZzd;
                                    i18 = 172;
                                } else if (iZzs2 == 123) {
                                    i11 = Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzeuVar.zzs();
                                    zzarkVar = zzarkVar2;
                                    str = strTrim;
                                    i5 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i10 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzeuVar.zzg() < iZzg2) {
                                        int i19 = iZzg2;
                                        String strTrim2 = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzeuVar.zzs();
                                        int i20 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzeuVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzarl(strTrim2, iZzs4, bArr));
                                        iZzd = i20;
                                        iZzg2 = i19;
                                        zzetVar2 = zzetVar2;
                                        zzarkVar2 = zzarkVar2;
                                    }
                                    zzarkVar = zzarkVar2;
                                    i5 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i10 = iZzd;
                                    arrayList = arrayList2;
                                    i18 = 89;
                                } else {
                                    zzarkVar = zzarkVar2;
                                    i5 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i10 = iZzd;
                                    if (iZzs2 == 111) {
                                        i18 = 257;
                                    }
                                }
                                zzarkVar = zzarkVar2;
                                i18 = i11;
                                i5 = iZzg2;
                                zzetVar = zzetVar2;
                                i10 = iZzd;
                            }
                        }
                        zzarkVar = zzarkVar2;
                        i5 = iZzg2;
                        zzetVar = zzetVar2;
                        i10 = iZzd;
                        i18 = 129;
                    }
                    zzeuVar.zzk(i5 - zzeuVar.zzg());
                    iZzd = i10;
                    zzetVar2 = zzetVar;
                    zzarkVar2 = zzarkVar;
                    i16 = 5;
                }
                zzark zzarkVar3 = zzarkVar2;
                zzet zzetVar3 = zzetVar2;
                int i21 = iZzd;
                zzeuVar.zzh(i17);
                zzarm zzarmVar = new zzarm(i18, str, iZzs, arrayList, Arrays.copyOfRange(zzeuVar.zzi(), iZzg, i17));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzarmVar.zza;
                }
                iZzd = i21 - (iZzj3 + 5);
                if (!zzarkVar3.zzk().get(iZzj2)) {
                    zzarp zzarpVarZzb = zzarkVar3.zzi().zzb(iZzj, zzarmVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzarpVarZzb);
                }
                i14 = 4;
                zzetVar2 = zzetVar3;
                zzarkVar2 = zzarkVar3;
                i12 = 3;
                i13 = 13;
                i15 = 12;
            }
            zzark zzarkVar4 = zzarkVar2;
            int size = sparseIntArray.size();
            for (int i22 = 0; i22 < size; i22++) {
                int iKeyAt = sparseIntArray.keyAt(i22);
                int iValueAt = sparseIntArray.valueAt(i22);
                zzarkVar4.zzk().put(iKeyAt, true);
                zzarkVar4.zzl().put(iValueAt, true);
                zzarp zzarpVar = (zzarp) sparseArray.valueAt(i22);
                if (zzarpVar != null) {
                    zzarpVar.zza(zzfjVar, zzarkVar4.zzm(), new zzaro(iZzt, iKeyAt, Segment.SIZE));
                    zzarkVar4.zzj().put(iValueAt, zzarpVar);
                }
            }
            zzarkVar4.zzj().remove(this.zze);
            zzarkVar4.zzo(0);
            if (zzarkVar4.zzn() == 0) {
                zzarkVar4.zzm().zzv();
                zzarkVar4.zzp(true);
            }
        }
    }
}
