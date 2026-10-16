package A7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzok;

/* loaded from: classes4.dex */
public final class N extends D0 {

    /* renamed from: c, reason: collision with root package name */
    public char f602c;

    /* renamed from: d, reason: collision with root package name */
    public long f603d;

    /* renamed from: e, reason: collision with root package name */
    public String f604e;

    /* renamed from: f, reason: collision with root package name */
    public final P f605f;

    /* renamed from: g, reason: collision with root package name */
    public final P f606g;

    /* renamed from: h, reason: collision with root package name */
    public final P f607h;

    /* renamed from: i, reason: collision with root package name */
    public final P f608i;

    /* renamed from: j, reason: collision with root package name */
    public final P f609j;
    public final P k;

    /* renamed from: l, reason: collision with root package name */
    public final P f610l;

    /* renamed from: m, reason: collision with root package name */
    public final P f611m;

    /* renamed from: n, reason: collision with root package name */
    public final P f612n;

    public N(C0273n0 c0273n0) {
        super(c0273n0);
        this.f602c = (char) 0;
        this.f603d = -1L;
        this.f605f = new P(this, 6, false, false);
        this.f606g = new P(this, 6, true, false);
        this.f607h = new P(this, 6, false, true);
        this.f608i = new P(this, 5, false, false);
        this.f609j = new P(this, 5, true, false);
        this.k = new P(this, 5, false, true);
        this.f610l = new P(this, 4, false, false);
        this.f611m = new P(this, 3, false, false);
        this.f612n = new P(this, 2, false, false);
    }

    public static O h0(String str) {
        if (str == null) {
            return null;
        }
        return new O(str);
    }

    public static String i0(Object obj, boolean z2) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i5 = 0;
        if (obj instanceof Long) {
            if (!z2) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof O ? ((O) obj).f644a : z2 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z2 ? th.getClass().getName() : th.toString());
        String strM0 = m0(C0273n0.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m0(className).equals(strM0)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i5++;
        }
        return sb2.toString();
    }

    public static String j0(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strI0 = i0(obj, z2);
        String strI02 = i0(obj2, z2);
        String strI03 = i0(obj3, z2);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strI0)) {
            sb2.append(str2);
            sb2.append(strI0);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strI02)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strI02);
        }
        if (!TextUtils.isEmpty(strI03)) {
            sb2.append(str3);
            sb2.append(strI03);
        }
        return sb2.toString();
    }

    public static String m0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? (zzok.zza() && ((Boolean) AbstractC0304y.f1129G0.a(null)).booleanValue()) ? "" : str : str.substring(0, iLastIndexOf);
    }

    @Override // A7.D0
    public final boolean g0() {
        return false;
    }

    public final void k0(int i5, boolean z2, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && l0(i5)) {
            Log.println(i5, r0(), j0(false, str, obj, obj2, obj3));
        }
        if (z10 || i5 < 5) {
            return;
        }
        AbstractC1732v.i(str);
        C0264k0 c0264k0 = ((C0273n0) this.f421a).f982j;
        if (c0264k0 == null) {
            Log.println(6, r0(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!c0264k0.f435b) {
            Log.println(6, r0(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 >= 9) {
            i5 = 8;
        }
        c0264k0.m0(new M(this, i5, str, obj, obj2, obj3));
    }

    public final boolean l0(int i5) {
        return Log.isLoggable(r0(), i5);
    }

    public final P n0() {
        return this.f611m;
    }

    public final P o0() {
        return this.f605f;
    }

    public final P p0() {
        return this.f612n;
    }

    public final P q0() {
        return this.f608i;
    }

    public final String r0() {
        String str;
        synchronized (this) {
            try {
                if (this.f604e == null) {
                    String str2 = ((C0273n0) this.f421a).f976d;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f604e = str2;
                }
                AbstractC1732v.i(this.f604e);
                str = this.f604e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
