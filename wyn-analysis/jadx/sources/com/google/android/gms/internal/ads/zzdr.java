package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.util.Pair;
import cb.AbstractC1593a;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgwt zza(byte b5, byte b10, byte b11, byte b12) {
        return zzgwt.zzj(new byte[]{1, 1, b5, 2, 1, b10, 3, 1, b11, 4, 1, b12});
    }

    public static String zzb(int i5, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String zzc(int i5, boolean z2, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {zzc[i5], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(true != z2 ? 'L' : 'H'), Integer.valueOf(i12)};
        String str = zzfm.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i13 = 6;
        while (i13 > 0) {
            int i14 = i13 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i13 = i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzgtr.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b5 = bArr[0];
        zzgtr.zzd(b5 == 1, "Invalid APV CSD version: %s", b5);
        int i5 = bArr[5] & ForkServer.ERROR;
        int i10 = bArr[6] & ForkServer.ERROR;
        int i11 = bArr[7] & ForkServer.ERROR;
        String str = zzfm.zza;
        Locale locale = Locale.US;
        StringBuilder sbH = R8.v.h("apv1.apvf", i5, ".apvl", i10, ".apvb");
        sbH.append(i11);
        return sbH.toString();
    }

    public static Pair zze(zzv zzvVar) {
        zzdq zzdqVarZzf = zzf(zzvVar);
        if (zzdqVarZzf == null || !zzdqVarZzf.zzc()) {
            return null;
        }
        return new Pair(Integer.valueOf(zzdqVarZzf.zza()), Integer.valueOf(zzdqVarZzf.zzb()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzdq zzf(com.google.android.gms.internal.ads.zzv r26) {
        /*
            Method dump skipped, instructions count: 3020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdr.zzf(com.google.android.gms.internal.ads.zzv):com.google.android.gms.internal.ads.zzdq");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzdq zzg(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.zzi r12) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdr.zzg(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzi):com.google.android.gms.internal.ads.zzdq");
    }

    public static byte[] zzh(byte[] bArr, int i5, int i10) {
        byte[] bArr2 = new byte[i10 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i5, bArr2, 4, i10);
        return bArr2;
    }

    private static int zzi(int i5, int i10) {
        switch (i5) {
            case 30:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 33:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 60:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 63:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 90:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 93:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 120:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 123:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 150:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 153:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 180:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case 183:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case AD_NOT_LOADED_VALUE:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                AbstractC1593a.o(AbstractC0279p0.f(i10, 23), i10, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                AbstractC1593a.v(new StringBuilder(String.valueOf(i5).length() + 30), "Unrecognized APV level index: ", i5, "CodecSpecificDataUtil");
                break;
        }
        return -1;
    }
}
