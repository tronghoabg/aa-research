package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
final class tzc implements tzg {
    final /* synthetic */ usz a;
    final /* synthetic */ tzd b;

    public tzc(tzd tzdVar, usz uszVar) {
        this.a = uszVar;
        this.b = tzdVar;
    }

    @Override // defpackage.tzg
    public final void a(ukp ukpVar, int i, Collection collection) {
        boolean zContains;
        usz uszVar = this.a;
        tzd tzdVar = this.b;
        if (uszVar == tzdVar.f && i == 0 && collection != null) {
            synchronized (tzdVar) {
                zContains = tzdVar.c.contains(ukpVar);
                if (zContains) {
                    tzdVar.b.put(ukpVar, collection);
                    tzdVar.e = true;
                }
            }
            if (zContains) {
                this.b.b(this.a);
            }
        }
    }
}
