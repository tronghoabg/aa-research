package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
final class eso implements eqn {
    public final esv a;
    public final esl b;
    public boolean c = false;

    public eso(esv esvVar, esl eslVar) {
        this.a = esvVar;
        this.b = eslVar;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        if (esm.d(2)) {
            Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + esv.q(obj));
        }
        this.c = true;
        this.b.c(obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
