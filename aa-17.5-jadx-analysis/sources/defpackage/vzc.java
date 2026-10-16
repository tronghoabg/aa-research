package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class vzc {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final vyp f;
    private final vyr g;
    private final vyx h;

    public vzc(Context context, String str, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4, xxh xxhVar5) {
        String packageName = context.getPackageName();
        vyp vypVar = (vyp) xxhVar.d(vyp.a);
        vyr vyrVar = (vyr) xxhVar2.d(vyr.a);
        vyx vyxVar = (vyx) xxhVar3.d(vyx.a);
        boolean zBooleanValue = ((Boolean) xxhVar4.d(false)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) xxhVar5.d(false)).booleanValue();
        this.c = str;
        this.f = vypVar;
        this.g = vyrVar;
        this.h = vyxVar;
        this.d = zBooleanValue;
        this.e = zBooleanValue2;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final zgp a() {
        final zgp zgpVarA = this.f.a();
        final zgp zgpVarA2 = this.g.a();
        final zgp zgpVarA3 = this.h.a();
        return wub.T(zgpVarA, zgpVarA2, zgpVarA3).a(new Callable() { // from class: vzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                abnp abnpVarN = vza.a.n();
                abnpVarN.t();
                vza vzaVar = (vza) abnpVarN.b;
                vzaVar.b |= 1;
                vzc vzcVar = this.a;
                vzaVar.c = vzcVar.c;
                abnpVarN.D(vzcVar.a);
                abnpVarN.D(vzcVar.b);
                abnpVarN.t();
                vza vzaVar2 = (vza) abnpVarN.b;
                vzaVar2.b |= 2;
                vzaVar2.d = vzcVar.d;
                abnpVarN.t();
                vza vzaVar3 = (vza) abnpVarN.b;
                vzaVar3.b |= 16;
                vzaVar3.h = vzcVar.e;
                zgp zgpVar = zgpVarA;
                zgp zgpVar2 = zgpVarA2;
                zgp zgpVar3 = zgpVarA3;
                try {
                    xxh xxhVar = (xxh) wub.af(zgpVar);
                    if (xxhVar.f()) {
                        String str = (String) xxhVar.b();
                        abnpVarN.t();
                        vza vzaVar4 = (vza) abnpVarN.b;
                        vzaVar4.b |= 8;
                        vzaVar4.f = str;
                    }
                } catch (Exception e) {
                    ((ynz) ((ynz) ((ynz) vlj.a.e()).p(e)).ai((char) 9887)).u("Failed to set Account Name, falling back to Zwieback logging.");
                }
                try {
                    List list = (List) wub.af(zgpVar2);
                    abnpVarN.t();
                    vza vzaVar5 = (vza) abnpVarN.b;
                    abod abodVar = vzaVar5.g;
                    if (!abodVar.c()) {
                        vzaVar5.g = abnv.G(abodVar);
                    }
                    abmc.i(list, vzaVar5.g);
                } catch (Exception e2) {
                    ((ynz) ((ynz) ((ynz) vlj.a.e()).p(e2)).ai((char) 9886)).u("Failed to set external Experiment Ids.");
                }
                try {
                    xxh xxhVar2 = (xxh) wub.af(zgpVar3);
                    if (xxhVar2.f()) {
                        String str2 = (String) xxhVar2.b();
                        abnpVarN.t();
                        vza vzaVar6 = (vza) abnpVarN.b;
                        vzaVar6.b |= 4;
                        vzaVar6.e = str2;
                    }
                } catch (Exception e3) {
                    ((ynz) ((ynz) ((ynz) vlj.a.e()).p(e3)).ai((char) 9885)).u("Failed to set Zwieback.");
                }
                abnr abnrVar = (abnr) vys.a.n();
                abnrVar.bc(vza.j, (vza) abnpVarN.q());
                return (vys) abnrVar.q();
            }
        }, zfq.a);
    }
}
