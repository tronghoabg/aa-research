package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mca implements lhg {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.AppsNotifStore");
    public Map a = new LinkedHashMap();
    private final eqn d = new lsh(this, 4);
    private boolean e;

    public mca() {
        kwo.b();
        Boolean bool = (Boolean) new kws().e();
        bool.getClass();
        this.e = bool.booleanValue();
    }

    public final void a(long j) throws PendingIntent.CanceledException {
        nul nulVar;
        PendingIntent pendingIntent;
        mbz mbzVar = (mbz) this.a.get(Long.valueOf(j));
        if (mbzVar != null && (nulVar = mbzVar.c.s) != null && (pendingIntent = nulVar.c) != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 4767)).u("Failed to send deleteAction intent");
            }
        }
        this.a.remove(Long.valueOf(j));
    }

    public final void b(nuo nuoVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Long l : this.a.keySet()) {
            mbz mbzVar = (mbz) this.a.get(l);
            mbzVar.getClass();
            if (nuoVar == null || mbzVar.c.x.equals(nuoVar)) {
                nur nurVar = mbzVar.c;
                nun nunVar = nurVar.A;
                nun nunVar2 = nun.d;
                if (nunVar.equals(nunVar2)) {
                    linkedHashMap.put(l, mbzVar);
                } else {
                    num numVarA = num.a(nurVar);
                    numVarA.A = nunVar2;
                    numVarA.a = nup.DEFAULT;
                    nur nurVarB = numVarA.b();
                    String str = mbzVar.a;
                    long j = mbzVar.b;
                    linkedHashMap.put(l, new mbz(str, j, nurVarB));
                    nuj.b().j(str, j, nurVarB);
                }
            }
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.lhg
    public final void c() {
        if (Build.VERSION.SDK_INT >= 30) {
            kwo.b();
            new kws().fE(lbh.d(), this.d);
        }
        kwo.b();
        Boolean bool = (Boolean) new kws().e();
        bool.getClass();
        f(bool.booleanValue());
    }

    @Override // defpackage.lhg
    public final void d() {
        if (Build.VERSION.SDK_INT >= 30) {
            kwo.b();
            new kws().k(this.d);
        }
        this.a.clear();
    }

    public final void e(String str, long j, nur nurVar) {
        if (!nurVar.C || this.e) {
            this.a.put(Long.valueOf(j), new mbz(str, j, nurVar));
            nuj.b().j(str, j, nurVar);
        } else {
            String strConcat = String.format("\ncrossProfileFlagEnabled=%b\ncrossProfileSettingEnabled=%b\nworkProfileAvailability=%s", Boolean.valueOf(Build.VERSION.SDK_INT >= 30), Boolean.valueOf(mpl.f().a().o()), kwo.b().a());
            if (Build.VERSION.SDK_INT >= 30) {
                strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format("\nrunningOnWork=%b\nworkProfileDetected=%b\nneedsWorkPermission=%b", Boolean.valueOf(kwo.b().c()), Boolean.valueOf(kwo.b().d()), Boolean.valueOf(kwo.b().d.f().d()))));
            }
            ((ype) ((ype) c.g()).ai((char) 4768)).y("Work notification posted when work data is unavailable.%s", strConcat);
        }
    }

    public final void f(boolean z) {
        this.e = z;
        if (z) {
            return;
        }
        for (mbz mbzVar : (List) Collection.EL.stream(this.a.values()).filter(new lye(6)).collect(Collectors.toList())) {
            String str = mbzVar.a;
            long j = mbzVar.b;
            nuj.b().g(str, j, mbzVar.c.f);
            this.a.remove(Long.valueOf(j));
        }
    }
}
