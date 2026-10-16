package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfh {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.StateMachine");
    public static final java.util.Collection b = defpackage.afga.cc(new java.util.logging.Level[]{java.util.logging.Level.ALL, java.util.logging.Level.OFF});
    private final defpackage.tfe c;
    private final java.util.Map d;
    private final java.util.Map e;
    private final java.util.Map f;
    private final java.util.Map g;
    private final defpackage.tfg h;
    private long i = android.os.SystemClock.elapsedRealtime();
    private java.lang.Enum j;

    public tfh(defpackage.tfe tfeVar, java.lang.Enum r2, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, defpackage.tfg tfgVar) {
        this.c = tfeVar;
        this.d = map;
        this.e = map2;
        this.f = map3;
        this.g = map4;
        this.h = tfgVar;
        this.j = r2;
    }

    private static final void d(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            new defpackage.rzu((defpackage.afer) it.next(), 12).run();
        }
    }

    public final long a() {
        return android.os.SystemClock.elapsedRealtime() - this.i;
    }

    public final synchronized java.lang.Enum b() {
        return this.j;
    }

    public final synchronized void c(java.lang.Enum r5) {
        defpackage.tfe tfeVar = this.c;
        if (tfeVar.d == 2 && defpackage.afga.f(this.j, r5)) {
            tfeVar.c.a(tfeVar.b).y("Ignoring self-transition in state %s.", this.j);
            return;
        }
        java.util.Collection collection = (java.util.Collection) this.d.get(this.j);
        if ((collection != null && collection.contains(r5)) || this.h.a(this.j, r5, tfeVar)) {
            java.lang.Enum r1 = this.j;
            tfeVar.c.a(tfeVar.b).M("Transition from %s to %s.", r1, r5);
            java.util.List list = (java.util.List) this.g.get(r1);
            if (list != null) {
                d(list);
            }
            this.j = r5;
            this.i = android.os.SystemClock.elapsedRealtime();
            java.util.List list2 = (java.util.List) this.f.get(new defpackage.afau(r1, r5));
            if (list2 != null) {
                d(list2);
            }
            java.util.List list3 = (java.util.List) this.e.get(r5);
            if (list3 != null) {
                d(list3);
            }
        }
    }
}
