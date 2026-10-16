package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class jfk {
    private static final yph a = yph.c("CAR.MISC");

    public static synchronized Drawable a(Context context, String str) {
        return b(context, str);
    }

    public static synchronized Drawable b(Context context, String str) {
        String strC = ilb.c(context);
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strC);
            int identifier = resourcesForApplication.getIdentifier(str, "drawable", strC);
            if (identifier == 0) {
                ((ype) ((ype) a.h()).ai((char) 1996)).y("Resource not found in gearhead.apk: %s", str);
                return new ColorDrawable(0);
            }
            TypedValue typedValue = new TypedValue();
            resourcesForApplication.getValue(identifier, typedValue, true);
            if (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) {
                return resourcesForApplication.getDrawable(identifier, null);
            }
            return fhu.b(resourcesForApplication, identifier, context.getTheme());
        } catch (PackageManager.NameNotFoundException unused) {
            ((ype) ((ype) a.h()).ai((char) 1997)).u("Gearhead not installed, this class will return blank drawables.");
            return new ColorDrawable(0);
        }
    }
}
