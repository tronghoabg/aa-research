package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class owj {
    public final Object a;
    public Object b;

    public owj(Context context) throws PackageManager.NameNotFoundException {
        this.a = context;
        String strB = qtr.b(context, !"user".equals(Build.TYPE));
        if (!context.getPackageName().equals(strB)) {
            try {
                context = context.createPackageContext(strB, 3);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalStateException("NameNotFoundException looking up ".concat(String.valueOf(strB)), e);
            }
        }
        this.b = context;
    }

    public static int a(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return ((Integer) context.getClassLoader().loadClass("com.google.android.apps.auto.sdk.SdkVersion").getDeclaredMethod("getVersion", null).invoke(null, null)).intValue();
    }

    public final void b(Context context, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(320368510);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(context) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(this) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ksr.a(null, null, false, null, bxc.i(1910576934, true, new mxw(this, context, 8, null), buxVarC), buxVarC, 24576, 15);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(this, context, i, 20);
        }
    }

    public final void c() {
        Object obj = this.b;
        if (obj != null) {
            ((noc) obj).d();
        }
        this.b = null;
    }

    public owj(eqa eqaVar) {
        this.a = eqaVar;
    }
}
