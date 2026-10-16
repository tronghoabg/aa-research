package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes3.dex */
public final class zzfm {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i5 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i5).length());
        AbstractC3256n.p(sb2, str, ", ", str2, ", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i5);
        zza = sb2.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 144, 151, 158, 153, 140, 139, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE, 128, 149, 146, 155, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static String zzA(int i5) {
        return new String(new byte[]{(byte) (i5 >> 24), (byte) (i5 >> 16), (byte) (i5 >> 8), (byte) i5}, StandardCharsets.US_ASCII);
    }

    public static zzv zzB(int i5, int i10, int i11) {
        zzt zztVar = new zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzG(i10);
        zztVar.zzI(i11);
        zztVar.zzJ(i5);
        return zztVar.zzP();
    }

    public static int zzC(int i5, ByteOrder byteOrder) {
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i5 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i5 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static int zzD(int i5, ByteOrder byteOrder) {
        if (i5 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i5 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static boolean zzE(int i5) {
        return i5 == 3 || i5 == 2 || i5 == 268435456 || i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4 || i5 == 1895825408 || i5 == 1879048192 || i5 == 1912602624;
    }

    public static int zzF(zzv zzvVar) {
        int i5 = zzvVar.zzI;
        return i5 != -1 ? i5 : zzG(zzvVar.zzH);
    }

    public static int zzG(int i5) {
        int i10;
        int i11 = 6396;
        if (i5 != 10) {
            if (i5 == 16) {
                i10 = 205215996;
            } else if (i5 != 24) {
                switch (i5) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i5) {
                            case 12:
                                return 743676;
                            case 13:
                                i10 = 30136348;
                                break;
                            case 14:
                                i10 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i10 = 67108860;
            }
            i11 = 0;
        } else {
            i10 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i10 : i11;
    }

    public static int zzH(int i5) {
        switch (i5) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int zzI(int i5) {
        if (i5 != 2) {
            if (i5 == 3) {
                return 1;
            }
            if (i5 != 4) {
                if (i5 != 21) {
                    if (i5 != 22) {
                        if (i5 != 268435456) {
                            if (i5 != 1342177280) {
                                if (i5 != 1610612736) {
                                    if (i5 == 1879048192) {
                                        return 8;
                                    }
                                    if (i5 != 1895825408) {
                                        if (i5 == 1912602624) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzJ(int i5) {
        if (i5 == 2 || i5 == 4) {
            return 6005;
        }
        if (i5 == 10) {
            return 6004;
        }
        if (i5 == 7) {
            return 6005;
        }
        if (i5 == 8) {
            return 6003;
        }
        switch (i5) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i5) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzK(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L18
            java.lang.String r2 = "rtsp"
            boolean r2 = com.google.android.gms.internal.ads.zzgsz.zze(r2, r0)
            if (r2 != 0) goto L17
            java.lang.String r2 = "rtspt"
            boolean r0 = com.google.android.gms.internal.ads.zzgsz.zze(r2, r0)
            if (r0 == 0) goto L18
        L17:
            return r1
        L18:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L20
            return r2
        L20:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L78
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzgsz.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L5a;
                case 108321: goto L50;
                case 3242057: goto L46;
                case 3299913: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L64
        L3c:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L64
            r0 = r6
            goto L65
        L46:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L64
            r0 = r1
            goto L65
        L50:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L64
            r0 = r4
            goto L65
        L5a:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L64
            r0 = r5
            goto L65
        L64:
            r0 = -1
        L65:
            if (r0 == 0) goto L73
            if (r0 == r6) goto L71
            if (r0 == r5) goto L6f
            if (r0 == r1) goto L6f
            r0 = r2
            goto L74
        L6f:
            r0 = r6
            goto L74
        L71:
            r0 = r5
            goto L74
        L73:
            r0 = r4
        L74:
            if (r0 != r2) goto L77
            goto L78
        L77:
            return r0
        L78:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzfm.zzc
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto La4
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto La3
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L9a
            return r4
        L9a:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto La3
            return r5
        La3:
            return r6
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfm.zzK(android.net.Uri):int");
    }

    public static int zzL(byte[] bArr, int i5, int i10, int i11) {
        while (i5 < i10) {
            i11 = zzg[(i11 >>> 24) ^ (bArr[i5] & 255)] ^ (i11 << 8);
            i5++;
        }
        return i11;
    }

    public static int zzM(byte[] bArr, int i5, int i10, int i11) {
        int iZzY = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        for (int i12 = 0; i12 < i10; i12++) {
            byte b5 = bArr[i12];
            iZzY = zzY(b5 & 15, zzY((b5 & ForkServer.ERROR) >> 4, iZzY));
        }
        return iZzY;
    }

    public static int zzN(byte[] bArr, int i5, int i10, int i11) {
        int i12 = 0;
        while (i5 < i10) {
            i12 = zzi[i12 ^ (bArr[i5] & ForkServer.ERROR)];
            i5++;
        }
        return i12;
    }

    public static int zzO(ByteBuffer byteBuffer, int i5) {
        int i10 = byteBuffer.getInt(i5);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.zzf(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzP(com.google.android.gms.internal.ads.zzeu r3, com.google.android.gms.internal.ads.zzeu r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzd()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.zzj()
            int r2 = r3.zzd()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzd()
            int r0 = r0 + r0
            r4.zzc(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzi()
            int r2 = r3.zzg()
            int r3 = r3.zzd()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzi()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.zzj()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.zzf(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.zzj()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.zzj()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.zzc(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfm.zzP(com.google.android.gms.internal.ads.zzeu, com.google.android.gms.internal.ads.zzeu, java.util.zip.Inflater):boolean");
    }

    public static boolean zzQ(zzeu zzeuVar, zzeu zzeuVar2, Inflater inflater) {
        return zzeuVar.zzd() > 0 && zzeuVar.zzn() == 120 && zzP(zzeuVar, zzeuVar2, inflater);
    }

    public static boolean zzR(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzS(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzT(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzR(context)) {
            String strZzZ = Build.VERSION.SDK_INT < 28 ? zzZ("sys.display-size") : zzZ("vendor.display-size");
            if (!TextUtils.isEmpty(strZzZ)) {
                try {
                    String[] strArrSplit = strZzZ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i5 = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        if (i5 > 0 && i10 > 0) {
                            return new Point(i5, i10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzeh.zze("Util", "Invalid display size: ".concat(String.valueOf(strZzZ)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzU(int i5) {
        switch (i5) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return ExternalParsersConfigReaderMetKeys.METADATA_TAG;
            default:
                return "camera motion";
        }
    }

    public static int zzV(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split(Constants.USER_ID_SEPARATOR, -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z2 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i5 = Integer.parseInt(str2);
            return z2 ? -i5 : i5;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean zzW(Context context) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i5 == 30) {
            String str = Build.MODEL;
            if (zzgsz.zze(str, "moto g(20)") || zzgsz.zze(str, "rmx3231")) {
                return true;
            }
        }
        return i5 == 34 && zzgsz.zze(Build.MODEL, "sm-x200");
    }

    private static long zzX(long j8, long j10, long j11, RoundingMode roundingMode) {
        long jZzc = zzhai.zzc(j8, j10);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return zzhai.zza(jZzc, j11, roundingMode);
        }
        long jZzb = zzhai.zzb(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZza = zzhai.zza(j10, jZzb, roundingMode2);
        long jZza2 = zzhai.zza(j11, jZzb, roundingMode2);
        long jZzb2 = zzhai.zzb(Math.abs(j8), Math.abs(jZza2));
        long jZza3 = zzhai.zza(j8, jZzb2, roundingMode2);
        long jZza4 = zzhai.zza(jZza2, jZzb2, roundingMode2);
        long jZzc2 = zzhai.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return zzhai.zza(jZzc2, jZza4, roundingMode);
        }
        double d3 = (jZza / jZza4) * jZza3;
        if (d3 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d3 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzhad.zza(d3, roundingMode);
    }

    private static int zzY(int i5, int i10) {
        return (char) (zzh[(i5 ^ (i10 >> 12)) & 255] ^ ((char) (i10 << 4)));
    }

    private static String zzZ(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            zzeh.zzf("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i5) {
        return sparseArray.indexOfKey(i5) >= 0;
    }

    private static HashMap zzaa() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i5 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i5 >= 88) {
                return map;
            }
            map.put(strArr[i5], strArr[i5 + 1]);
            i5 += 2;
        }
    }

    public static Object[] zzb(Object[] objArr, int i5) {
        zzgtr.zza(i5 <= objArr.length);
        return Arrays.copyOf(objArr, i5);
    }

    public static void zzc(List list, Object[] objArr) {
        zzgtr.zzi(list.size() == objArr.length);
        list.toArray(objArr);
    }

    public static Handler zzd(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static boolean zze(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zzf() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzg(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfl
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzfm.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzh(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzfk
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzfm.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzi(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzgsz.zza(str);
        int i5 = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzaa();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i5 >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i5])) {
                    return String.valueOf(strArr[i5 + 1]).concat(String.valueOf(strZza.substring(strArr[i5].length())));
                }
                i5 += 2;
            }
        }
        return strZza;
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzk(byte[] bArr, int i5, int i10) {
        return new String(bArr, i5, i10, StandardCharsets.UTF_8);
    }

    public static boolean zzl(int i5) {
        return i5 == 10 || i5 == 13;
    }

    public static double zzm(double d3, double d5, double d10) {
        return Math.max(-1.0d, Math.min(d3, 1.0d));
    }

    public static int zzn(int[] iArr, int i5, boolean z2, boolean z10) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i5);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i5) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z2 ? iBinarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static int zzo(long[] jArr, long j8, boolean z2, boolean z10) {
        int i5;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            i5 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j8) {
                    break;
                }
                iBinarySearch = i10;
            }
            i5 = iBinarySearch;
        }
        return z10 ? Math.max(0, i5) : i5;
    }

    public static int zzp(zzei zzeiVar, long j8, boolean z2, boolean z10) {
        int iZzd = zzeiVar.zzd() - 1;
        int i5 = 0;
        while (i5 <= iZzd) {
            int i10 = (i5 + iZzd) >>> 1;
            if (zzeiVar.zzc(i10) < j8) {
                i5 = i10 + 1;
            } else {
                iZzd = i10 - 1;
            }
        }
        int i11 = iZzd + 1;
        if (i11 < zzeiVar.zzd() && zzeiVar.zzc(i11) == j8) {
            return i11;
        }
        if (iZzd == -1) {
            return 0;
        }
        return iZzd;
    }

    public static int zzq(long[] jArr, long j8, boolean z2, boolean z10) {
        int i5;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i5 = iBinarySearch + 1;
            if (i5 >= jArr.length || jArr[i5] != j8) {
                break;
            }
            iBinarySearch = i5;
        }
        return !z2 ? i5 : iBinarySearch;
    }

    public static long zzr(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000000;
    }

    public static long zzs(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000;
    }

    public static long zzt(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 * 1000;
    }

    public static long zzu(long j8, int i5) {
        return zzw(j8, 1000000L, i5, RoundingMode.DOWN);
    }

    public static long zzv(long j8, int i5) {
        return zzw(j8, i5, 1000000L, RoundingMode.UP);
    }

    public static long zzw(long j8, long j10, long j11, RoundingMode roundingMode) {
        if (j8 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j8 || j11 % j8 != 0) ? (j11 >= j8 || j8 % j11 != 0) ? zzX(j8, j10, j11, roundingMode) : zzhai.zzc(j10, zzhai.zza(j8, j11, RoundingMode.UNNECESSARY)) : zzhai.zza(j10, zzhai.zza(j11, j8, RoundingMode.UNNECESSARY), roundingMode) : zzhai.zzc(j8, zzhai.zza(j10, j11, RoundingMode.UNNECESSARY)) : zzhai.zza(j8, zzhai.zza(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzx(long[] jArr, long j8, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i5 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jZza = zzhai.zza(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = zzhai.zza(jArr[i5], jZza, roundingMode);
                i5++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jZza2 = zzhai.zza(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = zzhai.zzc(jArr[i5], jZza2);
                i5++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j12 = jArr[i10];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i10] = zzhai.zza(1000000L, zzhai.zza(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i10] = zzX(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i10] = zzhai.zzc(1000000L, zzhai.zza(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i10++;
            j10 = j11;
        }
    }

    public static long zzy(long j8, float f10) {
        return f10 == 1.0f ? j8 : Math.round(j8 * f10);
    }

    public static long zzz(long j8, float f10) {
        return f10 == 1.0f ? j8 : Math.round(j8 / f10);
    }
}
