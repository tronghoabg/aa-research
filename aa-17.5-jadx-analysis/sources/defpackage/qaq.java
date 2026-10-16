package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class qaq extends qao {
    private static final yob b = yob.c("com/google/android/apps/gmm/userevent3/reporter/PageLoggingContextImpl");
    private final tmb c;
    private final qag d;
    private qag f;
    private final pzt h;
    private final qau i;
    final LinkedHashMap a = new LinkedHashMap();
    private List e = new ArrayList();
    private boolean g = false;

    public qaq(pzx pzxVar, qag qagVar, qau qauVar, tmb tmbVar, xxh xxhVar) {
        this.d = qagVar;
        Duration.ofMillis(tmbVar.a());
        this.i = qauVar;
        this.c = tmbVar;
        this.f = qagVar.b(qauVar.h());
        abwo abwoVarA = pzxVar.a();
        this.h = new pzt(this.f, new pzs(0), xvy.a, abwoVarA != null ? xxh.h(Integer.valueOf(abwoVarA.a)) : xvy.a);
    }

    @Override // defpackage.pzv
    public final void a() {
        qaj qajVar;
        qaj qajVar2;
        synchronized (this.a) {
            qajVar = null;
            if (!this.e.isEmpty()) {
                LinkedHashMap linkedHashMap = this.a;
                synchronized (linkedHashMap) {
                    zcd zcdVar = zcd.a;
                    abnv.L(zcd.class);
                    Duration.ofMillis(this.c.a());
                    qajVar2 = new qaj(null);
                    String str = this.f.a;
                    if (str.isEmpty()) {
                        ((ynz) b.a(uys.a).ai(6977)).u("Error encoding event id during impression flushing");
                    } else {
                        qajVar2.c(str);
                    }
                    zbp zbpVarA = qaf.a(this.f.a);
                    zbpVarA.getClass();
                    qajVar2.k(((Long) ((zbpVarA.b & 2) != 0 ? xxh.h(Long.valueOf(zbpVarA.d)) : xvy.a).d(0L)).intValue());
                    String str2 = this.g ? this.h.a.a : this.d.a;
                    abnp abnpVarN = qajVar2.a() == null ? abkz.a.n() : qajVar2.a().K();
                    abnpVarN.t();
                    abkz abkzVar = (abkz) abnpVarN.b;
                    abkzVar.b |= 2;
                    abkzVar.d = str2;
                    qajVar2.d((abkz) abnpVarN.q());
                    this.e = new ArrayList();
                    linkedHashMap.clear();
                    this.f = this.d.b(this.i.h());
                    this.g = true;
                }
                qajVar = qajVar2;
            }
        }
        if (qajVar != null) {
            this.i.c(qajVar);
        }
    }
}
