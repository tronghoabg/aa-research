package defpackage;

import j$.time.Instant;

/* loaded from: classes2.dex */
public final /* synthetic */ class lcv implements dzh {
    private final /* synthetic */ int a;

    public /* synthetic */ lcv(int i) {
        this.a = i;
    }

    @Override // defpackage.dzh
    public final Object a(Object obj) {
        if (this.a != 0) {
            return htm.p(obj);
        }
        abqw abqwVar = (abqw) obj;
        abqwVar.getClass();
        abnp abnpVarK = abqwVar.K();
        abnpVarK.getClass();
        Instant instantNow = Instant.now();
        instantNow.getClass();
        abzi.o(abzi.q(instantNow), abnpVarK);
        return abzi.n(abnpVarK);
    }
}
