package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class nth {
    private static final yph a = yph.c("GH.CarrierConfigReader");
    private final Set b = new HashSet();

    private final void c(String str, Object obj) {
        String str2 = String.format(str, obj);
        if (this.b.add(str2)) {
            ((ype) ((ype) a.h()).ai((char) 5425)).y("%s", str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.ntg r7, android.os.PersistableBundle r8, android.content.Context r9) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            java.lang.String r2 = "hide_lte_plus_data_icon_bool"
            java.lang.String r3 = "show_4g_for_lte_data_icon_bool"
            r4 = 1
            r5 = 0
            if (r0 < r1) goto L1b
            int r0 = r7.ordinal()
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L15
            goto L2b
        L15:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5, r5)
            throw r6
        L1b:
            int r0 = r7.ordinal()
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L24
            goto L2b
        L24:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5, r5)
            throw r6
        L2a:
            r2 = r3
        L2b:
            if (r8 == 0) goto L38
            boolean r0 = r8.containsKey(r2)
            if (r0 == 0) goto L38
            boolean r6 = r8.getBoolean(r2)
            return r6
        L38:
            boolean r6 = r6.b(r7, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nth.a(ntg, android.os.PersistableBundle, android.content.Context):boolean");
    }

    final boolean b(ntg ntgVar, Context context) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        String str;
        try {
            contextCreatePackageContext = context.createPackageContext("com.android.systemui", 0);
        } catch (PackageManager.NameNotFoundException e) {
            c("Failed to create SystemUI context: %s", e);
            contextCreatePackageContext = null;
        }
        if (contextCreatePackageContext == null) {
            c("Could not get %s from CarrierConfig, and could not create SystemUi context", ntgVar);
            return false;
        }
        Resources resources = contextCreatePackageContext.getResources();
        try {
            int iOrdinal = ntgVar.ordinal();
            if (iOrdinal == 0) {
                str = "config_show4GForLTE";
            } else {
                if (iOrdinal != 1) {
                    throw new RuntimeException(null, null);
                }
                str = "config_hideLtePlus";
            }
            int identifier = resources.getIdentifier(str, "bool", "com.android.systemui");
            if (identifier != 0) {
                return resources.getBoolean(identifier);
            }
            c("Could not find config %s in SystemUI resources", ntgVar);
            return false;
        } catch (Resources.NotFoundException unused) {
            c("Could not find config %s in SystemUI resources", ntgVar);
            return false;
        }
    }
}
