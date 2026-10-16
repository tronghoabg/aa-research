package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public class omc {
    public static volatile boolean a;
    public static volatile boolean b;

    public omc() {
    }

    @ResultIgnorabilityUnspecified
    public static oqe a() {
        return (oqe) mki.a.i(oqe.class);
    }

    @ResultIgnorabilityUnspecified
    public static qsz b(Context context, rbt rbtVar, rbv rbvVar, qqf qqfVar, int i) {
        if (rbtVar == null) {
            rbtVar = new qtb();
        }
        rbt rbtVar2 = rbtVar;
        if (rbvVar == null) {
            rbvVar = new qtc();
        }
        rbv rbvVar2 = rbvVar;
        if (qqfVar == null) {
            qqfVar = new qta();
        }
        qqf qqfVar2 = qqfVar;
        Looper mainLooper = context.getMainLooper();
        if (i == 0) {
            i = 1;
        }
        return new qsz(context, rbtVar2, rbvVar2, qqfVar2, mainLooper, i);
    }

    public static boolean c(String str, int i) {
        if (a) {
            if (i >= 3 || b) {
                return true;
            }
            i = 2;
        }
        return Log.isLoggable(str, i);
    }

    public static int f(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int g(int i) {
        int[] iArrR = aclh.r();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrR[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int h(Integer num) {
        return ((Integer) new ntn(num).i(0)).intValue();
    }

    @Deprecated
    public skv d(Context context, Looper looper, snr snrVar, Object obj, slb slbVar, slc slcVar) {
        return e(context, looper, snrVar, obj, slbVar, slcVar);
    }

    public skv e(Context context, Looper looper, snr snrVar, Object obj, slz slzVar, smu smuVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public omc(byte[] bArr) {
    }
}
