package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adsh implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ adsh(defpackage.adqa adqaVar, java.util.ArrayList arrayList, defpackage.ador adorVar, java.util.ArrayList arrayList2, int i) {
        this.e = i;
        this.a = adqaVar;
        this.d = arrayList;
        this.c = adorVar;
        this.b = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [aeaq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            java.lang.Object obj = this.c;
            ((adsk) this.d).j((defpackage.ador) this.a, (defpackage.adtj) this.b, (defpackage.adnd) obj);
            return;
        }
        if (i == 1) {
            ?? r0 = this.d;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.a;
            int size = r0.size();
            for (int i2 = 0; i2 < size; i2++) {
                adqn adqnVar = (adqn) r0.get(i2);
                synchronized (adqnVar) {
                    adqnVar.h((defpackage.ador) obj2, (defpackage.ador) obj2, false);
                }
            }
            ?? r9 = this.b;
            int size2 = r9.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((java.util.concurrent.Future) r9.get(i3)).cancel(false);
            }
            defpackage.adqa adqaVar = (defpackage.adqa) obj3;
            adqaVar.gA();
            synchronized (obj3) {
                ((defpackage.adqa) obj3).k();
            }
            adqaVar.p();
            return;
        }
        if (i == 2) {
            java.lang.Object obj4 = this.c;
            ((defpackage.aduh) this.b).a.a((defpackage.ador) this.a, (defpackage.adtj) this.d, (defpackage.adnd) obj4);
            return;
        }
        if (i == 3) {
            defpackage.adzi adziVar = (defpackage.adzi) this.b;
            adziVar.A = true;
            java.lang.Object obj5 = this.c;
            adziVar.w.a((defpackage.ador) this.a, (defpackage.adtj) this.d, (defpackage.adnd) obj5);
            return;
        }
        java.lang.Object obj6 = this.d;
        synchronized (obj6) {
            if (((aeap) this.c).b != 0) {
                return;
            }
            java.util.IdentityHashMap identityHashMap = ((defpackage.aear) obj6).a;
            ?? r2 = this.a;
            identityHashMap.remove(r2);
            if (identityHashMap.isEmpty()) {
                ((defpackage.aear) obj6).b.shutdown();
                ((defpackage.aear) obj6).b = null;
            }
            r2.b(this.b);
        }
    }

    public adsh(adsk adskVar, defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar, int i) {
        this.e = i;
        this.a = adorVar;
        this.b = adtjVar;
        this.c = adndVar;
        this.d = adskVar;
    }

    public adsh(defpackage.aear aearVar, aeap aeapVar, aeaq aeaqVar, java.lang.Object obj, int i) {
        this.e = i;
        this.c = aeapVar;
        this.a = aeaqVar;
        this.b = obj;
        this.d = aearVar;
    }

    public adsh(java.lang.Object obj, defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar, int i) {
        this.e = i;
        this.a = adorVar;
        this.d = adtjVar;
        this.c = adndVar;
        this.b = obj;
    }
}
