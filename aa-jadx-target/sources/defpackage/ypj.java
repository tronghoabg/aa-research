package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ypj extends defpackage.ypx {
    public ypj(java.lang.Class cls) {
        super("tags", cls, false, true);
    }

    @Override // defpackage.ypx
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, defpackage.ypw ypwVar) {
        defpackage.ysy ysyVar = (defpackage.ysy) obj;
        if (ysyVar == null) {
            return;
        }
        ysu ysuVar = new ysu((defpackage.ysv) ysyVar.c.d);
        while (ysuVar.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ysuVar.next();
            if (((java.util.Set) entry.getValue()).isEmpty()) {
                ypwVar.a((java.lang.String) entry.getKey(), null);
            } else {
                java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ypwVar.a((java.lang.String) entry.getKey(), it.next());
                }
            }
        }
    }
}
