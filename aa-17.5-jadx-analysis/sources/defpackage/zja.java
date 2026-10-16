package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zja implements adni {
    public final ziz[] a;

    public zja(ziz... zizVarArr) {
        this.a = zizVarArr;
    }

    public final void a(admc admcVar, adjq adjqVar, boolean z) {
        char c = 0;
        while (true) {
            ziz[] zizVarArr = this.a;
            if (c > 0) {
                return;
            }
            ziz zizVar = zizVarArr[0];
            Parcelable parcelable = (Parcelable) ((AtomicReference) (z ? zizVar.c : zizVar.d).a(adjqVar)).getAndSet(null);
            if (parcelable != null) {
                admcVar.f(zizVar.a, parcelable);
            }
            c = 1;
        }
    }

    @Override // defpackage.adni
    public final adqs b(adng adngVar, admc admcVar, adnh adnhVar) {
        adjq adjqVarK = adjq.k();
        adjqVarK.getClass();
        char c = 0;
        while (true) {
            ziz[] zizVarArr = this.a;
            if (c > 0) {
                adkc adkcVar = new adkc(adngVar, this, adjqVarK);
                adjq adjqVarA = adjqVarK.a();
                try {
                    return new admx(adnhVar.a(adkcVar, admcVar), adjqVarK);
                } finally {
                    adjqVarK.f(adjqVarA);
                }
            }
            ziz zizVar = zizVarArr[0];
            adjqVarK = adjqVarK.l(zizVar.c, new AtomicReference()).l(zizVar.d, new AtomicReference());
            adlx adlxVar = zizVar.a;
            if (admcVar.g(adlxVar)) {
                adjqVarK = adjqVarK.l(zizVar.b, admcVar.b(adlxVar));
            }
            c = 1;
        }
    }
}
