package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xyh extends defpackage.xyj {
    final /* synthetic */ defpackage.xyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyh(defpackage.xyj xyjVar, defpackage.xyj xyjVar2) {
        super(xyjVar2);
        this.a = xyjVar;
    }

    @Override // defpackage.xyj
    public final java.lang.String b(java.lang.Iterable iterable) {
        return d(iterable.iterator());
    }

    @Override // defpackage.xyj
    public final void c(java.lang.Appendable appendable, java.util.Iterator it) throws java.io.IOException {
        it.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            if (next2 != null) {
                defpackage.xyj xyjVar = this.a;
                appendable.append(xyjVar.c);
                appendable.append(xyjVar.a(next2));
            }
        }
    }
}
