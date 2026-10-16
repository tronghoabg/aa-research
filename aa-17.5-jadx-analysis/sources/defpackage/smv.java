package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class smv {
    public final int a;
    public final Object b;
    public final Object c;

    public smv(afha afhaVar, ayx ayxVar) {
        bwd bwdVarC = ayxVar.c();
        int i = afhaVar.a;
        if (i < 0) {
            asl.d("negative nearestRange.first");
        }
        int iMin = Math.min(afhaVar.b, bwdVarC.a - 1);
        if (iMin < i) {
            aae aaeVar = aaf.a;
            aaeVar.getClass();
            this.c = aaeVar;
            this.b = new Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.a = i;
        aae aaeVar2 = new aae(i2);
        bad badVar = new bad(i, iMin, aaeVar2, this, 0);
        if (i < 0 || i >= bwdVarC.a) {
            asl.e("Index " + i + ", size " + bwdVarC.a);
        }
        if (iMin < 0 || iMin >= bwdVarC.a) {
            asl.e("Index " + iMin + ", size " + bwdVarC.a);
        }
        if (iMin < i) {
            asl.c(a.bB(i, iMin, "toIndex (", ") should be not smaller than fromIndex (", ")"));
        }
        byw bywVar = (byw) bwdVarC.c;
        int iQ = awx.q(bywVar, i);
        int i3 = ((os) bywVar.a[iQ]).a;
        while (i3 <= iMin) {
            os osVar = (os) bywVar.a[iQ];
            badVar.invoke(osVar);
            i3 += osVar.b;
            iQ++;
        }
        this.c = aaeVar2;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = ((long[]) this.c)[0];
            if (j2 == j) {
                return 0;
            }
            return j2 <= j ? -1 : -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = ((long[]) this.c)[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final int b(Object obj) {
        aae aaeVar = (aae) this.c;
        int iA = aaeVar.a(obj);
        if (iA >= 0) {
            return aaeVar.c[iA];
        }
        return -1;
    }

    public final Object c(int i) {
        int i2 = i - this.a;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = (Object[]) this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    public smv(slq slqVar, int i, sla slaVar) {
        this.b = slqVar;
        this.a = i;
        this.c = slaVar;
    }

    public smv(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.c = jArr;
        this.b = objArr;
    }

    public smv(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public smv(qwg qwgVar, IBinder.DeathRecipient deathRecipient) {
        this.b = qwgVar;
        this.c = deathRecipient;
        this.a = Binder.getCallingPid();
    }
}
