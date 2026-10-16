package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
public class qme {
    public final qmh b;

    protected qme(qmh qmhVar) {
        spu.aw(qmhVar);
        this.b = qmhVar;
    }

    private static String a(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    protected static String o(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String strA = a(obj);
        String strA2 = a(obj2);
        String strA3 = a(obj3);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb.append(str2);
            sb.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb.append(str3);
            sb.append(strA3);
        }
        return sb.toString();
    }

    public static final boolean r() {
        return Log.isLoggable((String) qmy.b.f(), 2);
    }

    public final Context f() {
        return this.b.b;
    }

    public final qlk g() {
        return this.b.b();
    }

    public final qmd h() {
        return this.b.c();
    }

    protected final qms i() {
        return this.b.d();
    }

    protected final qmu j() {
        return this.b.d;
    }

    protected final qmx k() {
        qmx qmxVar = this.b.f;
        qmh.g(qmxVar);
        return qmxVar;
    }

    protected final qnd l() {
        return this.b.e();
    }

    protected final qnh m() {
        qnh qnhVar = this.b.g;
        qmh.g(qnhVar);
        return qnhVar;
    }

    protected final qni n() {
        return this.b.f();
    }

    public final void p(int i, String str, Object obj, Object obj2, Object obj3) {
        qmh qmhVar = this.b;
        qnd qndVar = qmhVar != null ? qmhVar.e : null;
        if (qndVar == null) {
            String str2 = (String) qmy.b.f();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, o(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String str3 = (String) qmy.b.f();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, qnd.o(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            qndVar.d(i, str, obj, obj2, obj3);
        }
    }

    protected final spk q() {
        return this.b.k;
    }
}
