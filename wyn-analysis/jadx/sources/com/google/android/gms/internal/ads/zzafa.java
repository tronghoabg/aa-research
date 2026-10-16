package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzeu zzeuVar, String str, String str2, zzq zzqVar) {
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int i5 = zzc[zzetVar.zzj(2)];
        zzetVar.zzh(8);
        int i10 = zze[zzetVar.zzj(3)];
        if (zzetVar.zzj(1) != 0) {
            i10++;
        }
        int i11 = zzf[zzetVar.zzj(5)] * 1000;
        zzetVar.zzm();
        zzeuVar.zzh(zzetVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo("audio/ac3");
        zztVar.zzG(i10);
        zztVar.zzI(i5);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i11);
        zztVar.zzj(i11);
        return zztVar.zzP();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzv zzb(com.google.android.gms.internal.ads.zzeu r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzq r10) {
        /*
            com.google.android.gms.internal.ads.zzet r0 = new com.google.android.gms.internal.ads.zzet
            r0.<init>()
            r0.zza(r7)
            r1 = 13
            int r1 = r0.zzj(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzh(r2)
            r3 = 2
            int r3 = r0.zzj(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzafa.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzh(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzafa.zze
            int r5 = r0.zzj(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzj(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzh(r2)
            r2 = 4
            int r2 = r0.zzj(r2)
            r0.zzh(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzh(r2)
            int r2 = r0.zzj(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzh(r5)
        L4f:
            int r2 = r0.zzc()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzh(r6)
            int r2 = r0.zzj(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zzm()
            int r0 = r0.zze()
            r7.zzh(r0)
            com.google.android.gms.internal.ads.zzt r7 = new com.google.android.gms.internal.ads.zzt
            r7.<init>()
            r7.zza(r8)
            r7.zzo(r2)
            r7.zzG(r4)
            r7.zzI(r3)
            r7.zzs(r10)
            r7.zze(r9)
            r7.zzj(r1)
            com.google.android.gms.internal.ads.zzv r7 = r7.zzP()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafa.zzb(com.google.android.gms.internal.ads.zzeu, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzv");
    }

    public static zzaez zzc(zzet zzetVar) {
        int iZzf;
        int i5;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzd = zzetVar.zzd();
        zzetVar.zzh(40);
        int iZzj = zzetVar.zzj(5);
        zzetVar.zzf(iZzd);
        int i17 = -1;
        if (iZzj > 10) {
            zzetVar.zzh(16);
            int iZzj2 = zzetVar.zzj(2);
            if (iZzj2 == 0) {
                i17 = 0;
            } else if (iZzj2 == 1) {
                i17 = 1;
            } else if (iZzj2 == 2) {
                i17 = 2;
            }
            zzetVar.zzh(3);
            int iZzj3 = zzetVar.zzj(11) + 1;
            int iZzj4 = zzetVar.zzj(2);
            if (iZzj4 == 3) {
                i5 = zzd[zzetVar.zzj(2)];
                i14 = 6;
                i13 = 3;
            } else {
                int iZzj5 = zzetVar.zzj(2);
                int i18 = zzb[iZzj5];
                i13 = iZzj5;
                i5 = zzc[iZzj4];
                i14 = i18;
            }
            iZzf = iZzj3 + iZzj3;
            int i19 = (iZzf * i5) / (i14 * 32);
            int iZzj6 = zzetVar.zzj(3);
            boolean zZzi = zzetVar.zzi();
            i10 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzetVar.zzh(10);
            if (zzetVar.zzi()) {
                zzetVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzetVar.zzh(5);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                i15 = 0;
                iZzj6 = 0;
            } else {
                i15 = iZzj6;
            }
            if (i17 == 1) {
                if (zzetVar.zzi()) {
                    zzetVar.zzh(16);
                }
                i16 = 1;
            } else {
                i16 = i17;
            }
            if (zzetVar.zzi()) {
                if (i15 > 2) {
                    zzetVar.zzh(2);
                }
                if ((i15 & 1) != 0 && i15 > 2) {
                    zzetVar.zzh(6);
                }
                if ((i15 & 4) != 0) {
                    zzetVar.zzh(6);
                }
                if (zZzi && zzetVar.zzi()) {
                    zzetVar.zzh(5);
                }
                if (i16 == 0) {
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    if (i15 == 0 && zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    int iZzj7 = zzetVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzetVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzetVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzetVar.zzj(5);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(5);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(4);
                                }
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(4);
                                }
                            }
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(5);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(7);
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(8);
                                }
                            }
                        }
                        zzetVar.zzh((iZzj8 + 2) * 8);
                        zzetVar.zzm();
                    }
                    if (i15 < 2) {
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzetVar.zzi()) {
                            zzetVar.zzh(14);
                        }
                    }
                    if (!zzetVar.zzi()) {
                        i16 = 0;
                    } else if (i13 == 0) {
                        zzetVar.zzh(5);
                        i16 = 0;
                        i13 = 0;
                    } else {
                        for (int i20 = 0; i20 < i14; i20++) {
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(5);
                            }
                        }
                        i16 = 0;
                    }
                }
            }
            if (zzetVar.zzi()) {
                zzetVar.zzh(5);
                if (i15 == 2) {
                    zzetVar.zzh(4);
                    i15 = 2;
                }
                if (i15 >= 6) {
                    zzetVar.zzh(2);
                }
                if (zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                if (i15 == 0 && zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzetVar.zzg();
                }
            }
            if (i16 == 0 && i13 != 3) {
                zzetVar.zzg();
            }
            if (i16 == 2 && (i13 == 3 || zzetVar.zzi())) {
                zzetVar.zzh(6);
            }
            i11 = i14 * 256;
            str = (zzetVar.zzi() && zzetVar.zzj(6) == 1 && zzetVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i12 = i19;
        } else {
            zzetVar.zzh(32);
            int iZzj9 = zzetVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzetVar.zzj(6);
            int i21 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzetVar.zzh(8);
            int iZzj11 = zzetVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzetVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzetVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzetVar.zzh(2);
            }
            i5 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i10 = zze[iZzj11] + (zzetVar.zzi() ? 1 : 0);
            i11 = 1536;
            str = str2;
            i12 = i21;
        }
        return new zzaez(str, i17, i10, i5, iZzf, i11, i12, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b5 = bArr[4];
            return zzf((b5 & 192) >> 6, b5 & Utf8.REPLACEMENT_BYTE);
        }
        int i5 = bArr[2] & 7;
        int i10 = ((bArr[3] & ForkServer.ERROR) | (i5 << 8)) + 1;
        return i10 + i10;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i5, int i10) {
        int i11;
        if (i5 < 0 || i5 >= 3 || i10 < 0 || (i11 = i10 >> 1) >= 19) {
            return -1;
        }
        int i12 = zzc[i5];
        if (i12 == 44100) {
            int i13 = zzg[i11] + (i10 & 1);
            return i13 + i13;
        }
        int i14 = zzf[i11];
        return i12 == 32000 ? i14 * 6 : i14 * 4;
    }
}
