package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pqo {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/clientparam/manager/ClientParametersCache");
    public final Context b;
    public final tmb c;
    public final ackk d;
    public final xxh e;
    private final pmm f;
    private final Executor g;

    public pqo(Context context, tmb tmbVar, xxh xxhVar, Executor executor, xxh xxhVar2) {
        pma pmaVar = pma.a;
        pmm pmmVar = new pmm(abnv.L(pma.class), context);
        this.b = context;
        this.c = tmbVar;
        this.d = (ackk) ((xxm) xxhVar).a;
        this.g = executor;
        this.e = xxhVar2;
        this.f = pmmVar;
    }

    public final synchronized pma a() {
        pma pmaVar;
        vaq.d();
        yob yobVar = a;
        ((ynz) ((ynz) yobVar.d()).ai(6835)).y("Trying to load saved client parameters from %s", "SavedClientParameters.data");
        acjs acjsVarB = this.f.b();
        pmaVar = (pma) acjsVarB.b;
        if (pmaVar == null) {
            ((ynz) ((ynz) yobVar.f()).ai(6837)).u("No cached client parameters found");
            pmaVar = null;
        } else {
            ((ynz) ((ynz) yobVar.f()).ai(6836)).u("Loaded cached client parameters");
        }
        this.g.execute(new prm(this, acjsVarB, pmaVar, 1));
        return pmaVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void b(String str, Locale locale, long j, acbu acbuVar) {
        try {
            try {
                c(str, locale, j, acbuVar, this.f);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(String str, Locale locale, long j, acbu acbuVar, pmm pmmVar) {
        yob yobVar = a;
        ((ynz) ((ynz) yobVar.f()).ai(6838)).R("Save client parameters to cache at %s for account %s and Locale %s", pmmVar.a, str, locale);
        abnp abnpVarN = pma.a.n();
        abnpVarN.t();
        pma pmaVar = (pma) abnpVarN.b;
        acbuVar.getClass();
        pmaVar.f = acbuVar;
        pmaVar.b |= 8;
        abnpVarN.t();
        pma pmaVar2 = (pma) abnpVarN.b;
        pmaVar2.b |= 1;
        pmaVar2.c = woy.al(str);
        String string = locale.toString();
        abnpVarN.t();
        pma pmaVar3 = (pma) abnpVarN.b;
        string.getClass();
        pmaVar3.b |= 2;
        pmaVar3.d = string;
        abnpVarN.t();
        pma pmaVar4 = (pma) abnpVarN.b;
        pmaVar4.b |= 4;
        pmaVar4.e = j;
        if (pmmVar.a((pma) abnpVarN.q(), pmmVar.b.incrementAndGet())) {
            pki.a(this.b);
        } else {
            ((ynz) ((ynz) yobVar.h()).ai((char) 6839)).u("Saving client parameters proto FAILED");
        }
    }
}
