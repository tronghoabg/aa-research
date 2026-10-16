package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes2.dex */
public final class fot {
    private static final String a = fjo.b("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                fjo.a().c(a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            fjo fjoVarA = fjo.a();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            fjoVarA.c(str, sb.toString());
        } catch (Exception e) {
            fjo fjoVarA2 = fjo.a();
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(true == z ? "enabled" : "disabled");
            fjoVarA2.d(str2, sb2.toString(), e);
        }
    }
}
