package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.PlaybackException;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    /* compiled from: WazeSource */
    final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final int getExtensionVersion(int i2) {
            return SdkExtensions.getExtensionVersion(i2);
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.CLASS)
    public @interface PrereleaseSdkCheck {
    }

    static {
        R_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE) : 0;
    }

    private BuildCompat() {
    }

    public static final boolean isAtLeastB() {
        if (Build.VERSION.SDK_INT >= 36) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            String str = Build.VERSION.CODENAME;
            x.e(str, "CODENAME");
            if (isAtLeastPreReleaseCodename("Baklava", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAtLeastB_1() {
        return Build.VERSION.SDK_INT >= 36 && BuildCompat$$ExternalSyntheticBackportWithForwarding0.m() >= 3600001;
    }

    public static final boolean isAtLeastN() {
        return true;
    }

    public static final boolean isAtLeastNMR1() {
        return true;
    }

    public static final boolean isAtLeastO() {
        return true;
    }

    public static final boolean isAtLeastOMR1() {
        return true;
    }

    public static final boolean isAtLeastP() {
        return true;
    }

    public static final boolean isAtLeastPreReleaseCodename(String str, String str2) {
        x.f(str, "codename");
        x.f(str2, "buildCodename");
        if (x.n("REL", str2)) {
            return false;
        }
        Integer numIsAtLeastPreReleaseCodename$codenameToInt = isAtLeastPreReleaseCodename$codenameToInt(str2);
        Integer numIsAtLeastPreReleaseCodename$codenameToInt2 = isAtLeastPreReleaseCodename$codenameToInt(str);
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null && numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            numIsAtLeastPreReleaseCodename$codenameToInt.intValue();
            numIsAtLeastPreReleaseCodename$codenameToInt2.intValue();
            return true;
        }
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null || numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt != null;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        x.e(upperCase, "toUpperCase(...)");
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        x.e(upperCase2, "toUpperCase(...)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        x.e(upperCase, "toUpperCase(...)");
        return x.n(upperCase, "BAKLAVA") ? 0 : null;
    }

    public static final boolean isAtLeastQ() {
        return true;
    }

    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean isAtLeastS() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            x.e(str, "CODENAME");
            if (isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAtLeastSv2() {
        if (Build.VERSION.SDK_INT >= 32) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.VERSION.CODENAME;
            x.e(str, "CODENAME");
            if (isAtLeastPreReleaseCodename("Sv2", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAtLeastT() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            String str = Build.VERSION.CODENAME;
            x.e(str, "CODENAME");
            if (isAtLeastPreReleaseCodename("Tiramisu", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAtLeastU() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            String str = Build.VERSION.CODENAME;
            x.e(str, "CODENAME");
            if (isAtLeastPreReleaseCodename("UpsideDownCake", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            x.e(str, "CODENAME");
            if (isAtLeastPreReleaseCodename("VanillaIceCream", str)) {
                return true;
            }
        }
        return false;
    }
}
