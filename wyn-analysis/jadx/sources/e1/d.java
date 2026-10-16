package e1;

import android.location.LocationRequest;
import android.os.Build;
import j1.AbstractC3076d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f34399a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34400b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34401c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34402d;

    public d(float f10, int i5, long j8, long j10) {
        this.f34400b = j8;
        this.f34399a = i5;
        this.f34401c = j10;
        this.f34402d = f10;
    }

    public final LocationRequest a(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long j8 = this.f34400b;
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2466a.c(this);
        }
        Object obj = null;
        try {
            if (A6.c.f386a == null) {
                A6.c.f386a = Class.forName("android.location.LocationRequest");
            }
            Method method = A6.c.f387b;
            Class<?> cls = Long.TYPE;
            if (method == null) {
                Method declaredMethod = A6.c.f386a.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                A6.c.f387b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = A6.c.f387b.invoke(null, str, Long.valueOf(j8), Float.valueOf(this.f34402d), Boolean.FALSE);
            if (objInvoke != null) {
                if (A6.c.f388c == null) {
                    Method declaredMethod2 = A6.c.f386a.getDeclaredMethod("setQuality", Integer.TYPE);
                    A6.c.f388c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                A6.c.f388c.invoke(objInvoke, Integer.valueOf(this.f34399a));
                if (A6.c.f389d == null) {
                    Method declaredMethod3 = A6.c.f386a.getDeclaredMethod("setFastestInterval", cls);
                    A6.c.f389d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method2 = A6.c.f389d;
                long j10 = this.f34401c;
                if (j10 != -1) {
                    j8 = j10;
                }
                method2.invoke(objInvoke, Long.valueOf(j8));
                obj = objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return c.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f34399a == dVar.f34399a && this.f34400b == dVar.f34400b && this.f34401c == dVar.f34401c && Float.compare(dVar.f34402d, this.f34402d) == 0;
    }

    public final int hashCode() {
        int i5 = this.f34399a * 31;
        long j8 = this.f34400b;
        int i10 = (i5 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f34401c;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbJ = N0.a.j("Request[");
        long j8 = this.f34400b;
        if (j8 != Long.MAX_VALUE) {
            sbJ.append("@");
            AbstractC3076d.e(j8, sbJ);
            int i5 = this.f34399a;
            if (i5 == 100) {
                sbJ.append(" HIGH_ACCURACY");
            } else if (i5 == 102) {
                sbJ.append(" BALANCED");
            } else if (i5 == 104) {
                sbJ.append(" LOW_POWER");
            }
        } else {
            sbJ.append("PASSIVE");
        }
        long j10 = this.f34401c;
        if (j10 != -1 && j10 < j8) {
            sbJ.append(", minUpdateInterval=");
            AbstractC3076d.e(j10, sbJ);
        }
        float f10 = this.f34402d;
        if (f10 > 0.0d) {
            sbJ.append(", minUpdateDistance=");
            sbJ.append(f10);
        }
        if (0 > j8) {
            sbJ.append(", maxUpdateDelay=");
            AbstractC3076d.e(0L, sbJ);
        }
        sbJ.append(']');
        return sbJ.toString();
    }
}
