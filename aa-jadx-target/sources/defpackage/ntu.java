package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ntu {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.CarrierConfigReader");
    private final java.util.Set b = new java.util.HashSet();

    private final void c(java.lang.String str, java.lang.Object obj) {
        java.lang.String str2 = java.lang.String.format(str, obj);
        if (this.b.add(str2)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5428)).y("%s", str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    public final boolean a(ntt nttVar, android.os.PersistableBundle persistableBundle, android.content.Context context) {
        java.lang.String str = "hide_lte_plus_data_icon_bool";
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            int iOrdinal = nttVar.ordinal();
            if (iOrdinal == 0) {
                str = "show_4g_for_lte_data_icon_bool";
            } else if (iOrdinal != 1) {
                throw new java.lang.RuntimeException(null, null);
            }
        } else {
            int iOrdinal2 = nttVar.ordinal();
            if (iOrdinal2 == 0) {
                str = "show_4g_for_lte_data_icon_bool";
            } else if (iOrdinal2 != 1) {
                throw new java.lang.RuntimeException(null, null);
            }
        }
        return (persistableBundle == null || !persistableBundle.containsKey(str)) ? b(nttVar, context) : persistableBundle.getBoolean(str);
    }

    final boolean b(ntt nttVar, android.content.Context context) {
        android.content.Context contextCreatePackageContext;
        java.lang.String str;
        try {
            contextCreatePackageContext = context.createPackageContext("com.android.systemui", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            c("Failed to create SystemUI context: %s", e);
            contextCreatePackageContext = null;
        }
        if (contextCreatePackageContext == null) {
            c("Could not get %s from CarrierConfig, and could not create SystemUi context", nttVar);
            return false;
        }
        android.content.res.Resources resources = contextCreatePackageContext.getResources();
        try {
            int iOrdinal = nttVar.ordinal();
            if (iOrdinal == 0) {
                str = "config_show4GForLTE";
            } else {
                if (iOrdinal != 1) {
                    throw new java.lang.RuntimeException(null, null);
                }
                str = "config_hideLtePlus";
            }
            int identifier = resources.getIdentifier(str, "bool", "com.android.systemui");
            if (identifier != 0) {
                return resources.getBoolean(identifier);
            }
            c("Could not find config %s in SystemUI resources", nttVar);
            return false;
        } catch (android.content.res.Resources.NotFoundException unused) {
            c("Could not find config %s in SystemUI resources", nttVar);
            return false;
        }
    }
}
