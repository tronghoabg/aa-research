package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class okt {
    public static final Object a = new Object();
    private final rxo b;
    private final SharedPreferences c;

    public okt(Context context, rxo rxoVar) {
        this.c = context.getSharedPreferences("troubleshooter_issues", 0);
        this.b = rxoVar;
    }

    public final okz a() {
        synchronized (a) {
            long epochMilli = Instant.now().toEpochMilli() - Duration.ofDays(7L).toMillis();
            okz okzVarB = b();
            abnp abnpVarN = okz.a.n();
            int i = 0;
            for (oky okyVar : okzVarB.b) {
                if (((okyVar.b & 8) != 0 ? okyVar.f : 0L) > epochMilli) {
                    i++;
                    if (i > 15) {
                        break;
                    }
                    abnpVarN.z(okyVar);
                }
            }
            c((okz) abnpVarN.q());
        }
        return b();
    }

    public final okz b() {
        okz okzVar;
        synchronized (a) {
            try {
                okzVar = (okz) abnv.B(okz.a, Base64.decode(this.c.getString("troubleshooter_issues", ""), 0), abnj.a());
            } catch (abon unused) {
                okzVar = okz.a;
            }
        }
        return okzVar;
    }

    public final void c(okz okzVar) {
        synchronized (a) {
            this.c.edit().putString("troubleshooter_issues", Base64.encodeToString(okzVar.h(), 0)).commit();
        }
    }

    public final boolean d(Predicate predicate) {
        String str;
        boolean z;
        HashSet hashSet = new HashSet();
        synchronized (a) {
            okz okzVarB = b();
            abnp abnpVarN = okz.a.n();
            str = "";
            z = false;
            for (oky okyVar : okzVarB.b) {
                if (predicate.test(okyVar)) {
                    str = okyVar.e;
                    int iAt = a.at(okyVar.i);
                    if (iAt == 0) {
                        iAt = 1;
                    }
                    if (iAt != 2) {
                        this.b.d(okyVar.c);
                    }
                    z = true;
                } else {
                    abnpVarN.z(okyVar);
                    hashSet.add(okyVar.e);
                }
            }
            c((okz) abnpVarN.q());
        }
        if (!str.isEmpty() && !hashSet.contains(str)) {
            rxo rxoVar = this.b;
            rxoVar.d(String.format("session_%s_start", str));
            rxoVar.d(String.format("session_%s_end", str));
        }
        return z;
    }
}
