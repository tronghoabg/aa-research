package g1;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2665a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35493a = 0;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            Y0.d.e(30);
        }
        if (i5 >= 30) {
            Y0.d.e(31);
        }
        if (i5 >= 30) {
            Y0.d.e(33);
        }
        if (i5 >= 30) {
            Y0.d.e(1000000);
        }
    }

    public static final boolean a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        AbstractC3340k.e(buildCodename, "buildCodename");
        if (!"REL".equals(buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            AbstractC3340k.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Integer num = upperCase.equals("BAKLAVA") ? 0 : null;
            String upperCase2 = str.toUpperCase(locale);
            AbstractC3340k.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Integer num2 = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num == null || num2 == null) {
                if (num == null && num2 == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    AbstractC3340k.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase4 = str.toUpperCase(locale);
                    AbstractC3340k.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= num2.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return true;
        }
        if (i5 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC3340k.d(CODENAME, "CODENAME");
        return a("Tiramisu");
    }
}
