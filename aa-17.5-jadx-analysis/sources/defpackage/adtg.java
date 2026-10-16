package defpackage;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class adtg implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public adtg(adrj adrjVar, adnq adnqVar, adsi adsiVar, admc admcVar, int i) {
        this.e = i;
        this.a = adnqVar;
        this.d = adsiVar;
        this.c = admcVar;
        this.b = adrjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [adzq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            Object obj = this.c;
            Object obj2 = this.b;
            ((adth) this.d).a.a((adnq) this.a, (adsi) obj2, (admc) obj);
            return;
        }
        if (i == 1) {
            Object obj3 = this.c;
            Object obj4 = this.d;
            ((adrj) this.b).j((adnq) this.a, (adsi) obj4, (admc) obj3);
            return;
        }
        if (i == 2) {
            adyg adygVar = (adyg) this.d;
            adygVar.A = true;
            Object obj5 = this.c;
            Object obj6 = this.b;
            adygVar.w.a((adnq) this.a, (adsi) obj6, (admc) obj5);
            return;
        }
        Object obj7 = this.b;
        synchronized (obj7) {
            if (((adzp) this.c).b != 0) {
                return;
            }
            IdentityHashMap identityHashMap = ((adzr) obj7).a;
            ?? r2 = this.a;
            identityHashMap.remove(r2);
            if (identityHashMap.isEmpty()) {
                ((adzr) obj7).b.shutdown();
                ((adzr) obj7).b = null;
            }
            r2.b(this.d);
        }
    }

    public adtg(adzr adzrVar, adzp adzpVar, adzq adzqVar, Object obj, int i) {
        this.e = i;
        this.c = adzpVar;
        this.a = adzqVar;
        this.d = obj;
        this.b = adzrVar;
    }

    public adtg(Object obj, adnq adnqVar, adsi adsiVar, admc admcVar, int i) {
        this.e = i;
        this.a = adnqVar;
        this.b = adsiVar;
        this.c = admcVar;
        this.d = obj;
    }
}
