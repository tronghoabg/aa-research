package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeParseException;
import j$.util.Optional;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kgi {
    private static final yph a = yph.c("GH.BugreportUtils");
    private static final ygr b = ygr.q(1, 4, 2);
    private static final ygr c = ygr.p("debug", "dogfood");

    public static Instant a(String str) {
        try {
            return Instant.parse(str);
        } catch (DateTimeParseException unused) {
            return ZonedDateTime.parse(str, kgh.a).toInstant();
        }
    }

    public static Optional b(Context context) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK"), 0).iterator();
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if ("com.google.android.apps.internal.betterbug".equals(next.activityInfo.packageName)) {
                obj = "com.google.android.apps.internal.betterbug";
                break;
            }
            if (true == "com.google.android.apps.betterbug".equals(next.activityInfo.packageName)) {
                obj = "com.google.android.apps.betterbug";
            }
        }
        if (obj != null) {
            ((ype) a.l().ai((char) 3050)).y("Found Better Bug package: %s", "com.google.android.apps.betterbug");
        } else {
            ((ype) a.l().ai((char) 3049)).u("No Better Bug package found");
        }
        return Optional.ofNullable(obj);
    }

    public static String c(Instant instant) {
        return instant.atZone(ZoneId.systemDefault()).format(kgh.a);
    }

    public static String d(Instant instant) {
        return j(c(instant), "bugreport", "zip", Optional.empty());
    }

    public static String e(String str) {
        int iLastIndexOf = str.lastIndexOf(32);
        if (iLastIndexOf >= 0) {
            return str.substring(iLastIndexOf + 1);
        }
        ((ype) ((ype) a.h()).ai((char) 3051)).y("Couldn't find date in title %s", str);
        return null;
    }

    public static String f(String str) {
        return j(str, "logs", "txt", Optional.empty());
    }

    public static String g(String str, String str2) {
        return j(str, "screenshot", "png", Optional.of(str2));
    }

    public static boolean h(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            ((ype) ((ype) a.f()).ai((char) 3048)).u("BetterBug deeplink only supported on Android S+");
            return false;
        }
        Optional optionalB = b(context);
        if (optionalB.isPresent() && "com.google.android.apps.internal.betterbug".equals(optionalB.get())) {
            UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
            boolean zIsManagedProfile = false;
            for (UserHandle userHandle : userManager.getUserProfiles()) {
                if (userManager.isQuietModeEnabled(userHandle)) {
                    ((ype) ((ype) a.f()).ai((char) 3047)).u("Detected a work profile in quiet mode, so can't use internal Better Bug");
                    return false;
                }
                zIsManagedProfile |= userManager.isManagedProfile(userHandle.getIdentifier());
            }
            if (zIsManagedProfile && context.getPackageManager().checkPermission("android.permission.INTERACT_ACROSS_USERS", "com.google.android.apps.internal.betterbug") != 0) {
                ((ype) ((ype) a.f()).ai((char) 3046)).u("Better Bug does not have permission INTERACT_ACROSS_USERS, so it cannot forward Intent to the work profile");
                return false;
            }
        }
        return optionalB.isPresent();
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return c.contains("release") || b.contains(Integer.valueOf((int) acvz.a.gu().a())) || acqa.a.gu().a();
    }

    private static String j(String str, String str2, String str3, Optional optional) {
        return optional.isPresent() ? String.format("%s_%s_display_%s.%s", str2, str, optional.get(), str3) : String.format("%s_%s.%s", str2, str, str3);
    }
}
