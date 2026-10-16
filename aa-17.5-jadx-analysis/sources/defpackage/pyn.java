package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class pyn {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/startupflags/StartupFlagsReader");
    private static volatile yfq b;

    private pyn() {
    }

    public static boolean a(Context context, pyo pyoVar) {
        yfq yfqVarP;
        yfq yfqVar = b;
        if (yfqVar == null) {
            synchronized (pyn.class) {
                yfq yfqVar2 = b;
                if (yfqVar2 != null) {
                    yfqVar = yfqVar2;
                } else {
                    xuv xuvVarB = xuw.b("StartupFileFlags.getFlags");
                    try {
                        File file = new File(uym.a(context).getParentFile(), "no_backup");
                        file.mkdirs();
                        String[] list = new File(file, "flags").list();
                        if (list == null) {
                            int i = yfq.d;
                            yfqVarP = yls.a;
                        } else {
                            yfqVarP = yfq.p(list);
                        }
                        b = yfqVarP;
                        ((ynz) ((ynz) a.f()).ai(6949)).y("marker files=%s", b);
                        xuvVarB.close();
                        yfqVar = yfqVarP;
                    } finally {
                    }
                }
            }
        }
        return yfqVar.contains(pyoVar.bE);
    }
}
