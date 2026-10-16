package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yrh implements defpackage.yrd {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yrd
    public final /* synthetic */ void a(defpackage.ypx ypxVar, java.util.Iterator it, java.lang.Object obj) {
        if (!ypxVar.b) {
            throw new java.lang.IllegalStateException("non repeating key");
        }
        if (!ypxVar.c || defpackage.yrs.a() <= 20) {
            ypxVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(ypxVar.a, it.next());
            }
        }
    }
}
