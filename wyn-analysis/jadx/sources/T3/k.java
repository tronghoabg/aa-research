package T3;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11419a = J3.r.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z2) {
        String str = f11419a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            J3.r rVarD = J3.r.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(StringUtils.SPACE);
            sb2.append(z2 ? "enabled" : "disabled");
            rVarD.a(str, sb2.toString());
        } catch (Exception e7) {
            J3.r rVarD2 = J3.r.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z2 ? "enabled" : "disabled");
            String string = sb3.toString();
            if (rVarD2.f5584a <= 3) {
                Log.d(str, string, e7);
            }
        }
    }
}
