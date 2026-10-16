package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfd {
    public final java.util.Map a;
    public final java.util.Map b;
    public defpackage.tfg c;
    private final java.lang.Enum d;
    private final defpackage.tfe e;
    private final java.util.Map f;
    private final java.util.Map g;

    public tfd(java.lang.Enum r1, defpackage.tfe tfeVar) {
        tfeVar.getClass();
        this.d = r1;
        this.e = tfeVar;
        this.f = new java.util.LinkedHashMap();
        this.a = new java.util.LinkedHashMap();
        this.g = new java.util.LinkedHashMap();
        this.b = new java.util.LinkedHashMap();
        this.c = new defpackage.tff(2);
    }

    public final defpackage.tfh a() {
        return new defpackage.tfh(this.e, this.d, this.f, this.a, this.g, this.b, this.c);
    }

    public final void b(java.lang.Enum r2, java.lang.Enum r3) {
        r3.getClass();
        java.util.Map map = this.f;
        java.lang.Object linkedHashSet = map.get(r2);
        if (linkedHashSet == null) {
            linkedHashSet = new java.util.LinkedHashSet();
            map.put(r2, linkedHashSet);
        }
        ((java.util.Collection) linkedHashSet).add(r3);
    }

    public final /* synthetic */ void c(java.lang.Enum r2, java.lang.Enum r3, defpackage.afer aferVar) {
        r3.getClass();
        defpackage.afau afauVar = new defpackage.afau(r2, r3);
        java.util.Map map = this.g;
        java.lang.Object arrayList = map.get(afauVar);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map.put(afauVar, arrayList);
        }
        ((java.util.List) arrayList).add(aferVar);
    }

    public final void d(java.lang.Enum r4, java.lang.Enum r5, java.lang.Runnable runnable) {
        c(r4, r5, new defpackage.ehx((java.lang.Object) runnable, 15, (byte[]) null));
    }
}
