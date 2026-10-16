package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import h.g.b.x;
import h.n.o;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Device {
    public static final Device INSTANCE = new Device();

    private Device() {
    }

    private final boolean equalsCaseInsensitive(String str, String str2) {
        return o.m(str, str2, true);
    }

    private final boolean isDeviceFrom(String str) {
        String str2 = Build.MANUFACTURER;
        x.e(str2, "MANUFACTURER");
        if (equalsCaseInsensitive(str2, str)) {
            return true;
        }
        String str3 = Build.BRAND;
        x.e(str3, "BRAND");
        return equalsCaseInsensitive(str3, str);
    }

    public final boolean isBluDevice() {
        return isDeviceFrom("Blu");
    }

    public final boolean isGoogleDevice() {
        return isDeviceFrom("Google");
    }

    public final boolean isHuaweiDevice() {
        return isDeviceFrom("Huawei");
    }

    public final boolean isInfinixDevice() {
        return isDeviceFrom("Infinix");
    }

    public final boolean isItelDevice() {
        return isDeviceFrom("Itel");
    }

    public final boolean isJioDevice() {
        return isDeviceFrom("Jio");
    }

    public final boolean isMotorolaDevice() {
        return isDeviceFrom("Motorola");
    }

    public final boolean isNokiaDevice() {
        return isDeviceFrom("Nokia");
    }

    public final boolean isOnePlusDevice() {
        return isDeviceFrom("OnePlus");
    }

    public final boolean isOppoDevice() {
        return isDeviceFrom("Oppo");
    }

    public final boolean isPocoDevice() {
        return isDeviceFrom("Poco");
    }

    public final boolean isPositivoDevice() {
        return isDeviceFrom("Positivo");
    }

    public final boolean isRealmeDevice() {
        return isDeviceFrom("Realme");
    }

    public final boolean isRedmiDevice() {
        return isDeviceFrom("Redmi");
    }

    public final boolean isSamsungDevice() {
        return isDeviceFrom("Samsung");
    }

    public final boolean isSonyDevice() {
        return isDeviceFrom("Sony");
    }

    public final boolean isTecnoDevice() {
        return isDeviceFrom("Tecno") || isDeviceFrom("Tecno-mobile");
    }

    public final boolean isUniSocChipsetDevice() {
        if (Build.VERSION.SDK_INT >= 31 && o.m("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            return true;
        }
        String str = Build.HARDWARE;
        x.e(str, "HARDWARE");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        x.e(lowerCase, "toLowerCase(...)");
        if (o.ah(lowerCase, "ums")) {
            return true;
        }
        if (isItelDevice()) {
            String str2 = Build.HARDWARE;
            x.e(str2, "HARDWARE");
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            x.e(lowerCase2, "toLowerCase(...)");
            if (o.ah(lowerCase2, "sp")) {
                return true;
            }
        }
        return false;
    }

    public final boolean isVivoDevice() {
        return isDeviceFrom("Vivo");
    }

    public final boolean isXiaomiDevice() {
        return isDeviceFrom("Xiaomi");
    }
}
