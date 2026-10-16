package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zxs {
    public static final String a = "zxs";
    public final zxp b;
    public final HashMap c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    final HashSet e = new HashSet();
    boolean f;
    private final xyc g;
    private final zri h;
    private zys i;

    public zxs(xyc xycVar, zxp zxpVar, zri zriVar) {
        zkt.n(xycVar, "drd");
        this.g = xycVar;
        this.b = zxpVar;
        this.h = zriVar;
        this.f = false;
        this.c = new HashMap();
        this.i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e() throws Throwable {
        zys zysVar;
        synchronized (this) {
            try {
                try {
                    if (this.f) {
                        return;
                    }
                    acbg acbgVarA = a();
                    if (acbgVarA != null && acbgVarA.c.size() != 0) {
                        acbe acbeVarB = acbe.b(((acbf) acbgVarA.c.get(0)).c);
                        if (acbeVarB == null) {
                            acbeVarB = acbe.UNKNOWN_EVENT_TYPE;
                        }
                        acbe acbeVar = acbeVarB;
                        this.f = true;
                        if (acbeVar == acbe.PREMIUM_MAP_LOAD) {
                            zys zysVar2 = this.i;
                            this.i = null;
                            zysVar = zysVar2;
                        } else {
                            zysVar = null;
                        }
                        ((zst) this.g.gu()).i(new zxn(acbeVar, this, zysVar, null, null));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final synchronized acbg a() {
        zri zriVar = this.h;
        if (zriVar == null) {
            return null;
        }
        return (acbg) zriVar.a();
    }

    public final void b(acbe acbeVar, zys zysVar, String str, zwj zwjVar) {
        String str2 = a;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("addQuotaEvent(%s)", acbeVar));
        }
        if (adeb.c()) {
            ((zst) this.g.gu()).i(new zxn(acbeVar, this, zysVar, str, zwjVar));
            return;
        }
        abnp abnpVarN = acbf.a.n();
        abnpVarN.t();
        acbf acbfVar = (acbf) abnpVarN.b;
        acbfVar.c = acbeVar.k;
        acbfVar.b |= 1;
        if (!ysi.R(str)) {
            abnpVarN.t();
            acbf acbfVar2 = (acbf) abnpVarN.b;
            str.getClass();
            acbfVar2.b |= 16;
            acbfVar2.d = str;
        }
        if (zwjVar != null) {
            String strA = zwjVar.a();
            abnpVarN.t();
            acbf acbfVar3 = (acbf) abnpVarN.b;
            strA.getClass();
            acbfVar3.b |= 32;
            acbfVar3.e = strA;
        }
        synchronized (this) {
            acbg acbgVarA = a();
            abnp abnpVarK = acbgVarA != null ? acbgVarA.K() : acbg.a.n();
            abnpVarK.an((acbf) abnpVarN.q());
            if (!ysi.R(str)) {
                abnpVarK.t();
                acbg acbgVar = (acbg) abnpVarK.b;
                str.getClass();
                acbgVar.b |= 2;
                acbgVar.d = str;
            }
            zri zriVar = this.h;
            if (zriVar != null) {
                zriVar.b((acbg) abnpVarK.q());
            }
            if (acbeVar == acbe.PREMIUM_MAP_LOAD) {
                this.i = zysVar;
            }
        }
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(acbg acbgVar, boolean z) throws Throwable {
        acbg acbgVar2;
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onRequestComplete(%s,%s)", acbgVar, Boolean.valueOf(z)));
        }
        if (adeb.c()) {
            return;
        }
        synchronized (this) {
            this.f = false;
            if (z) {
                acbg acbgVarA = a();
                if (acbgVarA == null) {
                    return;
                }
                if (acbgVarA.c.size() == 0 || acbgVar == null || acbgVar.c.size() == 0) {
                    acbgVar2 = acbgVarA;
                } else {
                    abnp abnpVarN = acbg.a.n();
                    int i = 0;
                    int i2 = 0;
                    while (i < acbgVarA.c.size() && i2 < acbgVar.c.size()) {
                        if (a.C((acbf) acbgVarA.c.get(i), (acbf) acbgVar.c.get(i2))) {
                            i2++;
                        } else {
                            abnpVarN.an((acbf) acbgVarA.c.get(i));
                        }
                        i++;
                    }
                    while (i < acbgVarA.c.size()) {
                        abnpVarN.an((acbf) acbgVarA.c.get(i));
                        i++;
                    }
                    acbgVar2 = (acbg) abnpVarN.q();
                }
                zri zriVar = this.h;
                if (zriVar != null) {
                    zriVar.b(acbgVar2);
                }
                boolean z2 = acbgVar2 != null && acbgVar2.c.size() > 0;
                if (zrn.e(str, 4)) {
                    Log.i(str, String.format("onRequestComplete(%s,%s) :: %s => %s", acbgVar, true, acbgVarA, acbgVar2));
                }
                if (z2) {
                    e();
                }
            }
        }
    }

    public final synchronized void d(acbe acbeVar, zxp zxpVar) {
        this.c.put(acbeVar, zxpVar);
    }
}
