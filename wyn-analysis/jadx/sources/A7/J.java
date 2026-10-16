package A7;

import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.common.internal.AbstractC1732v;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f533b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f534c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f535d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final xa.d f536a;

    public J(xa.d dVar) {
        this.f536a = dVar;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC1732v.i(atomicReference);
        AbstractC1732v.b(strArr.length == strArr2.length);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (Objects.equals(str, strArr[i5])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i5] == null) {
                            strArr3[i5] = strArr2[i5] + "(" + strArr[i5] + ")";
                        }
                        str2 = strArr3[i5];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(C0301x c0301x) {
        xa.d dVar = this.f536a;
        if (!dVar.H()) {
            return c0301x.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(c0301x.f1105c);
        sb2.append(",name=");
        sb2.append(c(c0301x.f1103a));
        sb2.append(",params=");
        C0298w c0298w = c0301x.f1104b;
        sb2.append(c0298w == null ? null : !dVar.H() ? c0298w.f1091a.toString() : b(c0298w.W()));
        return sb2.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f536a.H()) {
            return bundle.toString();
        }
        StringBuilder sbJ = N0.a.j("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbJ.length() != 8) {
                sbJ.append(", ");
            }
            sbJ.append(f(str));
            sbJ.append("=");
            Object obj = bundle.get(str);
            sbJ.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbJ.append("}]");
        return sbJ.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f536a.H() ? str : d(str, I0.f525c, I0.f523a, f533b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbJ = N0.a.j("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sbJ.length() != 1) {
                    sbJ.append(", ");
                }
                sbJ.append(strB);
            }
        }
        sbJ.append("]");
        return sbJ.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f536a.H() ? str : d(str, I0.f530h, I0.f529g, f534c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.f536a.H() ? str : str.startsWith("_exp_") ? AbstractC0279p0.l("experiment_id(", str, ")") : d(str, I0.f528f, I0.f527e, f535d);
    }
}
