package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ohn implements ohr {
    public final void a(ajnd ajndVar) {
        java.util.ArrayList<com.google.android.apps.auto.components.telecom.call.CarCall> arrayList;
        defpackage.yqm yqmVar = defpackage.ohs.a;
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ohj.a.f()).ai((char) 5913)).u("onUnbind, ending ongoing calls.");
        if (defpackage.acrf.m()) {
            defpackage.ogw ogwVar = ((defpackage.ohj) ajndVar.a).b;
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ogw.a.f()).ai((char) 5905)).u("getAllCalls");
            arrayList = new java.util.ArrayList(ogwVar.c.values());
        } else {
            defpackage.ogw ogwVar2 = ((defpackage.ohj) ajndVar.a).b;
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ogw.a.f()).ai((char) 5904)).u("clearCalls");
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = ogwVar2.c;
            arrayList = new java.util.ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
        }
        for (com.google.android.apps.auto.components.telecom.call.CarCall carCall : arrayList) {
            ((defpackage.ohj) ajndVar.a).a(new ohe(carCall, 3));
        }
    }
}
