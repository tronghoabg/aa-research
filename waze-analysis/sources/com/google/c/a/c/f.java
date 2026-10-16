package com.google.c.a.c;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum f implements eg {
    UNKNOWN_TYPE(0),
    ACCL(13),
    AGSA(12),
    ANDROID(8),
    ANDROID_AUTO(16),
    ANDROID_LITE(17),
    ANDROID_PHONE(18),
    ANDROID_SCREENLESS(19),
    ANDROID_SMART_DISPLAY(20),
    ANDROID_SMART_DISPLAY_COSMOS(64),
    ANDROID_TABLET(21),
    ANDROID_THINGS(22),
    ANDROID_THINGS_CUBE(23),
    ANDROID_THINGS_JASPER(24),
    ANDROID_TV(25),
    ANDROID_WEAR(26),
    ASSISTANT_KIT(15),
    ASSISTANT_SDK(27),
    AUTO(7),
    CAST_OS(11),
    CHROME_OS(29),
    CHROMECAST_MANHATTAN(28),
    CLOUD_DEVICE(30),
    CROS(31),
    FITBIT_OS_WATCH(50),
    FITBIT_OS_WATCH_ANDROID(51),
    FITBIT_OS_WATCH_IOS(52),
    GOOGLE_HOME(32),
    GOOGLE_HOME_APP(63),
    HEADPHONE(43),
    HEADPHONE_ANDROID(47),
    HEADPHONE_ANDROID_SCREENLESS(59),
    HEADPHONE_IOS(48),
    IOPA(33),
    IOS(9),
    IOS_SCREENLESS(34),
    IPAD(40),
    IPHONE(41),
    KAI_OS(10),
    KAI_OS_AMA(35),
    LIBASSISTANT(14),
    MATTER(61),
    PHONE(1),
    PIXEL(37),
    PIXEL5(38),
    PIXEL6(39),
    PIXEL7(42),
    PIXEL8(58),
    PIXEL9(62),
    PIXEL_BUDS(49),
    PIXEL_BUDS_SCREENLESS(60),
    PIXEL_TABLET(55),
    PIXEL_TABLET_HUB_MODE(56),
    PIXEL_TABLET_PERSONAL_MODE(57),
    PIXEL_WATCH(54),
    SCREENLESS(6),
    SMART_DISPLAY(5),
    SPEAKER(3),
    TABLET(2),
    TELEPHONE(36),
    THING(4),
    THIRD_PARTY_PARTNER_APP(65),
    WATCH(44),
    WEAR_OS(45),
    WEAR_OS_WATCH(53);

    private final int ao;

    f(int i2) {
        this.ao = i2;
    }

    public static f a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return PHONE;
            case 2:
                return TABLET;
            case 3:
                return SPEAKER;
            case 4:
                return THING;
            case 5:
                return SMART_DISPLAY;
            case 6:
                return SCREENLESS;
            case 7:
                return AUTO;
            case 8:
                return ANDROID;
            case 9:
                return IOS;
            case 10:
                return KAI_OS;
            case 11:
                return CAST_OS;
            case 12:
                return AGSA;
            case 13:
                return ACCL;
            case 14:
                return LIBASSISTANT;
            case 15:
                return ASSISTANT_KIT;
            case 16:
                return ANDROID_AUTO;
            case 17:
                return ANDROID_LITE;
            case 18:
                return ANDROID_PHONE;
            case 19:
                return ANDROID_SCREENLESS;
            case 20:
                return ANDROID_SMART_DISPLAY;
            case 21:
                return ANDROID_TABLET;
            case 22:
                return ANDROID_THINGS;
            case 23:
                return ANDROID_THINGS_CUBE;
            case 24:
                return ANDROID_THINGS_JASPER;
            case 25:
                return ANDROID_TV;
            case 26:
                return ANDROID_WEAR;
            case 27:
                return ASSISTANT_SDK;
            case 28:
                return CHROMECAST_MANHATTAN;
            case 29:
                return CHROME_OS;
            case 30:
                return CLOUD_DEVICE;
            case 31:
                return CROS;
            case 32:
                return GOOGLE_HOME;
            case 33:
                return IOPA;
            case 34:
                return IOS_SCREENLESS;
            case 35:
                return KAI_OS_AMA;
            case 36:
                return TELEPHONE;
            case 37:
                return PIXEL;
            case 38:
                return PIXEL5;
            case 39:
                return PIXEL6;
            case 40:
                return IPAD;
            case 41:
                return IPHONE;
            case 42:
                return PIXEL7;
            case 43:
                return HEADPHONE;
            case 44:
                return WATCH;
            case 45:
                return WEAR_OS;
            case 46:
            default:
                return null;
            case 47:
                return HEADPHONE_ANDROID;
            case 48:
                return HEADPHONE_IOS;
            case 49:
                return PIXEL_BUDS;
            case 50:
                return FITBIT_OS_WATCH;
            case 51:
                return FITBIT_OS_WATCH_ANDROID;
            case 52:
                return FITBIT_OS_WATCH_IOS;
            case 53:
                return WEAR_OS_WATCH;
            case 54:
                return PIXEL_WATCH;
            case 55:
                return PIXEL_TABLET;
            case 56:
                return PIXEL_TABLET_HUB_MODE;
            case 57:
                return PIXEL_TABLET_PERSONAL_MODE;
            case 58:
                return PIXEL8;
            case 59:
                return HEADPHONE_ANDROID_SCREENLESS;
            case 60:
                return PIXEL_BUDS_SCREENLESS;
            case 61:
                return MATTER;
            case 62:
                return PIXEL9;
            case 63:
                return GOOGLE_HOME_APP;
            case 64:
                return ANDROID_SMART_DISPLAY_COSMOS;
            case 65:
                return THIRD_PARTY_PARTNER_APP;
        }
    }

    public static ei b() {
        return e.f7177a;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.ao;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ao);
    }
}
