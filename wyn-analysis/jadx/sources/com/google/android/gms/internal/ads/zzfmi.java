package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import G6.C0551o;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes3.dex */
public final class zzfmi {
    public static K0 zza(Throwable th) {
        if (th instanceof zzeme) {
            zzeme zzemeVar = (zzeme) th;
            return zzc(zzemeVar.zza(), zzemeVar.zzb());
        }
        if (th instanceof zzeel) {
            return th.getMessage() == null ? zzd(((zzeel) th).zza(), null, null) : zzd(((zzeel) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof C0551o)) {
            return zzd(1, null, null);
        }
        C0551o c0551o = (C0551o) th;
        return new K0(c0551o.f4626a, zzgui.zza(c0551o.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static K0 zzb(Throwable th, zzemf zzemfVar) {
        K0 k02;
        K0 k0Zza = zza(th);
        int i5 = k0Zza.f2338a;
        if ((i5 == 3 || i5 == 0) && (k02 = k0Zza.f2341d) != null && !k02.f2340c.equals(MobileAds.ERROR_DOMAIN)) {
            k0Zza.f2341d = null;
        }
        if (zzemfVar != null) {
            k0Zza.f2342e = zzemfVar.zzf();
        }
        return k0Zza;
    }

    public static K0 zzc(int i5, K0 k02) {
        if (i5 == 0) {
            throw null;
        }
        if (i5 == 8) {
            if (((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzjG)).intValue() > 0) {
                return k02;
            }
            i5 = 8;
        }
        return zzd(i5, null, k02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static K0 zzd(int i5, String str, K0 k02) {
        String str2;
        int i10 = i5 - 1;
        if (str == null) {
            if (i5 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i10) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzjJ)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i5 == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 2;
        switch (i10) {
            case 0:
            case 11:
            case 15:
                i12 = i11;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i12 = 1;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 2:
            case 10:
            case 18:
                i12 = 3;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 3:
                i11 = 8;
                i12 = i11;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 4:
            case 8:
            case 17:
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 7:
                i11 = 4;
                i12 = i11;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 12:
                if (((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzjJ)).intValue() <= 0) {
                    i11 = 9;
                    i12 = i11;
                    return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
                }
                i12 = 3;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 13:
                i11 = 10;
                i12 = i11;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            case 14:
                i11 = 11;
                i12 = i11;
                return new K0(i12, str3, MobileAds.ERROR_DOMAIN, k02, null);
            default:
                switch (i5) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
