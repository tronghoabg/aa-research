package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yem extends defpackage.ybw {
    final /* synthetic */ defpackage.yep a;
    private final java.util.Iterator b;

    public yem(defpackage.yep yepVar) {
        this.a = yepVar;
        this.b = yepVar.countMap.entrySet().iterator();
    }

    @Override // defpackage.ybw
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        java.util.Map.Entry entry;
        int i;
        do {
            java.util.Iterator it = this.b;
            if (!it.hasNext()) {
                b();
                return null;
            }
            entry = (java.util.Map.Entry) it.next();
            i = ((java.util.concurrent.atomic.AtomicInteger) entry.getValue()).get();
        } while (i == 0);
        return new defpackage.yml(entry.getKey(), i);
    }
}
