package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ypi extends defpackage.ypx {
    public ypi(java.lang.Class cls) {
        super("group_by", cls, true, true);
    }

    @Override // defpackage.ypx
    public final void a(java.util.Iterator it, defpackage.ypw ypwVar) {
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!it.hasNext()) {
                ypwVar.a(this.a, next);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            java.lang.String str = this.a;
            sb.append(']');
            ypwVar.a(str, sb.toString());
        }
    }
}
