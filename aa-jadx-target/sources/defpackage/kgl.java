package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kgl {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.BugreportUtils");
    private static final defpackage.yhx b = defpackage.yhx.q(1, 4, 2);
    private static final defpackage.yhx c = defpackage.yhx.p("debug", "dogfood");

    public static j$.time.Instant a(java.lang.String str) {
        try {
            return j$.time.Instant.parse(str);
        } catch (j$.time.format.DateTimeParseException unused) {
            return j$.time.ZonedDateTime.parse(str, kgk.a).toInstant();
        }
    }

    public static j$.util.Optional b(android.content.Context context) {
        java.lang.Object obj = null;
        for (android.content.pm.ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new android.content.Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK"), 0)) {
            if ("com.google.android.apps.internal.betterbug".equals(resolveInfo.activityInfo.packageName)) {
                obj = "com.google.android.apps.internal.betterbug";
                break;
            }
            if (true == "com.google.android.apps.betterbug".equals(resolveInfo.activityInfo.packageName)) {
                obj = "com.google.android.apps.betterbug";
            }
        }
        if (obj != null) {
            ((defpackage.yqj) a.l().ai((char) 3053)).y("Found Better Bug package: %s", "com.google.android.apps.betterbug");
        } else {
            ((defpackage.yqj) a.l().ai((char) 3052)).u("No Better Bug package found");
        }
        return j$.util.Optional.ofNullable(obj);
    }

    public static java.lang.String c(j$.time.Instant instant) {
        return instant.atZone(j$.time.ZoneId.systemDefault()).format(kgk.a);
    }

    public static java.lang.String d(j$.time.Instant instant) {
        return j(c(instant), "bugreport", "zip", j$.util.Optional.empty());
    }

    public static java.lang.String e(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(32);
        if (iLastIndexOf >= 0) {
            return str.substring(iLastIndexOf + 1);
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3054)).y("Couldn't find date in title %s", str);
        return null;
    }

    public static java.lang.String f(java.lang.String str) {
        return j(str, "logs", "txt", j$.util.Optional.empty());
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2) {
        return j(str, "screenshot", "png", j$.util.Optional.of(str2));
    }

    public static boolean h(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3051)).u("BetterBug deeplink only supported on Android S+");
            return false;
        }
        j$.util.Optional optionalB = b(context);
        if (optionalB.isPresent() && "com.google.android.apps.internal.betterbug".equals(optionalB.get())) {
            android.os.UserManager userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
            boolean zIsManagedProfile = false;
            for (android.os.UserHandle userHandle : userManager.getUserProfiles()) {
                if (a$.ExternalSyntheticApiModelOutline2.m(userManager, userHandle)) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3050)).u("Detected a work profile in quiet mode, so can't use internal Better Bug");
                    return false;
                }
                zIsManagedProfile |= userManager.isManagedProfile(userHandle.getIdentifier());
            }
            if (zIsManagedProfile && context.getPackageManager().checkPermission("android.permission.INTERACT_ACROSS_USERS", "com.google.android.apps.internal.betterbug") != 0) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3049)).u("Better Bug does not have permission INTERACT_ACROSS_USERS, so it cannot forward Intent to the work profile");
                return false;
            }
        }
        return optionalB.isPresent();
    }

    public static boolean i() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return c.contains("release") || b.contains(java.lang.Integer.valueOf((int) defpackage.acxb.a.fF().a())) || defpackage.acrc.a.fF().a();
    }

    private static java.lang.String j(java.lang.String str, java.lang.String str2, java.lang.String str3, j$.util.Optional optional) {
        return optional.isPresent() ? java.lang.String.format("%s_%s_display_%s.%s", str2, str, optional.get(), str3) : java.lang.String.format("%s_%s.%s", str2, str, str3);
    }
}
